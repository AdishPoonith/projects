package c4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class u1 extends p4.b implements w0 {
    public u1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // p4.b
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            k4.b zzd = zzd();
            parcel2.writeNoException();
            p4.c.c(parcel2, zzd);
        } else if (i10 != 2) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
