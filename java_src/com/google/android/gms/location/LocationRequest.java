package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import c4.q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h4.n;
import q4.h0;
import q4.z;
import t4.p;
import t4.s;
/* loaded from: classes.dex */
public final class LocationRequest extends d4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();

    /* renamed from: j  reason: collision with root package name */
    private int f5809j;

    /* renamed from: k  reason: collision with root package name */
    private long f5810k;

    /* renamed from: l  reason: collision with root package name */
    private long f5811l;

    /* renamed from: m  reason: collision with root package name */
    private long f5812m;

    /* renamed from: n  reason: collision with root package name */
    private long f5813n;

    /* renamed from: o  reason: collision with root package name */
    private int f5814o;

    /* renamed from: p  reason: collision with root package name */
    private float f5815p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5816q;

    /* renamed from: r  reason: collision with root package name */
    private long f5817r;

    /* renamed from: s  reason: collision with root package name */
    private final int f5818s;

    /* renamed from: t  reason: collision with root package name */
    private final int f5819t;

    /* renamed from: u  reason: collision with root package name */
    private final String f5820u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f5821v;

    /* renamed from: w  reason: collision with root package name */
    private final WorkSource f5822w;

    /* renamed from: x  reason: collision with root package name */
    private final z f5823x;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f5824a;

        /* renamed from: b  reason: collision with root package name */
        private long f5825b;

        /* renamed from: c  reason: collision with root package name */
        private long f5826c;

        /* renamed from: d  reason: collision with root package name */
        private long f5827d;

        /* renamed from: e  reason: collision with root package name */
        private long f5828e;

        /* renamed from: f  reason: collision with root package name */
        private int f5829f;

        /* renamed from: g  reason: collision with root package name */
        private float f5830g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f5831h;

        /* renamed from: i  reason: collision with root package name */
        private long f5832i;

        /* renamed from: j  reason: collision with root package name */
        private int f5833j;

        /* renamed from: k  reason: collision with root package name */
        private int f5834k;

        /* renamed from: l  reason: collision with root package name */
        private String f5835l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f5836m;

        /* renamed from: n  reason: collision with root package name */
        private WorkSource f5837n;

        /* renamed from: o  reason: collision with root package name */
        private z f5838o;

        public a(LocationRequest locationRequest) {
            this.f5824a = locationRequest.K();
            this.f5825b = locationRequest.E();
            this.f5826c = locationRequest.J();
            this.f5827d = locationRequest.G();
            this.f5828e = locationRequest.C();
            this.f5829f = locationRequest.H();
            this.f5830g = locationRequest.I();
            this.f5831h = locationRequest.N();
            this.f5832i = locationRequest.F();
            this.f5833j = locationRequest.D();
            this.f5834k = locationRequest.S();
            this.f5835l = locationRequest.V();
            this.f5836m = locationRequest.W();
            this.f5837n = locationRequest.T();
            this.f5838o = locationRequest.U();
        }

        public LocationRequest a() {
            int i10 = this.f5824a;
            long j10 = this.f5825b;
            long j11 = this.f5826c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.f5827d, this.f5825b);
            long j12 = this.f5828e;
            int i11 = this.f5829f;
            float f10 = this.f5830g;
            boolean z10 = this.f5831h;
            long j13 = this.f5832i;
            return new LocationRequest(i10, j10, j11, max, Long.MAX_VALUE, j12, i11, f10, z10, j13 == -1 ? this.f5825b : j13, this.f5833j, this.f5834k, this.f5835l, this.f5836m, new WorkSource(this.f5837n), this.f5838o);
        }

        public a b(int i10) {
            s.a(i10);
            this.f5833j = i10;
            return this;
        }

        public a c(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            c4.s.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f5832i = j10;
            return this;
        }

        public a d(boolean z10) {
            this.f5831h = z10;
            return this;
        }

        public final a e(boolean z10) {
            this.f5836m = z10;
            return this;
        }

        @Deprecated
        public final a f(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.f5835l = str;
            }
            return this;
        }

        public final a g(int i10) {
            boolean z10;
            int i11 = 2;
            if (i10 == 0 || i10 == 1) {
                i11 = i10;
            } else if (i10 != 2) {
                i11 = i10;
                z10 = false;
                c4.s.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
                this.f5834k = i11;
                return this;
            } else {
                i10 = 2;
            }
            z10 = true;
            c4.s.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
            this.f5834k = i11;
            return this;
        }

        public final a h(WorkSource workSource) {
            this.f5837n = workSource;
            return this;
        }
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, String str, boolean z11, WorkSource workSource, z zVar) {
        this.f5809j = i10;
        long j16 = j10;
        this.f5810k = j16;
        this.f5811l = j11;
        this.f5812m = j12;
        this.f5813n = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f5814o = i11;
        this.f5815p = f10;
        this.f5816q = z10;
        this.f5817r = j15 != -1 ? j15 : j16;
        this.f5818s = i12;
        this.f5819t = i13;
        this.f5820u = str;
        this.f5821v = z11;
        this.f5822w = workSource;
        this.f5823x = zVar;
    }

    @Deprecated
    public static LocationRequest B() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    private static String X(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : h0.a(j10);
    }

    public long C() {
        return this.f5813n;
    }

    public int D() {
        return this.f5818s;
    }

    public long E() {
        return this.f5810k;
    }

    public long F() {
        return this.f5817r;
    }

    public long G() {
        return this.f5812m;
    }

    public int H() {
        return this.f5814o;
    }

    public float I() {
        return this.f5815p;
    }

    public long J() {
        return this.f5811l;
    }

    public int K() {
        return this.f5809j;
    }

    public boolean L() {
        long j10 = this.f5812m;
        return j10 > 0 && (j10 >> 1) >= this.f5810k;
    }

    public boolean M() {
        return this.f5809j == 105;
    }

    public boolean N() {
        return this.f5816q;
    }

    @Deprecated
    public LocationRequest O(long j10) {
        c4.s.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
        this.f5811l = j10;
        return this;
    }

    @Deprecated
    public LocationRequest P(long j10) {
        c4.s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f5811l;
        long j12 = this.f5810k;
        if (j11 == j12 / 6) {
            this.f5811l = j10 / 6;
        }
        if (this.f5817r == j12) {
            this.f5817r = j10;
        }
        this.f5810k = j10;
        return this;
    }

    @Deprecated
    public LocationRequest Q(int i10) {
        p.a(i10);
        this.f5809j = i10;
        return this;
    }

    @Deprecated
    public LocationRequest R(float f10) {
        if (f10 >= 0.0f) {
            this.f5815p = f10;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f10);
    }

    public final int S() {
        return this.f5819t;
    }

    public final WorkSource T() {
        return this.f5822w;
    }

    public final z U() {
        return this.f5823x;
    }

    @Deprecated
    public final String V() {
        return this.f5820u;
    }

    public final boolean W() {
        return this.f5821v;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f5809j == locationRequest.f5809j && ((M() || this.f5810k == locationRequest.f5810k) && this.f5811l == locationRequest.f5811l && L() == locationRequest.L() && ((!L() || this.f5812m == locationRequest.f5812m) && this.f5813n == locationRequest.f5813n && this.f5814o == locationRequest.f5814o && this.f5815p == locationRequest.f5815p && this.f5816q == locationRequest.f5816q && this.f5818s == locationRequest.f5818s && this.f5819t == locationRequest.f5819t && this.f5821v == locationRequest.f5821v && this.f5822w.equals(locationRequest.f5822w) && q.b(this.f5820u, locationRequest.f5820u) && q.b(this.f5823x, locationRequest.f5823x)))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.f5809j), Long.valueOf(this.f5810k), Long.valueOf(this.f5811l), this.f5822w);
    }

    public String toString() {
        long j10;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (!M()) {
            sb.append("@");
            if (L()) {
                h0.b(this.f5810k, sb);
                sb.append("/");
                j10 = this.f5812m;
            } else {
                j10 = this.f5810k;
            }
            h0.b(j10, sb);
            sb.append(" ");
        }
        sb.append(p.b(this.f5809j));
        if (M() || this.f5811l != this.f5810k) {
            sb.append(", minUpdateInterval=");
            sb.append(X(this.f5811l));
        }
        if (this.f5815p > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f5815p);
        }
        boolean M = M();
        long j11 = this.f5817r;
        if (!M ? j11 != this.f5810k : j11 != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(X(this.f5817r));
        }
        if (this.f5813n != Long.MAX_VALUE) {
            sb.append(", duration=");
            h0.b(this.f5813n, sb);
        }
        if (this.f5814o != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f5814o);
        }
        if (this.f5819t != 0) {
            sb.append(", ");
            sb.append(t4.q.a(this.f5819t));
        }
        if (this.f5818s != 0) {
            sb.append(", ");
            sb.append(s.b(this.f5818s));
        }
        if (this.f5816q) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.f5821v) {
            sb.append(", bypass");
        }
        if (this.f5820u != null) {
            sb.append(", moduleId=");
            sb.append(this.f5820u);
        }
        if (!n.b(this.f5822w)) {
            sb.append(", ");
            sb.append(this.f5822w);
        }
        if (this.f5823x != null) {
            sb.append(", impersonation=");
            sb.append(this.f5823x);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, K());
        d4.c.p(parcel, 2, E());
        d4.c.p(parcel, 3, J());
        d4.c.l(parcel, 6, H());
        d4.c.i(parcel, 7, I());
        d4.c.p(parcel, 8, G());
        d4.c.c(parcel, 9, N());
        d4.c.p(parcel, 10, C());
        d4.c.p(parcel, 11, F());
        d4.c.l(parcel, 12, D());
        d4.c.l(parcel, 13, this.f5819t);
        d4.c.s(parcel, 14, this.f5820u, false);
        d4.c.c(parcel, 15, this.f5821v);
        d4.c.r(parcel, 16, this.f5822w, i10, false);
        d4.c.r(parcel, 17, this.f5823x, i10, false);
        d4.c.b(parcel, a10);
    }
}
