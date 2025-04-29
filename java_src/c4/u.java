package c4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class u extends d4.a {
    public static final Parcelable.Creator<u> CREATOR = new b1();

    /* renamed from: j  reason: collision with root package name */
    private final int f3398j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f3399k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f3400l;

    /* renamed from: m  reason: collision with root package name */
    private final int f3401m;

    /* renamed from: n  reason: collision with root package name */
    private final int f3402n;

    public u(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f3398j = i10;
        this.f3399k = z10;
        this.f3400l = z11;
        this.f3401m = i11;
        this.f3402n = i12;
    }

    public int B() {
        return this.f3401m;
    }

    public int C() {
        return this.f3402n;
    }

    public boolean D() {
        return this.f3399k;
    }

    public boolean E() {
        return this.f3400l;
    }

    public int F() {
        return this.f3398j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, F());
        d4.c.c(parcel, 2, D());
        d4.c.c(parcel, 3, E());
        d4.c.l(parcel, 4, B());
        d4.c.l(parcel, 5, C());
        d4.c.b(parcel, a10);
    }
}
