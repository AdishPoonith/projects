package h5;

import g5.u;
import g5.v;
import g5.w;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import r5.b;
/* loaded from: classes.dex */
public class b implements v<g5.a, g5.a> {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f9496a = Logger.getLogger(b.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0152b implements g5.a {

        /* renamed from: a  reason: collision with root package name */
        private final u<g5.a> f9497a;

        /* renamed from: b  reason: collision with root package name */
        private final b.a f9498b;

        /* renamed from: c  reason: collision with root package name */
        private final b.a f9499c;

        private C0152b(u<g5.a> uVar) {
            b.a aVar;
            this.f9497a = uVar;
            if (uVar.i()) {
                r5.b a10 = o5.g.b().a();
                r5.c a11 = o5.f.a(uVar);
                this.f9498b = a10.a(a11, "aead", "encrypt");
                aVar = a10.a(a11, "aead", "decrypt");
            } else {
                aVar = o5.f.f14645a;
                this.f9498b = aVar;
            }
            this.f9499c = aVar;
        }

        @Override // g5.a
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a10 = u5.f.a(this.f9497a.e().a(), this.f9497a.e().f().a(bArr, bArr2));
                this.f9498b.b(this.f9497a.e().c(), bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f9498b.a();
                throw e10;
            }
        }

        @Override // g5.a
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (u.c<g5.a> cVar : this.f9497a.f(copyOf)) {
                    try {
                        byte[] b10 = cVar.f().b(copyOfRange, bArr2);
                        this.f9499c.b(cVar.c(), copyOfRange.length);
                        return b10;
                    } catch (GeneralSecurityException e10) {
                        Logger logger = b.f9496a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (u.c<g5.a> cVar2 : this.f9497a.h()) {
                try {
                    byte[] b11 = cVar2.f().b(bArr, bArr2);
                    this.f9499c.b(cVar2.c(), bArr.length);
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f9499c.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    b() {
    }

    public static void e() {
        w.m(new b());
    }

    @Override // g5.v
    public Class<g5.a> a() {
        return g5.a.class;
    }

    @Override // g5.v
    public Class<g5.a> c() {
        return g5.a.class;
    }

    @Override // g5.v
    /* renamed from: f */
    public g5.a b(u<g5.a> uVar) {
        return new C0152b(uVar);
    }
}
