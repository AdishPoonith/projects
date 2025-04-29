package j2;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
final class h extends v1.g {

    /* renamed from: r  reason: collision with root package name */
    private long f12010r;

    /* renamed from: s  reason: collision with root package name */
    private int f12011s;

    /* renamed from: t  reason: collision with root package name */
    private int f12012t;

    public h() {
        super(2);
        this.f12012t = 32;
    }

    private boolean D(v1.g gVar) {
        ByteBuffer byteBuffer;
        if (H()) {
            if (this.f12011s < this.f12012t && gVar.q() == q()) {
                ByteBuffer byteBuffer2 = gVar.f19364l;
                return byteBuffer2 == null || (byteBuffer = this.f19364l) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
            }
            return false;
        }
        return true;
    }

    public boolean C(v1.g gVar) {
        p3.a.a(!gVar.z());
        p3.a.a(!gVar.p());
        p3.a.a(!gVar.r());
        if (D(gVar)) {
            int i10 = this.f12011s;
            this.f12011s = i10 + 1;
            if (i10 == 0) {
                this.f19366n = gVar.f19366n;
                if (gVar.t()) {
                    v(1);
                }
            }
            if (gVar.q()) {
                v(Integer.MIN_VALUE);
            }
            ByteBuffer byteBuffer = gVar.f19364l;
            if (byteBuffer != null) {
                x(byteBuffer.remaining());
                this.f19364l.put(byteBuffer);
            }
            this.f12010r = gVar.f19366n;
            return true;
        }
        return false;
    }

    public long E() {
        return this.f19366n;
    }

    public long F() {
        return this.f12010r;
    }

    public int G() {
        return this.f12011s;
    }

    public boolean H() {
        return this.f12011s > 0;
    }

    public void I(int i10) {
        p3.a.a(i10 > 0);
        this.f12012t = i10;
    }

    @Override // v1.g, v1.a
    public void l() {
        super.l();
        this.f12011s = 0;
    }
}
