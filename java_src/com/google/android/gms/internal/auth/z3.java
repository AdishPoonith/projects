package com.google.android.gms.internal.auth;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z3 implements Map.Entry, Comparable {

    /* renamed from: j  reason: collision with root package name */
    private final Comparable f4286j;

    /* renamed from: k  reason: collision with root package name */
    private Object f4287k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ f4 f4288l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z3(f4 f4Var, Comparable comparable, Object obj) {
        this.f4288l = f4Var;
        this.f4286j = comparable;
        this.f4287k = obj;
    }

    private static final boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable b() {
        return this.f4286j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f4286j.compareTo(((z3) obj).f4286j);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return g(this.f4286j, entry.getKey()) && g(this.f4287k, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f4286j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4287k;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f4286j;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4287k;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4288l.n();
        Object obj2 = this.f4287k;
        this.f4287k = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4286j);
        String valueOf2 = String.valueOf(this.f4287k);
        return valueOf + "=" + valueOf2;
    }
}
