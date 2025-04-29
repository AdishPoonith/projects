package g2;

import p3.a0;
import s1.u2;
import x1.m;
import x1.o;
/* loaded from: classes.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f8914a;

    /* renamed from: b  reason: collision with root package name */
    public int f8915b;

    /* renamed from: c  reason: collision with root package name */
    public long f8916c;

    /* renamed from: d  reason: collision with root package name */
    public long f8917d;

    /* renamed from: e  reason: collision with root package name */
    public long f8918e;

    /* renamed from: f  reason: collision with root package name */
    public long f8919f;

    /* renamed from: g  reason: collision with root package name */
    public int f8920g;

    /* renamed from: h  reason: collision with root package name */
    public int f8921h;

    /* renamed from: i  reason: collision with root package name */
    public int f8922i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f8923j = new int[255];

    /* renamed from: k  reason: collision with root package name */
    private final a0 f8924k = new a0(255);

    public boolean a(m mVar, boolean z10) {
        b();
        this.f8924k.P(27);
        if (o.b(mVar, this.f8924k.e(), 0, 27, z10) && this.f8924k.I() == 1332176723) {
            int G = this.f8924k.G();
            this.f8914a = G;
            if (G != 0) {
                if (z10) {
                    return false;
                }
                throw u2.d("unsupported bit stream revision");
            }
            this.f8915b = this.f8924k.G();
            this.f8916c = this.f8924k.u();
            this.f8917d = this.f8924k.w();
            this.f8918e = this.f8924k.w();
            this.f8919f = this.f8924k.w();
            int G2 = this.f8924k.G();
            this.f8920g = G2;
            this.f8921h = G2 + 27;
            this.f8924k.P(G2);
            if (o.b(mVar, this.f8924k.e(), 0, this.f8920g, z10)) {
                for (int i10 = 0; i10 < this.f8920g; i10++) {
                    this.f8923j[i10] = this.f8924k.G();
                    this.f8922i += this.f8923j[i10];
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void b() {
        this.f8914a = 0;
        this.f8915b = 0;
        this.f8916c = 0L;
        this.f8917d = 0L;
        this.f8918e = 0L;
        this.f8919f = 0L;
        this.f8920g = 0;
        this.f8921h = 0;
        this.f8922i = 0;
    }

    public boolean c(m mVar) {
        return d(mVar, -1L);
    }

    public boolean d(m mVar, long j10) {
        int i10;
        p3.a.a(mVar.p() == mVar.l());
        this.f8924k.P(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if ((i10 == 0 || mVar.p() + 4 < j10) && o.b(mVar, this.f8924k.e(), 0, 4, true)) {
                this.f8924k.T(0);
                if (this.f8924k.I() == 1332176723) {
                    mVar.f();
                    return true;
                }
                mVar.g(1);
            }
        }
        do {
            if (i10 != 0 && mVar.p() >= j10) {
                break;
            }
        } while (mVar.b(1) != -1);
        return false;
    }
}
