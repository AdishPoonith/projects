package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1313a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f1314b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f1315c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f1316d = {16843518};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f1317e = {16842919};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f1318f = {16842912};

    /* renamed from: g  reason: collision with root package name */
    static final int[] f1319g = {16842913};

    /* renamed from: h  reason: collision with root package name */
    static final int[] f1320h = {-16842919, -16842908};

    /* renamed from: i  reason: collision with root package name */
    static final int[] f1321i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f1322j = new int[1];

    public static int a(Context context, int i10) {
        ColorStateList d10 = d(context, i10);
        if (d10 == null || !d10.isStateful()) {
            TypedValue e10 = e();
            context.getTheme().resolveAttribute(16842803, e10, true);
            return c(context, i10, e10.getFloat());
        }
        return d10.getColorForState(f1314b, d10.getDefaultColor());
    }

    public static int b(Context context, int i10) {
        int[] iArr = f1322j;
        iArr[0] = i10;
        v0 s10 = v0.s(context, null, iArr);
        try {
            return s10.b(0, 0);
        } finally {
            s10.u();
        }
    }

    static int c(Context context, int i10, float f10) {
        int b10 = b(context, i10);
        return androidx.core.graphics.a.f(b10, Math.round(Color.alpha(b10) * f10));
    }

    public static ColorStateList d(Context context, int i10) {
        int[] iArr = f1322j;
        iArr[0] = i10;
        v0 s10 = v0.s(context, null, iArr);
        try {
            return s10.c(0);
        } finally {
            s10.u();
        }
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f1313a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
