package b4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        int i10 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                i10 = d4.b.s(parcel, q10);
            } else if (j10 == 2) {
                i11 = d4.b.s(parcel, q10);
            } else if (j10 == 3) {
                pendingIntent = (PendingIntent) d4.b.d(parcel, q10, PendingIntent.CREATOR);
            } else if (j10 != 4) {
                d4.b.y(parcel, q10);
            } else {
                str = d4.b.e(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new b(i10, i11, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
