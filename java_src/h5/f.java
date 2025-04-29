package h5;

import com.google.crypto.tink.shaded.protobuf.q;
import g5.k;
import g5.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l5.b;
import o5.d;
import t5.m;
import t5.y;
import u5.p;
import u5.r;
/* loaded from: classes.dex */
public final class f extends o5.d<t5.l> {

    /* loaded from: classes.dex */
    class a extends o5.k<g5.a, t5.l> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public g5.a a(t5.l lVar) {
            return new u5.c(lVar.Q().A());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a<m, t5.l> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        public Map<String, d.a.C0215a<m>> c() {
            HashMap hashMap = new HashMap();
            k.b bVar = k.b.TINK;
            hashMap.put("AES128_GCM", f.l(16, bVar));
            k.b bVar2 = k.b.RAW;
            hashMap.put("AES128_GCM_RAW", f.l(16, bVar2));
            hashMap.put("AES256_GCM", f.l(32, bVar));
            hashMap.put("AES256_GCM_RAW", f.l(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public t5.l a(m mVar) {
            return t5.l.S().B(com.google.crypto.tink.shaded.protobuf.i.m(p.c(mVar.P()))).C(f.this.m()).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public m d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return m.R(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(m mVar) {
            r.a(mVar.P());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        super(t5.l.class, new a(g5.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0215a<m> l(int i10, k.b bVar) {
        return new d.a.C0215a<>(m.Q().B(i10).b(), bVar);
    }

    public static void o(boolean z10) {
        w.k(new f(), z10);
    }

    @Override // o5.d
    public b.EnumC0195b a() {
        return b.EnumC0195b.f13065k;
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // o5.d
    public d.a<?, t5.l> f() {
        return new b(m.class);
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
    public t5.l h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return t5.l.T(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: p */
    public void j(t5.l lVar) {
        r.c(lVar.R(), m());
        r.a(lVar.Q().size());
    }
}
