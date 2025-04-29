package b6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
final class g0 implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Set<f0<?>> f3016a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<f0<?>> f3017b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<f0<?>> f3018c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<f0<?>> f3019d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<f0<?>> f3020e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f3021f;

    /* renamed from: g  reason: collision with root package name */
    private final e f3022g;

    /* loaded from: classes.dex */
    private static class a implements g6.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f3023a;

        /* renamed from: b  reason: collision with root package name */
        private final g6.c f3024b;

        public a(Set<Class<?>> set, g6.c cVar) {
            this.f3023a = set;
            this.f3024b = cVar;
        }

        @Override // g6.c
        public void a(g6.a<?> aVar) {
            if (!this.f3023a.contains(aVar.a())) {
                throw new t(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f3024b.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(c<?> cVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : cVar.g()) {
            if (rVar.e()) {
                boolean g10 = rVar.g();
                f0<?> c10 = rVar.c();
                if (g10) {
                    hashSet4.add(c10);
                } else {
                    hashSet.add(c10);
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else {
                boolean g11 = rVar.g();
                f0<?> c11 = rVar.c();
                if (g11) {
                    hashSet5.add(c11);
                } else {
                    hashSet2.add(c11);
                }
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(f0.b(g6.c.class));
        }
        this.f3016a = Collections.unmodifiableSet(hashSet);
        this.f3017b = Collections.unmodifiableSet(hashSet2);
        this.f3018c = Collections.unmodifiableSet(hashSet3);
        this.f3019d = Collections.unmodifiableSet(hashSet4);
        this.f3020e = Collections.unmodifiableSet(hashSet5);
        this.f3021f = cVar.k();
        this.f3022g = eVar;
    }

    @Override // b6.e
    public <T> T a(Class<T> cls) {
        if (this.f3016a.contains(f0.b(cls))) {
            T t10 = (T) this.f3022g.a(cls);
            return !cls.equals(g6.c.class) ? t10 : (T) new a(this.f3021f, (g6.c) t10);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // b6.e
    public <T> s6.b<T> b(f0<T> f0Var) {
        if (this.f3017b.contains(f0Var)) {
            return this.f3022g.b(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f0Var));
    }

    @Override // b6.e
    public /* synthetic */ Set c(Class cls) {
        return d.f(this, cls);
    }

    @Override // b6.e
    public <T> T d(f0<T> f0Var) {
        if (this.f3016a.contains(f0Var)) {
            return (T) this.f3022g.d(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f0Var));
    }

    @Override // b6.e
    public <T> s6.b<Set<T>> e(f0<T> f0Var) {
        if (this.f3020e.contains(f0Var)) {
            return this.f3022g.e(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f0Var));
    }

    @Override // b6.e
    public <T> Set<T> f(f0<T> f0Var) {
        if (this.f3019d.contains(f0Var)) {
            return this.f3022g.f(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f0Var));
    }

    @Override // b6.e
    public <T> s6.b<T> g(Class<T> cls) {
        return b(f0.b(cls));
    }

    @Override // b6.e
    public <T> s6.a<T> h(f0<T> f0Var) {
        if (this.f3018c.contains(f0Var)) {
            return this.f3022g.h(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f0Var));
    }

    @Override // b6.e
    public <T> s6.a<T> i(Class<T> cls) {
        return h(f0.b(cls));
    }
}
