package d6;

import d6.h;
import java.util.Comparator;
/* loaded from: classes.dex */
public class g<K, V> implements h<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private static final g f7761a = new g();

    private g() {
    }

    public static <K, V> g<K, V> i() {
        return f7761a;
    }

    @Override // d6.h
    public h<K, V> a() {
        return this;
    }

    @Override // d6.h
    public h<K, V> b(K k10, V v10, Comparator<K> comparator) {
        return new i(k10, v10);
    }

    @Override // d6.h
    public boolean c() {
        return false;
    }

    @Override // d6.h
    public h<K, V> d() {
        return this;
    }

    @Override // d6.h
    public h<K, V> e(K k10, Comparator<K> comparator) {
        return this;
    }

    @Override // d6.h
    public h<K, V> f() {
        return this;
    }

    @Override // d6.h
    public h<K, V> g(K k10, V v10, h.a aVar, h<K, V> hVar, h<K, V> hVar2) {
        return this;
    }

    @Override // d6.h
    public K getKey() {
        return null;
    }

    @Override // d6.h
    public V getValue() {
        return null;
    }

    @Override // d6.h
    public h<K, V> h() {
        return this;
    }

    @Override // d6.h
    public boolean isEmpty() {
        return true;
    }

    @Override // d6.h
    public int size() {
        return 0;
    }
}
