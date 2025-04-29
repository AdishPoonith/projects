package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class v1 extends b1 implements RandomAccess, o3 {

    /* renamed from: m  reason: collision with root package name */
    private static final v1 f4260m;

    /* renamed from: k  reason: collision with root package name */
    private double[] f4261k;

    /* renamed from: l  reason: collision with root package name */
    private int f4262l;

    static {
        v1 v1Var = new v1(new double[0], 0);
        f4260m = v1Var;
        v1Var.zzb();
    }

    v1() {
        this(new double[10], 0);
    }

    private v1(double[] dArr, int i10) {
        this.f4261k = dArr;
        this.f4262l = i10;
    }

    private final String k(int i10) {
        int i11 = this.f4262l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f4262l) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f4262l)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        double[] dArr = this.f4261k;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f4261k, i10, dArr2, i10 + 1, this.f4262l - i10);
            this.f4261k = dArr2;
        }
        this.f4261k[i10] = doubleValue;
        this.f4262l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        k2.e(collection);
        if (collection instanceof v1) {
            v1 v1Var = (v1) collection;
            int i10 = v1Var.f4262l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4262l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                double[] dArr = this.f4261k;
                if (i12 > dArr.length) {
                    this.f4261k = Arrays.copyOf(dArr, i12);
                }
                System.arraycopy(v1Var.f4261k, 0, this.f4261k, this.f4262l, v1Var.f4262l);
                this.f4262l = i12;
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
        int i10 = this.f4262l;
        double[] dArr = this.f4261k;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f4261k = dArr2;
        }
        double[] dArr3 = this.f4261k;
        int i11 = this.f4262l;
        this.f4262l = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            if (this.f4262l != v1Var.f4262l) {
                return false;
            }
            double[] dArr = v1Var.f4261k;
            for (int i10 = 0; i10 < this.f4262l; i10++) {
                if (Double.doubleToLongBits(this.f4261k[i10]) != Double.doubleToLongBits(dArr[i10])) {
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
        return Double.valueOf(this.f4261k[i10]);
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4262l; i11++) {
            i10 = (i10 * 31) + k2.c(Double.doubleToLongBits(this.f4261k[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i10 = this.f4262l;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4261k[i11] == doubleValue) {
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
        double[] dArr = this.f4261k;
        double d10 = dArr[i10];
        if (i10 < this.f4262l - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f4262l--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f4261k;
        System.arraycopy(dArr, i11, dArr, i10, this.f4262l - i11);
        this.f4262l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        l(i10);
        double[] dArr = this.f4261k;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4262l;
    }

    @Override // com.google.android.gms.internal.auth.j2
    public final /* bridge */ /* synthetic */ j2 zzd(int i10) {
        if (i10 >= this.f4262l) {
            return new v1(Arrays.copyOf(this.f4261k, i10), this.f4262l);
        }
        throw new IllegalArgumentException();
    }
}
