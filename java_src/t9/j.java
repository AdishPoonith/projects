package t9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class j extends i {
    public static <T> List<T> b(T[] tArr) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        List<T> a10 = l.a(tArr);
        kotlin.jvm.internal.l.d(a10, "asList(this)");
        return a10;
    }

    public static final <T> T[] c(T[] tArr, T[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return c(objArr, objArr2, i10, i11, i12);
    }

    public static <T> void e(T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void f(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        e(objArr, obj, i10, i11);
    }

    public static <T> T[] g(T[] tArr, T t10) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + 1);
        result[length] = t10;
        kotlin.jvm.internal.l.d(result, "result");
        return result;
    }

    public static <T> void h(T[] tArr) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void i(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        kotlin.jvm.internal.l.e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
