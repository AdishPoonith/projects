package androidx.concurrent.futures;

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
/* loaded from: classes.dex */
public abstract class a<V> implements com.google.common.util.concurrent.d<V> {

    /* renamed from: m  reason: collision with root package name */
    static final boolean f1475m = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: n  reason: collision with root package name */
    private static final Logger f1476n = Logger.getLogger(a.class.getName());

    /* renamed from: o  reason: collision with root package name */
    static final b f1477o;

    /* renamed from: p  reason: collision with root package name */
    private static final Object f1478p;

    /* renamed from: j  reason: collision with root package name */
    volatile Object f1479j;

    /* renamed from: k  reason: collision with root package name */
    volatile e f1480k;

    /* renamed from: l  reason: collision with root package name */
    volatile i f1481l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f1482c;

        /* renamed from: d  reason: collision with root package name */
        static final c f1483d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f1484a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f1485b;

        static {
            if (a.f1475m) {
                f1483d = null;
                f1482c = null;
                return;
            }
            f1483d = new c(false, null);
            f1482c = new c(true, null);
        }

        c(boolean z10, Throwable th) {
            this.f1484a = z10;
            this.f1485b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f1486b = new d(new C0018a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f1487a;

        /* renamed from: androidx.concurrent.futures.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0018a extends Throwable {
            C0018a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1487a = (Throwable) a.k(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f1488d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f1489a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f1490b;

        /* renamed from: c  reason: collision with root package name */
        e f1491c;

        e(Runnable runnable, Executor executor) {
            this.f1489a = runnable;
            this.f1490b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f1492a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f1493b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f1494c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f1495d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f1496e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1492a = atomicReferenceFieldUpdater;
            this.f1493b = atomicReferenceFieldUpdater2;
            this.f1494c = atomicReferenceFieldUpdater3;
            this.f1495d = atomicReferenceFieldUpdater4;
            this.f1496e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f1495d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f1496e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f1494c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f1493b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f1492a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final a<V> f1497j;

        /* renamed from: k  reason: collision with root package name */
        final com.google.common.util.concurrent.d<? extends V> f1498k;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1497j.f1479j != this) {
                return;
            }
            if (a.f1477o.b(this.f1497j, this, a.q(this.f1498k))) {
                a.n(this.f1497j);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1480k == eVar) {
                    aVar.f1480k = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1479j == obj) {
                    aVar.f1479j = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1481l == iVar) {
                    aVar.f1481l = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f1501b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f1500a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f1499c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f1500a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f1501b;

        i() {
            a.f1477o.e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f1477o.d(this, iVar);
        }

        void b() {
            Thread thread = this.f1500a;
            if (thread != null) {
                this.f1500a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "l"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "k"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "j"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f1477o = hVar;
        if (th != null) {
            f1476n.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1478p = new Object();
    }

    private void g(StringBuilder sb) {
        String str = "]";
        try {
            Object r10 = r(this);
            sb.append("SUCCESS, result=[");
            sb.append(y(r10));
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

    private static CancellationException i(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T k(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private e l(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1480k;
        } while (!f1477o.a(this, eVar2, e.f1488d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1491c;
            eVar4.f1491c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.concurrent.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.concurrent.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.concurrent.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.concurrent.futures.a<V>, androidx.concurrent.futures.a] */
    static void n(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.u();
            aVar.h();
            e l10 = aVar.l(eVar);
            while (l10 != null) {
                eVar = l10.f1491c;
                Runnable runnable = l10.f1489a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f1497j;
                    if (aVar.f1479j == gVar) {
                        if (f1477o.b(aVar, gVar, q(gVar.f1498k))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    o(runnable, l10.f1490b);
                }
                l10 = eVar;
            }
            return;
        }
    }

    private static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f1476n;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V p(Object obj) {
        if (obj instanceof c) {
            throw i("Task was cancelled.", ((c) obj).f1485b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1487a);
        }
        if (obj == f1478p) {
            return null;
        }
        return obj;
    }

    static Object q(com.google.common.util.concurrent.d<?> dVar) {
        if (dVar instanceof a) {
            Object obj = ((a) dVar).f1479j;
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f1484a ? cVar.f1485b != null ? new c(false, cVar.f1485b) : c.f1483d : obj;
            }
            return obj;
        }
        boolean isCancelled = dVar.isCancelled();
        if ((!f1475m) && isCancelled) {
            return c.f1483d;
        }
        try {
            Object r10 = r(dVar);
            return r10 == null ? f1478p : r10;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    static <V> V r(Future<V> future) {
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

    private void u() {
        i iVar;
        do {
            iVar = this.f1481l;
        } while (!f1477o.c(this, iVar, i.f1499c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f1501b;
        }
    }

    private void v(i iVar) {
        iVar.f1500a = null;
        while (true) {
            i iVar2 = this.f1481l;
            if (iVar2 == i.f1499c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1501b;
                if (iVar2.f1500a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1501b = iVar4;
                    if (iVar3.f1500a == null) {
                        break;
                    }
                } else if (!f1477o.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String y(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.d
    public final void b(Runnable runnable, Executor executor) {
        k(runnable);
        k(executor);
        e eVar = this.f1480k;
        if (eVar == e.f1488d) {
            o(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f1491c = eVar;
            if (f1477o.a(this, eVar, eVar2)) {
                return;
            }
            eVar = this.f1480k;
        } while (eVar != e.f1488d);
        o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f1479j;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f1475m ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f1482c : c.f1483d;
        boolean z11 = false;
        a<V> aVar = this;
        while (true) {
            if (f1477o.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.s();
                }
                n(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                com.google.common.util.concurrent.d<? extends V> dVar = ((g) obj).f1498k;
                if (!(dVar instanceof a)) {
                    dVar.cancel(z10);
                    return true;
                }
                aVar = (a) dVar;
                obj = aVar.f1479j;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f1479j;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f1479j;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return p(obj2);
        }
        i iVar = this.f1481l;
        if (iVar != i.f1499c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f1477o.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            v(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f1479j;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return p(obj);
                }
                iVar = this.f1481l;
            } while (iVar != i.f1499c);
            return p(this.f1479j);
        }
        return p(this.f1479j);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1479j;
        if ((obj != null) && (!(obj instanceof g))) {
            return p(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f1481l;
            if (iVar != i.f1499c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1477o.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                v(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1479j;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return p(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        v(iVar2);
                    } else {
                        iVar = this.f1481l;
                    }
                } while (iVar != i.f1499c);
                return p(this.f1479j);
            }
            return p(this.f1479j);
        }
        while (nanos > 0) {
            Object obj3 = this.f1479j;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return p(obj3);
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

    protected void h() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1479j instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f1479j;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void s() {
    }

    protected String t() {
        Object obj = this.f1479j;
        if (obj instanceof g) {
            return "setFuture=[" + y(((g) obj).f1498k) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = t();
                } catch (RuntimeException e10) {
                    str = "Exception thrown from implementation: " + e10.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "PENDING" : "PENDING";
            }
            g(sb);
            sb.append("]");
            return sb.toString();
        }
        str2 = "CANCELLED";
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w(V v10) {
        if (v10 == null) {
            v10 = (V) f1478p;
        }
        if (f1477o.b(this, null, v10)) {
            n(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x(Throwable th) {
        if (f1477o.b(this, null, new d((Throwable) k(th)))) {
            n(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean z() {
        Object obj = this.f1479j;
        return (obj instanceof c) && ((c) obj).f1484a;
    }
}
