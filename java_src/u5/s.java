package u5;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class s implements g5.a {

    /* renamed from: a  reason: collision with root package name */
    private final i5.h f19139a;

    public s(byte[] bArr) {
        this.f19139a = new i5.h(bArr);
    }

    @Override // g5.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 24 + 16);
        byte[] c10 = p.c(24);
        allocate.put(c10);
        this.f19139a.b(allocate, c10, bArr, bArr2);
        return allocate.array();
    }

    @Override // g5.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f19139a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
