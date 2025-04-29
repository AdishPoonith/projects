package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j1<E> extends c<E> implements RandomAccess {

    /* renamed from: m  reason: collision with root package name */
    private static final j1<Object> f7215m;

    /* renamed from: k  reason: collision with root package name */
    private E[] f7216k;

    /* renamed from: l  reason: collision with root package name */
    private int f7217l;

    static {
        j1<Object> j1Var = new j1<>(new Object[0], 0);
        f7215m = j1Var;
        j1Var.a();
    }

    private j1(E[] eArr, int i10) {
        this.f7216k = eArr;
        this.f7217l = i10;
    }

    private static <E> E[] e(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> j1<E> k() {
        return (j1<E>) f7215m;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f7217l) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7217l;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f7217l)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        E[] eArr = this.f7216k;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) e(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f7216k, 0, eArr2, 0, i10);
            System.arraycopy(this.f7216k, i10, eArr2, i10 + 1, this.f7217l - i10);
            this.f7216k = eArr2;
        }
        this.f7216k[i10] = e10;
        this.f7217l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        b();
        int i10 = this.f7217l;
        E[] eArr = this.f7216k;
        if (i10 == eArr.length) {
            this.f7216k = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f7216k;
        int i11 = this.f7217l;
        this.f7217l = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        l(i10);
        return this.f7216k[i10];
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: p */
    public j1<E> c(int i10) {
        if (i10 >= this.f7217l) {
            return new j1<>(Arrays.copyOf(this.f7216k, i10), this.f7217l);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        b();
        l(i10);
        E[] eArr = this.f7216k;
        E e10 = eArr[i10];
        if (i10 < this.f7217l - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f7217l--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        b();
        l(i10);
        E[] eArr = this.f7216k;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7217l;
    }
}
