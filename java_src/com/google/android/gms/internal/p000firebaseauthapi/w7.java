package com.google.android.gms.internal.p000firebaseauthapi;

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
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w7  reason: invalid package */
/* loaded from: classes.dex */
public class w7 extends AbstractMap {

    /* renamed from: j  reason: collision with root package name */
    private final int f5579j;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5582m;

    /* renamed from: n  reason: collision with root package name */
    private volatile u7 f5583n;

    /* renamed from: k  reason: collision with root package name */
    private List f5580k = Collections.emptyList();

    /* renamed from: l  reason: collision with root package name */
    private Map f5581l = Collections.emptyMap();

    /* renamed from: o  reason: collision with root package name */
    private Map f5584o = Collections.emptyMap();

    private final int k(Comparable comparable) {
        int size = this.f5580k.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((q7) this.f5580k.get(size)).b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((q7) this.f5580k.get(i11)).b());
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
        Object value = ((q7) this.f5580k.remove(i10)).getValue();
        if (!this.f5581l.isEmpty()) {
            Iterator it = m().entrySet().iterator();
            List list = this.f5580k;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new q7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap m() {
        n();
        if (this.f5581l.isEmpty() && !(this.f5581l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5581l = treeMap;
            this.f5584o = treeMap.descendingMap();
        }
        return (SortedMap) this.f5581l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f5582m) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f5582m) {
            return;
        }
        this.f5581l = this.f5581l.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5581l);
        this.f5584o = this.f5584o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5584o);
        this.f5582m = true;
    }

    public final int b() {
        return this.f5580k.size();
    }

    public final Iterable c() {
        return this.f5581l.isEmpty() ? p7.a() : this.f5581l.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        if (!this.f5580k.isEmpty()) {
            this.f5580k.clear();
        }
        if (this.f5581l.isEmpty()) {
            return;
        }
        this.f5581l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return k(comparable) >= 0 || this.f5581l.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        n();
        int k10 = k(comparable);
        if (k10 >= 0) {
            return ((q7) this.f5580k.get(k10)).setValue(obj);
        }
        n();
        if (this.f5580k.isEmpty() && !(this.f5580k instanceof ArrayList)) {
            this.f5580k = new ArrayList(this.f5579j);
        }
        int i10 = -(k10 + 1);
        if (i10 >= this.f5579j) {
            return m().put(comparable, obj);
        }
        int size = this.f5580k.size();
        int i11 = this.f5579j;
        if (size == i11) {
            q7 q7Var = (q7) this.f5580k.remove(i11 - 1);
            m().put(q7Var.b(), q7Var.getValue());
        }
        this.f5580k.add(i10, new q7(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f5583n == null) {
            this.f5583n = new u7(this, null);
        }
        return this.f5583n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof w7) {
            w7 w7Var = (w7) obj;
            int size = size();
            if (size != w7Var.size()) {
                return false;
            }
            int b10 = b();
            if (b10 == w7Var.b()) {
                for (int i10 = 0; i10 < b10; i10++) {
                    if (!g(i10).equals(w7Var.g(i10))) {
                        return false;
                    }
                }
                if (b10 == size) {
                    return true;
                }
                entrySet = this.f5581l;
                entrySet2 = w7Var.f5581l;
            } else {
                entrySet = entrySet();
                entrySet2 = w7Var.entrySet();
            }
            return entrySet.equals(entrySet2);
        }
        return super.equals(obj);
    }

    public final Map.Entry g(int i10) {
        return (Map.Entry) this.f5580k.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int k10 = k(comparable);
        return k10 >= 0 ? ((q7) this.f5580k.get(k10)).getValue() : this.f5581l.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += ((q7) this.f5580k.get(i11)).hashCode();
        }
        return this.f5581l.size() > 0 ? i10 + this.f5581l.hashCode() : i10;
    }

    public final boolean j() {
        return this.f5582m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int k10 = k(comparable);
        if (k10 >= 0) {
            return l(k10);
        }
        if (this.f5581l.isEmpty()) {
            return null;
        }
        return this.f5581l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5580k.size() + this.f5581l.size();
    }
}
