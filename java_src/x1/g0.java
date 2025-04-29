package x1;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f20142a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20143b;

    /* renamed from: c  reason: collision with root package name */
    private int f20144c;

    /* renamed from: d  reason: collision with root package name */
    private int f20145d;

    public g0(byte[] bArr) {
        this.f20142a = bArr;
        this.f20143b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f20144c;
        p3.a.f(i11 >= 0 && (i11 < (i10 = this.f20143b) || (i11 == i10 && this.f20145d == 0)));
    }

    public int b() {
        return (this.f20144c * 8) + this.f20145d;
    }

    public boolean c() {
        boolean z10 = (((this.f20142a[this.f20144c] & 255) >> this.f20145d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f20144c;
        int min = Math.min(i10, 8 - this.f20145d);
        int i12 = i11 + 1;
        int i13 = ((this.f20142a[i11] & 255) >> this.f20145d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f20142a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f20144c + i11;
        this.f20144c = i12;
        int i13 = this.f20145d + (i10 - (i11 * 8));
        this.f20145d = i13;
        if (i13 > 7) {
            this.f20144c = i12 + 1;
            this.f20145d = i13 - 8;
        }
        a();
    }
}
