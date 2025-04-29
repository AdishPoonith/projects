package com.google.common.collect;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l0<E> extends s<E> {

    /* renamed from: q  reason: collision with root package name */
    private static final Object[] f6019q;

    /* renamed from: r  reason: collision with root package name */
    static final l0<Object> f6020r;

    /* renamed from: l  reason: collision with root package name */
    final transient Object[] f6021l;

    /* renamed from: m  reason: collision with root package name */
    private final transient int f6022m;

    /* renamed from: n  reason: collision with root package name */
    final transient Object[] f6023n;

    /* renamed from: o  reason: collision with root package name */
    private final transient int f6024o;

    /* renamed from: p  reason: collision with root package name */
    private final transient int f6025p;

    static {
        Object[] objArr = new Object[0];
        f6019q = objArr;
        f6020r = new l0<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f6021l = objArr;
        this.f6022m = i10;
        this.f6023n = objArr2;
        this.f6024o = i11;
        this.f6025p = i12;
    }

    @Override // com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f6023n;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b10 = n.b(obj);
        while (true) {
            int i10 = b10 & this.f6024o;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b10 = i10 + 1;
        }
    }

    @Override // com.google.common.collect.o
    int e(Object[] objArr, int i10) {
        System.arraycopy(this.f6021l, 0, objArr, i10, this.f6025p);
        return i10 + this.f6025p;
    }

    @Override // com.google.common.collect.s, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f6022m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o
    public Object[] k() {
        return this.f6021l;
    }

    @Override // com.google.common.collect.o
    int l() {
        return this.f6025p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o
    public int m() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o
    public boolean p() {
        return false;
    }

    @Override // com.google.common.collect.s, com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q */
    public s0<E> iterator() {
        return b().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f6025p;
    }

    @Override // com.google.common.collect.s
    q<E> v() {
        return q.s(this.f6021l, this.f6025p);
    }

    @Override // com.google.common.collect.s
    boolean w() {
        return true;
    }
}
