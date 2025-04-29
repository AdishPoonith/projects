package h5;

import com.google.crypto.tink.shaded.protobuf.q;
import java.security.GeneralSecurityException;
import o5.d;
import t5.y;
import u5.p;
import u5.r;
/* loaded from: classes.dex */
public class d extends o5.d<t5.f> {

    /* loaded from: classes.dex */
    class a extends o5.k<u5.l, t5.f> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public u5.l a(t5.f fVar) {
            return new u5.a(fVar.S().A(), fVar.T().Q());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends d.a<t5.g, t5.f> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public t5.f a(t5.g gVar) {
            return t5.f.V().C(gVar.S()).B(com.google.crypto.tink.shaded.protobuf.i.m(p.c(gVar.R()))).D(d.this.l()).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public t5.g d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return t5.g.U(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(t5.g gVar) {
            r.a(gVar.R());
            d.this.o(gVar.S());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        super(t5.f.class, new a(u5.l.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(t5.h hVar) {
        if (hVar.Q() < 12 || hVar.Q() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // o5.d
    public d.a<?, t5.f> f() {
        return new b(t5.g.class);
    }

    @Override // o5.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // o5.d
    /* renamed from: m */
    public t5.f h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return t5.f.W(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: n */
    public void j(t5.f fVar) {
        r.c(fVar.U(), l());
        r.a(fVar.S().size());
        o(fVar.T());
    }
}
