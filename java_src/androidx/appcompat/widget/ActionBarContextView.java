package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    private boolean A;
    private int B;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f966r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f967s;

    /* renamed from: t  reason: collision with root package name */
    private View f968t;

    /* renamed from: u  reason: collision with root package name */
    private View f969u;

    /* renamed from: v  reason: collision with root package name */
    private LinearLayout f970v;

    /* renamed from: w  reason: collision with root package name */
    private TextView f971w;

    /* renamed from: x  reason: collision with root package name */
    private TextView f972x;

    /* renamed from: y  reason: collision with root package name */
    private int f973y;

    /* renamed from: z  reason: collision with root package name */
    private int f974z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ k.b f975j;

        a(k.b bVar) {
            this.f975j = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f975j.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        v0 t10 = v0.t(context, attributeSet, f.j.f8351y, i10, 0);
        androidx.core.view.t.F(this, t10.f(f.j.f8356z));
        this.f973y = t10.m(f.j.D, 0);
        this.f974z = t10.m(f.j.C, 0);
        this.f1111n = t10.l(f.j.B, 0);
        this.B = t10.m(f.j.A, f.g.abc_action_mode_close_item_material);
        t10.u();
    }

    private void i() {
        if (this.f970v == null) {
            LayoutInflater.from(getContext()).inflate(f.g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f970v = linearLayout;
            this.f971w = (TextView) linearLayout.findViewById(f.f.action_bar_title);
            this.f972x = (TextView) this.f970v.findViewById(f.f.action_bar_subtitle);
            if (this.f973y != 0) {
                this.f971w.setTextAppearance(getContext(), this.f973y);
            }
            if (this.f974z != 0) {
                this.f972x.setTextAppearance(getContext(), this.f974z);
            }
        }
        this.f971w.setText(this.f966r);
        this.f972x.setText(this.f967s);
        boolean z10 = !TextUtils.isEmpty(this.f966r);
        boolean z11 = !TextUtils.isEmpty(this.f967s);
        int i10 = 0;
        this.f972x.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f970v;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f970v.getParent() == null) {
            addView(this.f970v);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.z f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f968t == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f967s;
    }

    public CharSequence getTitle() {
        return this.f966r;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(k.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f968t
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.B
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f968t = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f968t
            goto L15
        L22:
            android.view.View r0 = r3.f968t
            int r1 = f.f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            androidx.appcompat.widget.c r0 = r3.f1110m
            if (r0 == 0) goto L3f
            r0.x()
        L3f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1110m = r0
            r1 = 1
            r0.I(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f1110m
            android.content.Context r2 = r3.f1108k
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f1110m
            androidx.appcompat.view.menu.k r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1109l = r4
            r1 = 0
            androidx.core.view.t.F(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1109l
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(k.b):void");
    }

    public boolean j() {
        return this.A;
    }

    public void k() {
        removeAllViews();
        this.f969u = null;
        this.f1109l = null;
    }

    public boolean l() {
        c cVar = this.f1110m;
        if (cVar != null) {
            return cVar.J();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1110m;
        if (cVar != null) {
            cVar.A();
            this.f1110m.B();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f966r);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = b1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f968t;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f968t.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = androidx.appcompat.widget.a.d(paddingRight, i14, b10);
            paddingRight = androidx.appcompat.widget.a.d(d10 + e(this.f968t, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f970v;
        if (linearLayout != null && this.f969u == null && linearLayout.getVisibility() != 8) {
            i16 += e(this.f970v, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f969u;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1109l;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i10);
            int i12 = this.f1111n;
            if (i12 <= 0) {
                i12 = View.MeasureSpec.getSize(i11);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i13 = i12 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
            View view = this.f968t;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f968t.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1109l;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f1109l, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f970v;
            if (linearLayout != null && this.f969u == null) {
                if (this.A) {
                    this.f970v.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f970v.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f970v.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f969u;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i14 = layoutParams.width;
                int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i14 >= 0) {
                    paddingLeft = Math.min(i14, paddingLeft);
                }
                int i16 = layoutParams.height;
                int i17 = i16 == -2 ? Integer.MIN_VALUE : 1073741824;
                if (i16 >= 0) {
                    i13 = Math.min(i16, i13);
                }
                this.f969u.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i17));
            }
            if (this.f1111n > 0) {
                setMeasuredDimension(size, i12);
                return;
            }
            int childCount = getChildCount();
            int i18 = 0;
            for (int i19 = 0; i19 < childCount; i19++) {
                int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i18) {
                    i18 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i18);
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1111n = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f969u;
        if (view2 != null) {
            removeView(view2);
        }
        this.f969u = view;
        if (view != null && (linearLayout = this.f970v) != null) {
            removeView(linearLayout);
            this.f970v = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f967s = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f966r = charSequence;
        i();
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.A) {
            requestLayout();
        }
        this.A = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
