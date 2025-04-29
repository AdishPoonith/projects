package u1;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
final class x {
    private long A;
    private long B;
    private long C;
    private long D;
    private boolean E;
    private long F;
    private long G;

    /* renamed from: a  reason: collision with root package name */
    private final a f18718a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f18719b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f18720c;

    /* renamed from: d  reason: collision with root package name */
    private int f18721d;

    /* renamed from: e  reason: collision with root package name */
    private int f18722e;

    /* renamed from: f  reason: collision with root package name */
    private w f18723f;

    /* renamed from: g  reason: collision with root package name */
    private int f18724g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18725h;

    /* renamed from: i  reason: collision with root package name */
    private long f18726i;

    /* renamed from: j  reason: collision with root package name */
    private float f18727j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f18728k;

    /* renamed from: l  reason: collision with root package name */
    private long f18729l;

    /* renamed from: m  reason: collision with root package name */
    private long f18730m;

    /* renamed from: n  reason: collision with root package name */
    private Method f18731n;

    /* renamed from: o  reason: collision with root package name */
    private long f18732o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f18733p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f18734q;

    /* renamed from: r  reason: collision with root package name */
    private long f18735r;

    /* renamed from: s  reason: collision with root package name */
    private long f18736s;

    /* renamed from: t  reason: collision with root package name */
    private long f18737t;

    /* renamed from: u  reason: collision with root package name */
    private long f18738u;

    /* renamed from: v  reason: collision with root package name */
    private long f18739v;

    /* renamed from: w  reason: collision with root package name */
    private int f18740w;

    /* renamed from: x  reason: collision with root package name */
    private int f18741x;

    /* renamed from: y  reason: collision with root package name */
    private long f18742y;

    /* renamed from: z  reason: collision with root package name */
    private long f18743z;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);

        void b(int i10, long j10);

        void c(long j10, long j11, long j12, long j13);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10);
    }

    public x(a aVar) {
        this.f18718a = (a) p3.a.e(aVar);
        if (p3.n0.f15397a >= 18) {
            try {
                this.f18731n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f18719b = new long[10];
    }

    private boolean a() {
        return this.f18725h && ((AudioTrack) p3.a.e(this.f18720c)).getPlayState() == 2 && e() == 0;
    }

    private long b(long j10) {
        return (j10 * 1000000) / this.f18724g;
    }

    private long e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f18742y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.B, this.A + ((p3.n0.Z((elapsedRealtime * 1000) - j10, this.f18727j) * this.f18724g) / 1000000));
        }
        if (elapsedRealtime - this.f18736s >= 5) {
            v(elapsedRealtime);
            this.f18736s = elapsedRealtime;
        }
        return this.f18737t + (this.f18738u << 32);
    }

    private long f() {
        return b(e());
    }

    private void l(long j10) {
        w wVar = (w) p3.a.e(this.f18723f);
        if (wVar.e(j10)) {
            long c10 = wVar.c();
            long b10 = wVar.b();
            long f10 = f();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f18718a.d(b10, c10, j10, f10);
            } else if (Math.abs(b(b10) - f10) <= 5000000) {
                wVar.a();
                return;
            } else {
                this.f18718a.c(b10, c10, j10, f10);
            }
            wVar.f();
        }
    }

    private void m() {
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f18730m >= 30000) {
            long f10 = f();
            if (f10 != 0) {
                this.f18719b[this.f18740w] = p3.n0.e0(f10, this.f18727j) - nanoTime;
                this.f18740w = (this.f18740w + 1) % 10;
                int i10 = this.f18741x;
                if (i10 < 10) {
                    this.f18741x = i10 + 1;
                }
                this.f18730m = nanoTime;
                this.f18729l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f18741x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f18729l += this.f18719b[i11] / i12;
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f18725h) {
            return;
        }
        l(nanoTime);
        n(nanoTime);
    }

    private void n(long j10) {
        Method method;
        if (!this.f18734q || (method = this.f18731n) == null || j10 - this.f18735r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) p3.n0.j((Integer) method.invoke(p3.a.e(this.f18720c), new Object[0]))).intValue() * 1000) - this.f18726i;
            this.f18732o = intValue;
            long max = Math.max(intValue, 0L);
            this.f18732o = max;
            if (max > 5000000) {
                this.f18718a.e(max);
                this.f18732o = 0L;
            }
        } catch (Exception unused) {
            this.f18731n = null;
        }
        this.f18735r = j10;
    }

    private static boolean o(int i10) {
        return p3.n0.f15397a < 23 && (i10 == 5 || i10 == 6);
    }

    private void r() {
        this.f18729l = 0L;
        this.f18741x = 0;
        this.f18740w = 0;
        this.f18730m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f18728k = false;
    }

    private void v(long j10) {
        AudioTrack audioTrack;
        int playState = ((AudioTrack) p3.a.e(this.f18720c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f18725h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f18739v = this.f18737t;
            }
            playbackHeadPosition += this.f18739v;
        }
        if (p3.n0.f15397a <= 29) {
            if (playbackHeadPosition == 0 && this.f18737t > 0 && playState == 3) {
                if (this.f18743z == -9223372036854775807L) {
                    this.f18743z = j10;
                    return;
                }
                return;
            }
            this.f18743z = -9223372036854775807L;
        }
        if (this.f18737t > playbackHeadPosition) {
            this.f18738u++;
        }
        this.f18737t = playbackHeadPosition;
    }

    public int c(long j10) {
        return this.f18722e - ((int) (j10 - (e() * this.f18721d)));
    }

    public long d(boolean z10) {
        long f10;
        if (((AudioTrack) p3.a.e(this.f18720c)).getPlayState() == 3) {
            m();
        }
        long nanoTime = System.nanoTime() / 1000;
        w wVar = (w) p3.a.e(this.f18723f);
        boolean d10 = wVar.d();
        if (d10) {
            f10 = b(wVar.b()) + p3.n0.Z(nanoTime - wVar.c(), this.f18727j);
        } else {
            f10 = this.f18741x == 0 ? f() : p3.n0.Z(this.f18729l + nanoTime, this.f18727j);
            if (!z10) {
                f10 = Math.max(0L, f10 - this.f18732o);
            }
        }
        if (this.E != d10) {
            this.G = this.D;
            this.F = this.C;
        }
        long j10 = nanoTime - this.G;
        if (j10 < 1000000) {
            long j11 = (j10 * 1000) / 1000000;
            f10 = ((f10 * j11) + ((1000 - j11) * (this.F + p3.n0.Z(j10, this.f18727j)))) / 1000;
        }
        if (!this.f18728k) {
            long j12 = this.C;
            if (f10 > j12) {
                this.f18728k = true;
                this.f18718a.a(System.currentTimeMillis() - p3.n0.Y0(p3.n0.e0(p3.n0.Y0(f10 - j12), this.f18727j)));
            }
        }
        this.D = nanoTime;
        this.C = f10;
        this.E = d10;
        return f10;
    }

    public void g(long j10) {
        this.A = e();
        this.f18742y = SystemClock.elapsedRealtime() * 1000;
        this.B = j10;
    }

    public boolean h(long j10) {
        return j10 > e() || a();
    }

    public boolean i() {
        return ((AudioTrack) p3.a.e(this.f18720c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f18743z != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f18743z >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) p3.a.e(this.f18720c)).getPlayState();
        if (this.f18725h) {
            if (playState == 2) {
                this.f18733p = false;
                return false;
            } else if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f18733p;
        boolean h10 = h(j10);
        this.f18733p = h10;
        if (z10 && !h10 && playState != 1) {
            this.f18718a.b(this.f18722e, p3.n0.Y0(this.f18726i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f18742y == -9223372036854775807L) {
            ((w) p3.a.e(this.f18723f)).g();
            return true;
        }
        return false;
    }

    public void q() {
        r();
        this.f18720c = null;
        this.f18723f = null;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f18720c = audioTrack;
        this.f18721d = i11;
        this.f18722e = i12;
        this.f18723f = new w(audioTrack);
        this.f18724g = audioTrack.getSampleRate();
        this.f18725h = z10 && o(i10);
        boolean t02 = p3.n0.t0(i10);
        this.f18734q = t02;
        this.f18726i = t02 ? b(i12 / i11) : -9223372036854775807L;
        this.f18737t = 0L;
        this.f18738u = 0L;
        this.f18739v = 0L;
        this.f18733p = false;
        this.f18742y = -9223372036854775807L;
        this.f18743z = -9223372036854775807L;
        this.f18735r = 0L;
        this.f18732o = 0L;
        this.f18727j = 1.0f;
    }

    public void t(float f10) {
        this.f18727j = f10;
        w wVar = this.f18723f;
        if (wVar != null) {
            wVar.g();
        }
        r();
    }

    public void u() {
        ((w) p3.a.e(this.f18723f)).g();
    }
}
