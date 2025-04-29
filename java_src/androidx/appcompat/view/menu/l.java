package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.k0;
import androidx.core.view.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {
    private static final int E = f.g.abc_popup_menu_item_layout;
    private boolean A;
    private int B;
    private boolean D;

    /* renamed from: k  reason: collision with root package name */
    private final Context f938k;

    /* renamed from: l  reason: collision with root package name */
    private final e f939l;

    /* renamed from: m  reason: collision with root package name */
    private final d f940m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f941n;

    /* renamed from: o  reason: collision with root package name */
    private final int f942o;

    /* renamed from: p  reason: collision with root package name */
    private final int f943p;

    /* renamed from: q  reason: collision with root package name */
    private final int f944q;

    /* renamed from: r  reason: collision with root package name */
    final k0 f945r;

    /* renamed from: u  reason: collision with root package name */
    private PopupWindow.OnDismissListener f948u;

    /* renamed from: v  reason: collision with root package name */
    private View f949v;

    /* renamed from: w  reason: collision with root package name */
    View f950w;

    /* renamed from: x  reason: collision with root package name */
    private j.a f951x;

    /* renamed from: y  reason: collision with root package name */
    ViewTreeObserver f952y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f953z;

    /* renamed from: s  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f946s = new a();

    /* renamed from: t  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f947t = new b();
    private int C = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.c() || l.this.f945r.x()) {
                return;
            }
            View view = l.this.f950w;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f945r.a();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f952y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f952y = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f952y.removeGlobalOnLayoutListener(lVar.f946s);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f938k = context;
        this.f939l = eVar;
        this.f941n = z10;
        this.f940m = new d(eVar, LayoutInflater.from(context), z10, E);
        this.f943p = i10;
        this.f944q = i11;
        Resources resources = context.getResources();
        this.f942o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.abc_config_prefDialogWidth));
        this.f949v = view;
        this.f945r = new k0(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (c()) {
            return true;
        }
        if (this.f953z || (view = this.f949v) == null) {
            return false;
        }
        this.f950w = view;
        this.f945r.G(this);
        this.f945r.H(this);
        this.f945r.F(true);
        View view2 = this.f950w;
        boolean z10 = this.f952y == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f952y = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f946s);
        }
        view2.addOnAttachStateChangeListener(this.f947t);
        this.f945r.z(view2);
        this.f945r.C(this.C);
        if (!this.A) {
            this.B = h.o(this.f940m, null, this.f938k, this.f942o);
            this.A = true;
        }
        this.f945r.B(this.B);
        this.f945r.E(2);
        this.f945r.D(n());
        this.f945r.a();
        ListView g10 = this.f945r.g();
        g10.setOnKeyListener(this);
        if (this.D && this.f939l.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f938k).inflate(f.g.abc_popup_menu_header_item_layout, (ViewGroup) g10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f939l.x());
            }
            frameLayout.setEnabled(false);
            g10.addHeaderView(frameLayout, null, false);
        }
        this.f945r.p(this.f940m);
        this.f945r.a();
        return true;
    }

    @Override // l.e
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        if (eVar != this.f939l) {
            return;
        }
        dismiss();
        j.a aVar = this.f951x;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // l.e
    public boolean c() {
        return !this.f953z && this.f945r.c();
    }

    @Override // l.e
    public void dismiss() {
        if (c()) {
            this.f945r.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f938k, mVar, this.f950w, this.f941n, this.f943p, this.f944q);
            iVar.j(this.f951x);
            iVar.g(h.x(mVar));
            iVar.i(this.f948u);
            this.f948u = null;
            this.f939l.e(false);
            int d10 = this.f945r.d();
            int n10 = this.f945r.n();
            if ((Gravity.getAbsoluteGravity(this.C, t.l(this.f949v)) & 7) == 5) {
                d10 += this.f949v.getWidth();
            }
            if (iVar.n(d10, n10)) {
                j.a aVar = this.f951x;
                if (aVar != null) {
                    aVar.c(mVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        this.A = false;
        d dVar = this.f940m;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // l.e
    public ListView g() {
        return this.f945r.g();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.f951x = aVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f953z = true;
        this.f939l.close();
        ViewTreeObserver viewTreeObserver = this.f952y;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f952y = this.f950w.getViewTreeObserver();
            }
            this.f952y.removeGlobalOnLayoutListener(this.f946s);
            this.f952y = null;
        }
        this.f950w.removeOnAttachStateChangeListener(this.f947t);
        PopupWindow.OnDismissListener onDismissListener = this.f948u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.f949v = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f940m.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.C = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f945r.l(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f948u = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.D = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f945r.j(i10);
    }
}
