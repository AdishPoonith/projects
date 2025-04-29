package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import c4.s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d4.a;
import d4.c;
import w4.k0;
/* loaded from: classes.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new k0();

    /* renamed from: j  reason: collision with root package name */
    public final LatLng f5868j;

    /* renamed from: k  reason: collision with root package name */
    public final LatLng f5869k;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        s.k(latLng, "southwest must not be null.");
        s.k(latLng2, "northeast must not be null.");
        double d10 = latLng2.f5866j;
        double d11 = latLng.f5866j;
        s.c(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.f5866j));
        this.f5868j = latLng;
        this.f5869k = latLng2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            return this.f5868j.equals(latLngBounds.f5868j) && this.f5869k.equals(latLngBounds.f5869k);
        }
        return false;
    }

    public int hashCode() {
        return q.c(this.f5868j, this.f5869k);
    }

    public String toString() {
        return q.d(this).a("southwest", this.f5868j).a("northeast", this.f5869k).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.r(parcel, 2, this.f5868j, i10, false);
        c.r(parcel, 3, this.f5869k, i10, false);
        c.b(parcel, a10);
    }
}
