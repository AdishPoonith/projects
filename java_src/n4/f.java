package n4;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class f extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void M(h hVar) {
        Parcel p10 = p();
        e.b(p10, hVar);
        x(1, p10);
    }
}
