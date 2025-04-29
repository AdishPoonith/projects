package z4;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class e extends o4.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // o4.b
    protected final boolean H2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                b4.b bVar = (b4.b) o4.c.a(parcel, b4.b.CREATOR);
                b bVar2 = (b) o4.c.a(parcel, b.CREATOR);
                o4.c.b(parcel);
                break;
            case 4:
            case 6:
                Status status = (Status) o4.c.a(parcel, Status.CREATOR);
                o4.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 7:
                Status status2 = (Status) o4.c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) o4.c.a(parcel, GoogleSignInAccount.CREATOR);
                o4.c.b(parcel);
                break;
            case 8:
                o4.c.b(parcel);
                w1((l) o4.c.a(parcel, l.CREATOR));
                break;
            case 9:
                h hVar = (h) o4.c.a(parcel, h.CREATOR);
                o4.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
