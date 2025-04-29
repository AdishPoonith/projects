package u5;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class h implements g5.a {

    /* renamed from: a  reason: collision with root package name */
    private final l f19110a;

    /* renamed from: b  reason: collision with root package name */
    private final g5.s f19111b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19112c;

    public h(l lVar, g5.s sVar, int i10) {
        this.f19110a = lVar;
        this.f19111b = sVar;
        this.f19112c = i10;
    }

    @Override // g5.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a10 = this.f19110a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(a10, this.f19111b.b(f.a(bArr2, a10, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // g5.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f19112c;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f19112c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f19111b.a(copyOfRange2, f.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.f19110a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
