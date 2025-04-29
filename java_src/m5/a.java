package m5;

import com.google.crypto.tink.shaded.protobuf.i;
import g5.k;
import g5.w;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o5.d;
import o5.k;
import t5.p;
import t5.q;
import t5.y;
import u5.r;
/* loaded from: classes.dex */
public final class a extends d<p> {

    /* renamed from: m5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0202a extends k<g5.d, p> {
        C0202a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public g5.d a(p pVar) {
            return new u5.d(pVar.Q().A());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a<q, p> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        public Map<String, d.a.C0215a<q>> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", new d.a.C0215a(q.Q().B(64).b(), k.b.TINK));
            hashMap.put("AES256_SIV_RAW", new d.a.C0215a(q.Q().B(64).b(), k.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public p a(q qVar) {
            return p.S().B(i.m(u5.p.c(qVar.P()))).C(a.this.k()).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public q d(i iVar) {
            return q.R(iVar, com.google.crypto.tink.shaded.protobuf.q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(q qVar) {
            if (qVar.P() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.P() + ". Valid keys must have 64 bytes.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        super(p.class, new C0202a(g5.d.class));
    }

    public static void m(boolean z10) {
        w.k(new a(), z10);
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // o5.d
    public d.a<?, p> f() {
        return new b(q.class);
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
    public p h(i iVar) {
        return p.T(iVar, com.google.crypto.tink.shaded.protobuf.q.b());
    }

    @Override // o5.d
    /* renamed from: n */
    public void j(p pVar) {
        r.c(pVar.R(), k());
        if (pVar.Q().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.Q().size() + ". Valid keys must have 64 bytes.");
    }
}
