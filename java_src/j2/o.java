package j2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import j2.l;
import j2.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p3.i0;
import p3.k0;
import p3.n0;
import s1.n1;
import s1.o1;
import t1.t1;
import v1.g;
import w1.h0;
import w1.o;
/* loaded from: classes.dex */
public abstract class o extends s1.f {
    private static final byte[] L0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final v1.g A;
    private long A0;
    private final v1.g B;
    private long B0;
    private final v1.g C;
    private boolean C0;
    private final h D;
    private boolean D0;
    private final ArrayList<Long> E;
    private boolean E0;
    private final MediaCodec.BufferInfo F;
    private boolean F0;
    private final ArrayDeque<c> G;
    private s1.q G0;
    private n1 H;
    protected v1.e H0;
    private n1 I;
    private c I0;
    private w1.o J;
    private long J0;
    private w1.o K;
    private boolean K0;
    private MediaCrypto L;
    private boolean M;
    private long N;
    private float O;
    private float P;
    private l Q;
    private n1 R;
    private MediaFormat S;
    private boolean T;
    private float U;
    private ArrayDeque<n> V;
    private b W;
    private n X;
    private int Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f12042a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f12043b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f12044c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f12045d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f12046e0;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f12047f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f12048g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f12049h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f12050i0;

    /* renamed from: j0  reason: collision with root package name */
    private i f12051j0;

    /* renamed from: k0  reason: collision with root package name */
    private long f12052k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f12053l0;

    /* renamed from: m0  reason: collision with root package name */
    private int f12054m0;

    /* renamed from: n0  reason: collision with root package name */
    private ByteBuffer f12055n0;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f12056o0;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f12057p0;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f12058q0;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f12059r0;

    /* renamed from: s0  reason: collision with root package name */
    private boolean f12060s0;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f12061t0;

    /* renamed from: u0  reason: collision with root package name */
    private int f12062u0;

    /* renamed from: v0  reason: collision with root package name */
    private int f12063v0;

    /* renamed from: w  reason: collision with root package name */
    private final l.b f12064w;

    /* renamed from: w0  reason: collision with root package name */
    private int f12065w0;

    /* renamed from: x  reason: collision with root package name */
    private final q f12066x;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f12067x0;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f12068y;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f12069y0;

    /* renamed from: z  reason: collision with root package name */
    private final float f12070z;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f12071z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(l.a aVar, t1 t1Var) {
            LogSessionId a10 = t1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f12024b.setString("log-session-id", a10.getStringId());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {

        /* renamed from: j  reason: collision with root package name */
        public final String f12072j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f12073k;

        /* renamed from: l  reason: collision with root package name */
        public final n f12074l;

        /* renamed from: m  reason: collision with root package name */
        public final String f12075m;

        /* renamed from: n  reason: collision with root package name */
        public final b f12076n;

        private b(String str, Throwable th, String str2, boolean z10, n nVar, String str3, b bVar) {
            super(str, th);
            this.f12072j = str2;
            this.f12073k = z10;
            this.f12074l = nVar;
            this.f12075m = str3;
            this.f12076n = bVar;
        }

        public b(n1 n1Var, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + n1Var, th, n1Var.f17419u, z10, null, b(i10), null);
        }

        public b(n1 n1Var, Throwable th, boolean z10, n nVar) {
            this("Decoder init failed: " + nVar.f12031a + ", " + n1Var, th, n1Var.f17419u, z10, nVar, n0.f15397a >= 21 ? d(th) : null, null);
        }

        private static String b(int i10) {
            String str = i10 < 0 ? "neg_" : "";
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b c(b bVar) {
            return new b(getMessage(), getCause(), this.f12072j, this.f12073k, this.f12074l, this.f12075m, bVar);
        }

        private static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: e  reason: collision with root package name */
        public static final c f12077e = new c(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a  reason: collision with root package name */
        public final long f12078a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12079b;

        /* renamed from: c  reason: collision with root package name */
        public final long f12080c;

        /* renamed from: d  reason: collision with root package name */
        public final i0<n1> f12081d = new i0<>();

        public c(long j10, long j11, long j12) {
            this.f12078a = j10;
            this.f12079b = j11;
            this.f12080c = j12;
        }
    }

    public o(int i10, l.b bVar, q qVar, boolean z10, float f10) {
        super(i10);
        this.f12064w = bVar;
        this.f12066x = (q) p3.a.e(qVar);
        this.f12068y = z10;
        this.f12070z = f10;
        this.A = v1.g.A();
        this.B = new v1.g(0);
        this.C = new v1.g(2);
        h hVar = new h();
        this.D = hVar;
        this.E = new ArrayList<>();
        this.F = new MediaCodec.BufferInfo();
        this.O = 1.0f;
        this.P = 1.0f;
        this.N = -9223372036854775807L;
        this.G = new ArrayDeque<>();
        e1(c.f12077e);
        hVar.x(0);
        hVar.f19364l.order(ByteOrder.nativeOrder());
        this.U = -1.0f;
        this.Y = 0;
        this.f12062u0 = 0;
        this.f12053l0 = -1;
        this.f12054m0 = -1;
        this.f12052k0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.f12063v0 = 0;
        this.f12065w0 = 0;
    }

    private boolean A0() {
        return this.f12054m0 >= 0;
    }

    private void B0(n1 n1Var) {
        e0();
        String str = n1Var.f17419u;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.D.I(32);
        } else {
            this.D.I(1);
        }
        this.f12058q0 = true;
    }

    private void C0(n nVar, MediaCrypto mediaCrypto) {
        String str = nVar.f12031a;
        int i10 = n0.f15397a;
        float s02 = i10 < 23 ? -1.0f : s0(this.P, this.H, F());
        float f10 = s02 > this.f12070z ? s02 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l.a w02 = w0(nVar, this.H, mediaCrypto, f10);
        if (i10 >= 31) {
            a.a(w02, E());
        }
        try {
            k0.a("createCodec:" + str);
            this.Q = this.f12064w.a(w02);
            k0.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!nVar.o(this.H)) {
                p3.r.i("MediaCodecRenderer", n0.C("Format exceeds selected codec's capabilities [%s, %s]", n1.i(this.H), str));
            }
            this.X = nVar;
            this.U = f10;
            this.R = this.H;
            this.Y = U(str);
            this.Z = V(str, this.R);
            this.f12042a0 = a0(str);
            this.f12043b0 = c0(str);
            this.f12044c0 = X(str);
            this.f12045d0 = Y(str);
            this.f12046e0 = W(str);
            this.f12047f0 = b0(str, this.R);
            this.f12050i0 = Z(nVar) || r0();
            if (this.Q.c()) {
                this.f12061t0 = true;
                this.f12062u0 = 1;
                this.f12048g0 = this.Y != 0;
            }
            if ("c2.android.mp3.decoder".equals(nVar.f12031a)) {
                this.f12051j0 = new i();
            }
            if (getState() == 2) {
                this.f12052k0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.H0.f19351a++;
            K0(str, w02, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            k0.c();
            throw th;
        }
    }

    private boolean D0(long j10) {
        int size = this.E.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.E.get(i10).longValue() == j10) {
                this.E.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean E0(IllegalStateException illegalStateException) {
        if (n0.f15397a < 21 || !F0(illegalStateException)) {
            StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
            return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
        }
        return true;
    }

    private static boolean F0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean G0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void I0(android.media.MediaCrypto r8, boolean r9) {
        /*
            r7 = this;
            java.util.ArrayDeque<j2.n> r0 = r7.V
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r7.o0(r9)     // Catch: j2.v.c -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: j2.v.c -> L2d
            r2.<init>()     // Catch: j2.v.c -> L2d
            r7.V = r2     // Catch: j2.v.c -> L2d
            boolean r3 = r7.f12068y     // Catch: j2.v.c -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: j2.v.c -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: j2.v.c -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<j2.n> r2 = r7.V     // Catch: j2.v.c -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: j2.v.c -> L2d
            j2.n r0 = (j2.n) r0     // Catch: j2.v.c -> L2d
            r2.add(r0)     // Catch: j2.v.c -> L2d
        L2a:
            r7.W = r1     // Catch: j2.v.c -> L2d
            goto L39
        L2d:
            r8 = move-exception
            j2.o$b r0 = new j2.o$b
            s1.n1 r1 = r7.H
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L39:
            java.util.ArrayDeque<j2.n> r0 = r7.V
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb4
            java.util.ArrayDeque<j2.n> r0 = r7.V
            java.lang.Object r0 = r0.peekFirst()
            j2.n r0 = (j2.n) r0
        L49:
            j2.l r2 = r7.Q
            if (r2 != 0) goto Lb1
            java.util.ArrayDeque<j2.n> r2 = r7.V
            java.lang.Object r2 = r2.peekFirst()
            j2.n r2 = (j2.n) r2
            boolean r3 = r7.j1(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r7.C0(r2, r8)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            p3.r.i(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.C0(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L49
        L73:
            throw r3     // Catch: java.lang.Exception -> L74
        L74:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            p3.r.j(r4, r5, r3)
            java.util.ArrayDeque<j2.n> r4 = r7.V
            r4.removeFirst()
            j2.o$b r4 = new j2.o$b
            s1.n1 r5 = r7.H
            r4.<init>(r5, r3, r9, r2)
            r7.J0(r4)
            j2.o$b r2 = r7.W
            if (r2 != 0) goto L9f
            r7.W = r4
            goto La5
        L9f:
            j2.o$b r2 = j2.o.b.a(r2, r4)
            r7.W = r2
        La5:
            java.util.ArrayDeque<j2.n> r2 = r7.V
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lae
            goto L49
        Lae:
            j2.o$b r8 = r7.W
            throw r8
        Lb1:
            r7.V = r1
            return
        Lb4:
            j2.o$b r8 = new j2.o$b
            s1.n1 r0 = r7.H
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.o.I0(android.media.MediaCrypto, boolean):void");
    }

    private void R() {
        p3.a.f(!this.C0);
        o1 C = C();
        this.C.l();
        do {
            this.C.l();
            int O = O(C, this.C, 0);
            if (O == -5) {
                M0(C);
                return;
            } else if (O != -4) {
                if (O != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.C.r()) {
                this.C0 = true;
                return;
            } else {
                if (this.E0) {
                    n1 n1Var = (n1) p3.a.e(this.H);
                    this.I = n1Var;
                    N0(n1Var, null);
                    this.E0 = false;
                }
                this.C.y();
            }
        } while (this.D.C(this.C));
        this.f12059r0 = true;
    }

    private boolean S(long j10, long j11) {
        p3.a.f(!this.D0);
        if (this.D.H()) {
            h hVar = this.D;
            if (!T0(j10, j11, null, hVar.f19364l, this.f12054m0, 0, hVar.G(), this.D.E(), this.D.q(), this.D.r(), this.I)) {
                return false;
            }
            P0(this.D.F());
            this.D.l();
        }
        if (this.C0) {
            this.D0 = true;
            return false;
        }
        if (this.f12059r0) {
            p3.a.f(this.D.C(this.C));
            this.f12059r0 = false;
        }
        if (this.f12060s0) {
            if (this.D.H()) {
                return true;
            }
            e0();
            this.f12060s0 = false;
            H0();
            if (!this.f12058q0) {
                return false;
            }
        }
        R();
        if (this.D.H()) {
            this.D.y();
        }
        return this.D.H() || this.C0 || this.f12060s0;
    }

    private void S0() {
        int i10 = this.f12065w0;
        if (i10 == 1) {
            l0();
        } else if (i10 == 2) {
            l0();
            p1();
        } else if (i10 == 3) {
            W0();
        } else {
            this.D0 = true;
            Y0();
        }
    }

    private int U(String str) {
        int i10 = n0.f15397a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = n0.f15400d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = n0.f15398b;
                return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
            }
            return 0;
        }
        return 0;
    }

    private void U0() {
        this.f12071z0 = true;
        MediaFormat g10 = this.Q.g();
        if (this.Y != 0 && g10.getInteger("width") == 32 && g10.getInteger("height") == 32) {
            this.f12049h0 = true;
            return;
        }
        if (this.f12047f0) {
            g10.setInteger("channel-count", 1);
        }
        this.S = g10;
        this.T = true;
    }

    private static boolean V(String str, n1 n1Var) {
        return n0.f15397a < 21 && n1Var.f17421w.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private boolean V0(int i10) {
        o1 C = C();
        this.A.l();
        int O = O(C, this.A, i10 | 4);
        if (O == -5) {
            M0(C);
            return true;
        } else if (O == -4 && this.A.r()) {
            this.C0 = true;
            S0();
            return false;
        } else {
            return false;
        }
    }

    private static boolean W(String str) {
        if (n0.f15397a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(n0.f15399c)) {
            String str2 = n0.f15398b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private void W0() {
        X0();
        H0();
    }

    private static boolean X(String str) {
        int i10 = n0.f15397a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = n0.f15398b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean Y(String str) {
        return n0.f15397a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean Z(n nVar) {
        String str = nVar.f12031a;
        int i10 = n0.f15397a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(n0.f15399c) && "AFTS".equals(n0.f15400d) && nVar.f12037g));
    }

    private static boolean a0(String str) {
        int i10 = n0.f15397a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && n0.f15400d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean b0(String str, n1 n1Var) {
        return n0.f15397a <= 18 && n1Var.H == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void b1() {
        this.f12053l0 = -1;
        this.B.f19364l = null;
    }

    private static boolean c0(String str) {
        return n0.f15397a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void c1() {
        this.f12054m0 = -1;
        this.f12055n0 = null;
    }

    private void d1(w1.o oVar) {
        w1.n.a(this.J, oVar);
        this.J = oVar;
    }

    private void e0() {
        this.f12060s0 = false;
        this.D.l();
        this.C.l();
        this.f12059r0 = false;
        this.f12058q0 = false;
    }

    private void e1(c cVar) {
        this.I0 = cVar;
        long j10 = cVar.f12080c;
        if (j10 != -9223372036854775807L) {
            this.K0 = true;
            O0(j10);
        }
    }

    private boolean f0() {
        if (this.f12067x0) {
            this.f12063v0 = 1;
            if (this.f12042a0 || this.f12044c0) {
                this.f12065w0 = 3;
                return false;
            }
            this.f12065w0 = 1;
        }
        return true;
    }

    private void g0() {
        if (!this.f12067x0) {
            W0();
            return;
        }
        this.f12063v0 = 1;
        this.f12065w0 = 3;
    }

    private boolean h0() {
        if (this.f12067x0) {
            this.f12063v0 = 1;
            if (this.f12042a0 || this.f12044c0) {
                this.f12065w0 = 3;
                return false;
            }
            this.f12065w0 = 2;
        } else {
            p1();
        }
        return true;
    }

    private void h1(w1.o oVar) {
        w1.n.a(this.K, oVar);
        this.K = oVar;
    }

    private boolean i0(long j10, long j11) {
        boolean z10;
        boolean T0;
        int b10;
        if (!A0()) {
            if (this.f12045d0 && this.f12069y0) {
                try {
                    b10 = this.Q.b(this.F);
                } catch (IllegalStateException unused) {
                    S0();
                    if (this.D0) {
                        X0();
                    }
                    return false;
                }
            } else {
                b10 = this.Q.b(this.F);
            }
            if (b10 < 0) {
                if (b10 == -2) {
                    U0();
                    return true;
                }
                if (this.f12050i0 && (this.C0 || this.f12063v0 == 2)) {
                    S0();
                }
                return false;
            } else if (this.f12049h0) {
                this.f12049h0 = false;
                this.Q.d(b10, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo = this.F;
                if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                    S0();
                    return false;
                }
                this.f12054m0 = b10;
                ByteBuffer m10 = this.Q.m(b10);
                this.f12055n0 = m10;
                if (m10 != null) {
                    m10.position(this.F.offset);
                    ByteBuffer byteBuffer = this.f12055n0;
                    MediaCodec.BufferInfo bufferInfo2 = this.F;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.f12046e0) {
                    MediaCodec.BufferInfo bufferInfo3 = this.F;
                    if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                        long j12 = this.A0;
                        if (j12 != -9223372036854775807L) {
                            bufferInfo3.presentationTimeUs = j12;
                        }
                    }
                }
                this.f12056o0 = D0(this.F.presentationTimeUs);
                long j13 = this.B0;
                long j14 = this.F.presentationTimeUs;
                this.f12057p0 = j13 == j14;
                q1(j14);
            }
        }
        if (this.f12045d0 && this.f12069y0) {
            try {
                l lVar = this.Q;
                ByteBuffer byteBuffer2 = this.f12055n0;
                int i10 = this.f12054m0;
                MediaCodec.BufferInfo bufferInfo4 = this.F;
                z10 = false;
                try {
                    T0 = T0(j10, j11, lVar, byteBuffer2, i10, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f12056o0, this.f12057p0, this.I);
                } catch (IllegalStateException unused2) {
                    S0();
                    if (this.D0) {
                        X0();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            l lVar2 = this.Q;
            ByteBuffer byteBuffer3 = this.f12055n0;
            int i11 = this.f12054m0;
            MediaCodec.BufferInfo bufferInfo5 = this.F;
            T0 = T0(j10, j11, lVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f12056o0, this.f12057p0, this.I);
        }
        if (T0) {
            P0(this.F.presentationTimeUs);
            boolean z11 = (this.F.flags & 4) != 0;
            c1();
            if (!z11) {
                return true;
            }
            S0();
        }
        return z10;
    }

    private boolean i1(long j10) {
        return this.N == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.N;
    }

    private boolean j0(n nVar, n1 n1Var, w1.o oVar, w1.o oVar2) {
        h0 v02;
        if (oVar == oVar2) {
            return false;
        }
        if (oVar2 == null || oVar == null || !oVar2.e().equals(oVar.e()) || n0.f15397a < 23) {
            return true;
        }
        UUID uuid = s1.i.f17255e;
        if (uuid.equals(oVar.e()) || uuid.equals(oVar2.e()) || (v02 = v0(oVar2)) == null) {
            return true;
        }
        return !nVar.f12037g && (v02.f19705c ? false : oVar2.g(n1Var.f17419u));
    }

    private boolean k0() {
        int i10;
        if (this.Q == null || (i10 = this.f12063v0) == 2 || this.C0) {
            return false;
        }
        if (i10 == 0 && k1()) {
            g0();
        }
        if (this.f12053l0 < 0) {
            int o10 = this.Q.o();
            this.f12053l0 = o10;
            if (o10 < 0) {
                return false;
            }
            this.B.f19364l = this.Q.h(o10);
            this.B.l();
        }
        if (this.f12063v0 == 1) {
            if (!this.f12050i0) {
                this.f12069y0 = true;
                this.Q.k(this.f12053l0, 0, 0, 0L, 4);
                b1();
            }
            this.f12063v0 = 2;
            return false;
        } else if (this.f12048g0) {
            this.f12048g0 = false;
            ByteBuffer byteBuffer = this.B.f19364l;
            byte[] bArr = L0;
            byteBuffer.put(bArr);
            this.Q.k(this.f12053l0, 0, bArr.length, 0L, 0);
            b1();
            this.f12067x0 = true;
            return true;
        } else {
            if (this.f12062u0 == 1) {
                for (int i11 = 0; i11 < this.R.f17421w.size(); i11++) {
                    this.B.f19364l.put(this.R.f17421w.get(i11));
                }
                this.f12062u0 = 2;
            }
            int position = this.B.f19364l.position();
            o1 C = C();
            try {
                int O = O(C, this.B, 0);
                if (j() || this.B.u()) {
                    this.B0 = this.A0;
                }
                if (O == -3) {
                    return false;
                }
                if (O == -5) {
                    if (this.f12062u0 == 2) {
                        this.B.l();
                        this.f12062u0 = 1;
                    }
                    M0(C);
                    return true;
                } else if (this.B.r()) {
                    if (this.f12062u0 == 2) {
                        this.B.l();
                        this.f12062u0 = 1;
                    }
                    this.C0 = true;
                    if (!this.f12067x0) {
                        S0();
                        return false;
                    }
                    try {
                        if (!this.f12050i0) {
                            this.f12069y0 = true;
                            this.Q.k(this.f12053l0, 0, 0, 0L, 4);
                            b1();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw z(e10, this.H, n0.U(e10.getErrorCode()));
                    }
                } else if (!this.f12067x0 && !this.B.t()) {
                    this.B.l();
                    if (this.f12062u0 == 2) {
                        this.f12062u0 = 1;
                    }
                    return true;
                } else {
                    boolean z10 = this.B.z();
                    if (z10) {
                        this.B.f19363k.b(position);
                    }
                    if (this.Z && !z10) {
                        p3.w.b(this.B.f19364l);
                        if (this.B.f19364l.position() == 0) {
                            return true;
                        }
                        this.Z = false;
                    }
                    v1.g gVar = this.B;
                    long j10 = gVar.f19366n;
                    i iVar = this.f12051j0;
                    if (iVar != null) {
                        j10 = iVar.d(this.H, gVar);
                        this.A0 = Math.max(this.A0, this.f12051j0.b(this.H));
                    }
                    long j11 = j10;
                    if (this.B.q()) {
                        this.E.add(Long.valueOf(j11));
                    }
                    if (this.E0) {
                        (!this.G.isEmpty() ? this.G.peekLast() : this.I0).f12081d.a(j11, this.H);
                        this.E0 = false;
                    }
                    this.A0 = Math.max(this.A0, j11);
                    this.B.y();
                    if (this.B.p()) {
                        z0(this.B);
                    }
                    R0(this.B);
                    try {
                        if (z10) {
                            this.Q.e(this.f12053l0, 0, this.B.f19363k, j11, 0);
                        } else {
                            this.Q.k(this.f12053l0, 0, this.B.f19364l.limit(), j11, 0);
                        }
                        b1();
                        this.f12067x0 = true;
                        this.f12062u0 = 0;
                        this.H0.f19353c++;
                        return true;
                    } catch (MediaCodec.CryptoException e11) {
                        throw z(e11, this.H, n0.U(e11.getErrorCode()));
                    }
                }
            } catch (g.a e12) {
                J0(e12);
                V0(0);
                l0();
                return true;
            }
        }
    }

    private void l0() {
        try {
            this.Q.flush();
        } finally {
            Z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean n1(n1 n1Var) {
        int i10 = n1Var.P;
        return i10 == 0 || i10 == 2;
    }

    private List<n> o0(boolean z10) {
        List<n> u02 = u0(this.f12066x, this.H, z10);
        if (u02.isEmpty() && z10) {
            u02 = u0(this.f12066x, this.H, false);
            if (!u02.isEmpty()) {
                p3.r.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.H.f17419u + ", but no secure decoder available. Trying to proceed with " + u02 + ".");
            }
        }
        return u02;
    }

    private boolean o1(n1 n1Var) {
        if (n0.f15397a >= 23 && this.Q != null && this.f12065w0 != 3 && getState() != 0) {
            float s02 = s0(this.P, n1Var, F());
            float f10 = this.U;
            if (f10 == s02) {
                return true;
            }
            if (s02 == -1.0f) {
                g0();
                return false;
            } else if (f10 == -1.0f && s02 <= this.f12070z) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", s02);
                this.Q.l(bundle);
                this.U = s02;
            }
        }
        return true;
    }

    private void p1() {
        try {
            this.L.setMediaDrmSession(v0(this.K).f19704b);
            d1(this.K);
            this.f12063v0 = 0;
            this.f12065w0 = 0;
        } catch (MediaCryptoException e10) {
            throw z(e10, this.H, 6006);
        }
    }

    private h0 v0(w1.o oVar) {
        v1.b h10 = oVar.h();
        if (h10 == null || (h10 instanceof h0)) {
            return (h0) h10;
        }
        throw z(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + h10), this.H, 6001);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void H() {
        this.H = null;
        e1(c.f12077e);
        this.G.clear();
        n0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H0() {
        n1 n1Var;
        if (this.Q != null || this.f12058q0 || (n1Var = this.H) == null) {
            return;
        }
        if (this.K == null && l1(n1Var)) {
            B0(this.H);
            return;
        }
        d1(this.K);
        String str = this.H.f17419u;
        w1.o oVar = this.J;
        if (oVar != null) {
            if (this.L == null) {
                h0 v02 = v0(oVar);
                if (v02 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(v02.f19703a, v02.f19704b);
                        this.L = mediaCrypto;
                        this.M = !v02.f19705c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw z(e10, this.H, 6006);
                    }
                } else if (this.J.a() == null) {
                    return;
                }
            }
            if (h0.f19702d) {
                int state = this.J.getState();
                if (state == 1) {
                    o.a aVar = (o.a) p3.a.e(this.J.a());
                    throw z(aVar, this.H, aVar.f19735j);
                } else if (state != 4) {
                    return;
                }
            }
        }
        try {
            I0(this.L, this.M);
        } catch (b e11) {
            throw z(e11, this.H, 4001);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void I(boolean z10, boolean z11) {
        this.H0 = new v1.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void J(long j10, boolean z10) {
        this.C0 = false;
        this.D0 = false;
        this.F0 = false;
        if (this.f12058q0) {
            this.D.l();
            this.C.l();
            this.f12059r0 = false;
        } else {
            m0();
        }
        if (this.I0.f12081d.k() > 0) {
            this.E0 = true;
        }
        this.I0.f12081d.c();
        this.G.clear();
    }

    protected abstract void J0(Exception exc);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void K() {
        try {
            e0();
            X0();
        } finally {
            h1(null);
        }
    }

    protected abstract void K0(String str, l.a aVar, long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void L() {
    }

    protected abstract void L0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s1.f
    public void M() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (h0() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b2, code lost:
        if (h0() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
        r7 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v1.i M0(s1.o1 r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.o.M0(s1.o1):v1.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r5 >= r1) goto L14;
     */
    @Override // s1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void N(s1.n1[] r16, long r17, long r19) {
        /*
            r15 = this;
            r0 = r15
            j2.o$c r1 = r0.I0
            long r1 = r1.f12080c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            j2.o$c r1 = new j2.o$c
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.e1(r1)
            goto L68
        L21:
            java.util.ArrayDeque<j2.o$c> r1 = r0.G
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            long r1 = r0.A0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            long r5 = r0.J0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L57
        L39:
            j2.o$c r1 = new j2.o$c
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.e1(r1)
            j2.o$c r1 = r0.I0
            long r1 = r1.f12080c
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L68
            r15.Q0()
            goto L68
        L57:
            java.util.ArrayDeque<j2.o$c> r1 = r0.G
            j2.o$c r9 = new j2.o$c
            long r3 = r0.A0
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.o.N(s1.n1[], long, long):void");
    }

    protected abstract void N0(n1 n1Var, MediaFormat mediaFormat);

    protected void O0(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P0(long j10) {
        this.J0 = j10;
        while (!this.G.isEmpty() && j10 >= this.G.peek().f12078a) {
            e1(this.G.poll());
            Q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q0() {
    }

    protected abstract void R0(v1.g gVar);

    protected abstract v1.i T(n nVar, n1 n1Var, n1 n1Var2);

    protected abstract boolean T0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, n1 n1Var);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.MediaCrypto, w1.o] */
    public void X0() {
        try {
            l lVar = this.Q;
            if (lVar != null) {
                lVar.a();
                this.H0.f19352b++;
                L0(this.X.f12031a);
            }
            this.Q = null;
            try {
                MediaCrypto mediaCrypto = this.L;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.Q = null;
            try {
                MediaCrypto mediaCrypto2 = this.L;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected void Y0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Z0() {
        b1();
        c1();
        this.f12052k0 = -9223372036854775807L;
        this.f12069y0 = false;
        this.f12067x0 = false;
        this.f12048g0 = false;
        this.f12049h0 = false;
        this.f12056o0 = false;
        this.f12057p0 = false;
        this.E.clear();
        this.A0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        i iVar = this.f12051j0;
        if (iVar != null) {
            iVar.c();
        }
        this.f12063v0 = 0;
        this.f12065w0 = 0;
        this.f12062u0 = this.f12061t0 ? 1 : 0;
    }

    @Override // s1.n3
    public final int a(n1 n1Var) {
        try {
            return m1(this.f12066x, n1Var);
        } catch (v.c e10) {
            throw z(e10, n1Var, 4002);
        }
    }

    protected void a1() {
        Z0();
        this.G0 = null;
        this.f12051j0 = null;
        this.V = null;
        this.X = null;
        this.R = null;
        this.S = null;
        this.T = false;
        this.f12071z0 = false;
        this.U = -1.0f;
        this.Y = 0;
        this.Z = false;
        this.f12042a0 = false;
        this.f12043b0 = false;
        this.f12044c0 = false;
        this.f12045d0 = false;
        this.f12046e0 = false;
        this.f12047f0 = false;
        this.f12050i0 = false;
        this.f12061t0 = false;
        this.f12062u0 = 0;
        this.M = false;
    }

    @Override // s1.l3
    public boolean b() {
        return this.D0;
    }

    @Override // s1.l3
    public boolean d() {
        return this.H != null && (G() || A0() || (this.f12052k0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f12052k0));
    }

    protected m d0(Throwable th, n nVar) {
        return new m(th, nVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f1() {
        this.F0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g1(s1.q qVar) {
        this.G0 = qVar;
    }

    protected boolean j1(n nVar) {
        return true;
    }

    @Override // s1.f, s1.n3
    public final int k() {
        return 8;
    }

    protected boolean k1() {
        return false;
    }

    @Override // s1.l3
    public void l(long j10, long j11) {
        boolean z10 = false;
        if (this.F0) {
            this.F0 = false;
            S0();
        }
        s1.q qVar = this.G0;
        if (qVar != null) {
            this.G0 = null;
            throw qVar;
        }
        try {
            if (this.D0) {
                Y0();
            } else if (this.H != null || V0(2)) {
                H0();
                if (this.f12058q0) {
                    k0.a("bypassRender");
                    while (S(j10, j11)) {
                    }
                } else if (this.Q == null) {
                    this.H0.f19354d += Q(j10);
                    V0(1);
                    this.H0.c();
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    k0.a("drainAndFeed");
                    while (i0(j10, j11) && i1(elapsedRealtime)) {
                    }
                    while (k0() && i1(elapsedRealtime)) {
                    }
                }
                k0.c();
                this.H0.c();
            }
        } catch (IllegalStateException e10) {
            if (!E0(e10)) {
                throw e10;
            }
            J0(e10);
            if (n0.f15397a >= 21 && G0(e10)) {
                z10 = true;
            }
            if (z10) {
                X0();
            }
            throw A(d0(e10, q0()), this.H, z10, 4003);
        }
    }

    protected boolean l1(n1 n1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean m0() {
        boolean n02 = n0();
        if (n02) {
            H0();
        }
        return n02;
    }

    protected abstract int m1(q qVar, n1 n1Var);

    protected boolean n0() {
        if (this.Q == null) {
            return false;
        }
        int i10 = this.f12065w0;
        if (i10 == 3 || this.f12042a0 || ((this.f12043b0 && !this.f12071z0) || (this.f12044c0 && this.f12069y0))) {
            X0();
            return true;
        }
        if (i10 == 2) {
            int i11 = n0.f15397a;
            p3.a.f(i11 >= 23);
            if (i11 >= 23) {
                try {
                    p1();
                } catch (s1.q e10) {
                    p3.r.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    X0();
                    return true;
                }
            }
        }
        l0();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final l p0() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n q0() {
        return this.X;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q1(long j10) {
        boolean z10;
        n1 i10 = this.I0.f12081d.i(j10);
        if (i10 == null && this.K0 && this.S != null) {
            i10 = this.I0.f12081d.h();
        }
        if (i10 != null) {
            this.I = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.T && this.I != null)) {
            N0(this.I, this.S);
            this.T = false;
            this.K0 = false;
        }
    }

    protected boolean r0() {
        return false;
    }

    protected abstract float s0(float f10, n1 n1Var, n1[] n1VarArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaFormat t0() {
        return this.S;
    }

    protected abstract List<n> u0(q qVar, n1 n1Var, boolean z10);

    protected abstract l.a w0(n nVar, n1 n1Var, MediaCrypto mediaCrypto, float f10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long x0() {
        return this.I0.f12080c;
    }

    @Override // s1.f, s1.l3
    public void y(float f10, float f11) {
        this.O = f10;
        this.P = f11;
        o1(this.R);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float y0() {
        return this.O;
    }

    protected void z0(v1.g gVar) {
    }
}
