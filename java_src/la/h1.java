package la;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import la.t0;
/* loaded from: classes.dex */
public abstract class h1 extends i1 implements t0 {

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13627o = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_queue");

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13628p = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes.dex */
    private static final class a extends b {

        /* renamed from: l  reason: collision with root package name */
        private final Runnable f13629l;

        public a(long j10, Runnable runnable) {
            super(j10);
            this.f13629l = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13629l.run();
        }

        @Override // la.h1.b
        public String toString() {
            return super.toString() + this.f13629l;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b implements Runnable, Comparable<b>, c1, kotlinx.coroutines.internal.h0 {
        private volatile Object _heap;

        /* renamed from: j  reason: collision with root package name */
        public long f13630j;

        /* renamed from: k  reason: collision with root package name */
        private int f13631k = -1;

        public b(long j10) {
            this.f13630j = j10;
        }

        @Override // la.c1
        public final synchronized void b() {
            kotlinx.coroutines.internal.b0 b0Var;
            kotlinx.coroutines.internal.b0 b0Var2;
            Object obj = this._heap;
            b0Var = k1.f13635a;
            if (obj == b0Var) {
                return;
            }
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.g(this);
            }
            b0Var2 = k1.f13635a;
            this._heap = b0Var2;
        }

        @Override // kotlinx.coroutines.internal.h0
        public void g(int i10) {
            this.f13631k = i10;
        }

        @Override // kotlinx.coroutines.internal.h0
        public void h(kotlinx.coroutines.internal.g0<?> g0Var) {
            kotlinx.coroutines.internal.b0 b0Var;
            Object obj = this._heap;
            b0Var = k1.f13635a;
            if (!(obj != b0Var)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = g0Var;
        }

        @Override // kotlinx.coroutines.internal.h0
        public int i() {
            return this.f13631k;
        }

        @Override // kotlinx.coroutines.internal.h0
        public kotlinx.coroutines.internal.g0<?> l() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.g0) {
                return (kotlinx.coroutines.internal.g0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: n */
        public int compareTo(b bVar) {
            int i10 = ((this.f13630j - bVar.f13630j) > 0L ? 1 : ((this.f13630j - bVar.f13630j) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x001a, B:29:0x0045, B:9:0x000d, B:17:0x0021, B:25:0x0037, B:27:0x0040, B:28:0x0042, B:18:0x0024, B:22:0x002e), top: B:37:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized int o(long r8, la.h1.c r10, la.h1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4b
                kotlinx.coroutines.internal.b0 r1 = la.k1.b()     // Catch: java.lang.Throwable -> L4b
                if (r0 != r1) goto Lc
                r8 = 2
            La:
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
                kotlinx.coroutines.internal.h0 r0 = r10.b()     // Catch: java.lang.Throwable -> L48
                la.h1$b r0 = (la.h1.b) r0     // Catch: java.lang.Throwable -> L48
                boolean r11 = la.h1.w0(r11)     // Catch: java.lang.Throwable -> L48
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f13632b = r8     // Catch: java.lang.Throwable -> L48
                goto L37
            L24:
                long r3 = r0.f13630j     // Catch: java.lang.Throwable -> L48
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f13632b     // Catch: java.lang.Throwable -> L48
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f13630j     // Catch: java.lang.Throwable -> L48
                long r3 = r10.f13632b     // Catch: java.lang.Throwable -> L48
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L42
                r7.f13630j = r3     // Catch: java.lang.Throwable -> L48
            L42:
                r10.a(r7)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                r8 = 0
                goto La
            L48:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                throw r8     // Catch: java.lang.Throwable -> L4b
            L4b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: la.h1.b.o(long, la.h1$c, la.h1):int");
        }

        public final boolean p(long j10) {
            return j10 - this.f13630j >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f13630j + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlinx.coroutines.internal.g0<b> {

        /* renamed from: b  reason: collision with root package name */
        public long f13632b;

        public c(long j10) {
            this.f13632b = j10;
        }
    }

    private final boolean A0(Runnable runnable) {
        kotlinx.coroutines.internal.b0 b0Var;
        while (true) {
            Object obj = this._queue;
            if (B0()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f13627o, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.q) {
                kotlinx.coroutines.internal.q qVar = (kotlinx.coroutines.internal.q) obj;
                int a10 = qVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(f13627o, this, obj, qVar.i());
                } else if (a10 == 2) {
                    return false;
                }
            } else {
                b0Var = k1.f13636b;
                if (obj == b0Var) {
                    return false;
                }
                kotlinx.coroutines.internal.q qVar2 = new kotlinx.coroutines.internal.q(8, true);
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f13627o, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean B0() {
        return this._isCompleted;
    }

    private final void E0() {
        b i10;
        la.c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar == null || (i10 = cVar.i()) == null) {
                return;
            }
            u0(nanoTime, i10);
        }
    }

    private final int H0(long j10, b bVar) {
        if (B0()) {
            return 1;
        }
        c cVar = (c) this._delayed;
        if (cVar == null) {
            androidx.concurrent.futures.b.a(f13628p, this, null, new c(j10));
            Object obj = this._delayed;
            kotlin.jvm.internal.l.b(obj);
            cVar = (c) obj;
        }
        return bVar.o(j10, cVar, this);
    }

    private final void J0(boolean z10) {
        this._isCompleted = z10 ? 1 : 0;
    }

    private final boolean K0(b bVar) {
        c cVar = (c) this._delayed;
        return (cVar != null ? cVar.e() : null) == bVar;
    }

    private final void x0() {
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13627o;
                b0Var = k1.f13636b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, b0Var)) {
                    return;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.q) {
                ((kotlinx.coroutines.internal.q) obj).d();
                return;
            } else {
                b0Var2 = k1.f13636b;
                if (obj == b0Var2) {
                    return;
                }
                kotlinx.coroutines.internal.q qVar = new kotlinx.coroutines.internal.q(8, true);
                qVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f13627o, this, obj, qVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable y0() {
        kotlinx.coroutines.internal.b0 b0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.q) {
                kotlinx.coroutines.internal.q qVar = (kotlinx.coroutines.internal.q) obj;
                Object j10 = qVar.j();
                if (j10 != kotlinx.coroutines.internal.q.f12910h) {
                    return (Runnable) j10;
                }
                androidx.concurrent.futures.b.a(f13627o, this, obj, qVar.i());
            } else {
                b0Var = k1.f13636b;
                if (obj == b0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f13627o, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean C0() {
        kotlinx.coroutines.internal.b0 b0Var;
        if (r0()) {
            c cVar = (c) this._delayed;
            if (cVar == null || cVar.d()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof kotlinx.coroutines.internal.q) {
                        return ((kotlinx.coroutines.internal.q) obj).g();
                    }
                    b0Var = k1.f13636b;
                    if (obj != b0Var) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long D0() {
        /*
            r9 = this;
            boolean r0 = r9.s0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            la.h1$c r0 = (la.h1.c) r0
            if (r0 == 0) goto L45
            boolean r3 = r0.d()
            if (r3 != 0) goto L45
            la.c.a()
            long r3 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.h0 r5 = r0.b()     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r5 != 0) goto L26
        L24:
            monitor-exit(r0)
            goto L3d
        L26:
            la.h1$b r5 = (la.h1.b) r5     // Catch: java.lang.Throwable -> L42
            boolean r7 = r5.p(r3)     // Catch: java.lang.Throwable -> L42
            r8 = 0
            if (r7 == 0) goto L34
            boolean r5 = r9.A0(r5)     // Catch: java.lang.Throwable -> L42
            goto L35
        L34:
            r5 = 0
        L35:
            if (r5 == 0) goto L24
            kotlinx.coroutines.internal.h0 r5 = r0.h(r8)     // Catch: java.lang.Throwable -> L42
            r6 = r5
            goto L24
        L3d:
            la.h1$b r6 = (la.h1.b) r6
            if (r6 != 0) goto L1c
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L45:
            java.lang.Runnable r0 = r9.y0()
            if (r0 == 0) goto L4f
            r0.run()
            return r1
        L4f:
            long r0 = r9.n0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: la.h1.D0():long");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void G0(long j10, b bVar) {
        int H0 = H0(j10, bVar);
        if (H0 == 0) {
            if (K0(bVar)) {
                v0();
            }
        } else if (H0 == 1) {
            u0(j10, bVar);
        } else if (H0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c1 I0(long j10, Runnable runnable) {
        long c10 = k1.c(j10);
        if (c10 < 4611686018427387903L) {
            la.c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c10 + nanoTime, runnable);
            G0(nanoTime, aVar);
            return aVar;
        }
        return i2.f13634j;
    }

    @Override // la.t0
    public c1 c0(long j10, Runnable runnable, v9.g gVar) {
        return t0.a.a(this, j10, runnable, gVar);
    }

    @Override // la.g0
    public final void h0(v9.g gVar, Runnable runnable) {
        z0(runnable);
    }

    @Override // la.g1
    protected long n0() {
        b e10;
        long b10;
        kotlinx.coroutines.internal.b0 b0Var;
        if (super.n0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.q)) {
                b0Var = k1.f13636b;
                return obj == b0Var ? Long.MAX_VALUE : 0L;
            } else if (!((kotlinx.coroutines.internal.q) obj).g()) {
                return 0L;
            }
        }
        c cVar = (c) this._delayed;
        if (cVar == null || (e10 = cVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = e10.f13630j;
        la.c.a();
        b10 = ha.i.b(j10 - System.nanoTime(), 0L);
        return b10;
    }

    @Override // la.g1
    public void shutdown() {
        s2.f13665a.b();
        J0(true);
        x0();
        do {
        } while (D0() <= 0);
        E0();
    }

    public void z0(Runnable runnable) {
        if (A0(runnable)) {
            v0();
        } else {
            p0.f13656q.z0(runnable);
        }
    }
}
