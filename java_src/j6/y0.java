package j6;

import j6.q;
/* loaded from: classes.dex */
public class y0 extends q {
    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(m6.r rVar, d7.b0 b0Var) {
        super(rVar, q.b.NOT_IN, b0Var);
        q6.b.d(m6.y.t(b0Var), "NotInFilter expects an ArrayValue", new Object[0]);
    }

    @Override // j6.q, j6.r
    public boolean e(m6.i iVar) {
        d7.b0 b10;
        return (m6.y.p(i().q0(), m6.y.f13849b) || (b10 = iVar.b(g())) == null || m6.y.p(i().q0(), b10)) ? false : true;
    }
}
