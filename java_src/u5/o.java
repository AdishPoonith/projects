package u5;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* loaded from: classes.dex */
public class o implements g5.s {

    /* renamed from: a  reason: collision with root package name */
    private final s5.a f19134a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19135b;

    public o(s5.a aVar, int i10) {
        this.f19134a = aVar;
        this.f19135b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i10);
    }

    @Override // g5.s
    public void a(byte[] bArr, byte[] bArr2) {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // g5.s
    public byte[] b(byte[] bArr) {
        return this.f19134a.a(bArr, this.f19135b);
    }
}
