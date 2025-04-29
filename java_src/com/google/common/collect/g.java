package com.google.common.collect;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g<F, T> extends h0<F> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    final b5.f<F, ? extends T> f5993j;

    /* renamed from: k  reason: collision with root package name */
    final h0<T> f5994k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(b5.f<F, ? extends T> fVar, h0<T> h0Var) {
        this.f5993j = (b5.f) b5.n.n(fVar);
        this.f5994k = (h0) b5.n.n(h0Var);
    }

    @Override // com.google.common.collect.h0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f5994k.compare(this.f5993j.apply(f10), this.f5993j.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f5993j.equals(gVar.f5993j) && this.f5994k.equals(gVar.f5994k);
        }
        return false;
    }

    public int hashCode() {
        return b5.j.b(this.f5993j, this.f5994k);
    }

    public String toString() {
        return this.f5994k + ".onResultOf(" + this.f5993j + ")";
    }
}
