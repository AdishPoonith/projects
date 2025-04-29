package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
/* loaded from: classes.dex */
public class o extends MultiAutoCompleteTextView {

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f1274l = {16843126};

    /* renamed from: j  reason: collision with root package name */
    private final e f1275j;

    /* renamed from: k  reason: collision with root package name */
    private final x f1276k;

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.autoCompleteTextViewStyle);
    }

    public o(Context context, AttributeSet attributeSet, int i10) {
        super(s0.b(context), attributeSet, i10);
        v0 t10 = v0.t(getContext(), attributeSet, f1274l, i10, 0);
        if (t10.q(0)) {
            setDropDownBackgroundDrawable(t10.f(0));
        }
        t10.u();
        e eVar = new e(this);
        this.f1275j = eVar;
        eVar.e(attributeSet, i10);
        x xVar = new x(this);
        this.f1276k = xVar;
        xVar.m(attributeSet, i10);
        xVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1275j;
        if (eVar != null) {
            eVar.b();
        }
        x xVar = this.f1276k;
        if (xVar != null) {
            xVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1275j;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1275j;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1275j;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1275j;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(h.a.d(getContext(), i10));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1275j;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1275j;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x xVar = this.f1276k;
        if (xVar != null) {
            xVar.p(context, i10);
        }
    }
}
