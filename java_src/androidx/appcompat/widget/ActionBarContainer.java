package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    private boolean f956j;

    /* renamed from: k  reason: collision with root package name */
    private View f957k;

    /* renamed from: l  reason: collision with root package name */
    private View f958l;

    /* renamed from: m  reason: collision with root package name */
    private View f959m;

    /* renamed from: n  reason: collision with root package name */
    Drawable f960n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f961o;

    /* renamed from: p  reason: collision with root package name */
    Drawable f962p;

    /* renamed from: q  reason: collision with root package name */
    boolean f963q;

    /* renamed from: r  reason: collision with root package name */
    boolean f964r;

    /* renamed from: s  reason: collision with root package name */
    private int f965s;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.t.F(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f8231a);
        this.f960n = obtainStyledAttributes.getDrawable(f.j.f8236b);
        this.f961o = obtainStyledAttributes.getDrawable(f.j.f8246d);
        this.f965s = obtainStyledAttributes.getDimensionPixelSize(f.j.f8276j, -1);
        boolean z10 = true;
        if (getId() == f.f.split_action_bar) {
            this.f963q = true;
            this.f962p = obtainStyledAttributes.getDrawable(f.j.f8241c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f963q ? this.f960n != null || this.f961o != null : this.f962p != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f960n;
        if (drawable != null && drawable.isStateful()) {
            this.f960n.setState(getDrawableState());
        }
        Drawable drawable2 = this.f961o;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f961o.setState(getDrawableState());
        }
        Drawable drawable3 = this.f962p;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f962p.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f957k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f960n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f961o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f962p;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f958l = findViewById(f.f.action_bar);
        this.f959m = findViewById(f.f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f956j || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        View view2 = this.f957k;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i10, (measuredHeight - view2.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f963q) {
            Drawable drawable3 = this.f962p;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f960n != null) {
                if (this.f958l.getVisibility() == 0) {
                    drawable2 = this.f960n;
                    left = this.f958l.getLeft();
                    top = this.f958l.getTop();
                    right = this.f958l.getRight();
                    view = this.f958l;
                } else {
                    View view3 = this.f959m;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f960n.setBounds(0, 0, 0, 0);
                        z12 = true;
                    } else {
                        drawable2 = this.f960n;
                        left = this.f959m.getLeft();
                        top = this.f959m.getTop();
                        right = this.f959m.getRight();
                        view = this.f959m;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z12 = true;
            }
            this.f964r = z13;
            if (!z13 || (drawable = this.f961o) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f958l
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f965s
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f958l
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f957k
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f958l
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f958l
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f959m
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f959m
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f957k
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f960n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f960n);
        }
        this.f960n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f958l;
            if (view != null) {
                this.f960n.setBounds(view.getLeft(), this.f958l.getTop(), this.f958l.getRight(), this.f958l.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f963q ? this.f960n != null || this.f961o != null : this.f962p != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f962p;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f962p);
        }
        this.f962p = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f963q && (drawable2 = this.f962p) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f963q ? !(this.f960n != null || this.f961o != null) : this.f962p == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f961o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f961o);
        }
        this.f961o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f964r && (drawable2 = this.f961o) != null) {
                drawable2.setBounds(this.f957k.getLeft(), this.f957k.getTop(), this.f957k.getRight(), this.f957k.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f963q ? this.f960n != null || this.f961o != null : this.f962p != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(o0 o0Var) {
        View view = this.f957k;
        if (view != null) {
            removeView(view);
        }
        this.f957k = o0Var;
        if (o0Var != null) {
            addView(o0Var);
            ViewGroup.LayoutParams layoutParams = o0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            o0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f956j = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f960n;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f961o;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f962p;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f960n && !this.f963q) || (drawable == this.f961o && this.f964r) || ((drawable == this.f962p && this.f963q) || super.verifyDrawable(drawable));
    }
}
