package q3;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import j2.l;
import j2.v;
import java.nio.ByteBuffer;
import java.util.List;
import p3.k0;
import p3.n0;
import q3.x;
import s1.m3;
import s1.n1;
import s1.o1;
/* loaded from: classes.dex */
public class h extends j2.o {

    /* renamed from: w1  reason: collision with root package name */
    private static final int[] f16061w1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: x1  reason: collision with root package name */
    private static boolean f16062x1;

    /* renamed from: y1  reason: collision with root package name */
    private static boolean f16063y1;
    private final Context M0;
    private final l N0;
    private final x.a O0;
    private final long P0;
    private final int Q0;
    private final boolean R0;
    private b S0;
    private boolean T0;
    private boolean U0;
    private Surface V0;
    private i W0;
    private boolean X0;
    private int Y0;
    private boolean Z0;

    /* renamed from: a1  reason: collision with root package name */
    private boolean f16064a1;

    /* renamed from: b1  reason: collision with root package name */
    private boolean f16065b1;

    /* renamed from: c1  reason: collision with root package name */
    private long f16066c1;

    /* renamed from: d1  reason: collision with root package name */
    private long f16067d1;

    /* renamed from: e1  reason: collision with root package name */
    private long f16068e1;

    /* renamed from: f1  reason: collision with root package name */
    private int f16069f1;

    /* renamed from: g1  reason: collision with root package name */
    private int f16070g1;

    /* renamed from: h1  reason: collision with root package name */
    private int f16071h1;

    /* renamed from: i1  reason: collision with root package name */
    private long f16072i1;

    /* renamed from: j1  reason: collision with root package name */
    private long f16073j1;

    /* renamed from: k1  reason: collision with root package name */
    private long f16074k1;

    /* renamed from: l1  reason: collision with root package name */
    private int f16075l1;

    /* renamed from: m1  reason: collision with root package name */
    private long f16076m1;

    /* renamed from: n1  reason: collision with root package name */
    private int f16077n1;

    /* renamed from: o1  reason: collision with root package name */
    private int f16078o1;

    /* renamed from: p1  reason: collision with root package name */
    private int f16079p1;

    /* renamed from: q1  reason: collision with root package name */
    private float f16080q1;

    /* renamed from: r1  reason: collision with root package name */
    private z f16081r1;

    /* renamed from: s1  reason: collision with root package name */
    private boolean f16082s1;

    /* renamed from: t1  reason: collision with root package name */
    private int f16083t1;

    /* renamed from: u1  reason: collision with root package name */
    c f16084u1;

    /* renamed from: v1  reason: collision with root package name */
    private j f16085v1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f16086a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16087b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16088c;

        public b(int i10, int i11, int i12) {
            this.f16086a = i10;
            this.f16087b = i11;
            this.f16088c = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements l.c, Handler.Callback {

        /* renamed from: j  reason: collision with root package name */
        private final Handler f16089j;

        public c(j2.l lVar) {
            Handler x10 = n0.x(this);
            this.f16089j = x10;
            lVar.j(this, x10);
        }

        private void b(long j10) {
            h hVar = h.this;
            if (this != hVar.f16084u1 || hVar.p0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                h.this.T1();
                return;
            }
            try {
                h.this.S1(j10);
            } catch (s1.q e10) {
                h.this.g1(e10);
            }
        }

        @Override // j2.l.c
        public void a(j2.l lVar, long j10, long j11) {
            if (n0.f15397a >= 30) {
                b(j10);
                return;
            }
            this.f16089j.sendMessageAtFrontOfQueue(Message.obtain(this.f16089j, 0, (int) (j10 >> 32), (int) j10));
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(n0.V0(message.arg1, message.arg2));
            return true;
        }
    }

    public h(Context context, l.b bVar, j2.q qVar, long j10, boolean z10, Handler handler, x xVar, int i10) {
        this(context, bVar, qVar, j10, z10, handler, xVar, i10, 30.0f);
    }

    public h(Context context, l.b bVar, j2.q qVar, long j10, boolean z10, Handler handler, x xVar, int i10, float f10) {
        super(2, bVar, qVar, z10, f10);
        this.P0 = j10;
        this.Q0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.M0 = applicationContext;
        this.N0 = new l(applicationContext);
        this.O0 = new x.a(handler, xVar);
        this.R0 = y1();
        this.f16067d1 = -9223372036854775807L;
        this.f16077n1 = -1;
        this.f16078o1 = -1;
        this.f16080q1 = -1.0f;
        this.Y0 = 1;
        this.f16083t1 = 0;
        v1();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0723, code lost:
        if (r0.equals("ELUGA_Ray_X") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean A1() {
        /*
            Method dump skipped, instructions count: 3184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.h.A1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
        if (r3.equals("video/av01") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int B1(j2.n r9, s1.n1 r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.h.B1(j2.n, s1.n1):int");
    }

    private static Point C1(j2.n nVar, n1 n1Var) {
        int[] iArr;
        int i10 = n1Var.A;
        int i11 = n1Var.f17424z;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f16061w1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (n0.f15397a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point c10 = nVar.c(i15, i13);
                if (nVar.w(c10.x, c10.y, n1Var.B)) {
                    return c10;
                }
            } else {
                try {
                    int l10 = n0.l(i13, 16) * 16;
                    int l11 = n0.l(i14, 16) * 16;
                    if (l10 * l11 <= j2.v.N()) {
                        int i16 = z10 ? l11 : l10;
                        if (!z10) {
                            l10 = l11;
                        }
                        return new Point(i16, l10);
                    }
                } catch (v.c unused) {
                }
            }
        }
        return null;
    }

    private static List<j2.n> E1(Context context, j2.q qVar, n1 n1Var, boolean z10, boolean z11) {
        String str = n1Var.f17419u;
        if (str == null) {
            return com.google.common.collect.q.z();
        }
        List<j2.n> a10 = qVar.a(str, z10, z11);
        String m10 = j2.v.m(n1Var);
        if (m10 == null) {
            return com.google.common.collect.q.v(a10);
        }
        List<j2.n> a11 = qVar.a(m10, z10, z11);
        return (n0.f15397a < 26 || !"video/dolby-vision".equals(n1Var.f17419u) || a11.isEmpty() || a.a(context)) ? com.google.common.collect.q.t().g(a10).g(a11).h() : com.google.common.collect.q.v(a11);
    }

    protected static int F1(j2.n nVar, n1 n1Var) {
        if (n1Var.f17420v != -1) {
            int size = n1Var.f17421w.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += n1Var.f17421w.get(i11).length;
            }
            return n1Var.f17420v + i10;
        }
        return B1(nVar, n1Var);
    }

    private static int G1(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private static boolean I1(long j10) {
        return j10 < -30000;
    }

    private static boolean J1(long j10) {
        return j10 < -500000;
    }

    private void L1() {
        if (this.f16069f1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.O0.n(this.f16069f1, elapsedRealtime - this.f16068e1);
            this.f16069f1 = 0;
            this.f16068e1 = elapsedRealtime;
        }
    }

    private void N1() {
        int i10 = this.f16075l1;
        if (i10 != 0) {
            this.O0.B(this.f16074k1, i10);
            this.f16074k1 = 0L;
            this.f16075l1 = 0;
        }
    }

    private void O1() {
        int i10 = this.f16077n1;
        if (i10 == -1 && this.f16078o1 == -1) {
            return;
        }
        z zVar = this.f16081r1;
        if (zVar != null && zVar.f16163j == i10 && zVar.f16164k == this.f16078o1 && zVar.f16165l == this.f16079p1 && zVar.f16166m == this.f16080q1) {
            return;
        }
        z zVar2 = new z(this.f16077n1, this.f16078o1, this.f16079p1, this.f16080q1);
        this.f16081r1 = zVar2;
        this.O0.D(zVar2);
    }

    private void P1() {
        if (this.X0) {
            this.O0.A(this.V0);
        }
    }

    private void Q1() {
        z zVar = this.f16081r1;
        if (zVar != null) {
            this.O0.D(zVar);
        }
    }

    private void R1(long j10, long j11, n1 n1Var) {
        j jVar = this.f16085v1;
        if (jVar != null) {
            jVar.g(j10, j11, n1Var, t0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T1() {
        f1();
    }

    private void U1() {
        Surface surface = this.V0;
        i iVar = this.W0;
        if (surface == iVar) {
            this.V0 = null;
        }
        iVar.release();
        this.W0 = null;
    }

    private static void X1(j2.l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.l(bundle);
    }

    private void Y1() {
        this.f16067d1 = this.P0 > 0 ? SystemClock.elapsedRealtime() + this.P0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [s1.f, q3.h, j2.o] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void Z1(Object obj) {
        i iVar = obj instanceof Surface ? (Surface) obj : null;
        if (iVar == null) {
            i iVar2 = this.W0;
            if (iVar2 != null) {
                iVar = iVar2;
            } else {
                j2.n q02 = q0();
                if (q02 != null && e2(q02)) {
                    iVar = i.c(this.M0, q02.f12037g);
                    this.W0 = iVar;
                }
            }
        }
        if (this.V0 == iVar) {
            if (iVar == null || iVar == this.W0) {
                return;
            }
            Q1();
            P1();
            return;
        }
        this.V0 = iVar;
        this.N0.m(iVar);
        this.X0 = false;
        int state = getState();
        j2.l p02 = p0();
        if (p02 != null) {
            if (n0.f15397a < 23 || iVar == null || this.T0) {
                X0();
                H0();
            } else {
                a2(p02, iVar);
            }
        }
        if (iVar == null || iVar == this.W0) {
            v1();
            u1();
            return;
        }
        Q1();
        u1();
        if (state == 2) {
            Y1();
        }
    }

    private boolean e2(j2.n nVar) {
        return n0.f15397a >= 23 && !this.f16082s1 && !w1(nVar.f12031a) && (!nVar.f12037g || i.b(this.M0));
    }

    private void u1() {
        j2.l p02;
        this.Z0 = false;
        if (n0.f15397a < 23 || !this.f16082s1 || (p02 = p0()) == null) {
            return;
        }
        this.f16084u1 = new c(p02);
    }

    private void v1() {
        this.f16081r1 = null;
    }

    private static void x1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean y1() {
        return "NVIDIA".equals(n0.f15399c);
    }

    protected b D1(j2.n nVar, n1 n1Var, n1[] n1VarArr) {
        int B1;
        int i10 = n1Var.f17424z;
        int i11 = n1Var.A;
        int F1 = F1(nVar, n1Var);
        if (n1VarArr.length == 1) {
            if (F1 != -1 && (B1 = B1(nVar, n1Var)) != -1) {
                F1 = Math.min((int) (F1 * 1.5f), B1);
            }
            return new b(i10, i11, F1);
        }
        int length = n1VarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            n1 n1Var2 = n1VarArr[i12];
            if (n1Var.G != null && n1Var2.G == null) {
                n1Var2 = n1Var2.b().L(n1Var.G).G();
            }
            if (nVar.f(n1Var, n1Var2).f19377d != 0) {
                int i13 = n1Var2.f17424z;
                z10 |= i13 == -1 || n1Var2.A == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, n1Var2.A);
                F1 = Math.max(F1, F1(nVar, n1Var2));
            }
        }
        if (z10) {
            p3.r.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point C1 = C1(nVar, n1Var);
            if (C1 != null) {
                i10 = Math.max(i10, C1.x);
                i11 = Math.max(i11, C1.y);
                F1 = Math.max(F1, B1(nVar, n1Var.b().n0(i10).S(i11).G()));
                p3.r.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new b(i10, i11, F1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void H() {
        v1();
        u1();
        this.X0 = false;
        this.f16084u1 = null;
        try {
            super.H();
        } finally {
            this.O0.m(this.H0);
        }
    }

    protected MediaFormat H1(n1 n1Var, String str, b bVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> q10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", n1Var.f17424z);
        mediaFormat.setInteger("height", n1Var.A);
        p3.u.e(mediaFormat, n1Var.f17421w);
        p3.u.c(mediaFormat, "frame-rate", n1Var.B);
        p3.u.d(mediaFormat, "rotation-degrees", n1Var.C);
        p3.u.b(mediaFormat, n1Var.G);
        if ("video/dolby-vision".equals(n1Var.f17419u) && (q10 = j2.v.q(n1Var)) != null) {
            p3.u.d(mediaFormat, "profile", ((Integer) q10.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f16086a);
        mediaFormat.setInteger("max-height", bVar.f16087b);
        p3.u.d(mediaFormat, "max-input-size", bVar.f16088c);
        if (n0.f15397a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            x1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void I(boolean z10, boolean z11) {
        super.I(z10, z11);
        boolean z12 = B().f17469a;
        p3.a.f((z12 && this.f16083t1 == 0) ? false : true);
        if (this.f16082s1 != z12) {
            this.f16082s1 = z12;
            X0();
        }
        this.O0.o(this.H0);
        this.f16064a1 = z11;
        this.f16065b1 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void J(long j10, boolean z10) {
        super.J(j10, z10);
        u1();
        this.N0.j();
        this.f16072i1 = -9223372036854775807L;
        this.f16066c1 = -9223372036854775807L;
        this.f16070g1 = 0;
        if (z10) {
            Y1();
        } else {
            this.f16067d1 = -9223372036854775807L;
        }
    }

    @Override // j2.o
    protected void J0(Exception exc) {
        p3.r.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.O0.C(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void K() {
        try {
            super.K();
        } finally {
            if (this.W0 != null) {
                U1();
            }
        }
    }

    @Override // j2.o
    protected void K0(String str, l.a aVar, long j10, long j11) {
        this.O0.k(str, j10, j11);
        this.T0 = w1(str);
        this.U0 = ((j2.n) p3.a.e(q0())).p();
        if (n0.f15397a < 23 || !this.f16082s1) {
            return;
        }
        this.f16084u1 = new c((j2.l) p3.a.e(p0()));
    }

    protected boolean K1(long j10, boolean z10) {
        int Q = Q(j10);
        if (Q == 0) {
            return false;
        }
        if (z10) {
            v1.e eVar = this.H0;
            eVar.f19354d += Q;
            eVar.f19356f += this.f16071h1;
        } else {
            this.H0.f19360j++;
            g2(Q, this.f16071h1);
        }
        m0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void L() {
        super.L();
        this.f16069f1 = 0;
        this.f16068e1 = SystemClock.elapsedRealtime();
        this.f16073j1 = SystemClock.elapsedRealtime() * 1000;
        this.f16074k1 = 0L;
        this.f16075l1 = 0;
        this.N0.k();
    }

    @Override // j2.o
    protected void L0(String str) {
        this.O0.l(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o, s1.f
    public void M() {
        this.f16067d1 = -9223372036854775807L;
        L1();
        N1();
        this.N0.l();
        super.M();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public v1.i M0(o1 o1Var) {
        v1.i M0 = super.M0(o1Var);
        this.O0.p(o1Var.f17464b, M0);
        return M0;
    }

    void M1() {
        this.f16065b1 = true;
        if (this.Z0) {
            return;
        }
        this.Z0 = true;
        this.O0.A(this.V0);
        this.X0 = true;
    }

    @Override // j2.o
    protected void N0(n1 n1Var, MediaFormat mediaFormat) {
        j2.l p02 = p0();
        if (p02 != null) {
            p02.f(this.Y0);
        }
        if (this.f16082s1) {
            this.f16077n1 = n1Var.f17424z;
            this.f16078o1 = n1Var.A;
        } else {
            p3.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f16077n1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f16078o1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = n1Var.D;
        this.f16080q1 = f10;
        if (n0.f15397a >= 21) {
            int i10 = n1Var.C;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f16077n1;
                this.f16077n1 = this.f16078o1;
                this.f16078o1 = i11;
                this.f16080q1 = 1.0f / f10;
            }
        } else {
            this.f16079p1 = n1Var.C;
        }
        this.N0.g(n1Var.B);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public void P0(long j10) {
        super.P0(j10);
        if (this.f16082s1) {
            return;
        }
        this.f16071h1--;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public void Q0() {
        super.Q0();
        u1();
    }

    @Override // j2.o
    protected void R0(v1.g gVar) {
        boolean z10 = this.f16082s1;
        if (!z10) {
            this.f16071h1++;
        }
        if (n0.f15397a >= 23 || !z10) {
            return;
        }
        S1(gVar.f19366n);
    }

    protected void S1(long j10) {
        q1(j10);
        O1();
        this.H0.f19355e++;
        M1();
        P0(j10);
    }

    @Override // j2.o
    protected v1.i T(j2.n nVar, n1 n1Var, n1 n1Var2) {
        v1.i f10 = nVar.f(n1Var, n1Var2);
        int i10 = f10.f19378e;
        int i11 = n1Var2.f17424z;
        b bVar = this.S0;
        if (i11 > bVar.f16086a || n1Var2.A > bVar.f16087b) {
            i10 |= 256;
        }
        if (F1(nVar, n1Var2) > this.S0.f16088c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new v1.i(nVar.f12031a, n1Var, n1Var2, i12 != 0 ? 0 : f10.f19377d, i12);
    }

    @Override // j2.o
    protected boolean T0(long j10, long j11, j2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, n1 n1Var) {
        long j13;
        boolean z12;
        p3.a.e(lVar);
        if (this.f16066c1 == -9223372036854775807L) {
            this.f16066c1 = j10;
        }
        if (j12 != this.f16072i1) {
            this.N0.h(j12);
            this.f16072i1 = j12;
        }
        long x02 = x0();
        long j14 = j12 - x02;
        if (z10 && !z11) {
            f2(lVar, i10, j14);
            return true;
        }
        double y02 = y0();
        boolean z13 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = (long) ((j12 - j10) / y02);
        if (z13) {
            j15 -= elapsedRealtime - j11;
        }
        if (this.V0 == this.W0) {
            if (I1(j15)) {
                f2(lVar, i10, j14);
                h2(j15);
                return true;
            }
            return false;
        }
        long j16 = elapsedRealtime - this.f16073j1;
        if (this.f16065b1 ? this.Z0 : !(z13 || this.f16064a1)) {
            j13 = j16;
            z12 = false;
        } else {
            j13 = j16;
            z12 = true;
        }
        if (!(this.f16067d1 == -9223372036854775807L && j10 >= x02 && (z12 || (z13 && d2(j15, j13))))) {
            if (z13 && j10 != this.f16066c1) {
                long nanoTime = System.nanoTime();
                long b10 = this.N0.b((j15 * 1000) + nanoTime);
                long j17 = (b10 - nanoTime) / 1000;
                boolean z14 = this.f16067d1 != -9223372036854775807L;
                if (b2(j17, j11, z11) && K1(j10, z14)) {
                    return false;
                }
                if (c2(j17, j11, z11)) {
                    if (z14) {
                        f2(lVar, i10, j14);
                    } else {
                        z1(lVar, i10, j14);
                    }
                    j15 = j17;
                } else {
                    j15 = j17;
                    if (n0.f15397a >= 21) {
                        if (j15 < 50000) {
                            if (b10 == this.f16076m1) {
                                f2(lVar, i10, j14);
                            } else {
                                R1(j14, b10, n1Var);
                                W1(lVar, i10, j14, b10);
                            }
                            h2(j15);
                            this.f16076m1 = b10;
                            return true;
                        }
                    } else if (j15 < 30000) {
                        if (j15 > 11000) {
                            try {
                                Thread.sleep((j15 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        R1(j14, b10, n1Var);
                        V1(lVar, i10, j14);
                    }
                }
            }
            return false;
        }
        long nanoTime2 = System.nanoTime();
        R1(j14, nanoTime2, n1Var);
        if (n0.f15397a >= 21) {
            W1(lVar, i10, j14, nanoTime2);
        }
        V1(lVar, i10, j14);
        h2(j15);
        return true;
    }

    protected void V1(j2.l lVar, int i10, long j10) {
        O1();
        k0.a("releaseOutputBuffer");
        lVar.d(i10, true);
        k0.c();
        this.f16073j1 = SystemClock.elapsedRealtime() * 1000;
        this.H0.f19355e++;
        this.f16070g1 = 0;
        M1();
    }

    protected void W1(j2.l lVar, int i10, long j10, long j11) {
        O1();
        k0.a("releaseOutputBuffer");
        lVar.n(i10, j11);
        k0.c();
        this.f16073j1 = SystemClock.elapsedRealtime() * 1000;
        this.H0.f19355e++;
        this.f16070g1 = 0;
        M1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j2.o
    public void Z0() {
        super.Z0();
        this.f16071h1 = 0;
    }

    protected void a2(j2.l lVar, Surface surface) {
        lVar.i(surface);
    }

    protected boolean b2(long j10, long j11, boolean z10) {
        return J1(j10) && !z10;
    }

    protected boolean c2(long j10, long j11, boolean z10) {
        return I1(j10) && !z10;
    }

    @Override // j2.o, s1.l3
    public boolean d() {
        i iVar;
        if (super.d() && (this.Z0 || (((iVar = this.W0) != null && this.V0 == iVar) || p0() == null || this.f16082s1))) {
            this.f16067d1 = -9223372036854775807L;
            return true;
        } else if (this.f16067d1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f16067d1) {
                return true;
            }
            this.f16067d1 = -9223372036854775807L;
            return false;
        }
    }

    @Override // j2.o
    protected j2.m d0(Throwable th, j2.n nVar) {
        return new g(th, nVar, this.V0);
    }

    protected boolean d2(long j10, long j11) {
        return I1(j10) && j11 > 100000;
    }

    @Override // s1.l3, s1.n3
    public String f() {
        return "MediaCodecVideoRenderer";
    }

    protected void f2(j2.l lVar, int i10, long j10) {
        k0.a("skipVideoBuffer");
        lVar.d(i10, false);
        k0.c();
        this.H0.f19356f++;
    }

    protected void g2(int i10, int i11) {
        v1.e eVar = this.H0;
        eVar.f19358h += i10;
        int i12 = i10 + i11;
        eVar.f19357g += i12;
        this.f16069f1 += i12;
        int i13 = this.f16070g1 + i12;
        this.f16070g1 = i13;
        eVar.f19359i = Math.max(i13, eVar.f19359i);
        int i14 = this.Q0;
        if (i14 <= 0 || this.f16069f1 < i14) {
            return;
        }
        L1();
    }

    protected void h2(long j10) {
        this.H0.a(j10);
        this.f16074k1 += j10;
        this.f16075l1++;
    }

    @Override // j2.o
    protected boolean j1(j2.n nVar) {
        return this.V0 != null || e2(nVar);
    }

    @Override // s1.f, s1.g3.b
    public void m(int i10, Object obj) {
        if (i10 == 1) {
            Z1(obj);
        } else if (i10 == 7) {
            this.f16085v1 = (j) obj;
        } else if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f16083t1 != intValue) {
                this.f16083t1 = intValue;
                if (this.f16082s1) {
                    X0();
                }
            }
        } else if (i10 != 4) {
            if (i10 != 5) {
                super.m(i10, obj);
            } else {
                this.N0.o(((Integer) obj).intValue());
            }
        } else {
            this.Y0 = ((Integer) obj).intValue();
            j2.l p02 = p0();
            if (p02 != null) {
                p02.f(this.Y0);
            }
        }
    }

    @Override // j2.o
    protected int m1(j2.q qVar, n1 n1Var) {
        boolean z10;
        int i10 = 0;
        if (p3.v.s(n1Var.f17419u)) {
            boolean z11 = n1Var.f17422x != null;
            List<j2.n> E1 = E1(this.M0, qVar, n1Var, z11, false);
            if (z11 && E1.isEmpty()) {
                E1 = E1(this.M0, qVar, n1Var, false, false);
            }
            if (E1.isEmpty()) {
                return m3.a(1);
            }
            if (j2.o.n1(n1Var)) {
                j2.n nVar = E1.get(0);
                boolean o10 = nVar.o(n1Var);
                if (!o10) {
                    for (int i11 = 1; i11 < E1.size(); i11++) {
                        j2.n nVar2 = E1.get(i11);
                        if (nVar2.o(n1Var)) {
                            nVar = nVar2;
                            z10 = false;
                            o10 = true;
                            break;
                        }
                    }
                }
                z10 = true;
                int i12 = o10 ? 4 : 3;
                int i13 = nVar.r(n1Var) ? 16 : 8;
                int i14 = nVar.f12038h ? 64 : 0;
                int i15 = z10 ? 128 : 0;
                if (n0.f15397a >= 26 && "video/dolby-vision".equals(n1Var.f17419u) && !a.a(this.M0)) {
                    i15 = 256;
                }
                if (o10) {
                    List<j2.n> E12 = E1(this.M0, qVar, n1Var, z11, true);
                    if (!E12.isEmpty()) {
                        j2.n nVar3 = j2.v.u(E12, n1Var).get(0);
                        if (nVar3.o(n1Var) && nVar3.r(n1Var)) {
                            i10 = 32;
                        }
                    }
                }
                return m3.c(i12, i13, i10, i14, i15);
            }
            return m3.a(2);
        }
        return m3.a(0);
    }

    @Override // j2.o
    protected boolean r0() {
        return this.f16082s1 && n0.f15397a < 23;
    }

    @Override // j2.o
    protected float s0(float f10, n1 n1Var, n1[] n1VarArr) {
        float f11 = -1.0f;
        for (n1 n1Var2 : n1VarArr) {
            float f12 = n1Var2.B;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // j2.o
    protected List<j2.n> u0(j2.q qVar, n1 n1Var, boolean z10) {
        return j2.v.u(E1(this.M0, qVar, n1Var, z10, this.f16082s1), n1Var);
    }

    @Override // j2.o
    protected l.a w0(j2.n nVar, n1 n1Var, MediaCrypto mediaCrypto, float f10) {
        i iVar = this.W0;
        if (iVar != null && iVar.f16093j != nVar.f12037g) {
            U1();
        }
        String str = nVar.f12033c;
        b D1 = D1(nVar, n1Var, F());
        this.S0 = D1;
        MediaFormat H1 = H1(n1Var, str, D1, f10, this.R0, this.f16082s1 ? this.f16083t1 : 0);
        if (this.V0 == null) {
            if (!e2(nVar)) {
                throw new IllegalStateException();
            }
            if (this.W0 == null) {
                this.W0 = i.c(this.M0, nVar.f12037g);
            }
            this.V0 = this.W0;
        }
        return l.a.b(nVar, H1, n1Var, this.V0, mediaCrypto);
    }

    protected boolean w1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!f16062x1) {
                f16063y1 = A1();
                f16062x1 = true;
            }
        }
        return f16063y1;
    }

    @Override // j2.o, s1.f, s1.l3
    public void y(float f10, float f11) {
        super.y(f10, f11);
        this.N0.i(f10);
    }

    @Override // j2.o
    protected void z0(v1.g gVar) {
        if (this.U0) {
            ByteBuffer byteBuffer = (ByteBuffer) p3.a.e(gVar.f19367o);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        X1(p0(), bArr);
                    }
                }
            }
        }
    }

    protected void z1(j2.l lVar, int i10, long j10) {
        k0.a("dropVideoBuffer");
        lVar.d(i10, false);
        k0.c();
        g2(0, 1);
    }
}
