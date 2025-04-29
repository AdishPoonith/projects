package h5;

import com.google.crypto.tink.shaded.protobuf.q;
import g5.k;
import g5.w;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import o5.d;
import t5.n;
import t5.o;
import t5.y;
import u5.p;
import u5.r;
/* loaded from: classes.dex */
public final class g extends o5.d<n> {

    /* loaded from: classes.dex */
    class a extends o5.k<g5.a, n> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public g5.a a(n nVar) {
            return new j5.a(nVar.Q().A());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a<o, n> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        public Map<String, d.a.C0215a<o>> c() {
            HashMap hashMap = new HashMap();
            k.b bVar = k.b.TINK;
            hashMap.put("AES128_GCM_SIV", g.m(16, bVar));
            k.b bVar2 = k.b.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", g.m(16, bVar2));
            hashMap.put("AES256_GCM_SIV", g.m(32, bVar));
            hashMap.put("AES256_GCM_SIV_RAW", g.m(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public n a(o oVar) {
            return n.S().B(com.google.crypto.tink.shaded.protobuf.i.m(p.c(oVar.P()))).C(g.this.n()).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public o d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return o.R(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(o oVar) {
            r.a(oVar.P());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        super(n.class, new a(g5.a.class));
    }

    private static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0215a<o> m(int i10, k.b bVar) {
        return new d.a.C0215a<>(o.Q().B(i10).b(), bVar);
    }

    public static void p(boolean z10) {
        if (l()) {
            w.k(new g(), z10);
        }
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // o5.d
    public d.a<?, n> f() {
        return new b(o.class);
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
    public n h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return n.T(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: q */
    public void j(n nVar) {
        r.c(nVar.R(), n());
        r.a(nVar.Q().size());
    }
}
