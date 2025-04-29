package i5;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l5.b;
import u5.q;
import u5.r;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final b.EnumC0195b f9714c = b.EnumC0195b.f13065k;

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f9715d = new a();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f9716a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9717b;

    /* loaded from: classes.dex */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return u5.i.f19116e.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr, boolean z10) {
        if (!f9714c.b()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f9716a = new SecretKeySpec(bArr, "AES");
        this.f9717b = z10;
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i10, int i11) {
        return (!q.b() || q.a() > 19) ? new GCMParameterSpec(128, bArr, i10, i11) : new IvParameterSpec(bArr, i10, i11);
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 12) {
            boolean z10 = this.f9717b;
            if (bArr2.length >= (z10 ? 28 : 16)) {
                if (!z10 || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    AlgorithmParameterSpec c10 = c(bArr);
                    ThreadLocal<Cipher> threadLocal = f9715d;
                    threadLocal.get().init(2, this.f9716a, c10);
                    if (bArr3 != null && bArr3.length != 0) {
                        threadLocal.get().updateAAD(bArr3);
                    }
                    boolean z11 = this.f9717b;
                    return threadLocal.get().doFinal(bArr2, z11 ? 12 : 0, z11 ? bArr2.length - 12 : bArr2.length);
                }
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 12) {
            if (bArr2.length <= 2147483619) {
                boolean z10 = this.f9717b;
                int length = bArr2.length;
                if (z10) {
                    length += 12;
                }
                byte[] bArr4 = new byte[length + 16];
                if (z10) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec c10 = c(bArr);
                ThreadLocal<Cipher> threadLocal = f9715d;
                threadLocal.get().init(1, this.f9716a, c10);
                if (bArr3 != null && bArr3.length != 0) {
                    threadLocal.get().updateAAD(bArr3);
                }
                int doFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, this.f9717b ? 12 : 0);
                if (doFinal == bArr2.length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
