package com.google.protobuf;

import com.google.protobuf.v;
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
public class q1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: j  reason: collision with root package name */
    private final int f7286j;

    /* renamed from: k  reason: collision with root package name */
    private List<q1<K, V>.e> f7287k;

    /* renamed from: l  reason: collision with root package name */
    private Map<K, V> f7288l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7289m;

    /* renamed from: n  reason: collision with root package name */
    private volatile q1<K, V>.g f7290n;

    /* renamed from: o  reason: collision with root package name */
    private Map<K, V> f7291o;

    /* renamed from: p  reason: collision with root package name */
    private volatile q1<K, V>.c f7292p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* loaded from: classes.dex */
    public static class a<FieldDescriptorType> extends q1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.q1
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

        @Override // com.google.protobuf.q1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((v.b) obj, obj2);
        }
    }

    /* loaded from: classes.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: j  reason: collision with root package name */
        private int f7293j;

        /* renamed from: k  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f7294k;

        private b() {
            this.f7293j = q1.this.f7287k.size();
        }

        /* synthetic */ b(q1 q1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f7294k == null) {
                this.f7294k = q1.this.f7291o.entrySet().iterator();
            }
            return this.f7294k;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (a().hasNext()) {
                entry = a().next();
            } else {
                List list = q1.this.f7287k;
                int i10 = this.f7293j - 1;
                this.f7293j = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f7293j;
            return (i10 > 0 && i10 <= q1.this.f7287k.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends q1<K, V>.g {
        private c() {
            super(q1.this, null);
        }

        /* synthetic */ c(q1 q1Var, a aVar) {
            this();
        }

        @Override // com.google.protobuf.q1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(q1.this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private static final Iterator<Object> f7297a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f7298b = new b();

        /* loaded from: classes.dex */
        static class a implements Iterator<Object> {
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
        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f7297a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f7298b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<q1<K, V>.e> {

        /* renamed from: j  reason: collision with root package name */
        private final K f7299j;

        /* renamed from: k  reason: collision with root package name */
        private V f7300k;

        e(K k10, V v10) {
            this.f7299j = k10;
            this.f7300k = v10;
        }

        e(q1 q1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean g(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(q1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return g(this.f7299j, entry.getKey()) && g(this.f7300k, entry.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f7300k;
        }

        @Override // java.util.Map.Entry
        /* renamed from: h */
        public K getKey() {
            return this.f7299j;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f7299j;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f7300k;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            q1.this.g();
            V v11 = this.f7300k;
            this.f7300k = v10;
            return v11;
        }

        public String toString() {
            return this.f7299j + "=" + this.f7300k;
        }
    }

    /* loaded from: classes.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: j  reason: collision with root package name */
        private int f7302j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f7303k;

        /* renamed from: l  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f7304l;

        private f() {
            this.f7302j = -1;
        }

        /* synthetic */ f(q1 q1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f7304l == null) {
                this.f7304l = q1.this.f7288l.entrySet().iterator();
            }
            return this.f7304l;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f7303k = true;
            int i10 = this.f7302j + 1;
            this.f7302j = i10;
            return i10 < q1.this.f7287k.size() ? (Map.Entry<K, V>) q1.this.f7287k.get(this.f7302j) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f7302j + 1 >= q1.this.f7287k.size()) {
                return !q1.this.f7288l.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f7303k) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f7303k = false;
            q1.this.g();
            if (this.f7302j >= q1.this.f7287k.size()) {
                a().remove();
                return;
            }
            q1 q1Var = q1.this;
            int i10 = this.f7302j;
            this.f7302j = i10 - 1;
            q1Var.s(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(q1 q1Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            q1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = q1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(q1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                q1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q1.this.size();
        }
    }

    private q1(int i10) {
        this.f7286j = i10;
        this.f7287k = Collections.emptyList();
        this.f7288l = Collections.emptyMap();
        this.f7291o = Collections.emptyMap();
    }

    /* synthetic */ q1(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f7287k.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f7287k.get(size).getKey());
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
            int compareTo2 = k10.compareTo(this.f7287k.get(i11).getKey());
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
        if (this.f7289m) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f7287k.isEmpty() || (this.f7287k instanceof ArrayList)) {
            return;
        }
        this.f7287k = new ArrayList(this.f7286j);
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f7288l.isEmpty() && !(this.f7288l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7288l = treeMap;
            this.f7291o = treeMap.descendingMap();
        }
        return (SortedMap) this.f7288l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends v.b<FieldDescriptorType>> q1<FieldDescriptorType, Object> q(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V s(int i10) {
        g();
        V value = this.f7287k.remove(i10).getValue();
        if (!this.f7288l.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f7287k.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f7287k.isEmpty()) {
            this.f7287k.clear();
        }
        if (this.f7288l.isEmpty()) {
            return;
        }
        this.f7288l.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f7288l.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f7290n == null) {
            this.f7290n = new g(this, null);
        }
        return this.f7290n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            int size = size();
            if (size != q1Var.size()) {
                return false;
            }
            int k10 = k();
            if (k10 != q1Var.k()) {
                return entrySet().equals(q1Var.entrySet());
            }
            for (int i10 = 0; i10 < k10; i10++) {
                if (!j(i10).equals(q1Var.j(i10))) {
                    return false;
                }
            }
            if (k10 != size) {
                return this.f7288l.equals(q1Var.f7288l);
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
        return f10 >= 0 ? this.f7287k.get(f10).getValue() : this.f7288l.get(comparable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> h() {
        if (this.f7292p == null) {
            this.f7292p = new c(this, null);
        }
        return this.f7292p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k10 = k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            i10 += this.f7287k.get(i11).hashCode();
        }
        return l() > 0 ? i10 + this.f7288l.hashCode() : i10;
    }

    public Map.Entry<K, V> j(int i10) {
        return this.f7287k.get(i10);
    }

    public int k() {
        return this.f7287k.size();
    }

    public int l() {
        return this.f7288l.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f7288l.isEmpty() ? d.b() : this.f7288l.entrySet();
    }

    public boolean o() {
        return this.f7289m;
    }

    public void p() {
        if (this.f7289m) {
            return;
        }
        this.f7288l = this.f7288l.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7288l);
        this.f7291o = this.f7291o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7291o);
        this.f7289m = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: r */
    public V put(K k10, V v10) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f7287k.get(f10).setValue(v10);
        }
        i();
        int i10 = -(f10 + 1);
        if (i10 >= this.f7286j) {
            return n().put(k10, v10);
        }
        int size = this.f7287k.size();
        int i11 = this.f7286j;
        if (size == i11) {
            q1<K, V>.e remove = this.f7287k.remove(i11 - 1);
            n().put((K) remove.getKey(), remove.getValue());
        }
        this.f7287k.add(i10, new e(k10, v10));
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
        if (this.f7288l.isEmpty()) {
            return null;
        }
        return this.f7288l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f7287k.size() + this.f7288l.size();
    }
}
