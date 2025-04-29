package h5;

import g5.w;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import t5.a0;
/* loaded from: classes.dex */
public final class j implements g5.a {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f9507c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final a0 f9508a;

    /* renamed from: b  reason: collision with root package name */
    private final g5.a f9509b;

    public j(a0 a0Var, g5.a aVar) {
        this.f9508a = a0Var;
        this.f9509b = aVar;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // g5.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] f10 = w.i(this.f9508a).f();
        return c(this.f9509b.a(f10, f9507c), ((g5.a) w.e(this.f9508a.T(), f10, g5.a.class)).a(bArr, bArr2));
    }

    @Override // g5.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((g5.a) w.e(this.f9508a.T(), this.f9509b.b(bArr3, f9507c), g5.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }
}
