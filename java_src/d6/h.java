package d6;

import java.util.Comparator;
/* loaded from: classes.dex */
public interface h<K, V> {

    /* loaded from: classes.dex */
    public enum a {
        RED,
        BLACK
    }

    h<K, V> a();

    h<K, V> b(K k10, V v10, Comparator<K> comparator);

    boolean c();

    h<K, V> d();

    h<K, V> e(K k10, Comparator<K> comparator);

    h<K, V> f();

    h<K, V> g(K k10, V v10, a aVar, h<K, V> hVar, h<K, V> hVar2);

    K getKey();

    V getValue();

    h<K, V> h();

    boolean isEmpty();

    int size();
}
