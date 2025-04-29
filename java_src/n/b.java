package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: j  reason: collision with root package name */
    c<K, V> f13966j;

    /* renamed from: k  reason: collision with root package name */
    private c<K, V> f13967k;

    /* renamed from: l  reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f13968l = new WeakHashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private int f13969m = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f13973m;
        }

        @Override // n.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f13972l;
        }
    }

    /* renamed from: n.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0203b<K, V> extends e<K, V> {
        C0203b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f13972l;
        }

        @Override // n.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f13973m;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: j  reason: collision with root package name */
        final K f13970j;

        /* renamed from: k  reason: collision with root package name */
        final V f13971k;

        /* renamed from: l  reason: collision with root package name */
        c<K, V> f13972l;

        /* renamed from: m  reason: collision with root package name */
        c<K, V> f13973m;

        c(K k10, V v10) {
            this.f13970j = k10;
            this.f13971k = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f13970j.equals(cVar.f13970j) && this.f13971k.equals(cVar.f13971k);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f13970j;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f13971k;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f13970j.hashCode() ^ this.f13971k.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f13970j + "=" + this.f13971k;
        }
    }

    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: j  reason: collision with root package name */
        private c<K, V> f13974j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f13975k = true;

        d() {
        }

        @Override // n.b.f
        void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f13974j;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f13973m;
                this.f13974j = cVar3;
                this.f13975k = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f13975k) {
                this.f13975k = false;
                cVar = b.this.f13966j;
            } else {
                c<K, V> cVar2 = this.f13974j;
                cVar = cVar2 != null ? cVar2.f13972l : null;
            }
            this.f13974j = cVar;
            return this.f13974j;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13975k) {
                return b.this.f13966j != null;
            }
            c<K, V> cVar = this.f13974j;
            return (cVar == null || cVar.f13972l == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: j  reason: collision with root package name */
        c<K, V> f13977j;

        /* renamed from: k  reason: collision with root package name */
        c<K, V> f13978k;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f13977j = cVar2;
            this.f13978k = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f13978k;
            c<K, V> cVar2 = this.f13977j;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // n.b.f
        public void a(c<K, V> cVar) {
            if (this.f13977j == cVar && cVar == this.f13978k) {
                this.f13978k = null;
                this.f13977j = null;
            }
            c<K, V> cVar2 = this.f13977j;
            if (cVar2 == cVar) {
                this.f13977j = c(cVar2);
            }
            if (this.f13978k == cVar) {
                this.f13978k = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f13978k;
            this.f13978k = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13978k != null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        abstract void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> b() {
        return this.f13966j;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0203b c0203b = new C0203b(this.f13967k, this.f13966j);
        this.f13968l.put(c0203b, Boolean.FALSE);
        return c0203b;
    }

    protected c<K, V> e(K k10) {
        c<K, V> cVar = this.f13966j;
        while (cVar != null && !cVar.f13970j.equals(k10)) {
            cVar = cVar.f13972l;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (size() != bVar.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f13966j, this.f13967k);
        this.f13968l.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public b<K, V>.d k() {
        b<K, V>.d dVar = new d();
        this.f13968l.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> l() {
        return this.f13967k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<K, V> m(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f13969m++;
        c<K, V> cVar2 = this.f13967k;
        if (cVar2 == null) {
            this.f13966j = cVar;
        } else {
            cVar2.f13972l = cVar;
            cVar.f13973m = cVar2;
        }
        this.f13967k = cVar;
        return cVar;
    }

    public V p(K k10, V v10) {
        c<K, V> e10 = e(k10);
        if (e10 != null) {
            return e10.f13971k;
        }
        m(k10, v10);
        return null;
    }

    public V q(K k10) {
        c<K, V> e10 = e(k10);
        if (e10 == null) {
            return null;
        }
        this.f13969m--;
        if (!this.f13968l.isEmpty()) {
            for (f<K, V> fVar : this.f13968l.keySet()) {
                fVar.a(e10);
            }
        }
        c<K, V> cVar = e10.f13973m;
        c<K, V> cVar2 = e10.f13972l;
        if (cVar != null) {
            cVar.f13972l = cVar2;
        } else {
            this.f13966j = cVar2;
        }
        c<K, V> cVar3 = e10.f13972l;
        if (cVar3 != null) {
            cVar3.f13973m = cVar;
        } else {
            this.f13967k = cVar;
        }
        e10.f13972l = null;
        e10.f13973m = null;
        return e10.f13971k;
    }

    public int size() {
        return this.f13969m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
