package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
/* loaded from: classes.dex */
public class f extends Button implements androidx.core.widget.b {

    /* renamed from: j  reason: collision with root package name */
    private final e f1169j;

    /* renamed from: k  reason: collision with root package name */
    private final x f1170k;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.buttonStyle);
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(s0.b(context), attributeSet, i10);
        e eVar = new e(this);
        this.f1169j = eVar;
        eVar.e(attributeSet, i10);
        x xVar = new x(this);
        this.f1170k = xVar;
        xVar.m(attributeSet, i10);
        xVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1169j;
        if (eVar != null) {
            eVar.b();
        }
        x xVar = this.f1170k;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f2003b) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.f1170k;
        if (xVar != null) {
            return xVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f2003b) {
            return super.getAutoSizeMinTextSize();
        }
        x xVar = this.f1170k;
        if (xVar != null) {
            return xVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f2003b) {
            return super.getAutoSizeStepGranularity();
        }
        x xVar = this.f1170k;
        if (xVar != null) {
            return xVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f2003b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x xVar = this.f1170k;
        return xVar != null ? xVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f2003b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.f1170k;
        if (xVar != null) {
            return xVar.i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1169j;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1169j;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        x xVar = this.f1170k;
        if (xVar != null) {
            xVar.n(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        x xVar = this.f1170k;
        if (xVar == null || androidx.core.widget.b.f2003b || !xVar.l()) {
            return;
        }
        this.f1170k.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (androidx.core.widget.b.f2003b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        x xVar = this.f1170k;
        if (xVar != null) {
            xVar.s(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (androidx.core.widget.b.f2003b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        x xVar = this.f1170k;
        if (xVar != null) {
            xVar.t(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (androidx.core.widget.b.f2003b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        x xVar = this.f1170k;
        if (xVar != null) {
            xVar.u(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1169j;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1169j;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.m(this, callback));
    }

    public void setSupportAllCaps(boolean z10) {
        x xVar = this.f1170k;
        if (xVar != null) {
            xVar.r(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1169j;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1169j;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x xVar = this.f1170k;
        if (xVar != null) {
            xVar.p(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (androidx.core.widget.b.f2003b) {
            super.setTextSize(i10, f10);
            return;
        }
        x xVar = this.f1170k;
        if (xVar != null) {
            xVar.z(i10, f10);
        }
    }
}
