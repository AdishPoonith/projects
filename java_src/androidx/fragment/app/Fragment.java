package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.i, androidx.lifecycle.b0, androidx.lifecycle.d, f0.d {

    /* renamed from: i0  reason: collision with root package name */
    static final Object f2085i0 = new Object();
    int A;
    n B;
    androidx.fragment.app.k<?> C;
    Fragment E;
    int F;
    int G;
    String H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    private boolean O;
    ViewGroup P;
    View Q;
    boolean R;
    h T;
    boolean V;
    boolean W;
    float X;
    LayoutInflater Y;
    boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    androidx.lifecycle.j f2087b0;

    /* renamed from: c0  reason: collision with root package name */
    a0 f2088c0;

    /* renamed from: e0  reason: collision with root package name */
    f0.c f2090e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f2091f0;

    /* renamed from: k  reason: collision with root package name */
    Bundle f2095k;

    /* renamed from: l  reason: collision with root package name */
    SparseArray<Parcelable> f2096l;

    /* renamed from: m  reason: collision with root package name */
    Bundle f2097m;

    /* renamed from: n  reason: collision with root package name */
    Boolean f2098n;

    /* renamed from: p  reason: collision with root package name */
    Bundle f2100p;

    /* renamed from: q  reason: collision with root package name */
    Fragment f2101q;

    /* renamed from: s  reason: collision with root package name */
    int f2103s;

    /* renamed from: u  reason: collision with root package name */
    boolean f2105u;

    /* renamed from: v  reason: collision with root package name */
    boolean f2106v;

    /* renamed from: w  reason: collision with root package name */
    boolean f2107w;

    /* renamed from: x  reason: collision with root package name */
    boolean f2108x;

    /* renamed from: y  reason: collision with root package name */
    boolean f2109y;

    /* renamed from: z  reason: collision with root package name */
    boolean f2110z;

    /* renamed from: j  reason: collision with root package name */
    int f2094j = -1;

    /* renamed from: o  reason: collision with root package name */
    String f2099o = UUID.randomUUID().toString();

    /* renamed from: r  reason: collision with root package name */
    String f2102r = null;

    /* renamed from: t  reason: collision with root package name */
    private Boolean f2104t = null;
    n D = new o();
    boolean N = true;
    boolean S = true;
    Runnable U = new a();

    /* renamed from: a0  reason: collision with root package name */
    e.b f2086a0 = e.b.RESUMED;

    /* renamed from: d0  reason: collision with root package name */
    androidx.lifecycle.n<androidx.lifecycle.i> f2089d0 = new androidx.lifecycle.n<>();

    /* renamed from: g0  reason: collision with root package name */
    private final AtomicInteger f2092g0 = new AtomicInteger();

    /* renamed from: h0  reason: collision with root package name */
    private final ArrayList<j> f2093h0 = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.H1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.e(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c0 f2114j;

        c(c0 c0Var) {
            this.f2114j = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2114j.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends androidx.fragment.app.g {
        d() {
        }

        @Override // androidx.fragment.app.g
        public View d(int i10) {
            View view = Fragment.this.Q;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.g
        public boolean e() {
            return Fragment.this.Q != null;
        }
    }

    /* loaded from: classes.dex */
    class e implements o.a<Void, ActivityResultRegistry> {
        e() {
        }

        @Override // o.a
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            androidx.fragment.app.k<?> kVar = fragment.C;
            return kVar instanceof androidx.activity.result.d ? ((androidx.activity.result.d) kVar).m() : fragment.p1().m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o.a f2118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicReference f2119b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e.a f2120c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.b f2121d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(o.a aVar, AtomicReference atomicReference, e.a aVar2, androidx.activity.result.b bVar) {
            super(null);
            this.f2118a = aVar;
            this.f2119b = atomicReference;
            this.f2120c = aVar2;
            this.f2121d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.j
        void a() {
            this.f2119b.set(((ActivityResultRegistry) this.f2118a.apply(null)).i(Fragment.this.m(), Fragment.this, this.f2120c, this.f2121d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class g<I> extends androidx.activity.result.c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicReference f2123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f2124b;

        g(AtomicReference atomicReference, e.a aVar) {
            this.f2123a = atomicReference;
            this.f2124b = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i10, androidx.core.app.c cVar) {
            androidx.activity.result.c cVar2 = (androidx.activity.result.c) this.f2123a.get();
            if (cVar2 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar2.b(i10, cVar);
        }

        @Override // androidx.activity.result.c
        public void c() {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f2123a.getAndSet(null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        View f2126a;

        /* renamed from: b  reason: collision with root package name */
        Animator f2127b;

        /* renamed from: c  reason: collision with root package name */
        int f2128c;

        /* renamed from: d  reason: collision with root package name */
        int f2129d;

        /* renamed from: e  reason: collision with root package name */
        ArrayList<String> f2130e;

        /* renamed from: f  reason: collision with root package name */
        ArrayList<String> f2131f;

        /* renamed from: g  reason: collision with root package name */
        Object f2132g = null;

        /* renamed from: h  reason: collision with root package name */
        Object f2133h;

        /* renamed from: i  reason: collision with root package name */
        Object f2134i;

        /* renamed from: j  reason: collision with root package name */
        Object f2135j;

        /* renamed from: k  reason: collision with root package name */
        Object f2136k;

        /* renamed from: l  reason: collision with root package name */
        Object f2137l;

        /* renamed from: m  reason: collision with root package name */
        Boolean f2138m;

        /* renamed from: n  reason: collision with root package name */
        Boolean f2139n;

        /* renamed from: o  reason: collision with root package name */
        float f2140o;

        /* renamed from: p  reason: collision with root package name */
        View f2141p;

        /* renamed from: q  reason: collision with root package name */
        boolean f2142q;

        /* renamed from: r  reason: collision with root package name */
        k f2143r;

        /* renamed from: s  reason: collision with root package name */
        boolean f2144s;

        h() {
            Object obj = Fragment.f2085i0;
            this.f2133h = obj;
            this.f2134i = null;
            this.f2135j = obj;
            this.f2136k = null;
            this.f2137l = obj;
            this.f2140o = 1.0f;
            this.f2141p = null;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends RuntimeException {
        public i(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class j {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        abstract void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface k {
        void a();

        void b();
    }

    public Fragment() {
        U();
    }

    private int C() {
        e.b bVar = this.f2086a0;
        return (bVar == e.b.INITIALIZED || this.E == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.E.C());
    }

    private void U() {
        this.f2087b0 = new androidx.lifecycle.j(this);
        this.f2090e0 = f0.c.a(this);
    }

    @Deprecated
    public static Fragment W(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.j.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.x1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new i("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new i("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private h k() {
        if (this.T == null) {
            this.T = new h();
        }
        return this.T;
    }

    private <I, O> androidx.activity.result.c<I> m1(e.a<I, O> aVar, o.a<Void, ActivityResultRegistry> aVar2, androidx.activity.result.b<O> bVar) {
        if (this.f2094j <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            o1(new f(aVar2, atomicReference, aVar, bVar));
            return new g(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void o1(j jVar) {
        if (this.f2094j >= 0) {
            jVar.a();
        } else {
            this.f2093h0.add(jVar);
        }
    }

    private void t1() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.Q != null) {
            u1(this.f2095k);
        }
        this.f2095k = null;
    }

    public final Object A() {
        androidx.fragment.app.k<?> kVar = this.C;
        if (kVar == null) {
            return null;
        }
        return kVar.k();
    }

    public void A0(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A1(int i10) {
        if (this.T == null && i10 == 0) {
            return;
        }
        k().f2128c = i10;
    }

    @Deprecated
    public LayoutInflater B(Bundle bundle) {
        androidx.fragment.app.k<?> kVar = this.C;
        if (kVar != null) {
            LayoutInflater l10 = kVar.l();
            androidx.core.view.f.a(l10, this.D.v0());
            return l10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public boolean B0(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B1(int i10) {
        if (this.T == null && i10 == 0) {
            return;
        }
        k();
        this.T.f2129d = i10;
    }

    public void C0(Menu menu) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C1(k kVar) {
        k();
        h hVar = this.T;
        k kVar2 = hVar.f2143r;
        if (kVar == kVar2) {
            return;
        }
        if (kVar != null && kVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (hVar.f2142q) {
            hVar.f2143r = kVar;
        }
        if (kVar != null) {
            kVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int D() {
        h hVar = this.T;
        if (hVar == null) {
            return 0;
        }
        return hVar.f2128c;
    }

    public void D0() {
        this.O = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D1(float f10) {
        k().f2140o = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int E() {
        h hVar = this.T;
        if (hVar == null) {
            return 0;
        }
        return hVar.f2129d;
    }

    public void E0(boolean z10) {
    }

    @Deprecated
    public void E1(boolean z10) {
        this.K = z10;
        n nVar = this.B;
        if (nVar == null) {
            this.L = true;
        } else if (z10) {
            nVar.i(this);
        } else {
            nVar.b1(this);
        }
    }

    public final Fragment F() {
        return this.E;
    }

    public void F0(Menu menu) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        k();
        h hVar = this.T;
        hVar.f2130e = arrayList;
        hVar.f2131f = arrayList2;
    }

    public final n G() {
        n nVar = this.B;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void G0(boolean z10) {
    }

    @Deprecated
    public void G1(Intent intent, int i10, Bundle bundle) {
        if (this.C != null) {
            G().L0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float H() {
        h hVar = this.T;
        if (hVar == null) {
            return 1.0f;
        }
        return hVar.f2140o;
    }

    @Deprecated
    public void H0(int i10, String[] strArr, int[] iArr) {
    }

    public void H1() {
        if (this.T == null || !k().f2142q) {
            return;
        }
        if (this.C == null) {
            k().f2142q = false;
        } else if (Looper.myLooper() != this.C.h().getLooper()) {
            this.C.h().postAtFrontOfQueue(new b());
        } else {
            e(true);
        }
    }

    public Object I() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f2135j;
        return obj == f2085i0 ? x() : obj;
    }

    public void I0() {
        this.O = true;
    }

    public final Resources J() {
        return q1().getResources();
    }

    public void J0(Bundle bundle) {
    }

    @Deprecated
    public final boolean K() {
        return this.K;
    }

    public void K0() {
        this.O = true;
    }

    public Object L() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f2133h;
        return obj == f2085i0 ? v() : obj;
    }

    public void L0() {
        this.O = true;
    }

    public Object M() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        return hVar.f2136k;
    }

    public void M0(View view, Bundle bundle) {
    }

    public Object N() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f2137l;
        return obj == f2085i0 ? M() : obj;
    }

    public void N0(Bundle bundle) {
        this.O = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> O() {
        ArrayList<String> arrayList;
        h hVar = this.T;
        return (hVar == null || (arrayList = hVar.f2130e) == null) ? new ArrayList<>() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O0(Bundle bundle) {
        this.D.R0();
        this.f2094j = 3;
        this.O = false;
        h0(bundle);
        if (this.O) {
            t1();
            this.D.z();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> P() {
        ArrayList<String> arrayList;
        h hVar = this.T;
        return (hVar == null || (arrayList = hVar.f2131f) == null) ? new ArrayList<>() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0() {
        Iterator<j> it = this.f2093h0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f2093h0.clear();
        this.D.k(this.C, f(), this);
        this.f2094j = 0;
        this.O = false;
        k0(this.C.g());
        if (this.O) {
            this.B.J(this);
            this.D.A();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onAttach()");
    }

    public final String Q(int i10) {
        return J().getString(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.D.B(configuration);
    }

    @Deprecated
    public final Fragment R() {
        String str;
        Fragment fragment = this.f2101q;
        if (fragment != null) {
            return fragment;
        }
        n nVar = this.B;
        if (nVar == null || (str = this.f2102r) == null) {
            return null;
        }
        return nVar.h0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean R0(MenuItem menuItem) {
        if (this.I) {
            return false;
        }
        if (m0(menuItem)) {
            return true;
        }
        return this.D.C(menuItem);
    }

    public View S() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S0(Bundle bundle) {
        this.D.R0();
        this.f2094j = 1;
        this.O = false;
        this.f2087b0.a(new androidx.lifecycle.g() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.g
            public void q(androidx.lifecycle.i iVar, e.a aVar) {
                View view;
                if (aVar != e.a.ON_STOP || (view = Fragment.this.Q) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.f2090e0.d(bundle);
        n0(bundle);
        this.Z = true;
        if (this.O) {
            this.f2087b0.h(e.a.ON_CREATE);
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public LiveData<androidx.lifecycle.i> T() {
        return this.f2089d0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean T0(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.I) {
            return false;
        }
        if (this.M && this.N) {
            z10 = true;
            q0(menu, menuInflater);
        }
        return z10 | this.D.E(menu, menuInflater);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D.R0();
        this.f2110z = true;
        this.f2088c0 = new a0();
        View r02 = r0(layoutInflater, viewGroup, bundle);
        this.Q = r02;
        if (r02 == null) {
            if (this.f2088c0.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2088c0 = null;
            return;
        }
        this.f2088c0.c();
        androidx.lifecycle.c0.a(this.Q, this.f2088c0);
        androidx.lifecycle.d0.a(this.Q, this);
        f0.e.a(this.Q, this.f2088c0);
        this.f2089d0.n(this.f2088c0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        U();
        this.f2099o = UUID.randomUUID().toString();
        this.f2105u = false;
        this.f2106v = false;
        this.f2107w = false;
        this.f2108x = false;
        this.f2109y = false;
        this.A = 0;
        this.B = null;
        this.D = new o();
        this.C = null;
        this.F = 0;
        this.G = 0;
        this.H = null;
        this.I = false;
        this.J = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V0() {
        this.D.F();
        this.f2087b0.h(e.a.ON_DESTROY);
        this.f2094j = 0;
        this.O = false;
        this.Z = false;
        s0();
        if (this.O) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W0() {
        this.D.G();
        if (this.Q != null && this.f2088c0.a().b().g(e.b.CREATED)) {
            this.f2088c0.b(e.a.ON_DESTROY);
        }
        this.f2094j = 1;
        this.O = false;
        u0();
        if (this.O) {
            androidx.loader.app.a.b(this).d();
            this.f2110z = false;
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public final boolean X() {
        return this.C != null && this.f2105u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X0() {
        this.f2094j = -1;
        this.O = false;
        v0();
        this.Y = null;
        if (this.O) {
            if (this.D.E0()) {
                return;
            }
            this.D.F();
            this.D = new o();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Y() {
        h hVar = this.T;
        if (hVar == null) {
            return false;
        }
        return hVar.f2144s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater Y0(Bundle bundle) {
        LayoutInflater w02 = w0(bundle);
        this.Y = w02;
        return w02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Z() {
        return this.A > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0() {
        onLowMemory();
        this.D.H();
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        return this.f2087b0;
    }

    public final boolean a0() {
        n nVar;
        return this.N && ((nVar = this.B) == null || nVar.H0(this.E));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a1(boolean z10) {
        A0(z10);
        this.D.I(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b0() {
        h hVar = this.T;
        if (hVar == null) {
            return false;
        }
        return hVar.f2142q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b1(MenuItem menuItem) {
        if (this.I) {
            return false;
        }
        if (this.M && this.N && B0(menuItem)) {
            return true;
        }
        return this.D.K(menuItem);
    }

    public final boolean c0() {
        return this.f2106v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c1(Menu menu) {
        if (this.I) {
            return;
        }
        if (this.M && this.N) {
            C0(menu);
        }
        this.D.L(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d0() {
        Fragment F = F();
        return F != null && (F.c0() || F.d0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1() {
        this.D.N();
        if (this.Q != null) {
            this.f2088c0.b(e.a.ON_PAUSE);
        }
        this.f2087b0.h(e.a.ON_PAUSE);
        this.f2094j = 6;
        this.O = false;
        D0();
        if (this.O) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onPause()");
    }

    void e(boolean z10) {
        ViewGroup viewGroup;
        n nVar;
        h hVar = this.T;
        k kVar = null;
        if (hVar != null) {
            hVar.f2142q = false;
            k kVar2 = hVar.f2143r;
            hVar.f2143r = null;
            kVar = kVar2;
        }
        if (kVar != null) {
            kVar.a();
        } else if (!n.P || this.Q == null || (viewGroup = this.P) == null || (nVar = this.B) == null) {
        } else {
            c0 n10 = c0.n(viewGroup, nVar);
            n10.p();
            if (z10) {
                this.C.h().post(new c(n10));
            } else {
                n10.g();
            }
        }
    }

    public final boolean e0() {
        return this.f2094j >= 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(boolean z10) {
        E0(z10);
        this.D.O(z10);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.g f() {
        return new d();
    }

    public final boolean f0() {
        n nVar = this.B;
        if (nVar == null) {
            return false;
        }
        return nVar.K0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f1(Menu menu) {
        boolean z10 = false;
        if (this.I) {
            return false;
        }
        if (this.M && this.N) {
            z10 = true;
            F0(menu);
        }
        return z10 | this.D.P(menu);
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mTag=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2094j);
        printWriter.print(" mWho=");
        printWriter.print(this.f2099o);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2105u);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2106v);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2107w);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2108x);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.I);
        printWriter.print(" mDetached=");
        printWriter.print(this.J);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.N);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.M);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.K);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.S);
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.B);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.C);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.E);
        }
        if (this.f2100p != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2100p);
        }
        if (this.f2095k != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2095k);
        }
        if (this.f2096l != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2096l);
        }
        if (this.f2097m != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2097m);
        }
        Fragment R = R();
        if (R != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(R);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2103s);
        }
        if (D() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(D());
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.Q);
        }
        if (r() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(r());
        }
        if (u() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.D + ":");
        n nVar = this.D;
        nVar.X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0() {
        this.D.R0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g1() {
        boolean I0 = this.B.I0(this);
        Boolean bool = this.f2104t;
        if (bool == null || bool.booleanValue() != I0) {
            this.f2104t = Boolean.valueOf(I0);
            G0(I0);
            this.D.Q();
        }
    }

    @Override // androidx.lifecycle.d
    public /* synthetic */ c0.a h() {
        return androidx.lifecycle.c.a(this);
    }

    @Deprecated
    public void h0(Bundle bundle) {
        this.O = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h1() {
        this.D.R0();
        this.D.b0(true);
        this.f2094j = 7;
        this.O = false;
        I0();
        if (!this.O) {
            throw new e0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.j jVar = this.f2087b0;
        e.a aVar = e.a.ON_RESUME;
        jVar.h(aVar);
        if (this.Q != null) {
            this.f2088c0.b(aVar);
        }
        this.D.R();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Deprecated
    public void i0(int i10, int i11, Intent intent) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i1(Bundle bundle) {
        J0(bundle);
        this.f2090e0.e(bundle);
        Parcelable f12 = this.D.f1();
        if (f12 != null) {
            bundle.putParcelable("android:support:fragments", f12);
        }
    }

    @Override // f0.d
    public final androidx.savedstate.a j() {
        return this.f2090e0.b();
    }

    @Deprecated
    public void j0(Activity activity) {
        this.O = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j1() {
        this.D.R0();
        this.D.b0(true);
        this.f2094j = 5;
        this.O = false;
        K0();
        if (!this.O) {
            throw new e0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.j jVar = this.f2087b0;
        e.a aVar = e.a.ON_START;
        jVar.h(aVar);
        if (this.Q != null) {
            this.f2088c0.b(aVar);
        }
        this.D.S();
    }

    public void k0(Context context) {
        this.O = true;
        androidx.fragment.app.k<?> kVar = this.C;
        Activity f10 = kVar == null ? null : kVar.f();
        if (f10 != null) {
            this.O = false;
            j0(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k1() {
        this.D.U();
        if (this.Q != null) {
            this.f2088c0.b(e.a.ON_STOP);
        }
        this.f2087b0.h(e.a.ON_STOP);
        this.f2094j = 4;
        this.O = false;
        L0();
        if (this.O) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onStop()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment l(String str) {
        return str.equals(this.f2099o) ? this : this.D.k0(str);
    }

    @Deprecated
    public void l0(Fragment fragment) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l1() {
        M0(this.Q, this.f2095k);
        this.D.V();
    }

    String m() {
        return "fragment_" + this.f2099o + "_rq#" + this.f2092g0.getAndIncrement();
    }

    public boolean m0(MenuItem menuItem) {
        return false;
    }

    public final androidx.fragment.app.e n() {
        androidx.fragment.app.k<?> kVar = this.C;
        if (kVar == null) {
            return null;
        }
        return (androidx.fragment.app.e) kVar.f();
    }

    public void n0(Bundle bundle) {
        this.O = true;
        s1(bundle);
        if (this.D.J0(1)) {
            return;
        }
        this.D.D();
    }

    public final <I, O> androidx.activity.result.c<I> n1(e.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return m1(aVar, new e(), bVar);
    }

    public boolean o() {
        Boolean bool;
        h hVar = this.T;
        if (hVar == null || (bool = hVar.f2139n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animation o0(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.O = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        p1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.O = true;
    }

    @Override // androidx.lifecycle.b0
    public androidx.lifecycle.a0 p() {
        if (this.B != null) {
            if (C() != e.b.INITIALIZED.ordinal()) {
                return this.B.B0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public Animator p0(int i10, boolean z10, int i11) {
        return null;
    }

    public final androidx.fragment.app.e p1() {
        androidx.fragment.app.e n10 = n();
        if (n10 != null) {
            return n10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean q() {
        Boolean bool;
        h hVar = this.T;
        if (hVar == null || (bool = hVar.f2138m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void q0(Menu menu, MenuInflater menuInflater) {
    }

    public final Context q1() {
        Context u10 = u();
        if (u10 != null) {
            return u10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View r() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        return hVar.f2126a;
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f2091f0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public final View r1() {
        View S = S();
        if (S != null) {
            return S;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Animator s() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        return hVar.f2127b;
    }

    public void s0() {
        this.O = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.D.d1(parcelable);
        this.D.D();
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        G1(intent, i10, null);
    }

    public final n t() {
        if (this.C != null) {
            return this.D;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void t0() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2099o);
        sb.append(")");
        if (this.F != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.F));
        }
        if (this.H != null) {
            sb.append(" ");
            sb.append(this.H);
        }
        sb.append('}');
        return sb.toString();
    }

    public Context u() {
        androidx.fragment.app.k<?> kVar = this.C;
        if (kVar == null) {
            return null;
        }
        return kVar.g();
    }

    public void u0() {
        this.O = true;
    }

    final void u1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2096l;
        if (sparseArray != null) {
            this.Q.restoreHierarchyState(sparseArray);
            this.f2096l = null;
        }
        if (this.Q != null) {
            this.f2088c0.e(this.f2097m);
            this.f2097m = null;
        }
        this.O = false;
        N0(bundle);
        if (this.O) {
            if (this.Q != null) {
                this.f2088c0.b(e.a.ON_CREATE);
                return;
            }
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public Object v() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        return hVar.f2132g;
    }

    public void v0() {
        this.O = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v1(View view) {
        k().f2126a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.app.r w() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        Objects.requireNonNull(hVar);
        return null;
    }

    public LayoutInflater w0(Bundle bundle) {
        return B(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w1(Animator animator) {
        k().f2127b = animator;
    }

    public Object x() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        return hVar.f2134i;
    }

    public void x0(boolean z10) {
    }

    public void x1(Bundle bundle) {
        if (this.B != null && f0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2100p = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.app.r y() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        Objects.requireNonNull(hVar);
        return null;
    }

    @Deprecated
    public void y0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y1(View view) {
        k().f2141p = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View z() {
        h hVar = this.T;
        if (hVar == null) {
            return null;
        }
        return hVar.f2141p;
    }

    public void z0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
        androidx.fragment.app.k<?> kVar = this.C;
        Activity f10 = kVar == null ? null : kVar.f();
        if (f10 != null) {
            this.O = false;
            y0(f10, attributeSet, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z1(boolean z10) {
        k().f2144s = z10;
    }
}
