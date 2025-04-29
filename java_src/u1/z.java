package u1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import u1.g;
/* loaded from: classes.dex */
public abstract class z implements g {

    /* renamed from: b  reason: collision with root package name */
    protected g.a f18746b;

    /* renamed from: c  reason: collision with root package name */
    protected g.a f18747c;

    /* renamed from: d  reason: collision with root package name */
    private g.a f18748d;

    /* renamed from: e  reason: collision with root package name */
    private g.a f18749e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f18750f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f18751g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18752h;

    public z() {
        ByteBuffer byteBuffer = g.f18594a;
        this.f18750f = byteBuffer;
        this.f18751g = byteBuffer;
        g.a aVar = g.a.f18595e;
        this.f18748d = aVar;
        this.f18749e = aVar;
        this.f18746b = aVar;
        this.f18747c = aVar;
    }

    @Override // u1.g
    public boolean a() {
        return this.f18749e != g.a.f18595e;
    }

    @Override // u1.g
    public boolean b() {
        return this.f18752h && this.f18751g == g.f18594a;
    }

    @Override // u1.g
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f18751g;
        this.f18751g = g.f18594a;
        return byteBuffer;
    }

    @Override // u1.g
    public final void d() {
        this.f18752h = true;
        j();
    }

    @Override // u1.g
    public final g.a f(g.a aVar) {
        this.f18748d = aVar;
        this.f18749e = h(aVar);
        return a() ? this.f18749e : g.a.f18595e;
    }

    @Override // u1.g
    public final void flush() {
        this.f18751g = g.f18594a;
        this.f18752h = false;
        this.f18746b = this.f18748d;
        this.f18747c = this.f18749e;
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g() {
        return this.f18751g.hasRemaining();
    }

    protected abstract g.a h(g.a aVar);

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer l(int i10) {
        if (this.f18750f.capacity() < i10) {
            this.f18750f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f18750f.clear();
        }
        ByteBuffer byteBuffer = this.f18750f;
        this.f18751g = byteBuffer;
        return byteBuffer;
    }

    @Override // u1.g
    public final void reset() {
        flush();
        this.f18750f = g.f18594a;
        g.a aVar = g.a.f18595e;
        this.f18748d = aVar;
        this.f18749e = aVar;
        this.f18746b = aVar;
        this.f18747c = aVar;
        k();
    }
}
