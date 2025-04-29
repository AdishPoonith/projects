package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class a<T> implements Iterator<T>, ea.a {

    /* renamed from: j  reason: collision with root package name */
    private final T[] f12841j;

    /* renamed from: k  reason: collision with root package name */
    private int f12842k;

    public a(T[] array) {
        l.e(array, "array");
        this.f12841j = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12842k < this.f12841j.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f12841j;
            int i10 = this.f12842k;
            this.f12842k = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f12842k--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
