package com.google.android.gms.internal.auth;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class a3 extends LinkedHashMap {

    /* renamed from: k  reason: collision with root package name */
    private static final a3 f3999k;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4000j;

    static {
        a3 a3Var = new a3();
        f3999k = a3Var;
        a3Var.f4000j = false;
    }

    private a3() {
        this.f4000j = true;
    }

    private a3(Map map) {
        super(map);
        this.f4000j = true;
    }

    public static a3 a() {
        return f3999k;
    }

    private static int h(Object obj) {
        return obj instanceof byte[] ? k2.b((byte[]) obj) : obj.hashCode();
    }

    private final void i() {
        if (!this.f4000j) {
            throw new UnsupportedOperationException();
        }
    }

    public final a3 c() {
        return isEmpty() ? new a3() : new a3(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final void d() {
        this.f4000j = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                Object value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                } else {
                    equals = value.equals(obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void f(a3 a3Var) {
        i();
        if (a3Var.isEmpty()) {
            return;
        }
        putAll(a3Var);
    }

    public final boolean g() {
        return this.f4000j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i10 += h(entry.getValue()) ^ h(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        k2.e(obj);
        k2.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            k2.e(obj);
            k2.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }
}
