package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class l5 extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void H2(com.google.android.gms.common.api.internal.g gVar, g gVar2) {
        Parcel p10 = p();
        j.d(p10, gVar);
        j.c(p10, gVar2);
        M(2, p10);
    }

    public final void I2(k5 k5Var, Account account, String str, Bundle bundle) {
        Parcel p10 = p();
        j.d(p10, k5Var);
        j.c(p10, account);
        p10.writeString(str);
        j.c(p10, bundle);
        M(1, p10);
    }
}
