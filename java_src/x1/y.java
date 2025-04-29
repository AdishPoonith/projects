package x1;

import java.io.EOFException;
import p2.h;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final p3.a0 f20214a = new p3.a0(10);

    public k2.a a(m mVar, h.a aVar) {
        k2.a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                mVar.n(this.f20214a.e(), 0, 10);
                this.f20214a.T(0);
                if (this.f20214a.J() != 4801587) {
                    break;
                }
                this.f20214a.U(3);
                int F = this.f20214a.F();
                int i11 = F + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f20214a.e(), 0, bArr, 0, 10);
                    mVar.n(bArr, 10, F);
                    aVar2 = new p2.h(aVar).e(bArr, i11);
                } else {
                    mVar.o(F);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        mVar.f();
        mVar.o(i10);
        return aVar2;
    }
}
