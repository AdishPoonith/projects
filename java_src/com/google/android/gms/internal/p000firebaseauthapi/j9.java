package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j9  reason: invalid package */
/* loaded from: classes.dex */
final class j9 extends e9 {

    /* renamed from: l  reason: collision with root package name */
    private final transient d9 f4805l;

    /* renamed from: m  reason: collision with root package name */
    private final transient a9 f4806m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j9(d9 d9Var, a9 a9Var) {
        this.f4805l = d9Var;
        this.f4806m = a9Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.h7
    public final int b(Object[] objArr, int i10) {
        return this.f4806m.b(objArr, 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f4805l.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f4806m.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4805l.size();
    }
}
