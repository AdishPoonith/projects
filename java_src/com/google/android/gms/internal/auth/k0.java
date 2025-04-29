package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class k0 extends a implements l2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.l2
    public final Bundle V0(String str, Bundle bundle) {
        Parcel p10 = p();
        p10.writeString(str);
        j.c(p10, bundle);
        Parcel x10 = x(2, p10);
        Bundle bundle2 = (Bundle) j.a(x10, Bundle.CREATOR);
        x10.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.l2
    public final Bundle y0(Account account, String str, Bundle bundle) {
        Parcel p10 = p();
        j.c(p10, account);
        p10.writeString(str);
        j.c(p10, bundle);
        Parcel x10 = x(5, p10);
        Bundle bundle2 = (Bundle) j.a(x10, Bundle.CREATOR);
        x10.recycle();
        return bundle2;
    }
}
