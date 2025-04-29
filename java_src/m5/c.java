package m5;

import g5.d;
import g5.u;
import g5.v;
import g5.w;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import o5.f;
import o5.g;
import r5.b;
/* loaded from: classes.dex */
public class c implements v<d, d> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f13783a = Logger.getLogger(c.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final u<d> f13784a;

        /* renamed from: b  reason: collision with root package name */
        private final b.a f13785b;

        /* renamed from: c  reason: collision with root package name */
        private final b.a f13786c;

        public a(u<d> uVar) {
            b.a aVar;
            this.f13784a = uVar;
            if (uVar.i()) {
                r5.b a10 = g.b().a();
                r5.c a11 = f.a(uVar);
                this.f13785b = a10.a(a11, "daead", "encrypt");
                aVar = a10.a(a11, "daead", "decrypt");
            } else {
                aVar = f.f14645a;
                this.f13785b = aVar;
            }
            this.f13786c = aVar;
        }

        @Override // g5.d
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a10 = u5.f.a(this.f13784a.e().a(), this.f13784a.e().f().a(bArr, bArr2));
                this.f13785b.b(this.f13784a.e().c(), bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f13785b.a();
                throw e10;
            }
        }

        @Override // g5.d
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (u.c<d> cVar : this.f13784a.f(copyOf)) {
                    try {
                        byte[] b10 = cVar.f().b(copyOfRange, bArr2);
                        this.f13786c.b(cVar.c(), copyOfRange.length);
                        return b10;
                    } catch (GeneralSecurityException e10) {
                        Logger logger = c.f13783a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (u.c<d> cVar2 : this.f13784a.h()) {
                try {
                    byte[] b11 = cVar2.f().b(bArr, bArr2);
                    this.f13786c.b(cVar2.c(), bArr.length);
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f13786c.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    c() {
    }

    public static void e() {
        w.m(new c());
    }

    @Override // g5.v
    public Class<d> a() {
        return d.class;
    }

    @Override // g5.v
    public Class<d> c() {
        return d.class;
    }

    @Override // g5.v
    /* renamed from: f */
    public d b(u<d> uVar) {
        return new a(uVar);
    }
}
