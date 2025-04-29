package h5;

import com.google.crypto.tink.shaded.protobuf.q;
import g5.k;
import g5.s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l5.b;
import o5.d;
import t5.u;
import t5.w;
import t5.x;
import t5.y;
import u5.r;
/* loaded from: classes.dex */
public final class c extends o5.d<t5.d> {

    /* loaded from: classes.dex */
    class a extends o5.k<g5.a, t5.d> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public g5.a a(t5.d dVar) {
            return new u5.h((u5.l) new d().e(dVar.R(), u5.l.class), (s) new p5.i().e(dVar.S(), s.class), dVar.S().T().S());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a<t5.e, t5.d> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        public Map<String, d.a.C0215a<t5.e>> c() {
            HashMap hashMap = new HashMap();
            u uVar = u.SHA256;
            k.b bVar = k.b.TINK;
            hashMap.put("AES128_CTR_HMAC_SHA256", c.l(16, 16, 32, 16, uVar, bVar));
            k.b bVar2 = k.b.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", c.l(16, 16, 32, 16, uVar, bVar2));
            hashMap.put("AES256_CTR_HMAC_SHA256", c.l(32, 16, 32, 32, uVar, bVar));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", c.l(32, 16, 32, 32, uVar, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public t5.d a(t5.e eVar) {
            return t5.d.U().B(new d().f().a(eVar.Q())).C(new p5.i().f().a(eVar.R())).D(c.this.n()).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public t5.e d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return t5.e.T(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(t5.e eVar) {
            new d().f().e(eVar.Q());
            new p5.i().f().e(eVar.R());
            r.a(eVar.Q().R());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        super(t5.d.class, new a(g5.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0215a<t5.e> l(int i10, int i11, int i12, int i13, u uVar, k.b bVar) {
        return new d.a.C0215a<>(m(i10, i11, i12, i13, uVar), bVar);
    }

    private static t5.e m(int i10, int i11, int i12, int i13, u uVar) {
        return t5.e.S().B(t5.g.T().C(t5.h.R().B(i11).b()).B(i10).b()).C(w.T().C(x.T().B(uVar).C(i13).b()).B(i12).b()).b();
    }

    public static void p(boolean z10) {
        g5.w.k(new c(), z10);
    }

    @Override // o5.d
    public b.EnumC0195b a() {
        return b.EnumC0195b.f13065k;
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // o5.d
    public d.a<?, t5.d> f() {
        return new b(t5.e.class);
    }

    @Override // o5.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // o5.d
    /* renamed from: o */
    public t5.d h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return t5.d.V(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: q */
    public void j(t5.d dVar) {
        r.c(dVar.T(), n());
        new d().j(dVar.R());
        new p5.i().j(dVar.S());
    }
}
