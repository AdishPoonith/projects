package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n extends c<Double> implements b0.b, RandomAccess, b1 {

    /* renamed from: m  reason: collision with root package name */
    private static final n f6273m;

    /* renamed from: k  reason: collision with root package name */
    private double[] f6274k;

    /* renamed from: l  reason: collision with root package name */
    private int f6275l;

    static {
        n nVar = new n(new double[0], 0);
        f6273m = nVar;
        nVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n() {
        this(new double[10], 0);
    }

    private n(double[] dArr, int i10) {
        this.f6274k = dArr;
        this.f6275l = i10;
    }

    private void m(int i10, double d10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f6275l)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        double[] dArr = this.f6274k;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f6274k, i10, dArr2, i10 + 1, this.f6275l - i10);
            this.f6274k = dArr2;
        }
        this.f6274k[i10] = d10;
        this.f6275l++;
        ((AbstractList) this).modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f6275l) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f6275l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        b();
        b0.a(collection);
        if (collection instanceof n) {
            n nVar = (n) collection;
            int i10 = nVar.f6275l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f6275l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                double[] dArr = this.f6274k;
                if (i12 > dArr.length) {
                    this.f6274k = Arrays.copyOf(dArr, i12);
                }
                System.arraycopy(nVar.f6274k, 0, this.f6274k, this.f6275l, nVar.f6275l);
                this.f6275l = i12;
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
    public void add(int i10, Double d10) {
        m(i10, d10.doubleValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f6275l != nVar.f6275l) {
                return false;
            }
            double[] dArr = nVar.f6274k;
            for (int i10 = 0; i10 < this.f6275l; i10++) {
                if (Double.doubleToLongBits(this.f6274k[i10]) != Double.doubleToLongBits(dArr[i10])) {
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
        for (int i11 = 0; i11 < this.f6275l; i11++) {
            i10 = (i10 * 31) + b0.f(Double.doubleToLongBits(this.f6274k[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6274k[i10] == doubleValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: k */
    public boolean add(Double d10) {
        l(d10.doubleValue());
        return true;
    }

    public void l(double d10) {
        b();
        int i10 = this.f6275l;
        double[] dArr = this.f6274k;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f6274k = dArr2;
        }
        double[] dArr3 = this.f6274k;
        int i11 = this.f6275l;
        this.f6275l = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q */
    public Double get(int i10) {
        return Double.valueOf(r(i10));
    }

    public double r(int i10) {
        p(i10);
        return this.f6274k[i10];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f6274k;
        System.arraycopy(dArr, i11, dArr, i10, this.f6275l - i11);
        this.f6275l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6275l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.i
    /* renamed from: t */
    public b0.b c(int i10) {
        if (i10 >= this.f6275l) {
            return new n(Arrays.copyOf(this.f6274k, i10), this.f6275l);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Double remove(int i10) {
        int i11;
        b();
        p(i10);
        double[] dArr = this.f6274k;
        double d10 = dArr[i10];
        if (i10 < this.f6275l - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f6275l--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Double set(int i10, Double d10) {
        return Double.valueOf(w(i10, d10.doubleValue()));
    }

    public double w(int i10, double d10) {
        b();
        p(i10);
        double[] dArr = this.f6274k;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }
}
