package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class j extends e implements k {
    public static k p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new i(iBinder);
    }
}
