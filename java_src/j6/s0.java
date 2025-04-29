package j6;

import j6.q;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class s0 extends q {

    /* renamed from: d  reason: collision with root package name */
    private final List<m6.l> f12323d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s0(m6.r r2, d7.b0 r3) {
        /*
            r1 = this;
            j6.q$b r0 = j6.q.b.IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f12323d = r2
            java.util.List r3 = l(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.s0.<init>(m6.r, d7.b0):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<m6.l> l(q.b bVar, d7.b0 b0Var) {
        q6.b.d(bVar == q.b.IN || bVar == q.b.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        q6.b.d(m6.y.t(b0Var), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (d7.b0 b0Var2 : b0Var.q0().o()) {
            boolean B = m6.y.B(b0Var2);
            q6.b.d(B, "Comparing on key with " + bVar.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(m6.l.k(b0Var2.y0()));
        }
        return arrayList;
    }

    @Override // j6.q, j6.r
    public boolean e(m6.i iVar) {
        return this.f12323d.contains(iVar.getKey());
    }
}
