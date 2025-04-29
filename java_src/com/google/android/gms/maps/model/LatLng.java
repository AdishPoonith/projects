package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d4.a;
import d4.c;
import w4.l0;
/* loaded from: classes.dex */
public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new l0();

    /* renamed from: j  reason: collision with root package name */
    public final double f5866j;

    /* renamed from: k  reason: collision with root package name */
    public final double f5867k;

    public LatLng(double d10, double d11) {
        this.f5867k = (d11 < -180.0d || d11 >= 180.0d) ? ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d11;
        this.f5866j = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLng) {
            LatLng latLng = (LatLng) obj;
            return Double.doubleToLongBits(this.f5866j) == Double.doubleToLongBits(latLng.f5866j) && Double.doubleToLongBits(this.f5867k) == Double.doubleToLongBits(latLng.f5867k);
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f5866j);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f5867k);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d10 = this.f5866j;
        double d11 = this.f5867k;
        return "lat/lng: (" + d10 + "," + d11 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.h(parcel, 2, this.f5866j);
        c.h(parcel, 3, this.f5867k);
        c.b(parcel, a10);
    }
}
