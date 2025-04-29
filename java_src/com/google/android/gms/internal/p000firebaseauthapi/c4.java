package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c4  reason: invalid package */
/* loaded from: classes.dex */
final class c4 extends e4 {

    /* renamed from: j  reason: collision with root package name */
    private int f4434j = 0;

    /* renamed from: k  reason: collision with root package name */
    private final int f4435k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ m4 f4436l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c4(m4 m4Var) {
        this.f4436l = m4Var;
        this.f4435k = m4Var.k();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4434j < this.f4435k;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h4
    public final byte zza() {
        int i10 = this.f4434j;
        if (i10 < this.f4435k) {
            this.f4434j = i10 + 1;
            return this.f4436l.e(i10);
        }
        throw new NoSuchElementException();
    }
}
