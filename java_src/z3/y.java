package z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
/* loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 2) {
                str = d4.b.e(parcel, q10);
            } else if (j10 != 5) {
                d4.b.y(parcel, q10);
            } else {
                googleSignInOptions = (GoogleSignInOptions) d4.b.d(parcel, q10, GoogleSignInOptions.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInConfiguration[i10];
    }
}
