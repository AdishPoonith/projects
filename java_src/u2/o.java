package u2;

import java.io.IOException;
import s1.q3;
import u2.r;
import u2.u;
/* loaded from: classes.dex */
public final class o implements r, r.a {

    /* renamed from: j  reason: collision with root package name */
    public final u.b f18926j;

    /* renamed from: k  reason: collision with root package name */
    private final long f18927k;

    /* renamed from: l  reason: collision with root package name */
    private final o3.b f18928l;

    /* renamed from: m  reason: collision with root package name */
    private u f18929m;

    /* renamed from: n  reason: collision with root package name */
    private r f18930n;

    /* renamed from: o  reason: collision with root package name */
    private r.a f18931o;

    /* renamed from: p  reason: collision with root package name */
    private a f18932p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f18933q;

    /* renamed from: r  reason: collision with root package name */
    private long f18934r = -9223372036854775807L;

    /* loaded from: classes.dex */
    public interface a {
        void a(u.b bVar);

        void b(u.b bVar, IOException iOException);
    }

    public o(u.b bVar, o3.b bVar2, long j10) {
        this.f18926j = bVar;
        this.f18928l = bVar2;
        this.f18927k = j10;
    }

    private long u(long j10) {
        long j11 = this.f18934r;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        r rVar = this.f18930n;
        return rVar != null && rVar.a();
    }

    @Override // u2.r, u2.o0
    public long c() {
        return ((r) p3.n0.j(this.f18930n)).c();
    }

    public void d(u.b bVar) {
        long u10 = u(this.f18927k);
        r n10 = ((u) p3.a.e(this.f18929m)).n(bVar, this.f18928l, u10);
        this.f18930n = n10;
        if (this.f18931o != null) {
            n10.j(this, u10);
        }
    }

    @Override // u2.r
    public long e(long j10, q3 q3Var) {
        return ((r) p3.n0.j(this.f18930n)).e(j10, q3Var);
    }

    @Override // u2.r, u2.o0
    public long f() {
        return ((r) p3.n0.j(this.f18930n)).f();
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        r rVar = this.f18930n;
        return rVar != null && rVar.g(j10);
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
        ((r) p3.n0.j(this.f18930n)).h(j10);
    }

    @Override // u2.r.a
    public void i(r rVar) {
        ((r.a) p3.n0.j(this.f18931o)).i(this);
        a aVar = this.f18932p;
        if (aVar != null) {
            aVar.a(this.f18926j);
        }
    }

    @Override // u2.r
    public void j(r.a aVar, long j10) {
        this.f18931o = aVar;
        r rVar = this.f18930n;
        if (rVar != null) {
            rVar.j(this, u(this.f18927k));
        }
    }

    @Override // u2.r
    public long m(n3.t[] tVarArr, boolean[] zArr, n0[] n0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f18934r;
        if (j12 == -9223372036854775807L || j10 != this.f18927k) {
            j11 = j10;
        } else {
            this.f18934r = -9223372036854775807L;
            j11 = j12;
        }
        return ((r) p3.n0.j(this.f18930n)).m(tVarArr, zArr, n0VarArr, zArr2, j11);
    }

    @Override // u2.r
    public long n() {
        return ((r) p3.n0.j(this.f18930n)).n();
    }

    public long o() {
        return this.f18934r;
    }

    @Override // u2.r
    public v0 p() {
        return ((r) p3.n0.j(this.f18930n)).p();
    }

    @Override // u2.r
    public void q() {
        try {
            r rVar = this.f18930n;
            if (rVar != null) {
                rVar.q();
            } else {
                u uVar = this.f18929m;
                if (uVar != null) {
                    uVar.f();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f18932p;
            if (aVar == null) {
                throw e10;
            }
            if (this.f18933q) {
                return;
            }
            this.f18933q = true;
            aVar.b(this.f18926j, e10);
        }
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        ((r) p3.n0.j(this.f18930n)).r(j10, z10);
    }

    @Override // u2.r
    public long s(long j10) {
        return ((r) p3.n0.j(this.f18930n)).s(j10);
    }

    public long t() {
        return this.f18927k;
    }

    @Override // u2.o0.a
    /* renamed from: v */
    public void l(r rVar) {
        ((r.a) p3.n0.j(this.f18931o)).l(this);
    }

    public void w(long j10) {
        this.f18934r = j10;
    }

    public void x() {
        if (this.f18930n != null) {
            ((u) p3.a.e(this.f18929m)).b(this.f18930n);
        }
    }

    public void y(u uVar) {
        p3.a.f(this.f18929m == null);
        this.f18929m = uVar;
    }
}
