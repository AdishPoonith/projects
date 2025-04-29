package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: j  reason: collision with root package name */
    protected final C0014a f1107j;

    /* renamed from: k  reason: collision with root package name */
    protected final Context f1108k;

    /* renamed from: l  reason: collision with root package name */
    protected ActionMenuView f1109l;

    /* renamed from: m  reason: collision with root package name */
    protected c f1110m;

    /* renamed from: n  reason: collision with root package name */
    protected int f1111n;

    /* renamed from: o  reason: collision with root package name */
    protected androidx.core.view.z f1112o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1113p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1114q;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0014a implements androidx.core.view.a0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1115a = false;

        /* renamed from: b  reason: collision with root package name */
        int f1116b;

        protected C0014a() {
        }

        @Override // androidx.core.view.a0
        public void a(View view) {
            this.f1115a = true;
        }

        @Override // androidx.core.view.a0
        public void b(View view) {
            if (this.f1115a) {
                return;
            }
            a aVar = a.this;
            aVar.f1112o = null;
            a.super.setVisibility(this.f1116b);
        }

        @Override // androidx.core.view.a0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1115a = false;
        }

        public C0014a d(androidx.core.view.z zVar, int i10) {
            a.this.f1112o = zVar;
            this.f1116b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1107j = new C0014a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(f.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1108k = context;
        } else {
            this.f1108k = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.z f(int i10, long j10) {
        androidx.core.view.z b10;
        androidx.core.view.z zVar = this.f1112o;
        if (zVar != null) {
            zVar.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b10 = androidx.core.view.t.b(this).b(1.0f);
        } else {
            b10 = androidx.core.view.t.b(this).b(0.0f);
        }
        b10.f(j10);
        b10.h(this.f1107j.d(b10, i10));
        return b10;
    }

    public int getAnimatedVisibility() {
        return this.f1112o != null ? this.f1107j.f1116b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1111n;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, f.j.f8231a, f.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(f.j.f8276j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1110m;
        if (cVar != null) {
            cVar.E(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1114q = false;
        }
        if (!this.f1114q) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1114q = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1114q = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1113p = false;
        }
        if (!this.f1113p) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1113p = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1113p = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1111n = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.z zVar = this.f1112o;
            if (zVar != null) {
                zVar.c();
            }
            super.setVisibility(i10);
        }
    }
}
