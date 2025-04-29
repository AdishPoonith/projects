package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class i0 implements l.e {
    private static Method Q;
    private static Method R;
    private static Method S;
    private int A;
    private DataSetObserver B;
    private View C;
    private Drawable D;
    private AdapterView.OnItemClickListener E;
    private AdapterView.OnItemSelectedListener F;
    final g G;
    private final f H;
    private final e I;
    private final c J;
    private Runnable K;
    final Handler L;
    private final Rect M;
    private Rect N;
    private boolean O;
    PopupWindow P;

    /* renamed from: j  reason: collision with root package name */
    private Context f1210j;

    /* renamed from: k  reason: collision with root package name */
    private ListAdapter f1211k;

    /* renamed from: l  reason: collision with root package name */
    e0 f1212l;

    /* renamed from: m  reason: collision with root package name */
    private int f1213m;

    /* renamed from: n  reason: collision with root package name */
    private int f1214n;

    /* renamed from: o  reason: collision with root package name */
    private int f1215o;

    /* renamed from: p  reason: collision with root package name */
    private int f1216p;

    /* renamed from: q  reason: collision with root package name */
    private int f1217q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1218r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1219s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1220t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1221u;

    /* renamed from: v  reason: collision with root package name */
    private int f1222v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1223w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1224x;

    /* renamed from: y  reason: collision with root package name */
    int f1225y;

    /* renamed from: z  reason: collision with root package name */
    private View f1226z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t10 = i0.this.t();
            if (t10 == null || t10.getWindowToken() == null) {
                return;
            }
            i0.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            e0 e0Var;
            if (i10 == -1 || (e0Var = i0.this.f1212l) == null) {
                return;
            }
            e0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i0.this.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (i0.this.c()) {
                i0.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            i0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || i0.this.w() || i0.this.P.getContentView() == null) {
                return;
            }
            i0 i0Var = i0.this;
            i0Var.L.removeCallbacks(i0Var.G);
            i0.this.G.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = i0.this.P) != null && popupWindow.isShowing() && x10 >= 0 && x10 < i0.this.P.getWidth() && y10 >= 0 && y10 < i0.this.P.getHeight()) {
                i0 i0Var = i0.this;
                i0Var.L.postDelayed(i0Var.G, 250L);
                return false;
            } else if (action == 1) {
                i0 i0Var2 = i0.this;
                i0Var2.L.removeCallbacks(i0Var2.G);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0 e0Var = i0.this.f1212l;
            if (e0Var == null || !androidx.core.view.t.t(e0Var) || i0.this.f1212l.getCount() <= i0.this.f1212l.getChildCount()) {
                return;
            }
            int childCount = i0.this.f1212l.getChildCount();
            i0 i0Var = i0.this;
            if (childCount <= i0Var.f1225y) {
                i0Var.P.setInputMethodMode(2);
                i0.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                Q = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                S = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                R = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public i0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1213m = -2;
        this.f1214n = -2;
        this.f1217q = 1002;
        this.f1219s = true;
        this.f1222v = 0;
        this.f1223w = false;
        this.f1224x = false;
        this.f1225y = Integer.MAX_VALUE;
        this.A = 0;
        this.G = new g();
        this.H = new f();
        this.I = new e();
        this.J = new c();
        this.M = new Rect();
        this.f1210j = context;
        this.L = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f8303o1, i10, i11);
        this.f1215o = obtainStyledAttributes.getDimensionPixelOffset(f.j.f8308p1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(f.j.f8313q1, 0);
        this.f1216p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1218r = true;
        }
        obtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i10, i11);
        this.P = pVar;
        pVar.setInputMethodMode(1);
    }

    private void J(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            this.P.setIsClippedToScreen(z10);
            return;
        }
        Method method = Q;
        if (method != null) {
            try {
                method.invoke(this.P, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int q() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.q():int");
    }

    private int u(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = R;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.P, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.P.getMaxAvailableHeight(view, i10);
        }
        return this.P.getMaxAvailableHeight(view, i10, z10);
    }

    private void y() {
        View view = this.f1226z;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1226z);
            }
        }
    }

    public void A(int i10) {
        this.P.setAnimationStyle(i10);
    }

    public void B(int i10) {
        Drawable background = this.P.getBackground();
        if (background == null) {
            M(i10);
            return;
        }
        background.getPadding(this.M);
        Rect rect = this.M;
        this.f1214n = rect.left + rect.right + i10;
    }

    public void C(int i10) {
        this.f1222v = i10;
    }

    public void D(Rect rect) {
        this.N = rect != null ? new Rect(rect) : null;
    }

    public void E(int i10) {
        this.P.setInputMethodMode(i10);
    }

    public void F(boolean z10) {
        this.O = z10;
        this.P.setFocusable(z10);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.P.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.E = onItemClickListener;
    }

    public void I(boolean z10) {
        this.f1221u = true;
        this.f1220t = z10;
    }

    public void K(int i10) {
        this.A = i10;
    }

    public void L(int i10) {
        e0 e0Var = this.f1212l;
        if (!c() || e0Var == null) {
            return;
        }
        e0Var.setListSelectionHidden(false);
        e0Var.setSelection(i10);
        if (e0Var.getChoiceMode() != 0) {
            e0Var.setItemChecked(i10, true);
        }
    }

    public void M(int i10) {
        this.f1214n = i10;
    }

    @Override // l.e
    public void a() {
        int q10 = q();
        boolean w10 = w();
        androidx.core.widget.h.b(this.P, this.f1217q);
        boolean z10 = true;
        if (this.P.isShowing()) {
            if (androidx.core.view.t.t(t())) {
                int i10 = this.f1214n;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = t().getWidth();
                }
                int i11 = this.f1213m;
                if (i11 == -1) {
                    if (!w10) {
                        q10 = -1;
                    }
                    if (w10) {
                        this.P.setWidth(this.f1214n == -1 ? -1 : 0);
                        this.P.setHeight(0);
                    } else {
                        this.P.setWidth(this.f1214n == -1 ? -1 : 0);
                        this.P.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    q10 = i11;
                }
                this.P.setOutsideTouchable((this.f1224x || this.f1223w) ? false : false);
                this.P.update(t(), this.f1215o, this.f1216p, i10 < 0 ? -1 : i10, q10 < 0 ? -1 : q10);
                return;
            }
            return;
        }
        int i12 = this.f1214n;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = t().getWidth();
        }
        int i13 = this.f1213m;
        if (i13 == -1) {
            q10 = -1;
        } else if (i13 != -2) {
            q10 = i13;
        }
        this.P.setWidth(i12);
        this.P.setHeight(q10);
        J(true);
        this.P.setOutsideTouchable((this.f1224x || this.f1223w) ? false : true);
        this.P.setTouchInterceptor(this.H);
        if (this.f1221u) {
            androidx.core.widget.h.a(this.P, this.f1220t);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = S;
            if (method != null) {
                try {
                    method.invoke(this.P, this.N);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            this.P.setEpicenterBounds(this.N);
        }
        androidx.core.widget.h.c(this.P, t(), this.f1215o, this.f1216p, this.f1222v);
        this.f1212l.setSelection(-1);
        if (!this.O || this.f1212l.isInTouchMode()) {
            r();
        }
        if (this.O) {
            return;
        }
        this.L.post(this.J);
    }

    @Override // l.e
    public boolean c() {
        return this.P.isShowing();
    }

    public int d() {
        return this.f1215o;
    }

    @Override // l.e
    public void dismiss() {
        this.P.dismiss();
        y();
        this.P.setContentView(null);
        this.f1212l = null;
        this.L.removeCallbacks(this.G);
    }

    public Drawable f() {
        return this.P.getBackground();
    }

    @Override // l.e
    public ListView g() {
        return this.f1212l;
    }

    public void i(Drawable drawable) {
        this.P.setBackgroundDrawable(drawable);
    }

    public void j(int i10) {
        this.f1216p = i10;
        this.f1218r = true;
    }

    public void l(int i10) {
        this.f1215o = i10;
    }

    public int n() {
        if (this.f1218r) {
            return this.f1216p;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.B;
        if (dataSetObserver == null) {
            this.B = new d();
        } else {
            ListAdapter listAdapter2 = this.f1211k;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1211k = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.B);
        }
        e0 e0Var = this.f1212l;
        if (e0Var != null) {
            e0Var.setAdapter(this.f1211k);
        }
    }

    public void r() {
        e0 e0Var = this.f1212l;
        if (e0Var != null) {
            e0Var.setListSelectionHidden(true);
            e0Var.requestLayout();
        }
    }

    e0 s(Context context, boolean z10) {
        return new e0(context, z10);
    }

    public View t() {
        return this.C;
    }

    public int v() {
        return this.f1214n;
    }

    public boolean w() {
        return this.P.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.O;
    }

    public void z(View view) {
        this.C = view;
    }
}
