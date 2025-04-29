package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c8  reason: invalid package */
/* loaded from: classes.dex */
public final class c8 extends RuntimeException {
    public c8(w6 w6Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final z5 a() {
        return new z5(getMessage());
    }
}
