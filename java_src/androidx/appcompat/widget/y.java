package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import w.a;
/* loaded from: classes.dex */
public class y extends TextView implements androidx.core.widget.j, androidx.core.widget.b {

    /* renamed from: j  reason: collision with root package name */
    private final e f1413j;

    /* renamed from: k  reason: collision with root package name */
    private final x f1414k;

    /* renamed from: l  reason: collision with root package name */
    private final w f1415l;

    /* renamed from: m  reason: collision with root package name */
    private Future<w.a> f1416m;

    public y(Context context) {
        this(context, null);
    }

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public y(Context context, AttributeSet attributeSet, int i10) {
        super(s0.b(context), attributeSet, i10);
        e eVar = new e(this);
        this.f1413j = eVar;
        eVar.e(attributeSet, i10);
        x xVar = new x(this);
        this.f1414k = xVar;
        xVar.m(attributeSet, i10);
        xVar.b();
        this.f1415l = new w(this);
    }

    private void e() {
        Future<w.a> future = this.f1416m;
        if (future != null) {
            try {
                this.f1416m = null;
                androidx.core.widget.i.k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1413j;
        if (eVar != null) {
            eVar.b();
        }
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f2003b) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.f1414k;
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
        x xVar = this.f1414k;
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
        x xVar = this.f1414k;
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
        x xVar = this.f1414k;
        return xVar != null ? xVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f2003b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.f1414k;
        if (xVar != null) {
            return xVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.i.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.i.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1413j;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1413j;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1414k.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1414k.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        w wVar;
        return (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1415l) == null) ? super.getTextClassifier() : wVar.a();
    }

    public a.C0280a getTextMetricsParamsCompat() {
        return androidx.core.widget.i.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.n(z10, i10, i11, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        e();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        x xVar = this.f1414k;
        if (xVar == null || androidx.core.widget.b.f2003b || !xVar.l()) {
            return;
        }
        this.f1414k.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (androidx.core.widget.b.f2003b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        x xVar = this.f1414k;
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
        x xVar = this.f1414k;
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
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.u(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1413j;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1413j;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? h.a.d(context, i10) : null, i11 != 0 ? h.a.d(context, i11) : null, i12 != 0 ? h.a.d(context, i12) : null, i13 != 0 ? h.a.d(context, i13) : null);
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? h.a.d(context, i10) : null, i11 != 0 ? h.a.d(context, i11) : null, i12 != 0 ? h.a.d(context, i12) : null, i13 != 0 ? h.a.d(context, i13) : null);
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.o();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            androidx.core.widget.i.h(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            androidx.core.widget.i.i(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.i.j(this, i10);
    }

    public void setPrecomputedText(w.a aVar) {
        androidx.core.widget.i.k(this, aVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1413j;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1413j;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1414k.v(colorStateList);
        this.f1414k.b();
    }

    @Override // androidx.core.widget.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1414k.w(mode);
        this.f1414k.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.p(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1415l) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<w.a> future) {
        this.f1416m = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a.C0280a c0280a) {
        androidx.core.widget.i.l(this, c0280a);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (androidx.core.widget.b.f2003b) {
            super.setTextSize(i10, f10);
            return;
        }
        x xVar = this.f1414k;
        if (xVar != null) {
            xVar.z(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        Typeface a10 = (typeface == null || i10 <= 0) ? null : androidx.core.graphics.d.a(getContext(), typeface, i10);
        if (a10 != null) {
            typeface = a10;
        }
        super.setTypeface(typeface, i10);
    }
}
