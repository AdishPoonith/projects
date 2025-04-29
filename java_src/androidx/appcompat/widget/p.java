package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
class p extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1297b = false;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1298a;

    public p(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        v0 t10 = v0.t(context, attributeSet, f.j.f8239b2, i10, i11);
        int i12 = f.j.f8249d2;
        if (t10.q(i12)) {
            b(t10.a(i12, false));
        }
        setBackgroundDrawable(t10.f(f.j.f8244c2));
        t10.u();
    }

    private void b(boolean z10) {
        if (f1297b) {
            this.f1298a = z10;
        } else {
            androidx.core.widget.h.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1297b && this.f1298a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1297b && this.f1298a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1297b && this.f1298a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}
