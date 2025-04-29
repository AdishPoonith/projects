package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0 extends c<Integer> implements b0.g, RandomAccess, b1 {

    /* renamed from: m  reason: collision with root package name */
    private static final a0 f6121m;

    /* renamed from: k  reason: collision with root package name */
    private int[] f6122k;

    /* renamed from: l  reason: collision with root package name */
    private int f6123l;

    static {
        a0 a0Var = new a0(new int[0], 0);
        f6121m = a0Var;
        a0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0() {
        this(new int[10], 0);
    }

    private a0(int[] iArr, int i10) {
        this.f6122k = iArr;
        this.f6123l = i10;
    }

    private void m(int i10, int i11) {
        int i12;
        b();
        if (i10 < 0 || i10 > (i12 = this.f6123l)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        int[] iArr = this.f6122k;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f6122k, i10, iArr2, i10 + 1, this.f6123l - i10);
            this.f6122k = iArr2;
        }
        this.f6122k[i10] = i11;
        this.f6123l++;
        ((AbstractList) this).modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f6123l) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f6123l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        b();
        b0.a(collection);
        if (collection instanceof a0) {
            a0 a0Var = (a0) collection;
            int i10 = a0Var.f6123l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f6123l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                int[] iArr = this.f6122k;
                if (i12 > iArr.length) {
                    this.f6122k = Arrays.copyOf(iArr, i12);
                }
                System.arraycopy(a0Var.f6122k, 0, this.f6122k, this.f6123l, a0Var.f6123l);
                this.f6123l = i12;
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

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f6123l != a0Var.f6123l) {
                return false;
            }
            int[] iArr = a0Var.f6122k;
            for (int i10 = 0; i10 < this.f6123l; i10++) {
                if (this.f6122k[i10] != iArr[i10]) {
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
        for (int i11 = 0; i11 < this.f6123l; i11++) {
            i10 = (i10 * 31) + this.f6122k[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6122k[i10] == intValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: k */
    public boolean add(Integer num) {
        l(num.intValue());
        return true;
    }

    public void l(int i10) {
        b();
        int i11 = this.f6123l;
        int[] iArr = this.f6122k;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f6122k = iArr2;
        }
        int[] iArr3 = this.f6122k;
        int i12 = this.f6123l;
        this.f6123l = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q */
    public Integer get(int i10) {
        return Integer.valueOf(r(i10));
    }

    public int r(int i10) {
        p(i10);
        return this.f6122k[i10];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6122k;
        System.arraycopy(iArr, i11, iArr, i10, this.f6123l - i11);
        this.f6123l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6123l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.i
    /* renamed from: t */
    public b0.g c(int i10) {
        if (i10 >= this.f6123l) {
            return new a0(Arrays.copyOf(this.f6122k, i10), this.f6123l);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Integer remove(int i10) {
        int i11;
        b();
        p(i10);
        int[] iArr = this.f6122k;
        int i12 = iArr[i10];
        if (i10 < this.f6123l - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f6123l--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(w(i10, num.intValue()));
    }

    public int w(int i10, int i11) {
        b();
        p(i10);
        int[] iArr = this.f6122k;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }
}
