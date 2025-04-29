package com.google.common.collect;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q0<E> extends s<E> {

    /* renamed from: l  reason: collision with root package name */
    final transient E f6044l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(E e10) {
        this.f6044l = (E) b5.n.n(e10);
    }

    @Override // com.google.common.collect.s, com.google.common.collect.o
    public q<E> b() {
        return q.A(this.f6044l);
    }

    @Override // com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f6044l.equals(obj);
    }

    @Override // com.google.common.collect.o
    int e(Object[] objArr, int i10) {
        objArr[i10] = this.f6044l;
        return i10 + 1;
    }

    @Override // com.google.common.collect.s, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f6044l.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o
    public boolean p() {
        return false;
    }

    @Override // com.google.common.collect.s, com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q */
    public s0<E> iterator() {
        return u.p(this.f6044l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f6044l.toString() + ']';
    }
}
