package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g6  reason: invalid package */
/* loaded from: classes.dex */
public class g6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                return Integer.MAX_VALUE;
            }
            return i12;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
