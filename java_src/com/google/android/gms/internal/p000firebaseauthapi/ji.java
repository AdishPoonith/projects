package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ji  reason: invalid package */
/* loaded from: classes.dex */
final class ji implements yh {

    /* renamed from: a  reason: collision with root package name */
    private final sh f4821a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ji(sh shVar) {
        this.f4821a = shVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.yh
    public final byte[] a(byte[] bArr, zh zhVar) {
        byte[] a10 = ev.a(zhVar.zza().c(), bArr);
        byte[] b10 = ut.b(bArr, zhVar.zzb().c());
        byte[] d10 = gi.d(gi.f4629b);
        sh shVar = this.f4821a;
        return shVar.b(null, a10, "eae_prk", b10, "shared_secret", d10, shVar.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.yh
    public final byte[] zzb() {
        if (Arrays.equals(this.f4821a.c(), gi.f4633f)) {
            return gi.f4629b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
