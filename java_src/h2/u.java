package h2;

import java.util.Arrays;
/* loaded from: classes.dex */
final class u {

    /* renamed from: a  reason: collision with root package name */
    private final int f9428a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9429b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9430c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f9431d;

    /* renamed from: e  reason: collision with root package name */
    public int f9432e;

    public u(int i10, int i11) {
        this.f9428a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f9431d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f9429b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f9431d;
            int length = bArr2.length;
            int i13 = this.f9432e;
            if (length < i13 + i12) {
                this.f9431d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f9431d, this.f9432e, i12);
            this.f9432e += i12;
        }
    }

    public boolean b(int i10) {
        if (this.f9429b) {
            this.f9432e -= i10;
            this.f9429b = false;
            this.f9430c = true;
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.f9430c;
    }

    public void d() {
        this.f9429b = false;
        this.f9430c = false;
    }

    public void e(int i10) {
        p3.a.f(!this.f9429b);
        boolean z10 = i10 == this.f9428a;
        this.f9429b = z10;
        if (z10) {
            this.f9432e = 3;
            this.f9430c = false;
        }
    }
}
