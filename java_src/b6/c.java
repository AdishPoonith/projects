package b6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2991a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<f0<? super T>> f2992b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<r> f2993c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2994d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2995e;

    /* renamed from: f  reason: collision with root package name */
    private final h<T> f2996f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<Class<?>> f2997g;

    /* loaded from: classes.dex */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f2998a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<f0<? super T>> f2999b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<r> f3000c;

        /* renamed from: d  reason: collision with root package name */
        private int f3001d;

        /* renamed from: e  reason: collision with root package name */
        private int f3002e;

        /* renamed from: f  reason: collision with root package name */
        private h<T> f3003f;

        /* renamed from: g  reason: collision with root package name */
        private final Set<Class<?>> f3004g;

        @SafeVarargs
        private b(f0<T> f0Var, f0<? super T>... f0VarArr) {
            this.f2998a = null;
            HashSet hashSet = new HashSet();
            this.f2999b = hashSet;
            this.f3000c = new HashSet();
            this.f3001d = 0;
            this.f3002e = 0;
            this.f3004g = new HashSet();
            e0.c(f0Var, "Null interface");
            hashSet.add(f0Var);
            for (f0<? super T> f0Var2 : f0VarArr) {
                e0.c(f0Var2, "Null interface");
            }
            Collections.addAll(this.f2999b, f0VarArr);
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f2998a = null;
            HashSet hashSet = new HashSet();
            this.f2999b = hashSet;
            this.f3000c = new HashSet();
            this.f3001d = 0;
            this.f3002e = 0;
            this.f3004g = new HashSet();
            e0.c(cls, "Null interface");
            hashSet.add(f0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                e0.c(cls2, "Null interface");
                this.f2999b.add(f0.b(cls2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> e() {
            this.f3002e = 1;
            return this;
        }

        private void g(f0<?> f0Var) {
            e0.a(!this.f2999b.contains(f0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(r rVar) {
            e0.c(rVar, "Null dependency");
            g(rVar.c());
            this.f3000c.add(rVar);
            return this;
        }

        public c<T> c() {
            e0.d(this.f3003f != null, "Missing required property: factory.");
            return new c<>(this.f2998a, new HashSet(this.f2999b), new HashSet(this.f3000c), this.f3001d, this.f3002e, this.f3003f, this.f3004g);
        }

        public b<T> d(h<T> hVar) {
            this.f3003f = (h) e0.c(hVar, "Null factory");
            return this;
        }

        public b<T> f(String str) {
            this.f2998a = str;
            return this;
        }
    }

    private c(String str, Set<f0<? super T>> set, Set<r> set2, int i10, int i11, h<T> hVar, Set<Class<?>> set3) {
        this.f2991a = str;
        this.f2992b = Collections.unmodifiableSet(set);
        this.f2993c = Collections.unmodifiableSet(set2);
        this.f2994d = i10;
        this.f2995e = i11;
        this.f2996f = hVar;
        this.f2997g = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> c(f0<T> f0Var) {
        return new b<>(f0Var, new f0[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(f0<T> f0Var, f0<? super T>... f0VarArr) {
        return new b<>(f0Var, f0VarArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> c<T> l(final T t10, Class<T> cls) {
        return m(cls).d(new h() { // from class: b6.a
            @Override // b6.h
            public final Object a(e eVar) {
                Object q10;
                q10 = c.q(t10, eVar);
                return q10;
            }
        }).c();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> c<T> s(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).d(new h() { // from class: b6.b
            @Override // b6.h
            public final Object a(e eVar) {
                Object r10;
                r10 = c.r(t10, eVar);
                return r10;
            }
        }).c();
    }

    public Set<r> g() {
        return this.f2993c;
    }

    public h<T> h() {
        return this.f2996f;
    }

    public String i() {
        return this.f2991a;
    }

    public Set<f0<? super T>> j() {
        return this.f2992b;
    }

    public Set<Class<?>> k() {
        return this.f2997g;
    }

    public boolean n() {
        return this.f2994d == 1;
    }

    public boolean o() {
        return this.f2994d == 2;
    }

    public boolean p() {
        return this.f2995e == 0;
    }

    public c<T> t(h<T> hVar) {
        return new c<>(this.f2991a, this.f2992b, this.f2993c, this.f2994d, this.f2995e, hVar, this.f2997g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f2992b.toArray()) + ">{" + this.f2994d + ", type=" + this.f2995e + ", deps=" + Arrays.toString(this.f2993c.toArray()) + "}";
    }
}
