package x1;
/* loaded from: classes.dex */
public interface b0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final c0 f20103a;

        /* renamed from: b  reason: collision with root package name */
        public final c0 f20104b;

        public a(c0 c0Var) {
            this(c0Var, c0Var);
        }

        public a(c0 c0Var, c0 c0Var2) {
            this.f20103a = (c0) p3.a.e(c0Var);
            this.f20104b = (c0) p3.a.e(c0Var2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20103a.equals(aVar.f20103a) && this.f20104b.equals(aVar.f20104b);
        }

        public int hashCode() {
            return (this.f20103a.hashCode() * 31) + this.f20104b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f20103a);
            if (this.f20103a.equals(this.f20104b)) {
                str = "";
            } else {
                str = ", " + this.f20104b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final long f20105a;

        /* renamed from: b  reason: collision with root package name */
        private final a f20106b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f20105a = j10;
            this.f20106b = new a(j11 == 0 ? c0.f20107c : new c0(0L, j11));
        }

        @Override // x1.b0
        public boolean f() {
            return false;
        }

        @Override // x1.b0
        public a g(long j10) {
            return this.f20106b;
        }

        @Override // x1.b0
        public long h() {
            return this.f20105a;
        }
    }

    boolean f();

    a g(long j10);

    long h();
}
