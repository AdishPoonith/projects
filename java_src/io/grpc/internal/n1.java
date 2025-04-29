package io.grpc.internal;

import i9.b;
/* loaded from: classes.dex */
final class n1 extends b.a {

    /* renamed from: a  reason: collision with root package name */
    private final s f11473a;

    /* renamed from: b  reason: collision with root package name */
    private final i9.z0<?, ?> f11474b;

    /* renamed from: c  reason: collision with root package name */
    private final i9.y0 f11475c;

    /* renamed from: d  reason: collision with root package name */
    private final i9.c f11476d;

    /* renamed from: f  reason: collision with root package name */
    private final a f11478f;

    /* renamed from: g  reason: collision with root package name */
    private final i9.k[] f11479g;

    /* renamed from: i  reason: collision with root package name */
    private q f11481i;

    /* renamed from: j  reason: collision with root package name */
    boolean f11482j;

    /* renamed from: k  reason: collision with root package name */
    b0 f11483k;

    /* renamed from: h  reason: collision with root package name */
    private final Object f11480h = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final i9.r f11477e = i9.r.e();

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(s sVar, i9.z0<?, ?> z0Var, i9.y0 y0Var, i9.c cVar, a aVar, i9.k[] kVarArr) {
        this.f11473a = sVar;
        this.f11474b = z0Var;
        this.f11475c = y0Var;
        this.f11476d = cVar;
        this.f11478f = aVar;
        this.f11479g = kVarArr;
    }

    private void c(q qVar) {
        boolean z10;
        b5.n.u(!this.f11482j, "already finalized");
        this.f11482j = true;
        synchronized (this.f11480h) {
            if (this.f11481i == null) {
                this.f11481i = qVar;
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10) {
            b5.n.u(this.f11483k != null, "delayedStream is null");
            Runnable x10 = this.f11483k.x(qVar);
            if (x10 != null) {
                x10.run();
            }
        }
        this.f11478f.a();
    }

    @Override // i9.b.a
    public void a(i9.y0 y0Var) {
        b5.n.u(!this.f11482j, "apply() or fail() already called");
        b5.n.o(y0Var, "headers");
        this.f11475c.m(y0Var);
        i9.r b10 = this.f11477e.b();
        try {
            q a10 = this.f11473a.a(this.f11474b, this.f11475c, this.f11476d, this.f11479g);
            this.f11477e.f(b10);
            c(a10);
        } catch (Throwable th) {
            this.f11477e.f(b10);
            throw th;
        }
    }

    @Override // i9.b.a
    public void b(i9.j1 j1Var) {
        b5.n.e(!j1Var.o(), "Cannot fail with OK status");
        b5.n.u(!this.f11482j, "apply() or fail() already called");
        c(new f0(r0.n(j1Var), this.f11479g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q d() {
        synchronized (this.f11480h) {
            q qVar = this.f11481i;
            if (qVar == null) {
                b0 b0Var = new b0();
                this.f11483k = b0Var;
                this.f11481i = b0Var;
                return b0Var;
            }
            return qVar;
        }
    }
}
