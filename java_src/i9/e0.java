package i9;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f9883a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9884b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9885c;

    /* renamed from: d  reason: collision with root package name */
    public final p0 f9886d;

    /* renamed from: e  reason: collision with root package name */
    public final p0 f9887e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f9888a;

        /* renamed from: b  reason: collision with root package name */
        private b f9889b;

        /* renamed from: c  reason: collision with root package name */
        private Long f9890c;

        /* renamed from: d  reason: collision with root package name */
        private p0 f9891d;

        /* renamed from: e  reason: collision with root package name */
        private p0 f9892e;

        public e0 a() {
            b5.n.o(this.f9888a, "description");
            b5.n.o(this.f9889b, "severity");
            b5.n.o(this.f9890c, "timestampNanos");
            b5.n.u(this.f9891d == null || this.f9892e == null, "at least one of channelRef and subchannelRef must be null");
            return new e0(this.f9888a, this.f9889b, this.f9890c.longValue(), this.f9891d, this.f9892e);
        }

        public a b(String str) {
            this.f9888a = str;
            return this;
        }

        public a c(b bVar) {
            this.f9889b = bVar;
            return this;
        }

        public a d(p0 p0Var) {
            this.f9892e = p0Var;
            return this;
        }

        public a e(long j10) {
            this.f9890c = Long.valueOf(j10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    private e0(String str, b bVar, long j10, p0 p0Var, p0 p0Var2) {
        this.f9883a = str;
        this.f9884b = (b) b5.n.o(bVar, "severity");
        this.f9885c = j10;
        this.f9886d = p0Var;
        this.f9887e = p0Var2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            return b5.j.a(this.f9883a, e0Var.f9883a) && b5.j.a(this.f9884b, e0Var.f9884b) && this.f9885c == e0Var.f9885c && b5.j.a(this.f9886d, e0Var.f9886d) && b5.j.a(this.f9887e, e0Var.f9887e);
        }
        return false;
    }

    public int hashCode() {
        return b5.j.b(this.f9883a, this.f9884b, Long.valueOf(this.f9885c), this.f9886d, this.f9887e);
    }

    public String toString() {
        return b5.h.c(this).d("description", this.f9883a).d("severity", this.f9884b).c("timestampNanos", this.f9885c).d("channelRef", this.f9886d).d("subchannelRef", this.f9887e).toString();
    }
}
