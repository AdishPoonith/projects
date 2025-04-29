package e4;

import android.os.IBinder;
import android.os.Parcel;
import c4.w;
/* loaded from: classes.dex */
public final class a extends o4.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void H2(w wVar) {
        Parcel p10 = p();
        o4.c.c(p10, wVar);
        M(1, p10);
    }
}
