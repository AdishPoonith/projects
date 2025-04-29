package u1;

import java.nio.ByteBuffer;
import u1.g;
/* loaded from: classes.dex */
final class n0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private int f18676i;

    /* renamed from: j  reason: collision with root package name */
    private int f18677j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f18678k;

    /* renamed from: l  reason: collision with root package name */
    private int f18679l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f18680m = p3.n0.f15402f;

    /* renamed from: n  reason: collision with root package name */
    private int f18681n;

    /* renamed from: o  reason: collision with root package name */
    private long f18682o;

    @Override // u1.z, u1.g
    public boolean b() {
        return super.b() && this.f18681n == 0;
    }

    @Override // u1.z, u1.g
    public ByteBuffer c() {
        int i10;
        if (super.b() && (i10 = this.f18681n) > 0) {
            l(i10).put(this.f18680m, 0, this.f18681n).flip();
            this.f18681n = 0;
        }
        return super.c();
    }

    @Override // u1.g
    public void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f18679l);
        this.f18682o += min / this.f18746b.f18599d;
        this.f18679l -= min;
        byteBuffer.position(position + min);
        if (this.f18679l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f18681n + i11) - this.f18680m.length;
        ByteBuffer l10 = l(length);
        int q10 = p3.n0.q(length, 0, this.f18681n);
        l10.put(this.f18680m, 0, q10);
        int q11 = p3.n0.q(length - q10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + q11);
        l10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - q11;
        int i13 = this.f18681n - q10;
        this.f18681n = i13;
        byte[] bArr = this.f18680m;
        System.arraycopy(bArr, q10, bArr, 0, i13);
        byteBuffer.get(this.f18680m, this.f18681n, i12);
        this.f18681n += i12;
        l10.flip();
    }

    @Override // u1.z
    public g.a h(g.a aVar) {
        if (aVar.f18598c == 2) {
            this.f18678k = true;
            return (this.f18676i == 0 && this.f18677j == 0) ? g.a.f18595e : aVar;
        }
        throw new g.b(aVar);
    }

    @Override // u1.z
    protected void i() {
        if (this.f18678k) {
            this.f18678k = false;
            int i10 = this.f18677j;
            int i11 = this.f18746b.f18599d;
            this.f18680m = new byte[i10 * i11];
            this.f18679l = this.f18676i * i11;
        }
        this.f18681n = 0;
    }

    @Override // u1.z
    protected void j() {
        int i10;
        if (this.f18678k) {
            if (this.f18681n > 0) {
                this.f18682o += i10 / this.f18746b.f18599d;
            }
            this.f18681n = 0;
        }
    }

    @Override // u1.z
    protected void k() {
        this.f18680m = p3.n0.f15402f;
    }

    public long m() {
        return this.f18682o;
    }

    public void n() {
        this.f18682o = 0L;
    }

    public void o(int i10, int i11) {
        this.f18676i = i10;
        this.f18677j = i11;
    }
}
