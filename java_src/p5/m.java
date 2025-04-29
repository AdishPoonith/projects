package p5;

import g5.s;
import g5.u;
import g5.v;
import g5.w;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import r5.b;
import t5.i0;
/* loaded from: classes.dex */
class m implements v<s, s> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f15522a = Logger.getLogger(m.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f15523b = {0};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements s {

        /* renamed from: a  reason: collision with root package name */
        private final u<s> f15524a;

        /* renamed from: b  reason: collision with root package name */
        private final b.a f15525b;

        /* renamed from: c  reason: collision with root package name */
        private final b.a f15526c;

        private b(u<s> uVar) {
            b.a aVar;
            this.f15524a = uVar;
            if (uVar.i()) {
                r5.b a10 = o5.g.b().a();
                r5.c a11 = o5.f.a(uVar);
                this.f15525b = a10.a(a11, "mac", "compute");
                aVar = a10.a(a11, "mac", "verify");
            } else {
                aVar = o5.f.f14645a;
                this.f15525b = aVar;
            }
            this.f15526c = aVar;
        }

        @Override // g5.s
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length <= 5) {
                this.f15526c.a();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (u.c<s> cVar : this.f15524a.f(copyOf)) {
                byte[] a10 = cVar.d().equals(i0.LEGACY) ? u5.f.a(bArr2, m.f15523b) : bArr2;
                try {
                    cVar.f().a(copyOfRange, a10);
                    this.f15526c.b(cVar.c(), a10.length);
                    return;
                } catch (GeneralSecurityException e10) {
                    Logger logger = m.f15522a;
                    logger.info("tag prefix matches a key, but cannot verify: " + e10);
                }
            }
            for (u.c<s> cVar2 : this.f15524a.h()) {
                try {
                    cVar2.f().a(bArr, bArr2);
                    this.f15526c.b(cVar2.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f15526c.a();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // g5.s
        public byte[] b(byte[] bArr) {
            if (this.f15524a.e().d().equals(i0.LEGACY)) {
                bArr = u5.f.a(bArr, m.f15523b);
            }
            try {
                byte[] a10 = u5.f.a(this.f15524a.e().a(), this.f15524a.e().f().b(bArr));
                this.f15525b.b(this.f15524a.e().c(), bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f15525b.a();
                throw e10;
            }
        }
    }

    m() {
    }

    public static void f() {
        w.m(new m());
    }

    private void g(u<s> uVar) {
        for (List<u.c<s>> list : uVar.c()) {
            for (u.c<s> cVar : list) {
                if (cVar.b() instanceof k) {
                    k kVar = (k) cVar.b();
                    v5.a a10 = v5.a.a(cVar.a());
                    if (!a10.equals(kVar.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + kVar.a() + " has wrong output prefix (" + kVar.b() + ") instead of (" + a10 + ")");
                    }
                }
            }
        }
    }

    @Override // g5.v
    public Class<s> a() {
        return s.class;
    }

    @Override // g5.v
    public Class<s> c() {
        return s.class;
    }

    @Override // g5.v
    /* renamed from: h */
    public s b(u<s> uVar) {
        g(uVar);
        return new b(uVar);
    }
}
