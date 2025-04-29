package t1;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import j2.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import o3.q0;
import o3.y;
import s1.a2;
import s1.b3;
import s1.c3;
import s1.d4;
import s1.u2;
import s1.v1;
import s1.y2;
import s1.y3;
import t1.c;
import t1.s1;
import u1.v;
import u2.u;
import w1.h;
import w1.o;
/* loaded from: classes.dex */
public final class r1 implements c, s1.a {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private final Context f18119a;

    /* renamed from: b  reason: collision with root package name */
    private final s1 f18120b;

    /* renamed from: c  reason: collision with root package name */
    private final PlaybackSession f18121c;

    /* renamed from: i  reason: collision with root package name */
    private String f18127i;

    /* renamed from: j  reason: collision with root package name */
    private PlaybackMetrics.Builder f18128j;

    /* renamed from: k  reason: collision with root package name */
    private int f18129k;

    /* renamed from: n  reason: collision with root package name */
    private y2 f18132n;

    /* renamed from: o  reason: collision with root package name */
    private b f18133o;

    /* renamed from: p  reason: collision with root package name */
    private b f18134p;

    /* renamed from: q  reason: collision with root package name */
    private b f18135q;

    /* renamed from: r  reason: collision with root package name */
    private s1.n1 f18136r;

    /* renamed from: s  reason: collision with root package name */
    private s1.n1 f18137s;

    /* renamed from: t  reason: collision with root package name */
    private s1.n1 f18138t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f18139u;

    /* renamed from: v  reason: collision with root package name */
    private int f18140v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f18141w;

    /* renamed from: x  reason: collision with root package name */
    private int f18142x;

    /* renamed from: y  reason: collision with root package name */
    private int f18143y;

    /* renamed from: z  reason: collision with root package name */
    private int f18144z;

    /* renamed from: e  reason: collision with root package name */
    private final y3.d f18123e = new y3.d();

    /* renamed from: f  reason: collision with root package name */
    private final y3.b f18124f = new y3.b();

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, Long> f18126h = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, Long> f18125g = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final long f18122d = SystemClock.elapsedRealtime();

    /* renamed from: l  reason: collision with root package name */
    private int f18130l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f18131m = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f18145a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18146b;

        public a(int i10, int i11) {
            this.f18145a = i10;
            this.f18146b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final s1.n1 f18147a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18148b;

        /* renamed from: c  reason: collision with root package name */
        public final String f18149c;

        public b(s1.n1 n1Var, int i10, String str) {
            this.f18147a = n1Var;
            this.f18148b = i10;
            this.f18149c = str;
        }
    }

    private r1(Context context, PlaybackSession playbackSession) {
        this.f18119a = context.getApplicationContext();
        this.f18121c = playbackSession;
        q1 q1Var = new q1();
        this.f18120b = q1Var;
        q1Var.g(this);
    }

    public static r1 A0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new r1(context, mediaMetricsManager.createPlaybackSession());
    }

    private void B0() {
        PlaybackMetrics.Builder builder = this.f18128j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f18144z);
            this.f18128j.setVideoFramesDropped(this.f18142x);
            this.f18128j.setVideoFramesPlayed(this.f18143y);
            Long l10 = this.f18125g.get(this.f18127i);
            this.f18128j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f18126h.get(this.f18127i);
            this.f18128j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f18128j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f18121c.reportPlaybackMetrics(this.f18128j.build());
        }
        this.f18128j = null;
        this.f18127i = null;
        this.f18144z = 0;
        this.f18142x = 0;
        this.f18143y = 0;
        this.f18136r = null;
        this.f18137s = null;
        this.f18138t = null;
        this.A = false;
    }

    private static int C0(int i10) {
        switch (p3.n0.U(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static w1.m D0(com.google.common.collect.q<d4.a> qVar) {
        w1.m mVar;
        com.google.common.collect.s0<d4.a> it = qVar.iterator();
        while (it.hasNext()) {
            d4.a next = it.next();
            for (int i10 = 0; i10 < next.f17176j; i10++) {
                if (next.e(i10) && (mVar = next.b(i10).f17422x) != null) {
                    return mVar;
                }
            }
        }
        return null;
    }

    private static int E0(w1.m mVar) {
        for (int i10 = 0; i10 < mVar.f19729m; i10++) {
            UUID uuid = mVar.e(i10).f19731k;
            if (uuid.equals(s1.i.f17254d)) {
                return 3;
            }
            if (uuid.equals(s1.i.f17255e)) {
                return 2;
            }
            if (uuid.equals(s1.i.f17253c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a F0(y2 y2Var, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (y2Var.f17790j == 1001) {
            return new a(20, 0);
        }
        if (y2Var instanceof s1.q) {
            s1.q qVar = (s1.q) y2Var;
            z11 = qVar.f17479r == 1;
            i10 = qVar.f17483v;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th = (Throwable) p3.a.e(y2Var.getCause());
        if (!(th instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th instanceof o.b) {
                return new a(13, p3.n0.V(((o.b) th).f12075m));
            }
            if (th instanceof j2.m) {
                return new a(14, p3.n0.V(((j2.m) th).f12030k));
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof v.b) {
                return new a(17, ((v.b) th).f18699j);
            }
            if (th instanceof v.e) {
                return new a(18, ((v.e) th).f18704j);
            }
            if (p3.n0.f15397a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(C0(errorCode), errorCode);
        } else if (th instanceof o3.c0) {
            return new a(5, ((o3.c0) th).f14414m);
        } else {
            if ((th instanceof o3.b0) || (th instanceof u2)) {
                return new a(z10 ? 10 : 11, 0);
            } else if ((th instanceof o3.a0) || (th instanceof q0.a)) {
                if (p3.y.d(context).f() == 1) {
                    return new a(3, 0);
                }
                Throwable cause = th.getCause();
                return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : ((th instanceof o3.a0) && ((o3.a0) th).f14407l == 1) ? new a(4, 0) : new a(8, 0);
            } else if (y2Var.f17790j == 1002) {
                return new a(21, 0);
            } else {
                if (!(th instanceof o.a)) {
                    if ((th instanceof y.b) && (th.getCause() instanceof FileNotFoundException)) {
                        Throwable cause2 = ((Throwable) p3.a.e(th.getCause())).getCause();
                        return (p3.n0.f15397a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
                    }
                    return new a(9, 0);
                }
                Throwable th2 = (Throwable) p3.a.e(th.getCause());
                int i11 = p3.n0.f15397a;
                if (i11 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
                    return (i11 < 23 || !(th2 instanceof MediaDrmResetException)) ? (i11 < 18 || !(th2 instanceof NotProvisionedException)) ? (i11 < 18 || !(th2 instanceof DeniedByServerException)) ? th2 instanceof w1.p0 ? new a(23, 0) : th2 instanceof h.e ? new a(28, 0) : new a(30, 0) : new a(29, 0) : new a(24, 0) : new a(27, 0);
                }
                int V = p3.n0.V(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
                return new a(C0(V), V);
            }
        }
    }

    private static Pair<String, String> G0(String str) {
        String[] Q0 = p3.n0.Q0(str, "-");
        return Pair.create(Q0[0], Q0.length >= 2 ? Q0[1] : null);
    }

    private static int I0(Context context) {
        switch (p3.y.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int J0(v1 v1Var) {
        v1.h hVar = v1Var.f17603k;
        if (hVar == null) {
            return 0;
        }
        int o02 = p3.n0.o0(hVar.f17676a, hVar.f17677b);
        if (o02 != 0) {
            if (o02 != 1) {
                return o02 != 2 ? 1 : 4;
            }
            return 5;
        }
        return 3;
    }

    private static int K0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 1 : 4;
            }
            return 3;
        }
        return 2;
    }

    private void L0(c.b bVar) {
        for (int i10 = 0; i10 < bVar.d(); i10++) {
            int b10 = bVar.b(i10);
            c.a c10 = bVar.c(b10);
            if (b10 == 0) {
                this.f18120b.a(c10);
            } else if (b10 == 11) {
                this.f18120b.b(c10, this.f18129k);
            } else {
                this.f18120b.e(c10);
            }
        }
    }

    private void M0(long j10) {
        int I0 = I0(this.f18119a);
        if (I0 != this.f18131m) {
            this.f18131m = I0;
            this.f18121c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(I0).setTimeSinceCreatedMillis(j10 - this.f18122d).build());
        }
    }

    private void N0(long j10) {
        y2 y2Var = this.f18132n;
        if (y2Var == null) {
            return;
        }
        a F0 = F0(y2Var, this.f18119a, this.f18140v == 4);
        this.f18121c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.f18122d).setErrorCode(F0.f18145a).setSubErrorCode(F0.f18146b).setException(y2Var).build());
        this.A = true;
        this.f18132n = null;
    }

    private void O0(c3 c3Var, c.b bVar, long j10) {
        if (c3Var.p() != 2) {
            this.f18139u = false;
        }
        if (c3Var.f() == null) {
            this.f18141w = false;
        } else if (bVar.a(10)) {
            this.f18141w = true;
        }
        int W0 = W0(c3Var);
        if (this.f18130l != W0) {
            this.f18130l = W0;
            this.A = true;
            this.f18121c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f18130l).setTimeSinceCreatedMillis(j10 - this.f18122d).build());
        }
    }

    private void P0(c3 c3Var, c.b bVar, long j10) {
        if (bVar.a(2)) {
            d4 r10 = c3Var.r();
            boolean c10 = r10.c(2);
            boolean c11 = r10.c(1);
            boolean c12 = r10.c(3);
            if (c10 || c11 || c12) {
                if (!c10) {
                    U0(j10, null, 0);
                }
                if (!c11) {
                    Q0(j10, null, 0);
                }
                if (!c12) {
                    S0(j10, null, 0);
                }
            }
        }
        if (z0(this.f18133o)) {
            b bVar2 = this.f18133o;
            s1.n1 n1Var = bVar2.f18147a;
            if (n1Var.A != -1) {
                U0(j10, n1Var, bVar2.f18148b);
                this.f18133o = null;
            }
        }
        if (z0(this.f18134p)) {
            b bVar3 = this.f18134p;
            Q0(j10, bVar3.f18147a, bVar3.f18148b);
            this.f18134p = null;
        }
        if (z0(this.f18135q)) {
            b bVar4 = this.f18135q;
            S0(j10, bVar4.f18147a, bVar4.f18148b);
            this.f18135q = null;
        }
    }

    private void Q0(long j10, s1.n1 n1Var, int i10) {
        if (p3.n0.c(this.f18137s, n1Var)) {
            return;
        }
        int i11 = (this.f18137s == null && i10 == 0) ? 1 : i10;
        this.f18137s = n1Var;
        V0(0, j10, n1Var, i11);
    }

    private void R0(c3 c3Var, c.b bVar) {
        w1.m D0;
        if (bVar.a(0)) {
            c.a c10 = bVar.c(0);
            if (this.f18128j != null) {
                T0(c10.f17981b, c10.f17983d);
            }
        }
        if (bVar.a(2) && this.f18128j != null && (D0 = D0(c3Var.r().b())) != null) {
            ((PlaybackMetrics.Builder) p3.n0.j(this.f18128j)).setDrmType(E0(D0));
        }
        if (bVar.a(1011)) {
            this.f18144z++;
        }
    }

    private void S0(long j10, s1.n1 n1Var, int i10) {
        if (p3.n0.c(this.f18138t, n1Var)) {
            return;
        }
        int i11 = (this.f18138t == null && i10 == 0) ? 1 : i10;
        this.f18138t = n1Var;
        V0(2, j10, n1Var, i11);
    }

    private void T0(y3 y3Var, u.b bVar) {
        int f10;
        PlaybackMetrics.Builder builder = this.f18128j;
        if (bVar == null || (f10 = y3Var.f(bVar.f18969a)) == -1) {
            return;
        }
        y3Var.j(f10, this.f18124f);
        y3Var.r(this.f18124f.f17805l, this.f18123e);
        builder.setStreamType(J0(this.f18123e.f17816l));
        y3.d dVar = this.f18123e;
        if (dVar.f17827w != -9223372036854775807L && !dVar.f17825u && !dVar.f17822r && !dVar.g()) {
            builder.setMediaDurationMillis(this.f18123e.f());
        }
        builder.setPlaybackType(this.f18123e.g() ? 2 : 1);
        this.A = true;
    }

    private void U0(long j10, s1.n1 n1Var, int i10) {
        if (p3.n0.c(this.f18136r, n1Var)) {
            return;
        }
        int i11 = (this.f18136r == null && i10 == 0) ? 1 : i10;
        this.f18136r = n1Var;
        V0(1, j10, n1Var, i11);
    }

    private void V0(int i10, long j10, s1.n1 n1Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f18122d);
        if (n1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(K0(i11));
            String str = n1Var.f17418t;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = n1Var.f17419u;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = n1Var.f17416r;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = n1Var.f17415q;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = n1Var.f17424z;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = n1Var.A;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = n1Var.H;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = n1Var.I;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = n1Var.f17410l;
            if (str4 != null) {
                Pair<String, String> G0 = G0(str4);
                timeSinceCreatedMillis.setLanguage((String) G0.first);
                Object obj = G0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = n1Var.B;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f18121c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int W0(c3 c3Var) {
        int p10 = c3Var.p();
        if (this.f18139u) {
            return 5;
        }
        if (this.f18141w) {
            return 13;
        }
        if (p10 == 4) {
            return 11;
        }
        if (p10 == 2) {
            int i10 = this.f18130l;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (c3Var.n()) {
                return c3Var.B() != 0 ? 10 : 6;
            }
            return 7;
        } else if (p10 == 3) {
            if (c3Var.n()) {
                return c3Var.B() != 0 ? 9 : 3;
            }
            return 4;
        } else if (p10 != 1 || this.f18130l == 0) {
            return this.f18130l;
        } else {
            return 12;
        }
    }

    private boolean z0(b bVar) {
        return bVar != null && bVar.f18149c.equals(this.f18120b.c());
    }

    @Override // t1.c
    public /* synthetic */ void A(c.a aVar, boolean z10) {
        t1.b.D(this, aVar, z10);
    }

    @Override // t1.c
    public /* synthetic */ void B(c.a aVar, int i10) {
        t1.b.V(this, aVar, i10);
    }

    @Override // t1.c
    public /* synthetic */ void C(c.a aVar, int i10) {
        t1.b.T(this, aVar, i10);
    }

    @Override // t1.c
    public /* synthetic */ void D(c.a aVar) {
        t1.b.x(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void E(c.a aVar, int i10, boolean z10) {
        t1.b.u(this, aVar, i10, z10);
    }

    @Override // t1.c
    public /* synthetic */ void F(c.a aVar, float f10) {
        t1.b.m0(this, aVar, f10);
    }

    @Override // t1.c
    public /* synthetic */ void G(c.a aVar, Exception exc) {
        t1.b.d0(this, aVar, exc);
    }

    @Override // t1.c
    public /* synthetic */ void H(c.a aVar, int i10) {
        t1.b.O(this, aVar, i10);
    }

    public LogSessionId H0() {
        return this.f18121c.getSessionId();
    }

    @Override // t1.c
    public /* synthetic */ void I(c.a aVar, List list) {
        t1.b.o(this, aVar, list);
    }

    @Override // t1.c
    public void J(c.a aVar, y2 y2Var) {
        this.f18132n = y2Var;
    }

    @Override // t1.c
    public void K(c.a aVar, u2.n nVar, u2.q qVar, IOException iOException, boolean z10) {
        this.f18140v = qVar.f18947a;
    }

    @Override // t1.c
    public /* synthetic */ void L(c.a aVar, s1.n1 n1Var, v1.i iVar) {
        t1.b.k0(this, aVar, n1Var, iVar);
    }

    @Override // t1.c
    public /* synthetic */ void M(c.a aVar, boolean z10) {
        t1.b.Y(this, aVar, z10);
    }

    @Override // t1.c
    public void N(c3 c3Var, c.b bVar) {
        if (bVar.d() == 0) {
            return;
        }
        L0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        R0(c3Var, bVar);
        N0(elapsedRealtime);
        P0(c3Var, bVar, elapsedRealtime);
        M0(elapsedRealtime);
        O0(c3Var, bVar, elapsedRealtime);
        if (bVar.a(1028)) {
            this.f18120b.f(bVar.c(1028));
        }
    }

    @Override // t1.c
    public /* synthetic */ void O(c.a aVar) {
        t1.b.W(this, aVar);
    }

    @Override // t1.s1.a
    public void P(c.a aVar, String str, String str2) {
    }

    @Override // t1.s1.a
    public void Q(c.a aVar, String str) {
        u.b bVar = aVar.f17983d;
        if (bVar == null || !bVar.b()) {
            B0();
            this.f18127i = str;
            this.f18128j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.7");
            T0(aVar.f17981b, aVar.f17983d);
        }
    }

    @Override // t1.s1.a
    public void R(c.a aVar, String str, boolean z10) {
        u.b bVar = aVar.f17983d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f18127i)) {
            B0();
        }
        this.f18125g.remove(str);
        this.f18126h.remove(str);
    }

    @Override // t1.s1.a
    public void S(c.a aVar, String str) {
    }

    @Override // t1.c
    public /* synthetic */ void T(c.a aVar, s1.n1 n1Var, v1.i iVar) {
        t1.b.i(this, aVar, n1Var, iVar);
    }

    @Override // t1.c
    public /* synthetic */ void U(c.a aVar, Exception exc) {
        t1.b.b(this, aVar, exc);
    }

    @Override // t1.c
    public /* synthetic */ void V(c.a aVar, int i10, long j10, long j11) {
        t1.b.l(this, aVar, i10, j10, j11);
    }

    @Override // t1.c
    public /* synthetic */ void W(c.a aVar, s1.n1 n1Var) {
        t1.b.j0(this, aVar, n1Var);
    }

    @Override // t1.c
    public /* synthetic */ void X(c.a aVar, int i10, long j10) {
        t1.b.C(this, aVar, i10, j10);
    }

    @Override // t1.c
    public /* synthetic */ void Y(c.a aVar, String str, long j10) {
        t1.b.c(this, aVar, str, j10);
    }

    @Override // t1.c
    public /* synthetic */ void Z(c.a aVar, v1 v1Var, int i10) {
        t1.b.J(this, aVar, v1Var, i10);
    }

    @Override // t1.c
    public /* synthetic */ void a(c.a aVar) {
        t1.b.y(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void a0(c.a aVar, boolean z10) {
        t1.b.I(this, aVar, z10);
    }

    @Override // t1.c
    public /* synthetic */ void b(c.a aVar, int i10, s1.n1 n1Var) {
        t1.b.s(this, aVar, i10, n1Var);
    }

    @Override // t1.c
    public /* synthetic */ void b0(c.a aVar, Object obj, long j10) {
        t1.b.U(this, aVar, obj, j10);
    }

    @Override // t1.c
    public /* synthetic */ void c(c.a aVar, long j10, int i10) {
        t1.b.i0(this, aVar, j10, i10);
    }

    @Override // t1.c
    public /* synthetic */ void c0(c.a aVar, boolean z10, int i10) {
        t1.b.M(this, aVar, z10, i10);
    }

    @Override // t1.c
    public /* synthetic */ void d(c.a aVar, String str, long j10) {
        t1.b.e0(this, aVar, str, j10);
    }

    @Override // t1.c
    public /* synthetic */ void d0(c.a aVar, int i10, int i11) {
        t1.b.Z(this, aVar, i10, i11);
    }

    @Override // t1.c
    public void e(c.a aVar, q3.z zVar) {
        b bVar = this.f18133o;
        if (bVar != null) {
            s1.n1 n1Var = bVar.f18147a;
            if (n1Var.A == -1) {
                this.f18133o = new b(n1Var.b().n0(zVar.f16163j).S(zVar.f16164k).G(), bVar.f18148b, bVar.f18149c);
            }
        }
    }

    @Override // t1.c
    public /* synthetic */ void e0(c.a aVar) {
        t1.b.X(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void f(c.a aVar) {
        t1.b.B(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void f0(c.a aVar, int i10, int i11, int i12, float f10) {
        t1.b.l0(this, aVar, i10, i11, i12, f10);
    }

    @Override // t1.c
    public /* synthetic */ void g(c.a aVar, u2.q qVar) {
        t1.b.c0(this, aVar, qVar);
    }

    @Override // t1.c
    public /* synthetic */ void g0(c.a aVar, s1.o oVar) {
        t1.b.t(this, aVar, oVar);
    }

    @Override // t1.c
    public void h(c.a aVar, int i10, long j10, long j11) {
        u.b bVar = aVar.f17983d;
        if (bVar != null) {
            String d10 = this.f18120b.d(aVar.f17981b, (u.b) p3.a.e(bVar));
            Long l10 = this.f18126h.get(d10);
            Long l11 = this.f18125g.get(d10);
            this.f18126h.put(d10, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f18125g.put(d10, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // t1.c
    public /* synthetic */ void h0(c.a aVar, String str) {
        t1.b.e(this, aVar, str);
    }

    @Override // t1.c
    public void i(c.a aVar, u2.q qVar) {
        if (aVar.f17983d == null) {
            return;
        }
        b bVar = new b((s1.n1) p3.a.e(qVar.f18949c), qVar.f18950d, this.f18120b.d(aVar.f17981b, (u.b) p3.a.e(aVar.f17983d)));
        int i10 = qVar.f18948b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f18134p = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f18135q = bVar;
                return;
            }
        }
        this.f18133o = bVar;
    }

    @Override // t1.c
    public /* synthetic */ void i0(c.a aVar, boolean z10, int i10) {
        t1.b.S(this, aVar, z10, i10);
    }

    @Override // t1.c
    public /* synthetic */ void j(c.a aVar, v1.e eVar) {
        t1.b.f(this, aVar, eVar);
    }

    @Override // t1.c
    public void j0(c.a aVar, c3.e eVar, c3.e eVar2, int i10) {
        if (i10 == 1) {
            this.f18139u = true;
        }
        this.f18129k = i10;
    }

    @Override // t1.c
    public /* synthetic */ void k(c.a aVar, b3 b3Var) {
        t1.b.N(this, aVar, b3Var);
    }

    @Override // t1.c
    public /* synthetic */ void k0(c.a aVar, int i10) {
        t1.b.z(this, aVar, i10);
    }

    @Override // t1.c
    public /* synthetic */ void l(c.a aVar) {
        t1.b.w(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void l0(c.a aVar, int i10, v1.e eVar) {
        t1.b.q(this, aVar, i10, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void m(c.a aVar, String str, long j10, long j11) {
        t1.b.f0(this, aVar, str, j10, j11);
    }

    @Override // t1.c
    public /* synthetic */ void m0(c.a aVar) {
        t1.b.v(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void n(c.a aVar, int i10, v1.e eVar) {
        t1.b.p(this, aVar, i10, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void n0(c.a aVar, boolean z10) {
        t1.b.E(this, aVar, z10);
    }

    @Override // t1.c
    public void o(c.a aVar, v1.e eVar) {
        this.f18142x += eVar.f19357g;
        this.f18143y += eVar.f19355e;
    }

    @Override // t1.c
    public /* synthetic */ void o0(c.a aVar, u2.n nVar, u2.q qVar) {
        t1.b.H(this, aVar, nVar, qVar);
    }

    @Override // t1.c
    public /* synthetic */ void p(c.a aVar, s1.n1 n1Var) {
        t1.b.h(this, aVar, n1Var);
    }

    @Override // t1.c
    public /* synthetic */ void p0(c.a aVar, Exception exc) {
        t1.b.A(this, aVar, exc);
    }

    @Override // t1.c
    public /* synthetic */ void q(c.a aVar, int i10, String str, long j10) {
        t1.b.r(this, aVar, i10, str, j10);
    }

    @Override // t1.c
    public /* synthetic */ void q0(c.a aVar, v1.e eVar) {
        t1.b.h0(this, aVar, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void r(c.a aVar, d4 d4Var) {
        t1.b.b0(this, aVar, d4Var);
    }

    @Override // t1.c
    public /* synthetic */ void r0(c.a aVar, int i10) {
        t1.b.P(this, aVar, i10);
    }

    @Override // t1.c
    public /* synthetic */ void s(c.a aVar, y2 y2Var) {
        t1.b.Q(this, aVar, y2Var);
    }

    @Override // t1.c
    public /* synthetic */ void s0(c.a aVar, u2.n nVar, u2.q qVar) {
        t1.b.G(this, aVar, nVar, qVar);
    }

    @Override // t1.c
    public /* synthetic */ void t(c.a aVar, u2.n nVar, u2.q qVar) {
        t1.b.F(this, aVar, nVar, qVar);
    }

    @Override // t1.c
    public /* synthetic */ void t0(c.a aVar, String str) {
        t1.b.g0(this, aVar, str);
    }

    @Override // t1.c
    public /* synthetic */ void u(c.a aVar, long j10) {
        t1.b.j(this, aVar, j10);
    }

    @Override // t1.c
    public /* synthetic */ void u0(c.a aVar, int i10) {
        t1.b.a0(this, aVar, i10);
    }

    @Override // t1.c
    public /* synthetic */ void v(c.a aVar, Exception exc) {
        t1.b.k(this, aVar, exc);
    }

    @Override // t1.c
    public /* synthetic */ void v0(c.a aVar, k2.a aVar2) {
        t1.b.L(this, aVar, aVar2);
    }

    @Override // t1.c
    public /* synthetic */ void w(c.a aVar, a2 a2Var) {
        t1.b.K(this, aVar, a2Var);
    }

    @Override // t1.c
    public /* synthetic */ void w0(c.a aVar, u1.e eVar) {
        t1.b.a(this, aVar, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void x(c.a aVar, v1.e eVar) {
        t1.b.g(this, aVar, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void x0(c.a aVar, d3.e eVar) {
        t1.b.n(this, aVar, eVar);
    }

    @Override // t1.c
    public /* synthetic */ void y(c.a aVar, c3.b bVar) {
        t1.b.m(this, aVar, bVar);
    }

    @Override // t1.c
    public /* synthetic */ void y0(c.a aVar) {
        t1.b.R(this, aVar);
    }

    @Override // t1.c
    public /* synthetic */ void z(c.a aVar, String str, long j10, long j11) {
        t1.b.d(this, aVar, str, j10, j11);
    }
}
