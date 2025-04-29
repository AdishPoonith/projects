package l7;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: j  reason: collision with root package name */
    private int[] f13426j;

    /* renamed from: k  reason: collision with root package name */
    private int f13427k;

    public a() {
        this.f13427k = 0;
        this.f13426j = new int[1];
    }

    a(int[] iArr, int i10) {
        this.f13426j = iArr;
        this.f13427k = i10;
    }

    private void g(int i10) {
        if (i10 > (this.f13426j.length << 5)) {
            int[] n10 = n(i10);
            int[] iArr = this.f13426j;
            System.arraycopy(iArr, 0, n10, 0, iArr.length);
            this.f13426j = n10;
        }
    }

    private static int[] n(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a(boolean z10) {
        g(this.f13427k + 1);
        if (z10) {
            int[] iArr = this.f13426j;
            int i10 = this.f13427k;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f13427k++;
    }

    public void c(a aVar) {
        int i10 = aVar.f13427k;
        g(this.f13427k + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.h(i11));
        }
    }

    public void d(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        g(this.f13427k + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f13427k == aVar.f13427k && Arrays.equals(this.f13426j, aVar.f13426j);
        }
        return false;
    }

    /* renamed from: f */
    public a clone() {
        return new a((int[]) this.f13426j.clone(), this.f13427k);
    }

    public boolean h(int i10) {
        return ((1 << (i10 & 31)) & this.f13426j[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f13427k * 31) + Arrays.hashCode(this.f13426j);
    }

    public int i() {
        return this.f13427k;
    }

    public int j() {
        return (this.f13427k + 7) / 8;
    }

    public void o(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (h(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void p(a aVar) {
        if (this.f13427k != aVar.f13427k) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f13426j;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ aVar.f13426j[i10];
            i10++;
        }
    }

    public String toString() {
        int i10 = this.f13427k;
        StringBuilder sb = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f13427k; i11++) {
            if ((i11 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(h(i11) ? 'X' : '.');
        }
        return sb.toString();
    }
}
