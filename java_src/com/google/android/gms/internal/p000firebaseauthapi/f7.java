package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f7  reason: invalid package */
/* loaded from: classes.dex */
final class f7 extends w3 implements RandomAccess {

    /* renamed from: m  reason: collision with root package name */
    private static final f7 f4569m = new f7(new Object[0], 0, false);

    /* renamed from: k  reason: collision with root package name */
    private Object[] f4570k;

    /* renamed from: l  reason: collision with root package name */
    private int f4571l;

    private f7(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f4570k = objArr;
        this.f4571l = i10;
    }

    public static f7 e() {
        return f4569m;
    }

    private final String k(int i10) {
        int i11 = this.f4571l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f4571l) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f4571l)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        Object[] objArr = this.f4570k;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f4570k, i10, objArr2, i10 + 1, this.f4571l - i10);
            this.f4570k = objArr2;
        }
        this.f4570k[i10] = obj;
        this.f4571l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f4571l;
        Object[] objArr = this.f4570k;
        if (i10 == objArr.length) {
            this.f4570k = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4570k;
        int i11 = this.f4571l;
        this.f4571l = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        l(i10);
        return this.f4570k[i10];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        b();
        l(i10);
        Object[] objArr = this.f4570k;
        Object obj = objArr[i10];
        if (i10 < this.f4571l - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f4571l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        l(i10);
        Object[] objArr = this.f4570k;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4571l;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final /* bridge */ /* synthetic */ w5 zzd(int i10) {
        if (i10 >= this.f4571l) {
            return new f7(Arrays.copyOf(this.f4570k, i10), this.f4571l, true);
        }
        throw new IllegalArgumentException();
    }
}
