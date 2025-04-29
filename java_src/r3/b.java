package r3;

import java.nio.ByteBuffer;
import p3.a0;
import p3.n0;
import s1.f;
import s1.m3;
import s1.n1;
import v1.g;
/* loaded from: classes.dex */
public final class b extends f {
    private long A;

    /* renamed from: w  reason: collision with root package name */
    private final g f16674w;

    /* renamed from: x  reason: collision with root package name */
    private final a0 f16675x;

    /* renamed from: y  reason: collision with root package name */
    private long f16676y;

    /* renamed from: z  reason: collision with root package name */
    private a f16677z;

    public b() {
        super(6);
        this.f16674w = new g(1);
        this.f16675x = new a0();
    }

    private float[] R(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f16675x.R(byteBuffer.array(), byteBuffer.limit());
        this.f16675x.T(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f16675x.t());
        }
        return fArr;
    }

    private void S() {
        a aVar = this.f16677z;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // s1.f
    protected void H() {
        S();
    }

    @Override // s1.f
    protected void J(long j10, boolean z10) {
        this.A = Long.MIN_VALUE;
        S();
    }

    @Override // s1.f
    protected void N(n1[] n1VarArr, long j10, long j11) {
        this.f16676y = j11;
    }

    @Override // s1.n3
    public int a(n1 n1Var) {
        return m3.a("application/x-camera-motion".equals(n1Var.f17419u) ? 4 : 0);
    }

    @Override // s1.l3
    public boolean b() {
        return j();
    }

    @Override // s1.l3
    public boolean d() {
        return true;
    }

    @Override // s1.l3, s1.n3
    public String f() {
        return "CameraMotionRenderer";
    }

    @Override // s1.l3
    public void l(long j10, long j11) {
        while (!j() && this.A < 100000 + j10) {
            this.f16674w.l();
            if (O(C(), this.f16674w, 0) != -4 || this.f16674w.r()) {
                return;
            }
            g gVar = this.f16674w;
            this.A = gVar.f19366n;
            if (this.f16677z != null && !gVar.q()) {
                this.f16674w.y();
                float[] R = R((ByteBuffer) n0.j(this.f16674w.f19364l));
                if (R != null) {
                    ((a) n0.j(this.f16677z)).a(this.A - this.f16676y, R);
                }
            }
        }
    }

    @Override // s1.f, s1.g3.b
    public void m(int i10, Object obj) {
        if (i10 == 8) {
            this.f16677z = (a) obj;
        } else {
            super.m(i10, obj);
        }
    }
}
