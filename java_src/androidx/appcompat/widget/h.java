package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* loaded from: classes.dex */
public class h extends CheckedTextView {

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f1185k = {16843016};

    /* renamed from: j  reason: collision with root package name */
    private final x f1186j;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        super(s0.b(context), attributeSet, i10);
        x xVar = new x(this);
        this.f1186j = xVar;
        xVar.m(attributeSet, i10);
        xVar.b();
        v0 t10 = v0.t(getContext(), attributeSet, f1185k, i10, 0);
        setCheckMarkDrawable(t10.f(0));
        t10.u();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f1186j;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(h.a.d(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        x xVar = this.f1186j;
        if (xVar != null) {
            xVar.p(context, i10);
        }
    }
}
