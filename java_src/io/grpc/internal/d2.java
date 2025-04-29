package io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class d2 implements Executor, Runnable {

    /* renamed from: m  reason: collision with root package name */
    private static final Logger f11137m = Logger.getLogger(d2.class.getName());

    /* renamed from: n  reason: collision with root package name */
    private static final b f11138n = c();

    /* renamed from: j  reason: collision with root package name */
    private Executor f11139j;

    /* renamed from: k  reason: collision with root package name */
    private final Queue<Runnable> f11140k = new ConcurrentLinkedQueue();

    /* renamed from: l  reason: collision with root package name */
    private volatile int f11141l = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        public abstract boolean a(d2 d2Var, int i10, int i11);

        public abstract void b(d2 d2Var, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<d2> f11142a;

        private c(AtomicIntegerFieldUpdater<d2> atomicIntegerFieldUpdater) {
            super();
            this.f11142a = atomicIntegerFieldUpdater;
        }

        @Override // io.grpc.internal.d2.b
        public boolean a(d2 d2Var, int i10, int i11) {
            return this.f11142a.compareAndSet(d2Var, i10, i11);
        }

        @Override // io.grpc.internal.d2.b
        public void b(d2 d2Var, int i10) {
            this.f11142a.set(d2Var, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends b {
        private d() {
            super();
        }

        @Override // io.grpc.internal.d2.b
        public boolean a(d2 d2Var, int i10, int i11) {
            synchronized (d2Var) {
                if (d2Var.f11141l == i10) {
                    d2Var.f11141l = i11;
                    return true;
                }
                return false;
            }
        }

        @Override // io.grpc.internal.d2.b
        public void b(d2 d2Var, int i10) {
            synchronized (d2Var) {
                d2Var.f11141l = i10;
            }
        }
    }

    public d2(Executor executor) {
        b5.n.o(executor, "'executor' must not be null.");
        this.f11139j = executor;
    }

    private static b c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(d2.class, "l"));
        } catch (Throwable th) {
            f11137m.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new d();
        }
    }

    private void d(Runnable runnable) {
        if (f11138n.a(this, 0, -1)) {
            try {
                this.f11139j.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f11140k.remove(runnable);
                }
                f11138n.b(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f11140k.add((Runnable) b5.n.o(runnable, "'r' must not be null."));
        d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable poll;
        try {
            Executor executor = this.f11139j;
            while (executor == this.f11139j && (poll = this.f11140k.poll()) != null) {
                try {
                    poll.run();
                } catch (RuntimeException e10) {
                    Logger logger = f11137m;
                    Level level = Level.SEVERE;
                    logger.log(level, "Exception while executing runnable " + poll, (Throwable) e10);
                }
            }
            f11138n.b(this, 0);
            if (this.f11140k.isEmpty()) {
                return;
            }
            d(null);
        } catch (Throwable th) {
            f11138n.b(this, 0);
            throw th;
        }
    }
}
