package z3;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class u extends m4.b implements v {
    public u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // m4.b
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                m4.d.b(parcel);
                C2((GoogleSignInAccount) m4.d.a(parcel, GoogleSignInAccount.CREATOR), (Status) m4.d.a(parcel, Status.CREATOR));
                break;
            case 102:
                m4.d.b(parcel);
                h0((Status) m4.d.a(parcel, Status.CREATOR));
                break;
            case 103:
                m4.d.b(parcel);
                x2((Status) m4.d.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
