package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import k4.b;
/* loaded from: classes.dex */
public final class m extends p4.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int H2(k4.b bVar, String str, boolean z10) {
        Parcel x10 = x();
        p4.c.c(x10, bVar);
        x10.writeString(str);
        x10.writeInt(z10 ? 1 : 0);
        Parcel p10 = p(3, x10);
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    public final int I2(k4.b bVar, String str, boolean z10) {
        Parcel x10 = x();
        p4.c.c(x10, bVar);
        x10.writeString(str);
        x10.writeInt(z10 ? 1 : 0);
        Parcel p10 = p(5, x10);
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    public final k4.b J2(k4.b bVar, String str, int i10) {
        Parcel x10 = x();
        p4.c.c(x10, bVar);
        x10.writeString(str);
        x10.writeInt(i10);
        Parcel p10 = p(2, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    public final k4.b K2(k4.b bVar, String str, int i10, k4.b bVar2) {
        Parcel x10 = x();
        p4.c.c(x10, bVar);
        x10.writeString(str);
        x10.writeInt(i10);
        p4.c.c(x10, bVar2);
        Parcel p10 = p(8, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    public final k4.b L2(k4.b bVar, String str, int i10) {
        Parcel x10 = x();
        p4.c.c(x10, bVar);
        x10.writeString(str);
        x10.writeInt(i10);
        Parcel p10 = p(4, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    public final int M() {
        Parcel p10 = p(6, x());
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    public final k4.b M2(k4.b bVar, String str, boolean z10, long j10) {
        Parcel x10 = x();
        p4.c.c(x10, bVar);
        x10.writeString(str);
        x10.writeInt(z10 ? 1 : 0);
        x10.writeLong(j10);
        Parcel p10 = p(7, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }
}
