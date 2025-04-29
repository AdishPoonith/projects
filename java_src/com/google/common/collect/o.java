package com.google.common.collect;

import com.google.common.collect.q;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes.dex */
public abstract class o<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    private static final Object[] f6028j = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f6029a;

        /* renamed from: b  reason: collision with root package name */
        int f6030b;

        /* renamed from: c  reason: collision with root package name */
        boolean f6031c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10) {
            h.b(i10, "initialCapacity");
            this.f6029a = new Object[i10];
            this.f6030b = 0;
        }

        private void e(int i10) {
            Object[] objArr = this.f6029a;
            if (objArr.length < i10) {
                this.f6029a = Arrays.copyOf(objArr, b.c(objArr.length, i10));
            } else if (!this.f6031c) {
                return;
            } else {
                this.f6029a = (Object[]) objArr.clone();
            }
            this.f6031c = false;
        }

        @Override // com.google.common.collect.o.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                e(this.f6030b + collection.size());
                if (collection instanceof o) {
                    this.f6030b = ((o) collection).e(this.f6029a, this.f6030b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e10) {
            b5.n.n(e10);
            e(this.f6030b + 1);
            Object[] objArr = this.f6029a;
            int i10 = this.f6030b;
            this.f6030b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<E> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int c(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                if (i12 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        public abstract b<E> a(E e10);

        public b<E> b(Iterable<? extends E> iterable) {
            for (E e10 : iterable) {
                a(e10);
            }
            return this;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public q<E> b() {
        return isEmpty() ? q.z() : q.r(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    int e(Object[] objArr, int i10) {
        s0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] k() {
        return null;
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean p();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q */
    public abstract s0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f6028j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        b5.n.n(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] k10 = k();
            if (k10 != null) {
                return (T[]) i0.a(k10, m(), l(), tArr);
            }
            tArr = (T[]) g0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        e(tArr, 0);
        return tArr;
    }

    Object writeReplace() {
        return new q.c(toArray());
    }
}
