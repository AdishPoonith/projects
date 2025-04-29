package s1;
/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: c  reason: collision with root package name */
    public static final q3 f17497c;

    /* renamed from: d  reason: collision with root package name */
    public static final q3 f17498d;

    /* renamed from: e  reason: collision with root package name */
    public static final q3 f17499e;

    /* renamed from: f  reason: collision with root package name */
    public static final q3 f17500f;

    /* renamed from: g  reason: collision with root package name */
    public static final q3 f17501g;

    /* renamed from: a  reason: collision with root package name */
    public final long f17502a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17503b;

    static {
        q3 q3Var = new q3(0L, 0L);
        f17497c = q3Var;
        f17498d = new q3(Long.MAX_VALUE, Long.MAX_VALUE);
        f17499e = new q3(Long.MAX_VALUE, 0L);
        f17500f = new q3(0L, Long.MAX_VALUE);
        f17501g = q3Var;
    }

    public q3(long j10, long j11) {
        p3.a.a(j10 >= 0);
        p3.a.a(j11 >= 0);
        this.f17502a = j10;
        this.f17503b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f17502a;
        if (j13 == 0 && this.f17503b == 0) {
            return j10;
        }
        long T0 = p3.n0.T0(j10, j13, Long.MIN_VALUE);
        long b10 = p3.n0.b(j10, this.f17503b, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = T0 <= j11 && j11 <= b10;
        z10 = (T0 > j12 || j12 > b10) ? false : false;
        return (z11 && z10) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z11 ? j11 : z10 ? j12 : T0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q3.class != obj.getClass()) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return this.f17502a == q3Var.f17502a && this.f17503b == q3Var.f17503b;
    }

    public int hashCode() {
        return (((int) this.f17502a) * 31) + ((int) this.f17503b);
    }
}
