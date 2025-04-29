package i9;

import b5.h;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public abstract class a1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f9805a;

        a(f fVar) {
            this.f9805a = fVar;
        }

        @Override // i9.a1.e, i9.a1.f
        public void b(j1 j1Var) {
            this.f9805a.b(j1Var);
        }

        @Override // i9.a1.e
        public void c(g gVar) {
            this.f9805a.a(gVar.a(), gVar.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f9807a;

        /* renamed from: b  reason: collision with root package name */
        private final g1 f9808b;

        /* renamed from: c  reason: collision with root package name */
        private final n1 f9809c;

        /* renamed from: d  reason: collision with root package name */
        private final h f9810d;

        /* renamed from: e  reason: collision with root package name */
        private final ScheduledExecutorService f9811e;

        /* renamed from: f  reason: collision with root package name */
        private final i9.f f9812f;

        /* renamed from: g  reason: collision with root package name */
        private final Executor f9813g;

        /* renamed from: h  reason: collision with root package name */
        private final String f9814h;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Integer f9815a;

            /* renamed from: b  reason: collision with root package name */
            private g1 f9816b;

            /* renamed from: c  reason: collision with root package name */
            private n1 f9817c;

            /* renamed from: d  reason: collision with root package name */
            private h f9818d;

            /* renamed from: e  reason: collision with root package name */
            private ScheduledExecutorService f9819e;

            /* renamed from: f  reason: collision with root package name */
            private i9.f f9820f;

            /* renamed from: g  reason: collision with root package name */
            private Executor f9821g;

            /* renamed from: h  reason: collision with root package name */
            private String f9822h;

            a() {
            }

            public b a() {
                return new b(this.f9815a, this.f9816b, this.f9817c, this.f9818d, this.f9819e, this.f9820f, this.f9821g, this.f9822h, null);
            }

            public a b(i9.f fVar) {
                this.f9820f = (i9.f) b5.n.n(fVar);
                return this;
            }

            public a c(int i10) {
                this.f9815a = Integer.valueOf(i10);
                return this;
            }

            public a d(Executor executor) {
                this.f9821g = executor;
                return this;
            }

            public a e(String str) {
                this.f9822h = str;
                return this;
            }

            public a f(g1 g1Var) {
                this.f9816b = (g1) b5.n.n(g1Var);
                return this;
            }

            public a g(ScheduledExecutorService scheduledExecutorService) {
                this.f9819e = (ScheduledExecutorService) b5.n.n(scheduledExecutorService);
                return this;
            }

            public a h(h hVar) {
                this.f9818d = (h) b5.n.n(hVar);
                return this;
            }

            public a i(n1 n1Var) {
                this.f9817c = (n1) b5.n.n(n1Var);
                return this;
            }
        }

        private b(Integer num, g1 g1Var, n1 n1Var, h hVar, ScheduledExecutorService scheduledExecutorService, i9.f fVar, Executor executor, String str) {
            this.f9807a = ((Integer) b5.n.o(num, "defaultPort not set")).intValue();
            this.f9808b = (g1) b5.n.o(g1Var, "proxyDetector not set");
            this.f9809c = (n1) b5.n.o(n1Var, "syncContext not set");
            this.f9810d = (h) b5.n.o(hVar, "serviceConfigParser not set");
            this.f9811e = scheduledExecutorService;
            this.f9812f = fVar;
            this.f9813g = executor;
            this.f9814h = str;
        }

        /* synthetic */ b(Integer num, g1 g1Var, n1 n1Var, h hVar, ScheduledExecutorService scheduledExecutorService, i9.f fVar, Executor executor, String str, a aVar) {
            this(num, g1Var, n1Var, hVar, scheduledExecutorService, fVar, executor, str);
        }

        public static a f() {
            return new a();
        }

        public int a() {
            return this.f9807a;
        }

        public Executor b() {
            return this.f9813g;
        }

        public g1 c() {
            return this.f9808b;
        }

        public h d() {
            return this.f9810d;
        }

        public n1 e() {
            return this.f9809c;
        }

        public String toString() {
            return b5.h.c(this).b("defaultPort", this.f9807a).d("proxyDetector", this.f9808b).d("syncContext", this.f9809c).d("serviceConfigParser", this.f9810d).d("scheduledExecutorService", this.f9811e).d("channelLogger", this.f9812f).d("executor", this.f9813g).d("overrideAuthority", this.f9814h).toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final j1 f9823a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f9824b;

        private c(j1 j1Var) {
            this.f9824b = null;
            this.f9823a = (j1) b5.n.o(j1Var, "status");
            b5.n.j(!j1Var.o(), "cannot use OK status: %s", j1Var);
        }

        private c(Object obj) {
            this.f9824b = b5.n.o(obj, "config");
            this.f9823a = null;
        }

        public static c a(Object obj) {
            return new c(obj);
        }

        public static c b(j1 j1Var) {
            return new c(j1Var);
        }

        public Object c() {
            return this.f9824b;
        }

        public j1 d() {
            return this.f9823a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return b5.j.a(this.f9823a, cVar.f9823a) && b5.j.a(this.f9824b, cVar.f9824b);
        }

        public int hashCode() {
            return b5.j.b(this.f9823a, this.f9824b);
        }

        public String toString() {
            h.b c10;
            Object obj;
            String str;
            if (this.f9824b != null) {
                c10 = b5.h.c(this);
                obj = this.f9824b;
                str = "config";
            } else {
                c10 = b5.h.c(this);
                obj = this.f9823a;
                str = "error";
            }
            return c10.d(str, obj).toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract String a();

        public abstract a1 b(URI uri, b bVar);
    }

    /* loaded from: classes.dex */
    public static abstract class e implements f {
        @Override // i9.a1.f
        @Deprecated
        public final void a(List<x> list, i9.a aVar) {
            c(g.d().b(list).c(aVar).a());
        }

        @Override // i9.a1.f
        public abstract void b(j1 j1Var);

        public abstract void c(g gVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(List<x> list, i9.a aVar);

        void b(j1 j1Var);
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final List<x> f9825a;

        /* renamed from: b  reason: collision with root package name */
        private final i9.a f9826b;

        /* renamed from: c  reason: collision with root package name */
        private final c f9827c;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private List<x> f9828a = Collections.emptyList();

            /* renamed from: b  reason: collision with root package name */
            private i9.a f9829b = i9.a.f9798c;

            /* renamed from: c  reason: collision with root package name */
            private c f9830c;

            a() {
            }

            public g a() {
                return new g(this.f9828a, this.f9829b, this.f9830c);
            }

            public a b(List<x> list) {
                this.f9828a = list;
                return this;
            }

            public a c(i9.a aVar) {
                this.f9829b = aVar;
                return this;
            }

            public a d(c cVar) {
                this.f9830c = cVar;
                return this;
            }
        }

        g(List<x> list, i9.a aVar, c cVar) {
            this.f9825a = Collections.unmodifiableList(new ArrayList(list));
            this.f9826b = (i9.a) b5.n.o(aVar, "attributes");
            this.f9827c = cVar;
        }

        public static a d() {
            return new a();
        }

        public List<x> a() {
            return this.f9825a;
        }

        public i9.a b() {
            return this.f9826b;
        }

        public c c() {
            return this.f9827c;
        }

        public boolean equals(Object obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                return b5.j.a(this.f9825a, gVar.f9825a) && b5.j.a(this.f9826b, gVar.f9826b) && b5.j.a(this.f9827c, gVar.f9827c);
            }
            return false;
        }

        public int hashCode() {
            return b5.j.b(this.f9825a, this.f9826b, this.f9827c);
        }

        public String toString() {
            return b5.h.c(this).d("addresses", this.f9825a).d("attributes", this.f9826b).d("serviceConfig", this.f9827c).toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract c a(Map<String, ?> map);
    }

    public abstract String a();

    public void b() {
    }

    public abstract void c();

    public void d(e eVar) {
        e(eVar);
    }

    public void e(f fVar) {
        if (fVar instanceof e) {
            d((e) fVar);
        } else {
            d(new a(fVar));
        }
    }
}
