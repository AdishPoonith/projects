package y1;

import android.net.Uri;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;
import p3.n0;
import s1.n1;
import s1.u2;
import x1.a0;
import x1.b0;
import x1.e;
import x1.e0;
import x1.l;
import x1.m;
import x1.n;
import x1.q;
import x1.r;
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f20353r;

    /* renamed from: u  reason: collision with root package name */
    private static final int f20356u;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f20357a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20358b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20359c;

    /* renamed from: d  reason: collision with root package name */
    private long f20360d;

    /* renamed from: e  reason: collision with root package name */
    private int f20361e;

    /* renamed from: f  reason: collision with root package name */
    private int f20362f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20363g;

    /* renamed from: h  reason: collision with root package name */
    private long f20364h;

    /* renamed from: i  reason: collision with root package name */
    private int f20365i;

    /* renamed from: j  reason: collision with root package name */
    private int f20366j;

    /* renamed from: k  reason: collision with root package name */
    private long f20367k;

    /* renamed from: l  reason: collision with root package name */
    private n f20368l;

    /* renamed from: m  reason: collision with root package name */
    private e0 f20369m;

    /* renamed from: n  reason: collision with root package name */
    private b0 f20370n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f20371o;

    /* renamed from: p  reason: collision with root package name */
    public static final r f20351p = new r() { // from class: y1.a
        @Override // x1.r
        public final l[] a() {
            l[] n10;
            n10 = b.n();
            return n10;
        }

        @Override // x1.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f20352q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f20354s = n0.l0("#!AMR\n");

    /* renamed from: t  reason: collision with root package name */
    private static final byte[] f20355t = n0.l0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f20353r = iArr;
        f20356u = iArr[8];
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        this.f20358b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f20357a = new byte[1];
        this.f20365i = -1;
    }

    private void e() {
        p3.a.h(this.f20369m);
        n0.j(this.f20368l);
    }

    private static int f(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private b0 g(long j10, boolean z10) {
        return new e(j10, this.f20364h, f(this.f20365i, 20000L), this.f20365i, z10);
    }

    private int h(int i10) {
        if (l(i10)) {
            return this.f20359c ? f20353r[i10] : f20352q[i10];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f20359c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i10);
        throw u2.a(sb.toString(), null);
    }

    private boolean k(int i10) {
        return !this.f20359c && (i10 < 12 || i10 > 14);
    }

    private boolean l(int i10) {
        return i10 >= 0 && i10 <= 15 && (m(i10) || k(i10));
    }

    private boolean m(int i10) {
        return this.f20359c && (i10 < 10 || i10 > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] n() {
        return new l[]{new b()};
    }

    private void o() {
        if (this.f20371o) {
            return;
        }
        this.f20371o = true;
        boolean z10 = this.f20359c;
        this.f20369m.e(new n1.b().g0(z10 ? "audio/amr-wb" : "audio/3gpp").Y(f20356u).J(1).h0(z10 ? 16000 : 8000).G());
    }

    private void p(long j10, int i10) {
        b0 bVar;
        int i11;
        if (this.f20363g) {
            return;
        }
        int i12 = this.f20358b;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f20365i) == -1 || i11 == this.f20361e)) {
            bVar = new b0.b(-9223372036854775807L);
        } else if (this.f20366j < 20 && i10 != -1) {
            return;
        } else {
            bVar = g(j10, (i12 & 2) != 0);
        }
        this.f20370n = bVar;
        this.f20368l.t(bVar);
        this.f20363g = true;
    }

    private static boolean q(m mVar, byte[] bArr) {
        mVar.f();
        byte[] bArr2 = new byte[bArr.length];
        mVar.n(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int r(m mVar) {
        mVar.f();
        mVar.n(this.f20357a, 0, 1);
        byte b10 = this.f20357a[0];
        if ((b10 & 131) <= 0) {
            return h((b10 >> 3) & 15);
        }
        throw u2.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean s(m mVar) {
        int length;
        byte[] bArr = f20354s;
        if (q(mVar, bArr)) {
            this.f20359c = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f20355t;
            if (!q(mVar, bArr2)) {
                return false;
            }
            this.f20359c = true;
            length = bArr2.length;
        }
        mVar.g(length);
        return true;
    }

    private int t(m mVar) {
        if (this.f20362f == 0) {
            try {
                int r10 = r(mVar);
                this.f20361e = r10;
                this.f20362f = r10;
                if (this.f20365i == -1) {
                    this.f20364h = mVar.p();
                    this.f20365i = this.f20361e;
                }
                if (this.f20365i == this.f20361e) {
                    this.f20366j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int f10 = this.f20369m.f(mVar, this.f20362f, true);
        if (f10 == -1) {
            return -1;
        }
        int i10 = this.f20362f - f10;
        this.f20362f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f20369m.c(this.f20367k + this.f20360d, 1, this.f20361e, 0, null);
        this.f20360d += 20000;
        return 0;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f20360d = 0L;
        this.f20361e = 0;
        this.f20362f = 0;
        if (j10 != 0) {
            b0 b0Var = this.f20370n;
            if (b0Var instanceof e) {
                this.f20367k = ((e) b0Var).b(j10);
                return;
            }
        }
        this.f20367k = 0L;
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f20368l = nVar;
        this.f20369m = nVar.d(0, 1);
        nVar.k();
    }

    @Override // x1.l
    public int i(m mVar, a0 a0Var) {
        e();
        if (mVar.p() != 0 || s(mVar)) {
            o();
            int t10 = t(mVar);
            p(mVar.a(), t10);
            return t10;
        }
        throw u2.a("Could not find AMR header.", null);
    }

    @Override // x1.l
    public boolean j(m mVar) {
        return s(mVar);
    }
}
