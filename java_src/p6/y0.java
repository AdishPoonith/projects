package p6;

import d7.q;
import java.util.Map;
import l6.h4;
import q6.g;
/* loaded from: classes.dex */
public class y0 extends c<d7.q, d7.r, a> {

    /* renamed from: t  reason: collision with root package name */
    public static final com.google.protobuf.i f15744t = com.google.protobuf.i.f7143k;

    /* renamed from: s  reason: collision with root package name */
    private final l0 f15745s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a extends r0 {
        void d(m6.w wVar, w0 w0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(w wVar, q6.g gVar, l0 l0Var, a aVar) {
        super(wVar, d7.p.c(), gVar, g.d.LISTEN_STREAM_CONNECTION_BACKOFF, g.d.LISTEN_STREAM_IDLE, g.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f15745s = l0Var;
    }

    public void A(h4 h4Var) {
        q6.b.d(m(), "Watching queries requires an open stream", new Object[0]);
        q.b I = d7.q.m0().J(this.f15745s.a()).I(this.f15745s.V(h4Var));
        Map<String, String> N = this.f15745s.N(h4Var);
        if (N != null) {
            I.H(N);
        }
        x(I.b());
    }

    @Override // p6.c
    public /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // p6.c
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // p6.c
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // p6.c
    public /* bridge */ /* synthetic */ void u() {
        super.u();
    }

    @Override // p6.c
    public /* bridge */ /* synthetic */ void v() {
        super.v();
    }

    @Override // p6.c
    /* renamed from: y */
    public void r(d7.r rVar) {
        this.f15549l.f();
        w0 A = this.f15745s.A(rVar);
        ((a) this.f15550m).d(this.f15745s.z(rVar), A);
    }

    public void z(int i10) {
        q6.b.d(m(), "Unwatching targets requires an open stream", new Object[0]);
        x(d7.q.m0().J(this.f15745s.a()).K(i10).b());
    }
}
