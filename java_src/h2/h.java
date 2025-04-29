package h2;

import android.net.Uri;
import h2.i0;
import java.io.EOFException;
import java.util.Map;
import s1.u2;
import x1.b0;
/* loaded from: classes.dex */
public final class h implements x1.l {

    /* renamed from: m  reason: collision with root package name */
    public static final x1.r f9170m = new x1.r() { // from class: h2.g
        @Override // x1.r
        public final x1.l[] a() {
            x1.l[] h10;
            h10 = h.h();
            return h10;
        }

        @Override // x1.r
        public /* synthetic */ x1.l[] b(Uri uri, Map map) {
            return x1.q.a(this, uri, map);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final int f9171a;

    /* renamed from: b  reason: collision with root package name */
    private final i f9172b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.a0 f9173c;

    /* renamed from: d  reason: collision with root package name */
    private final p3.a0 f9174d;

    /* renamed from: e  reason: collision with root package name */
    private final p3.z f9175e;

    /* renamed from: f  reason: collision with root package name */
    private x1.n f9176f;

    /* renamed from: g  reason: collision with root package name */
    private long f9177g;

    /* renamed from: h  reason: collision with root package name */
    private long f9178h;

    /* renamed from: i  reason: collision with root package name */
    private int f9179i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9180j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9181k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9182l;

    public h() {
        this(0);
    }

    public h(int i10) {
        this.f9171a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f9172b = new i(true);
        this.f9173c = new p3.a0(2048);
        this.f9179i = -1;
        this.f9178h = -1L;
        p3.a0 a0Var = new p3.a0(10);
        this.f9174d = a0Var;
        this.f9175e = new p3.z(a0Var.e());
    }

    private void e(x1.m mVar) {
        int h10;
        if (this.f9180j) {
            return;
        }
        this.f9179i = -1;
        mVar.f();
        long j10 = 0;
        if (mVar.p() == 0) {
            l(mVar);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!mVar.k(this.f9174d.e(), 0, 2, true)) {
                    break;
                }
                this.f9174d.T(0);
                if (!i.m(this.f9174d.M())) {
                    break;
                } else if (!mVar.k(this.f9174d.e(), 0, 4, true)) {
                    break;
                } else {
                    this.f9175e.p(14);
                    h10 = this.f9175e.h(13);
                    if (h10 <= 6) {
                        this.f9180j = true;
                        throw u2.a("Malformed ADTS stream", null);
                    }
                    j10 += h10;
                    i11++;
                    if (i11 == 1000) {
                        break;
                    }
                }
            } catch (EOFException unused) {
            }
        } while (mVar.i(h10 - 6, true));
        i10 = i11;
        mVar.f();
        if (i10 > 0) {
            this.f9179i = (int) (j10 / i10);
        } else {
            this.f9179i = -1;
        }
        this.f9180j = true;
    }

    private static int f(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private x1.b0 g(long j10, boolean z10) {
        return new x1.e(j10, this.f9178h, f(this.f9179i, this.f9172b.k()), this.f9179i, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] h() {
        return new x1.l[]{new h()};
    }

    private void k(long j10, boolean z10) {
        if (this.f9182l) {
            return;
        }
        boolean z11 = (this.f9171a & 1) != 0 && this.f9179i > 0;
        if (z11 && this.f9172b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f9172b.k() == -9223372036854775807L) {
            this.f9176f.t(new b0.b(-9223372036854775807L));
        } else {
            this.f9176f.t(g(j10, (this.f9171a & 2) != 0));
        }
        this.f9182l = true;
    }

    private int l(x1.m mVar) {
        int i10 = 0;
        while (true) {
            mVar.n(this.f9174d.e(), 0, 10);
            this.f9174d.T(0);
            if (this.f9174d.J() != 4801587) {
                break;
            }
            this.f9174d.U(3);
            int F = this.f9174d.F();
            i10 += F + 10;
            mVar.o(F);
        }
        mVar.f();
        mVar.o(i10);
        if (this.f9178h == -1) {
            this.f9178h = i10;
        }
        return i10;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f9181k = false;
        this.f9172b.b();
        this.f9177g = j11;
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f9176f = nVar;
        this.f9172b.c(nVar, new i0.d(0, 1));
        nVar.k();
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        p3.a.h(this.f9176f);
        long a10 = mVar.a();
        int i10 = this.f9171a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || a10 == -1)) ? false : true) {
            e(mVar);
        }
        int read = mVar.read(this.f9173c.e(), 0, 2048);
        boolean z10 = read == -1;
        k(a10, z10);
        if (z10) {
            return -1;
        }
        this.f9173c.T(0);
        this.f9173c.S(read);
        if (!this.f9181k) {
            this.f9172b.e(this.f9177g, 4);
            this.f9181k = true;
        }
        this.f9172b.a(this.f9173c);
        return 0;
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        int l10 = l(mVar);
        int i10 = l10;
        int i11 = 0;
        int i12 = 0;
        do {
            mVar.n(this.f9174d.e(), 0, 2);
            this.f9174d.T(0);
            if (i.m(this.f9174d.M())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                mVar.n(this.f9174d.e(), 0, 4);
                this.f9175e.p(14);
                int h10 = this.f9175e.h(13);
                if (h10 > 6) {
                    mVar.o(h10 - 6);
                    i12 += h10;
                }
            }
            i10++;
            mVar.f();
            mVar.o(i10);
            i11 = 0;
            i12 = 0;
        } while (i10 - l10 < 8192);
        return false;
    }
}
