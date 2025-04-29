package h5;

import com.google.crypto.tink.shaded.protobuf.q;
import g5.k;
import g5.w;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o5.d;
import t5.r;
import t5.s;
import t5.y;
import u5.p;
/* loaded from: classes.dex */
public class h extends o5.d<r> {

    /* loaded from: classes.dex */
    class a extends o5.k<g5.a, r> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public g5.a a(r rVar) {
            return new u5.g(rVar.Q().A());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a<s, r> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        public Map<String, d.a.C0215a<s>> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new d.a.C0215a(s.O(), k.b.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new d.a.C0215a(s.O(), k.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public r a(s sVar) {
            return r.S().C(h.this.k()).B(com.google.crypto.tink.shaded.protobuf.i.m(p.c(32))).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public s d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return s.P(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(s sVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        super(r.class, new a(g5.a.class));
    }

    public static void m(boolean z10) {
        w.k(new h(), z10);
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // o5.d
    public d.a<?, r> f() {
        return new b(s.class);
    }

    @Override // o5.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // o5.d
    /* renamed from: l */
    public r h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return r.T(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: n */
    public void j(r rVar) {
        u5.r.c(rVar.R(), k());
        if (rVar.Q().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
