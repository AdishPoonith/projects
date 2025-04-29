package p6;

import d7.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q6.g;
/* loaded from: classes.dex */
public class z0 extends c<d7.d0, d7.e0, a> {

    /* renamed from: v  reason: collision with root package name */
    public static final com.google.protobuf.i f15748v = com.google.protobuf.i.f7143k;

    /* renamed from: s  reason: collision with root package name */
    private final l0 f15749s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f15750t;

    /* renamed from: u  reason: collision with root package name */
    private com.google.protobuf.i f15751u;

    /* loaded from: classes.dex */
    public interface a extends r0 {
        void c();

        void e(m6.w wVar, List<n6.i> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(w wVar, q6.g gVar, l0 l0Var, a aVar) {
        super(wVar, d7.p.e(), gVar, g.d.WRITE_STREAM_CONNECTION_BACKOFF, g.d.WRITE_STREAM_IDLE, g.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f15750t = false;
        this.f15751u = f15748v;
        this.f15749s = l0Var;
    }

    @Override // p6.c
    /* renamed from: A */
    public void r(d7.e0 e0Var) {
        this.f15751u = e0Var.h0();
        if (!this.f15750t) {
            this.f15750t = true;
            ((a) this.f15550m).c();
            return;
        }
        this.f15549l.f();
        m6.w y10 = this.f15749s.y(e0Var.f0());
        int j02 = e0Var.j0();
        ArrayList arrayList = new ArrayList(j02);
        for (int i10 = 0; i10 < j02; i10++) {
            arrayList.add(this.f15749s.p(e0Var.i0(i10), y10));
        }
        ((a) this.f15550m).e(y10, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(com.google.protobuf.i iVar) {
        this.f15751u = (com.google.protobuf.i) q6.x.b(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        q6.b.d(m(), "Writing handshake requires an opened stream", new Object[0]);
        q6.b.d(!this.f15750t, "Handshake already completed", new Object[0]);
        x(d7.d0.l0().I(this.f15749s.a()).b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(List<n6.f> list) {
        q6.b.d(m(), "Writing mutations requires an opened stream", new Object[0]);
        q6.b.d(this.f15750t, "Handshake must be complete before writing mutations", new Object[0]);
        d0.b l02 = d7.d0.l0();
        for (n6.f fVar : list) {
            l02.H(this.f15749s.O(fVar));
        }
        l02.J(this.f15751u);
        x(l02.b());
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
    public void u() {
        this.f15750t = false;
        super.u();
    }

    @Override // p6.c
    public /* bridge */ /* synthetic */ void v() {
        super.v();
    }

    @Override // p6.c
    protected void w() {
        if (this.f15750t) {
            D(Collections.emptyList());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.protobuf.i y() {
        return this.f15751u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        return this.f15750t;
    }
}
