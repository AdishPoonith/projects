package w4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class n extends d4.a {

    /* renamed from: j  reason: collision with root package name */
    private final int f19899j;

    /* renamed from: k  reason: collision with root package name */
    private final Float f19900k;

    /* renamed from: l  reason: collision with root package name */
    private static final String f19898l = n.class.getSimpleName();
    public static final Parcelable.Creator<n> CREATOR = new o0();

    public n(int i10, Float f10) {
        boolean z10 = false;
        if (i10 == 1 || (f10 != null && f10.floatValue() >= 0.0f)) {
            z10 = true;
        }
        c4.s.b(z10, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.f19899j = i10;
        this.f19900k = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f19899j == nVar.f19899j && c4.q.b(this.f19900k, nVar.f19900k);
        }
        return false;
    }

    public int hashCode() {
        return c4.q.c(Integer.valueOf(this.f19899j), this.f19900k);
    }

    public String toString() {
        int i10 = this.f19899j;
        Float f10 = this.f19900k;
        return "[PatternItem: type=" + i10 + " length=" + f10 + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 2, this.f19899j);
        d4.c.j(parcel, 3, this.f19900k, false);
        d4.c.b(parcel, a10);
    }
}
