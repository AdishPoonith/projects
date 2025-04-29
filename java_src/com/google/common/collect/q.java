package com.google.common.collect;

import com.google.common.collect.o;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public abstract class q<E> extends o<E> implements List<E>, RandomAccess {

    /* renamed from: k  reason: collision with root package name */
    private static final t0<Object> f6038k = new b(j0.f5998n, 0);

    /* loaded from: classes.dex */
    public static final class a<E> extends o.a<E> {
        public a() {
            this(4);
        }

        a(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.o.b
        /* renamed from: f */
        public a<E> a(E e10) {
            super.d(e10);
            return this;
        }

        public a<E> g(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public q<E> h() {
            this.f6031c = true;
            return q.s(this.f6029a, this.f6030b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<E> extends com.google.common.collect.a<E> {

        /* renamed from: l  reason: collision with root package name */
        private final q<E> f6039l;

        b(q<E> qVar, int i10) {
            super(qVar.size(), i10);
            this.f6039l = qVar;
        }

        @Override // com.google.common.collect.a
        protected E a(int i10) {
            return this.f6039l.get(i10);
        }
    }

    /* loaded from: classes.dex */
    static class c implements Serializable {

        /* renamed from: j  reason: collision with root package name */
        final Object[] f6040j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Object[] objArr) {
            this.f6040j = objArr;
        }

        Object readResolve() {
            return q.w(this.f6040j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends q<E> {

        /* renamed from: l  reason: collision with root package name */
        final transient int f6041l;

        /* renamed from: m  reason: collision with root package name */
        final transient int f6042m;

        d(int i10, int i11) {
            this.f6041l = i10;
            this.f6042m = i11;
        }

        @Override // com.google.common.collect.q, java.util.List
        /* renamed from: D */
        public q<E> subList(int i10, int i11) {
            b5.n.s(i10, i11, this.f6042m);
            q qVar = q.this;
            int i12 = this.f6041l;
            return qVar.subList(i10 + i12, i11 + i12);
        }

        @Override // java.util.List
        public E get(int i10) {
            b5.n.l(i10, this.f6042m);
            return q.this.get(i10 + this.f6041l);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.o
        Object[] k() {
            return q.this.k();
        }

        @Override // com.google.common.collect.o
        int l() {
            return q.this.m() + this.f6041l + this.f6042m;
        }

        @Override // com.google.common.collect.q, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.q, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // com.google.common.collect.o
        int m() {
            return q.this.m() + this.f6041l;
        }

        @Override // com.google.common.collect.o
        boolean p() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6042m;
        }
    }

    public static <E> q<E> A(E e10) {
        return u(e10);
    }

    public static <E> q<E> B(E e10, E e11) {
        return u(e10, e11);
    }

    public static <E> q<E> C(E e10, E e11, E e12, E e13, E e14) {
        return u(e10, e11, e12, e13, e14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> q<E> r(Object[] objArr) {
        return s(objArr, objArr.length);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> q<E> s(Object[] objArr, int i10) {
        return i10 == 0 ? z() : new j0(objArr, i10);
    }

    public static <E> a<E> t() {
        return new a<>();
    }

    private static <E> q<E> u(Object... objArr) {
        return r(g0.b(objArr));
    }

    public static <E> q<E> v(Collection<? extends E> collection) {
        if (collection instanceof o) {
            q<E> b10 = ((o) collection).b();
            return b10.p() ? r(b10.toArray()) : b10;
        }
        return u(collection.toArray());
    }

    public static <E> q<E> w(E[] eArr) {
        return eArr.length == 0 ? z() : u((Object[]) eArr.clone());
    }

    public static <E> q<E> z() {
        return (q<E>) j0.f5998n;
    }

    @Override // java.util.List
    /* renamed from: D */
    public q<E> subList(int i10, int i11) {
        b5.n.s(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? z() : E(i10, i11);
    }

    q<E> E(int i10, int i11) {
        return new d(i10, i11 - i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o
    @Deprecated
    public final q<E> b() {
        return this;
    }

    @Override // com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o
    public int e(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return w.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.f(this, obj);
    }

    @Override // com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q */
    public s0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o
    Object writeReplace() {
        return new c(toArray());
    }

    @Override // java.util.List
    /* renamed from: x */
    public t0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: y */
    public t0<E> listIterator(int i10) {
        b5.n.q(i10, size());
        return isEmpty() ? (t0<E>) f6038k : new b(this, i10);
    }
}
