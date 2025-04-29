package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: q  reason: collision with root package name */
    f<K, V> f16802q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0249a extends f<K, V> {
        C0249a() {
        }

        @Override // s.f
        protected void a() {
            a.this.clear();
        }

        @Override // s.f
        protected Object b(int i10, int i11) {
            return a.this.f16851k[(i10 << 1) + i11];
        }

        @Override // s.f
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // s.f
        protected int d() {
            return a.this.f16852l;
        }

        @Override // s.f
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // s.f
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // s.f
        protected void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        @Override // s.f
        protected void h(int i10) {
            a.this.j(i10);
        }

        @Override // s.f
        protected V i(int i10, V v10) {
            return a.this.k(i10, v10);
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    private f<K, V> m() {
        if (this.f16802q == null) {
            this.f16802q = new C0249a();
        }
        return this.f16802q;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m().m();
    }

    public boolean n(Collection<?> collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f16852l + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m().n();
    }
}
