package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q7  reason: invalid package */
/* loaded from: classes.dex */
public final class q7 implements Map.Entry, Comparable {

    /* renamed from: j  reason: collision with root package name */
    private final Comparable f5245j;

    /* renamed from: k  reason: collision with root package name */
    private Object f5246k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ w7 f5247l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q7(w7 w7Var, Comparable comparable, Object obj) {
        this.f5247l = w7Var;
        this.f5245j = comparable;
        this.f5246k = obj;
    }

    private static final boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable b() {
        return this.f5245j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f5245j.compareTo(((q7) obj).f5245j);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return g(this.f5245j, entry.getKey()) && g(this.f5246k, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f5245j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5246k;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f5245j;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f5246k;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f5247l.n();
        Object obj2 = this.f5246k;
        this.f5246k = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5245j);
        String valueOf2 = String.valueOf(this.f5246k);
        return valueOf + "=" + valueOf2;
    }
}
