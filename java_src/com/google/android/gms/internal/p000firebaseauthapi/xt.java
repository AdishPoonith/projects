package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.interfaces.ECPrivateKey;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xt  reason: invalid package */
/* loaded from: classes.dex */
public final class xt implements y9 {

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f5671g = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final ECPrivateKey f5672a;

    /* renamed from: b  reason: collision with root package name */
    private final zt f5673b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5674c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f5675d;

    /* renamed from: e  reason: collision with root package name */
    private final wt f5676e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5677f;

    public xt(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i10, wt wtVar) {
        this.f5672a = eCPrivateKey;
        this.f5673b = new zt(eCPrivateKey);
        this.f5675d = bArr;
        this.f5674c = str;
        this.f5677f = i10;
        this.f5676e = wtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.y9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(byte[] r10, byte[] r11) {
        /*
            r9 = this;
            java.security.interfaces.ECPrivateKey r11 = r9.f5672a
            java.security.spec.ECParameterSpec r11 = r11.getParams()
            java.security.spec.EllipticCurve r11 = r11.getCurve()
            int r0 = r9.f5677f
            int r11 = com.google.android.gms.internal.p000firebaseauthapi.bu.a(r11)
            int r0 = r0 + (-1)
            if (r0 == 0) goto L1a
            r1 = 2
            if (r0 == r1) goto L18
            goto L1b
        L18:
            int r11 = r11 + r11
            goto L1d
        L1a:
            int r11 = r11 + r11
        L1b:
            int r11 = r11 + 1
        L1d:
            int r0 = r10.length
            if (r0 < r11) goto L49
            r1 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r1, r11)
            com.google.android.gms.internal.firebase-auth-api.zt r2 = r9.f5673b
            java.lang.String r4 = r9.f5674c
            byte[] r5 = r9.f5675d
            r6 = 0
            com.google.android.gms.internal.firebase-auth-api.wt r1 = r9.f5676e
            int r7 = r1.zza()
            int r8 = r9.f5677f
            byte[] r1 = r2.a(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.firebase-auth-api.wt r2 = r9.f5676e
            com.google.android.gms.internal.firebase-auth-api.li r1 = r2.a(r1)
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r11, r0)
            byte[] r11 = com.google.android.gms.internal.p000firebaseauthapi.xt.f5671g
            byte[] r10 = r1.a(r10, r11)
            return r10
        L49:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.xt.a(byte[], byte[]):byte[]");
    }
}
