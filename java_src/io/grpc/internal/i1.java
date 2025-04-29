package io.grpc.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i1 extends m0 {

    /* renamed from: c  reason: collision with root package name */
    private static final ReferenceQueue<i1> f11365c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<a, a> f11366d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f11367e = Logger.getLogger(i1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final a f11368b;

    /* loaded from: classes.dex */
    static final class a extends WeakReference<i1> {

        /* renamed from: f  reason: collision with root package name */
        private static final boolean f11369f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g  reason: collision with root package name */
        private static final RuntimeException f11370g = e();

        /* renamed from: a  reason: collision with root package name */
        private final ReferenceQueue<i1> f11371a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap<a, a> f11372b;

        /* renamed from: c  reason: collision with root package name */
        private final String f11373c;

        /* renamed from: d  reason: collision with root package name */
        private final Reference<RuntimeException> f11374d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicBoolean f11375e;

        a(i1 i1Var, i9.u0 u0Var, ReferenceQueue<i1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
            super(i1Var, referenceQueue);
            this.f11375e = new AtomicBoolean();
            this.f11374d = new SoftReference(f11369f ? new RuntimeException("ManagedChannel allocation site") : f11370g);
            this.f11373c = u0Var.toString();
            this.f11371a = referenceQueue;
            this.f11372b = concurrentMap;
            concurrentMap.put(this, this);
            b(referenceQueue);
        }

        static int b(ReferenceQueue<i1> referenceQueue) {
            int i10 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i10;
                }
                RuntimeException runtimeException = aVar.f11374d.get();
                aVar.c();
                if (!aVar.f11375e.get()) {
                    i10++;
                    Level level = Level.SEVERE;
                    if (i1.f11367e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(i1.f11367e.getName());
                        logRecord.setParameters(new Object[]{aVar.f11373c});
                        logRecord.setThrown(runtimeException);
                        i1.f11367e.log(logRecord);
                    }
                }
            }
        }

        private void c() {
            super.clear();
            this.f11372b.remove(this);
            this.f11374d.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (this.f11375e.getAndSet(true)) {
                return;
            }
            clear();
        }

        private static RuntimeException e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            c();
            b(this.f11371a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(i9.u0 u0Var) {
        this(u0Var, f11365c, f11366d);
    }

    i1(i9.u0 u0Var, ReferenceQueue<i1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
        super(u0Var);
        this.f11368b = new a(this, u0Var, referenceQueue, concurrentMap);
    }

    @Override // io.grpc.internal.m0, i9.u0
    public i9.u0 m() {
        this.f11368b.d();
        return super.m();
    }

    @Override // io.grpc.internal.m0, i9.u0
    public i9.u0 n() {
        this.f11368b.d();
        return super.n();
    }
}
