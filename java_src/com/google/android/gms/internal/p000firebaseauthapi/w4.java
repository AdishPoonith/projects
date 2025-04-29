package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w4  reason: invalid package */
/* loaded from: classes.dex */
public final class w4 extends IOException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w4(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w4(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
