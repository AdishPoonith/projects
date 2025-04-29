package com.google.common.util.concurrent;

import b5.n;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class a<V> extends f5.a implements com.google.common.util.concurrent.d<V> {

    /* renamed from: m  reason: collision with root package name */
    static final boolean f6075m;

    /* renamed from: n  reason: collision with root package name */
    private static final Logger f6076n;

    /* renamed from: o  reason: collision with root package name */
    private static final b f6077o;

    /* renamed from: p  reason: collision with root package name */
    private static final Object f6078p;

    /* renamed from: j  reason: collision with root package name */
    private volatile Object f6079j;

    /* renamed from: k  reason: collision with root package name */
    private volatile e f6080k;

    /* renamed from: l  reason: collision with root package name */
    private volatile l f6081l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, l lVar, l lVar2);

        abstract e d(a<?> aVar, e eVar);

        abstract l e(a<?> aVar, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f6082c;

        /* renamed from: d  reason: collision with root package name */
        static final c f6083d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f6084a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f6085b;

        static {
            if (a.f6075m) {
                f6083d = null;
                f6082c = null;
                return;
            }
            f6083d = new c(false, null);
            f6082c = new c(true, null);
        }

        c(boolean z10, Throwable th) {
            this.f6084a = z10;
            this.f6085b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f6086b = new d(new C0097a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f6087a;

        /* renamed from: com.google.common.util.concurrent.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0097a extends Throwable {
            C0097a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f6087a = (Throwable) n.n(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f6088d = new e();

        /* renamed from: a  reason: collision with root package name */
        final Runnable f6089a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f6090b;

        /* renamed from: c  reason: collision with root package name */
        e f6091c;

        e() {
            this.f6089a = null;
            this.f6090b = null;
        }

        e(Runnable runnable, Executor executor) {
            this.f6089a = runnable;
            this.f6090b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f6092a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f6093b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, l> f6094c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f6095d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f6096e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f6092a = atomicReferenceFieldUpdater;
            this.f6093b = atomicReferenceFieldUpdater2;
            this.f6094c = atomicReferenceFieldUpdater3;
            this.f6095d = atomicReferenceFieldUpdater4;
            this.f6096e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f6095d, aVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f6096e, aVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f6094c, aVar, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a<?> aVar, e eVar) {
            return this.f6095d.getAndSet(aVar, eVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a<?> aVar, l lVar) {
            return this.f6094c.getAndSet(aVar, lVar);
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            this.f6093b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            this.f6092a.lazySet(lVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final a<V> f6097j;

        /* renamed from: k  reason: collision with root package name */
        final com.google.common.util.concurrent.d<? extends V> f6098k;

        @Override // java.lang.Runnable
        public void run() {
            if (((a) this.f6097j).f6079j != this) {
                return;
            }
            if (a.f6077o.b(this.f6097j, this, a.v(this.f6098k))) {
                a.s(this.f6097j, false);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (((a) aVar).f6080k == eVar) {
                    ((a) aVar).f6080k = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (((a) aVar).f6079j == obj) {
                    ((a) aVar).f6079j = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                if (((a) aVar).f6081l == lVar) {
                    ((a) aVar).f6081l = lVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a<?> aVar, e eVar) {
            e eVar2;
            synchronized (aVar) {
                eVar2 = ((a) aVar).f6080k;
                if (eVar2 != eVar) {
                    ((a) aVar).f6080k = eVar;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a<?> aVar, l lVar) {
            l lVar2;
            synchronized (aVar) {
                lVar2 = ((a) aVar).f6081l;
                if (lVar2 != lVar) {
                    ((a) aVar).f6081l = lVar;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            lVar.f6107b = lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            lVar.f6106a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface i<V> extends com.google.common.util.concurrent.d<V> {
    }

    /* loaded from: classes.dex */
    static abstract class j<V> extends a<V> implements i<V> {
        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.d
        public final void b(Runnable runnable, Executor executor) {
            super.b(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    /* loaded from: classes.dex */
    private static final class k extends b {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f6099a;

        /* renamed from: b  reason: collision with root package name */
        static final long f6100b;

        /* renamed from: c  reason: collision with root package name */
        static final long f6101c;

        /* renamed from: d  reason: collision with root package name */
        static final long f6102d;

        /* renamed from: e  reason: collision with root package name */
        static final long f6103e;

        /* renamed from: f  reason: collision with root package name */
        static final long f6104f;

        /* renamed from: com.google.common.util.concurrent.a$k$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0098a implements PrivilegedExceptionAction<Unsafe> {
            C0098a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a */
            public Unsafe run() {
                Field[] declaredFields;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0098a());
            }
            try {
                f6101c = unsafe.objectFieldOffset(a.class.getDeclaredField("l"));
                f6100b = unsafe.objectFieldOffset(a.class.getDeclaredField("k"));
                f6102d = unsafe.objectFieldOffset(a.class.getDeclaredField("j"));
                f6103e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f6104f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f6099a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            } catch (RuntimeException e12) {
                throw e12;
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return com.google.common.util.concurrent.b.a(f6099a, aVar, f6100b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return com.google.common.util.concurrent.b.a(f6099a, aVar, f6102d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return com.google.common.util.concurrent.b.a(f6099a, aVar, f6101c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        e d(a<?> aVar, e eVar) {
            e eVar2;
            do {
                eVar2 = ((a) aVar).f6080k;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(aVar, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        l e(a<?> aVar, l lVar) {
            l lVar2;
            do {
                lVar2 = ((a) aVar).f6081l;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!c(aVar, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void f(l lVar, l lVar2) {
            f6099a.putObject(lVar, f6104f, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void g(l lVar, Thread thread) {
            f6099a.putObject(lVar, f6103e, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class l {

        /* renamed from: c  reason: collision with root package name */
        static final l f6105c = new l(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f6106a;

        /* renamed from: b  reason: collision with root package name */
        volatile l f6107b;

        l() {
            a.f6077o.g(this, Thread.currentThread());
        }

        l(boolean z10) {
        }

        void a(l lVar) {
            a.f6077o.f(this, lVar);
        }

        void b() {
            Thread thread = this.f6106a;
            if (thread != null) {
                this.f6106a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        boolean z10;
        b hVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f6075m = z10;
        f6076n = Logger.getLogger(a.class.getName());
        Throwable th = null;
        try {
            hVar = new k();
            e = null;
        } catch (Error | RuntimeException e10) {
            e = e10;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, "l"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "k"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "j"));
            } catch (Error | RuntimeException e11) {
                hVar = new h();
                th = e11;
            }
        }
        f6077o = hVar;
        if (th != null) {
            Logger logger = f6076n;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", e);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        f6078p = new Object();
    }

    protected a() {
    }

    private void A(l lVar) {
        lVar.f6106a = null;
        while (true) {
            l lVar2 = this.f6081l;
            if (lVar2 == l.f6105c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f6107b;
                if (lVar2.f6106a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f6107b = lVar4;
                    if (lVar3.f6106a == null) {
                        break;
                    }
                } else if (!f6077o.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    private void l(StringBuilder sb) {
        String str = "]";
        try {
            Object w10 = w(this);
            sb.append("SUCCESS, result=[");
            o(sb, w10);
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.f6079j
            boolean r2 = r1 instanceof com.google.common.util.concurrent.a.g
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            com.google.common.util.concurrent.a$g r1 = (com.google.common.util.concurrent.a.g) r1
            com.google.common.util.concurrent.d<? extends V> r1 = r1.f6098k
            r5.p(r6, r1)
        L1d:
            r6.append(r3)
            goto L4d
        L21:
            java.lang.String r1 = r5.y()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = b5.s.a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L42
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Exception thrown from implementation: "
            r2.append(r4)
            java.lang.Class r1 = r1.getClass()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L42:
            if (r1 == 0) goto L4d
            java.lang.String r2 = ", info=["
            r6.append(r2)
            r6.append(r1)
            goto L1d
        L4d:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L5d
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.l(r6)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.m(java.lang.StringBuilder):void");
    }

    private void o(StringBuilder sb, Object obj) {
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else if (obj == this) {
            hexString = "this future";
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }

    private void p(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e10) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e10.getClass());
        }
    }

    private static CancellationException q(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e r(e eVar) {
        e eVar2 = eVar;
        e d10 = f6077o.d(this, e.f6088d);
        while (d10 != null) {
            e eVar3 = d10.f6091c;
            d10.f6091c = eVar2;
            eVar2 = d10;
            d10 = eVar3;
        }
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.util.concurrent.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.common.util.concurrent.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.util.concurrent.a] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.common.util.concurrent.a, com.google.common.util.concurrent.a<V>] */
    public static void s(a<?> aVar, boolean z10) {
        e eVar = null;
        while (true) {
            aVar.z();
            if (z10) {
                aVar.x();
                z10 = false;
            }
            aVar.n();
            e r10 = aVar.r(eVar);
            while (r10 != null) {
                eVar = r10.f6091c;
                Runnable runnable = r10.f6089a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    aVar = gVar.f6097j;
                    if (((a) aVar).f6079j == gVar) {
                        if (f6077o.b(aVar, gVar, v(gVar.f6098k))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = r10.f6090b;
                    Objects.requireNonNull(executor);
                    t(runnable2, executor);
                }
                r10 = eVar;
            }
            return;
        }
    }

    private static void t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f6076n;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V u(Object obj) {
        if (obj instanceof c) {
            throw q("Task was cancelled.", ((c) obj).f6085b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f6087a);
        }
        return obj == f6078p ? (V) com.google.common.util.concurrent.f.a() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object v(com.google.common.util.concurrent.d<?> dVar) {
        Throwable a10;
        if (dVar instanceof i) {
            Object obj = ((a) dVar).f6079j;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f6084a) {
                    obj = cVar.f6085b != null ? new c(false, cVar.f6085b) : c.f6083d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if (!(dVar instanceof f5.a) || (a10 = f5.b.a((f5.a) dVar)) == null) {
            boolean isCancelled = dVar.isCancelled();
            if ((!f6075m) && isCancelled) {
                c cVar2 = c.f6083d;
                Objects.requireNonNull(cVar2);
                return cVar2;
            }
            try {
                Object w10 = w(dVar);
                if (!isCancelled) {
                    return w10 == null ? f6078p : w10;
                }
                return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + dVar));
            } catch (Error e10) {
                e = e10;
                return new d(e);
            } catch (CancellationException e11) {
                if (isCancelled) {
                    return new c(false, e11);
                }
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e11));
            } catch (RuntimeException e12) {
                e = e12;
                return new d(e);
            } catch (ExecutionException e13) {
                if (isCancelled) {
                    return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + dVar, e13));
                }
                return new d(e13.getCause());
            }
        } else {
            return new d(a10);
        }
    }

    private static <V> V w(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void z() {
        for (l e10 = f6077o.e(this, l.f6105c); e10 != null; e10 = e10.f6107b) {
            e10.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean B(V v10) {
        if (v10 == null) {
            v10 = (V) f6078p;
        }
        if (f6077o.b(this, null, v10)) {
            s(this, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean C(Throwable th) {
        if (f6077o.b(this, null, new d((Throwable) n.n(th)))) {
            s(this, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f5.a
    public final Throwable a() {
        if (this instanceof i) {
            Object obj = this.f6079j;
            if (obj instanceof d) {
                return ((d) obj).f6087a;
            }
            return null;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.d
    public void b(Runnable runnable, Executor executor) {
        e eVar;
        n.o(runnable, "Runnable was null.");
        n.o(executor, "Executor was null.");
        if (isDone() || (eVar = this.f6080k) == e.f6088d) {
            t(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f6091c = eVar;
            if (f6077o.a(this, eVar, eVar2)) {
                return;
            }
            eVar = this.f6080k;
        } while (eVar != e.f6088d);
        t(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f6079j;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f6075m) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f6082c : c.f6083d;
            Objects.requireNonNull(cVar);
        }
        boolean z11 = false;
        a<V> aVar = this;
        while (true) {
            if (f6077o.b(aVar, obj, cVar)) {
                s(aVar, z10);
                if (!(obj instanceof g)) {
                    return true;
                }
                com.google.common.util.concurrent.d<? extends V> dVar = ((g) obj).f6098k;
                if (!(dVar instanceof i)) {
                    dVar.cancel(z10);
                    return true;
                }
                aVar = (a) dVar;
                obj = aVar.f6079j;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f6079j;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f6079j;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return u(obj2);
        }
        l lVar = this.f6081l;
        if (lVar == l.f6105c) {
            Object obj3 = this.f6079j;
            Objects.requireNonNull(obj3);
            return u(obj3);
        }
        l lVar2 = new l();
        do {
            lVar2.a(lVar);
            if (f6077o.c(this, lVar, lVar2)) {
                do {
                    LockSupport.park(this);
                    if (Thread.interrupted()) {
                        A(lVar2);
                        throw new InterruptedException();
                    }
                    obj = this.f6079j;
                } while (!((obj != null) & (!(obj instanceof g))));
                return u(obj);
            }
            lVar = this.f6081l;
        } while (lVar != l.f6105c);
        Object obj32 = this.f6079j;
        Objects.requireNonNull(obj32);
        return u(obj32);
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6079j;
        if ((obj != null) && (!(obj instanceof g))) {
            return u(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f6081l;
            if (lVar == l.f6105c) {
                Object obj2 = this.f6079j;
                Objects.requireNonNull(obj2);
                return u(obj2);
            }
            l lVar2 = new l();
            do {
                lVar2.a(lVar);
                if (f6077o.c(this, lVar, lVar2)) {
                    do {
                        com.google.common.util.concurrent.g.a(this, nanos);
                        if (Thread.interrupted()) {
                            A(lVar2);
                            throw new InterruptedException();
                        }
                        Object obj3 = this.f6079j;
                        if ((obj3 != null) && (!(obj3 instanceof g))) {
                            return u(obj3);
                        }
                        nanos = nanoTime - System.nanoTime();
                    } while (nanos >= 1000);
                    A(lVar2);
                } else {
                    lVar = this.f6081l;
                }
            } while (lVar != l.f6105c);
            Object obj22 = this.f6079j;
            Objects.requireNonNull(obj22);
            return u(obj22);
        }
        while (nanos > 0) {
            Object obj4 = this.f6079j;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return u(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
            boolean z10 = i10 == 0 || nanos2 > 1000;
            if (i10 > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f6079j instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f6079j;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void n() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            l(sb);
        } else {
            m(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected void x() {
    }

    protected String y() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }
}
