package u1;

import java.nio.ByteBuffer;
import u1.g;
/* loaded from: classes.dex */
final class a0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private int[] f18461i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f18462j;

    @Override // u1.g
    public void e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) p3.a.e(this.f18462j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f18746b.f18599d) * this.f18747c.f18599d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f18746b.f18599d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override // u1.z
    public g.a h(g.a aVar) {
        int[] iArr = this.f18461i;
        if (iArr == null) {
            return g.a.f18595e;
        }
        if (aVar.f18598c == 2) {
            boolean z10 = aVar.f18597b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 >= aVar.f18597b) {
                    throw new g.b(aVar);
                }
                z10 |= i11 != i10;
                i10++;
            }
            return z10 ? new g.a(aVar.f18596a, iArr.length, 2) : g.a.f18595e;
        }
        throw new g.b(aVar);
    }

    @Override // u1.z
    protected void i() {
        this.f18462j = this.f18461i;
    }

    @Override // u1.z
    protected void k() {
        this.f18462j = null;
        this.f18461i = null;
    }

    public void m(int[] iArr) {
        this.f18461i = iArr;
    }
}
