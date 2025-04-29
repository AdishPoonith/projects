package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0 extends c<Integer> implements d0.g, RandomAccess, g1 {

    /* renamed from: m  reason: collision with root package name */
    private static final c0 f7080m;

    /* renamed from: k  reason: collision with root package name */
    private int[] f7081k;

    /* renamed from: l  reason: collision with root package name */
    private int f7082l;

    static {
        c0 c0Var = new c0(new int[0], 0);
        f7080m = c0Var;
        c0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0() {
        this(new int[10], 0);
    }

    private c0(int[] iArr, int i10) {
        this.f7081k = iArr;
        this.f7082l = i10;
    }

    private void m(int i10, int i11) {
        int i12;
        b();
        if (i10 < 0 || i10 > (i12 = this.f7082l)) {
            throw new IndexOutOfBoundsException(t(i10));
        }
        int[] iArr = this.f7081k;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f7081k, i10, iArr2, i10 + 1, this.f7082l - i10);
            this.f7081k = iArr2;
        }
        this.f7081k[i10] = i11;
        this.f7082l++;
        ((AbstractList) this).modCount++;
    }

    public static c0 p() {
        return f7080m;
    }

    private void q(int i10) {
        if (i10 < 0 || i10 >= this.f7082l) {
            throw new IndexOutOfBoundsException(t(i10));
        }
    }

    private String t(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7082l;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        b();
        d0.a(collection);
        if (collection instanceof c0) {
            c0 c0Var = (c0) collection;
            int i10 = c0Var.f7082l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f7082l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                int[] iArr = this.f7081k;
                if (i12 > iArr.length) {
                    this.f7081k = Arrays.copyOf(iArr, i12);
                }
                System.arraycopy(c0Var.f7081k, 0, this.f7081k, this.f7082l, c0Var.f7082l);
                this.f7082l = i12;
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
    public void add(int i10, Integer num) {
        m(i10, num.intValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f7082l != c0Var.f7082l) {
                return false;
            }
            int[] iArr = c0Var.f7081k;
            for (int i10 = 0; i10 < this.f7082l; i10++) {
                if (this.f7081k[i10] != iArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7082l; i11++) {
            i10 = (i10 * 31) + this.f7081k[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f7081k[i10] == intValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: k */
    public boolean add(Integer num) {
        l(num.intValue());
        return true;
    }

    public void l(int i10) {
        b();
        int i11 = this.f7082l;
        int[] iArr = this.f7081k;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f7081k = iArr2;
        }
        int[] iArr3 = this.f7081k;
        int i12 = this.f7082l;
        this.f7082l = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r */
    public Integer get(int i10) {
        return Integer.valueOf(s(i10));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f7081k;
        System.arraycopy(iArr, i11, iArr, i10, this.f7082l - i11);
        this.f7082l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public int s(int i10) {
        q(i10);
        return this.f7081k[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7082l;
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: u */
    public d0.g c(int i10) {
        if (i10 >= this.f7082l) {
            return new c0(Arrays.copyOf(this.f7081k, i10), this.f7082l);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Integer remove(int i10) {
        int i11;
        b();
        q(i10);
        int[] iArr = this.f7081k;
        int i12 = iArr[i10];
        if (i10 < this.f7082l - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f7082l--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(x(i10, num.intValue()));
    }

    public int x(int i10, int i11) {
        b();
        q(i10);
        int[] iArr = this.f7081k;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }
}
