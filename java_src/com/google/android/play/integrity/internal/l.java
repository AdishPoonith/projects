package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class l extends e implements m {
    public l() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.e
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            f.b(parcel);
            b((Bundle) f.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
