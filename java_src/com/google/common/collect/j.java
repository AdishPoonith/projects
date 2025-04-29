package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j<T> extends h0<T> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    final Comparator<T> f5997j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Comparator<T> comparator) {
        this.f5997j = (Comparator) b5.n.n(comparator);
    }

    @Override // com.google.common.collect.h0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f5997j.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f5997j.equals(((j) obj).f5997j);
        }
        return false;
    }

    public int hashCode() {
        return this.f5997j.hashCode();
    }

    public String toString() {
        return this.f5997j.toString();
    }
}
