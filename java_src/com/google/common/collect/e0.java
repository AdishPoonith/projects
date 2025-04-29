package com.google.common.collect;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e0 extends h0<Comparable<?>> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    static final e0 f5988j = new e0();

    private e0() {
    }

    private Object readResolve() {
        return f5988j;
    }

    @Override // com.google.common.collect.h0
    public <S extends Comparable<?>> h0<S> d() {
        return m0.f6026j;
    }

    @Override // com.google.common.collect.h0, java.util.Comparator
    /* renamed from: e */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        b5.n.n(comparable);
        b5.n.n(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
