package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f2211a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<e> f2212b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<e> f2213c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f2214d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f2215e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ d f2216j;

        a(d dVar) {
            this.f2216j = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c0.this.f2212b.contains(this.f2216j)) {
                this.f2216j.e().b(this.f2216j.f().Q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ d f2218j;

        b(d dVar) {
            this.f2218j = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.f2212b.remove(this.f2218j);
            c0.this.f2213c.remove(this.f2218j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2220a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f2221b;

        static {
            int[] iArr = new int[e.b.values().length];
            f2221b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2221b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2221b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f2220a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2220a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2220a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2220a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        private final u f2222h;

        d(e.c cVar, e.b bVar, u uVar, androidx.core.os.e eVar) {
            super(cVar, bVar, uVar.k(), eVar);
            this.f2222h = uVar;
        }

        @Override // androidx.fragment.app.c0.e
        public void c() {
            super.c();
            this.f2222h.m();
        }

        @Override // androidx.fragment.app.c0.e
        void l() {
            Fragment k10 = this.f2222h.k();
            View findFocus = k10.Q.findFocus();
            if (findFocus != null) {
                k10.y1(findFocus);
                if (n.F0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                }
            }
            if (g() == e.b.ADDING) {
                View r12 = f().r1();
                if (r12.getParent() == null) {
                    this.f2222h.b();
                    r12.setAlpha(0.0f);
                }
                if (r12.getAlpha() == 0.0f && r12.getVisibility() == 0) {
                    r12.setVisibility(4);
                }
                r12.setAlpha(k10.H());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private c f2223a;

        /* renamed from: b  reason: collision with root package name */
        private b f2224b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f2225c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f2226d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<androidx.core.os.e> f2227e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f2228f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2229g = false;

        /* loaded from: classes.dex */
        class a implements e.b {
            a() {
            }

            @Override // androidx.core.os.e.b
            public void a() {
                e.this.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c g(int i10) {
                if (i10 != 0) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i10);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c h(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : g(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void b(View view) {
                int i10;
                int i11 = c.f2220a[ordinal()];
                if (i11 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i10 = 0;
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                    return;
                } else {
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i10 = 8;
                }
                view.setVisibility(i10);
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f2223a = cVar;
            this.f2224b = bVar;
            this.f2225c = fragment;
            eVar.c(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f2226d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f2228f = true;
            if (this.f2227e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f2227e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).a();
            }
        }

        public void c() {
            if (this.f2229g) {
                return;
            }
            if (n.F0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2229g = true;
            for (Runnable runnable : this.f2226d) {
                runnable.run();
            }
        }

        public final void d(androidx.core.os.e eVar) {
            if (this.f2227e.remove(eVar) && this.f2227e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f2223a;
        }

        public final Fragment f() {
            return this.f2225c;
        }

        b g() {
            return this.f2224b;
        }

        final boolean h() {
            return this.f2228f;
        }

        final boolean i() {
            return this.f2229g;
        }

        public final void j(androidx.core.os.e eVar) {
            l();
            this.f2227e.add(eVar);
        }

        final void k(c cVar, b bVar) {
            b bVar2;
            int i10 = c.f2221b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f2223a != c.REMOVED) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2225c + " mFinalState = " + this.f2223a + " -> " + cVar + ". ");
                        }
                        this.f2223a = cVar;
                        return;
                    }
                    return;
                }
                if (n.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2225c + " mFinalState = " + this.f2223a + " -> REMOVED. mLifecycleImpact  = " + this.f2224b + " to REMOVING.");
                }
                this.f2223a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else if (this.f2223a != c.REMOVED) {
                return;
            } else {
                if (n.F0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2225c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2224b + " to ADDING.");
                }
                this.f2223a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f2224b = bVar2;
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2223a + "} {mLifecycleImpact = " + this.f2224b + "} {mFragment = " + this.f2225c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(ViewGroup viewGroup) {
        this.f2211a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, u uVar) {
        synchronized (this.f2212b) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            e h10 = h(uVar.k());
            if (h10 != null) {
                h10.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, uVar, eVar);
            this.f2212b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.f2212b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.f2213c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.z0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 o(ViewGroup viewGroup, d0 d0Var) {
        int i10 = a0.b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof c0) {
            return (c0) tag;
        }
        c0 a10 = d0Var.a(viewGroup);
        viewGroup.setTag(i10, a10);
        return a10;
    }

    private void q() {
        Iterator<e> it = this.f2212b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.g(next.f().r1().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.c cVar, u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar.k());
        }
        a(cVar, e.b.ADDING, uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar.k());
        }
        a(e.c.GONE, e.b.NONE, uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(u uVar) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, uVar);
    }

    abstract void f(List<e> list, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.f2215e) {
            return;
        }
        if (!androidx.core.view.t.t(this.f2211a)) {
            j();
            this.f2214d = false;
            return;
        }
        synchronized (this.f2212b) {
            if (!this.f2212b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f2213c);
                this.f2213c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f2213c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f2212b);
                this.f2212b.clear();
                this.f2213c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.f2214d);
                this.f2214d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        boolean t10 = androidx.core.view.t.t(this.f2211a);
        synchronized (this.f2212b) {
            q();
            Iterator<e> it = this.f2212b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f2213c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (n.F0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (t10) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2211a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f2212b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (n.F0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (t10) {
                        str = "";
                    } else {
                        str = "Container " + this.f2211a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (this.f2215e) {
            this.f2215e = false;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.b l(u uVar) {
        e h10 = h(uVar.k());
        if (h10 != null) {
            return h10.g();
        }
        e i10 = i(uVar.k());
        if (i10 != null) {
            return i10.g();
        }
        return null;
    }

    public ViewGroup m() {
        return this.f2211a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f2212b) {
            q();
            this.f2215e = false;
            int size = this.f2212b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f2212b.get(size);
                e.c h10 = e.c.h(eVar.f().Q);
                e.c e10 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e10 == cVar && h10 != cVar) {
                    this.f2215e = eVar.f().b0();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f2214d = z10;
    }
}
