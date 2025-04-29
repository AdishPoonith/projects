package j6;

import j6.q;
/* loaded from: classes.dex */
public class e extends q {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(m6.r rVar, d7.b0 b0Var) {
        super(rVar, q.b.ARRAY_CONTAINS_ANY, b0Var);
        q6.b.d(m6.y.t(b0Var), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    @Override // j6.q, j6.r
    public boolean e(m6.i iVar) {
        d7.b0 b10 = iVar.b(g());
        if (m6.y.t(b10)) {
            for (d7.b0 b0Var : b10.q0().o()) {
                if (m6.y.p(i().q0(), b0Var)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
