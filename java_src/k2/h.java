package k2;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class h implements c {
    @Override // k2.c
    public final a a(e eVar) {
        ByteBuffer byteBuffer = (ByteBuffer) p3.a.e(eVar.f19364l);
        p3.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.q()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    protected abstract a b(e eVar, ByteBuffer byteBuffer);
}
