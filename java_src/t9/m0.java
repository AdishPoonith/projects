package t9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m0 extends l0 {
    public static <T> Set<T> b() {
        return b0.f18369j;
    }

    public static <T> HashSet<T> c(T... elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        return (HashSet) k.N(elements, new HashSet(d0.a(elements.length)));
    }

    public static <T> Set<T> d(T... elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        return (Set) k.N(elements, new LinkedHashSet(d0.a(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> e(Set<? extends T> set) {
        kotlin.jvm.internal.l.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : l0.a(set.iterator().next()) : k0.b();
    }

    public static <T> Set<T> f(T... elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        return elements.length > 0 ? k.d0(elements) : k0.b();
    }
}
