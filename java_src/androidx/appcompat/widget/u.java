package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
class u extends q {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1336d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1337e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1338f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1339g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1340h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1341i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(SeekBar seekBar) {
        super(seekBar);
        this.f1338f = null;
        this.f1339g = null;
        this.f1340h = false;
        this.f1341i = false;
        this.f1336d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1337e;
        if (drawable != null) {
            if (this.f1340h || this.f1341i) {
                Drawable p10 = androidx.core.graphics.drawable.a.p(drawable.mutate());
                this.f1337e = p10;
                if (this.f1340h) {
                    androidx.core.graphics.drawable.a.n(p10, this.f1338f);
                }
                if (this.f1341i) {
                    androidx.core.graphics.drawable.a.o(this.f1337e, this.f1339g);
                }
                if (this.f1337e.isStateful()) {
                    this.f1337e.setState(this.f1336d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.q
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        v0 t10 = v0.t(this.f1336d.getContext(), attributeSet, f.j.V, i10, 0);
        Drawable g10 = t10.g(f.j.W);
        if (g10 != null) {
            this.f1336d.setThumb(g10);
        }
        j(t10.f(f.j.X));
        int i11 = f.j.Z;
        if (t10.q(i11)) {
            this.f1339g = d0.d(t10.j(i11, -1), this.f1339g);
            this.f1341i = true;
        }
        int i12 = f.j.Y;
        if (t10.q(i12)) {
            this.f1338f = t10.c(i12);
            this.f1340h = true;
        }
        t10.u();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1337e != null) {
            int max = this.f1336d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1337e.getIntrinsicWidth();
                int intrinsicHeight = this.f1337e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1337e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1336d.getWidth() - this.f1336d.getPaddingLeft()) - this.f1336d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1336d.getPaddingLeft(), this.f1336d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1337e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1337e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1336d.getDrawableState())) {
            this.f1336d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1337e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1337e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1337e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1336d);
            androidx.core.graphics.drawable.a.l(drawable, androidx.core.view.t.l(this.f1336d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1336d.getDrawableState());
            }
            f();
        }
        this.f1336d.invalidate();
    }
}
