package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kc  reason: invalid package */
/* loaded from: classes.dex */
final class kc extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ lc f4878b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(lc lcVar, Class cls) {
        super(cls);
        this.f4878b = lcVar;
    }

    public static final bo g(fo foVar) {
        ao D = bo.D();
        D.s(foVar.H());
        byte[] a10 = bv.a(foVar.C());
        D.r(m4.w(a10, 0, a10.length));
        D.t(0);
        return (bo) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        return g((fo) w6Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return fo.G(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    /* renamed from: f */
    public final void d(fo foVar) {
        dv.b(foVar.C());
        lc lcVar = this.f4878b;
        lc.m(foVar.H());
    }
}
