package t4;

import android.os.Parcel;
import android.os.Parcelable;
@Deprecated
/* loaded from: classes.dex */
public final class n extends d4.a {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* renamed from: j  reason: collision with root package name */
    public final int f18237j;

    /* renamed from: k  reason: collision with root package name */
    public final int f18238k;

    /* renamed from: l  reason: collision with root package name */
    public final long f18239l;

    /* renamed from: m  reason: collision with root package name */
    public final long f18240m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(int i10, int i11, long j10, long j11) {
        this.f18237j = i10;
        this.f18238k = i11;
        this.f18239l = j10;
        this.f18240m = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f18237j == nVar.f18237j && this.f18238k == nVar.f18238k && this.f18239l == nVar.f18239l && this.f18240m == nVar.f18240m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c4.q.c(Integer.valueOf(this.f18238k), Integer.valueOf(this.f18237j), Long.valueOf(this.f18240m), Long.valueOf(this.f18239l));
    }

    public final String toString() {
        int i10 = this.f18237j;
        int i11 = this.f18238k;
        long j10 = this.f18240m;
        long j11 = this.f18239l;
        return "NetworkLocationStatus: Wifi status: " + i10 + " Cell status: " + i11 + " elapsed time NS: " + j10 + " system time ms: " + j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f18237j);
        d4.c.l(parcel, 2, this.f18238k);
        d4.c.p(parcel, 3, this.f18239l);
        d4.c.p(parcel, 4, this.f18240m);
        d4.c.b(parcel, a10);
    }
}
