package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final View f1147a;

    /* renamed from: d  reason: collision with root package name */
    private t0 f1150d;

    /* renamed from: e  reason: collision with root package name */
    private t0 f1151e;

    /* renamed from: f  reason: collision with root package name */
    private t0 f1152f;

    /* renamed from: c  reason: collision with root package name */
    private int f1149c = -1;

    /* renamed from: b  reason: collision with root package name */
    private final j f1148b = j.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.f1147a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1152f == null) {
            this.f1152f = new t0();
        }
        t0 t0Var = this.f1152f;
        t0Var.a();
        ColorStateList i10 = androidx.core.view.t.i(this.f1147a);
        if (i10 != null) {
            t0Var.f1335d = true;
            t0Var.f1332a = i10;
        }
        PorterDuff.Mode j10 = androidx.core.view.t.j(this.f1147a);
        if (j10 != null) {
            t0Var.f1334c = true;
            t0Var.f1333b = j10;
        }
        if (t0Var.f1335d || t0Var.f1334c) {
            j.i(drawable, t0Var, this.f1147a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f1150d != null : i10 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f1147a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            t0 t0Var = this.f1151e;
            if (t0Var != null) {
                j.i(background, t0Var, this.f1147a.getDrawableState());
                return;
            }
            t0 t0Var2 = this.f1150d;
            if (t0Var2 != null) {
                j.i(background, t0Var2, this.f1147a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        t0 t0Var = this.f1151e;
        if (t0Var != null) {
            return t0Var.f1332a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        t0 t0Var = this.f1151e;
        if (t0Var != null) {
            return t0Var.f1333b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i10) {
        v0 t10 = v0.t(this.f1147a.getContext(), attributeSet, f.j.D3, i10, 0);
        try {
            int i11 = f.j.E3;
            if (t10.q(i11)) {
                this.f1149c = t10.m(i11, -1);
                ColorStateList f10 = this.f1148b.f(this.f1147a.getContext(), this.f1149c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = f.j.F3;
            if (t10.q(i12)) {
                androidx.core.view.t.G(this.f1147a, t10.c(i12));
            }
            int i13 = f.j.G3;
            if (t10.q(i13)) {
                androidx.core.view.t.H(this.f1147a, d0.d(t10.j(i13, -1), null));
            }
        } finally {
            t10.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1149c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i10) {
        this.f1149c = i10;
        j jVar = this.f1148b;
        h(jVar != null ? jVar.f(this.f1147a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1150d == null) {
                this.f1150d = new t0();
            }
            t0 t0Var = this.f1150d;
            t0Var.f1332a = colorStateList;
            t0Var.f1335d = true;
        } else {
            this.f1150d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1151e == null) {
            this.f1151e = new t0();
        }
        t0 t0Var = this.f1151e;
        t0Var.f1332a = colorStateList;
        t0Var.f1335d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1151e == null) {
            this.f1151e = new t0();
        }
        t0 t0Var = this.f1151e;
        t0Var.f1333b = mode;
        t0Var.f1334c = true;
        b();
    }
}
