package c4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* loaded from: classes.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                i10 = d4.b.s(parcel, q10);
            } else if (j10 == 2) {
                account = (Account) d4.b.d(parcel, q10, Account.CREATOR);
            } else if (j10 == 3) {
                i11 = d4.b.s(parcel, q10);
            } else if (j10 != 4) {
                d4.b.y(parcel, q10);
            } else {
                googleSignInAccount = (GoogleSignInAccount) d4.b.d(parcel, q10, GoogleSignInAccount.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new r0(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r0[i10];
    }
}
