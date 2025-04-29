package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.o0;
import androidx.core.view.a0;
import androidx.core.view.b0;
import androidx.core.view.t;
import androidx.core.view.z;
import f.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k.b;
/* loaded from: classes.dex */
public class i extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator F = new AccelerateInterpolator();
    private static final Interpolator G = new DecelerateInterpolator();
    private boolean A;
    boolean B;

    /* renamed from: a  reason: collision with root package name */
    Context f748a;

    /* renamed from: b  reason: collision with root package name */
    private Context f749b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f750c;

    /* renamed from: d  reason: collision with root package name */
    private Dialog f751d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarOverlayLayout f752e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContainer f753f;

    /* renamed from: g  reason: collision with root package name */
    c0 f754g;

    /* renamed from: h  reason: collision with root package name */
    ActionBarContextView f755h;

    /* renamed from: i  reason: collision with root package name */
    View f756i;

    /* renamed from: j  reason: collision with root package name */
    o0 f757j;

    /* renamed from: m  reason: collision with root package name */
    private boolean f760m;

    /* renamed from: n  reason: collision with root package name */
    d f761n;

    /* renamed from: o  reason: collision with root package name */
    k.b f762o;

    /* renamed from: p  reason: collision with root package name */
    b.a f763p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f764q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f766s;

    /* renamed from: v  reason: collision with root package name */
    boolean f769v;

    /* renamed from: w  reason: collision with root package name */
    boolean f770w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f771x;

    /* renamed from: z  reason: collision with root package name */
    k.h f773z;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<Object> f758k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private int f759l = -1;

    /* renamed from: r  reason: collision with root package name */
    private ArrayList<a.b> f765r = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    private int f767t = 0;

    /* renamed from: u  reason: collision with root package name */
    boolean f768u = true;

    /* renamed from: y  reason: collision with root package name */
    private boolean f772y = true;
    final a0 C = new a();
    final a0 D = new b();
    final androidx.core.view.c0 E = new c();

    /* loaded from: classes.dex */
    class a extends b0 {
        a() {
        }

        @Override // androidx.core.view.a0
        public void b(View view) {
            View view2;
            i iVar = i.this;
            if (iVar.f768u && (view2 = iVar.f756i) != null) {
                view2.setTranslationY(0.0f);
                i.this.f753f.setTranslationY(0.0f);
            }
            i.this.f753f.setVisibility(8);
            i.this.f753f.setTransitioning(false);
            i iVar2 = i.this;
            iVar2.f773z = null;
            iVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = i.this.f752e;
            if (actionBarOverlayLayout != null) {
                t.C(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends b0 {
        b() {
        }

        @Override // androidx.core.view.a0
        public void b(View view) {
            i iVar = i.this;
            iVar.f773z = null;
            iVar.f753f.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements androidx.core.view.c0 {
        c() {
        }

        @Override // androidx.core.view.c0
        public void a(View view) {
            ((View) i.this.f753f.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends k.b implements e.a {

        /* renamed from: l  reason: collision with root package name */
        private final Context f777l;

        /* renamed from: m  reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f778m;

        /* renamed from: n  reason: collision with root package name */
        private b.a f779n;

        /* renamed from: o  reason: collision with root package name */
        private WeakReference<View> f780o;

        public d(Context context, b.a aVar) {
            this.f777l = context;
            this.f779n = aVar;
            androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(context).S(1);
            this.f778m = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f779n;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f779n == null) {
                return;
            }
            k();
            i.this.f755h.l();
        }

        @Override // k.b
        public void c() {
            i iVar = i.this;
            if (iVar.f761n != this) {
                return;
            }
            if (i.w(iVar.f769v, iVar.f770w, false)) {
                this.f779n.d(this);
            } else {
                i iVar2 = i.this;
                iVar2.f762o = this;
                iVar2.f763p = this.f779n;
            }
            this.f779n = null;
            i.this.v(false);
            i.this.f755h.g();
            i.this.f754g.k().sendAccessibilityEvent(32);
            i iVar3 = i.this;
            iVar3.f752e.setHideOnContentScrollEnabled(iVar3.B);
            i.this.f761n = null;
        }

        @Override // k.b
        public View d() {
            WeakReference<View> weakReference = this.f780o;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // k.b
        public Menu e() {
            return this.f778m;
        }

        @Override // k.b
        public MenuInflater f() {
            return new k.g(this.f777l);
        }

        @Override // k.b
        public CharSequence g() {
            return i.this.f755h.getSubtitle();
        }

        @Override // k.b
        public CharSequence i() {
            return i.this.f755h.getTitle();
        }

        @Override // k.b
        public void k() {
            if (i.this.f761n != this) {
                return;
            }
            this.f778m.d0();
            try {
                this.f779n.c(this, this.f778m);
            } finally {
                this.f778m.c0();
            }
        }

        @Override // k.b
        public boolean l() {
            return i.this.f755h.j();
        }

        @Override // k.b
        public void m(View view) {
            i.this.f755h.setCustomView(view);
            this.f780o = new WeakReference<>(view);
        }

        @Override // k.b
        public void n(int i10) {
            o(i.this.f748a.getResources().getString(i10));
        }

        @Override // k.b
        public void o(CharSequence charSequence) {
            i.this.f755h.setSubtitle(charSequence);
        }

        @Override // k.b
        public void q(int i10) {
            r(i.this.f748a.getResources().getString(i10));
        }

        @Override // k.b
        public void r(CharSequence charSequence) {
            i.this.f755h.setTitle(charSequence);
        }

        @Override // k.b
        public void s(boolean z10) {
            super.s(z10);
            i.this.f755h.setTitleOptional(z10);
        }

        public boolean t() {
            this.f778m.d0();
            try {
                return this.f779n.b(this, this.f778m);
            } finally {
                this.f778m.c0();
            }
        }
    }

    public i(Activity activity, boolean z10) {
        this.f750c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z10) {
            return;
        }
        this.f756i = decorView.findViewById(16908290);
    }

    public i(Dialog dialog) {
        this.f751d = dialog;
        D(dialog.getWindow().getDecorView());
    }

    private c0 A(View view) {
        if (view instanceof c0) {
            return (c0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.f771x) {
            this.f771x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f752e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.f.decor_content_parent);
        this.f752e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f754g = A(view.findViewById(f.f.action_bar));
        this.f755h = (ActionBarContextView) view.findViewById(f.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.f.action_bar_container);
        this.f753f = actionBarContainer;
        c0 c0Var = this.f754g;
        if (c0Var == null || this.f755h == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f748a = c0Var.getContext();
        boolean z10 = (this.f754g.o() & 4) != 0;
        if (z10) {
            this.f760m = true;
        }
        k.a b10 = k.a.b(this.f748a);
        J(b10.a() || z10);
        H(b10.g());
        TypedArray obtainStyledAttributes = this.f748a.obtainStyledAttributes(null, j.f8231a, f.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.f8281k, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f8271i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void H(boolean z10) {
        this.f766s = z10;
        if (z10) {
            this.f753f.setTabContainer(null);
            this.f754g.j(this.f757j);
        } else {
            this.f754g.j(null);
            this.f753f.setTabContainer(this.f757j);
        }
        boolean z11 = true;
        boolean z12 = B() == 2;
        o0 o0Var = this.f757j;
        if (o0Var != null) {
            if (z12) {
                o0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f752e;
                if (actionBarOverlayLayout != null) {
                    t.C(actionBarOverlayLayout);
                }
            } else {
                o0Var.setVisibility(8);
            }
        }
        this.f754g.u(!this.f766s && z12);
        this.f752e.setHasNonEmbeddedTabs((this.f766s || !z12) ? false : false);
    }

    private boolean K() {
        return t.u(this.f753f);
    }

    private void L() {
        if (this.f771x) {
            return;
        }
        this.f771x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f752e;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    private void M(boolean z10) {
        if (w(this.f769v, this.f770w, this.f771x)) {
            if (this.f772y) {
                return;
            }
            this.f772y = true;
            z(z10);
        } else if (this.f772y) {
            this.f772y = false;
            y(z10);
        }
    }

    static boolean w(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    public int B() {
        return this.f754g.q();
    }

    public void E(boolean z10) {
        F(z10 ? 4 : 0, 4);
    }

    public void F(int i10, int i11) {
        int o10 = this.f754g.o();
        if ((i11 & 4) != 0) {
            this.f760m = true;
        }
        this.f754g.n((i10 & i11) | ((~i11) & o10));
    }

    public void G(float f10) {
        t.I(this.f753f, f10);
    }

    public void I(boolean z10) {
        if (z10 && !this.f752e.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.B = z10;
        this.f752e.setHideOnContentScrollEnabled(z10);
    }

    public void J(boolean z10) {
        this.f754g.l(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f770w) {
            this.f770w = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        k.h hVar = this.f773z;
        if (hVar != null) {
            hVar.a();
            this.f773z = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(int i10) {
        this.f767t = i10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z10) {
        this.f768u = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        if (this.f770w) {
            return;
        }
        this.f770w = true;
        M(true);
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        c0 c0Var = this.f754g;
        if (c0Var == null || !c0Var.m()) {
            return false;
        }
        this.f754g.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z10) {
        if (z10 == this.f764q) {
            return;
        }
        this.f764q = z10;
        int size = this.f765r.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f765r.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f754g.o();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f749b == null) {
            TypedValue typedValue = new TypedValue();
            this.f748a.getTheme().resolveAttribute(f.a.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f749b = new ContextThemeWrapper(this.f748a, i10);
            } else {
                this.f749b = this.f748a;
            }
        }
        return this.f749b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        H(k.a.b(this.f748a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f761n;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        e10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
        if (this.f760m) {
            return;
        }
        E(z10);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        k.h hVar;
        this.A = z10;
        if (z10 || (hVar = this.f773z) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void t(CharSequence charSequence) {
        this.f754g.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public k.b u(b.a aVar) {
        d dVar = this.f761n;
        if (dVar != null) {
            dVar.c();
        }
        this.f752e.setHideOnContentScrollEnabled(false);
        this.f755h.k();
        d dVar2 = new d(this.f755h.getContext(), aVar);
        if (dVar2.t()) {
            this.f761n = dVar2;
            dVar2.k();
            this.f755h.h(dVar2);
            v(true);
            this.f755h.sendAccessibilityEvent(32);
            return dVar2;
        }
        return null;
    }

    public void v(boolean z10) {
        z r10;
        z f10;
        if (z10) {
            L();
        } else {
            C();
        }
        if (!K()) {
            if (z10) {
                this.f754g.i(4);
                this.f755h.setVisibility(0);
                return;
            }
            this.f754g.i(0);
            this.f755h.setVisibility(8);
            return;
        }
        if (z10) {
            f10 = this.f754g.r(4, 100L);
            r10 = this.f755h.f(0, 200L);
        } else {
            r10 = this.f754g.r(0, 200L);
            f10 = this.f755h.f(8, 100L);
        }
        k.h hVar = new k.h();
        hVar.d(f10, r10);
        hVar.h();
    }

    void x() {
        b.a aVar = this.f763p;
        if (aVar != null) {
            aVar.d(this.f762o);
            this.f762o = null;
            this.f763p = null;
        }
    }

    public void y(boolean z10) {
        View view;
        int[] iArr;
        k.h hVar = this.f773z;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f767t != 0 || (!this.A && !z10)) {
            this.C.b(null);
            return;
        }
        this.f753f.setAlpha(1.0f);
        this.f753f.setTransitioning(true);
        k.h hVar2 = new k.h();
        float f10 = -this.f753f.getHeight();
        if (z10) {
            this.f753f.getLocationInWindow(new int[]{0, 0});
            f10 -= iArr[1];
        }
        z m10 = t.b(this.f753f).m(f10);
        m10.k(this.E);
        hVar2.c(m10);
        if (this.f768u && (view = this.f756i) != null) {
            hVar2.c(t.b(view).m(f10));
        }
        hVar2.f(F);
        hVar2.e(250L);
        hVar2.g(this.C);
        this.f773z = hVar2;
        hVar2.h();
    }

    public void z(boolean z10) {
        View view;
        View view2;
        int[] iArr;
        k.h hVar = this.f773z;
        if (hVar != null) {
            hVar.a();
        }
        this.f753f.setVisibility(0);
        if (this.f767t == 0 && (this.A || z10)) {
            this.f753f.setTranslationY(0.0f);
            float f10 = -this.f753f.getHeight();
            if (z10) {
                this.f753f.getLocationInWindow(new int[]{0, 0});
                f10 -= iArr[1];
            }
            this.f753f.setTranslationY(f10);
            k.h hVar2 = new k.h();
            z m10 = t.b(this.f753f).m(0.0f);
            m10.k(this.E);
            hVar2.c(m10);
            if (this.f768u && (view2 = this.f756i) != null) {
                view2.setTranslationY(f10);
                hVar2.c(t.b(this.f756i).m(0.0f));
            }
            hVar2.f(G);
            hVar2.e(250L);
            hVar2.g(this.D);
            this.f773z = hVar2;
            hVar2.h();
        } else {
            this.f753f.setAlpha(1.0f);
            this.f753f.setTranslationY(0.0f);
            if (this.f768u && (view = this.f756i) != null) {
                view.setTranslationY(0.0f);
            }
            this.D.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f752e;
        if (actionBarOverlayLayout != null) {
            t.C(actionBarOverlayLayout);
        }
    }
}
