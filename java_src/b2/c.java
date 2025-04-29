package b2;

import android.net.Uri;
import java.util.Map;
import p3.a0;
import x1.b0;
import x1.l;
import x1.m;
import x1.n;
import x1.q;
import x1.r;
/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: q  reason: collision with root package name */
    public static final r f2863q = new r() { // from class: b2.b
        @Override // x1.r
        public final l[] a() {
            l[] g10;
            g10 = c.g();
            return g10;
        }

        @Override // x1.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private n f2869f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2871h;

    /* renamed from: i  reason: collision with root package name */
    private long f2872i;

    /* renamed from: j  reason: collision with root package name */
    private int f2873j;

    /* renamed from: k  reason: collision with root package name */
    private int f2874k;

    /* renamed from: l  reason: collision with root package name */
    private int f2875l;

    /* renamed from: m  reason: collision with root package name */
    private long f2876m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2877n;

    /* renamed from: o  reason: collision with root package name */
    private a f2878o;

    /* renamed from: p  reason: collision with root package name */
    private f f2879p;

    /* renamed from: a  reason: collision with root package name */
    private final a0 f2864a = new a0(4);

    /* renamed from: b  reason: collision with root package name */
    private final a0 f2865b = new a0(9);

    /* renamed from: c  reason: collision with root package name */
    private final a0 f2866c = new a0(11);

    /* renamed from: d  reason: collision with root package name */
    private final a0 f2867d = new a0();

    /* renamed from: e  reason: collision with root package name */
    private final d f2868e = new d();

    /* renamed from: g  reason: collision with root package name */
    private int f2870g = 1;

    private void e() {
        if (this.f2877n) {
            return;
        }
        this.f2869f.t(new b0.b(-9223372036854775807L));
        this.f2877n = true;
    }

    private long f() {
        if (this.f2871h) {
            return this.f2872i + this.f2876m;
        }
        if (this.f2868e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f2876m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] g() {
        return new l[]{new c()};
    }

    private a0 h(m mVar) {
        if (this.f2875l > this.f2867d.b()) {
            a0 a0Var = this.f2867d;
            a0Var.R(new byte[Math.max(a0Var.b() * 2, this.f2875l)], 0);
        } else {
            this.f2867d.T(0);
        }
        this.f2867d.S(this.f2875l);
        mVar.readFully(this.f2867d.e(), 0, this.f2875l);
        return this.f2867d;
    }

    private boolean k(m mVar) {
        if (mVar.c(this.f2865b.e(), 0, 9, true)) {
            this.f2865b.T(0);
            this.f2865b.U(4);
            int G = this.f2865b.G();
            boolean z10 = (G & 4) != 0;
            boolean z11 = (G & 1) != 0;
            if (z10 && this.f2878o == null) {
                this.f2878o = new a(this.f2869f.d(8, 1));
            }
            if (z11 && this.f2879p == null) {
                this.f2879p = new f(this.f2869f.d(9, 2));
            }
            this.f2869f.k();
            this.f2873j = (this.f2865b.p() - 9) + 4;
            this.f2870g = 2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean l(x1.m r10) {
        /*
            r9 = this;
            long r0 = r9.f()
            int r2 = r9.f2874k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            b2.a r7 = r9.f2878o
            if (r7 == 0) goto L24
            r9.e()
            b2.a r2 = r9.f2878o
        L1a:
            p3.a0 r10 = r9.h(r10)
            boolean r5 = r2.a(r10, r0)
        L22:
            r10 = 1
            goto L6d
        L24:
            r7 = 9
            if (r2 != r7) goto L32
            b2.f r7 = r9.f2879p
            if (r7 == 0) goto L32
            r9.e()
            b2.f r2 = r9.f2879p
            goto L1a
        L32:
            r7 = 18
            if (r2 != r7) goto L67
            boolean r2 = r9.f2877n
            if (r2 != 0) goto L67
            b2.d r2 = r9.f2868e
            p3.a0 r10 = r9.h(r10)
            boolean r5 = r2.a(r10, r0)
            b2.d r10 = r9.f2868e
            long r0 = r10.d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L22
            x1.n r10 = r9.f2869f
            x1.z r2 = new x1.z
            b2.d r7 = r9.f2868e
            long[] r7 = r7.e()
            b2.d r8 = r9.f2868e
            long[] r8 = r8.f()
            r2.<init>(r7, r8, r0)
            r10.t(r2)
            r9.f2877n = r6
            goto L22
        L67:
            int r0 = r9.f2875l
            r10.g(r0)
            r10 = 0
        L6d:
            boolean r0 = r9.f2871h
            if (r0 != 0) goto L87
            if (r5 == 0) goto L87
            r9.f2871h = r6
            b2.d r0 = r9.f2868e
            long r0 = r0.d()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L83
            long r0 = r9.f2876m
            long r0 = -r0
            goto L85
        L83:
            r0 = 0
        L85:
            r9.f2872i = r0
        L87:
            r0 = 4
            r9.f2873j = r0
            r0 = 2
            r9.f2870g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.c.l(x1.m):boolean");
    }

    private boolean m(m mVar) {
        if (mVar.c(this.f2866c.e(), 0, 11, true)) {
            this.f2866c.T(0);
            this.f2874k = this.f2866c.G();
            this.f2875l = this.f2866c.J();
            this.f2876m = this.f2866c.J();
            this.f2876m = ((this.f2866c.G() << 24) | this.f2876m) * 1000;
            this.f2866c.U(3);
            this.f2870g = 4;
            return true;
        }
        return false;
    }

    private void n(m mVar) {
        mVar.g(this.f2873j);
        this.f2873j = 0;
        this.f2870g = 3;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f2870g = 1;
            this.f2871h = false;
        } else {
            this.f2870g = 3;
        }
        this.f2873j = 0;
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f2869f = nVar;
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        p3.a.h(this.f2869f);
        while (true) {
            int i10 = this.f2870g;
            if (i10 != 1) {
                if (i10 == 2) {
                    n(mVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (l(mVar)) {
                        return 0;
                    }
                } else if (!m(mVar)) {
                    return -1;
                }
            } else if (!k(mVar)) {
                return -1;
            }
        }
    }

    @Override // x1.l
    public boolean j(m mVar) {
        mVar.n(this.f2864a.e(), 0, 3);
        this.f2864a.T(0);
        if (this.f2864a.J() != 4607062) {
            return false;
        }
        mVar.n(this.f2864a.e(), 0, 2);
        this.f2864a.T(0);
        if ((this.f2864a.M() & 250) != 0) {
            return false;
        }
        mVar.n(this.f2864a.e(), 0, 4);
        this.f2864a.T(0);
        int p10 = this.f2864a.p();
        mVar.f();
        mVar.o(p10);
        mVar.n(this.f2864a.e(), 0, 4);
        this.f2864a.T(0);
        return this.f2864a.p() == 0;
    }
}
