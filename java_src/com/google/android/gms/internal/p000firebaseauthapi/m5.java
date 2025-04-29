package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m5  reason: invalid package */
/* loaded from: classes.dex */
final class m5 extends w3 implements RandomAccess, d7 {

    /* renamed from: m  reason: collision with root package name */
    private static final m5 f4997m = new m5(new float[0], 0, false);

    /* renamed from: k  reason: collision with root package name */
    private float[] f4998k;

    /* renamed from: l  reason: collision with root package name */
    private int f4999l;

    m5() {
        this(new float[10], 0, true);
    }

    private m5(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f4998k = fArr;
        this.f4999l = i10;
    }

    private final String k(int i10) {
        int i11 = this.f4999l;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f4999l) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f4999l)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        float[] fArr = this.f4998k;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f4998k, i10, fArr2, i10 + 1, this.f4999l - i10);
            this.f4998k = fArr2;
        }
        this.f4998k[i10] = floatValue;
        this.f4999l++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = x5.f5628d;
        Objects.requireNonNull(collection);
        if (collection instanceof m5) {
            m5 m5Var = (m5) collection;
            int i10 = m5Var.f4999l;
            if (i10 == 0) {
                return false;
            }
            int i11 = this.f4999l;
            if (Integer.MAX_VALUE - i11 >= i10) {
                int i12 = i11 + i10;
                float[] fArr = this.f4998k;
                if (i12 > fArr.length) {
                    this.f4998k = Arrays.copyOf(fArr, i12);
                }
                System.arraycopy(m5Var.f4998k, 0, this.f4998k, this.f4999l, m5Var.f4999l);
                this.f4999l = i12;
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
        int i10 = this.f4999l;
        float[] fArr = this.f4998k;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f4998k = fArr2;
        }
        float[] fArr3 = this.f4998k;
        int i11 = this.f4999l;
        this.f4999l = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m5) {
            m5 m5Var = (m5) obj;
            if (this.f4999l != m5Var.f4999l) {
                return false;
            }
            float[] fArr = m5Var.f4998k;
            for (int i10 = 0; i10 < this.f4999l; i10++) {
                if (Float.floatToIntBits(this.f4998k[i10]) != Float.floatToIntBits(fArr[i10])) {
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
        return Float.valueOf(this.f4998k[i10]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4999l; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f4998k[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i10 = this.f4999l;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f4998k[i11] == floatValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        b();
        l(i10);
        float[] fArr = this.f4998k;
        float f10 = fArr[i10];
        if (i10 < this.f4999l - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f4999l--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f4998k;
        System.arraycopy(fArr, i11, fArr, i10, this.f4999l - i11);
        this.f4999l -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        l(i10);
        float[] fArr = this.f4998k;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4999l;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final /* bridge */ /* synthetic */ w5 zzd(int i10) {
        if (i10 >= this.f4999l) {
            return new m5(Arrays.copyOf(this.f4998k, i10), this.f4999l, true);
        }
        throw new IllegalArgumentException();
    }
}
