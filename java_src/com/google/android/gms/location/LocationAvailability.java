package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import t4.n;
/* loaded from: classes.dex */
public final class LocationAvailability extends d4.a implements ReflectedParcelable {

    /* renamed from: j  reason: collision with root package name */
    private final int f5804j;

    /* renamed from: k  reason: collision with root package name */
    private final int f5805k;

    /* renamed from: l  reason: collision with root package name */
    private final long f5806l;

    /* renamed from: m  reason: collision with root package name */
    int f5807m;

    /* renamed from: n  reason: collision with root package name */
    private final n[] f5808n;

    /* renamed from: o  reason: collision with root package name */
    public static final LocationAvailability f5802o = new LocationAvailability(0, 1, 1, 0, null, true);

    /* renamed from: p  reason: collision with root package name */
    public static final LocationAvailability f5803p = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationAvailability(int i10, int i11, int i12, long j10, n[] nVarArr, boolean z10) {
        this.f5807m = i10 < 1000 ? 0 : 1000;
        this.f5804j = i11;
        this.f5805k = i12;
        this.f5806l = j10;
        this.f5808n = nVarArr;
    }

    public boolean B() {
        return this.f5807m < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f5804j == locationAvailability.f5804j && this.f5805k == locationAvailability.f5805k && this.f5806l == locationAvailability.f5806l && this.f5807m == locationAvailability.f5807m && Arrays.equals(this.f5808n, locationAvailability.f5808n)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.f5807m));
    }

    public String toString() {
        boolean B = B();
        return "LocationAvailability[" + B + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f5804j);
        d4.c.l(parcel, 2, this.f5805k);
        d4.c.p(parcel, 3, this.f5806l);
        d4.c.l(parcel, 4, this.f5807m);
        d4.c.u(parcel, 5, this.f5808n, i10, false);
        d4.c.c(parcel, 6, B());
        d4.c.b(parcel, a10);
    }
}
