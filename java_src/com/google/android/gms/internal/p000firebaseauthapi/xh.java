package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xh  reason: invalid package */
/* loaded from: classes.dex */
final class xh implements z9 {

    /* renamed from: a  reason: collision with root package name */
    private final qr f5658a;

    /* renamed from: b  reason: collision with root package name */
    private final yh f5659b;

    /* renamed from: c  reason: collision with root package name */
    private final th f5660c;

    /* renamed from: d  reason: collision with root package name */
    private final sh f5661d;

    private xh(qr qrVar, yh yhVar, sh shVar, th thVar) {
        this.f5658a = qrVar;
        this.f5659b = yhVar;
        this.f5661d = shVar;
        this.f5660c = thVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xh a(qr qrVar) {
        if (qrVar.I().y()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        kr D = qrVar.D();
        return new xh(qrVar, ai.b(D), ai.c(D), ai.a(D));
    }
}
