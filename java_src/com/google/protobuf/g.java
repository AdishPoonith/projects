package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends c<Boolean> implements d0.a, RandomAccess, g1 {

    /* renamed from: m  reason: collision with root package name */
    private static final g f7120m;

    /* renamed from: k  reason: collision with root package name */
    private boolean[] f7121k;

    /* renamed from: l  reason: collision with root package name */
    private int f7122l;

    static {
        g gVar = new g(new boolean[0], 0);
        f7120m = gVar;
        gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        this(new boolean[10], 0);
    }

    private g(boolean[] zArr, int i10) {
        this.f7121k = zArr;
        this.f7122l = i10;
    }

    private void l(int i10, boolean z10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f7122l)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        boolean[] zArr = this.f7121k;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f7121k, i10, zArr2, i10 + 1, this.f7122l - i10);
            this.f7121k = zArr2;
        }
        this.f7121k[i10] = z10;
        this.f7122l++;
        ((AbstractList) this).modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f7122l) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7122l;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        b();
        d0.a(collection);
        if (collection instanceof g) {
            g gVar = (g) collection;
            int i10 = gVar.f7122l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f7122l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                boolean[] zArr = this.f7121k;
                if (i12 > zArr.length) {
                    this.f7121k = Arrays.copyOf(zArr, i12);
                }
                System.arraycopy(gVar.f7121k, 0, this.f7121k, this.f7122l, gVar.f7122l);
                this.f7122l = i12;
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
    public void add(int i10, Boolean bool) {
        l(i10, bool.booleanValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f7122l != gVar.f7122l) {
                return false;
            }
            boolean[] zArr = gVar.f7121k;
            for (int i10 = 0; i10 < this.f7122l; i10++) {
                if (this.f7121k[i10] != zArr[i10]) {
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
        for (int i11 = 0; i11 < this.f7122l; i11++) {
            i10 = (i10 * 31) + d0.c(this.f7121k[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f7121k[i10] == booleanValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: k */
    public boolean add(Boolean bool) {
        m(bool.booleanValue());
        return true;
    }

    public void m(boolean z10) {
        b();
        int i10 = this.f7122l;
        boolean[] zArr = this.f7121k;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f7121k = zArr2;
        }
        boolean[] zArr3 = this.f7121k;
        int i11 = this.f7122l;
        this.f7122l = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q */
    public Boolean get(int i10) {
        return Boolean.valueOf(r(i10));
    }

    public boolean r(int i10) {
        p(i10);
        return this.f7121k[i10];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f7121k;
        System.arraycopy(zArr, i11, zArr, i10, this.f7122l - i11);
        this.f7122l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7122l;
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: t */
    public d0.a c(int i10) {
        if (i10 >= this.f7122l) {
            return new g(Arrays.copyOf(this.f7121k, i10), this.f7122l);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Boolean remove(int i10) {
        int i11;
        b();
        p(i10);
        boolean[] zArr = this.f7121k;
        boolean z10 = zArr[i10];
        if (i10 < this.f7122l - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f7122l--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(w(i10, bool.booleanValue()));
    }

    public boolean w(int i10, boolean z10) {
        b();
        p(i10);
        boolean[] zArr = this.f7121k;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }
}
