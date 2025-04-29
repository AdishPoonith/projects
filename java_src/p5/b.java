package p5;

import com.google.crypto.tink.shaded.protobuf.q;
import g5.k;
import g5.s;
import g5.w;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o5.d;
import t5.y;
import u5.o;
import u5.p;
import u5.r;
/* loaded from: classes.dex */
public final class b extends o5.d<t5.a> {

    /* loaded from: classes.dex */
    class a extends o5.k<s, t5.a> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public s a(t5.a aVar) {
            return new o(new u5.m(aVar.R().A()), aVar.S().Q());
        }
    }

    /* renamed from: p5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0225b extends d.a<t5.b, t5.a> {
        C0225b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        public Map<String, d.a.C0215a<t5.b>> c() {
            HashMap hashMap = new HashMap();
            k.b bVar = k.b.TINK;
            hashMap.put("AES_CMAC", new d.a.C0215a(t5.b.S().B(32).C(t5.c.R().B(16).b()).b(), bVar));
            hashMap.put("AES256_CMAC", new d.a.C0215a(t5.b.S().B(32).C(t5.c.R().B(16).b()).b(), bVar));
            hashMap.put("AES256_CMAC_RAW", new d.a.C0215a(t5.b.S().B(32).C(t5.c.R().B(16).b()).b(), k.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public t5.a a(t5.b bVar) {
            return t5.a.U().D(0).B(com.google.crypto.tink.shaded.protobuf.i.m(p.c(bVar.Q()))).C(bVar.R()).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public t5.b d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return t5.b.T(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(t5.b bVar) {
            b.q(bVar.R());
            b.r(bVar.Q());
        }
    }

    b() {
        super(t5.a.class, new a(s.class));
    }

    public static void o(boolean z10) {
        w.k(new b(), z10);
        h.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(t5.c cVar) {
        if (cVar.Q() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (cVar.Q() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(int i10) {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // o5.d
    public d.a<?, t5.a> f() {
        return new C0225b(t5.b.class);
    }

    @Override // o5.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // o5.d
    /* renamed from: n */
    public t5.a h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return t5.a.V(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: p */
    public void j(t5.a aVar) {
        r.c(aVar.T(), m());
        r(aVar.R().size());
        q(aVar.S());
    }
}
