package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.k0;
import androidx.core.view.t;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int K = f.g.abc_cascading_menu_item_layout;
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private boolean F;
    private j.a G;
    ViewTreeObserver H;
    private PopupWindow.OnDismissListener I;
    boolean J;

    /* renamed from: k  reason: collision with root package name */
    private final Context f824k;

    /* renamed from: l  reason: collision with root package name */
    private final int f825l;

    /* renamed from: m  reason: collision with root package name */
    private final int f826m;

    /* renamed from: n  reason: collision with root package name */
    private final int f827n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f828o;

    /* renamed from: p  reason: collision with root package name */
    final Handler f829p;

    /* renamed from: x  reason: collision with root package name */
    private View f837x;

    /* renamed from: y  reason: collision with root package name */
    View f838y;

    /* renamed from: q  reason: collision with root package name */
    private final List<e> f830q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    final List<d> f831r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f832s = new a();

    /* renamed from: t  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f833t = new View$OnAttachStateChangeListenerC0013b();

    /* renamed from: u  reason: collision with root package name */
    private final j0 f834u = new c();

    /* renamed from: v  reason: collision with root package name */
    private int f835v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f836w = 0;
    private boolean E = false;

    /* renamed from: z  reason: collision with root package name */
    private int f839z = D();

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.c() || b.this.f831r.size() <= 0 || b.this.f831r.get(0).f847a.x()) {
                return;
            }
            View view = b.this.f838y;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            for (d dVar : b.this.f831r) {
                dVar.f847a.a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0013b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0013b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.H;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.H = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.H.removeGlobalOnLayoutListener(bVar.f832s);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements j0 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ d f843j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ MenuItem f844k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ e f845l;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f843j = dVar;
                this.f844k = menuItem;
                this.f845l = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f843j;
                if (dVar != null) {
                    b.this.J = true;
                    dVar.f848b.e(false);
                    b.this.J = false;
                }
                if (this.f844k.isEnabled() && this.f844k.hasSubMenu()) {
                    this.f845l.L(this.f844k, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.j0
        public void b(e eVar, MenuItem menuItem) {
            b.this.f829p.removeCallbacksAndMessages(null);
            int size = b.this.f831r.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f831r.get(i10).f848b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f829p.postAtTime(new a(i11 < b.this.f831r.size() ? b.this.f831r.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.j0
        public void e(e eVar, MenuItem menuItem) {
            b.this.f829p.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final k0 f847a;

        /* renamed from: b  reason: collision with root package name */
        public final e f848b;

        /* renamed from: c  reason: collision with root package name */
        public final int f849c;

        public d(k0 k0Var, e eVar, int i10) {
            this.f847a = k0Var;
            this.f848b = eVar;
            this.f849c = i10;
        }

        public ListView a() {
            return this.f847a.g();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f824k = context;
        this.f837x = view;
        this.f826m = i10;
        this.f827n = i11;
        this.f828o = z10;
        Resources resources = context.getResources();
        this.f825l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.abc_config_prefDialogWidth));
        this.f829p = new Handler();
    }

    private int A(e eVar) {
        int size = this.f831r.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f831r.get(i10).f848b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i10;
        int firstVisiblePosition;
        MenuItem B = B(dVar.f848b, eVar);
        if (B == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (B == dVar2.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return t.l(this.f837x) == 1 ? 0 : 1;
    }

    private int E(int i10) {
        List<d> list = this.f831r;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f838y.getWindowVisibleDisplayFrame(rect);
        return this.f839z == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f824k);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f828o, K);
        if (!c() && this.E) {
            dVar2.d(true);
        } else if (c()) {
            dVar2.d(h.x(eVar));
        }
        int o10 = h.o(dVar2, null, this.f824k, this.f825l);
        k0 z10 = z();
        z10.p(dVar2);
        z10.B(o10);
        z10.C(this.f836w);
        if (this.f831r.size() > 0) {
            List<d> list = this.f831r;
            dVar = list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z10.Q(false);
            z10.N(null);
            int E = E(o10);
            boolean z11 = E == 1;
            this.f839z = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z10.z(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f837x.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f836w & 7) == 5) {
                    iArr[0] = iArr[0] + this.f837x.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f836w & 5) == 5) {
                if (!z11) {
                    o10 = view.getWidth();
                    i12 = i10 - o10;
                }
                i12 = i10 + o10;
            } else {
                if (z11) {
                    o10 = view.getWidth();
                    i12 = i10 + o10;
                }
                i12 = i10 - o10;
            }
            z10.l(i12);
            z10.I(true);
            z10.j(i11);
        } else {
            if (this.A) {
                z10.l(this.C);
            }
            if (this.B) {
                z10.j(this.D);
            }
            z10.D(n());
        }
        this.f831r.add(new d(z10, eVar, this.f839z));
        z10.a();
        ListView g10 = z10.g();
        g10.setOnKeyListener(this);
        if (dVar == null && this.F && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(f.g.abc_popup_menu_header_item_layout, (ViewGroup) g10, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            g10.addHeaderView(frameLayout, null, false);
            z10.a();
        }
    }

    private k0 z() {
        k0 k0Var = new k0(this.f824k, null, this.f826m, this.f827n);
        k0Var.P(this.f834u);
        k0Var.H(this);
        k0Var.G(this);
        k0Var.z(this.f837x);
        k0Var.C(this.f836w);
        k0Var.F(true);
        k0Var.E(2);
        return k0Var;
    }

    @Override // l.e
    public void a() {
        if (c()) {
            return;
        }
        for (e eVar : this.f830q) {
            F(eVar);
        }
        this.f830q.clear();
        View view = this.f837x;
        this.f838y = view;
        if (view != null) {
            boolean z10 = this.H == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.H = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f832s);
            }
            this.f838y.addOnAttachStateChangeListener(this.f833t);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        int A = A(eVar);
        if (A < 0) {
            return;
        }
        int i10 = A + 1;
        if (i10 < this.f831r.size()) {
            this.f831r.get(i10).f848b.e(false);
        }
        d remove = this.f831r.remove(A);
        remove.f848b.O(this);
        if (this.J) {
            remove.f847a.O(null);
            remove.f847a.A(0);
        }
        remove.f847a.dismiss();
        int size = this.f831r.size();
        this.f839z = size > 0 ? this.f831r.get(size - 1).f849c : D();
        if (size != 0) {
            if (z10) {
                this.f831r.get(0).f848b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.G;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.H;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.H.removeGlobalOnLayoutListener(this.f832s);
            }
            this.H = null;
        }
        this.f838y.removeOnAttachStateChangeListener(this.f833t);
        this.I.onDismiss();
    }

    @Override // l.e
    public boolean c() {
        return this.f831r.size() > 0 && this.f831r.get(0).f847a.c();
    }

    @Override // l.e
    public void dismiss() {
        int size = this.f831r.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f831r.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f847a.c()) {
                    dVar.f847a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        for (d dVar : this.f831r) {
            if (mVar == dVar.f848b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            l(mVar);
            j.a aVar = this.G;
            if (aVar != null) {
                aVar.c(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        for (d dVar : this.f831r) {
            h.y(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // l.e
    public ListView g() {
        if (this.f831r.isEmpty()) {
            return null;
        }
        List<d> list = this.f831r;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.G = aVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f824k);
        if (c()) {
            F(eVar);
        } else {
            this.f830q.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f831r.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f831r.get(i10);
            if (!dVar.f847a.c()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f848b.e(false);
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
        if (this.f837x != view) {
            this.f837x = view;
            this.f836w = androidx.core.view.d.a(this.f835v, t.l(view));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.E = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        if (this.f835v != i10) {
            this.f835v = i10;
            this.f836w = androidx.core.view.d.a(i10, t.l(this.f837x));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.A = true;
        this.C = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.I = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.F = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.B = true;
        this.D = i10;
    }
}
