package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f1452q = {16842801};

    /* renamed from: r  reason: collision with root package name */
    private static final c f1453r;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1454j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1455k;

    /* renamed from: l  reason: collision with root package name */
    int f1456l;

    /* renamed from: m  reason: collision with root package name */
    int f1457m;

    /* renamed from: n  reason: collision with root package name */
    final Rect f1458n;

    /* renamed from: o  reason: collision with root package name */
    final Rect f1459o;

    /* renamed from: p  reason: collision with root package name */
    private final b f1460p;

    /* loaded from: classes.dex */
    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f1461a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public View a() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.b
        public void b(int i10, int i11, int i12, int i13) {
            CardView.this.f1459o.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1458n;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public void c(Drawable drawable) {
            this.f1461a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable f() {
            return this.f1461a;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f1453r = aVar;
        aVar.f();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r.a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources;
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1458n = rect;
        this.f1459o = new Rect();
        a aVar = new a();
        this.f1460p = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.d.f16603a, i10, r.c.CardView);
        int i12 = r.d.f16606d;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1452q);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i11 = r.b.cardview_light_background;
            } else {
                resources = getResources();
                i11 = r.b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i11));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(r.d.f16607e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(r.d.f16608f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(r.d.f16609g, 0.0f);
        this.f1454j = obtainStyledAttributes.getBoolean(r.d.f16611i, false);
        this.f1455k = obtainStyledAttributes.getBoolean(r.d.f16610h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(r.d.f16612j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(r.d.f16614l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(r.d.f16616n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(r.d.f16615m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(r.d.f16613k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1456l = obtainStyledAttributes.getDimensionPixelSize(r.d.f16604b, 0);
        this.f1457m = obtainStyledAttributes.getDimensionPixelSize(r.d.f16605c, 0);
        obtainStyledAttributes.recycle();
        f1453r.c(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1453r.b(this.f1460p);
    }

    public float getCardElevation() {
        return f1453r.e(this.f1460p);
    }

    public int getContentPaddingBottom() {
        return this.f1458n.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1458n.left;
    }

    public int getContentPaddingRight() {
        return this.f1458n.right;
    }

    public int getContentPaddingTop() {
        return this.f1458n.top;
    }

    public float getMaxCardElevation() {
        return f1453r.a(this.f1460p);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1455k;
    }

    public float getRadius() {
        return f1453r.g(this.f1460p);
    }

    public boolean getUseCompatPadding() {
        return this.f1454j;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        c cVar = f1453r;
        if (!(cVar instanceof androidx.cardview.widget.a)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.i(this.f1460p)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.h(this.f1460p)), View.MeasureSpec.getSize(i11)), mode2);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f1453r.m(this.f1460p, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1453r.m(this.f1460p, colorStateList);
    }

    public void setCardElevation(float f10) {
        f1453r.k(this.f1460p, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1453r.n(this.f1460p, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1457m = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1456l = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1455k) {
            this.f1455k = z10;
            f1453r.l(this.f1460p);
        }
    }

    public void setRadius(float f10) {
        f1453r.d(this.f1460p, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1454j != z10) {
            this.f1454j = z10;
            f1453r.j(this.f1460p);
        }
    }
}
