package t9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p extends o {
    public static <T> ArrayList<T> c(T... elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new e(elements, true));
    }

    public static final <T> Collection<T> d(T[] tArr) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        return new e(tArr, false);
    }

    public static <T> List<T> e() {
        return z.f18409j;
    }

    public static <T> int f(List<? extends T> list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> g(T... elements) {
        List<T> e10;
        List<T> b10;
        kotlin.jvm.internal.l.e(elements, "elements");
        if (elements.length > 0) {
            b10 = j.b(elements);
            return b10;
        }
        e10 = e();
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> h(List<? extends T> list) {
        List<T> e10;
        List<T> b10;
        kotlin.jvm.internal.l.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            e10 = e();
            return e10;
        } else if (size != 1) {
            return list;
        } else {
            b10 = o.b(list.get(0));
            return b10;
        }
    }

    public static void i() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
