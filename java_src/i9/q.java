package i9;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final p f10019a;

    /* renamed from: b  reason: collision with root package name */
    private final j1 f10020b;

    private q(p pVar, j1 j1Var) {
        this.f10019a = (p) b5.n.o(pVar, "state is null");
        this.f10020b = (j1) b5.n.o(j1Var, "status is null");
    }

    public static q a(p pVar) {
        b5.n.e(pVar != p.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new q(pVar, j1.f9923f);
    }

    public static q b(j1 j1Var) {
        b5.n.e(!j1Var.o(), "The error status must not be OK");
        return new q(p.TRANSIENT_FAILURE, j1Var);
    }

    public p c() {
        return this.f10019a;
    }

    public j1 d() {
        return this.f10020b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f10019a.equals(qVar.f10019a) && this.f10020b.equals(qVar.f10020b);
        }
        return false;
    }

    public int hashCode() {
        return this.f10019a.hashCode() ^ this.f10020b.hashCode();
    }

    public String toString() {
        if (this.f10020b.o()) {
            return this.f10019a.toString();
        }
        return this.f10019a + "(" + this.f10020b + ")";
    }
}
