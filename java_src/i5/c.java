package i5;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class c extends d {
    public c(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // i5.d
    public int[] b(int[] iArr, int i10) {
        if (iArr.length == e() / 4) {
            int[] iArr2 = new int[16];
            a.c(iArr2, this.f9718a);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // i5.d
    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.c(bArr, byteBuffer);
    }

    @Override // i5.d
    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.d(byteBuffer, bArr, bArr2);
    }

    @Override // i5.d
    public int e() {
        return 12;
    }
}
