package i9;

import i9.a;
import i9.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a.c<Map<String, ?>> f10026b = a.c.a("internal:health-checking-config");

    /* renamed from: a  reason: collision with root package name */
    private int f10027a;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<x> f10028a;

        /* renamed from: b  reason: collision with root package name */
        private final i9.a f10029b;

        /* renamed from: c  reason: collision with root package name */
        private final Object[][] f10030c;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private List<x> f10031a;

            /* renamed from: b  reason: collision with root package name */
            private i9.a f10032b = i9.a.f9798c;

            /* renamed from: c  reason: collision with root package name */
            private Object[][] f10033c = (Object[][]) Array.newInstance(Object.class, 0, 2);

            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public <T> a c(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, objArr.length, 2);
                this.f10033c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public b b() {
                return new b(this.f10031a, this.f10032b, this.f10033c);
            }

            public a d(x xVar) {
                this.f10031a = Collections.singletonList(xVar);
                return this;
            }

            public a e(List<x> list) {
                b5.n.e(!list.isEmpty(), "addrs is empty");
                this.f10031a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a f(i9.a aVar) {
                this.f10032b = (i9.a) b5.n.o(aVar, "attrs");
                return this;
            }
        }

        private b(List<x> list, i9.a aVar, Object[][] objArr) {
            this.f10028a = (List) b5.n.o(list, "addresses are not set");
            this.f10029b = (i9.a) b5.n.o(aVar, "attrs");
            this.f10030c = (Object[][]) b5.n.o(objArr, "customOptions");
        }

        public static a c() {
            return new a();
        }

        public List<x> a() {
            return this.f10028a;
        }

        public i9.a b() {
            return this.f10029b;
        }

        public a d() {
            return c().e(this.f10028a).f(this.f10029b).c(this.f10030c);
        }

        public String toString() {
            return b5.h.c(this).d("addrs", this.f10028a).d("attrs", this.f10029b).d("customOptions", Arrays.deepToString(this.f10030c)).toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract r0 a(d dVar);
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public h a(b bVar) {
            throw new UnsupportedOperationException();
        }

        public i9.f b() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService c() {
            throw new UnsupportedOperationException();
        }

        public n1 d() {
            throw new UnsupportedOperationException();
        }

        public void e() {
            throw new UnsupportedOperationException();
        }

        public abstract void f(p pVar, i iVar);
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: e  reason: collision with root package name */
        private static final e f10034e = new e(null, null, j1.f9923f, false);

        /* renamed from: a  reason: collision with root package name */
        private final h f10035a;

        /* renamed from: b  reason: collision with root package name */
        private final k.a f10036b;

        /* renamed from: c  reason: collision with root package name */
        private final j1 f10037c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f10038d;

        private e(h hVar, k.a aVar, j1 j1Var, boolean z10) {
            this.f10035a = hVar;
            this.f10036b = aVar;
            this.f10037c = (j1) b5.n.o(j1Var, "status");
            this.f10038d = z10;
        }

        public static e e(j1 j1Var) {
            b5.n.e(!j1Var.o(), "drop status shouldn't be OK");
            return new e(null, null, j1Var, true);
        }

        public static e f(j1 j1Var) {
            b5.n.e(!j1Var.o(), "error status shouldn't be OK");
            return new e(null, null, j1Var, false);
        }

        public static e g() {
            return f10034e;
        }

        public static e h(h hVar) {
            return i(hVar, null);
        }

        public static e i(h hVar, k.a aVar) {
            return new e((h) b5.n.o(hVar, "subchannel"), aVar, j1.f9923f, false);
        }

        public j1 a() {
            return this.f10037c;
        }

        public k.a b() {
            return this.f10036b;
        }

        public h c() {
            return this.f10035a;
        }

        public boolean d() {
            return this.f10038d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                return b5.j.a(this.f10035a, eVar.f10035a) && b5.j.a(this.f10037c, eVar.f10037c) && b5.j.a(this.f10036b, eVar.f10036b) && this.f10038d == eVar.f10038d;
            }
            return false;
        }

        public int hashCode() {
            return b5.j.b(this.f10035a, this.f10037c, this.f10036b, Boolean.valueOf(this.f10038d));
        }

        public String toString() {
            return b5.h.c(this).d("subchannel", this.f10035a).d("streamTracerFactory", this.f10036b).d("status", this.f10037c).e("drop", this.f10038d).toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract i9.c a();

        public abstract y0 b();

        public abstract z0<?, ?> c();
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final List<x> f10039a;

        /* renamed from: b  reason: collision with root package name */
        private final i9.a f10040b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f10041c;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private List<x> f10042a;

            /* renamed from: b  reason: collision with root package name */
            private i9.a f10043b = i9.a.f9798c;

            /* renamed from: c  reason: collision with root package name */
            private Object f10044c;

            a() {
            }

            public g a() {
                return new g(this.f10042a, this.f10043b, this.f10044c);
            }

            public a b(List<x> list) {
                this.f10042a = list;
                return this;
            }

            public a c(i9.a aVar) {
                this.f10043b = aVar;
                return this;
            }

            public a d(Object obj) {
                this.f10044c = obj;
                return this;
            }
        }

        private g(List<x> list, i9.a aVar, Object obj) {
            this.f10039a = Collections.unmodifiableList(new ArrayList((Collection) b5.n.o(list, "addresses")));
            this.f10040b = (i9.a) b5.n.o(aVar, "attributes");
            this.f10041c = obj;
        }

        public static a d() {
            return new a();
        }

        public List<x> a() {
            return this.f10039a;
        }

        public i9.a b() {
            return this.f10040b;
        }

        public Object c() {
            return this.f10041c;
        }

        public a e() {
            return d().b(this.f10039a).c(this.f10040b).d(this.f10041c);
        }

        public boolean equals(Object obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                return b5.j.a(this.f10039a, gVar.f10039a) && b5.j.a(this.f10040b, gVar.f10040b) && b5.j.a(this.f10041c, gVar.f10041c);
            }
            return false;
        }

        public int hashCode() {
            return b5.j.b(this.f10039a, this.f10040b, this.f10041c);
        }

        public String toString() {
            return b5.h.c(this).d("addresses", this.f10039a).d("attributes", this.f10040b).d("loadBalancingPolicyConfig", this.f10041c).toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public final x a() {
            List<x> b10 = b();
            b5.n.w(b10.size() == 1, "%s does not have exactly one group", b10);
            return b10.get(0);
        }

        public List<x> b() {
            throw new UnsupportedOperationException();
        }

        public abstract i9.a c();

        public Object d() {
            throw new UnsupportedOperationException();
        }

        public abstract void e();

        public abstract void f();

        public void g(j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void h(List<x> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public abstract e a(f fVar);

        @Deprecated
        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(q qVar);
    }

    public boolean a(g gVar) {
        if (!gVar.a().isEmpty() || b()) {
            int i10 = this.f10027a;
            this.f10027a = i10 + 1;
            if (i10 == 0) {
                d(gVar);
            }
            this.f10027a = 0;
            return true;
        }
        j1 j1Var = j1.f9938u;
        c(j1Var.q("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
        return false;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(j1 j1Var);

    public void d(g gVar) {
        int i10 = this.f10027a;
        this.f10027a = i10 + 1;
        if (i10 == 0) {
            a(gVar);
        }
        this.f10027a = 0;
    }

    public void e() {
    }

    public abstract void f();
}
