package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f5904a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5905b = "com.google.android.play.core.integrity.protocol.IIntegrityService";

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f5904a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5904a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5905b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(int i10, Parcel parcel) {
        try {
            this.f5904a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
