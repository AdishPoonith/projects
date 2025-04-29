package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class i extends a implements k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void i2(Bundle bundle, m mVar) {
        Parcel p10 = p();
        f.c(p10, bundle);
        f.d(p10, mVar);
        x(2, p10);
    }
}
