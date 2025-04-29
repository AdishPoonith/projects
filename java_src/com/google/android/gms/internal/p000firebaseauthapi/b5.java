package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b5  reason: invalid package */
/* loaded from: classes.dex */
final class b5 extends w3 implements RandomAccess, d7 {

    /* renamed from: m  reason: collision with root package name */
    private static final b5 f4379m = new b5(new double[0], 0, false);

    /* renamed from: k  reason: collision with root package name */
    private double[] f4380k;

    /* renamed from: l  reason: collision with root package name */
    private int f4381l;

    b5() {
        this(new double[10], 0, true);
    }

    private b5(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f4380k = dArr;
        this.f4381l = i10;
    }

    private final String k(int i10) {
        int i11 = this.f4381l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f4381l) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f4381l)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        double[] dArr = this.f4380k;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f4380k, i10, dArr2, i10 + 1, this.f4381l - i10);
            this.f4380k = dArr2;
        }
        this.f4380k[i10] = doubleValue;
        this.f4381l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = x5.f5628d;
        Objects.requireNonNull(collection);
        if (collection instanceof b5) {
            b5 b5Var = (b5) collection;
            int i10 = b5Var.f4381l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4381l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                double[] dArr = this.f4380k;
                if (i12 > dArr.length) {
                    this.f4380k = Arrays.copyOf(dArr, i12);
                }
                System.arraycopy(b5Var.f4380k, 0, this.f4380k, this.f4381l, b5Var.f4381l);
                this.f4381l = i12;
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

    public final void e(double d10) {
        b();
        int i10 = this.f4381l;
        double[] dArr = this.f4380k;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f4380k = dArr2;
        }
        double[] dArr3 = this.f4380k;
        int i11 = this.f4381l;
        this.f4381l = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b5) {
            b5 b5Var = (b5) obj;
            if (this.f4381l != b5Var.f4381l) {
                return false;
            }
            double[] dArr = b5Var.f4380k;
            for (int i10 = 0; i10 < this.f4381l; i10++) {
                if (Double.doubleToLongBits(this.f4380k[i10]) != Double.doubleToLongBits(dArr[i10])) {
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
        return Double.valueOf(this.f4380k[i10]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4381l; i11++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f4380k[i11]);
            byte[] bArr = x5.f5628d;
            i10 = (i10 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i10 = this.f4381l;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4380k[i11] == doubleValue) {
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
        double[] dArr = this.f4380k;
        double d10 = dArr[i10];
        if (i10 < this.f4381l - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f4381l--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f4380k;
        System.arraycopy(dArr, i11, dArr, i10, this.f4381l - i11);
        this.f4381l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        l(i10);
        double[] dArr = this.f4380k;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4381l;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final /* bridge */ /* synthetic */ w5 zzd(int i10) {
        if (i10 >= this.f4381l) {
            return new b5(Arrays.copyOf(this.f4380k, i10), this.f4381l, true);
        }
        throw new IllegalArgumentException();
    }
}
