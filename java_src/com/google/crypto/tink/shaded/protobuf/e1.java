package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e1<E> extends c<E> implements RandomAccess {

    /* renamed from: m  reason: collision with root package name */
    private static final e1<Object> f6165m;

    /* renamed from: k  reason: collision with root package name */
    private E[] f6166k;

    /* renamed from: l  reason: collision with root package name */
    private int f6167l;

    static {
        e1<Object> e1Var = new e1<>(new Object[0], 0);
        f6165m = e1Var;
        e1Var.a();
    }

    private e1(E[] eArr, int i10) {
        this.f6166k = eArr;
        this.f6167l = i10;
    }

    private static <E> E[] e(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> e1<E> k() {
        return (e1<E>) f6165m;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f6167l) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f6167l;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f6167l)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        E[] eArr = this.f6166k;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) e(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f6166k, 0, eArr2, 0, i10);
            System.arraycopy(this.f6166k, i10, eArr2, i10 + 1, this.f6167l - i10);
            this.f6166k = eArr2;
        }
        this.f6166k[i10] = e10;
        this.f6167l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        b();
        int i10 = this.f6167l;
        E[] eArr = this.f6166k;
        if (i10 == eArr.length) {
            this.f6166k = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f6166k;
        int i11 = this.f6167l;
        this.f6167l = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        l(i10);
        return this.f6166k[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.i
    /* renamed from: p */
    public e1<E> c(int i10) {
        if (i10 >= this.f6167l) {
            return new e1<>(Arrays.copyOf(this.f6166k, i10), this.f6167l);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        b();
        l(i10);
        E[] eArr = this.f6166k;
        E e10 = eArr[i10];
        if (i10 < this.f6167l - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f6167l--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        b();
        l(i10);
        E[] eArr = this.f6166k;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6167l;
    }
}
