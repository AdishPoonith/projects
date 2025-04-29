package w2;

import p3.r;
import u2.m0;
import w2.g;
import x1.e0;
/* loaded from: classes.dex */
public final class c implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f19771a;

    /* renamed from: b  reason: collision with root package name */
    private final m0[] f19772b;

    public c(int[] iArr, m0[] m0VarArr) {
        this.f19771a = iArr;
        this.f19772b = m0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f19772b.length];
        int i10 = 0;
        while (true) {
            m0[] m0VarArr = this.f19772b;
            if (i10 >= m0VarArr.length) {
                return iArr;
            }
            iArr[i10] = m0VarArr[i10].G();
            i10++;
        }
    }

    public void b(long j10) {
        for (m0 m0Var : this.f19772b) {
            m0Var.a0(j10);
        }
    }

    @Override // w2.g.b
    public e0 d(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f19771a;
            if (i12 >= iArr.length) {
                r.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new x1.k();
            } else if (i11 == iArr[i12]) {
                return this.f19772b[i12];
            } else {
                i12++;
            }
        }
    }
}
