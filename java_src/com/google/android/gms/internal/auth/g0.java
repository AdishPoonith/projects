package com.google.android.gms.internal.auth;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g0 extends n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(j0 j0Var, String str, Boolean bool, boolean z10) {
        super(j0Var, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.n0
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (l.f4156c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (l.f4157d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String c10 = super.c();
        Log.e("PhenotypeFlag", "Invalid boolean value for " + c10 + ": " + ((String) obj));
        return null;
    }
}
