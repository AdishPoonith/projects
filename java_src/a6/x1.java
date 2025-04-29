package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.j2;
import com.google.firebase.auth.a2;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class x1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        j2 j2Var = null;
        s1 s1Var = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        y1 y1Var = null;
        a2 a2Var = null;
        h0 h0Var = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    j2Var = (j2) d4.b.d(parcel, q10, j2.CREATOR);
                    break;
                case 2:
                    s1Var = (s1) d4.b.d(parcel, q10, s1.CREATOR);
                    break;
                case 3:
                    str = d4.b.e(parcel, q10);
                    break;
                case 4:
                    str2 = d4.b.e(parcel, q10);
                    break;
                case 5:
                    arrayList = d4.b.h(parcel, q10, s1.CREATOR);
                    break;
                case 6:
                    arrayList2 = d4.b.f(parcel, q10);
                    break;
                case 7:
                    str3 = d4.b.e(parcel, q10);
                    break;
                case 8:
                    bool = d4.b.l(parcel, q10);
                    break;
                case 9:
                    y1Var = (y1) d4.b.d(parcel, q10, y1.CREATOR);
                    break;
                case 10:
                    z11 = d4.b.k(parcel, q10);
                    break;
                case 11:
                    a2Var = (a2) d4.b.d(parcel, q10, a2.CREATOR);
                    break;
                case 12:
                    h0Var = (h0) d4.b.d(parcel, q10, h0.CREATOR);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new w1(j2Var, s1Var, str, str2, arrayList, arrayList2, str3, bool, y1Var, z11, a2Var, h0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new w1[i10];
    }
}
