package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class h2 extends b1 implements RandomAccess, o3 {

    /* renamed from: m  reason: collision with root package name */
    private static final h2 f4062m;

    /* renamed from: k  reason: collision with root package name */
    private int[] f4063k;

    /* renamed from: l  reason: collision with root package name */
    private int f4064l;

    static {
        h2 h2Var = new h2(new int[0], 0);
        f4062m = h2Var;
        h2Var.zzb();
    }

    h2() {
        this(new int[10], 0);
    }

    private h2(int[] iArr, int i10) {
        this.f4063k = iArr;
        this.f4064l = i10;
    }

    private final String k(int i10) {
        int i11 = this.f4064l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f4064l) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f4064l)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int[] iArr = this.f4063k;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f4063k, i10, iArr2, i10 + 1, this.f4064l - i10);
            this.f4063k = iArr2;
        }
        this.f4063k[i10] = intValue;
        this.f4064l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        k2.e(collection);
        if (collection instanceof h2) {
            h2 h2Var = (h2) collection;
            int i10 = h2Var.f4064l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4064l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                int[] iArr = this.f4063k;
                if (i12 > iArr.length) {
                    this.f4063k = Arrays.copyOf(iArr, i12);
                }
                System.arraycopy(h2Var.f4063k, 0, this.f4063k, this.f4064l, h2Var.f4064l);
                this.f4064l = i12;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i10) {
        b();
        int i11 = this.f4064l;
        int[] iArr = this.f4063k;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f4063k = iArr2;
        }
        int[] iArr3 = this.f4063k;
        int i12 = this.f4064l;
        this.f4064l = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h2) {
            h2 h2Var = (h2) obj;
            if (this.f4064l != h2Var.f4064l) {
                return false;
            }
            int[] iArr = h2Var.f4063k;
            for (int i10 = 0; i10 < this.f4064l; i10++) {
                if (this.f4063k[i10] != iArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Integer.valueOf(this.f4063k[i10]);
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4064l; i11++) {
            i10 = (i10 * 31) + this.f4063k[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f4064l;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4063k[i11] == intValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        b();
        l(i10);
        int[] iArr = this.f4063k;
        int i12 = iArr[i10];
        if (i10 < this.f4064l - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f4064l--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f4063k;
        System.arraycopy(iArr, i11, iArr, i10, this.f4064l - i11);
        this.f4064l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        l(i10);
        int[] iArr = this.f4063k;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4064l;
    }

    @Override // com.google.android.gms.internal.auth.j2
    public final /* bridge */ /* synthetic */ j2 zzd(int i10) {
        if (i10 >= this.f4064l) {
            return new h2(Arrays.copyOf(this.f4063k, i10), this.f4064l);
        }
        throw new IllegalArgumentException();
    }
}
