package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f9  reason: invalid package */
/* loaded from: classes.dex */
public final class f9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] a(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException("at index " + i11);
            }
        }
        return objArr;
    }
}
