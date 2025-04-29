package q4;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b0 extends d4.a {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* renamed from: j  reason: collision with root package name */
    private final int f16169j;

    /* renamed from: k  reason: collision with root package name */
    private final IBinder f16170k;

    /* renamed from: l  reason: collision with root package name */
    private final IBinder f16171l;

    /* renamed from: m  reason: collision with root package name */
    private final PendingIntent f16172m;

    /* renamed from: n  reason: collision with root package name */
    private final String f16173n;

    /* renamed from: o  reason: collision with root package name */
    private final String f16174o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f16169j = i10;
        this.f16170k = iBinder;
        this.f16171l = iBinder2;
        this.f16172m = pendingIntent;
        this.f16173n = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f16174o = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [t4.v, android.os.IBinder] */
    public static b0 B(IInterface iInterface, t4.v vVar, String str, String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new b0(2, iInterface, vVar, null, null, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f16169j);
        d4.c.k(parcel, 2, this.f16170k, false);
        d4.c.k(parcel, 3, this.f16171l, false);
        d4.c.r(parcel, 4, this.f16172m, i10, false);
        d4.c.s(parcel, 5, this.f16173n, false);
        d4.c.s(parcel, 6, this.f16174o, false);
        d4.c.b(parcel, a10);
    }
}
