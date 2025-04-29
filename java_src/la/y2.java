package la;
/* loaded from: classes.dex */
public final class y2 extends g0 {

    /* renamed from: l  reason: collision with root package name */
    public static final y2 f13687l = new y2();

    private y2() {
    }

    @Override // la.g0
    public void h0(v9.g gVar, Runnable runnable) {
        b3 b3Var = (b3) gVar.b(b3.f13583l);
        if (b3Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        b3Var.f13584k = true;
    }

    @Override // la.g0
    public boolean i0(v9.g gVar) {
        return false;
    }

    @Override // la.g0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
