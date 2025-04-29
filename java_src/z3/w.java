package z3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
/* loaded from: classes.dex */
public final class w extends m4.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void H2(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel p10 = p();
        m4.d.d(p10, vVar);
        m4.d.c(p10, googleSignInOptions);
        x(102, p10);
    }

    public final void I2(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel p10 = p();
        m4.d.d(p10, vVar);
        m4.d.c(p10, googleSignInOptions);
        x(101, p10);
    }

    public final void M(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel p10 = p();
        m4.d.d(p10, vVar);
        m4.d.c(p10, googleSignInOptions);
        x(103, p10);
    }
}
