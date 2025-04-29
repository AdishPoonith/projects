package b4;

import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
/* loaded from: classes.dex */
public class d extends d4.a {
    public static final Parcelable.Creator<d> CREATOR = new q();

    /* renamed from: j  reason: collision with root package name */
    private final String f2901j;
    @Deprecated

    /* renamed from: k  reason: collision with root package name */
    private final int f2902k;

    /* renamed from: l  reason: collision with root package name */
    private final long f2903l;

    public d(String str, int i10, long j10) {
        this.f2901j = str;
        this.f2902k = i10;
        this.f2903l = j10;
    }

    public d(String str, long j10) {
        this.f2901j = str;
        this.f2903l = j10;
        this.f2902k = -1;
    }

    public String B() {
        return this.f2901j;
    }

    public long C() {
        long j10 = this.f2903l;
        return j10 == -1 ? this.f2902k : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((B() != null && B().equals(dVar.B())) || (B() == null && dVar.B() == null)) && C() == dVar.C()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c4.q.c(B(), Long.valueOf(C()));
    }

    public final String toString() {
        q.a d10 = c4.q.d(this);
        d10.a("name", B());
        d10.a("version", Long.valueOf(C()));
        return d10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, B(), false);
        d4.c.l(parcel, 2, this.f2902k);
        d4.c.p(parcel, 3, C());
        d4.c.b(parcel, a10);
    }
}
