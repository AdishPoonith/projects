package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i9  reason: invalid package */
/* loaded from: classes.dex */
final class i9 extends e9 {

    /* renamed from: l  reason: collision with root package name */
    private final transient d9 f4735l;

    /* renamed from: m  reason: collision with root package name */
    private final transient Object[] f4736m;

    /* renamed from: n  reason: collision with root package name */
    private final transient int f4737n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9(d9 d9Var, Object[] objArr, int i10, int i11) {
        this.f4735l = d9Var;
        this.f4736m = objArr;
        this.f4737n = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.h7
    public final int b(Object[] objArr, int i10) {
        return m().b(objArr, 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f4735l.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m().listIterator(0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e9
    final a9 p() {
        return new h9(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4737n;
    }
}
