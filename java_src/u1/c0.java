package u1;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import s1.b3;
import s1.n1;
import s1.s;
import t1.t1;
import u1.d0;
import u1.g;
import u1.v;
import u1.x;
/* loaded from: classes.dex */
public final class c0 implements v {

    /* renamed from: e0  reason: collision with root package name */
    public static boolean f18484e0 = false;

    /* renamed from: f0  reason: collision with root package name */
    private static final Object f18485f0 = new Object();

    /* renamed from: g0  reason: collision with root package name */
    private static ExecutorService f18486g0;

    /* renamed from: h0  reason: collision with root package name */
    private static int f18487h0;
    private ByteBuffer A;
    private int B;
    private long C;
    private long D;
    private long E;
    private long F;
    private int G;
    private boolean H;
    private boolean I;
    private long J;
    private float K;
    private u1.g[] L;
    private ByteBuffer[] M;
    private ByteBuffer N;
    private int O;
    private ByteBuffer P;
    private byte[] Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private y Y;
    private d Z;

    /* renamed from: a  reason: collision with root package name */
    private final u1.f f18488a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f18489a0;

    /* renamed from: b  reason: collision with root package name */
    private final u1.h f18490b;

    /* renamed from: b0  reason: collision with root package name */
    private long f18491b0;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f18492c;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f18493c0;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f18494d;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f18495d0;

    /* renamed from: e  reason: collision with root package name */
    private final n0 f18496e;

    /* renamed from: f  reason: collision with root package name */
    private final u1.g[] f18497f;

    /* renamed from: g  reason: collision with root package name */
    private final u1.g[] f18498g;

    /* renamed from: h  reason: collision with root package name */
    private final p3.g f18499h;

    /* renamed from: i  reason: collision with root package name */
    private final x f18500i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque<j> f18501j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f18502k;

    /* renamed from: l  reason: collision with root package name */
    private final int f18503l;

    /* renamed from: m  reason: collision with root package name */
    private m f18504m;

    /* renamed from: n  reason: collision with root package name */
    private final k<v.b> f18505n;

    /* renamed from: o  reason: collision with root package name */
    private final k<v.e> f18506o;

    /* renamed from: p  reason: collision with root package name */
    private final e f18507p;

    /* renamed from: q  reason: collision with root package name */
    private final s.a f18508q;

    /* renamed from: r  reason: collision with root package name */
    private t1 f18509r;

    /* renamed from: s  reason: collision with root package name */
    private v.c f18510s;

    /* renamed from: t  reason: collision with root package name */
    private g f18511t;

    /* renamed from: u  reason: collision with root package name */
    private g f18512u;

    /* renamed from: v  reason: collision with root package name */
    private AudioTrack f18513v;

    /* renamed from: w  reason: collision with root package name */
    private u1.e f18514w;

    /* renamed from: x  reason: collision with root package name */
    private j f18515x;

    /* renamed from: y  reason: collision with root package name */
    private j f18516y;

    /* renamed from: z  reason: collision with root package name */
    private b3 f18517z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(AudioTrack audioTrack, d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f18518a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {
        public static void a(AudioTrack audioTrack, t1 t1Var) {
            LogSessionId a10 = t1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final AudioDeviceInfo f18518a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f18518a = audioDeviceInfo;
        }
    }

    /* loaded from: classes.dex */
    public interface e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f18519a = new d0.a().g();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: b  reason: collision with root package name */
        private u1.h f18521b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f18522c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f18523d;

        /* renamed from: g  reason: collision with root package name */
        s.a f18526g;

        /* renamed from: a  reason: collision with root package name */
        private u1.f f18520a = u1.f.f18587c;

        /* renamed from: e  reason: collision with root package name */
        private int f18524e = 0;

        /* renamed from: f  reason: collision with root package name */
        e f18525f = e.f18519a;

        public c0 f() {
            if (this.f18521b == null) {
                this.f18521b = new h(new u1.g[0]);
            }
            return new c0(this);
        }

        public f g(u1.f fVar) {
            p3.a.e(fVar);
            this.f18520a = fVar;
            return this;
        }

        public f h(boolean z10) {
            this.f18523d = z10;
            return this;
        }

        public f i(boolean z10) {
            this.f18522c = z10;
            return this;
        }

        public f j(int i10) {
            this.f18524e = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final n1 f18527a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18528b;

        /* renamed from: c  reason: collision with root package name */
        public final int f18529c;

        /* renamed from: d  reason: collision with root package name */
        public final int f18530d;

        /* renamed from: e  reason: collision with root package name */
        public final int f18531e;

        /* renamed from: f  reason: collision with root package name */
        public final int f18532f;

        /* renamed from: g  reason: collision with root package name */
        public final int f18533g;

        /* renamed from: h  reason: collision with root package name */
        public final int f18534h;

        /* renamed from: i  reason: collision with root package name */
        public final u1.g[] f18535i;

        public g(n1 n1Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, u1.g[] gVarArr) {
            this.f18527a = n1Var;
            this.f18528b = i10;
            this.f18529c = i11;
            this.f18530d = i12;
            this.f18531e = i13;
            this.f18532f = i14;
            this.f18533g = i15;
            this.f18534h = i16;
            this.f18535i = gVarArr;
        }

        private AudioTrack d(boolean z10, u1.e eVar, int i10) {
            int i11 = p3.n0.f15397a;
            return i11 >= 29 ? f(z10, eVar, i10) : i11 >= 21 ? e(z10, eVar, i10) : g(eVar, i10);
        }

        private AudioTrack e(boolean z10, u1.e eVar, int i10) {
            return new AudioTrack(i(eVar, z10), c0.O(this.f18531e, this.f18532f, this.f18533g), this.f18534h, 1, i10);
        }

        private AudioTrack f(boolean z10, u1.e eVar, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(i(eVar, z10)).setAudioFormat(c0.O(this.f18531e, this.f18532f, this.f18533g)).setTransferMode(1).setBufferSizeInBytes(this.f18534h).setSessionId(i10).setOffloadedPlayback(this.f18529c == 1).build();
        }

        private AudioTrack g(u1.e eVar, int i10) {
            int f02 = p3.n0.f0(eVar.f18574l);
            int i11 = this.f18531e;
            int i12 = this.f18532f;
            int i13 = this.f18533g;
            int i14 = this.f18534h;
            return i10 == 0 ? new AudioTrack(f02, i11, i12, i13, i14, 1) : new AudioTrack(f02, i11, i12, i13, i14, 1, i10);
        }

        private static AudioAttributes i(u1.e eVar, boolean z10) {
            return z10 ? j() : eVar.b().f18578a;
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z10, u1.e eVar, int i10) {
            try {
                AudioTrack d10 = d(z10, eVar, i10);
                int state = d10.getState();
                if (state == 1) {
                    return d10;
                }
                try {
                    d10.release();
                } catch (Exception unused) {
                }
                throw new v.b(state, this.f18531e, this.f18532f, this.f18534h, this.f18527a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new v.b(0, this.f18531e, this.f18532f, this.f18534h, this.f18527a, l(), e10);
            }
        }

        public boolean b(g gVar) {
            return gVar.f18529c == this.f18529c && gVar.f18533g == this.f18533g && gVar.f18531e == this.f18531e && gVar.f18532f == this.f18532f && gVar.f18530d == this.f18530d;
        }

        public g c(int i10) {
            return new g(this.f18527a, this.f18528b, this.f18529c, this.f18530d, this.f18531e, this.f18532f, this.f18533g, i10, this.f18535i);
        }

        public long h(long j10) {
            return (j10 * 1000000) / this.f18531e;
        }

        public long k(long j10) {
            return (j10 * 1000000) / this.f18527a.I;
        }

        public boolean l() {
            return this.f18529c == 1;
        }
    }

    /* loaded from: classes.dex */
    public static class h implements u1.h {

        /* renamed from: a  reason: collision with root package name */
        private final u1.g[] f18536a;

        /* renamed from: b  reason: collision with root package name */
        private final k0 f18537b;

        /* renamed from: c  reason: collision with root package name */
        private final m0 f18538c;

        public h(u1.g... gVarArr) {
            this(gVarArr, new k0(), new m0());
        }

        public h(u1.g[] gVarArr, k0 k0Var, m0 m0Var) {
            u1.g[] gVarArr2 = new u1.g[gVarArr.length + 2];
            this.f18536a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f18537b = k0Var;
            this.f18538c = m0Var;
            gVarArr2[gVarArr.length] = k0Var;
            gVarArr2[gVarArr.length + 1] = m0Var;
        }

        @Override // u1.h
        public long a() {
            return this.f18537b.p();
        }

        @Override // u1.h
        public boolean b(boolean z10) {
            this.f18537b.v(z10);
            return z10;
        }

        @Override // u1.h
        public long c(long j10) {
            return this.f18538c.g(j10);
        }

        @Override // u1.h
        public u1.g[] d() {
            return this.f18536a;
        }

        @Override // u1.h
        public b3 e(b3 b3Var) {
            this.f18538c.i(b3Var.f17108j);
            this.f18538c.h(b3Var.f17109k);
            return b3Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends RuntimeException {
        private i(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        public final b3 f18539a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18540b;

        /* renamed from: c  reason: collision with root package name */
        public final long f18541c;

        /* renamed from: d  reason: collision with root package name */
        public final long f18542d;

        private j(b3 b3Var, boolean z10, long j10, long j11) {
            this.f18539a = b3Var;
            this.f18540b = z10;
            this.f18541c = j10;
            this.f18542d = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class k<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        private final long f18543a;

        /* renamed from: b  reason: collision with root package name */
        private T f18544b;

        /* renamed from: c  reason: collision with root package name */
        private long f18545c;

        public k(long j10) {
            this.f18543a = j10;
        }

        public void a() {
            this.f18544b = null;
        }

        public void b(T t10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f18544b == null) {
                this.f18544b = t10;
                this.f18545c = this.f18543a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f18545c) {
                T t11 = this.f18544b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f18544b;
                a();
                throw t12;
            }
        }
    }

    /* loaded from: classes.dex */
    private final class l implements x.a {
        private l() {
        }

        @Override // u1.x.a
        public void a(long j10) {
            if (c0.this.f18510s != null) {
                c0.this.f18510s.a(j10);
            }
        }

        @Override // u1.x.a
        public void b(int i10, long j10) {
            if (c0.this.f18510s != null) {
                c0.this.f18510s.g(i10, j10, SystemClock.elapsedRealtime() - c0.this.f18491b0);
            }
        }

        @Override // u1.x.a
        public void c(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + c0.this.V() + ", " + c0.this.W();
            if (c0.f18484e0) {
                throw new i(str);
            }
            p3.r.i("DefaultAudioSink", str);
        }

        @Override // u1.x.a
        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + c0.this.V() + ", " + c0.this.W();
            if (c0.f18484e0) {
                throw new i(str);
            }
            p3.r.i("DefaultAudioSink", str);
        }

        @Override // u1.x.a
        public void e(long j10) {
            p3.r.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class m {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f18547a = new Handler(Looper.myLooper());

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f18548b;

        /* loaded from: classes.dex */
        class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c0 f18550a;

            a(c0 c0Var) {
                this.f18550a = c0Var;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(c0.this.f18513v) && c0.this.f18510s != null && c0.this.V) {
                    c0.this.f18510s.f();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(c0.this.f18513v) && c0.this.f18510s != null && c0.this.V) {
                    c0.this.f18510s.f();
                }
            }
        }

        public m() {
            this.f18548b = new a(c0.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f18547a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new n3.p(handler), this.f18548b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f18548b);
            this.f18547a.removeCallbacksAndMessages(null);
        }
    }

    private c0(f fVar) {
        this.f18488a = fVar.f18520a;
        u1.h hVar = fVar.f18521b;
        this.f18490b = hVar;
        int i10 = p3.n0.f15397a;
        this.f18492c = i10 >= 21 && fVar.f18522c;
        this.f18502k = i10 >= 23 && fVar.f18523d;
        this.f18503l = i10 >= 29 ? fVar.f18524e : 0;
        this.f18507p = fVar.f18525f;
        p3.g gVar = new p3.g(p3.d.f15342a);
        this.f18499h = gVar;
        gVar.e();
        this.f18500i = new x(new l());
        a0 a0Var = new a0();
        this.f18494d = a0Var;
        n0 n0Var = new n0();
        this.f18496e = n0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new j0(), a0Var, n0Var);
        Collections.addAll(arrayList, hVar.d());
        this.f18497f = (u1.g[]) arrayList.toArray(new u1.g[0]);
        this.f18498g = new u1.g[]{new f0()};
        this.K = 1.0f;
        this.f18514w = u1.e.f18565p;
        this.X = 0;
        this.Y = new y(0, 0.0f);
        b3 b3Var = b3.f17104m;
        this.f18516y = new j(b3Var, false, 0L, 0L);
        this.f18517z = b3Var;
        this.S = -1;
        this.L = new u1.g[0];
        this.M = new ByteBuffer[0];
        this.f18501j = new ArrayDeque<>();
        this.f18505n = new k<>(100L);
        this.f18506o = new k<>(100L);
        this.f18508q = fVar.f18526g;
    }

    private void H(long j10) {
        b3 e10 = o0() ? this.f18490b.e(P()) : b3.f17104m;
        boolean b10 = o0() ? this.f18490b.b(U()) : false;
        this.f18501j.add(new j(e10, b10, Math.max(0L, j10), this.f18512u.h(W())));
        n0();
        v.c cVar = this.f18510s;
        if (cVar != null) {
            cVar.b(b10);
        }
    }

    private long I(long j10) {
        while (!this.f18501j.isEmpty() && j10 >= this.f18501j.getFirst().f18542d) {
            this.f18516y = this.f18501j.remove();
        }
        j jVar = this.f18516y;
        long j11 = j10 - jVar.f18542d;
        if (jVar.f18539a.equals(b3.f17104m)) {
            return this.f18516y.f18541c + j11;
        }
        if (this.f18501j.isEmpty()) {
            return this.f18516y.f18541c + this.f18490b.c(j11);
        }
        j first = this.f18501j.getFirst();
        return first.f18541c - p3.n0.Z(first.f18542d - j10, this.f18516y.f18539a.f17108j);
    }

    private long J(long j10) {
        return j10 + this.f18512u.h(this.f18490b.a());
    }

    private AudioTrack K(g gVar) {
        try {
            AudioTrack a10 = gVar.a(this.f18489a0, this.f18514w, this.X);
            s.a aVar = this.f18508q;
            if (aVar != null) {
                aVar.C(a0(a10));
            }
            return a10;
        } catch (v.b e10) {
            v.c cVar = this.f18510s;
            if (cVar != null) {
                cVar.c(e10);
            }
            throw e10;
        }
    }

    private AudioTrack L() {
        try {
            return K((g) p3.a.e(this.f18512u));
        } catch (v.b e10) {
            g gVar = this.f18512u;
            if (gVar.f18534h > 1000000) {
                g c10 = gVar.c(1000000);
                try {
                    AudioTrack K = K(c10);
                    this.f18512u = c10;
                    return K;
                } catch (v.b e11) {
                    e10.addSuppressed(e11);
                    c0();
                    throw e10;
                }
            }
            c0();
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean M() {
        /*
            r9 = this;
            int r0 = r9.S
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.S = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.S
            u1.g[] r5 = r9.L
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.d()
        L1f:
            r9.e0(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.S
            int r0 = r0 + r2
            r9.S = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L3b
            r9.r0(r0, r7)
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.S = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.c0.M():boolean");
    }

    private void N() {
        int i10 = 0;
        while (true) {
            u1.g[] gVarArr = this.L;
            if (i10 >= gVarArr.length) {
                return;
            }
            u1.g gVar = gVarArr[i10];
            gVar.flush();
            this.M[i10] = gVar.c();
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat O(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private b3 P() {
        return S().f18539a;
    }

    private static int Q(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        p3.a.f(minBufferSize != -2);
        return minBufferSize;
    }

    private static int R(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return u1.b.e(byteBuffer);
            case 7:
            case 8:
                return e0.e(byteBuffer);
            case 9:
                int m10 = h0.m(p3.n0.I(byteBuffer, byteBuffer.position()));
                if (m10 != -1) {
                    return m10;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
            case 14:
                int b10 = u1.b.b(byteBuffer);
                if (b10 == -1) {
                    return 0;
                }
                return u1.b.i(byteBuffer, b10) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return u1.c.c(byteBuffer);
            case 20:
                return i0.g(byteBuffer);
        }
    }

    private j S() {
        j jVar = this.f18515x;
        return jVar != null ? jVar : !this.f18501j.isEmpty() ? this.f18501j.getLast() : this.f18516y;
    }

    private int T(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = p3.n0.f15397a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && p3.n0.f15400d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long V() {
        g gVar = this.f18512u;
        return gVar.f18529c == 0 ? this.C / gVar.f18528b : this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long W() {
        g gVar = this.f18512u;
        return gVar.f18529c == 0 ? this.E / gVar.f18530d : this.F;
    }

    private boolean X() {
        t1 t1Var;
        if (this.f18499h.d()) {
            AudioTrack L = L();
            this.f18513v = L;
            if (a0(L)) {
                f0(this.f18513v);
                if (this.f18503l != 3) {
                    AudioTrack audioTrack = this.f18513v;
                    n1 n1Var = this.f18512u.f18527a;
                    audioTrack.setOffloadDelayPadding(n1Var.K, n1Var.L);
                }
            }
            int i10 = p3.n0.f15397a;
            if (i10 >= 31 && (t1Var = this.f18509r) != null) {
                c.a(this.f18513v, t1Var);
            }
            this.X = this.f18513v.getAudioSessionId();
            x xVar = this.f18500i;
            AudioTrack audioTrack2 = this.f18513v;
            g gVar = this.f18512u;
            xVar.s(audioTrack2, gVar.f18529c == 2, gVar.f18533g, gVar.f18530d, gVar.f18534h);
            k0();
            int i11 = this.Y.f18744a;
            if (i11 != 0) {
                this.f18513v.attachAuxEffect(i11);
                this.f18513v.setAuxEffectSendLevel(this.Y.f18745b);
            }
            d dVar = this.Z;
            if (dVar != null && i10 >= 23) {
                b.a(this.f18513v, dVar);
            }
            this.I = true;
            return true;
        }
        return false;
    }

    private static boolean Y(int i10) {
        return (p3.n0.f15397a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean Z() {
        return this.f18513v != null;
    }

    private static boolean a0(AudioTrack audioTrack) {
        return p3.n0.f15397a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b0(AudioTrack audioTrack, p3.g gVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            gVar.e();
            synchronized (f18485f0) {
                int i10 = f18487h0 - 1;
                f18487h0 = i10;
                if (i10 == 0) {
                    f18486g0.shutdown();
                    f18486g0 = null;
                }
            }
        } catch (Throwable th) {
            gVar.e();
            synchronized (f18485f0) {
                int i11 = f18487h0 - 1;
                f18487h0 = i11;
                if (i11 == 0) {
                    f18486g0.shutdown();
                    f18486g0 = null;
                }
                throw th;
            }
        }
    }

    private void c0() {
        if (this.f18512u.l()) {
            this.f18493c0 = true;
        }
    }

    private void d0() {
        if (this.U) {
            return;
        }
        this.U = true;
        this.f18500i.g(W());
        this.f18513v.stop();
        this.B = 0;
    }

    private void e0(long j10) {
        ByteBuffer byteBuffer;
        int length = this.L.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.M[i10 - 1];
            } else {
                byteBuffer = this.N;
                if (byteBuffer == null) {
                    byteBuffer = u1.g.f18594a;
                }
            }
            if (i10 == length) {
                r0(byteBuffer, j10);
            } else {
                u1.g gVar = this.L[i10];
                if (i10 > this.S) {
                    gVar.e(byteBuffer);
                }
                ByteBuffer c10 = gVar.c();
                this.M[i10] = c10;
                if (c10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    private void f0(AudioTrack audioTrack) {
        if (this.f18504m == null) {
            this.f18504m = new m();
        }
        this.f18504m.a(audioTrack);
    }

    private static void g0(final AudioTrack audioTrack, final p3.g gVar) {
        gVar.c();
        synchronized (f18485f0) {
            if (f18486g0 == null) {
                f18486g0 = p3.n0.C0("ExoPlayer:AudioTrackReleaseThread");
            }
            f18487h0++;
            f18486g0.execute(new Runnable() { // from class: u1.b0
                @Override // java.lang.Runnable
                public final void run() {
                    c0.b0(audioTrack, gVar);
                }
            });
        }
    }

    private void h0() {
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.f18495d0 = false;
        this.G = 0;
        this.f18516y = new j(P(), U(), 0L, 0L);
        this.J = 0L;
        this.f18515x = null;
        this.f18501j.clear();
        this.N = null;
        this.O = 0;
        this.P = null;
        this.U = false;
        this.T = false;
        this.S = -1;
        this.A = null;
        this.B = 0;
        this.f18496e.n();
        N();
    }

    private void i0(b3 b3Var, boolean z10) {
        j S = S();
        if (b3Var.equals(S.f18539a) && z10 == S.f18540b) {
            return;
        }
        j jVar = new j(b3Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (Z()) {
            this.f18515x = jVar;
        } else {
            this.f18516y = jVar;
        }
    }

    private void j0(b3 b3Var) {
        if (Z()) {
            try {
                this.f18513v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(b3Var.f17108j).setPitch(b3Var.f17109k).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                p3.r.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            b3Var = new b3(this.f18513v.getPlaybackParams().getSpeed(), this.f18513v.getPlaybackParams().getPitch());
            this.f18500i.t(b3Var.f17108j);
        }
        this.f18517z = b3Var;
    }

    private void k0() {
        if (Z()) {
            if (p3.n0.f15397a >= 21) {
                l0(this.f18513v, this.K);
            } else {
                m0(this.f18513v, this.K);
            }
        }
    }

    private static void l0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void m0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void n0() {
        u1.g[] gVarArr = this.f18512u.f18535i;
        ArrayList arrayList = new ArrayList();
        for (u1.g gVar : gVarArr) {
            if (gVar.a()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.L = (u1.g[]) arrayList.toArray(new u1.g[size]);
        this.M = new ByteBuffer[size];
        N();
    }

    private boolean o0() {
        return (this.f18489a0 || !"audio/raw".equals(this.f18512u.f18527a.f17419u) || p0(this.f18512u.f18527a.J)) ? false : true;
    }

    private boolean p0(int i10) {
        return this.f18492c && p3.n0.s0(i10);
    }

    private boolean q0(n1 n1Var, u1.e eVar) {
        int f10;
        int G;
        int T;
        if (p3.n0.f15397a < 29 || this.f18503l == 0 || (f10 = p3.v.f((String) p3.a.e(n1Var.f17419u), n1Var.f17416r)) == 0 || (G = p3.n0.G(n1Var.H)) == 0 || (T = T(O(n1Var.I, G, f10), eVar.b().f18578a)) == 0) {
            return false;
        }
        if (T == 1) {
            return ((n1Var.K != 0 || n1Var.L != 0) && (this.f18503l == 1)) ? false : true;
        } else if (T == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    private void r0(ByteBuffer byteBuffer, long j10) {
        int s02;
        v.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.P;
            if (byteBuffer2 != null) {
                p3.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.P = byteBuffer;
                if (p3.n0.f15397a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.Q;
                    if (bArr == null || bArr.length < remaining) {
                        this.Q = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.Q, 0, remaining);
                    byteBuffer.position(position);
                    this.R = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (p3.n0.f15397a < 21) {
                int c10 = this.f18500i.c(this.E);
                if (c10 > 0) {
                    s02 = this.f18513v.write(this.Q, this.R, Math.min(remaining2, c10));
                    if (s02 > 0) {
                        this.R += s02;
                        byteBuffer.position(byteBuffer.position() + s02);
                    }
                } else {
                    s02 = 0;
                }
            } else if (this.f18489a0) {
                p3.a.f(j10 != -9223372036854775807L);
                s02 = t0(this.f18513v, byteBuffer, remaining2, j10);
            } else {
                s02 = s0(this.f18513v, byteBuffer, remaining2);
            }
            this.f18491b0 = SystemClock.elapsedRealtime();
            if (s02 < 0) {
                v.e eVar = new v.e(s02, this.f18512u.f18527a, (!Y(s02) || this.F <= 0) ? false : false);
                v.c cVar2 = this.f18510s;
                if (cVar2 != null) {
                    cVar2.c(eVar);
                }
                if (eVar.f18705k) {
                    throw eVar;
                }
                this.f18506o.b(eVar);
                return;
            }
            this.f18506o.a();
            if (a0(this.f18513v)) {
                if (this.F > 0) {
                    this.f18495d0 = false;
                }
                if (this.V && (cVar = this.f18510s) != null && s02 < remaining2 && !this.f18495d0) {
                    cVar.e();
                }
            }
            int i10 = this.f18512u.f18529c;
            if (i10 == 0) {
                this.E += s02;
            }
            if (s02 == remaining2) {
                if (i10 != 0) {
                    p3.a.f(byteBuffer == this.N);
                    this.F += this.G * this.O;
                }
                this.P = null;
            }
        }
    }

    private static int s0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int t0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (p3.n0.f15397a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.A == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.A = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.A.putInt(1431633921);
        }
        if (this.B == 0) {
            this.A.putInt(4, i10);
            this.A.putLong(8, j10 * 1000);
            this.A.position(0);
            this.B = i10;
        }
        int remaining = this.A.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.A, remaining, 1);
            if (write < 0) {
                this.B = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int s02 = s0(audioTrack, byteBuffer, i10);
        if (s02 < 0) {
            this.B = 0;
            return s02;
        }
        this.B -= s02;
        return s02;
    }

    public boolean U() {
        return S().f18540b;
    }

    @Override // u1.v
    public boolean a(n1 n1Var) {
        return y(n1Var) != 0;
    }

    @Override // u1.v
    public boolean b() {
        return !Z() || (this.T && !k());
    }

    @Override // u1.v
    public void c(b3 b3Var) {
        b3 b3Var2 = new b3(p3.n0.p(b3Var.f17108j, 0.1f, 8.0f), p3.n0.p(b3Var.f17109k, 0.1f, 8.0f));
        if (!this.f18502k || p3.n0.f15397a < 23) {
            i0(b3Var2, U());
        } else {
            j0(b3Var2);
        }
    }

    @Override // u1.v
    public void d() {
        this.V = false;
        if (Z() && this.f18500i.p()) {
            this.f18513v.pause();
        }
    }

    @Override // u1.v
    public void e(float f10) {
        if (this.K != f10) {
            this.K = f10;
            k0();
        }
    }

    @Override // u1.v
    public void f(v.c cVar) {
        this.f18510s = cVar;
    }

    @Override // u1.v
    public void flush() {
        if (Z()) {
            h0();
            if (this.f18500i.i()) {
                this.f18513v.pause();
            }
            if (a0(this.f18513v)) {
                ((m) p3.a.e(this.f18504m)).b(this.f18513v);
            }
            if (p3.n0.f15397a < 21 && !this.W) {
                this.X = 0;
            }
            g gVar = this.f18511t;
            if (gVar != null) {
                this.f18512u = gVar;
                this.f18511t = null;
            }
            this.f18500i.q();
            g0(this.f18513v, this.f18499h);
            this.f18513v = null;
        }
        this.f18506o.a();
        this.f18505n.a();
    }

    @Override // u1.v
    public b3 g() {
        return this.f18502k ? this.f18517z : P();
    }

    @Override // u1.v
    public void h() {
        p3.a.f(p3.n0.f15397a >= 21);
        p3.a.f(this.W);
        if (this.f18489a0) {
            return;
        }
        this.f18489a0 = true;
        flush();
    }

    @Override // u1.v
    public void i(AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.Z = dVar;
        AudioTrack audioTrack = this.f18513v;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    @Override // u1.v
    public void j() {
        if (!this.T && Z() && M()) {
            d0();
            this.T = true;
        }
    }

    @Override // u1.v
    public boolean k() {
        return Z() && this.f18500i.h(W());
    }

    @Override // u1.v
    public void l(int i10) {
        if (this.X != i10) {
            this.X = i10;
            this.W = i10 != 0;
            flush();
        }
    }

    @Override // u1.v
    public void m(n1 n1Var, int i10, int[] iArr) {
        u1.g[] gVarArr;
        int i11;
        int intValue;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int a10;
        int[] iArr2;
        if ("audio/raw".equals(n1Var.f17419u)) {
            p3.a.a(p3.n0.t0(n1Var.J));
            i13 = p3.n0.d0(n1Var.J, n1Var.H);
            u1.g[] gVarArr2 = p0(n1Var.J) ? this.f18498g : this.f18497f;
            this.f18496e.o(n1Var.K, n1Var.L);
            if (p3.n0.f15397a < 21 && n1Var.H == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i20 = 0; i20 < 6; i20++) {
                    iArr2[i20] = i20;
                }
            } else {
                iArr2 = iArr;
            }
            this.f18494d.m(iArr2);
            g.a aVar = new g.a(n1Var.I, n1Var.H, n1Var.J);
            for (u1.g gVar : gVarArr2) {
                try {
                    g.a f10 = gVar.f(aVar);
                    if (gVar.a()) {
                        aVar = f10;
                    }
                } catch (g.b e10) {
                    throw new v.a(e10, n1Var);
                }
            }
            int i21 = aVar.f18598c;
            int i22 = aVar.f18596a;
            int G = p3.n0.G(aVar.f18597b);
            gVarArr = gVarArr2;
            i14 = p3.n0.d0(i21, aVar.f18597b);
            i12 = i21;
            i11 = i22;
            intValue = G;
            i15 = 0;
        } else {
            u1.g[] gVarArr3 = new u1.g[0];
            int i23 = n1Var.I;
            if (q0(n1Var, this.f18514w)) {
                gVarArr = gVarArr3;
                i11 = i23;
                i12 = p3.v.f((String) p3.a.e(n1Var.f17419u), n1Var.f17416r);
                intValue = p3.n0.G(n1Var.H);
                i13 = -1;
                i14 = -1;
                i15 = 1;
            } else {
                Pair<Integer, Integer> f11 = this.f18488a.f(n1Var);
                if (f11 == null) {
                    throw new v.a("Unable to configure passthrough for: " + n1Var, n1Var);
                }
                int intValue2 = ((Integer) f11.first).intValue();
                gVarArr = gVarArr3;
                i11 = i23;
                intValue = ((Integer) f11.second).intValue();
                i12 = intValue2;
                i13 = -1;
                i14 = -1;
                i15 = 2;
            }
        }
        if (i12 == 0) {
            throw new v.a("Invalid output encoding (mode=" + i15 + ") for: " + n1Var, n1Var);
        } else if (intValue == 0) {
            throw new v.a("Invalid output channel config (mode=" + i15 + ") for: " + n1Var, n1Var);
        } else {
            if (i10 != 0) {
                a10 = i10;
                i16 = i12;
                i17 = intValue;
                i18 = i14;
                i19 = i11;
            } else {
                i16 = i12;
                i17 = intValue;
                i18 = i14;
                i19 = i11;
                a10 = this.f18507p.a(Q(i11, intValue, i12), i12, i15, i14 != -1 ? i14 : 1, i11, n1Var.f17415q, this.f18502k ? 8.0d : 1.0d);
            }
            this.f18493c0 = false;
            g gVar2 = new g(n1Var, i13, i15, i18, i19, i17, i16, a10, gVarArr);
            if (Z()) {
                this.f18511t = gVar2;
            } else {
                this.f18512u = gVar2;
            }
        }
    }

    @Override // u1.v
    public void n(t1 t1Var) {
        this.f18509r = t1Var;
    }

    @Override // u1.v
    public void o() {
        this.V = true;
        if (Z()) {
            this.f18500i.u();
            this.f18513v.play();
        }
    }

    @Override // u1.v
    public boolean p(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = this.N;
        p3.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f18511t != null) {
            if (!M()) {
                return false;
            }
            if (this.f18511t.b(this.f18512u)) {
                this.f18512u = this.f18511t;
                this.f18511t = null;
                if (a0(this.f18513v) && this.f18503l != 3) {
                    if (this.f18513v.getPlayState() == 3) {
                        this.f18513v.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f18513v;
                    n1 n1Var = this.f18512u.f18527a;
                    audioTrack.setOffloadDelayPadding(n1Var.K, n1Var.L);
                    this.f18495d0 = true;
                }
            } else {
                d0();
                if (k()) {
                    return false;
                }
                flush();
            }
            H(j10);
        }
        if (!Z()) {
            try {
                if (!X()) {
                    return false;
                }
            } catch (v.b e10) {
                if (e10.f18700k) {
                    throw e10;
                }
                this.f18505n.b(e10);
                return false;
            }
        }
        this.f18505n.a();
        if (this.I) {
            this.J = Math.max(0L, j10);
            this.H = false;
            this.I = false;
            if (this.f18502k && p3.n0.f15397a >= 23) {
                j0(this.f18517z);
            }
            H(j10);
            if (this.V) {
                o();
            }
        }
        if (this.f18500i.k(W())) {
            if (this.N == null) {
                p3.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                g gVar = this.f18512u;
                if (gVar.f18529c != 0 && this.G == 0) {
                    int R = R(gVar.f18533g, byteBuffer);
                    this.G = R;
                    if (R == 0) {
                        return true;
                    }
                }
                if (this.f18515x != null) {
                    if (!M()) {
                        return false;
                    }
                    H(j10);
                    this.f18515x = null;
                }
                long k10 = this.J + this.f18512u.k(V() - this.f18496e.m());
                if (!this.H && Math.abs(k10 - j10) > 200000) {
                    v.c cVar = this.f18510s;
                    if (cVar != null) {
                        cVar.c(new v.d(j10, k10));
                    }
                    this.H = true;
                }
                if (this.H) {
                    if (!M()) {
                        return false;
                    }
                    long j11 = j10 - k10;
                    this.J += j11;
                    this.H = false;
                    H(j10);
                    v.c cVar2 = this.f18510s;
                    if (cVar2 != null && j11 != 0) {
                        cVar2.d();
                    }
                }
                if (this.f18512u.f18529c == 0) {
                    this.C += byteBuffer.remaining();
                } else {
                    this.D += this.G * i10;
                }
                this.N = byteBuffer;
                this.O = i10;
            }
            e0(j10);
            if (!this.N.hasRemaining()) {
                this.N = null;
                this.O = 0;
                return true;
            } else if (this.f18500i.j(W())) {
                p3.r.i("DefaultAudioSink", "Resetting stalled audio track");
                flush();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // u1.v
    public long q(boolean z10) {
        if (!Z() || this.I) {
            return Long.MIN_VALUE;
        }
        return J(I(Math.min(this.f18500i.d(z10), this.f18512u.h(W()))));
    }

    @Override // u1.v
    public void r(y yVar) {
        if (this.Y.equals(yVar)) {
            return;
        }
        int i10 = yVar.f18744a;
        float f10 = yVar.f18745b;
        AudioTrack audioTrack = this.f18513v;
        if (audioTrack != null) {
            if (this.Y.f18744a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f18513v.setAuxEffectSendLevel(f10);
            }
        }
        this.Y = yVar;
    }

    @Override // u1.v
    public void reset() {
        flush();
        for (u1.g gVar : this.f18497f) {
            gVar.reset();
        }
        for (u1.g gVar2 : this.f18498g) {
            gVar2.reset();
        }
        this.V = false;
        this.f18493c0 = false;
    }

    @Override // u1.v
    public void s() {
        if (this.f18489a0) {
            this.f18489a0 = false;
            flush();
        }
    }

    @Override // u1.v
    public void t(u1.e eVar) {
        if (this.f18514w.equals(eVar)) {
            return;
        }
        this.f18514w = eVar;
        if (this.f18489a0) {
            return;
        }
        flush();
    }

    @Override // u1.v
    public /* synthetic */ void u(long j10) {
        u.a(this, j10);
    }

    @Override // u1.v
    public void v() {
        if (p3.n0.f15397a < 25) {
            flush();
            return;
        }
        this.f18506o.a();
        this.f18505n.a();
        if (Z()) {
            h0();
            if (this.f18500i.i()) {
                this.f18513v.pause();
            }
            this.f18513v.flush();
            this.f18500i.q();
            x xVar = this.f18500i;
            AudioTrack audioTrack = this.f18513v;
            g gVar = this.f18512u;
            xVar.s(audioTrack, gVar.f18529c == 2, gVar.f18533g, gVar.f18530d, gVar.f18534h);
            this.I = true;
        }
    }

    @Override // u1.v
    public void w(boolean z10) {
        i0(P(), z10);
    }

    @Override // u1.v
    public void x() {
        this.H = true;
    }

    @Override // u1.v
    public int y(n1 n1Var) {
        if (!"audio/raw".equals(n1Var.f17419u)) {
            return ((this.f18493c0 || !q0(n1Var, this.f18514w)) && !this.f18488a.h(n1Var)) ? 0 : 2;
        } else if (p3.n0.t0(n1Var.J)) {
            int i10 = n1Var.J;
            return (i10 == 2 || (this.f18492c && i10 == 4)) ? 2 : 1;
        } else {
            p3.r.i("DefaultAudioSink", "Invalid PCM encoding: " + n1Var.J);
            return 0;
        }
    }
}
