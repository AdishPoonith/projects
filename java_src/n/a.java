package n;

import java.util.HashMap;
import java.util.Map;
import n.b;
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: n  reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f13965n = new HashMap<>();

    public boolean contains(K k10) {
        return this.f13965n.containsKey(k10);
    }

    @Override // n.b
    protected b.c<K, V> e(K k10) {
        return this.f13965n.get(k10);
    }

    @Override // n.b
    public V p(K k10, V v10) {
        b.c<K, V> e10 = e(k10);
        if (e10 != null) {
            return e10.f13971k;
        }
        this.f13965n.put(k10, m(k10, v10));
        return null;
    }

    @Override // n.b
    public V q(K k10) {
        V v10 = (V) super.q(k10);
        this.f13965n.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> r(K k10) {
        if (contains(k10)) {
            return this.f13965n.get(k10).f13973m;
        }
        return null;
    }
}
