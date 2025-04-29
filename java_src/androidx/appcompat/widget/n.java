package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f1262a;

    /* renamed from: b  reason: collision with root package name */
    private t0 f1263b;

    /* renamed from: c  reason: collision with root package name */
    private t0 f1264c;

    /* renamed from: d  reason: collision with root package name */
    private t0 f1265d;

    public n(ImageView imageView) {
        this.f1262a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1265d == null) {
            this.f1265d = new t0();
        }
        t0 t0Var = this.f1265d;
        t0Var.a();
        ColorStateList a10 = androidx.core.widget.e.a(this.f1262a);
        if (a10 != null) {
            t0Var.f1335d = true;
            t0Var.f1332a = a10;
        }
        PorterDuff.Mode b10 = androidx.core.widget.e.b(this.f1262a);
        if (b10 != null) {
            t0Var.f1334c = true;
            t0Var.f1333b = b10;
        }
        if (t0Var.f1335d || t0Var.f1334c) {
            j.i(drawable, t0Var, this.f1262a.getDrawableState());
            return true;
        }
        return false;
    }

    private boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f1263b != null : i10 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f1262a.getDrawable();
        if (drawable != null) {
            d0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            t0 t0Var = this.f1264c;
            if (t0Var != null) {
                j.i(drawable, t0Var, this.f1262a.getDrawableState());
                return;
            }
            t0 t0Var2 = this.f1263b;
            if (t0Var2 != null) {
                j.i(drawable, t0Var2, this.f1262a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        t0 t0Var = this.f1264c;
        if (t0Var != null) {
            return t0Var.f1332a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        t0 t0Var = this.f1264c;
        if (t0Var != null) {
            return t0Var.f1333b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return !(this.f1262a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i10) {
        int m10;
        v0 t10 = v0.t(this.f1262a.getContext(), attributeSet, f.j.R, i10, 0);
        try {
            Drawable drawable = this.f1262a.getDrawable();
            if (drawable == null && (m10 = t10.m(f.j.S, -1)) != -1 && (drawable = h.a.d(this.f1262a.getContext(), m10)) != null) {
                this.f1262a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                d0.b(drawable);
            }
            int i11 = f.j.T;
            if (t10.q(i11)) {
                androidx.core.widget.e.c(this.f1262a, t10.c(i11));
            }
            int i12 = f.j.U;
            if (t10.q(i12)) {
                androidx.core.widget.e.d(this.f1262a, d0.d(t10.j(i12, -1), null));
            }
        } finally {
            t10.u();
        }
    }

    public void g(int i10) {
        if (i10 != 0) {
            Drawable d10 = h.a.d(this.f1262a.getContext(), i10);
            if (d10 != null) {
                d0.b(d10);
            }
            this.f1262a.setImageDrawable(d10);
        } else {
            this.f1262a.setImageDrawable(null);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.f1264c == null) {
            this.f1264c = new t0();
        }
        t0 t0Var = this.f1264c;
        t0Var.f1332a = colorStateList;
        t0Var.f1335d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.f1264c == null) {
            this.f1264c = new t0();
        }
        t0 t0Var = this.f1264c;
        t0Var.f1333b = mode;
        t0Var.f1334c = true;
        b();
    }
}
