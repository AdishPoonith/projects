package w2;

import java.util.Arrays;
import p3.n0;
import s1.n1;
/* loaded from: classes.dex */
public abstract class l extends f {

    /* renamed from: j  reason: collision with root package name */
    private byte[] f19831j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f19832k;

    public l(o3.l lVar, o3.p pVar, int i10, n1 n1Var, int i11, Object obj, byte[] bArr) {
        super(lVar, pVar, i10, n1Var, i11, obj, -9223372036854775807L, -9223372036854775807L);
        l lVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = n0.f15402f;
            lVar2 = this;
        } else {
            lVar2 = this;
            bArr2 = bArr;
        }
        lVar2.f19831j = bArr2;
    }

    private void i(int i10) {
        byte[] bArr = this.f19831j;
        if (bArr.length < i10 + 16384) {
            this.f19831j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // o3.h0.e
    public final void b() {
        try {
            this.f19800i.m(this.f19793b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f19832k) {
                i(i11);
                i10 = this.f19800i.read(this.f19831j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f19832k) {
                g(this.f19831j, i11);
            }
        } finally {
            o3.o.a(this.f19800i);
        }
    }

    @Override // o3.h0.e
    public final void c() {
        this.f19832k = true;
    }

    protected abstract void g(byte[] bArr, int i10);

    public byte[] h() {
        return this.f19831j;
    }
}
