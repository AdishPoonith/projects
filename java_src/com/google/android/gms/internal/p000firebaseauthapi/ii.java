package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ii  reason: invalid package */
/* loaded from: classes.dex */
final class ii implements zh {

    /* renamed from: a  reason: collision with root package name */
    private final gv f4754a;

    /* renamed from: b  reason: collision with root package name */
    private final gv f4755b;

    private ii(byte[] bArr, byte[] bArr2) {
        this.f4754a = gv.b(bArr);
        this.f4755b = gv.b(bArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ii a(byte[] bArr, byte[] bArr2, int i10) {
        bu.d(bu.h(bu.i(i10), 1, bArr2), bu.g(i10, bArr));
        return new ii(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zh
    public final gv zza() {
        return this.f4754a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zh
    public final gv zzb() {
        return this.f4755b;
    }
}
