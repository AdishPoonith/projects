package u1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import u1.g;
/* loaded from: classes.dex */
public final class m0 implements g {

    /* renamed from: b  reason: collision with root package name */
    private int f18659b;

    /* renamed from: c  reason: collision with root package name */
    private float f18660c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f18661d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private g.a f18662e;

    /* renamed from: f  reason: collision with root package name */
    private g.a f18663f;

    /* renamed from: g  reason: collision with root package name */
    private g.a f18664g;

    /* renamed from: h  reason: collision with root package name */
    private g.a f18665h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f18666i;

    /* renamed from: j  reason: collision with root package name */
    private l0 f18667j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f18668k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f18669l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f18670m;

    /* renamed from: n  reason: collision with root package name */
    private long f18671n;

    /* renamed from: o  reason: collision with root package name */
    private long f18672o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f18673p;

    public m0() {
        g.a aVar = g.a.f18595e;
        this.f18662e = aVar;
        this.f18663f = aVar;
        this.f18664g = aVar;
        this.f18665h = aVar;
        ByteBuffer byteBuffer = g.f18594a;
        this.f18668k = byteBuffer;
        this.f18669l = byteBuffer.asShortBuffer();
        this.f18670m = byteBuffer;
        this.f18659b = -1;
    }

    @Override // u1.g
    public boolean a() {
        return this.f18663f.f18596a != -1 && (Math.abs(this.f18660c - 1.0f) >= 1.0E-4f || Math.abs(this.f18661d - 1.0f) >= 1.0E-4f || this.f18663f.f18596a != this.f18662e.f18596a);
    }

    @Override // u1.g
    public boolean b() {
        l0 l0Var;
        return this.f18673p && ((l0Var = this.f18667j) == null || l0Var.k() == 0);
    }

    @Override // u1.g
    public ByteBuffer c() {
        int k10;
        l0 l0Var = this.f18667j;
        if (l0Var != null && (k10 = l0Var.k()) > 0) {
            if (this.f18668k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f18668k = order;
                this.f18669l = order.asShortBuffer();
            } else {
                this.f18668k.clear();
                this.f18669l.clear();
            }
            l0Var.j(this.f18669l);
            this.f18672o += k10;
            this.f18668k.limit(k10);
            this.f18670m = this.f18668k;
        }
        ByteBuffer byteBuffer = this.f18670m;
        this.f18670m = g.f18594a;
        return byteBuffer;
    }

    @Override // u1.g
    public void d() {
        l0 l0Var = this.f18667j;
        if (l0Var != null) {
            l0Var.s();
        }
        this.f18673p = true;
    }

    @Override // u1.g
    public void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f18671n += remaining;
            ((l0) p3.a.e(this.f18667j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // u1.g
    public g.a f(g.a aVar) {
        if (aVar.f18598c == 2) {
            int i10 = this.f18659b;
            if (i10 == -1) {
                i10 = aVar.f18596a;
            }
            this.f18662e = aVar;
            g.a aVar2 = new g.a(i10, aVar.f18597b, 2);
            this.f18663f = aVar2;
            this.f18666i = true;
            return aVar2;
        }
        throw new g.b(aVar);
    }

    @Override // u1.g
    public void flush() {
        if (a()) {
            g.a aVar = this.f18662e;
            this.f18664g = aVar;
            g.a aVar2 = this.f18663f;
            this.f18665h = aVar2;
            if (this.f18666i) {
                this.f18667j = new l0(aVar.f18596a, aVar.f18597b, this.f18660c, this.f18661d, aVar2.f18596a);
            } else {
                l0 l0Var = this.f18667j;
                if (l0Var != null) {
                    l0Var.i();
                }
            }
        }
        this.f18670m = g.f18594a;
        this.f18671n = 0L;
        this.f18672o = 0L;
        this.f18673p = false;
    }

    public long g(long j10) {
        if (this.f18672o >= 1024) {
            long l10 = this.f18671n - ((l0) p3.a.e(this.f18667j)).l();
            int i10 = this.f18665h.f18596a;
            int i11 = this.f18664g.f18596a;
            return i10 == i11 ? p3.n0.N0(j10, l10, this.f18672o) : p3.n0.N0(j10, l10 * i10, this.f18672o * i11);
        }
        return (long) (this.f18660c * j10);
    }

    public void h(float f10) {
        if (this.f18661d != f10) {
            this.f18661d = f10;
            this.f18666i = true;
        }
    }

    public void i(float f10) {
        if (this.f18660c != f10) {
            this.f18660c = f10;
            this.f18666i = true;
        }
    }

    @Override // u1.g
    public void reset() {
        this.f18660c = 1.0f;
        this.f18661d = 1.0f;
        g.a aVar = g.a.f18595e;
        this.f18662e = aVar;
        this.f18663f = aVar;
        this.f18664g = aVar;
        this.f18665h = aVar;
        ByteBuffer byteBuffer = g.f18594a;
        this.f18668k = byteBuffer;
        this.f18669l = byteBuffer.asShortBuffer();
        this.f18670m = byteBuffer;
        this.f18659b = -1;
        this.f18666i = false;
        this.f18667j = null;
        this.f18671n = 0L;
        this.f18672o = 0L;
        this.f18673p = false;
    }
}
