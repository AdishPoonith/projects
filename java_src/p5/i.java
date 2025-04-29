package p5;

import com.google.crypto.tink.shaded.protobuf.q;
import g5.k;
import g5.s;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import l5.b;
import o5.d;
import t5.u;
import t5.v;
import t5.w;
import t5.x;
import t5.y;
import u5.n;
import u5.o;
import u5.p;
import u5.r;
/* loaded from: classes.dex */
public final class i extends o5.d<v> {

    /* loaded from: classes.dex */
    class a extends o5.k<s, v> {
        a(Class cls) {
            super(cls);
        }

        @Override // o5.k
        /* renamed from: c */
        public s a(v vVar) {
            u R = vVar.T().R();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.S().A(), "HMAC");
            int S = vVar.T().S();
            int i10 = c.f15517a[R.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return new o(new n("HMACSHA512", secretKeySpec), S);
                            }
                            throw new GeneralSecurityException("unknown hash");
                        }
                        return new o(new n("HMACSHA384", secretKeySpec), S);
                    }
                    return new o(new n("HMACSHA256", secretKeySpec), S);
                }
                return new o(new n("HMACSHA224", secretKeySpec), S);
            }
            return new o(new n("HMACSHA1", secretKeySpec), S);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends d.a<w, v> {
        b(Class cls) {
            super(cls);
        }

        @Override // o5.d.a
        public Map<String, d.a.C0215a<w>> c() {
            HashMap hashMap = new HashMap();
            u uVar = u.SHA256;
            k.b bVar = k.b.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", i.m(32, 16, uVar, bVar));
            k.b bVar2 = k.b.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", i.m(32, 16, uVar, bVar2));
            hashMap.put("HMAC_SHA256_256BITTAG", i.m(32, 32, uVar, bVar));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", i.m(32, 32, uVar, bVar2));
            u uVar2 = u.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", i.m(64, 16, uVar2, bVar));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", i.m(64, 16, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_256BITTAG", i.m(64, 32, uVar2, bVar));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", i.m(64, 32, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_512BITTAG", i.m(64, 64, uVar2, bVar));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", i.m(64, 64, uVar2, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o5.d.a
        /* renamed from: f */
        public v a(w wVar) {
            return v.V().D(i.this.n()).C(wVar.S()).B(com.google.crypto.tink.shaded.protobuf.i.m(p.c(wVar.R()))).b();
        }

        @Override // o5.d.a
        /* renamed from: g */
        public w d(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return w.U(iVar, q.b());
        }

        @Override // o5.d.a
        /* renamed from: h */
        public void e(w wVar) {
            if (wVar.R() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            i.r(wVar.S());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15517a;

        static {
            int[] iArr = new int[u.values().length];
            f15517a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15517a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15517a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15517a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15517a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public i() {
        super(v.class, new a(s.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0215a<w> m(int i10, int i11, u uVar, k.b bVar) {
        return new d.a.C0215a<>(w.T().C(x.T().B(uVar).C(i11).b()).B(i10).b(), bVar);
    }

    public static void p(boolean z10) {
        g5.w.k(new i(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(x xVar) {
        if (xVar.S() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i10 = c.f15517a[xVar.R().ordinal()];
        if (i10 == 1) {
            if (xVar.S() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 2) {
            if (xVar.S() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 3) {
            if (xVar.S() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 4) {
            if (xVar.S() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 != 5) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (xVar.S() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // o5.d
    public b.EnumC0195b a() {
        return b.EnumC0195b.f13065k;
    }

    @Override // o5.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // o5.d
    public d.a<?, v> f() {
        return new b(w.class);
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
    public v h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return v.W(iVar, q.b());
    }

    @Override // o5.d
    /* renamed from: q */
    public void j(v vVar) {
        r.c(vVar.U(), n());
        if (vVar.S().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r(vVar.T());
    }
}
