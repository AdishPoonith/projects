package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fa  reason: invalid package */
/* loaded from: classes.dex */
public final class fa implements ga {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ lk f4572a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ hj f4573b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fa(lk lkVar, hj hjVar) {
        this.f4572a = lkVar;
        this.f4573b = hjVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ga
    public final ba zza(Class cls) {
        try {
            return new eb(this.f4572a, this.f4573b, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ga
    public final ba zzb() {
        lk lkVar = this.f4572a;
        return new eb(lkVar, this.f4573b, lkVar.g());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ga
    public final Class zzc() {
        return this.f4572a.getClass();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ga
    public final Class zzd() {
        return this.f4573b.getClass();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ga
    public final Set zze() {
        return this.f4572a.j();
    }
}
