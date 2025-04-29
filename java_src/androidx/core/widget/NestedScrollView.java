package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.b;
import androidx.core.view.k;
import androidx.core.view.l;
import androidx.core.view.n;
import androidx.core.view.o;
import androidx.core.view.t;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements n {
    private static final float K = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a L = new a();
    private static final int[] M = {16843130};
    private int A;
    private final int[] B;
    private final int[] C;
    private int D;
    private int E;
    private d F;
    private final o G;
    private final l H;
    private float I;
    private c J;

    /* renamed from: j  reason: collision with root package name */
    private final float f1956j;

    /* renamed from: k  reason: collision with root package name */
    private long f1957k;

    /* renamed from: l  reason: collision with root package name */
    private final Rect f1958l;

    /* renamed from: m  reason: collision with root package name */
    private OverScroller f1959m;

    /* renamed from: n  reason: collision with root package name */
    public EdgeEffect f1960n;

    /* renamed from: o  reason: collision with root package name */
    public EdgeEffect f1961o;

    /* renamed from: p  reason: collision with root package name */
    private int f1962p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1963q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1964r;

    /* renamed from: s  reason: collision with root package name */
    private View f1965s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1966t;

    /* renamed from: u  reason: collision with root package name */
    private VelocityTracker f1967u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1968v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1969w;

    /* renamed from: x  reason: collision with root package name */
    private int f1970x;

    /* renamed from: y  reason: collision with root package name */
    private int f1971y;

    /* renamed from: z  reason: collision with root package name */
    private int f1972z;

    /* loaded from: classes.dex */
    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            androidx.core.view.accessibility.d.a(accessibilityEvent, nestedScrollView.getScrollX());
            androidx.core.view.accessibility.d.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.b bVar) {
            int scrollRange;
            super.g(view, bVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.I(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            bVar.M(true);
            if (nestedScrollView.getScrollY() > 0) {
                bVar.a(b.a.f1849r);
                bVar.a(b.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                bVar.a(b.a.f1848q);
                bVar.a(b.a.E);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i10 != 4096) {
                    if (i10 == 8192 || i10 == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.V(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i10 != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.V(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public int f1973j;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        d(Parcel parcel) {
            super(parcel);
            this.f1973j = parcel.readInt();
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1973j + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1973j);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, t.a.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1958l = new Rect();
        this.f1963q = true;
        this.f1964r = false;
        this.f1965s = null;
        this.f1966t = false;
        this.f1969w = true;
        this.A = -1;
        this.B = new int[2];
        this.C = new int[2];
        this.f1960n = androidx.core.widget.d.a(context, attributeSet);
        this.f1961o = androidx.core.widget.d.a(context, attributeSet);
        this.f1956j = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.G = new o(this);
        this.H = new l(this);
        setNestedScrollingEnabled(true);
        t.E(this, L);
    }

    private void A() {
        this.f1959m = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1970x = viewConfiguration.getScaledTouchSlop();
        this.f1971y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1972z = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.f1967u == null) {
            this.f1967u = VelocityTracker.obtain();
        }
    }

    private void C(int i10, int i11) {
        this.f1962p = i10;
        this.A = i11;
        W(2, 0);
    }

    private boolean D(View view) {
        return !F(view, 0, getHeight());
    }

    private static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && E((View) parent, view2);
    }

    private boolean F(View view, int i10, int i11) {
        view.getDrawingRect(this.f1958l);
        offsetDescendantRectToMyCoords(view, this.f1958l);
        return this.f1958l.bottom + i10 >= getScrollY() && this.f1958l.top - i10 <= getScrollY() + i11;
    }

    private void G(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.H.d(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1962p = (int) motionEvent.getY(i10);
            this.A = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f1967u;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void K() {
        VelocityTracker velocityTracker = this.f1967u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1967u = null;
        }
    }

    private int L(int i10, float f10) {
        float d10;
        EdgeEffect edgeEffect;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (androidx.core.widget.d.b(this.f1960n) != 0.0f) {
            d10 = -androidx.core.widget.d.d(this.f1960n, -height, width);
            if (androidx.core.widget.d.b(this.f1960n) == 0.0f) {
                edgeEffect = this.f1960n;
                edgeEffect.onRelease();
            }
            f11 = d10;
        } else if (androidx.core.widget.d.b(this.f1961o) != 0.0f) {
            d10 = androidx.core.widget.d.d(this.f1961o, height, 1.0f - width);
            if (androidx.core.widget.d.b(this.f1961o) == 0.0f) {
                edgeEffect = this.f1961o;
                edgeEffect.onRelease();
            }
            f11 = d10;
        }
        int round = Math.round(f11 * getHeight());
        if (round != 0) {
            invalidate();
        }
        return round;
    }

    private void M(boolean z10) {
        if (z10) {
            W(2, 1);
        } else {
            Y(1);
        }
        this.E = getScrollY();
        t.z(this);
    }

    private boolean N(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View t10 = t(z11, i11, i12);
        if (t10 == null) {
            t10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            O(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (t10 != findFocus()) {
            t10.requestFocus(i10);
        }
        return z10;
    }

    private int O(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        EdgeEffect edgeEffect;
        if (i12 == 1) {
            W(2, i12);
        }
        boolean z11 = false;
        if (k(0, i10, this.C, this.B, i12)) {
            i13 = i10 - this.C[1];
            i14 = this.B[1] + 0;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = c() && !z10;
        boolean z13 = I(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !x(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.C;
        iArr[1] = 0;
        l(0, scrollY2, 0, i13 - scrollY2, this.B, i12, iArr);
        int i15 = i14 + this.B[1];
        int i16 = i13 - this.C[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z12) {
                androidx.core.widget.d.d(this.f1960n, (-i16) / getHeight(), i11 / getWidth());
                if (!this.f1961o.isFinished()) {
                    edgeEffect = this.f1961o;
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            androidx.core.widget.d.d(this.f1961o, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f1960n.isFinished()) {
                edgeEffect = this.f1960n;
                edgeEffect.onRelease();
            }
        }
        if (this.f1960n.isFinished() && this.f1961o.isFinished()) {
            z11 = z13;
        } else {
            t.z(this);
        }
        if (z11 && i12 == 0) {
            this.f1967u.clear();
        }
        if (i12 == 1) {
            Y(i12);
            this.f1960n.onRelease();
            this.f1961o.onRelease();
        }
        return i15;
    }

    private void P(View view) {
        view.getDrawingRect(this.f1958l);
        offsetDescendantRectToMyCoords(view, this.f1958l);
        int f10 = f(this.f1958l);
        if (f10 != 0) {
            scrollBy(0, f10);
        }
    }

    private boolean Q(Rect rect, boolean z10) {
        int f10 = f(rect);
        boolean z11 = f10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, f10);
            } else {
                S(0, f10);
            }
        }
        return z11;
    }

    private boolean R(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return w(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void T(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1957k > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f1959m;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
            M(z10);
        } else {
            if (!this.f1959m.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f1957k = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean X(MotionEvent motionEvent) {
        boolean z10;
        if (androidx.core.widget.d.b(this.f1960n) != 0.0f) {
            androidx.core.widget.d.d(this.f1960n, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (androidx.core.widget.d.b(this.f1961o) != 0.0f) {
            androidx.core.widget.d.d(this.f1961o, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    private void a() {
        this.f1959m.abortAnimation();
        Y(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    private static int e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.I == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.I = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.I;
    }

    private void p(int i10) {
        if (i10 != 0) {
            if (this.f1969w) {
                S(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean q(int i10) {
        EdgeEffect edgeEffect;
        if (androidx.core.widget.d.b(this.f1960n) != 0.0f) {
            if (R(this.f1960n, i10)) {
                edgeEffect = this.f1960n;
                edgeEffect.onAbsorb(i10);
            } else {
                i10 = -i10;
                u(i10);
            }
        } else if (androidx.core.widget.d.b(this.f1961o) == 0.0f) {
            return false;
        } else {
            i10 = -i10;
            if (R(this.f1961o, i10)) {
                edgeEffect = this.f1961o;
                edgeEffect.onAbsorb(i10);
            }
            u(i10);
        }
        return true;
    }

    private void r() {
        this.A = -1;
        this.f1966t = false;
        K();
        Y(0);
        this.f1960n.onRelease();
        this.f1961o.onRelease();
    }

    private View t(boolean z10, int i10, int i11) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = (View) focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float w(int i10) {
        double log = Math.log((Math.abs(i10) * 0.35f) / (this.f1956j * 0.015f));
        float f10 = K;
        return (float) (this.f1956j * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    private boolean y(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
        }
        return false;
    }

    private void z() {
        VelocityTracker velocityTracker = this.f1967u;
        if (velocityTracker == null) {
            this.f1967u = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean I(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.x(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f1959m
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.I(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean J(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f1958l.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1958l;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1958l.top = getScrollY() - height;
            Rect rect2 = this.f1958l;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1958l;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return N(i10, i11, i12);
    }

    public final void S(int i10, int i11) {
        T(i10, i11, 250, false);
    }

    void U(int i10, int i11, int i12, boolean z10) {
        T(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void V(int i10, int i11, boolean z10) {
        U(i10, i11, 250, z10);
    }

    public boolean W(int i10, int i11) {
        return this.H.m(i10, i11);
    }

    public void Y(int i10) {
        this.H.n(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !F(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            O(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f1958l);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1958l);
            O(f(this.f1958l), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && D(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f1959m.isFinished()) {
            return;
        }
        this.f1959m.computeScrollOffset();
        int currY = this.f1959m.getCurrY();
        int g10 = g(currY - this.E);
        this.E = currY;
        int[] iArr = this.C;
        boolean z10 = false;
        iArr[1] = 0;
        k(0, g10, iArr, null, 1);
        int i10 = g10 - this.C[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            I(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.C;
            iArr2[1] = 0;
            l(0, scrollY2, 0, i11, this.B, 1, iArr2);
            i10 = i11 - this.C[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (this.f1960n.isFinished()) {
                        edgeEffect = this.f1960n;
                        edgeEffect.onAbsorb((int) this.f1959m.getCurrVelocity());
                    }
                } else if (this.f1961o.isFinished()) {
                    edgeEffect = this.f1961o;
                    edgeEffect.onAbsorb((int) this.f1959m.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f1959m.isFinished()) {
            Y(1);
        } else {
            t.z(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.H.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.H.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return k(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.H.e(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f1960n.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            this.f1960n.setSize(width, height);
            if (this.f1960n.draw(canvas)) {
                t.z(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f1961o.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i11 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i11 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f1961o.setSize(width2, height2);
        if (this.f1961o.draw(canvas)) {
            t.z(this);
        }
        canvas.restoreToCount(save2);
    }

    protected int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    int g(int i10) {
        int height = getHeight();
        if (i10 > 0 && androidx.core.widget.d.b(this.f1960n) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f1960n, ((-i10) * 4.0f) / height, 0.5f));
            if (round != i10) {
                this.f1960n.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || androidx.core.widget.d.b(this.f1961o) == 0.0f) {
            return i10;
        } else {
            float f10 = height;
            int round2 = Math.round((f10 / 4.0f) * androidx.core.widget.d.d(this.f1961o, (i10 * 4.0f) / f10, 0.5f));
            if (round2 != i10) {
                this.f1961o.finish();
            }
            return i10 - round2;
        }
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.G.a();
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // androidx.core.view.m
    public void h(View view, View view2, int i10, int i11) {
        this.G.c(view, view2, i10, i11);
        W(2, i11);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    @Override // androidx.core.view.m
    public void i(View view, int i10) {
        this.G.d(view, i10);
        Y(i10);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.H.j();
    }

    @Override // androidx.core.view.m
    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        k(i10, i11, iArr, null, i12);
    }

    public boolean k(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.H.c(i10, i11, iArr, iArr2, i12);
    }

    public void l(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.H.d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // androidx.core.view.n
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        G(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.m
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        G(i13, i14, null);
    }

    @Override // androidx.core.view.m
    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1964r = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i10;
        if (motionEvent.getAction() != 8 || this.f1966t) {
            return false;
        }
        if (k.a(motionEvent, 2)) {
            f10 = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
        } else if (k.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f10 = axisValue;
        } else {
            f10 = 0.0f;
            i10 = 0;
        }
        if (f10 != 0.0f) {
            O(-((int) (f10 * getVerticalScrollFactorCompat())), i10, 1, k.a(motionEvent, 8194));
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f1966t) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.A;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f1962p) > this.f1970x && (2 & getNestedScrollAxes()) == 0) {
                                this.f1966t = true;
                                this.f1962p = y10;
                                B();
                                this.f1967u.addMovement(motionEvent);
                                this.D = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        H(motionEvent);
                    }
                }
            }
            this.f1966t = false;
            this.A = -1;
            K();
            if (this.f1959m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                t.z(this);
            }
            Y(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (y((int) motionEvent.getX(), y11)) {
                this.f1962p = y11;
                this.A = motionEvent.getPointerId(0);
                z();
                this.f1967u.addMovement(motionEvent);
                this.f1959m.computeScrollOffset();
                if (!X(motionEvent) && this.f1959m.isFinished()) {
                    z10 = false;
                }
                this.f1966t = z10;
                W(2, 0);
            } else {
                if (!X(motionEvent) && this.f1959m.isFinished()) {
                    z10 = false;
                }
                this.f1966t = z10;
                K();
            }
        }
        return this.f1966t;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f1963q = false;
        View view = this.f1965s;
        if (view != null && E(view, this)) {
            P(this.f1965s);
        }
        this.f1965s = null;
        if (!this.f1964r) {
            if (this.F != null) {
                scrollTo(getScrollX(), this.F.f1973j);
                this.F = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e10 = e(scrollY, paddingTop, i14);
            if (e10 != scrollY) {
                scrollTo(getScrollX(), e10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1964r = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1968v && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        u((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        G(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        h(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i10) : focusFinder.findNextFocusFromRect(this, rect, i10);
        if (findNextFocus == null || D(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.F = dVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1973j = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.J;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !F(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f1958l);
        offsetDescendantRectToMyCoords(findFocus, this.f1958l);
        p(f(this.f1958l));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r12.f1959m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        androidx.core.view.t.z(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012a, code lost:
        if (r12.f1959m.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1963q) {
            this.f1965s = view2;
        } else {
            P(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return Q(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            K();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1963q = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f1958l.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? b(33) : v(33);
            } else if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? b(130) : v(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                J(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e10 = e(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e11 = e(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e10 == getScrollX() && e11 == getScrollY()) {
                return;
            }
            super.scrollTo(e10, e11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f1968v) {
            this.f1968v = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.H.k(z10);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.J = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f1969w = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return W(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Y(0);
    }

    public void u(int i10) {
        if (getChildCount() > 0) {
            this.f1959m.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            M(true);
        }
    }

    public boolean v(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1958l;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1958l.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1958l;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1958l;
        return N(i10, rect3.top, rect3.bottom);
    }

    public boolean x(int i10) {
        return this.H.i(i10);
    }
}
