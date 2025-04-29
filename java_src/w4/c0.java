package w4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* loaded from: classes.dex */
public final class c0 extends d4.a {
    public static final Parcelable.Creator<c0> CREATOR = new h0();

    /* renamed from: j  reason: collision with root package name */
    public final LatLng f19855j;

    /* renamed from: k  reason: collision with root package name */
    public final LatLng f19856k;

    /* renamed from: l  reason: collision with root package name */
    public final LatLng f19857l;

    /* renamed from: m  reason: collision with root package name */
    public final LatLng f19858m;

    /* renamed from: n  reason: collision with root package name */
    public final LatLngBounds f19859n;

    public c0(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f19855j = latLng;
        this.f19856k = latLng2;
        this.f19857l = latLng3;
        this.f19858m = latLng4;
        this.f19859n = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.f19855j.equals(c0Var.f19855j) && this.f19856k.equals(c0Var.f19856k) && this.f19857l.equals(c0Var.f19857l) && this.f19858m.equals(c0Var.f19858m) && this.f19859n.equals(c0Var.f19859n);
        }
        return false;
    }

    public int hashCode() {
        return c4.q.c(this.f19855j, this.f19856k, this.f19857l, this.f19858m, this.f19859n);
    }

    public String toString() {
        return c4.q.d(this).a("nearLeft", this.f19855j).a("nearRight", this.f19856k).a("farLeft", this.f19857l).a("farRight", this.f19858m).a("latLngBounds", this.f19859n).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.r(parcel, 2, this.f19855j, i10, false);
        d4.c.r(parcel, 3, this.f19856k, i10, false);
        d4.c.r(parcel, 4, this.f19857l, i10, false);
        d4.c.r(parcel, 5, this.f19858m, i10, false);
        d4.c.r(parcel, 6, this.f19859n, i10, false);
        d4.c.b(parcel, a10);
    }
}
