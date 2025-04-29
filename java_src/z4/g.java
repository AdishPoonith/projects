package z4;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class g extends o4.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void H2(j jVar, f fVar) {
        Parcel p10 = p();
        o4.c.c(p10, jVar);
        o4.c.d(p10, fVar);
        x(12, p10);
    }
}
