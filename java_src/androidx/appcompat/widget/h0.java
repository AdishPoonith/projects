package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes.dex */
public class h0 extends ViewGroup {

    /* renamed from: j  reason: collision with root package name */
    private boolean f1187j;

    /* renamed from: k  reason: collision with root package name */
    private int f1188k;

    /* renamed from: l  reason: collision with root package name */
    private int f1189l;

    /* renamed from: m  reason: collision with root package name */
    private int f1190m;

    /* renamed from: n  reason: collision with root package name */
    private int f1191n;

    /* renamed from: o  reason: collision with root package name */
    private int f1192o;

    /* renamed from: p  reason: collision with root package name */
    private float f1193p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1194q;

    /* renamed from: r  reason: collision with root package name */
    private int[] f1195r;

    /* renamed from: s  reason: collision with root package name */
    private int[] f1196s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f1197t;

    /* renamed from: u  reason: collision with root package name */
    private int f1198u;

    /* renamed from: v  reason: collision with root package name */
    private int f1199v;

    /* renamed from: w  reason: collision with root package name */
    private int f1200w;

    /* renamed from: x  reason: collision with root package name */
    private int f1201x;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f1202a;

        /* renamed from: b  reason: collision with root package name */
        public int f1203b;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f1203b = -1;
            this.f1202a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1203b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f8288l1);
            this.f1202a = obtainStyledAttributes.getFloat(f.j.f8298n1, 0.0f);
            this.f1203b = obtainStyledAttributes.getInt(f.j.f8293m1, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1203b = -1;
        }
    }

    public h0(Context context) {
        this(context, null);
    }

    public h0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1187j = true;
        this.f1188k = -1;
        this.f1189l = 0;
        this.f1191n = 8388659;
        v0 t10 = v0.t(context, attributeSet, f.j.f8238b1, i10, 0);
        int j10 = t10.j(f.j.f8248d1, -1);
        if (j10 >= 0) {
            setOrientation(j10);
        }
        int j11 = t10.j(f.j.f8243c1, -1);
        if (j11 >= 0) {
            setGravity(j11);
        }
        boolean a10 = t10.a(f.j.f8253e1, true);
        if (!a10) {
            setBaselineAligned(a10);
        }
        this.f1193p = t10.h(f.j.f8263g1, -1.0f);
        this.f1188k = t10.j(f.j.f8258f1, -1);
        this.f1194q = t10.a(f.j.f8278j1, false);
        setDividerDrawable(t10.f(f.j.f8268h1));
        this.f1200w = t10.j(f.j.f8283k1, 0);
        this.f1201x = t10.e(f.j.f8273i1, 0);
        t10.u();
    }

    private void i(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View q10 = q(i12);
            if (q10.getVisibility() != 8) {
                a aVar = (a) q10.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i13 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = q10.getMeasuredWidth();
                    measureChildWithMargins(q10, i11, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i13;
                }
            }
        }
    }

    private void j(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View q10 = q(i12);
            if (q10.getVisibility() != 8) {
                a aVar = (a) q10.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i13 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = q10.getMeasuredHeight();
                    measureChildWithMargins(q10, makeMeasureSpec, 0, i11, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i13;
                }
            }
        }
    }

    private void y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void e(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean b10 = b1.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View q10 = q(i11);
            if (q10 != null && q10.getVisibility() != 8 && r(i11)) {
                a aVar = (a) q10.getLayoutParams();
                h(canvas, b10 ? q10.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (q10.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f1198u);
            }
        }
        if (r(virtualChildCount)) {
            View q11 = q(virtualChildCount - 1);
            if (q11 != null) {
                a aVar2 = (a) q11.getLayoutParams();
                if (b10) {
                    left = q11.getLeft();
                    i10 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - i10) - this.f1198u;
                } else {
                    right = q11.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (b10) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i10 = getPaddingRight();
                right = (left - i10) - this.f1198u;
            }
            h(canvas, right);
        }
    }

    void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View q10 = q(i10);
            if (q10 != null && q10.getVisibility() != 8 && r(i10)) {
                g(canvas, (q10.getTop() - ((ViewGroup.MarginLayoutParams) ((a) q10.getLayoutParams())).topMargin) - this.f1199v);
            }
        }
        if (r(virtualChildCount)) {
            View q11 = q(virtualChildCount - 1);
            g(canvas, q11 == null ? (getHeight() - getPaddingBottom()) - this.f1199v : q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) q11.getLayoutParams())).bottomMargin);
        }
    }

    void g(Canvas canvas, int i10) {
        this.f1197t.setBounds(getPaddingLeft() + this.f1201x, i10, (getWidth() - getPaddingRight()) - this.f1201x, this.f1199v + i10);
        this.f1197t.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1188k < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1188k;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1188k == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f1189l;
            if (this.f1190m == 1 && (i10 = this.f1191n & 112) != 48) {
                if (i10 == 16) {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1192o) / 2;
                } else if (i10 == 80) {
                    i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1192o;
                }
            }
            return i12 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1188k;
    }

    public Drawable getDividerDrawable() {
        return this.f1197t;
    }

    public int getDividerPadding() {
        return this.f1201x;
    }

    public int getDividerWidth() {
        return this.f1198u;
    }

    public int getGravity() {
        return this.f1191n;
    }

    public int getOrientation() {
        return this.f1190m;
    }

    public int getShowDividers() {
        return this.f1200w;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1193p;
    }

    void h(Canvas canvas, int i10) {
        this.f1197t.setBounds(i10, getPaddingTop() + this.f1201x, this.f1198u + i10, (getHeight() - getPaddingBottom()) - this.f1201x);
        this.f1197t.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1190m;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int n(View view, int i10) {
        return 0;
    }

    int o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1197t == null) {
            return;
        }
        if (this.f1190m == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1190m == 1) {
            t(i10, i11, i12, i13);
        } else {
            s(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1190m == 1) {
            x(i10, i11);
        } else {
            v(i10, i11);
        }
    }

    int p(View view) {
        return 0;
    }

    View q(int i10) {
        return getChildAt(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r(int i10) {
        if (i10 == 0) {
            return (this.f1200w & 1) != 0;
        } else if (i10 == getChildCount()) {
            return (this.f1200w & 4) != 0;
        } else if ((this.f1200w & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void s(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f1187j = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1188k = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1197t) {
            return;
        }
        this.f1197t = drawable;
        if (drawable != null) {
            this.f1198u = drawable.getIntrinsicWidth();
            this.f1199v = drawable.getIntrinsicHeight();
        } else {
            this.f1198u = 0;
            this.f1199v = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1201x = i10;
    }

    public void setGravity(int i10) {
        if (this.f1191n != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1191n = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1191n;
        if ((8388615 & i12) != i11) {
            this.f1191n = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1194q = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1190m != i10) {
            this.f1190m = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1200w) {
            requestLayout();
        }
        this.f1200w = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1191n;
        if ((i12 & 112) != i11) {
            this.f1191n = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1193p = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void t(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1191n
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1192o
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1192o
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc6
            android.view.View r13 = r6.q(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.w(r12)
            int r0 = r0 + r1
            goto Lc3
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc3
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.h0$a r5 = (androidx.appcompat.widget.h0.a) r5
            int r1 = r5.f1203b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.t.l(r17)
            int r1 = androidx.core.view.d.a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.r(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1199v
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.o(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.y(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.p(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.n(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc3:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.t(int, int, int, int):void");
    }

    void u(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x03a1, code lost:
        if (r8 > 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03ac, code lost:
        if (r8 < 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03ae, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03af, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void v(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.v(int, int):void");
    }

    int w(int i10) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ce, code lost:
        if (r15 > 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d9, code lost:
        if (r15 < 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02db, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02dc, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0319  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void x(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.x(int, int):void");
    }
}
