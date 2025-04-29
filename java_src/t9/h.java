package t9;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
class h {
    public static final <T> T[] a(T[] reference, int i10) {
        kotlin.jvm.internal.l.e(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        kotlin.jvm.internal.l.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }
}
