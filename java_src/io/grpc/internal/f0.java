package io.grpc.internal;

import io.grpc.internal.r;
/* loaded from: classes.dex */
public final class f0 extends o1 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f11169b;

    /* renamed from: c  reason: collision with root package name */
    private final i9.j1 f11170c;

    /* renamed from: d  reason: collision with root package name */
    private final r.a f11171d;

    /* renamed from: e  reason: collision with root package name */
    private final i9.k[] f11172e;

    public f0(i9.j1 j1Var, r.a aVar, i9.k[] kVarArr) {
        b5.n.e(!j1Var.o(), "error must not be OK");
        this.f11170c = j1Var;
        this.f11171d = aVar;
        this.f11172e = kVarArr;
    }

    public f0(i9.j1 j1Var, i9.k[] kVarArr) {
        this(j1Var, r.a.PROCESSED, kVarArr);
    }

    @Override // io.grpc.internal.o1, io.grpc.internal.q
    public void g(r rVar) {
        b5.n.u(!this.f11169b, "already started");
        this.f11169b = true;
        for (i9.k kVar : this.f11172e) {
            kVar.i(this.f11170c);
        }
        rVar.c(this.f11170c, this.f11171d, new i9.y0());
    }

    @Override // io.grpc.internal.o1, io.grpc.internal.q
    public void l(x0 x0Var) {
        x0Var.b("error", this.f11170c).b("progress", this.f11171d);
    }
}
