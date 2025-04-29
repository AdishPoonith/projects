package com.google.android.gms.internal.auth;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f4 extends AbstractMap {

    /* renamed from: j  reason: collision with root package name */
    private final int f4050j;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4053m;

    /* renamed from: n  reason: collision with root package name */
    private volatile d4 f4054n;

    /* renamed from: k  reason: collision with root package name */
    private List f4051k = Collections.emptyList();

    /* renamed from: l  reason: collision with root package name */
    private Map f4052l = Collections.emptyMap();

    /* renamed from: o  reason: collision with root package name */
    private Map f4055o = Collections.emptyMap();

    private final int k(Comparable comparable) {
        int size = this.f4051k.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((z3) this.f4051k.get(size)).b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((z3) this.f4051k.get(i11)).b());
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
    public final Object l(int i10) {
        n();
        Object value = ((z3) this.f4051k.remove(i10)).getValue();
        if (!this.f4052l.isEmpty()) {
            Iterator it = m().entrySet().iterator();
            List list = this.f4051k;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new z3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap m() {
        n();
        if (this.f4052l.isEmpty() && !(this.f4052l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4052l = treeMap;
            this.f4055o = treeMap.descendingMap();
        }
        return (SortedMap) this.f4052l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f4053m) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f4053m) {
            return;
        }
        this.f4052l = this.f4052l.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4052l);
        this.f4055o = this.f4055o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4055o);
        this.f4053m = true;
    }

    public final int b() {
        return this.f4051k.size();
    }

    public final Iterable c() {
        return this.f4052l.isEmpty() ? y3.a() : this.f4052l.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        if (!this.f4051k.isEmpty()) {
            this.f4051k.clear();
        }
        if (this.f4052l.isEmpty()) {
            return;
        }
        this.f4052l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return k(comparable) >= 0 || this.f4052l.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        n();
        int k10 = k(comparable);
        if (k10 >= 0) {
            return ((z3) this.f4051k.get(k10)).setValue(obj);
        }
        n();
        if (this.f4051k.isEmpty() && !(this.f4051k instanceof ArrayList)) {
            this.f4051k = new ArrayList(this.f4050j);
        }
        int i10 = -(k10 + 1);
        if (i10 >= this.f4050j) {
            return m().put(comparable, obj);
        }
        int size = this.f4051k.size();
        int i11 = this.f4050j;
        if (size == i11) {
            z3 z3Var = (z3) this.f4051k.remove(i11 - 1);
            m().put(z3Var.b(), z3Var.getValue());
        }
        this.f4051k.add(i10, new z3(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4054n == null) {
            this.f4054n = new d4(this, null);
        }
        return this.f4054n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f4) {
            f4 f4Var = (f4) obj;
            int size = size();
            if (size != f4Var.size()) {
                return false;
            }
            int b10 = b();
            if (b10 == f4Var.b()) {
                for (int i10 = 0; i10 < b10; i10++) {
                    if (!g(i10).equals(f4Var.g(i10))) {
                        return false;
                    }
                }
                if (b10 == size) {
                    return true;
                }
                entrySet = this.f4052l;
                entrySet2 = f4Var.f4052l;
            } else {
                entrySet = entrySet();
                entrySet2 = f4Var.entrySet();
            }
            return entrySet.equals(entrySet2);
        }
        return super.equals(obj);
    }

    public final Map.Entry g(int i10) {
        return (Map.Entry) this.f4051k.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k10 = k(comparable);
        return k10 >= 0 ? ((z3) this.f4051k.get(k10)).getValue() : this.f4052l.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += ((z3) this.f4051k.get(i11)).hashCode();
        }
        return this.f4052l.size() > 0 ? i10 + this.f4052l.hashCode() : i10;
    }

    public final boolean j() {
        return this.f4053m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int k10 = k(comparable);
        if (k10 >= 0) {
            return l(k10);
        }
        if (this.f4052l.isEmpty()) {
            return null;
        }
        return this.f4052l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4051k.size() + this.f4052l.size();
    }
}
