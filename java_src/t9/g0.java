package t9;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g0 extends f0 {
    public static <K, V> Map<K, V> d() {
        a0 a0Var = a0.f18365j;
        kotlin.jvm.internal.l.c(a0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return a0Var;
    }

    public static <K, V> HashMap<K, V> e(s9.m<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.l.e(pairs, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(d0.a(pairs.length));
        j(hashMap, pairs);
        return hashMap;
    }

    public static <K, V> Map<K, V> f(s9.m<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.l.e(pairs, "pairs");
        return pairs.length > 0 ? n(pairs, new LinkedHashMap(d0.a(pairs.length))) : d0.d();
    }

    public static <K, V> Map<K, V> g(s9.m<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.l.e(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.a(pairs.length));
        j(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> h(Map<K, ? extends V> map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : f0.c(map) : d0.d();
    }

    public static final <K, V> void i(Map<? super K, ? super V> map, Iterable<? extends s9.m<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.l.e(map, "<this>");
        kotlin.jvm.internal.l.e(pairs, "pairs");
        for (s9.m<? extends K, ? extends V> mVar : pairs) {
            map.put((K) mVar.a(), (V) mVar.b());
        }
    }

    public static final <K, V> void j(Map<? super K, ? super V> map, s9.m<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.l.e(map, "<this>");
        kotlin.jvm.internal.l.e(pairs, "pairs");
        for (s9.m<? extends K, ? extends V> mVar : pairs) {
            map.put((K) mVar.a(), (V) mVar.b());
        }
    }

    public static <K, V> Map<K, V> k(Iterable<? extends s9.m<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return l(iterable, new LinkedHashMap(d0.a(collection.size())));
                }
                return d0.b(iterable instanceof List ? (s9.m<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            return d0.d();
        }
        return h(l(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M l(Iterable<? extends s9.m<? extends K, ? extends V>> iterable, M destination) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        i(destination, iterable);
        return destination;
    }

    public static <K, V> Map<K, V> m(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? d0.o(map) : f0.c(map) : d0.d();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M n(s9.m<? extends K, ? extends V>[] mVarArr, M destination) {
        kotlin.jvm.internal.l.e(mVarArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        j(destination, mVarArr);
        return destination;
    }

    public static <K, V> Map<K, V> o(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.l.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
