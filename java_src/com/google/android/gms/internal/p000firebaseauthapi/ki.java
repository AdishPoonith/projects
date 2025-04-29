package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ki  reason: invalid package */
/* loaded from: classes.dex */
final class ki implements zh {

    /* renamed from: a  reason: collision with root package name */
    private final gv f4886a;

    /* renamed from: b  reason: collision with root package name */
    private final gv f4887b;

    private ki(byte[] bArr, byte[] bArr2) {
        this.f4886a = gv.b(bArr);
        this.f4887b = gv.b(bArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ki a(byte[] bArr) {
        return new ki(bArr, ev.b(bArr));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zh
    public final gv zza() {
        return this.f4886a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zh
    public final gv zzb() {
        return this.f4887b;
    }
}
