package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jx  reason: invalid package */
/* loaded from: classes.dex */
public final class jx implements b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zk f4835a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jx(zk zkVar) {
        this.f4835a = zkVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.b
    public final /* bridge */ /* synthetic */ Iterator a(c0 c0Var, CharSequence charSequence) {
        return new jw(this, c0Var, charSequence, this.f4835a.a(charSequence));
    }
}
