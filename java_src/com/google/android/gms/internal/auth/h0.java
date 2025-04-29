package com.google.android.gms.internal.auth;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h0 extends n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(j0 j0Var, String str, Double d10, boolean z10) {
        super(j0Var, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.n0
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = super.c();
            Log.e("PhenotypeFlag", "Invalid double value for " + c10 + ": " + ((String) obj));
            return null;
        }
    }
}
