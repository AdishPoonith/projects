package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.x0;
import androidx.appcompat.widget.y;
/* loaded from: classes.dex */
public class ActionMenuItemView extends y implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: n  reason: collision with root package name */
    g f782n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f783o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f784p;

    /* renamed from: q  reason: collision with root package name */
    e.b f785q;

    /* renamed from: r  reason: collision with root package name */
    private g0 f786r;

    /* renamed from: s  reason: collision with root package name */
    b f787s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f788t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f789u;

    /* renamed from: v  reason: collision with root package name */
    private int f790v;

    /* renamed from: w  reason: collision with root package name */
    private int f791w;

    /* renamed from: x  reason: collision with root package name */
    private int f792x;

    /* loaded from: classes.dex */
    private class a extends g0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.g0
        public l.e b() {
            b bVar = ActionMenuItemView.this.f787s;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g0
        protected boolean c() {
            l.e b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f785q;
            return bVar != null && bVar.a(actionMenuItemView.f782n) && (b10 = b()) != null && b10.c();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract l.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f788t = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f8336v, i10, 0);
        this.f790v = obtainStyledAttributes.getDimensionPixelSize(f.j.f8341w, 0);
        obtainStyledAttributes.recycle();
        this.f792x = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f791w = -1;
        setSaveEnabled(false);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f783o);
        if (this.f784p != null && (!this.f782n.B() || (!this.f788t && !this.f789u))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f783o : null);
        CharSequence contentDescription = this.f782n.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z12 ? null : this.f782n.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f782n.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            x0.a(this, z12 ? null : this.f782n.getTitle());
        } else {
            x0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean a() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return f() && this.f782n.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i10) {
        this.f782n = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f786r == null) {
            this.f786r = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f782n;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f785q;
        if (bVar != null) {
            bVar.a(this.f782n);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f788t = g();
        h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.y, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean f10 = f();
        if (f10 && (i12 = this.f791w) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f790v) : this.f790v;
        if (mode != 1073741824 && this.f790v > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (f10 || this.f784p == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f784p.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g0Var;
        if (this.f782n.hasSubMenu() && (g0Var = this.f786r) != null && g0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f789u != z10) {
            this.f789u = z10;
            g gVar = this.f782n;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f784p = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f792x;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f785q = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f791w = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f787s = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f783o = charSequence;
        h();
    }
}
