package h5;

import com.google.crypto.tink.shaded.protobuf.q;
import g5.r;
import g5.w;
import o5.d;
import t5.e0;
import t5.f0;
import t5.y;
/* loaded from: classes.dex */
public class i extends o5.d<e0> {

    /* loaded from: classes.dex */
    class a extends o5.k<g5.a, e0> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public g5.a a(e0 e0Var) {
            String P = e0Var.Q().P();
            return r.a(P).a(P);
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a<f0, e0> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public e0 a(f0 f0Var) {
            return e0.S().B(f0Var).C(i.this.k()).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public f0 d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return f0.Q(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(f0 f0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i() {
        super(e0.class, new a(g5.a.class));
    }

    public static void m(boolean z10) {
        w.k(new i(), z10);
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // o5.d
    public d.a<?, e0> f() {
        return new b(f0.class);
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
    public e0 h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return e0.T(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: n */
    public void j(e0 e0Var) {
        u5.r.c(e0Var.R(), k());
    }
}
