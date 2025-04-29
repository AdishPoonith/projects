package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import k4.b;
/* loaded from: classes.dex */
public class v extends d4.a {
    public static final Parcelable.Creator<v> CREATOR = new r0();

    /* renamed from: j  reason: collision with root package name */
    protected final a f19926j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(IBinder iBinder) {
        this.f19926j = new a(b.a.x(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.k(parcel, 2, this.f19926j.a().asBinder(), false);
        d4.c.b(parcel, a10);
    }
}
