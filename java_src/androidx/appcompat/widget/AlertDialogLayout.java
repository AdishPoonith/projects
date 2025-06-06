package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.h0;
/* loaded from: classes.dex */
public class AlertDialogLayout extends h0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean A(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == f.f.topPanel) {
                    view = childAt;
                } else if (id == f.f.buttonPanel) {
                    view2 = childAt;
                } else if ((id != f.f.contentPanel && id != f.f.customPanel) || view3 != null) {
                    return false;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i10, 0);
            paddingTop += view.getMeasuredHeight();
            i12 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i12 = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            i13 = z(view2);
            i14 = view2.getMeasuredHeight() - i13;
            paddingTop += i13;
            i12 = View.combineMeasuredStates(i12, view2.getMeasuredState());
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i15 = view3.getMeasuredHeight();
            paddingTop += i15;
            i12 = View.combineMeasuredStates(i12, view3.getMeasuredState());
        } else {
            i15 = 0;
        }
        int i17 = size - paddingTop;
        if (view2 != null) {
            int i18 = paddingTop - i13;
            int min = Math.min(i17, i14);
            if (min > 0) {
                i17 -= min;
                i13 += min;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
            paddingTop = i18 + view2.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i12, view2.getMeasuredState());
        }
        if (view3 != null && i17 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(i15 + i17, mode));
            paddingTop = (paddingTop - i15) + view3.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i12, view3.getMeasuredState());
        }
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                i19 = Math.max(i19, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i19 + getPaddingLeft() + getPaddingRight(), i10, i12), View.resolveSizeAndState(paddingTop, i11, 0));
        if (mode2 != 1073741824) {
            j(childCount, i11);
            return true;
        }
        return true;
    }

    private void j(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                h0.a aVar = (h0.a) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i13 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i11, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i13;
                }
            }
        }
    }

    private void y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    private static int z(View view) {
        int m10 = androidx.core.view.t.m(view);
        if (m10 > 0) {
            return m10;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return z(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    @Override // androidx.appcompat.widget.h0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r0 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r1 = r17.getGravity()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r1 & r3
            r1 = 16
            if (r2 == r1) goto L40
            r1 = 80
            if (r2 == r1) goto L35
            int r0 = r17.getPaddingTop()
            goto L4b
        L35:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r22
            int r1 = r1 - r20
            int r0 = r1 - r0
            goto L4b
        L40:
            int r1 = r17.getPaddingTop()
            int r2 = r22 - r20
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r0 = r1 + r2
        L4b:
            android.graphics.drawable.Drawable r1 = r17.getDividerDrawable()
            r2 = 0
            if (r1 != 0) goto L54
            r12 = 0
            goto L59
        L54:
            int r1 = r1.getIntrinsicHeight()
            r12 = r1
        L59:
            r13 = 0
        L5a:
            if (r13 >= r10) goto Lbd
            android.view.View r1 = r6.getChildAt(r13)
            if (r1 == 0) goto Lba
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto Lba
            int r4 = r1.getMeasuredWidth()
            int r14 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r15 = r2
            androidx.appcompat.widget.h0$a r15 = (androidx.appcompat.widget.h0.a) r15
            int r2 = r15.f1203b
            if (r2 >= 0) goto L7e
            r2 = r11
        L7e:
            int r3 = androidx.core.view.t.l(r17)
            int r2 = androidx.core.view.d.a(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L95
            r3 = 5
            if (r2 == r3) goto L92
            int r2 = r15.leftMargin
            int r2 = r2 + r7
            goto La0
        L92:
            int r2 = r8 - r4
            goto L9d
        L95:
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r7
            int r3 = r15.leftMargin
            int r2 = r2 + r3
        L9d:
            int r3 = r15.rightMargin
            int r2 = r2 - r3
        La0:
            boolean r3 = r6.r(r13)
            if (r3 == 0) goto La7
            int r0 = r0 + r12
        La7:
            int r3 = r15.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r5 = r14
            r0.y(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r14 = r14 + r0
            int r16 = r16 + r14
            r0 = r16
        Lba:
            int r13 = r13 + 1
            goto L5a
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.h0, android.view.View
    public void onMeasure(int i10, int i11) {
        if (A(i10, i11)) {
            return;
        }
        super.onMeasure(i10, i11);
    }
}
