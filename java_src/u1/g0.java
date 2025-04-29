package u1;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import j2.l;
import java.nio.ByteBuffer;
import java.util.List;
import s1.b3;
import s1.l3;
import s1.m3;
import s1.n1;
import s1.o1;
import u1.t;
import u1.v;
/* loaded from: classes.dex */
public class g0 extends j2.o implements p3.t {
    private final Context M0;
    private final t.a N0;
    private final v O0;
    private int P0;
    private boolean Q0;
    private n1 R0;
    private n1 S0;
    private long T0;
    private boolean U0;
    private boolean V0;
    private boolean W0;
    private boolean X0;
    private l3.a Y0;

    /* loaded from: classes.dex */
    private static final class b {
        public static void a(v vVar, Object obj) {
            vVar.i((AudioDeviceInfo) obj);
        }
    }

    /* loaded from: classes.dex */
    private final class c implements v.c {
        private c() {
        }

        @Override // u1.v.c
        public void a(long j10) {
            g0.this.N0.B(j10);
        }

        @Override // u1.v.c
        public void b(boolean z10) {
            g0.this.N0.C(z10);
        }

        @Override // u1.v.c
        public void c(Exception exc) {
            p3.r.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            g0.this.N0.l(exc);
        }

        @Override // u1.v.c
        public void d() {
            g0.this.z1();
        }

        @Override // u1.v.c
        public void e() {
            if (g0.this.Y0 != null) {
                g0.this.Y0.a();
            }
        }

        @Override // u1.v.c
        public void f() {
            if (g0.this.Y0 != null) {
                g0.this.Y0.b();
            }
        }

        @Override // u1.v.c
        public void g(int i10, long j10, long j11) {
            g0.this.N0.D(i10, j10, j11);
        }
    }

    public g0(Context context, l.b bVar, j2.q qVar, boolean z10, Handler handler, t tVar, v vVar) {
        super(1, bVar, qVar, z10, 44100.0f);
        this.M0 = context.getApplicationContext();
        this.O0 = vVar;
        this.N0 = new t.a(handler, tVar);
        vVar.f(new c());
    }

    private void A1() {
        long q10 = this.O0.q(b());
        if (q10 != Long.MIN_VALUE) {
            if (!this.V0) {
                q10 = Math.max(this.T0, q10);
            }
            this.T0 = q10;
            this.V0 = false;
        }
    }

    private static boolean t1(String str) {
        if (p3.n0.f15397a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(p3.n0.f15399c)) {
            String str2 = p3.n0.f15398b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean u1() {
        if (p3.n0.f15397a == 23) {
            String str = p3.n0.f15400d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int v1(j2.n nVar, n1 n1Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f12031a) || (i10 = p3.n0.f15397a) >= 24 || (i10 == 23 && p3.n0.w0(this.M0))) {
            return n1Var.f17420v;
        }
        return -1;
    }

    private static List<j2.n> x1(j2.q qVar, n1 n1Var, boolean z10, v vVar) {
        j2.n v10;
        String str = n1Var.f17419u;
        if (str == null) {
            return com.google.common.collect.q.z();
        }
        if (!vVar.a(n1Var) || (v10 = j2.v.v()) == null) {
            List<j2.n> a10 = qVar.a(str, z10, false);
            String m10 = j2.v.m(n1Var);
            return m10 == null ? com.google.common.collect.q.v(a10) : com.google.common.collect.q.t().g(a10).g(qVar.a(m10, z10, false)).h();
        }
        return com.google.common.collect.q.A(v10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void H() {
        this.W0 = true;
        this.R0 = null;
        try {
            this.O0.flush();
            try {
                super.H();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.H();
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void I(boolean z10, boolean z11) {
        super.I(z10, z11);
        this.N0.p(this.H0);
        if (B().f17469a) {
            this.O0.h();
        } else {
            this.O0.s();
        }
        this.O0.n(E());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void J(long j10, boolean z10) {
        super.J(j10, z10);
        if (this.X0) {
            this.O0.v();
        } else {
            this.O0.flush();
        }
        this.T0 = j10;
        this.U0 = true;
        this.V0 = true;
    }

    @Override // j2.o
    protected void J0(Exception exc) {
        p3.r.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.N0.k(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void K() {
        try {
            super.K();
        } finally {
            if (this.W0) {
                this.W0 = false;
                this.O0.reset();
            }
        }
    }

    @Override // j2.o
    protected void K0(String str, l.a aVar, long j10, long j11) {
        this.N0.m(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void L() {
        super.L();
        this.O0.o();
    }

    @Override // j2.o
    protected void L0(String str) {
        this.N0.n(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void M() {
        A1();
        this.O0.d();
        super.M();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public v1.i M0(o1 o1Var) {
        this.R0 = (n1) p3.a.e(o1Var.f17464b);
        v1.i M0 = super.M0(o1Var);
        this.N0.q(this.R0, M0);
        return M0;
    }

    @Override // j2.o
    protected void N0(n1 n1Var, MediaFormat mediaFormat) {
        int i10;
        n1 n1Var2 = this.S0;
        int[] iArr = null;
        if (n1Var2 != null) {
            n1Var = n1Var2;
        } else if (p0() != null) {
            n1 G = new n1.b().g0("audio/raw").a0("audio/raw".equals(n1Var.f17419u) ? n1Var.J : (p3.n0.f15397a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? p3.n0.b0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).P(n1Var.K).Q(n1Var.L).J(mediaFormat.getInteger("channel-count")).h0(mediaFormat.getInteger("sample-rate")).G();
            if (this.Q0 && G.H == 6 && (i10 = n1Var.H) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < n1Var.H; i11++) {
                    iArr[i11] = i11;
                }
            }
            n1Var = G;
        }
        try {
            this.O0.m(n1Var, 0, iArr);
        } catch (v.a e10) {
            throw z(e10, e10.f18698j, 5001);
        }
    }

    @Override // j2.o
    protected void O0(long j10) {
        this.O0.u(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public void Q0() {
        super.Q0();
        this.O0.x();
    }

    @Override // j2.o
    protected void R0(v1.g gVar) {
        if (!this.U0 || gVar.q()) {
            return;
        }
        if (Math.abs(gVar.f19366n - this.T0) > 500000) {
            this.T0 = gVar.f19366n;
        }
        this.U0 = false;
    }

    @Override // j2.o
    protected v1.i T(j2.n nVar, n1 n1Var, n1 n1Var2) {
        v1.i f10 = nVar.f(n1Var, n1Var2);
        int i10 = f10.f19378e;
        if (v1(nVar, n1Var2) > this.P0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new v1.i(nVar.f12031a, n1Var, n1Var2, i11 != 0 ? 0 : f10.f19377d, i11);
    }

    @Override // j2.o
    protected boolean T0(long j10, long j11, j2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, n1 n1Var) {
        p3.a.e(byteBuffer);
        if (this.S0 != null && (i11 & 2) != 0) {
            ((j2.l) p3.a.e(lVar)).d(i10, false);
            return true;
        } else if (z10) {
            if (lVar != null) {
                lVar.d(i10, false);
            }
            this.H0.f19356f += i12;
            this.O0.x();
            return true;
        } else {
            try {
                if (this.O0.p(byteBuffer, j12, i12)) {
                    if (lVar != null) {
                        lVar.d(i10, false);
                    }
                    this.H0.f19355e += i12;
                    return true;
                }
                return false;
            } catch (v.b e10) {
                throw A(e10, this.R0, e10.f18700k, 5001);
            } catch (v.e e11) {
                throw A(e11, n1Var, e11.f18705k, 5002);
            }
        }
    }

    @Override // j2.o
    protected void Y0() {
        try {
            this.O0.j();
        } catch (v.e e10) {
            throw A(e10, e10.f18706l, e10.f18705k, 5002);
        }
    }

    @Override // j2.o, s1.l3
    public boolean b() {
        return super.b() && this.O0.b();
    }

    @Override // p3.t
    public void c(b3 b3Var) {
        this.O0.c(b3Var);
    }

    @Override // j2.o, s1.l3
    public boolean d() {
        return this.O0.k() || super.d();
    }

    @Override // s1.l3, s1.n3
    public String f() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p3.t
    public b3 g() {
        return this.O0.g();
    }

    @Override // j2.o
    protected boolean l1(n1 n1Var) {
        return this.O0.a(n1Var);
    }

    @Override // s1.f, s1.g3.b
    public void m(int i10, Object obj) {
        if (i10 == 2) {
            this.O0.e(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.O0.t((e) obj);
        } else if (i10 == 6) {
            this.O0.r((y) obj);
        } else {
            switch (i10) {
                case 9:
                    this.O0.w(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.O0.l(((Integer) obj).intValue());
                    return;
                case 11:
                    this.Y0 = (l3.a) obj;
                    return;
                case 12:
                    if (p3.n0.f15397a >= 23) {
                        b.a(this.O0, obj);
                        return;
                    }
                    return;
                default:
                    super.m(i10, obj);
                    return;
            }
        }
    }

    @Override // j2.o
    protected int m1(j2.q qVar, n1 n1Var) {
        boolean z10;
        if (p3.v.o(n1Var.f17419u)) {
            int i10 = p3.n0.f15397a >= 21 ? 32 : 0;
            boolean z11 = true;
            boolean z12 = n1Var.P != 0;
            boolean n12 = j2.o.n1(n1Var);
            int i11 = 8;
            if (n12 && this.O0.a(n1Var) && (!z12 || j2.v.v() != null)) {
                return m3.b(4, 8, i10);
            }
            if ((!"audio/raw".equals(n1Var.f17419u) || this.O0.a(n1Var)) && this.O0.a(p3.n0.c0(2, n1Var.H, n1Var.I))) {
                List<j2.n> x12 = x1(qVar, n1Var, false, this.O0);
                if (x12.isEmpty()) {
                    return m3.a(1);
                }
                if (n12) {
                    j2.n nVar = x12.get(0);
                    boolean o10 = nVar.o(n1Var);
                    if (!o10) {
                        for (int i12 = 1; i12 < x12.size(); i12++) {
                            j2.n nVar2 = x12.get(i12);
                            if (nVar2.o(n1Var)) {
                                nVar = nVar2;
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z11 = o10;
                    z10 = true;
                    int i13 = z11 ? 4 : 3;
                    if (z11 && nVar.r(n1Var)) {
                        i11 = 16;
                    }
                    return m3.c(i13, i11, i10, nVar.f12038h ? 64 : 0, z10 ? 128 : 0);
                }
                return m3.a(2);
            }
            return m3.a(1);
        }
        return m3.a(0);
    }

    @Override // j2.o
    protected float s0(float f10, n1 n1Var, n1[] n1VarArr) {
        int i10 = -1;
        for (n1 n1Var2 : n1VarArr) {
            int i11 = n1Var2.I;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    @Override // j2.o
    protected List<j2.n> u0(j2.q qVar, n1 n1Var, boolean z10) {
        return j2.v.u(x1(qVar, n1Var, z10, this.O0), n1Var);
    }

    @Override // s1.f, s1.l3
    public p3.t v() {
        return this;
    }

    @Override // j2.o
    protected l.a w0(j2.n nVar, n1 n1Var, MediaCrypto mediaCrypto, float f10) {
        this.P0 = w1(nVar, n1Var, F());
        this.Q0 = t1(nVar.f12031a);
        MediaFormat y12 = y1(n1Var, nVar.f12033c, this.P0, f10);
        this.S0 = "audio/raw".equals(nVar.f12032b) && !"audio/raw".equals(n1Var.f17419u) ? n1Var : null;
        return l.a.a(nVar, y12, n1Var, mediaCrypto);
    }

    protected int w1(j2.n nVar, n1 n1Var, n1[] n1VarArr) {
        int v12 = v1(nVar, n1Var);
        if (n1VarArr.length == 1) {
            return v12;
        }
        for (n1 n1Var2 : n1VarArr) {
            if (nVar.f(n1Var, n1Var2).f19377d != 0) {
                v12 = Math.max(v12, v1(nVar, n1Var2));
            }
        }
        return v12;
    }

    @Override // p3.t
    public long x() {
        if (getState() == 2) {
            A1();
        }
        return this.T0;
    }

    protected MediaFormat y1(n1 n1Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", n1Var.H);
        mediaFormat.setInteger("sample-rate", n1Var.I);
        p3.u.e(mediaFormat, n1Var.f17421w);
        p3.u.d(mediaFormat, "max-input-size", i10);
        int i11 = p3.n0.f15397a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !u1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(n1Var.f17419u)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.O0.y(p3.n0.c0(4, n1Var.H, n1Var.I)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    protected void z1() {
        this.V0 = true;
    }
}
