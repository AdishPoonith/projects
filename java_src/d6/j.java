package d6;

import d6.h;
import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class j<K, V> implements h<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final K f7765a;

    /* renamed from: b  reason: collision with root package name */
    private final V f7766b;

    /* renamed from: c  reason: collision with root package name */
    private h<K, V> f7767c;

    /* renamed from: d  reason: collision with root package name */
    private final h<K, V> f7768d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        this.f7765a = k10;
        this.f7766b = v10;
        this.f7767c = hVar == null ? g.i() : hVar;
        this.f7768d = hVar2 == null ? g.i() : hVar2;
    }

    private j<K, V> i() {
        h<K, V> hVar = this.f7767c;
        h<K, V> g10 = hVar.g(null, null, p(hVar), null, null);
        h<K, V> hVar2 = this.f7768d;
        return g(null, null, p(this), g10, hVar2.g(null, null, p(hVar2), null, null));
    }

    private j<K, V> l() {
        j<K, V> r10 = (!this.f7768d.c() || this.f7767c.c()) ? this : r();
        if (r10.f7767c.c() && ((j) r10.f7767c).f7767c.c()) {
            r10 = r10.s();
        }
        return (r10.f7767c.c() && r10.f7768d.c()) ? r10.i() : r10;
    }

    private j<K, V> n() {
        j<K, V> i10 = i();
        return i10.d().a().c() ? i10.k(null, null, null, ((j) i10.d()).s()).r().i() : i10;
    }

    private j<K, V> o() {
        j<K, V> i10 = i();
        return i10.a().a().c() ? i10.s().i() : i10;
    }

    private static h.a p(h hVar) {
        return hVar.c() ? h.a.BLACK : h.a.RED;
    }

    private h<K, V> q() {
        if (this.f7767c.isEmpty()) {
            return g.i();
        }
        j<K, V> n10 = (a().c() || a().a().c()) ? this : n();
        return n10.k(null, null, ((j) n10.f7767c).q(), null).l();
    }

    private j<K, V> r() {
        return (j) this.f7768d.g(null, null, m(), g(null, null, h.a.RED, null, ((j) this.f7768d).f7767c), null);
    }

    private j<K, V> s() {
        return (j) this.f7767c.g(null, null, m(), null, g(null, null, h.a.RED, ((j) this.f7767c).f7768d, null));
    }

    @Override // d6.h
    public h<K, V> a() {
        return this.f7767c;
    }

    @Override // d6.h
    public h<K, V> b(K k10, V v10, Comparator<K> comparator) {
        int compare = comparator.compare(k10, this.f7765a);
        return (compare < 0 ? k(null, null, this.f7767c.b(k10, v10, comparator), null) : compare == 0 ? k(k10, v10, null, null) : k(null, null, null, this.f7768d.b(k10, v10, comparator))).l();
    }

    @Override // d6.h
    public h<K, V> d() {
        return this.f7768d;
    }

    @Override // d6.h
    public h<K, V> e(K k10, Comparator<K> comparator) {
        j<K, V> k11;
        if (comparator.compare(k10, this.f7765a) < 0) {
            j<K, V> n10 = (this.f7767c.isEmpty() || this.f7767c.c() || ((j) this.f7767c).f7767c.c()) ? this : n();
            k11 = n10.k(null, null, n10.f7767c.e(k10, comparator), null);
        } else {
            j<K, V> s10 = this.f7767c.c() ? s() : this;
            if (!s10.f7768d.isEmpty() && !s10.f7768d.c() && !((j) s10.f7768d).f7767c.c()) {
                s10 = s10.o();
            }
            if (comparator.compare(k10, s10.f7765a) == 0) {
                if (s10.f7768d.isEmpty()) {
                    return g.i();
                }
                h<K, V> f10 = s10.f7768d.f();
                s10 = s10.k(f10.getKey(), f10.getValue(), null, ((j) s10.f7768d).q());
            }
            k11 = s10.k(null, null, null, s10.f7768d.e(k10, comparator));
        }
        return k11.l();
    }

    @Override // d6.h
    public h<K, V> f() {
        return this.f7767c.isEmpty() ? this : this.f7767c.f();
    }

    @Override // d6.h
    public K getKey() {
        return this.f7765a;
    }

    @Override // d6.h
    public V getValue() {
        return this.f7766b;
    }

    @Override // d6.h
    public h<K, V> h() {
        return this.f7768d.isEmpty() ? this : this.f7768d.h();
    }

    @Override // d6.h
    public boolean isEmpty() {
        return false;
    }

    @Override // d6.h
    /* renamed from: j */
    public j<K, V> g(K k10, V v10, h.a aVar, h<K, V> hVar, h<K, V> hVar2) {
        if (k10 == null) {
            k10 = this.f7765a;
        }
        if (v10 == null) {
            v10 = this.f7766b;
        }
        if (hVar == null) {
            hVar = this.f7767c;
        }
        if (hVar2 == null) {
            hVar2 = this.f7768d;
        }
        return aVar == h.a.RED ? new i(k10, v10, hVar, hVar2) : new f(k10, v10, hVar, hVar2);
    }

    protected abstract j<K, V> k(K k10, V v10, h<K, V> hVar, h<K, V> hVar2);

    protected abstract h.a m();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(h<K, V> hVar) {
        this.f7767c = hVar;
    }
}
