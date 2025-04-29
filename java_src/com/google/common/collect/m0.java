package com.google.common.collect;

import java.io.Serializable;
/* loaded from: classes.dex */
final class m0 extends h0<Comparable<?>> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    static final m0 f6026j = new m0();

    private m0() {
    }

    private Object readResolve() {
        return f6026j;
    }

    @Override // com.google.common.collect.h0
    public <S extends Comparable<?>> h0<S> d() {
        return h0.b();
    }

    @Override // com.google.common.collect.h0, java.util.Comparator
    /* renamed from: e */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        b5.n.n(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
