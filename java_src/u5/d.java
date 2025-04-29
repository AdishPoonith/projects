package u5;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l5.b;
/* loaded from: classes.dex */
public final class d implements g5.d {

    /* renamed from: c  reason: collision with root package name */
    public static final b.EnumC0195b f19086c = b.EnumC0195b.f13064j;

    /* renamed from: d  reason: collision with root package name */
    private static final Collection<Integer> f19087d = Arrays.asList(64);

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f19088e = new byte[16];

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f19089f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    private final m f19090a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f19091b;

    public d(byte[] bArr) {
        if (!f19086c.b()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (f19087d.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f19091b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f19090a = new m(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    private byte[] c(byte[]... bArr) {
        if (bArr.length == 0) {
            return this.f19090a.a(f19089f, 16);
        }
        byte[] a10 = this.f19090a.a(f19088e, 16);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            a10 = f.e(q5.a.b(a10), this.f19090a.a(bArr[i10] == null ? new byte[0] : bArr[i10], 16));
        }
        byte[] bArr2 = bArr[bArr.length - 1];
        return this.f19090a.a(bArr2.length >= 16 ? f.f(bArr2, a10) : f.e(q5.a.a(bArr2), q5.a.b(a10)), 16);
    }

    @Override // g5.d
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher a10 = i.f19116e.a("AES/CTR/NoPadding");
            byte[] c10 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c10.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a10.init(1, new SecretKeySpec(this.f19091b, "AES"), new IvParameterSpec(bArr3));
            return f.a(c10, a10.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // g5.d
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher a10 = i.f19116e.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a10.init(2, new SecretKeySpec(this.f19091b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a10.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && q.b()) {
                doFinal = new byte[0];
            }
            if (f.b(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
