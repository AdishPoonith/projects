package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import c4.s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d4.c;
import w4.d0;
/* loaded from: classes.dex */
public final class CameraPosition extends d4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new d0();

    /* renamed from: j  reason: collision with root package name */
    public final LatLng f5858j;

    /* renamed from: k  reason: collision with root package name */
    public final float f5859k;

    /* renamed from: l  reason: collision with root package name */
    public final float f5860l;

    /* renamed from: m  reason: collision with root package name */
    public final float f5861m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private LatLng f5862a;

        /* renamed from: b  reason: collision with root package name */
        private float f5863b;

        /* renamed from: c  reason: collision with root package name */
        private float f5864c;

        /* renamed from: d  reason: collision with root package name */
        private float f5865d;

        public a a(float f10) {
            this.f5865d = f10;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f5862a, this.f5863b, this.f5864c, this.f5865d);
        }

        public a c(LatLng latLng) {
            this.f5862a = (LatLng) s.k(latLng, "location must not be null.");
            return this;
        }

        public a d(float f10) {
            this.f5864c = f10;
            return this;
        }

        public a e(float f10) {
            this.f5863b = f10;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        s.k(latLng, "camera target must not be null.");
        s.c(f11 >= 0.0f && f11 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f5858j = latLng;
        this.f5859k = f10;
        this.f5860l = f11 + 0.0f;
        this.f5861m = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public static a B() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraPosition) {
            CameraPosition cameraPosition = (CameraPosition) obj;
            return this.f5858j.equals(cameraPosition.f5858j) && Float.floatToIntBits(this.f5859k) == Float.floatToIntBits(cameraPosition.f5859k) && Float.floatToIntBits(this.f5860l) == Float.floatToIntBits(cameraPosition.f5860l) && Float.floatToIntBits(this.f5861m) == Float.floatToIntBits(cameraPosition.f5861m);
        }
        return false;
    }

    public int hashCode() {
        return q.c(this.f5858j, Float.valueOf(this.f5859k), Float.valueOf(this.f5860l), Float.valueOf(this.f5861m));
    }

    public String toString() {
        return q.d(this).a("target", this.f5858j).a("zoom", Float.valueOf(this.f5859k)).a("tilt", Float.valueOf(this.f5860l)).a("bearing", Float.valueOf(this.f5861m)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.r(parcel, 2, this.f5858j, i10, false);
        c.i(parcel, 3, this.f5859k);
        c.i(parcel, 4, this.f5860l);
        c.i(parcel, 5, this.f5861m);
        c.b(parcel, a10);
    }
}
