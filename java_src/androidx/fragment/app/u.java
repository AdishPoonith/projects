package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.c0;
import androidx.lifecycle.e;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private final m f2375a;

    /* renamed from: b  reason: collision with root package name */
    private final v f2376b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f2377c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2378d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f2379e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ View f2380j;

        a(View view) {
            this.f2380j = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2380j.removeOnAttachStateChangeListener(this);
            androidx.core.view.t.C(this.f2380j);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2382a;

        static {
            int[] iArr = new int[e.b.values().length];
            f2382a = iArr;
            try {
                iArr[e.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2382a[e.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2382a[e.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2382a[e.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(m mVar, v vVar, Fragment fragment) {
        this.f2375a = mVar;
        this.f2376b = vVar;
        this.f2377c = fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(m mVar, v vVar, Fragment fragment, t tVar) {
        this.f2375a = mVar;
        this.f2376b = vVar;
        this.f2377c = fragment;
        fragment.f2096l = null;
        fragment.f2097m = null;
        fragment.A = 0;
        fragment.f2108x = false;
        fragment.f2105u = false;
        Fragment fragment2 = fragment.f2101q;
        fragment.f2102r = fragment2 != null ? fragment2.f2099o : null;
        fragment.f2101q = null;
        Bundle bundle = tVar.f2374v;
        fragment.f2095k = bundle == null ? new Bundle() : bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(m mVar, v vVar, ClassLoader classLoader, j jVar, t tVar) {
        this.f2375a = mVar;
        this.f2376b = vVar;
        Fragment a10 = jVar.a(classLoader, tVar.f2362j);
        this.f2377c = a10;
        Bundle bundle = tVar.f2371s;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.x1(tVar.f2371s);
        a10.f2099o = tVar.f2363k;
        a10.f2107w = tVar.f2364l;
        a10.f2109y = true;
        a10.F = tVar.f2365m;
        a10.G = tVar.f2366n;
        a10.H = tVar.f2367o;
        a10.K = tVar.f2368p;
        a10.f2106v = tVar.f2369q;
        a10.J = tVar.f2370r;
        a10.I = tVar.f2372t;
        a10.f2086a0 = e.b.values()[tVar.f2373u];
        Bundle bundle2 = tVar.f2374v;
        a10.f2095k = bundle2 == null ? new Bundle() : bundle2;
        if (n.F0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    private boolean l(View view) {
        if (view == this.f2377c.Q) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2377c.Q) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f2377c.i1(bundle);
        this.f2375a.j(this.f2377c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2377c.Q != null) {
            s();
        }
        if (this.f2377c.f2096l != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2377c.f2096l);
        }
        if (this.f2377c.f2097m != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2377c.f2097m);
        }
        if (!this.f2377c.S) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2377c.S);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2377c);
        }
        Fragment fragment = this.f2377c;
        fragment.O0(fragment.f2095k);
        m mVar = this.f2375a;
        Fragment fragment2 = this.f2377c;
        mVar.a(fragment2, fragment2.f2095k, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        int j10 = this.f2376b.j(this.f2377c);
        Fragment fragment = this.f2377c;
        fragment.P.addView(fragment.Q, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2377c);
        }
        Fragment fragment = this.f2377c;
        Fragment fragment2 = fragment.f2101q;
        u uVar = null;
        if (fragment2 != null) {
            u m10 = this.f2376b.m(fragment2.f2099o);
            if (m10 == null) {
                throw new IllegalStateException("Fragment " + this.f2377c + " declared target fragment " + this.f2377c.f2101q + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f2377c;
            fragment3.f2102r = fragment3.f2101q.f2099o;
            fragment3.f2101q = null;
            uVar = m10;
        } else {
            String str = fragment.f2102r;
            if (str != null && (uVar = this.f2376b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2377c + " declared target fragment " + this.f2377c.f2102r + " that does not belong to this FragmentManager!");
            }
        }
        if (uVar != null && (n.P || uVar.k().f2094j < 1)) {
            uVar.m();
        }
        Fragment fragment4 = this.f2377c;
        fragment4.C = fragment4.B.u0();
        Fragment fragment5 = this.f2377c;
        fragment5.E = fragment5.B.x0();
        this.f2375a.g(this.f2377c, false);
        this.f2377c.P0();
        this.f2375a.b(this.f2377c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f2377c;
        if (fragment2.B == null) {
            return fragment2.f2094j;
        }
        int i10 = this.f2379e;
        int i11 = b.f2382a[fragment2.f2086a0.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        Fragment fragment3 = this.f2377c;
        if (fragment3.f2107w) {
            if (fragment3.f2108x) {
                i10 = Math.max(this.f2379e, 2);
                View view = this.f2377c.Q;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f2379e < 4 ? Math.min(i10, fragment3.f2094j) : Math.min(i10, 1);
            }
        }
        if (!this.f2377c.f2105u) {
            i10 = Math.min(i10, 1);
        }
        c0.e.b bVar = null;
        if (n.P && (viewGroup = (fragment = this.f2377c).P) != null) {
            bVar = c0.n(viewGroup, fragment.G()).l(this);
        }
        if (bVar == c0.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (bVar == c0.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f2377c;
            if (fragment4.f2106v) {
                i10 = fragment4.Z() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        Fragment fragment5 = this.f2377c;
        if (fragment5.R && fragment5.f2094j < 5) {
            i10 = Math.min(i10, 4);
        }
        if (n.F0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f2377c);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2377c);
        }
        Fragment fragment = this.f2377c;
        if (fragment.Z) {
            fragment.s1(fragment.f2095k);
            this.f2377c.f2094j = 1;
            return;
        }
        this.f2375a.h(fragment, fragment.f2095k, false);
        Fragment fragment2 = this.f2377c;
        fragment2.S0(fragment2.f2095k);
        m mVar = this.f2375a;
        Fragment fragment3 = this.f2377c;
        mVar.c(fragment3, fragment3.f2095k, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        String str;
        if (this.f2377c.f2107w) {
            return;
        }
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2377c);
        }
        Fragment fragment = this.f2377c;
        LayoutInflater Y0 = fragment.Y0(fragment.f2095k);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f2377c;
        ViewGroup viewGroup2 = fragment2.P;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment2.G;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2377c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.B.p0().d(this.f2377c.G);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f2377c;
                    if (!fragment3.f2109y) {
                        try {
                            str = fragment3.J().getResourceName(this.f2377c.G);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2377c.G) + " (" + str + ") for fragment " + this.f2377c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f2377c;
        fragment4.P = viewGroup;
        fragment4.U0(Y0, viewGroup, fragment4.f2095k);
        View view = this.f2377c.Q;
        if (view != null) {
            boolean z10 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f2377c;
            fragment5.Q.setTag(a0.b.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f2377c;
            if (fragment6.I) {
                fragment6.Q.setVisibility(8);
            }
            if (androidx.core.view.t.t(this.f2377c.Q)) {
                androidx.core.view.t.C(this.f2377c.Q);
            } else {
                View view2 = this.f2377c.Q;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f2377c.l1();
            m mVar = this.f2375a;
            Fragment fragment7 = this.f2377c;
            mVar.m(fragment7, fragment7.Q, fragment7.f2095k, false);
            int visibility = this.f2377c.Q.getVisibility();
            float alpha = this.f2377c.Q.getAlpha();
            if (n.P) {
                this.f2377c.D1(alpha);
                Fragment fragment8 = this.f2377c;
                if (fragment8.P != null && visibility == 0) {
                    View findFocus = fragment8.Q.findFocus();
                    if (findFocus != null) {
                        this.f2377c.y1(findFocus);
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2377c);
                        }
                    }
                    this.f2377c.Q.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f2377c;
                if (visibility == 0 && fragment9.P != null) {
                    z10 = true;
                }
                fragment9.V = z10;
            }
        }
        this.f2377c.f2094j = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        Fragment f10;
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2377c);
        }
        Fragment fragment = this.f2377c;
        boolean z10 = true;
        boolean z11 = fragment.f2106v && !fragment.Z();
        if (!(z11 || this.f2376b.o().o(this.f2377c))) {
            String str = this.f2377c.f2102r;
            if (str != null && (f10 = this.f2376b.f(str)) != null && f10.K) {
                this.f2377c.f2101q = f10;
            }
            this.f2377c.f2094j = 0;
            return;
        }
        k<?> kVar = this.f2377c.C;
        if (kVar instanceof androidx.lifecycle.b0) {
            z10 = this.f2376b.o().l();
        } else if (kVar.g() instanceof Activity) {
            z10 = true ^ ((Activity) kVar.g()).isChangingConfigurations();
        }
        if (z11 || z10) {
            this.f2376b.o().f(this.f2377c);
        }
        this.f2377c.V0();
        this.f2375a.d(this.f2377c, false);
        for (u uVar : this.f2376b.k()) {
            if (uVar != null) {
                Fragment k10 = uVar.k();
                if (this.f2377c.f2099o.equals(k10.f2102r)) {
                    k10.f2101q = this.f2377c;
                    k10.f2102r = null;
                }
            }
        }
        Fragment fragment2 = this.f2377c;
        String str2 = fragment2.f2102r;
        if (str2 != null) {
            fragment2.f2101q = this.f2376b.f(str2);
        }
        this.f2376b.q(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        View view;
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2377c);
        }
        Fragment fragment = this.f2377c;
        ViewGroup viewGroup = fragment.P;
        if (viewGroup != null && (view = fragment.Q) != null) {
            viewGroup.removeView(view);
        }
        this.f2377c.W0();
        this.f2375a.n(this.f2377c, false);
        Fragment fragment2 = this.f2377c;
        fragment2.P = null;
        fragment2.Q = null;
        fragment2.f2088c0 = null;
        fragment2.f2089d0.n(null);
        this.f2377c.f2108x = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2377c);
        }
        this.f2377c.X0();
        boolean z10 = false;
        this.f2375a.e(this.f2377c, false);
        Fragment fragment = this.f2377c;
        fragment.f2094j = -1;
        fragment.C = null;
        fragment.E = null;
        fragment.B = null;
        if (fragment.f2106v && !fragment.Z()) {
            z10 = true;
        }
        if (z10 || this.f2376b.o().o(this.f2377c)) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f2377c);
            }
            this.f2377c.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f2377c;
        if (fragment.f2107w && fragment.f2108x && !fragment.f2110z) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2377c);
            }
            Fragment fragment2 = this.f2377c;
            fragment2.U0(fragment2.Y0(fragment2.f2095k), null, this.f2377c.f2095k);
            View view = this.f2377c.Q;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2377c;
                fragment3.Q.setTag(a0.b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2377c;
                if (fragment4.I) {
                    fragment4.Q.setVisibility(8);
                }
                this.f2377c.l1();
                m mVar = this.f2375a;
                Fragment fragment5 = this.f2377c;
                mVar.m(fragment5, fragment5.Q, fragment5.f2095k, false);
                this.f2377c.f2094j = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment k() {
        return this.f2377c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2378d) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f2378d = true;
            while (true) {
                int d10 = d();
                Fragment fragment = this.f2377c;
                int i10 = fragment.f2094j;
                if (d10 == i10) {
                    if (n.P && fragment.W) {
                        if (fragment.Q != null && (viewGroup = fragment.P) != null) {
                            c0 n10 = c0.n(viewGroup, fragment.G());
                            if (this.f2377c.I) {
                                n10.c(this);
                            } else {
                                n10.e(this);
                            }
                        }
                        Fragment fragment2 = this.f2377c;
                        fragment2.W = false;
                        fragment2.x0(fragment2.I);
                    }
                    return;
                } else if (d10 > i10) {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.Q != null && (viewGroup2 = fragment.P) != null) {
                                c0.n(viewGroup2, fragment.G()).b(c0.e.c.g(this.f2377c.Q.getVisibility()), this);
                            }
                            this.f2377c.f2094j = 4;
                            continue;
                        case 5:
                            u();
                            continue;
                        case 6:
                            fragment.f2094j = 6;
                            continue;
                        case 7:
                            p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i10 - 1) {
                        case IntegrityErrorCode.API_NOT_AVAILABLE /* -1 */:
                            i();
                            continue;
                        case 0:
                            g();
                            continue;
                        case 1:
                            h();
                            this.f2377c.f2094j = 1;
                            continue;
                        case 2:
                            fragment.f2108x = false;
                            fragment.f2094j = 2;
                            continue;
                        case 3:
                            if (n.F0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2377c);
                            }
                            Fragment fragment3 = this.f2377c;
                            if (fragment3.Q != null && fragment3.f2096l == null) {
                                s();
                            }
                            Fragment fragment4 = this.f2377c;
                            if (fragment4.Q != null && (viewGroup3 = fragment4.P) != null) {
                                c0.n(viewGroup3, fragment4.G()).d(this);
                            }
                            this.f2377c.f2094j = 3;
                            continue;
                        case 4:
                            v();
                            continue;
                        case 5:
                            fragment.f2094j = 5;
                            continue;
                        case 6:
                            n();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.f2378d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2377c);
        }
        this.f2377c.d1();
        this.f2375a.f(this.f2377c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f2377c.f2095k;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2377c;
        fragment.f2096l = fragment.f2095k.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2377c;
        fragment2.f2097m = fragment2.f2095k.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f2377c;
        fragment3.f2102r = fragment3.f2095k.getString("android:target_state");
        Fragment fragment4 = this.f2377c;
        if (fragment4.f2102r != null) {
            fragment4.f2103s = fragment4.f2095k.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f2377c;
        Boolean bool = fragment5.f2098n;
        if (bool != null) {
            fragment5.S = bool.booleanValue();
            this.f2377c.f2098n = null;
        } else {
            fragment5.S = fragment5.f2095k.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f2377c;
        if (fragment6.S) {
            return;
        }
        fragment6.R = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2377c);
        }
        View z10 = this.f2377c.z();
        if (z10 != null && l(z10)) {
            boolean requestFocus = z10.requestFocus();
            if (n.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(z10);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f2377c);
                sb.append(" resulting in focused view ");
                sb.append(this.f2377c.Q.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f2377c.y1(null);
        this.f2377c.h1();
        this.f2375a.i(this.f2377c, false);
        Fragment fragment = this.f2377c;
        fragment.f2095k = null;
        fragment.f2096l = null;
        fragment.f2097m = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t r() {
        t tVar = new t(this.f2377c);
        Fragment fragment = this.f2377c;
        if (fragment.f2094j <= -1 || tVar.f2374v != null) {
            tVar.f2374v = fragment.f2095k;
        } else {
            Bundle q10 = q();
            tVar.f2374v = q10;
            if (this.f2377c.f2102r != null) {
                if (q10 == null) {
                    tVar.f2374v = new Bundle();
                }
                tVar.f2374v.putString("android:target_state", this.f2377c.f2102r);
                int i10 = this.f2377c.f2103s;
                if (i10 != 0) {
                    tVar.f2374v.putInt("android:target_req_state", i10);
                }
            }
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        if (this.f2377c.Q == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2377c.Q.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2377c.f2096l = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2377c.f2088c0.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2377c.f2097m = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i10) {
        this.f2379e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2377c);
        }
        this.f2377c.j1();
        this.f2375a.k(this.f2377c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2377c);
        }
        this.f2377c.k1();
        this.f2375a.l(this.f2377c, false);
    }
}
