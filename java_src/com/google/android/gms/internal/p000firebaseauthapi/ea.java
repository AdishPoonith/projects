package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ea  reason: invalid package */
/* loaded from: classes.dex */
public final class ea implements ga {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ hj f4541a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ea(hj hjVar) {
        this.f4541a = hjVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ga
    public final ba zza(Class cls) {
        try {
            return new da(this.f4541a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ga
    public final ba zzb() {
        hj hjVar = this.f4541a;
        return new da(hjVar, hjVar.g());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ga
    public final Class zzc() {
        return this.f4541a.getClass();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ga
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ga
    public final Set zze() {
        return this.f4541a.j();
    }
}
