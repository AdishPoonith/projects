package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h8  reason: invalid package */
/* loaded from: classes.dex */
final class h8 implements Iterator {

    /* renamed from: j  reason: collision with root package name */
    final Iterator f4676j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ j8 f4677k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h8(j8 j8Var) {
        d6 d6Var;
        this.f4677k = j8Var;
        d6Var = j8Var.f4804j;
        this.f4676j = d6Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4676j.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f4676j.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
