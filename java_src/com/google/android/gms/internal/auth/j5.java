package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class j5 extends c implements k5 {
    public j5() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // com.google.android.gms.internal.auth.c
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            j.b(parcel);
            O1((Status) j.a(parcel, Status.CREATOR), (Bundle) j.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
