package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ai  reason: invalid package */
/* loaded from: classes.dex */
final class ai {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static th a(kr krVar) {
        if (krVar.F() == 3) {
            return new qh(16);
        }
        if (krVar.F() == 4) {
            return new qh(32);
        }
        if (krVar.F() == 5) {
            return new rh();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static yh b(kr krVar) {
        if (krVar.H() == 3) {
            return new ji(new sh("HmacSha256"));
        }
        if (krVar.H() == 4) {
            return hi.b(1);
        }
        if (krVar.H() == 5) {
            return hi.b(2);
        }
        if (krVar.H() == 6) {
            return hi.b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static sh c(kr krVar) {
        if (krVar.G() == 3) {
            return new sh("HmacSha256");
        }
        if (krVar.G() == 4) {
            return new sh("HmacSha384");
        }
        if (krVar.G() == 5) {
            return new sh("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
