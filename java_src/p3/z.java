package p3;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f15486a;

    /* renamed from: b  reason: collision with root package name */
    private int f15487b;

    /* renamed from: c  reason: collision with root package name */
    private int f15488c;

    /* renamed from: d  reason: collision with root package name */
    private int f15489d;

    public z() {
        this.f15486a = n0.f15402f;
    }

    public z(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public z(byte[] bArr, int i10) {
        this.f15486a = bArr;
        this.f15489d = i10;
    }

    private void a() {
        int i10;
        int i11 = this.f15487b;
        a.f(i11 >= 0 && (i11 < (i10 = this.f15489d) || (i11 == i10 && this.f15488c == 0)));
    }

    public int b() {
        return ((this.f15489d - this.f15487b) * 8) - this.f15488c;
    }

    public void c() {
        if (this.f15488c == 0) {
            return;
        }
        this.f15488c = 0;
        this.f15487b++;
        a();
    }

    public int d() {
        a.f(this.f15488c == 0);
        return this.f15487b;
    }

    public int e() {
        return (this.f15487b * 8) + this.f15488c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f15488c, i11);
        int i12 = this.f15488c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f15486a;
        int i14 = this.f15487b;
        bArr[i14] = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        int i15 = i11 - min;
        bArr[i14] = (byte) (((i10 >>> i15) << i13) | bArr[i14]);
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f15486a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f15486a;
        bArr2[i16] = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | bArr2[i16]);
        r(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f15486a[this.f15487b] & (128 >> this.f15488c)) != 0;
        q();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f15488c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f15488c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f15488c = i13;
            byte[] bArr = this.f15486a;
            int i14 = this.f15487b;
            this.f15487b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f15486a;
        int i15 = this.f15487b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f15488c = 0;
            this.f15487b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f15486a;
            int i13 = this.f15487b;
            int i14 = i13 + 1;
            this.f15487b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f15488c;
            bArr[i10] = (byte) (b10 << i15);
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | bArr[i10]);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        bArr[i12] = (byte) (bArr[i12] & (255 >> i16));
        int i17 = this.f15488c;
        if (i17 + i16 > 8) {
            int i18 = bArr[i12];
            byte[] bArr3 = this.f15486a;
            int i19 = this.f15487b;
            this.f15487b = i19 + 1;
            bArr[i12] = (byte) (i18 | ((bArr3[i19] & 255) << i17));
            this.f15488c = i17 - 8;
        }
        int i20 = this.f15488c + i16;
        this.f15488c = i20;
        byte[] bArr4 = this.f15486a;
        int i21 = this.f15487b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i16))) | bArr[i12]);
        if (i20 == 8) {
            this.f15488c = 0;
            this.f15487b = i21 + 1;
        }
        a();
    }

    public long j(int i10) {
        return i10 <= 32 ? n0.W0(h(i10)) : n0.V0(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        a.f(this.f15488c == 0);
        System.arraycopy(this.f15486a, this.f15487b, bArr, i10, i11);
        this.f15487b += i11;
        a();
    }

    public String l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void m(a0 a0Var) {
        o(a0Var.e(), a0Var.g());
        p(a0Var.f() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i10) {
        this.f15486a = bArr;
        this.f15487b = 0;
        this.f15488c = 0;
        this.f15489d = i10;
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f15487b = i11;
        this.f15488c = i10 - (i11 * 8);
        a();
    }

    public void q() {
        int i10 = this.f15488c + 1;
        this.f15488c = i10;
        if (i10 == 8) {
            this.f15488c = 0;
            this.f15487b++;
        }
        a();
    }

    public void r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f15487b + i11;
        this.f15487b = i12;
        int i13 = this.f15488c + (i10 - (i11 * 8));
        this.f15488c = i13;
        if (i13 > 7) {
            this.f15487b = i12 + 1;
            this.f15488c = i13 - 8;
        }
        a();
    }

    public void s(int i10) {
        a.f(this.f15488c == 0);
        this.f15487b += i10;
        a();
    }
}
