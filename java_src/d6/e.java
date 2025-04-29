package d6;

import d6.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class e<T> implements Iterable<T> {

    /* renamed from: j  reason: collision with root package name */
    private final c<T, Void> f7758j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<T> implements Iterator<T> {

        /* renamed from: j  reason: collision with root package name */
        final Iterator<Map.Entry<T, Void>> f7759j;

        public a(Iterator<Map.Entry<T, Void>> it) {
            this.f7759j = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7759j.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f7759j.next().getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f7759j.remove();
        }
    }

    private e(c<T, Void> cVar) {
        this.f7758j = cVar;
    }

    public e(List<T> list, Comparator<T> comparator) {
        this.f7758j = c.a.b(list, Collections.emptyMap(), c.a.d(), comparator);
    }

    public T b() {
        return this.f7758j.l();
    }

    public boolean contains(T t10) {
        return this.f7758j.b(t10);
    }

    public T e() {
        return this.f7758j.m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f7758j.equals(((e) obj).f7758j);
        }
        return false;
    }

    public int hashCode() {
        return this.f7758j.hashCode();
    }

    public int indexOf(T t10) {
        return this.f7758j.indexOf(t10);
    }

    public boolean isEmpty() {
        return this.f7758j.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f7758j.iterator());
    }

    public e<T> k(T t10) {
        return new e<>(this.f7758j.p(t10, null));
    }

    public Iterator<T> l(T t10) {
        return new a(this.f7758j.q(t10));
    }

    public e<T> m(T t10) {
        c<T, Void> r10 = this.f7758j.r(t10);
        return r10 == this.f7758j ? this : new e<>(r10);
    }

    public e<T> p(e<T> eVar) {
        e<T> eVar2;
        if (size() < eVar.size()) {
            eVar2 = eVar;
            eVar = this;
        } else {
            eVar2 = this;
        }
        Iterator<T> it = eVar.iterator();
        while (it.hasNext()) {
            eVar2 = eVar2.k(it.next());
        }
        return eVar2;
    }

    public int size() {
        return this.f7758j.size();
    }
}
