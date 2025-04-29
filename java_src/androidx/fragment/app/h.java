package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class h extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<View> f2283j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<View> f2284k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2285l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        String str;
        this.f2285l = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.c.f12h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(a0.c.f13i) : classAttribute;
        String string = obtainStyledAttributes.getString(a0.c.f14j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment i02 = nVar.i0(id);
        if (classAttribute == null || i02 != null) {
            return;
        }
        if (id > 0) {
            Fragment a10 = nVar.r0().a(context.getClassLoader(), classAttribute);
            a10.z0(context, attributeSet, null);
            nVar.m().l(true).c(this, a10, string).h();
            return;
        }
        if (string != null) {
            str = " with tag " + string;
        } else {
            str = "";
        }
        throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f2284k;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2283j == null) {
            this.f2283j = new ArrayList<>();
        }
        this.f2283j.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (n.A0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (n.A0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f2285l && this.f2283j != null) {
            for (int i10 = 0; i10 < this.f2283j.size(); i10++) {
                super.drawChild(canvas, this.f2283j.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f2285l || (arrayList = this.f2283j) == null || arrayList.size() <= 0 || !this.f2283j.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2284k;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2283j;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2285l = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f2285l = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2284k == null) {
                this.f2284k = new ArrayList<>();
            }
            this.f2284k.add(view);
        }
        super.startViewTransition(view);
    }
}
