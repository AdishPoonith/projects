package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class q3 extends b1 implements RandomAccess {

    /* renamed from: m  reason: collision with root package name */
    private static final q3 f4228m;

    /* renamed from: k  reason: collision with root package name */
    private Object[] f4229k;

    /* renamed from: l  reason: collision with root package name */
    private int f4230l;

    static {
        q3 q3Var = new q3(new Object[0], 0);
        f4228m = q3Var;
        q3Var.zzb();
    }

    private q3(Object[] objArr, int i10) {
        this.f4229k = objArr;
        this.f4230l = i10;
    }

    public static q3 e() {
        return f4228m;
    }

    private final String k(int i10) {
        int i11 = this.f4230l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f4230l) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f4230l)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        Object[] objArr = this.f4229k;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f4229k, i10, objArr2, i10 + 1, this.f4230l - i10);
            this.f4229k = objArr2;
        }
        this.f4229k[i10] = obj;
        this.f4230l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f4230l;
        Object[] objArr = this.f4229k;
        if (i10 == objArr.length) {
            this.f4229k = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4229k;
        int i11 = this.f4230l;
        this.f4230l = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        l(i10);
        return this.f4229k[i10];
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        b();
        l(i10);
        Object[] objArr = this.f4229k;
        Object obj = objArr[i10];
        if (i10 < this.f4230l - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f4230l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        l(i10);
        Object[] objArr = this.f4229k;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4230l;
    }

    @Override // com.google.android.gms.internal.auth.j2
    public final /* bridge */ /* synthetic */ j2 zzd(int i10) {
        if (i10 >= this.f4230l) {
            return new q3(Arrays.copyOf(this.f4229k, i10), this.f4230l);
        }
        throw new IllegalArgumentException();
    }
}
