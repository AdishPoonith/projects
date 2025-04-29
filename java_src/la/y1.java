package la;
/* loaded from: classes.dex */
public class y1 extends c2 implements x {

    /* renamed from: k  reason: collision with root package name */
    private final boolean f13686k;

    public y1(v1 v1Var) {
        super(true);
        l0(v1Var);
        this.f13686k = P0();
    }

    private final boolean P0() {
        c2 B;
        r h02 = h0();
        s sVar = h02 instanceof s ? (s) h02 : null;
        if (sVar != null && (B = sVar.B()) != null) {
            while (!B.a0()) {
                r h03 = B.h0();
                s sVar2 = h03 instanceof s ? (s) h03 : null;
                if (sVar2 != null) {
                    B = sVar2.B();
                    if (B == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // la.c2
    public boolean a0() {
        return this.f13686k;
    }

    @Override // la.c2
    public boolean c0() {
        return true;
    }
}
