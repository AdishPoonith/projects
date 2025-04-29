package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* loaded from: classes.dex */
class y0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: s  reason: collision with root package name */
    private static y0 f1417s;

    /* renamed from: t  reason: collision with root package name */
    private static y0 f1418t;

    /* renamed from: j  reason: collision with root package name */
    private final View f1419j;

    /* renamed from: k  reason: collision with root package name */
    private final CharSequence f1420k;

    /* renamed from: l  reason: collision with root package name */
    private final int f1421l;

    /* renamed from: m  reason: collision with root package name */
    private final Runnable f1422m = new a();

    /* renamed from: n  reason: collision with root package name */
    private final Runnable f1423n = new b();

    /* renamed from: o  reason: collision with root package name */
    private int f1424o;

    /* renamed from: p  reason: collision with root package name */
    private int f1425p;

    /* renamed from: q  reason: collision with root package name */
    private z0 f1426q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1427r;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y0.this.g(false);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y0.this.c();
        }
    }

    private y0(View view, CharSequence charSequence) {
        this.f1419j = view;
        this.f1420k = charSequence;
        this.f1421l = androidx.core.view.v.a(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1419j.removeCallbacks(this.f1422m);
    }

    private void b() {
        this.f1424o = Integer.MAX_VALUE;
        this.f1425p = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1419j.postDelayed(this.f1422m, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(y0 y0Var) {
        y0 y0Var2 = f1417s;
        if (y0Var2 != null) {
            y0Var2.a();
        }
        f1417s = y0Var;
        if (y0Var != null) {
            y0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        y0 y0Var = f1417s;
        if (y0Var != null && y0Var.f1419j == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new y0(view, charSequence);
            return;
        }
        y0 y0Var2 = f1418t;
        if (y0Var2 != null && y0Var2.f1419j == view) {
            y0Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.f1424o) > this.f1421l || Math.abs(y10 - this.f1425p) > this.f1421l) {
            this.f1424o = x10;
            this.f1425p = y10;
            return true;
        }
        return false;
    }

    void c() {
        if (f1418t == this) {
            f1418t = null;
            z0 z0Var = this.f1426q;
            if (z0Var != null) {
                z0Var.c();
                this.f1426q = null;
                b();
                this.f1419j.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1417s == this) {
            e(null);
        }
        this.f1419j.removeCallbacks(this.f1423n);
    }

    void g(boolean z10) {
        long longPressTimeout;
        if (androidx.core.view.t.t(this.f1419j)) {
            e(null);
            y0 y0Var = f1418t;
            if (y0Var != null) {
                y0Var.c();
            }
            f1418t = this;
            this.f1427r = z10;
            z0 z0Var = new z0(this.f1419j.getContext());
            this.f1426q = z0Var;
            z0Var.e(this.f1419j, this.f1424o, this.f1425p, this.f1427r, this.f1420k);
            this.f1419j.addOnAttachStateChangeListener(this);
            if (this.f1427r) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((androidx.core.view.t.q(this.f1419j) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f1419j.removeCallbacks(this.f1423n);
            this.f1419j.postDelayed(this.f1423n, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1426q == null || !this.f1427r) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1419j.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    b();
                    c();
                }
            } else if (this.f1419j.isEnabled() && this.f1426q == null && h(motionEvent)) {
                e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1424o = view.getWidth() / 2;
        this.f1425p = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
