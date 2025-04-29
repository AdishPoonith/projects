package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class j extends e {

    /* renamed from: j  reason: collision with root package name */
    public static final a f2536j = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2537b;

    /* renamed from: c  reason: collision with root package name */
    private n.a<h, b> f2538c;

    /* renamed from: d  reason: collision with root package name */
    private e.b f2539d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<i> f2540e;

    /* renamed from: f  reason: collision with root package name */
    private int f2541f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2542g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2543h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<e.b> f2544i;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final e.b a(e.b state1, e.b bVar) {
            kotlin.jvm.internal.l.e(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private e.b f2545a;

        /* renamed from: b  reason: collision with root package name */
        private g f2546b;

        public b(h hVar, e.b initialState) {
            kotlin.jvm.internal.l.e(initialState, "initialState");
            kotlin.jvm.internal.l.b(hVar);
            this.f2546b = l.f(hVar);
            this.f2545a = initialState;
        }

        public final void a(i iVar, e.a event) {
            kotlin.jvm.internal.l.e(event, "event");
            e.b g10 = event.g();
            this.f2545a = j.f2536j.a(this.f2545a, g10);
            g gVar = this.f2546b;
            kotlin.jvm.internal.l.b(iVar);
            gVar.q(iVar, event);
            this.f2545a = g10;
        }

        public final e.b b() {
            return this.f2545a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(i provider) {
        this(provider, true);
        kotlin.jvm.internal.l.e(provider, "provider");
    }

    private j(i iVar, boolean z10) {
        this.f2537b = z10;
        this.f2538c = new n.a<>();
        this.f2539d = e.b.INITIALIZED;
        this.f2544i = new ArrayList<>();
        this.f2540e = new WeakReference<>(iVar);
    }

    private final void d(i iVar) {
        Iterator<Map.Entry<h, b>> descendingIterator = this.f2538c.descendingIterator();
        kotlin.jvm.internal.l.d(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f2543h) {
            Map.Entry<h, b> next = descendingIterator.next();
            kotlin.jvm.internal.l.d(next, "next()");
            h key = next.getKey();
            b value = next.getValue();
            while (value.b().compareTo(this.f2539d) > 0 && !this.f2543h && this.f2538c.contains(key)) {
                e.a a10 = e.a.Companion.a(value.b());
                if (a10 == null) {
                    throw new IllegalStateException("no event down from " + value.b());
                }
                m(a10.g());
                value.a(iVar, a10);
                l();
            }
        }
    }

    private final e.b e(h hVar) {
        b value;
        Map.Entry<h, b> r10 = this.f2538c.r(hVar);
        e.b bVar = null;
        e.b b10 = (r10 == null || (value = r10.getValue()) == null) ? null : value.b();
        if (!this.f2544i.isEmpty()) {
            ArrayList<e.b> arrayList = this.f2544i;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        a aVar = f2536j;
        return aVar.a(aVar.a(this.f2539d, b10), bVar);
    }

    private final void f(String str) {
        if (!this.f2537b || m.c.f().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void g(i iVar) {
        n.b<h, b>.d k10 = this.f2538c.k();
        kotlin.jvm.internal.l.d(k10, "observerMap.iteratorWithAdditions()");
        while (k10.hasNext() && !this.f2543h) {
            Map.Entry next = k10.next();
            h hVar = (h) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f2539d) < 0 && !this.f2543h && this.f2538c.contains(hVar)) {
                m(bVar.b());
                e.a b10 = e.a.Companion.b(bVar.b());
                if (b10 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(iVar, b10);
                l();
            }
        }
    }

    private final boolean i() {
        if (this.f2538c.size() == 0) {
            return true;
        }
        Map.Entry<h, b> b10 = this.f2538c.b();
        kotlin.jvm.internal.l.b(b10);
        e.b b11 = b10.getValue().b();
        Map.Entry<h, b> l10 = this.f2538c.l();
        kotlin.jvm.internal.l.b(l10);
        e.b b12 = l10.getValue().b();
        return b11 == b12 && this.f2539d == b12;
    }

    private final void k(e.b bVar) {
        e.b bVar2 = this.f2539d;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == e.b.INITIALIZED && bVar == e.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f2539d + " in component " + this.f2540e.get()).toString());
        }
        this.f2539d = bVar;
        if (this.f2542g || this.f2541f != 0) {
            this.f2543h = true;
            return;
        }
        this.f2542g = true;
        o();
        this.f2542g = false;
        if (this.f2539d == e.b.DESTROYED) {
            this.f2538c = new n.a<>();
        }
    }

    private final void l() {
        ArrayList<e.b> arrayList = this.f2544i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void m(e.b bVar) {
        this.f2544i.add(bVar);
    }

    private final void o() {
        i iVar = this.f2540e.get();
        if (iVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean i10 = i();
            this.f2543h = false;
            if (i10) {
                return;
            }
            e.b bVar = this.f2539d;
            Map.Entry<h, b> b10 = this.f2538c.b();
            kotlin.jvm.internal.l.b(b10);
            if (bVar.compareTo(b10.getValue().b()) < 0) {
                d(iVar);
            }
            Map.Entry<h, b> l10 = this.f2538c.l();
            if (!this.f2543h && l10 != null && this.f2539d.compareTo(l10.getValue().b()) > 0) {
                g(iVar);
            }
        }
    }

    @Override // androidx.lifecycle.e
    public void a(h observer) {
        i iVar;
        kotlin.jvm.internal.l.e(observer, "observer");
        f("addObserver");
        e.b bVar = this.f2539d;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.f2538c.p(observer, bVar3) == null && (iVar = this.f2540e.get()) != null) {
            boolean z10 = this.f2541f != 0 || this.f2542g;
            e.b e10 = e(observer);
            this.f2541f++;
            while (bVar3.b().compareTo(e10) < 0 && this.f2538c.contains(observer)) {
                m(bVar3.b());
                e.a b10 = e.a.Companion.b(bVar3.b());
                if (b10 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(iVar, b10);
                l();
                e10 = e(observer);
            }
            if (!z10) {
                o();
            }
            this.f2541f--;
        }
    }

    @Override // androidx.lifecycle.e
    public e.b b() {
        return this.f2539d;
    }

    @Override // androidx.lifecycle.e
    public void c(h observer) {
        kotlin.jvm.internal.l.e(observer, "observer");
        f("removeObserver");
        this.f2538c.q(observer);
    }

    public void h(e.a event) {
        kotlin.jvm.internal.l.e(event, "event");
        f("handleLifecycleEvent");
        k(event.g());
    }

    public void j(e.b state) {
        kotlin.jvm.internal.l.e(state, "state");
        f("markState");
        n(state);
    }

    public void n(e.b state) {
        kotlin.jvm.internal.l.e(state, "state");
        f("setCurrentState");
        k(state);
    }
}
