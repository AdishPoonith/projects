package l7;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements Cloneable {

    /* renamed from: j  reason: collision with root package name */
    private final int f13428j;

    /* renamed from: k  reason: collision with root package name */
    private final int f13429k;

    /* renamed from: l  reason: collision with root package name */
    private final int f13430l;

    /* renamed from: m  reason: collision with root package name */
    private final int[] f13431m;

    public b(int i10) {
        this(i10, i10);
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f13428j = i10;
        this.f13429k = i11;
        int i12 = (i10 + 31) / 32;
        this.f13430l = i12;
        this.f13431m = new int[i12 * i11];
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f13428j = i10;
        this.f13429k = i11;
        this.f13430l = i12;
        this.f13431m = iArr;
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f13429k * (this.f13428j + 1));
        for (int i10 = 0; i10 < this.f13429k; i10++) {
            for (int i11 = 0; i11 < this.f13428j; i11++) {
                sb.append(f(i11, i10) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void c() {
        int length = this.f13431m.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f13431m[i10] = 0;
        }
    }

    /* renamed from: d */
    public b clone() {
        return new b(this.f13428j, this.f13429k, this.f13430l, (int[]) this.f13431m.clone());
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f13428j == bVar.f13428j && this.f13429k == bVar.f13429k && this.f13430l == bVar.f13430l && Arrays.equals(this.f13431m, bVar.f13431m);
        }
        return false;
    }

    public boolean f(int i10, int i11) {
        return ((this.f13431m[(i11 * this.f13430l) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int g() {
        return this.f13429k;
    }

    public int h() {
        return this.f13428j;
    }

    public int hashCode() {
        int i10 = this.f13428j;
        return (((((((i10 * 31) + i10) * 31) + this.f13429k) * 31) + this.f13430l) * 31) + Arrays.hashCode(this.f13431m);
    }

    public void i(int i10, int i11) {
        int i12 = (i11 * this.f13430l) + (i10 / 32);
        int[] iArr = this.f13431m;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void j(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f13429k || i14 > this.f13428j) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f13430l * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f13431m;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public String n(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return n("X ", "  ");
    }
}
