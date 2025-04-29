package h5;

import com.google.crypto.tink.shaded.protobuf.q;
import g5.k;
import g5.w;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o5.d;
import t5.y;
import u5.p;
import u5.r;
/* loaded from: classes.dex */
public final class e extends o5.d<t5.i> {

    /* loaded from: classes.dex */
    class a extends o5.k<g5.a, t5.i> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public g5.a a(t5.i iVar) {
            return new u5.b(iVar.R().A(), iVar.S().Q());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a<t5.j, t5.i> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        public Map<String, d.a.C0215a<t5.j>> c() {
            HashMap hashMap = new HashMap();
            k.b bVar = k.b.TINK;
            hashMap.put("AES128_EAX", e.l(16, 16, bVar));
            k.b bVar2 = k.b.RAW;
            hashMap.put("AES128_EAX_RAW", e.l(16, 16, bVar2));
            hashMap.put("AES256_EAX", e.l(32, 16, bVar));
            hashMap.put("AES256_EAX_RAW", e.l(32, 16, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public t5.i a(t5.j jVar) {
            return t5.i.U().B(com.google.crypto.tink.shaded.protobuf.i.m(p.c(jVar.Q()))).C(jVar.R()).D(e.this.m()).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public t5.j d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return t5.j.T(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(t5.j jVar) {
            r.a(jVar.Q());
            if (jVar.R().Q() != 12 && jVar.R().Q() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        super(t5.i.class, new a(g5.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0215a<t5.j> l(int i10, int i11, k.b bVar) {
        return new d.a.C0215a<>(t5.j.S().B(i10).C(t5.k.R().B(i11).b()).b(), bVar);
    }

    public static void o(boolean z10) {
        w.k(new e(), z10);
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // o5.d
    public d.a<?, t5.i> f() {
        return new b(t5.j.class);
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
    public t5.i h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return t5.i.V(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: p */
    public void j(t5.i iVar) {
        r.c(iVar.T(), m());
        r.a(iVar.R().size());
        if (iVar.S().Q() != 12 && iVar.S().Q() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
