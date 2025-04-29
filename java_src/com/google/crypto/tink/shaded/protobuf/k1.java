package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.v;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: j  reason: collision with root package name */
    private final int f6234j;

    /* renamed from: k  reason: collision with root package name */
    private List<k1<K, V>.e> f6235k;

    /* renamed from: l  reason: collision with root package name */
    private Map<K, V> f6236l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6237m;

    /* renamed from: n  reason: collision with root package name */
    private volatile k1<K, V>.g f6238n;

    /* renamed from: o  reason: collision with root package name */
    private Map<K, V> f6239o;

    /* renamed from: p  reason: collision with root package name */
    private volatile k1<K, V>.c f6240p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* loaded from: classes.dex */
    public class a<FieldDescriptorType> extends k1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k1
        public void p() {
            if (!o()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> j10 = j(i10);
                    if (((v.b) j10.getKey()).c()) {
                        j10.setValue(Collections.unmodifiableList((List) j10.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                    if (((v.b) entry.getKey()).c()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.p();
        }
    }

    /* loaded from: classes.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: j  reason: collision with root package name */
        private int f6241j;

        /* renamed from: k  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f6242k;

        private b() {
            this.f6241j = k1.this.f6235k.size();
        }

        /* synthetic */ b(k1 k1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f6242k == null) {
                this.f6242k = k1.this.f6239o.entrySet().iterator();
            }
            return this.f6242k;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (a().hasNext()) {
                entry = a().next();
            } else {
                List list = k1.this.f6235k;
                int i10 = this.f6241j - 1;
                this.f6241j = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f6241j;
            return (i10 > 0 && i10 <= k1.this.f6235k.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    private class c extends k1<K, V>.g {
        private c() {
            super(k1.this, null);
        }

        /* synthetic */ c(k1 k1Var, a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(k1.this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private static final Iterator<Object> f6245a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f6246b = new b();

        /* loaded from: classes.dex */
        class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* loaded from: classes.dex */
        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f6245a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f6246b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<k1<K, V>.e> {

        /* renamed from: j  reason: collision with root package name */
        private final K f6247j;

        /* renamed from: k  reason: collision with root package name */
        private V f6248k;

        e(K k10, V v10) {
            this.f6247j = k10;
            this.f6248k = v10;
        }

        e(k1 k1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean g(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(k1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return g(this.f6247j, entry.getKey()) && g(this.f6248k, entry.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f6248k;
        }

        @Override // java.util.Map.Entry
        /* renamed from: h */
        public K getKey() {
            return this.f6247j;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f6247j;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f6248k;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            k1.this.g();
            V v11 = this.f6248k;
            this.f6248k = v10;
            return v11;
        }

        public String toString() {
            return this.f6247j + "=" + this.f6248k;
        }
    }

    /* loaded from: classes.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: j  reason: collision with root package name */
        private int f6250j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f6251k;

        /* renamed from: l  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f6252l;

        private f() {
            this.f6250j = -1;
        }

        /* synthetic */ f(k1 k1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f6252l == null) {
                this.f6252l = k1.this.f6236l.entrySet().iterator();
            }
            return this.f6252l;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f6251k = true;
            int i10 = this.f6250j + 1;
            this.f6250j = i10;
            return i10 < k1.this.f6235k.size() ? (Map.Entry<K, V>) k1.this.f6235k.get(this.f6250j) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6250j + 1 >= k1.this.f6235k.size()) {
                return !k1.this.f6236l.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f6251k) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f6251k = false;
            k1.this.g();
            if (this.f6250j >= k1.this.f6235k.size()) {
                a().remove();
                return;
            }
            k1 k1Var = k1.this;
            int i10 = this.f6250j;
            this.f6250j = i10 - 1;
            k1Var.s(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(k1 k1Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            k1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = k1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(k1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                k1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k1.this.size();
        }
    }

    private k1(int i10) {
        this.f6234j = i10;
        this.f6235k = Collections.emptyList();
        this.f6236l = Collections.emptyMap();
        this.f6239o = Collections.emptyMap();
    }

    /* synthetic */ k1(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f6235k.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f6235k.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f6235k.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f6237m) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f6235k.isEmpty() || (this.f6235k instanceof ArrayList)) {
            return;
        }
        this.f6235k = new ArrayList(this.f6234j);
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f6236l.isEmpty() && !(this.f6236l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6236l = treeMap;
            this.f6239o = treeMap.descendingMap();
        }
        return (SortedMap) this.f6236l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends v.b<FieldDescriptorType>> k1<FieldDescriptorType, Object> q(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V s(int i10) {
        g();
        V value = this.f6235k.remove(i10).getValue();
        if (!this.f6236l.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f6235k.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f6235k.isEmpty()) {
            this.f6235k.clear();
        }
        if (this.f6236l.isEmpty()) {
            return;
        }
        this.f6236l.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f6236l.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f6238n == null) {
            this.f6238n = new g(this, null);
        }
        return this.f6238n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            int size = size();
            if (size != k1Var.size()) {
                return false;
            }
            int k10 = k();
            if (k10 != k1Var.k()) {
                return entrySet().equals(k1Var.entrySet());
            }
            for (int i10 = 0; i10 < k10; i10++) {
                if (!j(i10).equals(k1Var.j(i10))) {
                    return false;
                }
            }
            if (k10 != size) {
                return this.f6236l.equals(k1Var.f6236l);
            }
            return true;
        }
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? this.f6235k.get(f10).getValue() : this.f6236l.get(comparable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> h() {
        if (this.f6240p == null) {
            this.f6240p = new c(this, null);
        }
        return this.f6240p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k10 = k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            i10 += this.f6235k.get(i11).hashCode();
        }
        return l() > 0 ? i10 + this.f6236l.hashCode() : i10;
    }

    public Map.Entry<K, V> j(int i10) {
        return this.f6235k.get(i10);
    }

    public int k() {
        return this.f6235k.size();
    }

    public int l() {
        return this.f6236l.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f6236l.isEmpty() ? d.b() : this.f6236l.entrySet();
    }

    public boolean o() {
        return this.f6237m;
    }

    public void p() {
        if (this.f6237m) {
            return;
        }
        this.f6236l = this.f6236l.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f6236l);
        this.f6239o = this.f6239o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f6239o);
        this.f6237m = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: r */
    public V put(K k10, V v10) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f6235k.get(f10).setValue(v10);
        }
        i();
        int i10 = -(f10 + 1);
        if (i10 >= this.f6234j) {
            return n().put(k10, v10);
        }
        int size = this.f6235k.size();
        int i11 = this.f6234j;
        if (size == i11) {
            k1<K, V>.e remove = this.f6235k.remove(i11 - 1);
            n().put((K) remove.getKey(), remove.getValue());
        }
        this.f6235k.add(i10, new e(k10, v10));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return (V) s(f10);
        }
        if (this.f6236l.isEmpty()) {
            return null;
        }
        return this.f6236l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f6235k.size() + this.f6236l.size();
    }
}
