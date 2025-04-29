package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public class w0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1372a;

    /* renamed from: b  reason: collision with root package name */
    private int f1373b;

    /* renamed from: c  reason: collision with root package name */
    private View f1374c;

    /* renamed from: d  reason: collision with root package name */
    private View f1375d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1376e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1377f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1378g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1379h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f1380i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1381j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1382k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f1383l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1384m;

    /* renamed from: n  reason: collision with root package name */
    private c f1385n;

    /* renamed from: o  reason: collision with root package name */
    private int f1386o;

    /* renamed from: p  reason: collision with root package name */
    private int f1387p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f1388q;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: j  reason: collision with root package name */
        final l.a f1389j;

        a() {
            this.f1389j = new l.a(w0.this.f1372a.getContext(), 0, 16908332, 0, 0, w0.this.f1380i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w0 w0Var = w0.this;
            Window.Callback callback = w0Var.f1383l;
            if (callback == null || !w0Var.f1384m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1389j);
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.core.view.b0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1391a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1392b;

        b(int i10) {
            this.f1392b = i10;
        }

        @Override // androidx.core.view.b0, androidx.core.view.a0
        public void a(View view) {
            this.f1391a = true;
        }

        @Override // androidx.core.view.a0
        public void b(View view) {
            if (this.f1391a) {
                return;
            }
            w0.this.f1372a.setVisibility(this.f1392b);
        }

        @Override // androidx.core.view.b0, androidx.core.view.a0
        public void c(View view) {
            w0.this.f1372a.setVisibility(0);
        }
    }

    public w0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, f.h.abc_action_bar_up_description, f.e.abc_ic_ab_back_material);
    }

    public w0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1386o = 0;
        this.f1387p = 0;
        this.f1372a = toolbar;
        this.f1380i = toolbar.getTitle();
        this.f1381j = toolbar.getSubtitle();
        this.f1379h = this.f1380i != null;
        this.f1378g = toolbar.getNavigationIcon();
        v0 t10 = v0.t(toolbar.getContext(), null, f.j.f8231a, f.a.actionBarStyle, 0);
        this.f1388q = t10.f(f.j.f8286l);
        if (z10) {
            CharSequence o10 = t10.o(f.j.f8316r);
            if (!TextUtils.isEmpty(o10)) {
                D(o10);
            }
            CharSequence o11 = t10.o(f.j.f8306p);
            if (!TextUtils.isEmpty(o11)) {
                C(o11);
            }
            Drawable f10 = t10.f(f.j.f8296n);
            if (f10 != null) {
                y(f10);
            }
            Drawable f11 = t10.f(f.j.f8291m);
            if (f11 != null) {
                setIcon(f11);
            }
            if (this.f1378g == null && (drawable = this.f1388q) != null) {
                B(drawable);
            }
            n(t10.j(f.j.f8266h, 0));
            int m10 = t10.m(f.j.f8261g, 0);
            if (m10 != 0) {
                w(LayoutInflater.from(this.f1372a.getContext()).inflate(m10, (ViewGroup) this.f1372a, false));
                n(this.f1373b | 16);
            }
            int l10 = t10.l(f.j.f8276j, 0);
            if (l10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1372a.getLayoutParams();
                layoutParams.height = l10;
                this.f1372a.setLayoutParams(layoutParams);
            }
            int d10 = t10.d(f.j.f8256f, -1);
            int d11 = t10.d(f.j.f8251e, -1);
            if (d10 >= 0 || d11 >= 0) {
                this.f1372a.H(Math.max(d10, 0), Math.max(d11, 0));
            }
            int m11 = t10.m(f.j.f8321s, 0);
            if (m11 != 0) {
                Toolbar toolbar2 = this.f1372a;
                toolbar2.K(toolbar2.getContext(), m11);
            }
            int m12 = t10.m(f.j.f8311q, 0);
            if (m12 != 0) {
                Toolbar toolbar3 = this.f1372a;
                toolbar3.J(toolbar3.getContext(), m12);
            }
            int m13 = t10.m(f.j.f8301o, 0);
            if (m13 != 0) {
                this.f1372a.setPopupTheme(m13);
            }
        } else {
            this.f1373b = v();
        }
        t10.u();
        x(i10);
        this.f1382k = this.f1372a.getNavigationContentDescription();
        this.f1372a.setNavigationOnClickListener(new a());
    }

    private void E(CharSequence charSequence) {
        this.f1380i = charSequence;
        if ((this.f1373b & 8) != 0) {
            this.f1372a.setTitle(charSequence);
        }
    }

    private void F() {
        if ((this.f1373b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1382k)) {
                this.f1372a.setNavigationContentDescription(this.f1387p);
            } else {
                this.f1372a.setNavigationContentDescription(this.f1382k);
            }
        }
    }

    private void G() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1373b & 4) != 0) {
            toolbar = this.f1372a;
            drawable = this.f1378g;
            if (drawable == null) {
                drawable = this.f1388q;
            }
        } else {
            toolbar = this.f1372a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void H() {
        Drawable drawable;
        int i10 = this.f1373b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1377f) == null) {
            drawable = this.f1376e;
        }
        this.f1372a.setLogo(drawable);
    }

    private int v() {
        if (this.f1372a.getNavigationIcon() != null) {
            this.f1388q = this.f1372a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public void A(CharSequence charSequence) {
        this.f1382k = charSequence;
        F();
    }

    public void B(Drawable drawable) {
        this.f1378g = drawable;
        G();
    }

    public void C(CharSequence charSequence) {
        this.f1381j = charSequence;
        if ((this.f1373b & 8) != 0) {
            this.f1372a.setSubtitle(charSequence);
        }
    }

    public void D(CharSequence charSequence) {
        this.f1379h = true;
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.c0
    public void a(Menu menu, j.a aVar) {
        if (this.f1385n == null) {
            c cVar = new c(this.f1372a.getContext());
            this.f1385n = cVar;
            cVar.p(f.f.action_menu_presenter);
        }
        this.f1385n.k(aVar);
        this.f1372a.I((androidx.appcompat.view.menu.e) menu, this.f1385n);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean b() {
        return this.f1372a.A();
    }

    @Override // androidx.appcompat.widget.c0
    public void c() {
        this.f1384m = true;
    }

    @Override // androidx.appcompat.widget.c0
    public void collapseActionView() {
        this.f1372a.e();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean d() {
        return this.f1372a.z();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean e() {
        return this.f1372a.w();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean f() {
        return this.f1372a.N();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean g() {
        return this.f1372a.d();
    }

    @Override // androidx.appcompat.widget.c0
    public Context getContext() {
        return this.f1372a.getContext();
    }

    @Override // androidx.appcompat.widget.c0
    public CharSequence getTitle() {
        return this.f1372a.getTitle();
    }

    @Override // androidx.appcompat.widget.c0
    public void h() {
        this.f1372a.f();
    }

    @Override // androidx.appcompat.widget.c0
    public void i(int i10) {
        this.f1372a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.c0
    public void j(o0 o0Var) {
        View view = this.f1374c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1372a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1374c);
            }
        }
        this.f1374c = o0Var;
        if (o0Var == null || this.f1386o != 2) {
            return;
        }
        this.f1372a.addView(o0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1374c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f653a = 8388691;
        o0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.c0
    public ViewGroup k() {
        return this.f1372a;
    }

    @Override // androidx.appcompat.widget.c0
    public void l(boolean z10) {
    }

    @Override // androidx.appcompat.widget.c0
    public boolean m() {
        return this.f1372a.v();
    }

    @Override // androidx.appcompat.widget.c0
    public void n(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1373b ^ i10;
        this.f1373b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i11 & 3) != 0) {
                H();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1372a.setTitle(this.f1380i);
                    toolbar = this.f1372a;
                    charSequence = this.f1381j;
                } else {
                    charSequence = null;
                    this.f1372a.setTitle((CharSequence) null);
                    toolbar = this.f1372a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f1375d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1372a.addView(view);
            } else {
                this.f1372a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.c0
    public int o() {
        return this.f1373b;
    }

    @Override // androidx.appcompat.widget.c0
    public void p(int i10) {
        y(i10 != 0 ? h.a.d(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.c0
    public int q() {
        return this.f1386o;
    }

    @Override // androidx.appcompat.widget.c0
    public androidx.core.view.z r(int i10, long j10) {
        return androidx.core.view.t.b(this.f1372a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // androidx.appcompat.widget.c0
    public void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.c0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? h.a.d(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.c0
    public void setIcon(Drawable drawable) {
        this.f1376e = drawable;
        H();
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowCallback(Window.Callback callback) {
        this.f1383l = callback;
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1379h) {
            return;
        }
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.c0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.c0
    public void u(boolean z10) {
        this.f1372a.setCollapsible(z10);
    }

    public void w(View view) {
        View view2 = this.f1375d;
        if (view2 != null && (this.f1373b & 16) != 0) {
            this.f1372a.removeView(view2);
        }
        this.f1375d = view;
        if (view == null || (this.f1373b & 16) == 0) {
            return;
        }
        this.f1372a.addView(view);
    }

    public void x(int i10) {
        if (i10 == this.f1387p) {
            return;
        }
        this.f1387p = i10;
        if (TextUtils.isEmpty(this.f1372a.getNavigationContentDescription())) {
            z(this.f1387p);
        }
    }

    public void y(Drawable drawable) {
        this.f1377f = drawable;
        H();
    }

    public void z(int i10) {
        A(i10 == 0 ? null : getContext().getString(i10));
    }
}
