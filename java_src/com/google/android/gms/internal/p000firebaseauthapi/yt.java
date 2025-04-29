package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.interfaces.ECPublicKey;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yt  reason: invalid package */
/* loaded from: classes.dex */
public final class yt implements z9 {

    /* renamed from: a  reason: collision with root package name */
    private final au f5720a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5721b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f5722c;

    /* renamed from: d  reason: collision with root package name */
    private final wt f5723d;

    public yt(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, wt wtVar) {
        ui.b(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f5720a = new au(eCPublicKey);
        this.f5722c = bArr;
        this.f5721b = str;
        this.f5723d = wtVar;
    }
}
