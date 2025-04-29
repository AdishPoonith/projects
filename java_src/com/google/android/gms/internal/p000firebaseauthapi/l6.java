package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l6  reason: invalid package */
/* loaded from: classes.dex */
final class l6 extends w3 implements RandomAccess, d7 {

    /* renamed from: m  reason: collision with root package name */
    private static final l6 f4932m = new l6(new long[0], 0, false);

    /* renamed from: k  reason: collision with root package name */
    private long[] f4933k;

    /* renamed from: l  reason: collision with root package name */
    private int f4934l;

    l6() {
        this(new long[10], 0, true);
    }

    private l6(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f4933k = jArr;
        this.f4934l = i10;
    }

    private final String l(int i10) {
        int i11 = this.f4934l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f4934l) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f4934l)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        long[] jArr = this.f4933k;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f4933k, i10, jArr2, i10 + 1, this.f4934l - i10);
            this.f4933k = jArr2;
        }
        this.f4933k[i10] = longValue;
        this.f4934l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        k(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = x5.f5628d;
        Objects.requireNonNull(collection);
        if (collection instanceof l6) {
            l6 l6Var = (l6) collection;
            int i10 = l6Var.f4934l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4934l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                long[] jArr = this.f4933k;
                if (i12 > jArr.length) {
                    this.f4933k = Arrays.copyOf(jArr, i12);
                }
                System.arraycopy(l6Var.f4933k, 0, this.f4933k, this.f4934l, l6Var.f4934l);
                this.f4934l = i12;
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

    public final long e(int i10) {
        m(i10);
        return this.f4933k[i10];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l6) {
            l6 l6Var = (l6) obj;
            if (this.f4934l != l6Var.f4934l) {
                return false;
            }
            long[] jArr = l6Var.f4933k;
            for (int i10 = 0; i10 < this.f4934l; i10++) {
                if (this.f4933k[i10] != jArr[i10]) {
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
        return Long.valueOf(this.f4933k[i10]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4934l; i11++) {
            long j10 = this.f4933k[i11];
            byte[] bArr = x5.f5628d;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i10 = this.f4934l;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4933k[i11] == longValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void k(long j10) {
        b();
        int i10 = this.f4934l;
        long[] jArr = this.f4933k;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f4933k = jArr2;
        }
        long[] jArr3 = this.f4933k;
        int i11 = this.f4934l;
        this.f4934l = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        b();
        m(i10);
        long[] jArr = this.f4933k;
        long j10 = jArr[i10];
        if (i10 < this.f4934l - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f4934l--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f4933k;
        System.arraycopy(jArr, i11, jArr, i10, this.f4934l - i11);
        this.f4934l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        m(i10);
        long[] jArr = this.f4933k;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4934l;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final /* bridge */ /* synthetic */ w5 zzd(int i10) {
        if (i10 >= this.f4934l) {
            return new l6(Arrays.copyOf(this.f4933k, i10), this.f4934l, true);
        }
        throw new IllegalArgumentException();
    }
}
