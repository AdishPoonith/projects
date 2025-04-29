package q4;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
@Deprecated
/* loaded from: classes.dex */
public final class f0 extends d4.a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: j  reason: collision with root package name */
    private final int f16180j;

    /* renamed from: k  reason: collision with root package name */
    private final d0 f16181k;

    /* renamed from: l  reason: collision with root package name */
    private final t4.y f16182l;

    /* renamed from: m  reason: collision with root package name */
    private final t4.v f16183m;

    /* renamed from: n  reason: collision with root package name */
    private final PendingIntent f16184n;

    /* renamed from: o  reason: collision with root package name */
    private final z0 f16185o;

    /* renamed from: p  reason: collision with root package name */
    private final String f16186p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(int i10, d0 d0Var, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.f16180j = i10;
        this.f16181k = d0Var;
        z0 z0Var = null;
        this.f16182l = iBinder != null ? t4.x.x(iBinder) : null;
        this.f16184n = pendingIntent;
        this.f16183m = iBinder2 != null ? t4.u.x(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            z0Var = queryLocalInterface instanceof z0 ? (z0) queryLocalInterface : new x0(iBinder3);
        }
        this.f16185o = z0Var;
        this.f16186p = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f16180j);
        d4.c.r(parcel, 2, this.f16181k, i10, false);
        t4.y yVar = this.f16182l;
        d4.c.k(parcel, 3, yVar == null ? null : yVar.asBinder(), false);
        d4.c.r(parcel, 4, this.f16184n, i10, false);
        t4.v vVar = this.f16183m;
        d4.c.k(parcel, 5, vVar == null ? null : vVar.asBinder(), false);
        z0 z0Var = this.f16185o;
        d4.c.k(parcel, 6, z0Var != null ? z0Var.asBinder() : null, false);
        d4.c.s(parcel, 8, this.f16186p, false);
        d4.c.b(parcel, a10);
    }
}
