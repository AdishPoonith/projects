package j6;

import j6.q;
/* loaded from: classes.dex */
public class r0 extends q {

    /* renamed from: d  reason: collision with root package name */
    private final m6.l f12318d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(m6.r rVar, q.b bVar, d7.b0 b0Var) {
        super(rVar, bVar, b0Var);
        q6.b.d(m6.y.B(b0Var), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.f12318d = m6.l.k(i().y0());
    }

    @Override // j6.q, j6.r
    public boolean e(m6.i iVar) {
        return k(iVar.getKey().compareTo(this.f12318d));
    }
}
