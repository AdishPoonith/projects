package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.uu  reason: invalid package */
/* loaded from: classes.dex */
public final class uu {
    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            sb.append("0123456789abcdef".charAt(i10 >> 4));
            sb.append("0123456789abcdef".charAt(i10 & 15));
        }
        return sb.toString();
    }
}
