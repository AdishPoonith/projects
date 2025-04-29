package androidx.core.util;

import java.util.Objects;
/* loaded from: classes.dex */
public final class d {
    public static float a(float f10, String str) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        } else if (Float.isInfinite(f10)) {
            throw new IllegalArgumentException(str + " must not be infinite");
        } else {
            return f10;
        }
    }

    public static int b(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T c(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T d(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
