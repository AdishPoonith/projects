package u1;

import java.nio.ByteBuffer;
import u1.g;
/* loaded from: classes.dex */
public final class k0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private final long f18621i;

    /* renamed from: j  reason: collision with root package name */
    private final long f18622j;

    /* renamed from: k  reason: collision with root package name */
    private final short f18623k;

    /* renamed from: l  reason: collision with root package name */
    private int f18624l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f18625m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f18626n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f18627o;

    /* renamed from: p  reason: collision with root package name */
    private int f18628p;

    /* renamed from: q  reason: collision with root package name */
    private int f18629q;

    /* renamed from: r  reason: collision with root package name */
    private int f18630r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f18631s;

    /* renamed from: t  reason: collision with root package name */
    private long f18632t;

    public k0() {
        this(150000L, 20000L, (short) 1024);
    }

    public k0(long j10, long j11, short s10) {
        p3.a.a(j11 <= j10);
        this.f18621i = j10;
        this.f18622j = j11;
        this.f18623k = s10;
        byte[] bArr = p3.n0.f15402f;
        this.f18626n = bArr;
        this.f18627o = bArr;
    }

    private int m(long j10) {
        return (int) ((j10 * this.f18746b.f18596a) / 1000000);
    }

    private int n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs((int) byteBuffer.getShort(limit)) > this.f18623k) {
                int i10 = this.f18624l;
                return ((limit / i10) * i10) + i10;
            }
        }
    }

    private int o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f18623k) {
                int i10 = this.f18624l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f18631s = true;
        }
    }

    private void r(byte[] bArr, int i10) {
        l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f18631s = true;
        }
    }

    private void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o10 = o(byteBuffer);
        int position = o10 - byteBuffer.position();
        byte[] bArr = this.f18626n;
        int length = bArr.length;
        int i10 = this.f18629q;
        int i11 = length - i10;
        if (o10 < limit && position < i11) {
            r(bArr, i10);
            this.f18629q = 0;
            this.f18628p = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f18626n, this.f18629q, min);
        int i12 = this.f18629q + min;
        this.f18629q = i12;
        byte[] bArr2 = this.f18626n;
        if (i12 == bArr2.length) {
            if (this.f18631s) {
                r(bArr2, this.f18630r);
                this.f18632t += (this.f18629q - (this.f18630r * 2)) / this.f18624l;
            } else {
                this.f18632t += (i12 - this.f18630r) / this.f18624l;
            }
            w(byteBuffer, this.f18626n, this.f18629q);
            this.f18629q = 0;
            this.f18628p = 2;
        }
        byteBuffer.limit(limit);
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f18626n.length));
        int n10 = n(byteBuffer);
        if (n10 == byteBuffer.position()) {
            this.f18628p = 1;
        } else {
            byteBuffer.limit(n10);
            q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o10 = o(byteBuffer);
        byteBuffer.limit(o10);
        this.f18632t += byteBuffer.remaining() / this.f18624l;
        w(byteBuffer, this.f18627o, this.f18630r);
        if (o10 < limit) {
            r(this.f18627o, this.f18630r);
            this.f18628p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void w(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f18630r);
        int i11 = this.f18630r - min;
        System.arraycopy(bArr, i10 - i11, this.f18627o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f18627o, i11, min);
    }

    @Override // u1.z, u1.g
    public boolean a() {
        return this.f18625m;
    }

    @Override // u1.g
    public void e(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f18628p;
            if (i10 == 0) {
                t(byteBuffer);
            } else if (i10 == 1) {
                s(byteBuffer);
            } else if (i10 != 2) {
                throw new IllegalStateException();
            } else {
                u(byteBuffer);
            }
        }
    }

    @Override // u1.z
    public g.a h(g.a aVar) {
        if (aVar.f18598c == 2) {
            return this.f18625m ? aVar : g.a.f18595e;
        }
        throw new g.b(aVar);
    }

    @Override // u1.z
    protected void i() {
        if (this.f18625m) {
            this.f18624l = this.f18746b.f18599d;
            int m10 = m(this.f18621i) * this.f18624l;
            if (this.f18626n.length != m10) {
                this.f18626n = new byte[m10];
            }
            int m11 = m(this.f18622j) * this.f18624l;
            this.f18630r = m11;
            if (this.f18627o.length != m11) {
                this.f18627o = new byte[m11];
            }
        }
        this.f18628p = 0;
        this.f18632t = 0L;
        this.f18629q = 0;
        this.f18631s = false;
    }

    @Override // u1.z
    protected void j() {
        int i10 = this.f18629q;
        if (i10 > 0) {
            r(this.f18626n, i10);
        }
        if (this.f18631s) {
            return;
        }
        this.f18632t += this.f18630r / this.f18624l;
    }

    @Override // u1.z
    protected void k() {
        this.f18625m = false;
        this.f18630r = 0;
        byte[] bArr = p3.n0.f15402f;
        this.f18626n = bArr;
        this.f18627o = bArr;
    }

    public long p() {
        return this.f18632t;
    }

    public void v(boolean z10) {
        this.f18625m = z10;
    }
}
