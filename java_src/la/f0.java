package la;

import v9.g;
/* loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.m implements da.p<v9.g, g.b, v9.g> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f13613j = new a();

        a() {
            super(2);
        }

        @Override // da.p
        /* renamed from: a */
        public final v9.g invoke(v9.g gVar, g.b bVar) {
            return bVar instanceof e0 ? gVar.r(((e0) bVar).t()) : gVar.r(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.m implements da.p<v9.g, g.b, v9.g> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.s<v9.g> f13614j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f13615k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.s<v9.g> sVar, boolean z10) {
            super(2);
            this.f13614j = sVar;
            this.f13615k = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, v9.g] */
        @Override // da.p
        /* renamed from: a */
        public final v9.g invoke(v9.g gVar, g.b bVar) {
            if (bVar instanceof e0) {
                g.b b10 = this.f13614j.f12857j.b(bVar.getKey());
                if (b10 != null) {
                    kotlin.jvm.internal.s<v9.g> sVar = this.f13614j;
                    sVar.f12857j = sVar.f12857j.f0(bVar.getKey());
                    return gVar.r(((e0) bVar).i(b10));
                }
                e0 e0Var = (e0) bVar;
                if (this.f13615k) {
                    e0Var = e0Var.t();
                }
                return gVar.r(e0Var);
            }
            return gVar.r(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.m implements da.p<Boolean, g.b, Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public static final c f13616j = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof e0));
        }

        @Override // da.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, g.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final v9.g a(v9.g gVar, v9.g gVar2, boolean z10) {
        boolean c10 = c(gVar);
        boolean c11 = c(gVar2);
        if (c10 || c11) {
            kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
            sVar.f12857j = gVar2;
            v9.h hVar = v9.h.f19537j;
            v9.g gVar3 = (v9.g) gVar.N(hVar, new b(sVar, z10));
            if (c11) {
                sVar.f12857j = ((v9.g) sVar.f12857j).N(hVar, a.f13613j);
            }
            return gVar3.r((v9.g) sVar.f12857j);
        }
        return gVar.r(gVar2);
    }

    public static final String b(v9.g gVar) {
        return null;
    }

    private static final boolean c(v9.g gVar) {
        return ((Boolean) gVar.N(Boolean.FALSE, c.f13616j)).booleanValue();
    }

    public static final v9.g d(k0 k0Var, v9.g gVar) {
        v9.g a10 = a(k0Var.n(), gVar, true);
        return (a10 == a1.a() || a10.b(v9.e.f19534h) != null) ? a10 : a10.r(a1.a());
    }

    public static final v9.g e(v9.g gVar, v9.g gVar2) {
        return !c(gVar2) ? gVar.r(gVar2) : a(gVar, gVar2, false);
    }

    public static final z2<?> f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof w0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof z2) {
                return (z2) eVar;
            }
        }
        return null;
    }

    public static final z2<?> g(v9.d<?> dVar, v9.g gVar, Object obj) {
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            if (gVar.b(a3.f13580j) != null) {
                z2<?> f10 = f((kotlin.coroutines.jvm.internal.e) dVar);
                if (f10 != null) {
                    f10.V0(gVar, obj);
                }
                return f10;
            }
            return null;
        }
        return null;
    }
}
