package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import d4.c;
import v4.f;
/* loaded from: classes.dex */
public final class GoogleMapOptions extends d4.a implements ReflectedParcelable {
    private Integer A;
    private String B;

    /* renamed from: j  reason: collision with root package name */
    private Boolean f5841j;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f5842k;

    /* renamed from: l  reason: collision with root package name */
    private int f5843l;

    /* renamed from: m  reason: collision with root package name */
    private CameraPosition f5844m;

    /* renamed from: n  reason: collision with root package name */
    private Boolean f5845n;

    /* renamed from: o  reason: collision with root package name */
    private Boolean f5846o;

    /* renamed from: p  reason: collision with root package name */
    private Boolean f5847p;

    /* renamed from: q  reason: collision with root package name */
    private Boolean f5848q;

    /* renamed from: r  reason: collision with root package name */
    private Boolean f5849r;

    /* renamed from: s  reason: collision with root package name */
    private Boolean f5850s;

    /* renamed from: t  reason: collision with root package name */
    private Boolean f5851t;

    /* renamed from: u  reason: collision with root package name */
    private Boolean f5852u;

    /* renamed from: v  reason: collision with root package name */
    private Boolean f5853v;

    /* renamed from: w  reason: collision with root package name */
    private Float f5854w;

    /* renamed from: x  reason: collision with root package name */
    private Float f5855x;

    /* renamed from: y  reason: collision with root package name */
    private LatLngBounds f5856y;

    /* renamed from: z  reason: collision with root package name */
    private Boolean f5857z;
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new a();
    private static final Integer C = Integer.valueOf(Color.argb(255, 236, 233, 225));

    public GoogleMapOptions() {
        this.f5843l = -1;
        this.f5854w = null;
        this.f5855x = null;
        this.f5856y = null;
        this.A = null;
        this.B = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str) {
        this.f5843l = -1;
        this.f5854w = null;
        this.f5855x = null;
        this.f5856y = null;
        this.A = null;
        this.B = null;
        this.f5841j = f.b(b10);
        this.f5842k = f.b(b11);
        this.f5843l = i10;
        this.f5844m = cameraPosition;
        this.f5845n = f.b(b12);
        this.f5846o = f.b(b13);
        this.f5847p = f.b(b14);
        this.f5848q = f.b(b15);
        this.f5849r = f.b(b16);
        this.f5850s = f.b(b17);
        this.f5851t = f.b(b18);
        this.f5852u = f.b(b19);
        this.f5853v = f.b(b20);
        this.f5854w = f10;
        this.f5855x = f11;
        this.f5856y = latLngBounds;
        this.f5857z = f.b(b21);
        this.A = num;
        this.B = str;
    }

    public GoogleMapOptions B(CameraPosition cameraPosition) {
        this.f5844m = cameraPosition;
        return this;
    }

    public GoogleMapOptions C(boolean z10) {
        this.f5846o = Boolean.valueOf(z10);
        return this;
    }

    public Integer D() {
        return this.A;
    }

    public CameraPosition E() {
        return this.f5844m;
    }

    public LatLngBounds F() {
        return this.f5856y;
    }

    public Boolean G() {
        return this.f5851t;
    }

    public String H() {
        return this.B;
    }

    public int I() {
        return this.f5843l;
    }

    public Float J() {
        return this.f5855x;
    }

    public Float K() {
        return this.f5854w;
    }

    public GoogleMapOptions L(LatLngBounds latLngBounds) {
        this.f5856y = latLngBounds;
        return this;
    }

    public GoogleMapOptions M(boolean z10) {
        this.f5851t = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions N(boolean z10) {
        this.f5852u = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions O(int i10) {
        this.f5843l = i10;
        return this;
    }

    public GoogleMapOptions P(float f10) {
        this.f5855x = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions Q(float f10) {
        this.f5854w = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions R(boolean z10) {
        this.f5850s = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions S(boolean z10) {
        this.f5847p = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions T(boolean z10) {
        this.f5849r = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions U(boolean z10) {
        this.f5845n = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions V(boolean z10) {
        this.f5848q = Boolean.valueOf(z10);
        return this;
    }

    public String toString() {
        return q.d(this).a("MapType", Integer.valueOf(this.f5843l)).a("LiteMode", this.f5851t).a("Camera", this.f5844m).a("CompassEnabled", this.f5846o).a("ZoomControlsEnabled", this.f5845n).a("ScrollGesturesEnabled", this.f5847p).a("ZoomGesturesEnabled", this.f5848q).a("TiltGesturesEnabled", this.f5849r).a("RotateGesturesEnabled", this.f5850s).a("ScrollGesturesEnabledDuringRotateOrZoom", this.f5857z).a("MapToolbarEnabled", this.f5852u).a("AmbientEnabled", this.f5853v).a("MinZoomPreference", this.f5854w).a("MaxZoomPreference", this.f5855x).a("BackgroundColor", this.A).a("LatLngBoundsForCameraTarget", this.f5856y).a("ZOrderOnTop", this.f5841j).a("UseViewLifecycleInFragment", this.f5842k).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.f(parcel, 2, f.a(this.f5841j));
        c.f(parcel, 3, f.a(this.f5842k));
        c.l(parcel, 4, I());
        c.r(parcel, 5, E(), i10, false);
        c.f(parcel, 6, f.a(this.f5845n));
        c.f(parcel, 7, f.a(this.f5846o));
        c.f(parcel, 8, f.a(this.f5847p));
        c.f(parcel, 9, f.a(this.f5848q));
        c.f(parcel, 10, f.a(this.f5849r));
        c.f(parcel, 11, f.a(this.f5850s));
        c.f(parcel, 12, f.a(this.f5851t));
        c.f(parcel, 14, f.a(this.f5852u));
        c.f(parcel, 15, f.a(this.f5853v));
        c.j(parcel, 16, K(), false);
        c.j(parcel, 17, J(), false);
        c.r(parcel, 18, F(), i10, false);
        c.f(parcel, 19, f.a(this.f5857z));
        c.n(parcel, 20, D(), false);
        c.s(parcel, 21, H(), false);
        c.b(parcel, a10);
    }
}
