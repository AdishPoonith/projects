package j6;

import java.util.List;
/* loaded from: classes.dex */
public class t0 extends q {

    /* renamed from: d  reason: collision with root package name */
    private final List<m6.l> f12329d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0(m6.r r2, d7.b0 r3) {
        /*
            r1 = this;
            j6.q$b r0 = j6.q.b.NOT_IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f12329d = r2
            java.util.List r3 = j6.s0.l(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.t0.<init>(m6.r, d7.b0):void");
    }

    @Override // j6.q, j6.r
    public boolean e(m6.i iVar) {
        return !this.f12329d.contains(iVar.getKey());
    }
}
