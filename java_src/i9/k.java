package i9;
/* loaded from: classes.dex */
public abstract class k extends m1 {

    /* loaded from: classes.dex */
    public static abstract class a {
        public k a(b bVar, y0 y0Var) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f9964a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9965b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f9966c;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private c f9967a = c.f9834k;

            /* renamed from: b  reason: collision with root package name */
            private int f9968b;

            /* renamed from: c  reason: collision with root package name */
            private boolean f9969c;

            a() {
            }

            public b a() {
                return new b(this.f9967a, this.f9968b, this.f9969c);
            }

            public a b(c cVar) {
                this.f9967a = (c) b5.n.o(cVar, "callOptions cannot be null");
                return this;
            }

            public a c(boolean z10) {
                this.f9969c = z10;
                return this;
            }

            public a d(int i10) {
                this.f9968b = i10;
                return this;
            }
        }

        b(c cVar, int i10, boolean z10) {
            this.f9964a = (c) b5.n.o(cVar, "callOptions");
            this.f9965b = i10;
            this.f9966c = z10;
        }

        public static a a() {
            return new a();
        }

        public String toString() {
            return b5.h.c(this).d("callOptions", this.f9964a).b("previousAttempts", this.f9965b).e("isTransparentRetry", this.f9966c).toString();
        }
    }

    public void j() {
    }

    public void k(y0 y0Var) {
    }

    public void l() {
    }

    public void m(i9.a aVar, y0 y0Var) {
    }
}
