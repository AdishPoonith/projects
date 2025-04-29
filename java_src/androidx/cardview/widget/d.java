package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f1463a;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f1465c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f1466d;

    /* renamed from: e  reason: collision with root package name */
    private float f1467e;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f1470h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f1471i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f1472j;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1468f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1469g = true;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f1473k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f1464b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(ColorStateList colorStateList, float f10) {
        this.f1463a = f10;
        e(colorStateList);
        this.f1465c = new RectF();
        this.f1466d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1470h = colorStateList;
        this.f1464b.setColor(colorStateList.getColorForState(getState(), this.f1470h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1465c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1466d.set(rect);
        if (this.f1468f) {
            float b10 = e.b(this.f1467e, this.f1463a, this.f1469g);
            this.f1466d.inset((int) Math.ceil(e.a(this.f1467e, this.f1463a, this.f1469g)), (int) Math.ceil(b10));
            this.f1465c.set(this.f1466d);
        }
    }

    public ColorStateList b() {
        return this.f1470h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f1467e;
    }

    public float d() {
        return this.f1463a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f1464b;
        if (this.f1471i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f1471i);
            z10 = true;
        }
        RectF rectF = this.f1465c;
        float f10 = this.f1463a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f1467e && this.f1468f == z10 && this.f1469g == z11) {
            return;
        }
        this.f1467e = f10;
        this.f1468f = z10;
        this.f1469g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1466d, this.f1463a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 == this.f1463a) {
            return;
        }
        this.f1463a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1472j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1470h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1470h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f1464b.getColor();
        if (z10) {
            this.f1464b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1472j;
        if (colorStateList2 == null || (mode = this.f1473k) == null) {
            return z10;
        }
        this.f1471i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f1464b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1464b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1472j = colorStateList;
        this.f1471i = a(colorStateList, this.f1473k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1473k = mode;
        this.f1471i = a(this.f1472j, mode);
        invalidateSelf();
    }
}
