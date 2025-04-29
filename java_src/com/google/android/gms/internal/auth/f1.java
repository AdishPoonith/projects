package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class f1 extends b1 implements RandomAccess, o3 {

    /* renamed from: m  reason: collision with root package name */
    private static final f1 f4047m;

    /* renamed from: k  reason: collision with root package name */
    private boolean[] f4048k;

    /* renamed from: l  reason: collision with root package name */
    private int f4049l;

    static {
        f1 f1Var = new f1(new boolean[0], 0);
        f4047m = f1Var;
        f1Var.zzb();
    }

    f1() {
        this(new boolean[10], 0);
    }

    private f1(boolean[] zArr, int i10) {
        this.f4048k = zArr;
        this.f4049l = i10;
    }

    private final String k(int i10) {
        int i11 = this.f4049l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f4049l) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f4049l)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        boolean[] zArr = this.f4048k;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f4048k, i10, zArr2, i10 + 1, this.f4049l - i10);
            this.f4048k = zArr2;
        }
        this.f4048k[i10] = booleanValue;
        this.f4049l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        k2.e(collection);
        if (collection instanceof f1) {
            f1 f1Var = (f1) collection;
            int i10 = f1Var.f4049l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4049l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                boolean[] zArr = this.f4048k;
                if (i12 > zArr.length) {
                    this.f4048k = Arrays.copyOf(zArr, i12);
                }
                System.arraycopy(f1Var.f4048k, 0, this.f4048k, this.f4049l, f1Var.f4049l);
                this.f4049l = i12;
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
        int i10 = this.f4049l;
        boolean[] zArr = this.f4048k;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f4048k = zArr2;
        }
        boolean[] zArr3 = this.f4048k;
        int i11 = this.f4049l;
        this.f4049l = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f4049l != f1Var.f4049l) {
                return false;
            }
            boolean[] zArr = f1Var.f4048k;
            for (int i10 = 0; i10 < this.f4049l; i10++) {
                if (this.f4048k[i10] != zArr[i10]) {
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
        return Boolean.valueOf(this.f4048k[i10]);
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4049l; i11++) {
            i10 = (i10 * 31) + k2.a(this.f4048k[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i10 = this.f4049l;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4048k[i11] == booleanValue) {
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
        boolean[] zArr = this.f4048k;
        boolean z10 = zArr[i10];
        if (i10 < this.f4049l - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f4049l--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f4048k;
        System.arraycopy(zArr, i11, zArr, i10, this.f4049l - i11);
        this.f4049l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        l(i10);
        boolean[] zArr = this.f4048k;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4049l;
    }

    @Override // com.google.android.gms.internal.auth.j2
    public final /* bridge */ /* synthetic */ j2 zzd(int i10) {
        if (i10 >= this.f4049l) {
            return new f1(Arrays.copyOf(this.f4048k, i10), this.f4049l);
        }
        throw new IllegalArgumentException();
    }
}
