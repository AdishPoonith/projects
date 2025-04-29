package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class l1 extends c implements l2 {
    public static l2 x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return queryLocalInterface instanceof l2 ? (l2) queryLocalInterface : new k0(iBinder);
    }
}
