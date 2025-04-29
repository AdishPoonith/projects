package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i0 extends n0 {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ g5 f4115m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, String str, Object obj, boolean z10, g5 g5Var, byte[] bArr) {
        super(j0Var, "getTokenRefactor__blocked_packages", obj, true, null);
        this.f4115m = g5Var;
    }

    @Override // com.google.android.gms.internal.auth.n0
    final Object a(Object obj) {
        try {
            return d5.j(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            String c10 = super.c();
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + c10 + ": " + ((String) obj));
            return null;
        }
    }
}
