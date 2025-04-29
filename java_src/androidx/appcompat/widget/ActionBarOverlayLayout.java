package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements b0, androidx.core.view.m, androidx.core.view.n {
    static final int[] K = {f.a.actionBarSize, 16842841};
    private final Rect A;
    private final Rect B;
    private final Rect C;
    private d D;
    private OverScroller E;
    ViewPropertyAnimator F;
    final AnimatorListenerAdapter G;
    private final Runnable H;
    private final Runnable I;
    private final androidx.core.view.o J;

    /* renamed from: j  reason: collision with root package name */
    private int f977j;

    /* renamed from: k  reason: collision with root package name */
    private int f978k;

    /* renamed from: l  reason: collision with root package name */
    private ContentFrameLayout f979l;

    /* renamed from: m  reason: collision with root package name */
    ActionBarContainer f980m;

    /* renamed from: n  reason: collision with root package name */
    private c0 f981n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f982o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f983p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f984q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f985r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f986s;

    /* renamed from: t  reason: collision with root package name */
    boolean f987t;

    /* renamed from: u  reason: collision with root package name */
    private int f988u;

    /* renamed from: v  reason: collision with root package name */
    private int f989v;

    /* renamed from: w  reason: collision with root package name */
    private final Rect f990w;

    /* renamed from: x  reason: collision with root package name */
    private final Rect f991x;

    /* renamed from: y  reason: collision with root package name */
    private final Rect f992y;

    /* renamed from: z  reason: collision with root package name */
    private final Rect f993z;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = null;
            actionBarOverlayLayout.f987t = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = null;
            actionBarOverlayLayout.f987t = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = actionBarOverlayLayout.f980m.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = actionBarOverlayLayout.f980m.animate().translationY(-ActionBarOverlayLayout.this.f980m.getHeight()).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(int i10);

        void d();

        void e(boolean z10);

        void f();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f978k = 0;
        this.f990w = new Rect();
        this.f991x = new Rect();
        this.f992y = new Rect();
        this.f993z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        this.C = new Rect();
        this.G = new a();
        this.H = new b();
        this.I = new c();
        v(context);
        this.J = new androidx.core.view.o(this);
    }

    private void A() {
        u();
        this.H.run();
    }

    private boolean B(float f10, float f11) {
        this.E.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.E.getFinalY() > this.f980m.getHeight();
    }

    private void p() {
        u();
        this.I.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private c0 t(View view) {
        if (view instanceof c0) {
            return (c0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(K);
        this.f977j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f982o = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f983p = context.getApplicationInfo().targetSdkVersion < 19;
        this.E = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.I, 600L);
    }

    private void y() {
        u();
        postDelayed(this.H, 600L);
    }

    @Override // androidx.appcompat.widget.b0
    public void a(Menu menu, j.a aVar) {
        z();
        this.f981n.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.b0
    public boolean b() {
        z();
        return this.f981n.b();
    }

    @Override // androidx.appcompat.widget.b0
    public void c() {
        z();
        this.f981n.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.b0
    public boolean d() {
        z();
        return this.f981n.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f982o == null || this.f983p) {
            return;
        }
        int bottom = this.f980m.getVisibility() == 0 ? (int) (this.f980m.getBottom() + this.f980m.getTranslationY() + 0.5f) : 0;
        this.f982o.setBounds(0, bottom, getWidth(), this.f982o.getIntrinsicHeight() + bottom);
        this.f982o.draw(canvas);
    }

    @Override // androidx.appcompat.widget.b0
    public boolean e() {
        z();
        return this.f981n.e();
    }

    @Override // androidx.appcompat.widget.b0
    public boolean f() {
        z();
        return this.f981n.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        z();
        androidx.core.view.t.q(this);
        boolean q10 = q(this.f980m, rect, true, true, false, true);
        this.f993z.set(rect);
        b1.a(this, this.f993z, this.f990w);
        if (!this.A.equals(this.f993z)) {
            this.A.set(this.f993z);
            q10 = true;
        }
        if (!this.f991x.equals(this.f990w)) {
            this.f991x.set(this.f990w);
            q10 = true;
        }
        if (q10) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.b0
    public boolean g() {
        z();
        return this.f981n.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f980m;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.J.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f981n.getTitle();
    }

    @Override // androidx.core.view.m
    public void h(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.m
    public void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.m
    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.b0
    public void k(int i10) {
        z();
        if (i10 == 2) {
            this.f981n.s();
        } else if (i10 == 5) {
            this.f981n.t();
        } else if (i10 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.b0
    public void l() {
        z();
        this.f981n.h();
    }

    @Override // androidx.core.view.n
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.m
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.m
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.t.C(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        z();
        measureChildWithMargins(this.f980m, i10, 0, i11, 0);
        e eVar = (e) this.f980m.getLayoutParams();
        int max = Math.max(0, this.f980m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f980m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f980m.getMeasuredState());
        boolean z10 = (androidx.core.view.t.q(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f977j;
            if (this.f985r && this.f980m.getTabContainer() != null) {
                measuredHeight += this.f977j;
            }
        } else {
            measuredHeight = this.f980m.getVisibility() != 8 ? this.f980m.getMeasuredHeight() : 0;
        }
        this.f992y.set(this.f990w);
        this.B.set(this.f993z);
        Rect rect = (this.f984q || z10) ? this.B : this.f992y;
        rect.top += measuredHeight;
        rect.bottom += 0;
        q(this.f979l, this.f992y, true, true, true, true);
        if (!this.C.equals(this.B)) {
            this.C.set(this.B);
            this.f979l.a(this.B);
        }
        measureChildWithMargins(this.f979l, i10, 0, i11, 0);
        e eVar2 = (e) this.f979l.getLayoutParams();
        int max3 = Math.max(max, this.f979l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f979l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f979l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (this.f986s && z10) {
            if (B(f10, f11)) {
                p();
            } else {
                A();
            }
            this.f987t = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f988u + i11;
        this.f988u = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.J.b(view, view2, i10);
        this.f988u = getActionBarHideOffset();
        u();
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f980m.getVisibility() != 0) {
            return false;
        }
        return this.f986s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f986s && !this.f987t) {
            if (this.f988u <= this.f980m.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.D;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        z();
        int i11 = this.f989v ^ i10;
        this.f989v = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.D;
        if (dVar != null) {
            dVar.e(!z11);
            if (z10 || !z11) {
                this.D.a();
            } else {
                this.D.f();
            }
        }
        if ((i11 & 256) == 0 || this.D == null) {
            return;
        }
        androidx.core.view.t.C(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f978k = i10;
        d dVar = this.D;
        if (dVar != null) {
            dVar.c(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        u();
        this.f980m.setTranslationY(-Math.max(0, Math.min(i10, this.f980m.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.D = dVar;
        if (getWindowToken() != null) {
            this.D.c(this.f978k);
            int i10 = this.f989v;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.t.C(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f985r = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f986s) {
            this.f986s = z10;
            if (z10) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        z();
        this.f981n.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f981n.setIcon(drawable);
    }

    public void setLogo(int i10) {
        z();
        this.f981n.p(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f984q = z10;
        this.f983p = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.b0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f981n.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.b0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f981n.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.H);
        removeCallbacks(this.I);
        ViewPropertyAnimator viewPropertyAnimator = this.F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f984q;
    }

    void z() {
        if (this.f979l == null) {
            this.f979l = (ContentFrameLayout) findViewById(f.f.action_bar_activity_content);
            this.f980m = (ActionBarContainer) findViewById(f.f.action_bar_container);
            this.f981n = t(findViewById(f.f.action_bar));
        }
    }
}
