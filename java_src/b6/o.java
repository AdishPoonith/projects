package b6;

import android.util.Log;
import b6.o;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class o implements e, e6.a {

    /* renamed from: h  reason: collision with root package name */
    private static final s6.b<Set<Object>> f3034h = new s6.b() { // from class: b6.n
        @Override // s6.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final Map<c<?>, s6.b<?>> f3035a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<f0<?>, s6.b<?>> f3036b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<f0<?>, y<?>> f3037c;

    /* renamed from: d  reason: collision with root package name */
    private final List<s6.b<ComponentRegistrar>> f3038d;

    /* renamed from: e  reason: collision with root package name */
    private final v f3039e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<Boolean> f3040f;

    /* renamed from: g  reason: collision with root package name */
    private final j f3041g;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f3042a;

        /* renamed from: b  reason: collision with root package name */
        private final List<s6.b<ComponentRegistrar>> f3043b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<c<?>> f3044c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private j f3045d = j.f3026a;

        b(Executor executor) {
            this.f3042a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f3044c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f3043b.add(new s6.b() { // from class: b6.p
                @Override // s6.b
                public final Object get() {
                    ComponentRegistrar f10;
                    f10 = o.b.f(ComponentRegistrar.this);
                    return f10;
                }
            });
            return this;
        }

        public b d(Collection<s6.b<ComponentRegistrar>> collection) {
            this.f3043b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f3042a, this.f3043b, this.f3044c, this.f3045d);
        }

        public b g(j jVar) {
            this.f3045d = jVar;
            return this;
        }
    }

    private o(Executor executor, Iterable<s6.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, j jVar) {
        this.f3035a = new HashMap();
        this.f3036b = new HashMap();
        this.f3037c = new HashMap();
        this.f3040f = new AtomicReference<>();
        v vVar = new v(executor);
        this.f3039e = vVar;
        this.f3041g = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(vVar, v.class, g6.d.class, g6.c.class));
        arrayList.add(c.s(this, e6.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f3038d = q(iterable);
        n(arrayList);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<c<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<s6.b<ComponentRegistrar>> it = this.f3038d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f3041g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f3035a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f3035a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f3035a.put(cVar, new x(new s6.b() { // from class: b6.m
                    @Override // s6.b
                    public final Object get() {
                        Object r10;
                        r10 = o.this.r(cVar);
                        return r10;
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        u();
    }

    private void o(Map<c<?>, s6.b<?>> map, boolean z10) {
        for (Map.Entry<c<?>, s6.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            s6.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f3039e.c();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(c cVar) {
        return cVar.h().a(new g0(cVar, this));
    }

    private void u() {
        Boolean bool = this.f3040f.get();
        if (bool != null) {
            o(this.f3035a, bool.booleanValue());
        }
    }

    private void v() {
        Map map;
        f0<?> c10;
        s6.b e10;
        for (c<?> cVar : this.f3035a.keySet()) {
            for (r rVar : cVar.g()) {
                if (rVar.g() && !this.f3037c.containsKey(rVar.c())) {
                    map = this.f3037c;
                    c10 = rVar.c();
                    e10 = y.b(Collections.emptySet());
                } else if (this.f3036b.containsKey(rVar.c())) {
                    continue;
                } else if (rVar.f()) {
                    throw new z(String.format("Unsatisfied dependency for component %s: %s", cVar, rVar.c()));
                } else {
                    if (!rVar.g()) {
                        map = this.f3036b;
                        c10 = rVar.c();
                        e10 = d0.e();
                    }
                }
                map.put(c10, e10);
            }
        }
    }

    private List<Runnable> w(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                final s6.b<?> bVar = this.f3035a.get(cVar);
                for (f0<? super Object> f0Var : cVar.j()) {
                    if (this.f3036b.containsKey(f0Var)) {
                        final d0 d0Var = (d0) this.f3036b.get(f0Var);
                        arrayList.add(new Runnable() { // from class: b6.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                d0.this.j(bVar);
                            }
                        });
                    } else {
                        this.f3036b.put(f0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<c<?>, s6.b<?>> entry : this.f3035a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                s6.b<?> value = entry.getValue();
                for (f0<? super Object> f0Var : key.j()) {
                    if (!hashMap.containsKey(f0Var)) {
                        hashMap.put(f0Var, new HashSet());
                    }
                    ((Set) hashMap.get(f0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f3037c.containsKey(entry2.getKey())) {
                final y<?> yVar = this.f3037c.get(entry2.getKey());
                for (final s6.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: b6.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(bVar);
                        }
                    });
                }
            } else {
                this.f3037c.put((f0) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // b6.e
    public /* synthetic */ Object a(Class cls) {
        return d.b(this, cls);
    }

    @Override // b6.e
    public synchronized <T> s6.b<T> b(f0<T> f0Var) {
        e0.c(f0Var, "Null interface requested.");
        return (s6.b<T>) this.f3036b.get(f0Var);
    }

    @Override // b6.e
    public /* synthetic */ Set c(Class cls) {
        return d.f(this, cls);
    }

    @Override // b6.e
    public /* synthetic */ Object d(f0 f0Var) {
        return d.a(this, f0Var);
    }

    @Override // b6.e
    public synchronized <T> s6.b<Set<T>> e(f0<T> f0Var) {
        y<?> yVar = this.f3037c.get(f0Var);
        if (yVar != null) {
            return yVar;
        }
        return (s6.b<Set<T>>) f3034h;
    }

    @Override // b6.e
    public /* synthetic */ Set f(f0 f0Var) {
        return d.e(this, f0Var);
    }

    @Override // b6.e
    public /* synthetic */ s6.b g(Class cls) {
        return d.d(this, cls);
    }

    @Override // b6.e
    public <T> s6.a<T> h(f0<T> f0Var) {
        s6.b<T> b10 = b(f0Var);
        return b10 == null ? d0.e() : b10 instanceof d0 ? (d0) b10 : d0.i(b10);
    }

    @Override // b6.e
    public /* synthetic */ s6.a i(Class cls) {
        return d.c(this, cls);
    }

    public void p(boolean z10) {
        HashMap hashMap;
        if (this.f3040f.compareAndSet(null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f3035a);
            }
            o(hashMap, z10);
        }
    }
}
