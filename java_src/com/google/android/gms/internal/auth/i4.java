package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
public final class i4 extends RuntimeException {
    public i4(g3 g3Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final m2 a() {
        return new m2(getMessage());
    }
}
