package a2;

import android.net.Uri;
import java.util.Map;
import p3.a0;
import p3.n0;
import x1.b0;
import x1.e0;
import x1.l;
import x1.m;
import x1.n;
import x1.q;
import x1.r;
import x1.s;
import x1.t;
import x1.u;
import x1.v;
/* loaded from: classes.dex */
public final class d implements l {

    /* renamed from: o  reason: collision with root package name */
    public static final r f44o = new r() { // from class: a2.c
        @Override // x1.r
        public final l[] a() {
            l[] k10;
            k10 = d.k();
            return k10;
        }

        @Override // x1.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f45a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f46b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f47c;

    /* renamed from: d  reason: collision with root package name */
    private final s.a f48d;

    /* renamed from: e  reason: collision with root package name */
    private n f49e;

    /* renamed from: f  reason: collision with root package name */
    private e0 f50f;

    /* renamed from: g  reason: collision with root package name */
    private int f51g;

    /* renamed from: h  reason: collision with root package name */
    private k2.a f52h;

    /* renamed from: i  reason: collision with root package name */
    private v f53i;

    /* renamed from: j  reason: collision with root package name */
    private int f54j;

    /* renamed from: k  reason: collision with root package name */
    private int f55k;

    /* renamed from: l  reason: collision with root package name */
    private b f56l;

    /* renamed from: m  reason: collision with root package name */
    private int f57m;

    /* renamed from: n  reason: collision with root package name */
    private long f58n;

    public d() {
        this(0);
    }

    public d(int i10) {
        this.f45a = new byte[42];
        this.f46b = new a0(new byte[32768], 0);
        this.f47c = (i10 & 1) != 0;
        this.f48d = new s.a();
        this.f51g = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        r5.T(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        return r4.f48d.f20192a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long e(p3.a0 r5, boolean r6) {
        /*
            r4 = this;
            x1.v r0 = r4.f53i
            p3.a.e(r0)
            int r0 = r5.f()
        L9:
            int r1 = r5.g()
            int r1 = r1 + (-16)
            if (r0 > r1) goto L2b
            r5.T(r0)
            x1.v r1 = r4.f53i
            int r2 = r4.f55k
            x1.s$a r3 = r4.f48d
            boolean r1 = x1.s.d(r5, r1, r2, r3)
            if (r1 == 0) goto L28
        L20:
            r5.T(r0)
            x1.s$a r5 = r4.f48d
            long r5 = r5.f20192a
            return r5
        L28:
            int r0 = r0 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L60
        L2d:
            int r6 = r5.g()
            int r1 = r4.f54j
            int r6 = r6 - r1
            if (r0 > r6) goto L58
            r5.T(r0)
            r6 = 0
            x1.v r1 = r4.f53i     // Catch: java.lang.IndexOutOfBoundsException -> L45
            int r2 = r4.f55k     // Catch: java.lang.IndexOutOfBoundsException -> L45
            x1.s$a r3 = r4.f48d     // Catch: java.lang.IndexOutOfBoundsException -> L45
            boolean r1 = x1.s.d(r5, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45
            goto L46
        L45:
            r1 = 0
        L46:
            int r2 = r5.f()
            int r3 = r5.g()
            if (r2 <= r3) goto L51
            goto L52
        L51:
            r6 = r1
        L52:
            if (r6 == 0) goto L55
            goto L20
        L55:
            int r0 = r0 + 1
            goto L2d
        L58:
            int r6 = r5.g()
            r5.T(r6)
            goto L63
        L60:
            r5.T(r0)
        L63:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.e(p3.a0, boolean):long");
    }

    private void f(m mVar) {
        this.f55k = t.b(mVar);
        ((n) n0.j(this.f49e)).t(g(mVar.p(), mVar.a()));
        this.f51g = 5;
    }

    private b0 g(long j10, long j11) {
        p3.a.e(this.f53i);
        v vVar = this.f53i;
        if (vVar.f20206k != null) {
            return new u(vVar, j10);
        }
        if (j11 == -1 || vVar.f20205j <= 0) {
            return new b0.b(vVar.f());
        }
        b bVar = new b(vVar, this.f55k, j10, j11);
        this.f56l = bVar;
        return bVar.b();
    }

    private void h(m mVar) {
        byte[] bArr = this.f45a;
        mVar.n(bArr, 0, bArr.length);
        mVar.f();
        this.f51g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] k() {
        return new l[]{new d()};
    }

    private void l() {
        ((e0) n0.j(this.f50f)).c((this.f58n * 1000000) / ((v) n0.j(this.f53i)).f20200e, 1, this.f57m, 0, null);
    }

    private int m(m mVar, x1.a0 a0Var) {
        boolean z10;
        p3.a.e(this.f50f);
        p3.a.e(this.f53i);
        b bVar = this.f56l;
        if (bVar == null || !bVar.d()) {
            if (this.f58n == -1) {
                this.f58n = s.i(mVar, this.f53i);
                return 0;
            }
            int g10 = this.f46b.g();
            if (g10 < 32768) {
                int read = mVar.read(this.f46b.e(), g10, 32768 - g10);
                z10 = read == -1;
                if (!z10) {
                    this.f46b.S(g10 + read);
                } else if (this.f46b.a() == 0) {
                    l();
                    return -1;
                }
            } else {
                z10 = false;
            }
            int f10 = this.f46b.f();
            int i10 = this.f57m;
            int i11 = this.f54j;
            if (i10 < i11) {
                a0 a0Var2 = this.f46b;
                a0Var2.U(Math.min(i11 - i10, a0Var2.a()));
            }
            long e10 = e(this.f46b, z10);
            int f11 = this.f46b.f() - f10;
            this.f46b.T(f10);
            this.f50f.d(this.f46b, f11);
            this.f57m += f11;
            if (e10 != -1) {
                l();
                this.f57m = 0;
                this.f58n = e10;
            }
            if (this.f46b.a() < 16) {
                int a10 = this.f46b.a();
                System.arraycopy(this.f46b.e(), this.f46b.f(), this.f46b.e(), 0, a10);
                this.f46b.T(0);
                this.f46b.S(a10);
            }
            return 0;
        }
        return this.f56l.c(mVar, a0Var);
    }

    private void n(m mVar) {
        this.f52h = t.d(mVar, !this.f47c);
        this.f51g = 1;
    }

    private void o(m mVar) {
        t.a aVar = new t.a(this.f53i);
        boolean z10 = false;
        while (!z10) {
            z10 = t.e(mVar, aVar);
            this.f53i = (v) n0.j(aVar.f20193a);
        }
        p3.a.e(this.f53i);
        this.f54j = Math.max(this.f53i.f20198c, 6);
        ((e0) n0.j(this.f50f)).e(this.f53i.g(this.f45a, this.f52h));
        this.f51g = 4;
    }

    private void p(m mVar) {
        t.i(mVar);
        this.f51g = 3;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f51g = 0;
        } else {
            b bVar = this.f56l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f58n = j11 != 0 ? -1L : 0L;
        this.f57m = 0;
        this.f46b.P(0);
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f49e = nVar;
        this.f50f = nVar.d(0, 1);
        nVar.k();
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        int i10 = this.f51g;
        if (i10 == 0) {
            n(mVar);
            return 0;
        } else if (i10 == 1) {
            h(mVar);
            return 0;
        } else if (i10 == 2) {
            p(mVar);
            return 0;
        } else if (i10 == 3) {
            o(mVar);
            return 0;
        } else if (i10 == 4) {
            f(mVar);
            return 0;
        } else if (i10 == 5) {
            return m(mVar, a0Var);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // x1.l
    public boolean j(m mVar) {
        t.c(mVar, false);
        return t.a(mVar);
    }
}
