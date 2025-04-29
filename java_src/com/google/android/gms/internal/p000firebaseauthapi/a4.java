package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a4  reason: invalid package */
/* loaded from: classes.dex */
final class a4 extends w3 implements RandomAccess, d7 {

    /* renamed from: m  reason: collision with root package name */
    private static final a4 f4318m = new a4(new boolean[0], 0, false);

    /* renamed from: k  reason: collision with root package name */
    private boolean[] f4319k;

    /* renamed from: l  reason: collision with root package name */
    private int f4320l;

    a4() {
        this(new boolean[10], 0, true);
    }

    private a4(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f4319k = zArr;
        this.f4320l = i10;
    }

    private final String k(int i10) {
        int i11 = this.f4320l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f4320l) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f4320l)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        boolean[] zArr = this.f4319k;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f4319k, i10, zArr2, i10 + 1, this.f4320l - i10);
            this.f4319k = zArr2;
        }
        this.f4319k[i10] = booleanValue;
        this.f4320l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = x5.f5628d;
        Objects.requireNonNull(collection);
        if (collection instanceof a4) {
            a4 a4Var = (a4) collection;
            int i10 = a4Var.f4320l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4320l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                boolean[] zArr = this.f4319k;
                if (i12 > zArr.length) {
                    this.f4319k = Arrays.copyOf(zArr, i12);
                }
                System.arraycopy(a4Var.f4319k, 0, this.f4319k, this.f4320l, a4Var.f4320l);
                this.f4320l = i12;
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

    public final void e(boolean z10) {
        b();
        int i10 = this.f4320l;
        boolean[] zArr = this.f4319k;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f4319k = zArr2;
        }
        boolean[] zArr3 = this.f4319k;
        int i11 = this.f4320l;
        this.f4320l = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a4) {
            a4 a4Var = (a4) obj;
            if (this.f4320l != a4Var.f4320l) {
                return false;
            }
            boolean[] zArr = a4Var.f4319k;
            for (int i10 = 0; i10 < this.f4320l; i10++) {
                if (this.f4319k[i10] != zArr[i10]) {
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
        return Boolean.valueOf(this.f4319k[i10]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4320l; i11++) {
            i10 = (i10 * 31) + x5.a(this.f4319k[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i10 = this.f4320l;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4319k[i11] == booleanValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        b();
        l(i10);
        boolean[] zArr = this.f4319k;
        boolean z10 = zArr[i10];
        if (i10 < this.f4320l - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f4320l--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f4319k;
        System.arraycopy(zArr, i11, zArr, i10, this.f4320l - i11);
        this.f4320l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        l(i10);
        boolean[] zArr = this.f4319k;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4320l;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final /* bridge */ /* synthetic */ w5 zzd(int i10) {
        if (i10 >= this.f4320l) {
            return new a4(Arrays.copyOf(this.f4319k, i10), this.f4320l, true);
        }
        throw new IllegalArgumentException();
    }
}
