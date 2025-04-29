package q9;

import b5.j;
import b5.n;
import i9.a;
import i9.j1;
import i9.p;
import i9.q;
import i9.r0;
import i9.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
final class h extends r0 {

    /* renamed from: h  reason: collision with root package name */
    static final a.c<d<q>> f16588h = a.c.a("state-info");

    /* renamed from: i  reason: collision with root package name */
    private static final j1 f16589i = j1.f9923f.q("no subchannels ready");

    /* renamed from: c  reason: collision with root package name */
    private final r0.d f16590c;

    /* renamed from: f  reason: collision with root package name */
    private p f16593f;

    /* renamed from: d  reason: collision with root package name */
    private final Map<x, r0.h> f16591d = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private e f16594g = new b(f16589i);

    /* renamed from: e  reason: collision with root package name */
    private final Random f16592e = new Random();

    /* loaded from: classes.dex */
    class a implements r0.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.h f16595a;

        a(r0.h hVar) {
            this.f16595a = hVar;
        }

        @Override // i9.r0.j
        public void a(q qVar) {
            h.this.l(this.f16595a, qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private final j1 f16597a;

        b(j1 j1Var) {
            super(null);
            this.f16597a = (j1) n.o(j1Var, "status");
        }

        @Override // i9.r0.i
        public r0.e a(r0.f fVar) {
            return this.f16597a.o() ? r0.e.g() : r0.e.f(this.f16597a);
        }

        @Override // q9.h.e
        boolean c(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                if (j.a(this.f16597a, bVar.f16597a) || (this.f16597a.o() && bVar.f16597a.o())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return b5.h.b(b.class).d("status", this.f16597a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends e {

        /* renamed from: c  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater<c> f16598c = AtomicIntegerFieldUpdater.newUpdater(c.class, "b");

        /* renamed from: a  reason: collision with root package name */
        private final List<r0.h> f16599a;

        /* renamed from: b  reason: collision with root package name */
        private volatile int f16600b;

        c(List<r0.h> list, int i10) {
            super(null);
            n.e(!list.isEmpty(), "empty list");
            this.f16599a = list;
            this.f16600b = i10 - 1;
        }

        private r0.h d() {
            int size = this.f16599a.size();
            AtomicIntegerFieldUpdater<c> atomicIntegerFieldUpdater = f16598c;
            int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (incrementAndGet >= size) {
                int i10 = incrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i10);
                incrementAndGet = i10;
            }
            return this.f16599a.get(incrementAndGet);
        }

        @Override // i9.r0.i
        public r0.e a(r0.f fVar) {
            return r0.e.h(d());
        }

        @Override // q9.h.e
        boolean c(e eVar) {
            if (eVar instanceof c) {
                c cVar = (c) eVar;
                return cVar == this || (this.f16599a.size() == cVar.f16599a.size() && new HashSet(this.f16599a).containsAll(cVar.f16599a));
            }
            return false;
        }

        public String toString() {
            return b5.h.b(c.class).d("list", this.f16599a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d<T> {

        /* renamed from: a  reason: collision with root package name */
        T f16601a;

        d(T t10) {
            this.f16601a = t10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e extends r0.i {
        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        abstract boolean c(e eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(r0.d dVar) {
        this.f16590c = (r0.d) n.o(dVar, "helper");
    }

    private static List<r0.h> h(Collection<r0.h> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (r0.h hVar : collection) {
            if (k(hVar)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    private static d<q> i(r0.h hVar) {
        return (d) n.o((d) hVar.c().b(f16588h), "STATE_INFO");
    }

    static boolean k(r0.h hVar) {
        return i(hVar).f16601a.c() == p.READY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void l(r0.h hVar, q qVar) {
        if (this.f16591d.get(o(hVar.a())) != hVar) {
            return;
        }
        p c10 = qVar.c();
        p pVar = p.TRANSIENT_FAILURE;
        if (c10 == pVar || qVar.c() == p.IDLE) {
            this.f16590c.e();
        }
        p c11 = qVar.c();
        p pVar2 = p.IDLE;
        if (c11 == pVar2) {
            hVar.e();
        }
        d<q> i10 = i(hVar);
        if (i10.f16601a.c().equals(pVar) && (qVar.c().equals(p.CONNECTING) || qVar.c().equals(pVar2))) {
            return;
        }
        i10.f16601a = qVar;
        q();
    }

    private static <T> Set<T> m(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [i9.q, T] */
    private void n(r0.h hVar) {
        hVar.f();
        i(hVar).f16601a = q.a(p.SHUTDOWN);
    }

    private static x o(x xVar) {
        return new x(xVar.a());
    }

    private static Map<x, x> p(List<x> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (x xVar : list) {
            hashMap.put(o(xVar), xVar);
        }
        return hashMap;
    }

    private void q() {
        List<r0.h> h10 = h(j());
        if (!h10.isEmpty()) {
            r(p.READY, new c(h10, this.f16592e.nextInt(h10.size())));
            return;
        }
        boolean z10 = false;
        j1 j1Var = f16589i;
        for (r0.h hVar : j()) {
            q qVar = i(hVar).f16601a;
            z10 = (qVar.c() == p.CONNECTING || qVar.c() == p.IDLE) ? true : true;
            if (j1Var == f16589i || !j1Var.o()) {
                j1Var = qVar.d();
            }
        }
        r(z10 ? p.CONNECTING : p.TRANSIENT_FAILURE, new b(j1Var));
    }

    private void r(p pVar, e eVar) {
        if (pVar == this.f16593f && eVar.c(this.f16594g)) {
            return;
        }
        this.f16590c.f(pVar, eVar);
        this.f16593f = pVar;
        this.f16594g = eVar;
    }

    @Override // i9.r0
    public boolean a(r0.g gVar) {
        if (gVar.a().isEmpty()) {
            j1 j1Var = j1.f9938u;
            c(j1Var.q("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
            return false;
        }
        List<x> a10 = gVar.a();
        Set<x> keySet = this.f16591d.keySet();
        Map<x, x> p10 = p(a10);
        Set<x> m10 = m(keySet, p10.keySet());
        for (Map.Entry<x, x> entry : p10.entrySet()) {
            x key = entry.getKey();
            x value = entry.getValue();
            r0.h hVar = this.f16591d.get(key);
            if (hVar != null) {
                hVar.h(Collections.singletonList(value));
            } else {
                r0.h hVar2 = (r0.h) n.o(this.f16590c.a(r0.b.c().d(value).f(i9.a.c().d(f16588h, new d(q.a(p.IDLE))).a()).b()), "subchannel");
                hVar2.g(new a(hVar2));
                this.f16591d.put(key, hVar2);
                hVar2.e();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (x xVar : m10) {
            arrayList.add(this.f16591d.remove(xVar));
        }
        q();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n((r0.h) it.next());
        }
        return true;
    }

    @Override // i9.r0
    public void c(j1 j1Var) {
        if (this.f16593f != p.READY) {
            r(p.TRANSIENT_FAILURE, new b(j1Var));
        }
    }

    @Override // i9.r0
    public void f() {
        for (r0.h hVar : j()) {
            n(hVar);
        }
        this.f16591d.clear();
    }

    Collection<r0.h> j() {
        return this.f16591d.values();
    }
}
