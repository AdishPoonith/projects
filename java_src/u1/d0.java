package u1;

import java.math.RoundingMode;
import u1.c0;
/* loaded from: classes.dex */
public class d0 implements c0.e {

    /* renamed from: b  reason: collision with root package name */
    protected final int f18553b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f18554c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f18555d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f18556e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f18557f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18558g;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f18559a = 250000;

        /* renamed from: b  reason: collision with root package name */
        private int f18560b = 750000;

        /* renamed from: c  reason: collision with root package name */
        private int f18561c = 4;

        /* renamed from: d  reason: collision with root package name */
        private int f18562d = 250000;

        /* renamed from: e  reason: collision with root package name */
        private int f18563e = 50000000;

        /* renamed from: f  reason: collision with root package name */
        private int f18564f = 2;

        public d0 g() {
            return new d0(this);
        }
    }

    protected d0(a aVar) {
        this.f18553b = aVar.f18559a;
        this.f18554c = aVar.f18560b;
        this.f18555d = aVar.f18561c;
        this.f18556e = aVar.f18562d;
        this.f18557f = aVar.f18563e;
        this.f18558g = aVar.f18564f;
    }

    protected static int b(int i10, int i11, int i12) {
        return e5.e.d(((i10 * i11) * i12) / 1000000);
    }

    protected static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    @Override // u1.c0.e
    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (c(i10, i11, i12, i13, i14, i15) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return f(i11, i15);
                }
                throw new IllegalArgumentException();
            }
            return e(i11);
        }
        return g(i10, i14, i13);
    }

    protected int e(int i10) {
        return e5.e.d((this.f18557f * d(i10)) / 1000000);
    }

    protected int f(int i10, int i11) {
        int i12 = this.f18556e;
        if (i10 == 5) {
            i12 *= this.f18558g;
        }
        return e5.e.d((i12 * (i11 != -1 ? d5.b.a(i11, 8, RoundingMode.CEILING) : d(i10))) / 1000000);
    }

    protected int g(int i10, int i11, int i12) {
        return p3.n0.q(i10 * this.f18555d, b(this.f18553b, i11, i12), b(this.f18554c, i11, i12));
    }
}
