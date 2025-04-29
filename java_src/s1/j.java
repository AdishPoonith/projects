package s1;

import android.os.SystemClock;
import s1.v1;
/* loaded from: classes.dex */
public final class j implements s1 {

    /* renamed from: a  reason: collision with root package name */
    private final float f17264a;

    /* renamed from: b  reason: collision with root package name */
    private final float f17265b;

    /* renamed from: c  reason: collision with root package name */
    private final long f17266c;

    /* renamed from: d  reason: collision with root package name */
    private final float f17267d;

    /* renamed from: e  reason: collision with root package name */
    private final long f17268e;

    /* renamed from: f  reason: collision with root package name */
    private final long f17269f;

    /* renamed from: g  reason: collision with root package name */
    private final float f17270g;

    /* renamed from: h  reason: collision with root package name */
    private long f17271h;

    /* renamed from: i  reason: collision with root package name */
    private long f17272i;

    /* renamed from: j  reason: collision with root package name */
    private long f17273j;

    /* renamed from: k  reason: collision with root package name */
    private long f17274k;

    /* renamed from: l  reason: collision with root package name */
    private long f17275l;

    /* renamed from: m  reason: collision with root package name */
    private long f17276m;

    /* renamed from: n  reason: collision with root package name */
    private float f17277n;

    /* renamed from: o  reason: collision with root package name */
    private float f17278o;

    /* renamed from: p  reason: collision with root package name */
    private float f17279p;

    /* renamed from: q  reason: collision with root package name */
    private long f17280q;

    /* renamed from: r  reason: collision with root package name */
    private long f17281r;

    /* renamed from: s  reason: collision with root package name */
    private long f17282s;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f17283a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f17284b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f17285c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f17286d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f17287e = p3.n0.B0(20);

        /* renamed from: f  reason: collision with root package name */
        private long f17288f = p3.n0.B0(500);

        /* renamed from: g  reason: collision with root package name */
        private float f17289g = 0.999f;

        public j a() {
            return new j(this.f17283a, this.f17284b, this.f17285c, this.f17286d, this.f17287e, this.f17288f, this.f17289g);
        }
    }

    private j(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f17264a = f10;
        this.f17265b = f11;
        this.f17266c = j10;
        this.f17267d = f12;
        this.f17268e = j11;
        this.f17269f = j12;
        this.f17270g = f13;
        this.f17271h = -9223372036854775807L;
        this.f17272i = -9223372036854775807L;
        this.f17274k = -9223372036854775807L;
        this.f17275l = -9223372036854775807L;
        this.f17278o = f10;
        this.f17277n = f11;
        this.f17279p = 1.0f;
        this.f17280q = -9223372036854775807L;
        this.f17273j = -9223372036854775807L;
        this.f17276m = -9223372036854775807L;
        this.f17281r = -9223372036854775807L;
        this.f17282s = -9223372036854775807L;
    }

    private void f(long j10) {
        long j11 = this.f17281r + (this.f17282s * 3);
        if (this.f17276m > j11) {
            float B0 = (float) p3.n0.B0(this.f17266c);
            this.f17276m = e5.g.c(j11, this.f17273j, this.f17276m - (((this.f17279p - 1.0f) * B0) + ((this.f17277n - 1.0f) * B0)));
            return;
        }
        long r10 = p3.n0.r(j10 - (Math.max(0.0f, this.f17279p - 1.0f) / this.f17267d), this.f17276m, j11);
        this.f17276m = r10;
        long j12 = this.f17275l;
        if (j12 == -9223372036854775807L || r10 <= j12) {
            return;
        }
        this.f17276m = j12;
    }

    private void g() {
        long j10 = this.f17271h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f17272i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f17274k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f17275l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f17273j == j10) {
            return;
        }
        this.f17273j = j10;
        this.f17276m = j10;
        this.f17281r = -9223372036854775807L;
        this.f17282s = -9223372036854775807L;
        this.f17280q = -9223372036854775807L;
    }

    private static long h(long j10, long j11, float f10) {
        return (((float) j10) * f10) + ((1.0f - f10) * ((float) j11));
    }

    private void i(long j10, long j11) {
        long h10;
        long j12 = j10 - j11;
        long j13 = this.f17281r;
        if (j13 == -9223372036854775807L) {
            this.f17281r = j12;
            h10 = 0;
        } else {
            long max = Math.max(j12, h(j13, j12, this.f17270g));
            this.f17281r = max;
            h10 = h(this.f17282s, Math.abs(j12 - max), this.f17270g);
        }
        this.f17282s = h10;
    }

    @Override // s1.s1
    public void a() {
        long j10 = this.f17276m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f17269f;
        this.f17276m = j11;
        long j12 = this.f17275l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f17276m = j12;
        }
        this.f17280q = -9223372036854775807L;
    }

    @Override // s1.s1
    public void b(v1.g gVar) {
        this.f17271h = p3.n0.B0(gVar.f17666j);
        this.f17274k = p3.n0.B0(gVar.f17667k);
        this.f17275l = p3.n0.B0(gVar.f17668l);
        float f10 = gVar.f17669m;
        if (f10 == -3.4028235E38f) {
            f10 = this.f17264a;
        }
        this.f17278o = f10;
        float f11 = gVar.f17670n;
        if (f11 == -3.4028235E38f) {
            f11 = this.f17265b;
        }
        this.f17277n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f17271h = -9223372036854775807L;
        }
        g();
    }

    @Override // s1.s1
    public float c(long j10, long j11) {
        if (this.f17271h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f17280q == -9223372036854775807L || SystemClock.elapsedRealtime() - this.f17280q >= this.f17266c) {
            this.f17280q = SystemClock.elapsedRealtime();
            f(j10);
            long j12 = j10 - this.f17276m;
            if (Math.abs(j12) < this.f17268e) {
                this.f17279p = 1.0f;
            } else {
                this.f17279p = p3.n0.p((this.f17267d * ((float) j12)) + 1.0f, this.f17278o, this.f17277n);
            }
            return this.f17279p;
        }
        return this.f17279p;
    }

    @Override // s1.s1
    public void d(long j10) {
        this.f17272i = j10;
        g();
    }

    @Override // s1.s1
    public long e() {
        return this.f17276m;
    }
}
