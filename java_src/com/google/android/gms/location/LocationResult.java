package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class LocationResult extends d4.a implements ReflectedParcelable {

    /* renamed from: j  reason: collision with root package name */
    private final List f5840j;

    /* renamed from: k  reason: collision with root package name */
    static final List f5839k = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationResult(List list) {
        this.f5840j = list;
    }

    public Location B() {
        int size = this.f5840j.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f5840j.get(size - 1);
    }

    public List<Location> C() {
        return this.f5840j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.location.LocationResult
            r1 = 0
            if (r0 == 0) goto L8c
            com.google.android.gms.location.LocationResult r10 = (com.google.android.gms.location.LocationResult) r10
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L16
            java.util.List r0 = r9.f5840j
            java.util.List r10 = r10.f5840j
            boolean r10 = r0.equals(r10)
            return r10
        L16:
            java.util.List r0 = r9.f5840j
            int r0 = r0.size()
            java.util.List r2 = r10.f5840j
            int r2 = r2.size()
            if (r0 == r2) goto L25
            return r1
        L25:
            java.util.List r0 = r9.f5840j
            java.util.Iterator r0 = r0.iterator()
            java.util.List r10 = r10.f5840j
            java.util.Iterator r10 = r10.iterator()
        L31:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r0.next()
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r3 = r10.next()
            android.location.Location r3 = (android.location.Location) r3
            double r4 = r2.getLatitude()
            double r6 = r3.getLatitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L52
            return r1
        L52:
            double r4 = r2.getLongitude()
            double r6 = r3.getLongitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L61
            return r1
        L61:
            long r4 = r2.getTime()
            long r6 = r3.getTime()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L6e
            return r1
        L6e:
            long r4 = r2.getElapsedRealtimeNanos()
            long r6 = r3.getElapsedRealtimeNanos()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L7b
            return r1
        L7b:
            java.lang.String r2 = r2.getProvider()
            java.lang.String r3 = r3.getProvider()
            boolean r2 = c4.q.b(r2, r3)
            if (r2 != 0) goto L31
            return r1
        L8a:
            r10 = 1
            return r10
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationResult.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return q.c(this.f5840j);
    }

    public String toString() {
        return "LocationResult".concat(String.valueOf(this.f5840j));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.v(parcel, 1, C(), false);
        d4.c.b(parcel, a10);
    }
}
