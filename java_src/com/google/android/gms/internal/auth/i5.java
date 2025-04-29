package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
/* loaded from: classes.dex */
final class i5 extends c4.h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i5(Context context, Looper looper, c4.e eVar, com.google.android.gms.common.api.internal.e eVar2, com.google.android.gms.common.api.internal.m mVar) {
        super(context, looper, 224, eVar, eVar2, mVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final String D() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // c4.c
    protected final String E() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // c4.c
    protected final boolean H() {
        return true;
    }

    @Override // c4.c
    public final boolean Q() {
        return true;
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final void f(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.f(str);
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final int h() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof l5 ? (l5) queryLocalInterface : new l5(iBinder);
    }

    @Override // c4.c
    public final b4.d[] u() {
        return new b4.d[]{t3.e.f18206j, t3.e.f18205i, t3.e.f18197a};
    }
}
