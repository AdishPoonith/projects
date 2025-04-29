package com.google.common.collect;

import com.google.common.collect.r;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k0<K, V> extends r<K, V> {

    /* renamed from: q  reason: collision with root package name */
    static final r<Object, Object> f6005q = new k0(null, new Object[0], 0);

    /* renamed from: n  reason: collision with root package name */
    private final transient Object f6006n;

    /* renamed from: o  reason: collision with root package name */
    final transient Object[] f6007o;

    /* renamed from: p  reason: collision with root package name */
    private final transient int f6008p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> extends s<Map.Entry<K, V>> {

        /* renamed from: l  reason: collision with root package name */
        private final transient r<K, V> f6009l;

        /* renamed from: m  reason: collision with root package name */
        private final transient Object[] f6010m;

        /* renamed from: n  reason: collision with root package name */
        private final transient int f6011n;

        /* renamed from: o  reason: collision with root package name */
        private final transient int f6012o;

        /* renamed from: com.google.common.collect.k0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0092a extends q<Map.Entry<K, V>> {
            C0092a() {
            }

            @Override // java.util.List
            /* renamed from: F */
            public Map.Entry<K, V> get(int i10) {
                b5.n.l(i10, a.this.f6012o);
                int i11 = i10 * 2;
                Object obj = a.this.f6010m[a.this.f6011n + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f6010m[i11 + (a.this.f6011n ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.o
            public boolean p() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f6012o;
            }
        }

        a(r<K, V> rVar, Object[] objArr, int i10, int i11) {
            this.f6009l = rVar;
            this.f6010m = objArr;
            this.f6011n = i10;
            this.f6012o = i11;
        }

        @Override // com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.f6009l.get(key));
            }
            return false;
        }

        @Override // com.google.common.collect.o
        int e(Object[] objArr, int i10) {
            return b().e(objArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.o
        public boolean p() {
            return true;
        }

        @Override // com.google.common.collect.s, com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: q */
        public s0<Map.Entry<K, V>> iterator() {
            return b().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f6012o;
        }

        @Override // com.google.common.collect.s
        q<Map.Entry<K, V>> v() {
            return new C0092a();
        }
    }

    /* loaded from: classes.dex */
    static final class b<K> extends s<K> {

        /* renamed from: l  reason: collision with root package name */
        private final transient r<K, ?> f6014l;

        /* renamed from: m  reason: collision with root package name */
        private final transient q<K> f6015m;

        b(r<K, ?> rVar, q<K> qVar) {
            this.f6014l = rVar;
            this.f6015m = qVar;
        }

        @Override // com.google.common.collect.s, com.google.common.collect.o
        public q<K> b() {
            return this.f6015m;
        }

        @Override // com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f6014l.get(obj) != null;
        }

        @Override // com.google.common.collect.o
        int e(Object[] objArr, int i10) {
            return b().e(objArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.o
        public boolean p() {
            return true;
        }

        @Override // com.google.common.collect.s, com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: q */
        public s0<K> iterator() {
            return b().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f6014l.size();
        }
    }

    /* loaded from: classes.dex */
    static final class c extends q<Object> {

        /* renamed from: l  reason: collision with root package name */
        private final transient Object[] f6016l;

        /* renamed from: m  reason: collision with root package name */
        private final transient int f6017m;

        /* renamed from: n  reason: collision with root package name */
        private final transient int f6018n;

        c(Object[] objArr, int i10, int i11) {
            this.f6016l = objArr;
            this.f6017m = i10;
            this.f6018n = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            b5.n.l(i10, this.f6018n);
            Object obj = this.f6016l[(i10 * 2) + this.f6017m];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.o
        public boolean p() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6018n;
        }
    }

    private k0(Object obj, Object[] objArr, int i10) {
        this.f6006n = obj;
        this.f6007o = objArr;
        this.f6008p = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> k0<K, V> l(int i10, Object[] objArr, r.a<K, V> aVar) {
        if (i10 == 0) {
            return (k0) f6005q;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            h.a(obj, obj2);
            return new k0<>(null, objArr, 1);
        }
        b5.n.q(i10, objArr.length >> 1);
        Object m10 = m(objArr, i10, s.r(i10), 0);
        if (m10 instanceof Object[]) {
            Object[] objArr2 = (Object[]) m10;
            r.a.C0094a c0094a = (r.a.C0094a) objArr2[2];
            if (aVar == null) {
                throw c0094a.a();
            }
            aVar.f6053e = c0094a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            m10 = obj3;
            i10 = intValue;
        }
        return new k0<>(m10, objArr, i10);
    }

    private static Object m(Object[] objArr, int i10, int i11, int i12) {
        r.a.C0094a c0094a = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            h.a(obj, obj2);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                h.a(obj3, obj4);
                int a10 = n.a(obj3.hashCode());
                while (true) {
                    int i19 = a10 & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                    } else if (obj3.equals(objArr[i20])) {
                        int i21 = i20 ^ 1;
                        Object obj5 = objArr[i21];
                        Objects.requireNonNull(obj5);
                        c0094a = new r.a.C0094a(obj3, obj4, obj5);
                        objArr[i21] = obj4;
                        break;
                    } else {
                        a10 = i19 + 1;
                    }
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c0094a};
        } else if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                h.a(obj6, obj7);
                int a11 = n.a(obj6.hashCode());
                while (true) {
                    int i26 = a11 & i13;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                    } else if (obj6.equals(objArr[i27])) {
                        int i28 = i27 ^ 1;
                        Object obj8 = objArr[i28];
                        Objects.requireNonNull(obj8);
                        c0094a = new r.a.C0094a(obj6, obj7, obj8);
                        objArr[i28] = obj7;
                        break;
                    } else {
                        a11 = i26 + 1;
                    }
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), c0094a};
        } else {
            int[] iArr = new int[i11];
            Arrays.fill(iArr, -1);
            int i29 = 0;
            int i30 = 0;
            while (i29 < i10) {
                int i31 = (i29 * 2) + i12;
                int i32 = (i30 * 2) + i12;
                Object obj9 = objArr[i31];
                Objects.requireNonNull(obj9);
                Object obj10 = objArr[i31 ^ 1];
                Objects.requireNonNull(obj10);
                h.a(obj9, obj10);
                int a12 = n.a(obj9.hashCode());
                while (true) {
                    int i33 = a12 & i13;
                    int i34 = iArr[i33];
                    if (i34 == i14) {
                        iArr[i33] = i32;
                        if (i30 < i29) {
                            objArr[i32] = obj9;
                            objArr[i32 ^ 1] = obj10;
                        }
                        i30++;
                    } else if (obj9.equals(objArr[i34])) {
                        int i35 = i34 ^ 1;
                        Object obj11 = objArr[i35];
                        Objects.requireNonNull(obj11);
                        c0094a = new r.a.C0094a(obj9, obj10, obj11);
                        objArr[i35] = obj10;
                        break;
                    } else {
                        a12 = i33 + 1;
                        i14 = -1;
                    }
                }
                i29++;
                i14 = -1;
            }
            return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), c0094a};
        }
    }

    static Object n(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj2)) {
                Object obj4 = objArr[i11 ^ 1];
                Objects.requireNonNull(obj4);
                return obj4;
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a10 = n.a(obj2.hashCode());
                while (true) {
                    int i12 = a10 & length;
                    int i13 = bArr[i12] & 255;
                    if (i13 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i13])) {
                        return objArr[i13 ^ 1];
                    }
                    a10 = i12 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a11 = n.a(obj2.hashCode());
                while (true) {
                    int i14 = a11 & length2;
                    int i15 = sArr[i14] & 65535;
                    if (i15 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i15])) {
                        return objArr[i15 ^ 1];
                    }
                    a11 = i14 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a12 = n.a(obj2.hashCode());
                while (true) {
                    int i16 = a12 & length3;
                    int i17 = iArr[i16];
                    if (i17 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i17])) {
                        return objArr[i17 ^ 1];
                    }
                    a12 = i16 + 1;
                }
            }
        }
    }

    @Override // com.google.common.collect.r
    s<Map.Entry<K, V>> d() {
        return new a(this, this.f6007o, 0, this.f6008p);
    }

    @Override // com.google.common.collect.r
    s<K> e() {
        return new b(this, new c(this.f6007o, 0, this.f6008p));
    }

    @Override // com.google.common.collect.r
    o<V> f() {
        return new c(this.f6007o, 1, this.f6008p);
    }

    @Override // com.google.common.collect.r, java.util.Map
    public V get(Object obj) {
        V v10 = (V) n(this.f6006n, this.f6007o, this.f6008p, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.r
    boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f6008p;
    }
}
