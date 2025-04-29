package kotlinx.coroutines.internal;

import la.c1;
import la.q0;
import la.t0;
/* loaded from: classes.dex */
public final class k extends la.g0 implements Runnable, t0 {

    /* renamed from: l  reason: collision with root package name */
    private final la.g0 f12894l;

    /* renamed from: m  reason: collision with root package name */
    private final int f12895m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ t0 f12896n;

    /* renamed from: o  reason: collision with root package name */
    private final p<Runnable> f12897o;

    /* renamed from: p  reason: collision with root package name */
    private final Object f12898p;
    private volatile int runningWorkers;

    public k(la.g0 g0Var, int i10) {
        this.f12894l = g0Var;
        this.f12895m = i10;
        t0 t0Var = g0Var instanceof t0 ? (t0) g0Var : null;
        this.f12896n = t0Var == null ? q0.a() : t0Var;
        this.f12897o = new p<>(false);
        this.f12898p = new Object();
    }

    private final boolean k0(Runnable runnable) {
        this.f12897o.a(runnable);
        return this.runningWorkers >= this.f12895m;
    }

    private final boolean l0() {
        synchronized (this.f12898p) {
            if (this.runningWorkers >= this.f12895m) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // la.t0
    public c1 c0(long j10, Runnable runnable, v9.g gVar) {
        return this.f12896n.c0(j10, runnable, gVar);
    }

    @Override // la.g0
    public void h0(v9.g gVar, Runnable runnable) {
        if (k0(runnable) || !l0()) {
            return;
        }
        this.f12894l.h0(this, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.f12898p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.f12897o.c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = s9.u.f17878a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            kotlinx.coroutines.internal.p<java.lang.Runnable> r2 = r4.f12897o
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            v9.h r3 = v9.h.f19537j
            la.j0.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            la.g0 r2 = r4.f12894l
            boolean r2 = r2.i0(r4)
            if (r2 == 0) goto L2
            la.g0 r0 = r4.f12894l
            r0.h0(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f12898p
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.p<java.lang.Runnable> r2 = r4.f12897o     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            s9.u r2 = s9.u.f17878a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.k.run():void");
    }
}
