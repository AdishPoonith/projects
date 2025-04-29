package u1;

import java.nio.ByteBuffer;
import u1.g;
/* loaded from: classes.dex */
final class f0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private static final int f18593i = Float.floatToIntBits(Float.NaN);

    private static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f18593i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // u1.g
    public void e(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f18746b.f18598c;
        if (i11 == 536870912) {
            l10 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l10);
                position += 3;
            }
        } else if (i11 != 805306368) {
            throw new IllegalStateException();
        } else {
            l10 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l10);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }

    @Override // u1.z
    public g.a h(g.a aVar) {
        int i10 = aVar.f18598c;
        if (p3.n0.s0(i10)) {
            return i10 != 4 ? new g.a(aVar.f18596a, aVar.f18597b, 4) : g.a.f18595e;
        }
        throw new g.b(aVar);
    }
}
