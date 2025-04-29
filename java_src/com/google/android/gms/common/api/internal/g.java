package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public interface g extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends o4.b implements g {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // o4.b
        protected final boolean H2(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                o4.c.b(parcel);
                p1((Status) o4.c.a(parcel, Status.CREATOR));
                return true;
            }
            return false;
        }
    }

    void p1(Status status);
}
