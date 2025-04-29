package m7;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f13854h = new a(4201, 4096, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f13855i = new a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f13856j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f13857k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f13858l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f13859m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f13860n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f13861o;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f13862a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f13863b;

    /* renamed from: c  reason: collision with root package name */
    private final b f13864c;

    /* renamed from: d  reason: collision with root package name */
    private final b f13865d;

    /* renamed from: e  reason: collision with root package name */
    private final int f13866e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13867f;

    /* renamed from: g  reason: collision with root package name */
    private final int f13868g;

    static {
        a aVar = new a(67, 64, 1);
        f13856j = aVar;
        f13857k = new a(19, 16, 1);
        f13858l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f13859m = aVar2;
        f13860n = aVar2;
        f13861o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f13867f = i10;
        this.f13866e = i11;
        this.f13868g = i12;
        this.f13862a = new int[i11];
        this.f13863b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f13862a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f13863b[this.f13862a[i15]] = i15;
        }
        this.f13864c = new b(this, new int[]{0});
        this.f13865d = new b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b b(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.f13864c;
            }
            int[] iArr = new int[i10 + 1];
            iArr[0] = i11;
            return new b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f13862a[i10];
    }

    public int d() {
        return this.f13868g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b e() {
        return this.f13864c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f(int i10) {
        if (i10 != 0) {
            return this.f13862a[(this.f13866e - this.f13863b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(int i10) {
        if (i10 != 0) {
            return this.f13863b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f13862a;
        int[] iArr2 = this.f13863b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f13866e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f13867f) + ',' + this.f13866e + ')';
    }
}
