package t4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class i extends d4.a {
    public static final Parcelable.Creator<i> CREATOR = new m();

    /* renamed from: j  reason: collision with root package name */
    private final boolean f18231j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f18232k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f18233l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f18234m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f18235n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f18236o;

    public i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f18231j = z10;
        this.f18232k = z11;
        this.f18233l = z12;
        this.f18234m = z13;
        this.f18235n = z14;
        this.f18236o = z15;
    }

    public boolean B() {
        return this.f18236o;
    }

    public boolean C() {
        return this.f18233l;
    }

    public boolean D() {
        return this.f18234m;
    }

    public boolean E() {
        return this.f18231j;
    }

    public boolean F() {
        return this.f18235n;
    }

    public boolean G() {
        return this.f18232k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.c(parcel, 1, E());
        d4.c.c(parcel, 2, G());
        d4.c.c(parcel, 3, C());
        d4.c.c(parcel, 4, D());
        d4.c.c(parcel, 5, F());
        d4.c.c(parcel, 6, B());
        d4.c.b(parcel, a10);
    }
}
