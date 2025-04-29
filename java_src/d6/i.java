package d6;

import d6.h;
/* loaded from: classes.dex */
public class i<K, V> extends j<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(K k10, V v10) {
        super(k10, v10, g.i(), g.i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        super(k10, v10, hVar, hVar2);
    }

    @Override // d6.h
    public boolean c() {
        return true;
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
        return new i(k10, v10, hVar, hVar2);
    }

    @Override // d6.j
    protected h.a m() {
        return h.a.RED;
    }

    @Override // d6.h
    public int size() {
        return a().size() + 1 + d().size();
    }
}
