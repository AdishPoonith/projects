package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class c2 extends b1 implements RandomAccess, o3 {

    /* renamed from: m  reason: collision with root package name */
    private static final c2 f4029m;

    /* renamed from: k  reason: collision with root package name */
    private float[] f4030k;

    /* renamed from: l  reason: collision with root package name */
    private int f4031l;

    static {
        c2 c2Var = new c2(new float[0], 0);
        f4029m = c2Var;
        c2Var.zzb();
    }

    c2() {
        this(new float[10], 0);
    }

    private c2(float[] fArr, int i10) {
        this.f4030k = fArr;
        this.f4031l = i10;
    }

    private final String k(int i10) {
        int i11 = this.f4031l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f4031l) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f4031l)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        float[] fArr = this.f4030k;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f4030k, i10, fArr2, i10 + 1, this.f4031l - i10);
            this.f4030k = fArr2;
        }
        this.f4030k[i10] = floatValue;
        this.f4031l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        k2.e(collection);
        if (collection instanceof c2) {
            c2 c2Var = (c2) collection;
            int i10 = c2Var.f4031l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4031l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                float[] fArr = this.f4030k;
                if (i12 > fArr.length) {
                    this.f4030k = Arrays.copyOf(fArr, i12);
                }
                System.arraycopy(c2Var.f4030k, 0, this.f4030k, this.f4031l, c2Var.f4031l);
                this.f4031l = i12;
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

    public final void e(float f10) {
        b();
        int i10 = this.f4031l;
        float[] fArr = this.f4030k;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f4030k = fArr2;
        }
        float[] fArr3 = this.f4030k;
        int i11 = this.f4031l;
        this.f4031l = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c2) {
            c2 c2Var = (c2) obj;
            if (this.f4031l != c2Var.f4031l) {
                return false;
            }
            float[] fArr = c2Var.f4030k;
            for (int i10 = 0; i10 < this.f4031l; i10++) {
                if (Float.floatToIntBits(this.f4030k[i10]) != Float.floatToIntBits(fArr[i10])) {
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
        return Float.valueOf(this.f4030k[i10]);
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4031l; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f4030k[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i10 = this.f4031l;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4030k[i11] == floatValue) {
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
        float[] fArr = this.f4030k;
        float f10 = fArr[i10];
        if (i10 < this.f4031l - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f4031l--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f4030k;
        System.arraycopy(fArr, i11, fArr, i10, this.f4031l - i11);
        this.f4031l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        l(i10);
        float[] fArr = this.f4030k;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4031l;
    }

    @Override // com.google.android.gms.internal.auth.j2
    public final /* bridge */ /* synthetic */ j2 zzd(int i10) {
        if (i10 >= this.f4031l) {
            return new c2(Arrays.copyOf(this.f4030k, i10), this.f4031l);
        }
        throw new IllegalArgumentException();
    }
}
