package q4;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        d0 d0Var = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        int i10 = 1;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    i10 = d4.b.s(parcel, q10);
                    break;
                case 2:
                    d0Var = (d0) d4.b.d(parcel, q10, d0.CREATOR);
                    break;
                case 3:
                    iBinder = d4.b.r(parcel, q10);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) d4.b.d(parcel, q10, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = d4.b.r(parcel, q10);
                    break;
                case 6:
                    iBinder3 = d4.b.r(parcel, q10);
                    break;
                case 7:
                default:
                    d4.b.y(parcel, q10);
                    break;
                case 8:
                    str = d4.b.e(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new f0(i10, d0Var, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f0[i10];
    }
}
