package h5;

import com.google.crypto.tink.shaded.protobuf.q;
import g5.k;
import g5.w;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o5.d;
import t5.k0;
import t5.l0;
import t5.y;
import u5.p;
import u5.r;
import u5.s;
/* loaded from: classes.dex */
public class l extends o5.d<k0> {

    /* loaded from: classes.dex */
    class a extends o5.k<g5.a, k0> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public g5.a a(k0 k0Var) {
            return new s(k0Var.Q().A());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a<l0, k0> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        public Map<String, d.a.C0215a<l0>> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new d.a.C0215a(l0.O(), k.b.TINK));
            hashMap.put("XCHACHA20_POLY1305_RAW", new d.a.C0215a(l0.O(), k.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public k0 a(l0 l0Var) {
            return k0.S().C(l.this.k()).B(com.google.crypto.tink.shaded.protobuf.i.m(p.c(32))).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public l0 d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return l0.P(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(l0 l0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l() {
        super(k0.class, new a(g5.a.class));
    }

    public static void m(boolean z10) {
        w.k(new l(), z10);
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // o5.d
    public d.a<?, k0> f() {
        return new b(l0.class);
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
    public k0 h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return k0.T(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: n */
    public void j(k0 k0Var) {
        r.c(k0Var.R(), k());
        if (k0Var.Q().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
