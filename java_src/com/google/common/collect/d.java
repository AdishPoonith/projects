package com.google.common.collect;

import com.google.common.collect.f;
import com.google.common.collect.y;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d<K, V> extends com.google.common.collect.f<K, V> implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private transient Map<K, Collection<V>> f5956m;

    /* renamed from: n  reason: collision with root package name */
    private transient int f5957n;

    /* loaded from: classes.dex */
    class a extends d<K, V>.c<V> {
        a(d dVar) {
            super();
        }

        @Override // com.google.common.collect.d.c
        V a(K k10, V v10) {
            return v10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends y.f<K, Collection<V>> {

        /* renamed from: l  reason: collision with root package name */
        final transient Map<K, Collection<V>> f5958l;

        /* loaded from: classes.dex */
        class a extends y.c<K, Collection<V>> {
            a() {
            }

            @Override // com.google.common.collect.y.c
            Map<K, Collection<V>> b() {
                return b.this;
            }

            @Override // com.google.common.collect.y.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return com.google.common.collect.i.c(b.this.f5958l.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0090b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    Map.Entry entry = (Map.Entry) obj;
                    Objects.requireNonNull(entry);
                    d.this.u(entry.getKey());
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.google.common.collect.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0090b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: j  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f5961j;

            /* renamed from: k  reason: collision with root package name */
            Collection<V> f5962k;

            C0090b() {
                this.f5961j = b.this.f5958l.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f5961j.next();
                this.f5962k = next.getValue();
                return b.this.e(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f5961j.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                b5.n.u(this.f5962k != null, "no calls to next() since the last call to remove()");
                this.f5961j.remove();
                d.m(d.this, this.f5962k.size());
                this.f5962k.clear();
                this.f5962k = null;
            }
        }

        b(Map<K, Collection<V>> map) {
            this.f5958l = map;
        }

        @Override // com.google.common.collect.y.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) y.g(this.f5958l, obj);
            if (collection == null) {
                return null;
            }
            return d.this.x(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f5958l == d.this.f5956m) {
                d.this.clear();
            } else {
                u.c(new C0090b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return y.f(this.f5958l, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f5958l.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> p10 = d.this.p();
            p10.addAll(remove);
            d.m(d.this, remove.size());
            remove.clear();
            return p10;
        }

        Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return y.d(key, d.this.x(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f5958l.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f5958l.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.f();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f5958l.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f5958l.toString();
        }
    }

    /* loaded from: classes.dex */
    private abstract class c<T> implements Iterator<T> {

        /* renamed from: j  reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f5964j;

        /* renamed from: k  reason: collision with root package name */
        K f5965k = null;

        /* renamed from: l  reason: collision with root package name */
        Collection<V> f5966l = null;

        /* renamed from: m  reason: collision with root package name */
        Iterator<V> f5967m = u.f();

        c() {
            this.f5964j = (Iterator<Map.Entry<K, V>>) d.this.f5956m.entrySet().iterator();
        }

        abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5964j.hasNext() || this.f5967m.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f5967m.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f5964j.next();
                this.f5965k = next.getKey();
                Collection<V> value = next.getValue();
                this.f5966l = value;
                this.f5967m = value.iterator();
            }
            return a(f0.a(this.f5965k), this.f5967m.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f5967m.remove();
            Collection<V> collection = this.f5966l;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f5964j.remove();
            }
            d.k(d.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0091d extends y.d<K, Collection<V>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.common.collect.d$d$a */
        /* loaded from: classes.dex */
        public class a implements Iterator<K> {

            /* renamed from: j  reason: collision with root package name */
            Map.Entry<K, Collection<V>> f5970j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ Iterator f5971k;

            a(Iterator it) {
                this.f5971k = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f5971k.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f5971k.next();
                this.f5970j = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                b5.n.u(this.f5970j != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f5970j.getValue();
                this.f5971k.remove();
                d.m(d.this, value.size());
                value.clear();
                this.f5970j = null;
            }
        }

        C0091d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return b().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || b().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return b().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection<V> remove = b().remove(obj);
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                d.m(d.this, i10);
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends d<K, V>.h implements NavigableMap<K, Collection<V>> {
        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = h().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return h().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(h().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return e(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = h().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return e(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return h().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new e(h().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = h().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return e(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return h().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.h
        /* renamed from: i */
        public NavigableSet<K> f() {
            return new f(h());
        }

        @Override // com.google.common.collect.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: j */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // com.google.common.collect.d.h, com.google.common.collect.d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: k */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        Map.Entry<K, Collection<V>> l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (it.hasNext()) {
                Map.Entry<K, Collection<V>> next = it.next();
                Collection<V> p10 = d.this.p();
                p10.addAll(next.getValue());
                it.remove();
                return y.d(next.getKey(), d.this.w(p10));
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return e(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = h().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return h().lowerKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.h
        /* renamed from: m */
        public NavigableMap<K, Collection<V>> h() {
            return (NavigableMap) super.h();
        }

        @Override // com.google.common.collect.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // com.google.common.collect.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new e(h().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new e(h().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends d<K, V>.i implements NavigableSet<K> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return e().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new f(e().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return e().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new f(e().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return e().higherKey(k10);
        }

        @Override // com.google.common.collect.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.i
        /* renamed from: l */
        public NavigableMap<K, Collection<V>> e() {
            return (NavigableMap) super.e();
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return e().lowerKey(k10);
        }

        @Override // com.google.common.collect.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: m */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // com.google.common.collect.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: p */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) u.m(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) u.m(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new f(e().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new f(e().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends d<K, V>.k implements RandomAccess {
        g(d dVar, K k10, List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends d<K, V>.b implements SortedMap<K, Collection<V>> {

        /* renamed from: n  reason: collision with root package name */
        SortedSet<K> f5975n;

        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return h().comparator();
        }

        SortedSet<K> f() {
            return new i(h());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return h().firstKey();
        }

        @Override // com.google.common.collect.d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f5975n;
            if (sortedSet == null) {
                SortedSet<K> f10 = f();
                this.f5975n = f10;
                return f10;
            }
            return sortedSet;
        }

        SortedMap<K, Collection<V>> h() {
            return (SortedMap) this.f5958l;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new h(h().headMap(k10));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new h(h().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new h(h().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class i extends d<K, V>.C0091d implements SortedSet<K> {
        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return e().comparator();
        }

        SortedMap<K, Collection<V>> e() {
            return (SortedMap) super.b();
        }

        @Override // java.util.SortedSet
        public K first() {
            return e().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new i(e().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return e().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new i(e().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new i(e().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j extends AbstractCollection<V> {

        /* renamed from: j  reason: collision with root package name */
        final K f5978j;

        /* renamed from: k  reason: collision with root package name */
        Collection<V> f5979k;

        /* renamed from: l  reason: collision with root package name */
        final d<K, V>.j f5980l;

        /* renamed from: m  reason: collision with root package name */
        final Collection<V> f5981m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Iterator<V> {

            /* renamed from: j  reason: collision with root package name */
            final Iterator<V> f5983j;

            /* renamed from: k  reason: collision with root package name */
            final Collection<V> f5984k;

            a() {
                Collection<V> collection = j.this.f5979k;
                this.f5984k = collection;
                this.f5983j = d.t(collection);
            }

            a(Iterator<V> it) {
                this.f5984k = j.this.f5979k;
                this.f5983j = it;
            }

            Iterator<V> a() {
                c();
                return this.f5983j;
            }

            void c() {
                j.this.m();
                if (j.this.f5979k != this.f5984k) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.f5983j.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                c();
                return this.f5983j.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f5983j.remove();
                d.k(d.this);
                j.this.p();
            }
        }

        j(K k10, Collection<V> collection, d<K, V>.j jVar) {
            this.f5978j = k10;
            this.f5979k = collection;
            this.f5980l = jVar;
            this.f5981m = jVar == null ? null : jVar.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            m();
            boolean isEmpty = this.f5979k.isEmpty();
            boolean add = this.f5979k.add(v10);
            if (add) {
                d.j(d.this);
                if (isEmpty) {
                    b();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f5979k.addAll(collection);
            if (addAll) {
                d.l(d.this, this.f5979k.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        void b() {
            d<K, V>.j jVar = this.f5980l;
            if (jVar != null) {
                jVar.b();
            } else {
                d.this.f5956m.put(this.f5978j, this.f5979k);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f5979k.clear();
            d.m(d.this, size);
            p();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m();
            return this.f5979k.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m();
            return this.f5979k.containsAll(collection);
        }

        d<K, V>.j e() {
            return this.f5980l;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m();
            return this.f5979k.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            m();
            return this.f5979k.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m();
            return new a();
        }

        Collection<V> k() {
            return this.f5979k;
        }

        K l() {
            return this.f5978j;
        }

        void m() {
            Collection<V> collection;
            d<K, V>.j jVar = this.f5980l;
            if (jVar != null) {
                jVar.m();
                if (this.f5980l.k() != this.f5981m) {
                    throw new ConcurrentModificationException();
                }
            } else if (!this.f5979k.isEmpty() || (collection = (Collection) d.this.f5956m.get(this.f5978j)) == null) {
            } else {
                this.f5979k = collection;
            }
        }

        void p() {
            d<K, V>.j jVar = this.f5980l;
            if (jVar != null) {
                jVar.p();
            } else if (this.f5979k.isEmpty()) {
                d.this.f5956m.remove(this.f5978j);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m();
            boolean remove = this.f5979k.remove(obj);
            if (remove) {
                d.k(d.this);
                p();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f5979k.removeAll(collection);
            if (removeAll) {
                d.l(d.this, this.f5979k.size() - size);
                p();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            b5.n.n(collection);
            int size = size();
            boolean retainAll = this.f5979k.retainAll(collection);
            if (retainAll) {
                d.l(d.this, this.f5979k.size() - size);
                p();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m();
            return this.f5979k.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m();
            return this.f5979k.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k extends d<K, V>.j implements List<V> {

        /* loaded from: classes.dex */
        private class a extends d<K, V>.j.a implements ListIterator<V> {
            a() {
                super();
            }

            public a(int i10) {
                super(k.this.q().listIterator(i10));
            }

            private ListIterator<V> d() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean isEmpty = k.this.isEmpty();
                d().add(v10);
                d.j(d.this);
                if (isEmpty) {
                    k.this.b();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                d().set(v10);
            }
        }

        k(K k10, List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            m();
            boolean isEmpty = k().isEmpty();
            q().add(i10, v10);
            d.j(d.this);
            if (isEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = q().addAll(i10, collection);
            if (addAll) {
                d.l(d.this, k().size() - size);
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            m();
            return q().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m();
            return q().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m();
            return q().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            m();
            return new a(i10);
        }

        List<V> q() {
            return (List) k();
        }

        @Override // java.util.List
        public V remove(int i10) {
            m();
            V remove = q().remove(i10);
            d.k(d.this);
            p();
            return remove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            m();
            return q().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            m();
            return d.this.y(l(), q().subList(i10, i11), e() == null ? this : e());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Map<K, Collection<V>> map) {
        b5.n.d(map.isEmpty());
        this.f5956m = map;
    }

    static /* synthetic */ int j(d dVar) {
        int i10 = dVar.f5957n;
        dVar.f5957n = i10 + 1;
        return i10;
    }

    static /* synthetic */ int k(d dVar) {
        int i10 = dVar.f5957n;
        dVar.f5957n = i10 - 1;
        return i10;
    }

    static /* synthetic */ int l(d dVar, int i10) {
        int i11 = dVar.f5957n + i10;
        dVar.f5957n = i11;
        return i11;
    }

    static /* synthetic */ int m(d dVar, int i10) {
        int i11 = dVar.f5957n - i10;
        dVar.f5957n = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> t(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(Object obj) {
        Collection collection = (Collection) y.h(this.f5956m, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f5957n -= size;
        }
    }

    @Override // com.google.common.collect.z
    public void clear() {
        for (Collection<V> collection : this.f5956m.values()) {
            collection.clear();
        }
        this.f5956m.clear();
        this.f5957n = 0;
    }

    @Override // com.google.common.collect.f
    Collection<V> e() {
        return new f.a();
    }

    @Override // com.google.common.collect.f
    Iterator<V> g() {
        return new a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<K, Collection<V>> o() {
        return this.f5956m;
    }

    abstract Collection<V> p();

    @Override // com.google.common.collect.z
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f5956m.get(k10);
        if (collection != null) {
            if (collection.add(v10)) {
                this.f5957n++;
                return true;
            }
            return false;
        }
        Collection<V> q10 = q(k10);
        if (q10.add(v10)) {
            this.f5957n++;
            this.f5956m.put(k10, q10);
            return true;
        }
        throw new AssertionError("New Collection violated the Collection spec");
    }

    Collection<V> q(K k10) {
        return p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, Collection<V>> r() {
        Map<K, Collection<V>> map = this.f5956m;
        return map instanceof NavigableMap ? new e((NavigableMap) this.f5956m) : map instanceof SortedMap ? new h((SortedMap) this.f5956m) : new b(this.f5956m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<K> s() {
        Map<K, Collection<V>> map = this.f5956m;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f5956m) : map instanceof SortedMap ? new i((SortedMap) this.f5956m) : new C0091d(this.f5956m);
    }

    @Override // com.google.common.collect.z
    public int size() {
        return this.f5957n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(Map<K, Collection<V>> map) {
        this.f5956m = map;
        this.f5957n = 0;
        for (Collection<V> collection : map.values()) {
            b5.n.d(!collection.isEmpty());
            this.f5957n += collection.size();
        }
    }

    @Override // com.google.common.collect.f, com.google.common.collect.z
    public Collection<V> values() {
        return super.values();
    }

    abstract <E> Collection<E> w(Collection<E> collection);

    abstract Collection<V> x(K k10, Collection<V> collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<V> y(K k10, List<V> list, d<K, V>.j jVar) {
        return list instanceof RandomAccess ? new g(this, k10, list, jVar) : new k(k10, list, jVar);
    }
}
