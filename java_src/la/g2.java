package la;
/* loaded from: classes.dex */
public abstract class g2 extends g0 {
    public abstract g2 k0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String l0() {
        g2 g2Var;
        g2 c10 = a1.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            g2Var = c10.k0();
        } catch (UnsupportedOperationException unused) {
            g2Var = null;
        }
        if (this == g2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // la.g0
    public String toString() {
        String l02 = l0();
        if (l02 == null) {
            return o0.a(this) + '@' + o0.b(this);
        }
        return l02;
    }
}
