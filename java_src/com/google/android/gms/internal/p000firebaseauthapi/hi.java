package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hi  reason: invalid package */
/* loaded from: classes.dex */
final class hi implements yh {

    /* renamed from: a  reason: collision with root package name */
    private final sh f4692a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4693b;

    private hi(sh shVar, int i10) {
        this.f4692a = shVar;
        this.f4693b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hi b(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? new hi(new sh("HmacSha512"), 3) : new hi(new sh("HmacSha384"), 2) : new hi(new sh("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.yh
    public final byte[] a(byte[] bArr, zh zhVar) {
        byte[] f10 = bu.f(bu.g(this.f4693b, zhVar.zza().c()), bu.h(bu.i(this.f4693b), 1, bArr));
        byte[] b10 = ut.b(bArr, zhVar.zzb().c());
        byte[] d10 = gi.d(zzb());
        sh shVar = this.f4692a;
        return shVar.b(null, f10, "eae_prk", b10, "shared_secret", d10, shVar.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.yh
    public final byte[] zzb() {
        int i10 = this.f4693b - 1;
        return i10 != 0 ? i10 != 1 ? gi.f4632e : gi.f4631d : gi.f4630c;
    }
}
