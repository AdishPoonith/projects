package i9;

import i9.a;
import i9.r0;
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a.c<f0> f9903a = a.c.a("internal:io.grpc.config-selector");

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final j1 f9904a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f9905b;

        /* renamed from: c  reason: collision with root package name */
        public h f9906c;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Object f9907a;

            /* renamed from: b  reason: collision with root package name */
            private h f9908b;

            private a() {
            }

            public b a() {
                b5.n.u(this.f9907a != null, "config is not set");
                return new b(j1.f9923f, this.f9907a, this.f9908b);
            }

            public a b(Object obj) {
                this.f9907a = b5.n.o(obj, "config");
                return this;
            }
        }

        private b(j1 j1Var, Object obj, h hVar) {
            this.f9904a = (j1) b5.n.o(j1Var, "status");
            this.f9905b = obj;
            this.f9906c = hVar;
        }

        public static a d() {
            return new a();
        }

        public Object a() {
            return this.f9905b;
        }

        public h b() {
            return this.f9906c;
        }

        public j1 c() {
            return this.f9904a;
        }
    }

    public abstract b a(r0.f fVar);
}
