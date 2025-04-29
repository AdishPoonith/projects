package c4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class d extends d4.a {
    public static final Parcelable.Creator<d> CREATOR = new a0();

    /* renamed from: j  reason: collision with root package name */
    public final int f3270j;

    /* renamed from: k  reason: collision with root package name */
    public final String f3271k;

    public d(int i10, String str) {
        this.f3270j = i10;
        this.f3271k = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return dVar.f3270j == this.f3270j && q.b(dVar.f3271k, this.f3271k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3270j;
    }

    public final String toString() {
        int i10 = this.f3270j;
        String str = this.f3271k;
        return i10 + ":" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f3270j);
        d4.c.s(parcel, 2, this.f3271k, false);
        d4.c.b(parcel, a10);
    }
}
