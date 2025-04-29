package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z {

    /* renamed from: k  reason: collision with root package name */
    private static final RectF f1430k = new RectF();

    /* renamed from: l  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f1431l = new ConcurrentHashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f1432m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f1433a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1434b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f1435c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f1436d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f1437e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f1438f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f1439g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f1440h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f1441i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f1442j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(TextView textView) {
        this.f1441i = textView;
        this.f1442j = textView.getContext();
    }

    private boolean A() {
        return !(this.f1441i instanceof k);
    }

    private void B(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        } else {
            this.f1433a = 1;
            this.f1436d = f10;
            this.f1437e = f11;
            this.f1435c = f12;
            this.f1439g = false;
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1433a = 0;
        this.f1436d = -1.0f;
        this.f1437e = -1.0f;
        this.f1435c = -1.0f;
        this.f1438f = new int[0];
        this.f1434b = false;
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1440h, i10);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1441i.getLineSpacingExtra(), this.f1441i.getLineSpacingMultiplier()).setIncludePad(this.f1441i.getIncludeFontPadding()).setBreakStrategy(this.f1441i.getBreakStrategy()).setHyphenationFrequency(this.f1441i.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            obtain.setTextDirection(Build.VERSION.SDK_INT >= 29 ? this.f1441i.getTextDirectionHeuristic() : (TextDirectionHeuristic) o(this.f1441i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f1440h, i10, alignment, this.f1441i.getLineSpacingMultiplier(), this.f1441i.getLineSpacingExtra(), this.f1441i.getIncludeFontPadding());
    }

    private int g(RectF rectF) {
        int length = this.f1438f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                if (z(this.f1438f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i11;
                    i11 = i14;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f1438f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method m(String str) {
        try {
            Method method = f1431l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1431l.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    private static <T> T o(Object obj, String str, T t10) {
        try {
            return (T) m(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    private void u(float f10) {
        if (f10 != this.f1441i.getPaint().getTextSize()) {
            this.f1441i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f1441i.isInLayout();
            if (this.f1441i.getLayout() != null) {
                this.f1434b = false;
                try {
                    Method m10 = m("nullLayouts");
                    if (m10 != null) {
                        m10.invoke(this.f1441i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (isInLayout) {
                    this.f1441i.forceLayout();
                } else {
                    this.f1441i.requestLayout();
                }
                this.f1441i.invalidate();
            }
        }
    }

    private boolean w() {
        if (A() && this.f1433a == 1) {
            if (!this.f1439g || this.f1438f.length == 0) {
                int floor = ((int) Math.floor((this.f1437e - this.f1436d) / this.f1435c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1436d + (i10 * this.f1435c));
                }
                this.f1438f = b(iArr);
            }
            this.f1434b = true;
        } else {
            this.f1434b = false;
        }
        return this.f1434b;
    }

    private void x(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1438f = b(iArr);
            y();
        }
    }

    private boolean y() {
        int[] iArr = this.f1438f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1439g = z10;
        if (z10) {
            this.f1433a = 1;
            this.f1436d = iArr[0];
            this.f1437e = iArr[length - 1];
            this.f1435c = -1.0f;
        }
        return z10;
    }

    private boolean z(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1441i.getText();
        TransformationMethod transformationMethod = this.f1441i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1441i)) != null) {
            text = transformation;
        }
        int maxLines = this.f1441i.getMaxLines();
        n(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) o(this.f1441i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d10.getLineCount() <= maxLines && d10.getLineEnd(d10.getLineCount() - 1) == text.length())) && ((float) d10.getHeight()) <= rectF.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (p()) {
            if (this.f1434b) {
                if (this.f1441i.getMeasuredHeight() <= 0 || this.f1441i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f1441i.isHorizontallyScrollable() : ((Boolean) o(this.f1441i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f1441i.getMeasuredWidth() - this.f1441i.getTotalPaddingLeft()) - this.f1441i.getTotalPaddingRight();
                int height = (this.f1441i.getHeight() - this.f1441i.getCompoundPaddingBottom()) - this.f1441i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1430k;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float g10 = g(rectF);
                    if (g10 != this.f1441i.getTextSize()) {
                        v(0, g10);
                    }
                }
            }
            this.f1434b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return Build.VERSION.SDK_INT >= 23 ? e(charSequence, alignment, i10, i11) : f(charSequence, alignment, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f1437e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return Math.round(this.f1436d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f1435c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] k() {
        return this.f1438f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f1433a;
    }

    void n(int i10) {
        TextPaint textPaint = this.f1440h;
        if (textPaint == null) {
            this.f1440h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1440h.set(this.f1441i.getPaint());
        this.f1440h.setTextSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return A() && this.f1433a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1442j.obtainStyledAttributes(attributeSet, f.j.f8272i0, i10, 0);
        int i11 = f.j.f8297n0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1433a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = f.j.f8292m0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = f.j.f8282k0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = f.j.f8277j0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = f.j.f8287l0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            x(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!A()) {
            this.f1433a = 0;
        } else if (this.f1433a == 1) {
            if (!this.f1439g) {
                DisplayMetrics displayMetrics = this.f1442j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                B(dimension2, dimension3, dimension);
            }
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i10, int i11, int i12, int i13) {
        if (A()) {
            DisplayMetrics displayMetrics = this.f1442j.getResources().getDisplayMetrics();
            B(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (w()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int[] iArr, int i10) {
        if (A()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1442j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1438f = b(iArr2);
                if (!y()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1439g = false;
            }
            if (w()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i10) {
        if (A()) {
            if (i10 == 0) {
                c();
            } else if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            } else {
                DisplayMetrics displayMetrics = this.f1442j.getResources().getDisplayMetrics();
                B(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (w()) {
                    a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i10, float f10) {
        Context context = this.f1442j;
        u(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
