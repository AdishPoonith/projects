package com.google.common.collect;

import com.google.common.collect.o;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
/* loaded from: classes.dex */
public abstract class r<K, V> implements Map<K, V>, Serializable {

    /* renamed from: m  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f6045m = new Map.Entry[0];

    /* renamed from: j  reason: collision with root package name */
    private transient s<Map.Entry<K, V>> f6046j;

    /* renamed from: k  reason: collision with root package name */
    private transient s<K> f6047k;

    /* renamed from: l  reason: collision with root package name */
    private transient o<V> f6048l;

    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f6049a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f6050b;

        /* renamed from: c  reason: collision with root package name */
        int f6051c;

        /* renamed from: d  reason: collision with root package name */
        boolean f6052d;

        /* renamed from: e  reason: collision with root package name */
        C0094a f6053e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.common.collect.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0094a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f6054a;

            /* renamed from: b  reason: collision with root package name */
            private final Object f6055b;

            /* renamed from: c  reason: collision with root package name */
            private final Object f6056c;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0094a(Object obj, Object obj2, Object obj3) {
                this.f6054a = obj;
                this.f6055b = obj2;
                this.f6056c = obj3;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f6054a + "=" + this.f6055b + " and " + this.f6054a + "=" + this.f6056c);
            }
        }

        public a() {
            this(4);
        }

        a(int i10) {
            this.f6050b = new Object[i10 * 2];
            this.f6051c = 0;
            this.f6052d = false;
        }

        private r<K, V> b(boolean z10) {
            Object[] objArr;
            C0094a c0094a;
            C0094a c0094a2;
            if (!z10 || (c0094a2 = this.f6053e) == null) {
                int i10 = this.f6051c;
                if (this.f6049a == null) {
                    objArr = this.f6050b;
                } else {
                    if (this.f6052d) {
                        this.f6050b = Arrays.copyOf(this.f6050b, i10 * 2);
                    }
                    objArr = this.f6050b;
                    if (!z10) {
                        objArr = e(objArr, this.f6051c);
                        if (objArr.length < this.f6050b.length) {
                            i10 = objArr.length >>> 1;
                        }
                    }
                    i(objArr, i10, this.f6049a);
                }
                this.f6052d = true;
                k0 l10 = k0.l(i10, objArr, this);
                if (!z10 || (c0094a = this.f6053e) == null) {
                    return l10;
                }
                throw c0094a.a();
            }
            throw c0094a2.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f6050b;
            if (i11 > objArr.length) {
                this.f6050b = Arrays.copyOf(objArr, o.b.c(objArr.length, i11));
                this.f6052d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void i(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, h0.a(comparator).c(y.j()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public r<K, V> a() {
            return c();
        }

        public r<K, V> c() {
            return b(true);
        }

        public a<K, V> f(K k10, V v10) {
            d(this.f6051c + 1);
            h.a(k10, v10);
            Object[] objArr = this.f6050b;
            int i10 = this.f6051c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f6051c = i10 + 1;
            return this;
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.f6051c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                g(entry);
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    static class b<K, V> implements Serializable {

        /* renamed from: j  reason: collision with root package name */
        private final Object f6057j;

        /* renamed from: k  reason: collision with root package name */
        private final Object f6058k;

        b(r<K, V> rVar) {
            Object[] objArr = new Object[rVar.size()];
            Object[] objArr2 = new Object[rVar.size()];
            s0<Map.Entry<K, V>> it = rVar.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f6057j = objArr;
            this.f6058k = objArr2;
        }

        final Object a() {
            Object[] objArr = (Object[]) this.f6057j;
            Object[] objArr2 = (Object[]) this.f6058k;
            a<K, V> b10 = b(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                b10.f((K) objArr[i10], (V) objArr2[i10]);
            }
            return b10.c();
        }

        a<K, V> b(int i10) {
            return new a<>(i10);
        }

        final Object readResolve() {
            Object obj = this.f6057j;
            if (obj instanceof s) {
                s sVar = (s) obj;
                a<K, V> b10 = b(sVar.size());
                s0 it = sVar.iterator();
                s0 it2 = ((o) this.f6058k).iterator();
                while (it.hasNext()) {
                    b10.f((K) it.next(), (V) it2.next());
                }
                return b10.c();
            }
            return a();
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> r<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> r<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof r) && !(map instanceof SortedMap)) {
            r<K, V> rVar = (r) map;
            if (!rVar.h()) {
                return rVar;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> r<K, V> j() {
        return (r<K, V>) k0.f6005q;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract s<Map.Entry<K, V>> d();

    abstract s<K> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return y.c(this, obj);
    }

    abstract o<V> f();

    @Override // java.util.Map
    /* renamed from: g */
    public s<Map.Entry<K, V>> entrySet() {
        s<Map.Entry<K, V>> sVar = this.f6046j;
        if (sVar == null) {
            s<Map.Entry<K, V>> d10 = d();
            this.f6046j = d10;
            return d10;
        }
        return sVar;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    abstract boolean h();

    @Override // java.util.Map
    public int hashCode() {
        return p0.d(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i */
    public s<K> keySet() {
        s<K> sVar = this.f6047k;
        if (sVar == null) {
            s<K> e10 = e();
            this.f6047k = e10;
            return e10;
        }
        return sVar;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: k */
    public o<V> values() {
        o<V> oVar = this.f6048l;
        if (oVar == null) {
            o<V> f10 = f();
            this.f6048l = f10;
            return f10;
        }
        return oVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return y.i(this);
    }

    Object writeReplace() {
        return new b(this);
    }
}
