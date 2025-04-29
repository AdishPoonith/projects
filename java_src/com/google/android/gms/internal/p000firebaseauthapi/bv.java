package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.SecureRandom;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bv  reason: invalid package */
/* loaded from: classes.dex */
public final class bv {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f4405a = new av();

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f4405a.get()).nextBytes(bArr);
        return bArr;
    }
}
