package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s5  reason: invalid package */
/* loaded from: classes.dex */
final class s5 extends w3 implements RandomAccess, d7 {

    /* renamed from: m  reason: collision with root package name */
    private static final s5 f5329m = new s5(new int[0], 0, false);

    /* renamed from: k  reason: collision with root package name */
    private int[] f5330k;

    /* renamed from: l  reason: collision with root package name */
    private int f5331l;

    s5() {
        this(new int[10], 0, true);
    }

    private s5(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f5330k = iArr;
        this.f5331l = i10;
    }

    private final String l(int i10) {
        int i11 = this.f5331l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f5331l) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f5331l)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int[] iArr = this.f5330k;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f5330k, i10, iArr2, i10 + 1, this.f5331l - i10);
            this.f5330k = iArr2;
        }
        this.f5330k[i10] = intValue;
        this.f5331l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        k(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = x5.f5628d;
        Objects.requireNonNull(collection);
        if (collection instanceof s5) {
            s5 s5Var = (s5) collection;
            int i10 = s5Var.f5331l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f5331l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                int[] iArr = this.f5330k;
                if (i12 > iArr.length) {
                    this.f5330k = Arrays.copyOf(iArr, i12);
                }
                System.arraycopy(s5Var.f5330k, 0, this.f5330k, this.f5331l, s5Var.f5331l);
                this.f5331l = i12;
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

    public final int e(int i10) {
        m(i10);
        return this.f5330k[i10];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s5) {
            s5 s5Var = (s5) obj;
            if (this.f5331l != s5Var.f5331l) {
                return false;
            }
            int[] iArr = s5Var.f5330k;
            for (int i10 = 0; i10 < this.f5331l; i10++) {
                if (this.f5330k[i10] != iArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Integer.valueOf(this.f5330k[i10]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5331l; i11++) {
            i10 = (i10 * 31) + this.f5330k[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f5331l;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f5330k[i11] == intValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void k(int i10) {
        b();
        int i11 = this.f5331l;
        int[] iArr = this.f5330k;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f5330k = iArr2;
        }
        int[] iArr3 = this.f5330k;
        int i12 = this.f5331l;
        this.f5331l = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        b();
        m(i10);
        int[] iArr = this.f5330k;
        int i12 = iArr[i10];
        if (i10 < this.f5331l - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f5331l--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f5330k;
        System.arraycopy(iArr, i11, iArr, i10, this.f5331l - i11);
        this.f5331l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        m(i10);
        int[] iArr = this.f5330k;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5331l;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final /* bridge */ /* synthetic */ w5 zzd(int i10) {
        if (i10 >= this.f5331l) {
            return new s5(Arrays.copyOf(this.f5330k, i10), this.f5331l, true);
        }
        throw new IllegalArgumentException();
    }
}
