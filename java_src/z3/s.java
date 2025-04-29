package z3;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class s extends m4.b implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // m4.b
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Q0();
        } else if (i10 != 2) {
            return false;
        } else {
            j0();
        }
        return true;
    }
}
