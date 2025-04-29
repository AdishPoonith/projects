package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1367a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1368b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1369c;

    private v0(Context context, TypedArray typedArray) {
        this.f1367a = context;
        this.f1368b = typedArray;
    }

    public static v0 r(Context context, int i10, int[] iArr) {
        return new v0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static v0 s(Context context, AttributeSet attributeSet, int[] iArr) {
        return new v0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static v0 t(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new v0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1368b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1368b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList c10;
        return (!this.f1368b.hasValue(i10) || (resourceId = this.f1368b.getResourceId(i10, 0)) == 0 || (c10 = h.a.c(this.f1367a, resourceId)) == null) ? this.f1368b.getColorStateList(i10) : c10;
    }

    public int d(int i10, int i11) {
        return this.f1368b.getDimensionPixelOffset(i10, i11);
    }

    public int e(int i10, int i11) {
        return this.f1368b.getDimensionPixelSize(i10, i11);
    }

    public Drawable f(int i10) {
        int resourceId;
        return (!this.f1368b.hasValue(i10) || (resourceId = this.f1368b.getResourceId(i10, 0)) == 0) ? this.f1368b.getDrawable(i10) : h.a.d(this.f1367a, resourceId);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (!this.f1368b.hasValue(i10) || (resourceId = this.f1368b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f1367a, resourceId, true);
    }

    public float h(int i10, float f10) {
        return this.f1368b.getFloat(i10, f10);
    }

    public Typeface i(int i10, int i11, h.e eVar) {
        int resourceId = this.f1368b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1369c == null) {
            this.f1369c = new TypedValue();
        }
        return androidx.core.content.res.h.e(this.f1367a, resourceId, this.f1369c, i11, eVar);
    }

    public int j(int i10, int i11) {
        return this.f1368b.getInt(i10, i11);
    }

    public int k(int i10, int i11) {
        return this.f1368b.getInteger(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1368b.getLayoutDimension(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1368b.getResourceId(i10, i11);
    }

    public String n(int i10) {
        return this.f1368b.getString(i10);
    }

    public CharSequence o(int i10) {
        return this.f1368b.getText(i10);
    }

    public CharSequence[] p(int i10) {
        return this.f1368b.getTextArray(i10);
    }

    public boolean q(int i10) {
        return this.f1368b.hasValue(i10);
    }

    public void u() {
        this.f1368b.recycle();
    }
}
