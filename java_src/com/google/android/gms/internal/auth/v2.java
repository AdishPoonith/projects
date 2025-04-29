package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class v2 extends b1 implements RandomAccess, o3 {

    /* renamed from: m  reason: collision with root package name */
    private static final v2 f4263m;

    /* renamed from: k  reason: collision with root package name */
    private long[] f4264k;

    /* renamed from: l  reason: collision with root package name */
    private int f4265l;

    static {
        v2 v2Var = new v2(new long[0], 0);
        f4263m = v2Var;
        v2Var.zzb();
    }

    v2() {
        this(new long[10], 0);
    }

    private v2(long[] jArr, int i10) {
        this.f4264k = jArr;
        this.f4265l = i10;
    }

    private final String k(int i10) {
        int i11 = this.f4265l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f4265l) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f4265l)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        long[] jArr = this.f4264k;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f4264k, i10, jArr2, i10 + 1, this.f4265l - i10);
            this.f4264k = jArr2;
        }
        this.f4264k[i10] = longValue;
        this.f4265l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        k2.e(collection);
        if (collection instanceof v2) {
            v2 v2Var = (v2) collection;
            int i10 = v2Var.f4265l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4265l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                long[] jArr = this.f4264k;
                if (i12 > jArr.length) {
                    this.f4264k = Arrays.copyOf(jArr, i12);
                }
                System.arraycopy(v2Var.f4264k, 0, this.f4264k, this.f4265l, v2Var.f4265l);
                this.f4265l = i12;
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

    public final void e(long j10) {
        b();
        int i10 = this.f4265l;
        long[] jArr = this.f4264k;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f4264k = jArr2;
        }
        long[] jArr3 = this.f4264k;
        int i11 = this.f4265l;
        this.f4265l = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v2) {
            v2 v2Var = (v2) obj;
            if (this.f4265l != v2Var.f4265l) {
                return false;
            }
            long[] jArr = v2Var.f4264k;
            for (int i10 = 0; i10 < this.f4265l; i10++) {
                if (this.f4264k[i10] != jArr[i10]) {
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
        return Long.valueOf(this.f4264k[i10]);
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4265l; i11++) {
            i10 = (i10 * 31) + k2.c(this.f4264k[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i10 = this.f4265l;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4264k[i11] == longValue) {
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
        long[] jArr = this.f4264k;
        long j10 = jArr[i10];
        if (i10 < this.f4265l - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f4265l--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f4264k;
        System.arraycopy(jArr, i11, jArr, i10, this.f4265l - i11);
        this.f4265l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        l(i10);
        long[] jArr = this.f4264k;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4265l;
    }

    @Override // com.google.android.gms.internal.auth.j2
    public final /* bridge */ /* synthetic */ j2 zzd(int i10) {
        if (i10 >= this.f4265l) {
            return new v2(Arrays.copyOf(this.f4264k, i10), this.f4265l);
        }
        throw new IllegalArgumentException();
    }
}
