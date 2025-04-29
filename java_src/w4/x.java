package w4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class x extends d4.a {
    public static final Parcelable.Creator<x> CREATOR = new t0();

    /* renamed from: j  reason: collision with root package name */
    private final w f19937j;

    /* renamed from: k  reason: collision with root package name */
    private final double f19938k;

    public x(w wVar, double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.f19937j = wVar;
        this.f19938k = d10;
    }

    public double B() {
        return this.f19938k;
    }

    public w C() {
        return this.f19937j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.r(parcel, 2, C(), i10, false);
        d4.c.h(parcel, 3, B());
        d4.c.b(parcel, a10);
    }
}
