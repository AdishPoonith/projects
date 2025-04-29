package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j0 extends c<Long> implements b0.h, RandomAccess, b1 {

    /* renamed from: m  reason: collision with root package name */
    private static final j0 f6220m;

    /* renamed from: k  reason: collision with root package name */
    private long[] f6221k;

    /* renamed from: l  reason: collision with root package name */
    private int f6222l;

    static {
        j0 j0Var = new j0(new long[0], 0);
        f6220m = j0Var;
        j0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0() {
        this(new long[10], 0);
    }

    private j0(long[] jArr, int i10) {
        this.f6221k = jArr;
        this.f6222l = i10;
    }

    private void l(int i10, long j10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f6222l)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        long[] jArr = this.f6221k;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f6221k, i10, jArr2, i10 + 1, this.f6222l - i10);
            this.f6221k = jArr2;
        }
        this.f6221k[i10] = j10;
        this.f6222l++;
        ((AbstractList) this).modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f6222l) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f6222l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        b();
        b0.a(collection);
        if (collection instanceof j0) {
            j0 j0Var = (j0) collection;
            int i10 = j0Var.f6222l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f6222l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                long[] jArr = this.f6221k;
                if (i12 > jArr.length) {
                    this.f6221k = Arrays.copyOf(jArr, i12);
                }
                System.arraycopy(j0Var.f6221k, 0, this.f6221k, this.f6222l, j0Var.f6222l);
                this.f6222l = i12;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public void add(int i10, Long l10) {
        l(i10, l10.longValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (this.f6222l != j0Var.f6222l) {
                return false;
            }
            long[] jArr = j0Var.f6221k;
            for (int i10 = 0; i10 < this.f6222l; i10++) {
                if (this.f6221k[i10] != jArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f6222l; i11++) {
            i10 = (i10 * 31) + b0.f(this.f6221k[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6221k[i10] == longValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: k */
    public boolean add(Long l10) {
        m(l10.longValue());
        return true;
    }

    public void m(long j10) {
        b();
        int i10 = this.f6222l;
        long[] jArr = this.f6221k;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f6221k = jArr2;
        }
        long[] jArr3 = this.f6221k;
        int i11 = this.f6222l;
        this.f6222l = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q */
    public Long get(int i10) {
        return Long.valueOf(r(i10));
    }

    public long r(int i10) {
        p(i10);
        return this.f6221k[i10];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f6221k;
        System.arraycopy(jArr, i11, jArr, i10, this.f6222l - i11);
        this.f6222l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6222l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.i
    /* renamed from: t */
    public b0.h c(int i10) {
        if (i10 >= this.f6222l) {
            return new j0(Arrays.copyOf(this.f6221k, i10), this.f6222l);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Long remove(int i10) {
        int i11;
        b();
        p(i10);
        long[] jArr = this.f6221k;
        long j10 = jArr[i10];
        if (i10 < this.f6222l - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f6222l--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Long set(int i10, Long l10) {
        return Long.valueOf(w(i10, l10.longValue()));
    }

    public long w(int i10, long j10) {
        b();
        p(i10);
        long[] jArr = this.f6221k;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }
}
