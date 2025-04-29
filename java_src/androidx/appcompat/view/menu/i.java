package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.t;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f925a;

    /* renamed from: b  reason: collision with root package name */
    private final e f926b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f927c;

    /* renamed from: d  reason: collision with root package name */
    private final int f928d;

    /* renamed from: e  reason: collision with root package name */
    private final int f929e;

    /* renamed from: f  reason: collision with root package name */
    private View f930f;

    /* renamed from: g  reason: collision with root package name */
    private int f931g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f932h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f933i;

    /* renamed from: j  reason: collision with root package name */
    private h f934j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f935k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f936l;

    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f931g = 8388611;
        this.f936l = new a();
        this.f925a = context;
        this.f926b = eVar;
        this.f930f = view;
        this.f927c = z10;
        this.f928d = i10;
        this.f929e = i11;
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f925a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f925a.getResources().getDimensionPixelSize(f.d.abc_cascading_menus_min_smallest_width) ? new b(this.f925a, this.f930f, this.f928d, this.f929e, this.f927c) : new l(this.f925a, this.f926b, this.f930f, this.f928d, this.f929e, this.f927c);
        bVar.l(this.f926b);
        bVar.u(this.f936l);
        bVar.p(this.f930f);
        bVar.k(this.f933i);
        bVar.r(this.f932h);
        bVar.s(this.f931g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h c10 = c();
        c10.v(z11);
        if (z10) {
            if ((androidx.core.view.d.a(this.f931g, t.l(this.f930f)) & 7) == 5) {
                i10 -= this.f930f.getWidth();
            }
            c10.t(i10);
            c10.w(i11);
            int i12 = (int) ((this.f925a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.a();
    }

    public void b() {
        if (d()) {
            this.f934j.dismiss();
        }
    }

    public h c() {
        if (this.f934j == null) {
            this.f934j = a();
        }
        return this.f934j;
    }

    public boolean d() {
        h hVar = this.f934j;
        return hVar != null && hVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f934j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f935k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f930f = view;
    }

    public void g(boolean z10) {
        this.f932h = z10;
        h hVar = this.f934j;
        if (hVar != null) {
            hVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f931g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f935k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f933i = aVar;
        h hVar = this.f934j;
        if (hVar != null) {
            hVar.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f930f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f930f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }
}
