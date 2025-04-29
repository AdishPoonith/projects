package com.google.android.gms.internal.auth;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f0 extends n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(j0 j0Var, String str, Long l10, boolean z10) {
        super(j0Var, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.n0
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = super.c();
            Log.e("PhenotypeFlag", "Invalid long value for " + c10 + ": " + ((String) obj));
            return null;
        }
    }
}
