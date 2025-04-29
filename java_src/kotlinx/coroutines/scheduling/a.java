package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.y;
import la.o0;
import s9.u;
/* loaded from: classes.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: j  reason: collision with root package name */
    public final int f12932j;

    /* renamed from: k  reason: collision with root package name */
    public final int f12933k;

    /* renamed from: l  reason: collision with root package name */
    public final long f12934l;

    /* renamed from: m  reason: collision with root package name */
    public final String f12935m;

    /* renamed from: n  reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f12936n;

    /* renamed from: o  reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f12937o;

    /* renamed from: p  reason: collision with root package name */
    public final y<c> f12938p;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: q  reason: collision with root package name */
    public static final C0189a f12927q = new C0189a(null);

    /* renamed from: u  reason: collision with root package name */
    public static final b0 f12931u = new b0("NOT_IN_STACK");

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f12928r = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: s  reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f12929s = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f12930t = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.scheduling.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0189a {
        private C0189a() {
        }

        public /* synthetic */ C0189a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12939a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f12939a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public final class c extends Thread {

        /* renamed from: q  reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f12940q = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public final n f12941j;

        /* renamed from: k  reason: collision with root package name */
        public d f12942k;

        /* renamed from: l  reason: collision with root package name */
        private long f12943l;

        /* renamed from: m  reason: collision with root package name */
        private long f12944m;

        /* renamed from: n  reason: collision with root package name */
        private int f12945n;
        private volatile Object nextParkedWorker;

        /* renamed from: o  reason: collision with root package name */
        public boolean f12946o;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f12941j = new n();
            this.f12942k = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f12931u;
            this.f12945n = fa.c.f8872j.c();
        }

        public c(a aVar, int i10) {
            this();
            o(i10);
        }

        private final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            a.f12929s.addAndGet(a.this, -2097152L);
            if (this.f12942k != d.TERMINATED) {
                this.f12942k = d.DORMANT;
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && s(d.BLOCKING)) {
                a.this.x();
            }
        }

        private final void d(h hVar) {
            int b10 = hVar.f12964k.b();
            i(b10);
            c(b10);
            a.this.t(hVar);
            b(b10);
        }

        private final h e(boolean z10) {
            h m10;
            h m11;
            if (z10) {
                boolean z11 = k(a.this.f12932j * 2) == 0;
                if (z11 && (m11 = m()) != null) {
                    return m11;
                }
                h h10 = this.f12941j.h();
                if (h10 != null) {
                    return h10;
                }
                if (!z11 && (m10 = m()) != null) {
                    return m10;
                }
            } else {
                h m12 = m();
                if (m12 != null) {
                    return m12;
                }
            }
            return t(false);
        }

        private final void i(int i10) {
            this.f12943l = 0L;
            if (this.f12942k == d.PARKING) {
                this.f12942k = d.BLOCKING;
            }
        }

        private final boolean j() {
            return this.nextParkedWorker != a.f12931u;
        }

        private final void l() {
            if (this.f12943l == 0) {
                this.f12943l = System.nanoTime() + a.this.f12934l;
            }
            LockSupport.parkNanos(a.this.f12934l);
            if (System.nanoTime() - this.f12943l >= 0) {
                this.f12943l = 0L;
                u();
            }
        }

        private final h m() {
            kotlinx.coroutines.scheduling.d dVar;
            if (k(2) == 0) {
                h d10 = a.this.f12936n.d();
                if (d10 != null) {
                    return d10;
                }
                dVar = a.this.f12937o;
            } else {
                h d11 = a.this.f12937o.d();
                if (d11 != null) {
                    return d11;
                }
                dVar = a.this.f12936n;
            }
            return dVar.d();
        }

        private final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f12942k != d.TERMINATED) {
                    h f10 = f(this.f12946o);
                    if (f10 != null) {
                        this.f12944m = 0L;
                        d(f10);
                    } else {
                        this.f12946o = false;
                        if (this.f12944m == 0) {
                            r();
                        } else if (z10) {
                            s(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f12944m);
                            this.f12944m = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            s(d.TERMINATED);
        }

        private final boolean q() {
            boolean z10;
            if (this.f12942k != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j10 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j10) >> 42)) != 0) {
                        if (a.f12929s.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f12942k = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void r() {
            if (!j()) {
                a.this.q(this);
                return;
            }
            this.workerCtl = -1;
            while (j() && this.workerCtl == -1 && !a.this.isTerminated() && this.f12942k != d.TERMINATED) {
                s(d.PARKING);
                Thread.interrupted();
                l();
            }
        }

        private final h t(boolean z10) {
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int k10 = k(i10);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                k10++;
                if (k10 > i10) {
                    k10 = 1;
                }
                c b10 = aVar.f12938p.b(k10);
                if (b10 != null && b10 != this) {
                    n nVar = this.f12941j;
                    n nVar2 = b10.f12941j;
                    long k11 = z10 ? nVar.k(nVar2) : nVar.l(nVar2);
                    if (k11 == -1) {
                        return this.f12941j.h();
                    }
                    if (k11 > 0) {
                        j10 = Math.min(j10, k11);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f12944m = j10;
            return null;
        }

        private final void u() {
            a aVar = a.this;
            synchronized (aVar.f12938p) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f12932j) {
                    return;
                }
                if (f12940q.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    o(0);
                    aVar.r(this, i10, 0);
                    int andDecrement = (int) (a.f12929s.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != i10) {
                        c b10 = aVar.f12938p.b(andDecrement);
                        kotlin.jvm.internal.l.b(b10);
                        c cVar = b10;
                        aVar.f12938p.c(i10, cVar);
                        cVar.o(i10);
                        aVar.r(cVar, andDecrement, i10);
                    }
                    aVar.f12938p.c(andDecrement, null);
                    u uVar = u.f17878a;
                    this.f12942k = d.TERMINATED;
                }
            }
        }

        public final h f(boolean z10) {
            h d10;
            if (q()) {
                return e(z10);
            }
            if (!z10 || (d10 = this.f12941j.h()) == null) {
                d10 = a.this.f12937o.d();
            }
            return d10 == null ? t(true) : d10;
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final int k(int i10) {
            int i11 = this.f12945n;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f12945n = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void o(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f12935m);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final boolean s(d dVar) {
            d dVar2 = this.f12942k;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.f12929s.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f12942k = dVar;
            }
            return z10;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f12932j = i10;
        this.f12933k = i11;
        this.f12934l = j10;
        this.f12935m = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f12936n = new kotlinx.coroutines.scheduling.d();
        this.f12937o = new kotlinx.coroutines.scheduling.d();
        this.parkedWorkersStack = 0L;
        this.f12938p = new y<>(i10 + 1);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    private final boolean C(long j10) {
        int a10;
        a10 = ha.i.a(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0);
        if (a10 < this.f12932j) {
            int b10 = b();
            if (b10 == 1 && this.f12932j > 1) {
                b();
            }
            if (b10 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean H(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.controlState;
        }
        return aVar.C(j10);
    }

    private final boolean L() {
        c m10;
        do {
            m10 = m();
            if (m10 == null) {
                return false;
            }
        } while (!c.f12940q.compareAndSet(m10, -1, 0));
        LockSupport.unpark(m10);
        return true;
    }

    private final boolean a(h hVar) {
        return (hVar.f12964k.b() == 1 ? this.f12937o : this.f12936n).a(hVar);
    }

    private final int b() {
        int a10;
        int i10;
        synchronized (this.f12938p) {
            if (isTerminated()) {
                i10 = -1;
            } else {
                long j10 = this.controlState;
                int i11 = (int) (j10 & 2097151);
                a10 = ha.i.a(i11 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (a10 >= this.f12932j) {
                    return 0;
                }
                if (i11 >= this.f12933k) {
                    return 0;
                }
                int i12 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i12 > 0 && this.f12938p.b(i12) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(this, i12);
                this.f12938p.c(i12, cVar);
                if (!(i12 == ((int) (2097151 & f12929s.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cVar.start();
                i10 = a10 + 1;
            }
            return i10;
        }
    }

    private final c h() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !kotlin.jvm.internal.l.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void k(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f12972f;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.i(runnable, iVar, z10);
    }

    private final int l(c cVar) {
        int g10;
        do {
            Object h10 = cVar.h();
            if (h10 == f12931u) {
                return -1;
            }
            if (h10 == null) {
                return 0;
            }
            cVar = (c) h10;
            g10 = cVar.g();
        } while (g10 == 0);
        return g10;
    }

    private final c m() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            c b10 = this.f12938p.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int l10 = l(b10);
            if (l10 >= 0 && f12928r.compareAndSet(this, j10, l10 | j11)) {
                b10.p(f12931u);
                return b10;
            }
        }
    }

    private final void w(boolean z10) {
        long addAndGet = f12929s.addAndGet(this, 2097152L);
        if (z10 || L() || C(addAndGet)) {
            return;
        }
        L();
    }

    private final h z(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.f12942k == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f12964k.b() == 0 && cVar.f12942k == d.BLOCKING) {
            return hVar;
        }
        cVar.f12946o = true;
        return cVar.f12941j.a(hVar, z10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        v(10000L);
    }

    public final h e(Runnable runnable, i iVar) {
        long a10 = l.f12971e.a();
        if (runnable instanceof h) {
            h hVar = (h) runnable;
            hVar.f12963j = a10;
            hVar.f12964k = iVar;
            return hVar;
        }
        return new k(runnable, a10, iVar);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        k(this, runnable, null, false, 6, null);
    }

    public final void i(Runnable runnable, i iVar, boolean z10) {
        la.c.a();
        h e10 = e(runnable, iVar);
        c h10 = h();
        h z11 = z(h10, e10, z10);
        if (z11 != null && !a(z11)) {
            throw new RejectedExecutionException(this.f12935m + " was terminated");
        }
        boolean z12 = z10 && h10 != null;
        if (e10.f12964k.b() != 0) {
            w(z12);
        } else if (z12) {
        } else {
            x();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final boolean q(c cVar) {
        long j10;
        int g10;
        if (cVar.h() != f12931u) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            g10 = cVar.g();
            cVar.p(this.f12938p.b((int) (2097151 & j10)));
        } while (!f12928r.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | g10));
        return true;
    }

    public final void r(c cVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? l(cVar) : i11;
            }
            if (i12 >= 0 && f12928r.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    public final void t(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        StringBuilder sb;
        char c10;
        ArrayList arrayList = new ArrayList();
        int a10 = this.f12938p.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.f12938p.b(i15);
            if (b10 != null) {
                int f10 = b10.f12941j.f();
                int i16 = b.f12939a[b10.f12942k.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb = new StringBuilder();
                        sb.append(f10);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb = new StringBuilder();
                        sb.append(f10);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (f10 > 0) {
                            sb = new StringBuilder();
                            sb.append(f10);
                            c10 = 'd';
                        }
                    } else if (i16 == 5) {
                        i14++;
                    }
                    sb.append(c10);
                    arrayList.add(sb.toString());
                } else {
                    i12++;
                }
            }
        }
        long j10 = this.controlState;
        return this.f12935m + '@' + o0.b(this) + "[Pool Size {core = " + this.f12932j + ", max = " + this.f12933k + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f12936n.c() + ", global blocking queue size = " + this.f12937o.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f12932j - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void v(long j10) {
        int i10;
        h d10;
        if (f12930t.compareAndSet(this, 0, 1)) {
            c h10 = h();
            synchronized (this.f12938p) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c b10 = this.f12938p.b(i11);
                    kotlin.jvm.internal.l.b(b10);
                    c cVar = b10;
                    if (cVar != h10) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f12941j.g(this.f12937o);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.f12937o.b();
            this.f12936n.b();
            while (true) {
                if (h10 != null) {
                    d10 = h10.f(true);
                    if (d10 != null) {
                        continue;
                        t(d10);
                    }
                }
                d10 = this.f12936n.d();
                if (d10 == null && (d10 = this.f12937o.d()) == null) {
                    break;
                }
                t(d10);
            }
            if (h10 != null) {
                h10.s(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void x() {
        if (L() || H(this, 0L, 1, null)) {
            return;
        }
        L();
    }
}
