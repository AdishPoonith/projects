package com.google.common.collect;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j0<E> extends q<E> {

    /* renamed from: n  reason: collision with root package name */
    static final q<Object> f5998n = new j0(new Object[0], 0);

    /* renamed from: l  reason: collision with root package name */
    final transient Object[] f5999l;

    /* renamed from: m  reason: collision with root package name */
    private final transient int f6000m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(Object[] objArr, int i10) {
        this.f5999l = objArr;
        this.f6000m = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.q, com.google.common.collect.o
    public int e(Object[] objArr, int i10) {
        System.arraycopy(this.f5999l, 0, objArr, i10, this.f6000m);
        return i10 + this.f6000m;
    }

    @Override // java.util.List
    public E get(int i10) {
        b5.n.l(i10, this.f6000m);
        E e10 = (E) this.f5999l[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o
    public Object[] k() {
        return this.f5999l;
    }

    @Override // com.google.common.collect.o
    int l() {
        return this.f6000m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o
    public int m() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o
    public boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6000m;
    }
}
