package a6;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class t1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    str = d4.b.e(parcel, q10);
                    break;
                case 2:
                    str2 = d4.b.e(parcel, q10);
                    break;
                case 3:
                    str5 = d4.b.e(parcel, q10);
                    break;
                case 4:
                    str4 = d4.b.e(parcel, q10);
                    break;
                case 5:
                    str3 = d4.b.e(parcel, q10);
                    break;
                case 6:
                    str6 = d4.b.e(parcel, q10);
                    break;
                case 7:
                    z11 = d4.b.k(parcel, q10);
                    break;
                case 8:
                    str7 = d4.b.e(parcel, q10);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new s1(str, str2, str3, str4, str5, str6, z11, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s1[i10];
    }
}
