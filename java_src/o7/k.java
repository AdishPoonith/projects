package o7;
/* loaded from: classes.dex */
public class k {

    /* renamed from: i  reason: collision with root package name */
    static final k[] f14711i;

    /* renamed from: j  reason: collision with root package name */
    private static k[] f14712j;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14713a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14714b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14715c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14716d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14717e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14718f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14719g;

    /* renamed from: h  reason: collision with root package name */
    private final int f14720h;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, f.j.D0, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, f.j.D0, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f14711i = kVarArr;
        f14712j = kVarArr;
    }

    public k(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f14713a = z10;
        this.f14714b = i10;
        this.f14715c = i11;
        this.f14716d = i12;
        this.f14717e = i13;
        this.f14718f = i14;
        this.f14719g = i15;
        this.f14720h = i16;
    }

    private int e() {
        int i10 = this.f14718f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 != 16) {
                    if (i10 == 36) {
                        return 6;
                    }
                    throw new IllegalStateException("Cannot handle this number of data regions");
                }
                return 4;
            }
        }
        return i11;
    }

    private int k() {
        int i10 = this.f14718f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 != 4) {
            if (i10 != 16) {
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
            return 4;
        }
        return 2;
    }

    public static k l(int i10, l lVar, i7.b bVar, i7.b bVar2, boolean z10) {
        k[] kVarArr;
        for (k kVar : f14712j) {
            if (!(lVar == l.FORCE_SQUARE && kVar.f14713a) && ((lVar != l.FORCE_RECTANGLE || kVar.f14713a) && ((bVar == null || (kVar.j() >= bVar.b() && kVar.i() >= bVar.a())) && ((bVar2 == null || (kVar.j() <= bVar2.b() && kVar.i() <= bVar2.a())) && i10 <= kVar.f14714b)))) {
                return kVar;
            }
        }
        if (z10) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
        }
        return null;
    }

    public final int a() {
        return this.f14714b;
    }

    public int b(int i10) {
        return this.f14719g;
    }

    public final int c() {
        return this.f14715c;
    }

    public final int d(int i10) {
        return this.f14720h;
    }

    public int f() {
        return this.f14714b / this.f14719g;
    }

    public final int g() {
        return k() * this.f14717e;
    }

    public final int h() {
        return e() * this.f14716d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14713a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f14716d);
        sb.append('x');
        sb.append(this.f14717e);
        sb.append(", symbol size ");
        sb.append(j());
        sb.append('x');
        sb.append(i());
        sb.append(", symbol data size ");
        sb.append(h());
        sb.append('x');
        sb.append(g());
        sb.append(", codewords ");
        sb.append(this.f14714b);
        sb.append('+');
        sb.append(this.f14715c);
        return sb.toString();
    }
}
