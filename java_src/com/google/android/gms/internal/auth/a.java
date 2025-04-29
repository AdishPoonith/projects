package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f3995a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3996b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f3995a = iBinder;
        this.f3996b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3995a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3995a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3996b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel x(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f3995a.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
