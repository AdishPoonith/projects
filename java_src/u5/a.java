package u5;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l5.b;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final b.EnumC0195b f19072d = b.EnumC0195b.f13065k;

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f19073e = new C0273a();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKeySpec f19074a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19075b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19076c;

    /* renamed from: u5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0273a extends ThreadLocal<Cipher> {
        C0273a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return i.f19116e.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i10) {
        if (!f19072d.b()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f19074a = new SecretKeySpec(bArr, "AES");
        int blockSize = f19073e.get().getBlockSize();
        this.f19076c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f19075b = i10;
    }

    private void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) {
        Cipher cipher = f19073e.get();
        byte[] bArr4 = new byte[this.f19076c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f19075b);
        cipher.init(z10 ? 1 : 2, this.f19074a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // u5.l
    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f19075b;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f19075b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] c10 = p.c(i10);
        System.arraycopy(c10, 0, bArr2, 0, this.f19075b);
        c(bArr, 0, bArr.length, bArr2, this.f19075b, c10, true);
        return bArr2;
    }

    @Override // u5.l
    public byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f19075b;
        if (length >= i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            int length2 = bArr.length;
            int i11 = this.f19075b;
            byte[] bArr3 = new byte[length2 - i11];
            c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
