package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends c<Float> implements b0.f, RandomAccess, b1 {

    /* renamed from: m  reason: collision with root package name */
    private static final x f6431m;

    /* renamed from: k  reason: collision with root package name */
    private float[] f6432k;

    /* renamed from: l  reason: collision with root package name */
    private int f6433l;

    static {
        x xVar = new x(new float[0], 0);
        f6431m = xVar;
        xVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x() {
        this(new float[10], 0);
    }

    private x(float[] fArr, int i10) {
        this.f6432k = fArr;
        this.f6433l = i10;
    }

    private void m(int i10, float f10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f6433l)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        float[] fArr = this.f6432k;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f6432k, i10, fArr2, i10 + 1, this.f6433l - i10);
            this.f6432k = fArr2;
        }
        this.f6432k[i10] = f10;
        this.f6433l++;
        ((AbstractList) this).modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f6433l) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f6433l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        b();
        b0.a(collection);
        if (collection instanceof x) {
            x xVar = (x) collection;
            int i10 = xVar.f6433l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f6433l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                float[] fArr = this.f6432k;
                if (i12 > fArr.length) {
                    this.f6432k = Arrays.copyOf(fArr, i12);
                }
                System.arraycopy(xVar.f6432k, 0, this.f6432k, this.f6433l, xVar.f6433l);
                this.f6433l = i12;
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
    public void add(int i10, Float f10) {
        m(i10, f10.floatValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f6433l != xVar.f6433l) {
                return false;
            }
            float[] fArr = xVar.f6432k;
            for (int i10 = 0; i10 < this.f6433l; i10++) {
                if (Float.floatToIntBits(this.f6432k[i10]) != Float.floatToIntBits(fArr[i10])) {
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
        for (int i11 = 0; i11 < this.f6433l; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f6432k[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6432k[i10] == floatValue) {
                    return i10;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: k */
    public boolean add(Float f10) {
        l(f10.floatValue());
        return true;
    }

    public void l(float f10) {
        b();
        int i10 = this.f6433l;
        float[] fArr = this.f6432k;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f6432k = fArr2;
        }
        float[] fArr3 = this.f6432k;
        int i11 = this.f6433l;
        this.f6433l = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q */
    public Float get(int i10) {
        return Float.valueOf(r(i10));
    }

    public float r(int i10) {
        p(i10);
        return this.f6432k[i10];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f6432k;
        System.arraycopy(fArr, i11, fArr, i10, this.f6433l - i11);
        this.f6433l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6433l;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.i
    /* renamed from: t */
    public b0.f c(int i10) {
        if (i10 >= this.f6433l) {
            return new x(Arrays.copyOf(this.f6432k, i10), this.f6433l);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Float remove(int i10) {
        int i11;
        b();
        p(i10);
        float[] fArr = this.f6432k;
        float f10 = fArr[i10];
        if (i10 < this.f6433l - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f6433l--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Float set(int i10, Float f10) {
        return Float.valueOf(w(i10, f10.floatValue()));
    }

    public float w(int i10, float f10) {
        b();
        p(i10);
        float[] fArr = this.f6432k;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }
}
