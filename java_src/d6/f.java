package d6;

import d6.h;
/* loaded from: classes.dex */
public class f<K, V> extends j<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private int f7760e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        super(k10, v10, hVar, hVar2);
        this.f7760e = -1;
    }

    @Override // d6.h
    public boolean c() {
        return false;
    }

    @Override // d6.j
    protected j<K, V> k(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        if (k10 == null) {
            k10 = getKey();
        }
        if (v10 == null) {
            v10 = getValue();
        }
        if (hVar == null) {
            hVar = a();
        }
        if (hVar2 == null) {
            hVar2 = d();
        }
        return new f(k10, v10, hVar, hVar2);
    }

    @Override // d6.j
    protected h.a m() {
        return h.a.BLACK;
    }

    @Override // d6.h
    public int size() {
        if (this.f7760e == -1) {
            this.f7760e = a().size() + 1 + d().size();
        }
        return this.f7760e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // d6.j
    public void t(h<K, V> hVar) {
        if (this.f7760e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.t(hVar);
    }
}
