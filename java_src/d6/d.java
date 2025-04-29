package d6;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public class d<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque<j<K, V>> f7756j = new ArrayDeque<>();

    /* renamed from: k  reason: collision with root package name */
    private final boolean f7757k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(h<K, V> hVar, K k10, Comparator<K> comparator, boolean z10) {
        int i10;
        this.f7757k = z10;
        while (!hVar.isEmpty()) {
            if (k10 != null) {
                K key = hVar.getKey();
                i10 = z10 ? comparator.compare(k10, key) : comparator.compare(key, k10);
            } else {
                i10 = 1;
            }
            if (i10 < 0) {
                hVar = z10 ? hVar.a() : hVar.d();
            } else if (i10 == 0) {
                this.f7756j.push((j) hVar);
                return;
            } else {
                this.f7756j.push((j) hVar);
                if (z10) {
                }
            }
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public Map.Entry<K, V> next() {
        try {
            j<K, V> pop = this.f7756j.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.getKey(), pop.getValue());
            if (this.f7757k) {
                for (h<K, V> a10 = pop.a(); !a10.isEmpty(); a10 = a10.d()) {
                    this.f7756j.push((j) a10);
                }
            } else {
                for (h<K, V> d10 = pop.d(); !d10.isEmpty(); d10 = d10.a()) {
                    this.f7756j.push((j) d10);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7756j.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
