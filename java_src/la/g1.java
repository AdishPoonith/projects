package la;
/* loaded from: classes.dex */
public abstract class g1 extends g0 {

    /* renamed from: l  reason: collision with root package name */
    private long f13622l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13623m;

    /* renamed from: n  reason: collision with root package name */
    private kotlinx.coroutines.internal.a<x0<?>> f13624n;

    private final long l0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void p0(g1 g1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g1Var.o0(z10);
    }

    public final void k0(boolean z10) {
        long l02 = this.f13622l - l0(z10);
        this.f13622l = l02;
        if (l02 <= 0 && this.f13623m) {
            shutdown();
        }
    }

    public final void m0(x0<?> x0Var) {
        kotlinx.coroutines.internal.a<x0<?>> aVar = this.f13624n;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f13624n = aVar;
        }
        aVar.a(x0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long n0() {
        kotlinx.coroutines.internal.a<x0<?>> aVar = this.f13624n;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0L;
    }

    public final void o0(boolean z10) {
        this.f13622l += l0(z10);
        if (z10) {
            return;
        }
        this.f13623m = true;
    }

    public final boolean q0() {
        return this.f13622l >= l0(true);
    }

    public final boolean r0() {
        kotlinx.coroutines.internal.a<x0<?>> aVar = this.f13624n;
        if (aVar != null) {
            return aVar.c();
        }
        return true;
    }

    public final boolean s0() {
        x0<?> d10;
        kotlinx.coroutines.internal.a<x0<?>> aVar = this.f13624n;
        if (aVar == null || (d10 = aVar.d()) == null) {
            return false;
        }
        d10.run();
        return true;
    }

    public void shutdown() {
    }
}
