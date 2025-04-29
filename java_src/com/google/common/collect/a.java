package com.google.common.collect;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
abstract class a<E> extends t0<E> {

    /* renamed from: j  reason: collision with root package name */
    private final int f5941j;

    /* renamed from: k  reason: collision with root package name */
    private int f5942k;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i10, int i11) {
        b5.n.q(i11, i10);
        this.f5941j = i10;
        this.f5942k = i11;
    }

    protected abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5942k < this.f5941j;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5942k > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f5942k;
            this.f5942k = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5942k;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f5942k - 1;
            this.f5942k = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5942k - 1;
    }
}
