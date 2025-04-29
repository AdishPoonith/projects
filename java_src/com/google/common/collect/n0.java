package com.google.common.collect;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n0<T> extends h0<T> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    final h0<? super T> f6027j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(h0<? super T> h0Var) {
        this.f6027j = (h0) b5.n.n(h0Var);
    }

    @Override // com.google.common.collect.h0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f6027j.compare(t11, t10);
    }

    @Override // com.google.common.collect.h0
    public <S extends T> h0<S> d() {
        return (h0<? super T>) this.f6027j;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n0) {
            return this.f6027j.equals(((n0) obj).f6027j);
        }
        return false;
    }

    public int hashCode() {
        return -this.f6027j.hashCode();
    }

    public String toString() {
        return this.f6027j + ".reverse()";
    }
}
