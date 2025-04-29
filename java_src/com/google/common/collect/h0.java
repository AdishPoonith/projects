package com.google.common.collect;

import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class h0<T> implements Comparator<T> {
    public static <T> h0<T> a(Comparator<T> comparator) {
        return comparator instanceof h0 ? (h0) comparator : new j(comparator);
    }

    public static <C extends Comparable> h0<C> b() {
        return e0.f5988j;
    }

    public <F> h0<F> c(b5.f<F, ? extends T> fVar) {
        return new g(fVar, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    public <S extends T> h0<S> d() {
        return new n0(this);
    }
}
