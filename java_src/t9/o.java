package t9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o {
    public static final <T> Object[] a(T[] tArr, boolean z10) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        if (z10 && kotlin.jvm.internal.l.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.l.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static <T> List<T> b(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        kotlin.jvm.internal.l.d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
