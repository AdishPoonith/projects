package u5;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import l5.b;
/* loaded from: classes.dex */
public final class c implements g5.a {

    /* renamed from: b  reason: collision with root package name */
    public static final b.EnumC0195b f19084b = b.EnumC0195b.f13065k;

    /* renamed from: a  reason: collision with root package name */
    private final i5.b f19085a;

    public c(byte[] bArr) {
        if (!f19084b.b()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f19085a = new i5.b(bArr, true);
    }

    @Override // g5.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f19085a.b(p.c(12), bArr, bArr2);
    }

    @Override // g5.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f19085a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
