package q4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
/* loaded from: classes.dex */
public final class a1 extends a implements b1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // q4.b1
    public final void O0(t4.f fVar, d1 d1Var, String str) {
        Parcel p10 = p();
        m.c(p10, fVar);
        m.d(p10, d1Var);
        p10.writeString(null);
        x(63, p10);
    }

    @Override // q4.b1
    public final void T(b0 b0Var, LocationRequest locationRequest, com.google.android.gms.common.api.internal.g gVar) {
        Parcel p10 = p();
        m.c(p10, b0Var);
        m.c(p10, locationRequest);
        m.d(p10, gVar);
        x(88, p10);
    }

    @Override // q4.b1
    public final void X(b0 b0Var, com.google.android.gms.common.api.internal.g gVar) {
        Parcel p10 = p();
        m.c(p10, b0Var);
        m.d(p10, gVar);
        x(89, p10);
    }

    @Override // q4.b1
    public final void n0(f0 f0Var) {
        Parcel p10 = p();
        m.c(p10, f0Var);
        x(59, p10);
    }
}
