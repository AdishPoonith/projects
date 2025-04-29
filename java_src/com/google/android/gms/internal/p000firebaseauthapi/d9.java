package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d9  reason: invalid package */
/* loaded from: classes.dex */
public abstract class d9 implements Map, Serializable {

    /* renamed from: j  reason: collision with root package name */
    private transient e9 f4486j;

    /* renamed from: k  reason: collision with root package name */
    private transient e9 f4487k;

    /* renamed from: l  reason: collision with root package name */
    private transient h7 f4488l;

    /* JADX WARN: Multi-variable type inference failed */
    public static d9 c(Iterable iterable) {
        c9 c9Var = new c9(iterable instanceof Collection ? iterable.size() : 4);
        c9Var.a(iterable);
        b9 b9Var = c9Var.f4444c;
        if (b9Var == null) {
            l9 g10 = l9.g(c9Var.f4443b, c9Var.f4442a, c9Var);
            b9 b9Var2 = c9Var.f4444c;
            if (b9Var2 == null) {
                return g10;
            }
            throw b9Var2.a();
        }
        throw b9Var.a();
    }

    abstract h7 a();

    @Override // java.util.Map
    /* renamed from: b */
    public final h7 values() {
        h7 h7Var = this.f4488l;
        if (h7Var == null) {
            h7 a10 = a();
            this.f4488l = a10;
            return a10;
        }
        return h7Var;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract e9 d();

    abstract e9 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: f */
    public final e9 entrySet() {
        e9 e9Var = this.f4486j;
        if (e9Var == null) {
            e9 d10 = d();
            this.f4486j = d10;
            return d10;
        }
        return e9Var;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return m9.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        e9 e9Var = this.f4487k;
        if (e9Var == null) {
            e9 e10 = e();
            this.f4487k = e10;
            return e10;
        }
        return e9Var;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
