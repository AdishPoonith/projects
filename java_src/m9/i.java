package m9;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private int f13954a;

    /* renamed from: b  reason: collision with root package name */
    private int f13955b;

    /* renamed from: c  reason: collision with root package name */
    private int f13956c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f13957d = new int[10];

    public int a(int i10) {
        return this.f13957d[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        if ((this.f13954a & 2) != 0) {
            return this.f13957d[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i10) {
        return (this.f13954a & 32) != 0 ? this.f13957d[5] : i10;
    }

    public boolean d(int i10) {
        return ((1 << i10) & this.f13954a) != 0;
    }

    public i e(int i10, int i11, int i12) {
        int[] iArr = this.f13957d;
        if (i10 >= iArr.length) {
            return this;
        }
        int i13 = 1 << i10;
        this.f13954a |= i13;
        this.f13955b = (i11 & 1) != 0 ? this.f13955b | i13 : this.f13955b & (~i13);
        this.f13956c = (i11 & 2) != 0 ? this.f13956c | i13 : this.f13956c & (~i13);
        iArr[i10] = i12;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return Integer.bitCount(this.f13954a);
    }
}
