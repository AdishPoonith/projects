package h5;

import com.google.crypto.tink.shaded.protobuf.q;
import g5.r;
import g5.w;
import java.security.GeneralSecurityException;
import o5.d;
import t5.g0;
import t5.h0;
import t5.y;
/* loaded from: classes.dex */
public class k extends o5.d<g0> {

    /* loaded from: classes.dex */
    class a extends o5.k<g5.a, g0> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public g5.a a(g0 g0Var) {
            String Q = g0Var.Q().Q();
            return new j(g0Var.Q().P(), r.a(Q).a(Q));
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a<h0, g0> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public g0 a(h0 h0Var) {
            return g0.S().B(h0Var).C(k.this.k()).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public h0 d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return h0.S(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(h0 h0Var) {
            if (h0Var.Q().isEmpty() || !h0Var.R()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k() {
        super(g0.class, new a(g5.a.class));
    }

    public static void m(boolean z10) {
        w.k(new k(), z10);
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // o5.d
    public d.a<?, g0> f() {
        return new b(h0.class);
    }

    @Override // o5.d
    public y.c g() {
        return y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // o5.d
    /* renamed from: l */
    public g0 h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return g0.T(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: n */
    public void j(g0 g0Var) {
        u5.r.c(g0Var.R(), k());
    }
}
