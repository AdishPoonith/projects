package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.k;
import androidx.core.graphics.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class g extends androidx.vectordrawable.graphics.drawable.f {

    /* renamed from: t  reason: collision with root package name */
    static final PorterDuff.Mode f2754t = PorterDuff.Mode.SRC_IN;

    /* renamed from: k  reason: collision with root package name */
    private h f2755k;

    /* renamed from: l  reason: collision with root package name */
    private PorterDuffColorFilter f2756l;

    /* renamed from: m  reason: collision with root package name */
    private ColorFilter f2757m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2758n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2759o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable.ConstantState f2760p;

    /* renamed from: q  reason: collision with root package name */
    private final float[] f2761q;

    /* renamed from: r  reason: collision with root package name */
    private final Matrix f2762r;

    /* renamed from: s  reason: collision with root package name */
    private final Rect f2763s;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2790b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f2789a = androidx.core.graphics.c.d(string2);
            }
            this.f2791c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.j(xmlPullParser, "pathData")) {
                TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2729d);
                f(k10, xmlPullParser);
                k10.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f2764e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.res.d f2765f;

        /* renamed from: g  reason: collision with root package name */
        float f2766g;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.res.d f2767h;

        /* renamed from: i  reason: collision with root package name */
        float f2768i;

        /* renamed from: j  reason: collision with root package name */
        float f2769j;

        /* renamed from: k  reason: collision with root package name */
        float f2770k;

        /* renamed from: l  reason: collision with root package name */
        float f2771l;

        /* renamed from: m  reason: collision with root package name */
        float f2772m;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f2773n;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f2774o;

        /* renamed from: p  reason: collision with root package name */
        float f2775p;

        c() {
            this.f2766g = 0.0f;
            this.f2768i = 1.0f;
            this.f2769j = 1.0f;
            this.f2770k = 0.0f;
            this.f2771l = 1.0f;
            this.f2772m = 0.0f;
            this.f2773n = Paint.Cap.BUTT;
            this.f2774o = Paint.Join.MITER;
            this.f2775p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f2766g = 0.0f;
            this.f2768i = 1.0f;
            this.f2769j = 1.0f;
            this.f2770k = 0.0f;
            this.f2771l = 1.0f;
            this.f2772m = 0.0f;
            this.f2773n = Paint.Cap.BUTT;
            this.f2774o = Paint.Join.MITER;
            this.f2775p = 4.0f;
            this.f2764e = cVar.f2764e;
            this.f2765f = cVar.f2765f;
            this.f2766g = cVar.f2766g;
            this.f2768i = cVar.f2768i;
            this.f2767h = cVar.f2767h;
            this.f2791c = cVar.f2791c;
            this.f2769j = cVar.f2769j;
            this.f2770k = cVar.f2770k;
            this.f2771l = cVar.f2771l;
            this.f2772m = cVar.f2772m;
            this.f2773n = cVar.f2773n;
            this.f2774o = cVar.f2774o;
            this.f2775p = cVar.f2775p;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f2764e = null;
            if (k.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f2790b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f2789a = androidx.core.graphics.c.d(string2);
                }
                this.f2767h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f2769j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f2769j);
                this.f2773n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f2773n);
                this.f2774o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f2774o);
                this.f2775p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f2775p);
                this.f2765f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f2768i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f2768i);
                this.f2766g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f2766g);
                this.f2771l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f2771l);
                this.f2772m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f2772m);
                this.f2770k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f2770k);
                this.f2791c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f2791c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            return this.f2767h.i() || this.f2765f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            return this.f2765f.j(iArr) | this.f2767h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2728c);
            h(k10, xmlPullParser, theme);
            k10.recycle();
        }

        float getFillAlpha() {
            return this.f2769j;
        }

        int getFillColor() {
            return this.f2767h.e();
        }

        float getStrokeAlpha() {
            return this.f2768i;
        }

        int getStrokeColor() {
            return this.f2765f.e();
        }

        float getStrokeWidth() {
            return this.f2766g;
        }

        float getTrimPathEnd() {
            return this.f2771l;
        }

        float getTrimPathOffset() {
            return this.f2772m;
        }

        float getTrimPathStart() {
            return this.f2770k;
        }

        void setFillAlpha(float f10) {
            this.f2769j = f10;
        }

        void setFillColor(int i10) {
            this.f2767h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f2768i = f10;
        }

        void setStrokeColor(int i10) {
            this.f2765f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f2766g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f2771l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f2772m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f2770k = f10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f2776a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f2777b;

        /* renamed from: c  reason: collision with root package name */
        float f2778c;

        /* renamed from: d  reason: collision with root package name */
        private float f2779d;

        /* renamed from: e  reason: collision with root package name */
        private float f2780e;

        /* renamed from: f  reason: collision with root package name */
        private float f2781f;

        /* renamed from: g  reason: collision with root package name */
        private float f2782g;

        /* renamed from: h  reason: collision with root package name */
        private float f2783h;

        /* renamed from: i  reason: collision with root package name */
        private float f2784i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f2785j;

        /* renamed from: k  reason: collision with root package name */
        int f2786k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f2787l;

        /* renamed from: m  reason: collision with root package name */
        private String f2788m;

        public d() {
            super();
            this.f2776a = new Matrix();
            this.f2777b = new ArrayList<>();
            this.f2778c = 0.0f;
            this.f2779d = 0.0f;
            this.f2780e = 0.0f;
            this.f2781f = 1.0f;
            this.f2782g = 1.0f;
            this.f2783h = 0.0f;
            this.f2784i = 0.0f;
            this.f2785j = new Matrix();
            this.f2788m = null;
        }

        public d(d dVar, s.a<String, Object> aVar) {
            super();
            f bVar;
            this.f2776a = new Matrix();
            this.f2777b = new ArrayList<>();
            this.f2778c = 0.0f;
            this.f2779d = 0.0f;
            this.f2780e = 0.0f;
            this.f2781f = 1.0f;
            this.f2782g = 1.0f;
            this.f2783h = 0.0f;
            this.f2784i = 0.0f;
            Matrix matrix = new Matrix();
            this.f2785j = matrix;
            this.f2788m = null;
            this.f2778c = dVar.f2778c;
            this.f2779d = dVar.f2779d;
            this.f2780e = dVar.f2780e;
            this.f2781f = dVar.f2781f;
            this.f2782g = dVar.f2782g;
            this.f2783h = dVar.f2783h;
            this.f2784i = dVar.f2784i;
            this.f2787l = dVar.f2787l;
            String str = dVar.f2788m;
            this.f2788m = str;
            this.f2786k = dVar.f2786k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f2785j);
            ArrayList<e> arrayList = dVar.f2777b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f2777b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (!(eVar instanceof b)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        bVar = new b((b) eVar);
                    }
                    this.f2777b.add(bVar);
                    String str2 = bVar.f2790b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f2785j.reset();
            this.f2785j.postTranslate(-this.f2779d, -this.f2780e);
            this.f2785j.postScale(this.f2781f, this.f2782g);
            this.f2785j.postRotate(this.f2778c, 0.0f, 0.0f);
            this.f2785j.postTranslate(this.f2783h + this.f2779d, this.f2784i + this.f2780e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f2787l = null;
            this.f2778c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f2778c);
            this.f2779d = typedArray.getFloat(1, this.f2779d);
            this.f2780e = typedArray.getFloat(2, this.f2780e);
            this.f2781f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f2781f);
            this.f2782g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f2782g);
            this.f2783h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f2783h);
            this.f2784i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f2784i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2788m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f2777b.size(); i10++) {
                if (this.f2777b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f2777b.size(); i10++) {
                z10 |= this.f2777b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2727b);
            e(k10, xmlPullParser);
            k10.recycle();
        }

        public String getGroupName() {
            return this.f2788m;
        }

        public Matrix getLocalMatrix() {
            return this.f2785j;
        }

        public float getPivotX() {
            return this.f2779d;
        }

        public float getPivotY() {
            return this.f2780e;
        }

        public float getRotation() {
            return this.f2778c;
        }

        public float getScaleX() {
            return this.f2781f;
        }

        public float getScaleY() {
            return this.f2782g;
        }

        public float getTranslateX() {
            return this.f2783h;
        }

        public float getTranslateY() {
            return this.f2784i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f2779d) {
                this.f2779d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f2780e) {
                this.f2780e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f2778c) {
                this.f2778c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f2781f) {
                this.f2781f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f2782g) {
                this.f2782g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f2783h) {
                this.f2783h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f2784i) {
                this.f2784i = f10;
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected c.b[] f2789a;

        /* renamed from: b  reason: collision with root package name */
        String f2790b;

        /* renamed from: c  reason: collision with root package name */
        int f2791c;

        /* renamed from: d  reason: collision with root package name */
        int f2792d;

        public f() {
            super();
            this.f2789a = null;
            this.f2791c = 0;
        }

        public f(f fVar) {
            super();
            this.f2789a = null;
            this.f2791c = 0;
            this.f2790b = fVar.f2790b;
            this.f2792d = fVar.f2792d;
            this.f2789a = androidx.core.graphics.c.f(fVar.f2789a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f2789a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f2789a;
        }

        public String getPathName() {
            return this.f2790b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (androidx.core.graphics.c.b(this.f2789a, bVarArr)) {
                androidx.core.graphics.c.j(this.f2789a, bVarArr);
            } else {
                this.f2789a = androidx.core.graphics.c.f(bVarArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0054g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f2793q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f2794a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f2795b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f2796c;

        /* renamed from: d  reason: collision with root package name */
        Paint f2797d;

        /* renamed from: e  reason: collision with root package name */
        Paint f2798e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f2799f;

        /* renamed from: g  reason: collision with root package name */
        private int f2800g;

        /* renamed from: h  reason: collision with root package name */
        final d f2801h;

        /* renamed from: i  reason: collision with root package name */
        float f2802i;

        /* renamed from: j  reason: collision with root package name */
        float f2803j;

        /* renamed from: k  reason: collision with root package name */
        float f2804k;

        /* renamed from: l  reason: collision with root package name */
        float f2805l;

        /* renamed from: m  reason: collision with root package name */
        int f2806m;

        /* renamed from: n  reason: collision with root package name */
        String f2807n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f2808o;

        /* renamed from: p  reason: collision with root package name */
        final s.a<String, Object> f2809p;

        public C0054g() {
            this.f2796c = new Matrix();
            this.f2802i = 0.0f;
            this.f2803j = 0.0f;
            this.f2804k = 0.0f;
            this.f2805l = 0.0f;
            this.f2806m = 255;
            this.f2807n = null;
            this.f2808o = null;
            this.f2809p = new s.a<>();
            this.f2801h = new d();
            this.f2794a = new Path();
            this.f2795b = new Path();
        }

        public C0054g(C0054g c0054g) {
            this.f2796c = new Matrix();
            this.f2802i = 0.0f;
            this.f2803j = 0.0f;
            this.f2804k = 0.0f;
            this.f2805l = 0.0f;
            this.f2806m = 255;
            this.f2807n = null;
            this.f2808o = null;
            s.a<String, Object> aVar = new s.a<>();
            this.f2809p = aVar;
            this.f2801h = new d(c0054g.f2801h, aVar);
            this.f2794a = new Path(c0054g.f2794a);
            this.f2795b = new Path(c0054g.f2795b);
            this.f2802i = c0054g.f2802i;
            this.f2803j = c0054g.f2803j;
            this.f2804k = c0054g.f2804k;
            this.f2805l = c0054g.f2805l;
            this.f2800g = c0054g.f2800g;
            this.f2806m = c0054g.f2806m;
            this.f2807n = c0054g.f2807n;
            String str = c0054g.f2807n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f2808o = c0054g.f2808o;
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f2776a.set(matrix);
            dVar.f2776a.preConcat(dVar.f2785j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f2777b.size(); i12++) {
                e eVar = dVar.f2777b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f2776a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f2804k;
            float f11 = i11 / this.f2805l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f2776a;
            this.f2796c.set(matrix);
            this.f2796c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 == 0.0f) {
                return;
            }
            fVar.d(this.f2794a);
            Path path = this.f2794a;
            this.f2795b.reset();
            if (fVar.c()) {
                this.f2795b.setFillType(fVar.f2791c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f2795b.addPath(path, this.f2796c);
                canvas.clipPath(this.f2795b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f2770k;
            if (f12 != 0.0f || cVar.f2771l != 1.0f) {
                float f13 = cVar.f2772m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f2771l + f13) % 1.0f;
                if (this.f2799f == null) {
                    this.f2799f = new PathMeasure();
                }
                this.f2799f.setPath(this.f2794a, false);
                float length = this.f2799f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f2799f.getSegment(f16, length, path, true);
                    this.f2799f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f2799f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f2795b.addPath(path, this.f2796c);
            if (cVar.f2767h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f2767h;
                if (this.f2798e == null) {
                    Paint paint = new Paint(1);
                    this.f2798e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f2798e;
                if (dVar2.h()) {
                    Shader f18 = dVar2.f();
                    f18.setLocalMatrix(this.f2796c);
                    paint2.setShader(f18);
                    paint2.setAlpha(Math.round(cVar.f2769j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f2769j));
                }
                paint2.setColorFilter(colorFilter);
                this.f2795b.setFillType(cVar.f2791c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f2795b, paint2);
            }
            if (cVar.f2765f.l()) {
                androidx.core.content.res.d dVar3 = cVar.f2765f;
                if (this.f2797d == null) {
                    Paint paint3 = new Paint(1);
                    this.f2797d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f2797d;
                Paint.Join join = cVar.f2774o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f2773n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f2775p);
                if (dVar3.h()) {
                    Shader f19 = dVar3.f();
                    f19.setLocalMatrix(this.f2796c);
                    paint4.setShader(f19);
                    paint4.setAlpha(Math.round(cVar.f2768i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(g.a(dVar3.e(), cVar.f2768i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f2766g * min * e10);
                canvas.drawPath(this.f2795b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f2801h, f2793q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f2808o == null) {
                this.f2808o = Boolean.valueOf(this.f2801h.a());
            }
            return this.f2808o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f2801h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f2806m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f2806m = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f2810a;

        /* renamed from: b  reason: collision with root package name */
        C0054g f2811b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f2812c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f2813d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2814e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f2815f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f2816g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f2817h;

        /* renamed from: i  reason: collision with root package name */
        int f2818i;

        /* renamed from: j  reason: collision with root package name */
        boolean f2819j;

        /* renamed from: k  reason: collision with root package name */
        boolean f2820k;

        /* renamed from: l  reason: collision with root package name */
        Paint f2821l;

        public h() {
            this.f2812c = null;
            this.f2813d = g.f2754t;
            this.f2811b = new C0054g();
        }

        public h(h hVar) {
            this.f2812c = null;
            this.f2813d = g.f2754t;
            if (hVar != null) {
                this.f2810a = hVar.f2810a;
                C0054g c0054g = new C0054g(hVar.f2811b);
                this.f2811b = c0054g;
                if (hVar.f2811b.f2798e != null) {
                    c0054g.f2798e = new Paint(hVar.f2811b.f2798e);
                }
                if (hVar.f2811b.f2797d != null) {
                    this.f2811b.f2797d = new Paint(hVar.f2811b.f2797d);
                }
                this.f2812c = hVar.f2812c;
                this.f2813d = hVar.f2813d;
                this.f2814e = hVar.f2814e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f2815f.getWidth() && i11 == this.f2815f.getHeight();
        }

        public boolean b() {
            return !this.f2820k && this.f2816g == this.f2812c && this.f2817h == this.f2813d && this.f2819j == this.f2814e && this.f2818i == this.f2811b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f2815f == null || !a(i10, i11)) {
                this.f2815f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f2820k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f2815f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.f2821l == null) {
                    Paint paint = new Paint();
                    this.f2821l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f2821l.setAlpha(this.f2811b.getRootAlpha());
                this.f2821l.setColorFilter(colorFilter);
                return this.f2821l;
            }
            return null;
        }

        public boolean f() {
            return this.f2811b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f2811b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2810a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f2811b.g(iArr);
            this.f2820k |= g10;
            return g10;
        }

        public void i() {
            this.f2816g = this.f2812c;
            this.f2817h = this.f2813d;
            this.f2818i = this.f2811b.getRootAlpha();
            this.f2819j = this.f2814e;
            this.f2820k = false;
        }

        public void j(int i10, int i11) {
            this.f2815f.eraseColor(0);
            this.f2811b.b(new Canvas(this.f2815f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    /* loaded from: classes.dex */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f2822a;

        public i(Drawable.ConstantState constantState) {
            this.f2822a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2822a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2822a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f2753j = (VectorDrawable) this.f2822a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f2753j = (VectorDrawable) this.f2822a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f2753j = (VectorDrawable) this.f2822a.newDrawable(resources, theme);
            return gVar;
        }
    }

    g() {
        this.f2759o = true;
        this.f2761q = new float[9];
        this.f2762r = new Matrix();
        this.f2763s = new Rect();
        this.f2755k = new h();
    }

    g(h hVar) {
        this.f2759o = true;
        this.f2761q = new float[9];
        this.f2762r = new Matrix();
        this.f2763s = new Rect();
        this.f2755k = hVar;
        this.f2756l = j(this.f2756l, hVar.f2812c, hVar.f2813d);
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static g b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            g gVar = new g();
            gVar.f2753j = androidx.core.content.res.h.d(resources, i10, theme);
            gVar.f2760p = new i(gVar.f2753j.getConstantState());
            return gVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        }
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        int i11;
        b bVar;
        h hVar = this.f2755k;
        C0054g c0054g = hVar.f2811b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0054g.f2801h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2777b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0054g.f2809p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2777b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        c0054g.f2809p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2777b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        c0054g.f2809p.put(dVar2.getGroupName(), dVar2);
                    }
                    i10 = hVar.f2810a;
                    i11 = dVar2.f2786k;
                    hVar.f2810a = i11 | i10;
                }
                i10 = hVar.f2810a;
                i11 = bVar.f2792d;
                hVar.f2810a = i11 | i10;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f2755k;
        C0054g c0054g = hVar.f2811b;
        hVar.f2813d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            hVar.f2812c = c10;
        }
        hVar.f2814e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f2814e);
        c0054g.f2804k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, c0054g.f2804k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, c0054g.f2805l);
        c0054g.f2805l = f10;
        if (c0054g.f2804k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            c0054g.f2802i = typedArray.getDimension(3, c0054g.f2802i);
            float dimension = typedArray.getDimension(2, c0054g.f2803j);
            c0054g.f2803j = dimension;
            if (c0054g.f2802i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                c0054g.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, c0054g.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    c0054g.f2807n = string;
                    c0054g.f2809p.put(string, c0054g);
                }
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f2755k.f2811b.f2809p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f2763s);
        if (this.f2763s.width() <= 0 || this.f2763s.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2757m;
        if (colorFilter == null) {
            colorFilter = this.f2756l;
        }
        canvas.getMatrix(this.f2762r);
        this.f2762r.getValues(this.f2761q);
        float abs = Math.abs(this.f2761q[0]);
        float abs2 = Math.abs(this.f2761q[4]);
        float abs3 = Math.abs(this.f2761q[1]);
        float abs4 = Math.abs(this.f2761q[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f2763s.width() * abs));
        int min2 = Math.min(2048, (int) (this.f2763s.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f2763s;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f2763s.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f2763s.offsetTo(0, 0);
        this.f2755k.c(min, min2);
        if (!this.f2759o) {
            this.f2755k.j(min, min2);
        } else if (!this.f2755k.b()) {
            this.f2755k.j(min, min2);
            this.f2755k.i();
        }
        this.f2755k.d(canvas, colorFilter, this.f2763s);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2753j;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2755k.f2811b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2753j;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2755k.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2753j;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2757m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2753j == null || Build.VERSION.SDK_INT < 24) {
            this.f2755k.f2810a = getChangingConfigurations();
            return this.f2755k;
        }
        return new i(this.f2753j.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2753j;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2755k.f2811b.f2803j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2753j;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2755k.f2811b.f2802i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) {
        this.f2759o = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f2755k;
        hVar.f2811b = new C0054g();
        TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2726a);
        i(k10, xmlPullParser, theme);
        k10.recycle();
        hVar.f2810a = getChangingConfigurations();
        hVar.f2820k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f2756l = j(this.f2756l, hVar.f2812c, hVar.f2813d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2753j;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f2755k.f2814e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f2753j;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f2755k) != null && (hVar.g() || ((colorStateList = this.f2755k.f2812c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2758n && super.mutate() == this) {
            this.f2755k = new h(this.f2755k);
            this.f2758n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f2755k;
        ColorStateList colorStateList = hVar.f2812c;
        if (colorStateList != null && (mode = hVar.f2813d) != null) {
            this.f2756l = j(this.f2756l, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (hVar.g() && hVar.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f2755k.f2811b.getRootAlpha() != i10) {
            this.f2755k.f2811b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z10);
        } else {
            this.f2755k.f2814e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f2757m = colorFilter;
        invalidateSelf();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
            return;
        }
        h hVar = this.f2755k;
        if (hVar.f2812c != colorStateList) {
            hVar.f2812c = colorStateList;
            this.f2756l = j(this.f2756l, colorStateList, hVar.f2813d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
            return;
        }
        h hVar = this.f2755k;
        if (hVar.f2813d != mode) {
            hVar.f2813d = mode;
            this.f2756l = j(this.f2756l, hVar.f2812c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f2753j;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2753j;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
