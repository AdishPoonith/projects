package q4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public final class d0 extends d4.a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: j  reason: collision with root package name */
    LocationRequest f16178j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(LocationRequest locationRequest, List list, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c4.d dVar = (c4.d) it.next();
                    h4.n.a(workSource, dVar.f3270j, dVar.f3271k);
                }
            }
            aVar.h(workSource);
        }
        if (z10) {
            aVar.b(1);
        }
        if (z11) {
            aVar.g(2);
        }
        if (str != null) {
            aVar.f(str);
        } else if (str2 != null) {
            aVar.f(str2);
        }
        if (z12) {
            aVar.e(true);
        }
        if (z13) {
            aVar.d(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.c(j10);
        }
        this.f16178j = aVar.a();
    }

    @Deprecated
    public static d0 B(String str, LocationRequest locationRequest) {
        return new d0(locationRequest, null, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return c4.q.b(this.f16178j, ((d0) obj).f16178j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16178j.hashCode();
    }

    public final String toString() {
        return this.f16178j.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.r(parcel, 1, this.f16178j, i10, false);
        d4.c.b(parcel, a10);
    }
}
