package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import k4.b;
/* loaded from: classes.dex */
public final class n extends p4.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final k4.b H2(k4.b bVar, String str, int i10, k4.b bVar2) {
        Parcel x10 = x();
        p4.c.c(x10, bVar);
        x10.writeString(str);
        x10.writeInt(i10);
        p4.c.c(x10, bVar2);
        Parcel p10 = p(3, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    public final k4.b M(k4.b bVar, String str, int i10, k4.b bVar2) {
        Parcel x10 = x();
        p4.c.c(x10, bVar);
        x10.writeString(str);
        x10.writeInt(i10);
        p4.c.c(x10, bVar2);
        Parcel p10 = p(2, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }
}
