package z4;

import android.os.Parcel;
import android.os.Parcelable;
import c4.t0;
/* loaded from: classes.dex */
public final class l extends d4.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: j  reason: collision with root package name */
    final int f20889j;

    /* renamed from: k  reason: collision with root package name */
    private final b4.b f20890k;

    /* renamed from: l  reason: collision with root package name */
    private final t0 f20891l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i10, b4.b bVar, t0 t0Var) {
        this.f20889j = i10;
        this.f20890k = bVar;
        this.f20891l = t0Var;
    }

    public final b4.b B() {
        return this.f20890k;
    }

    public final t0 C() {
        return this.f20891l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f20889j);
        d4.c.r(parcel, 2, this.f20890k, i10, false);
        d4.c.r(parcel, 3, this.f20891l, i10, false);
        d4.c.b(parcel, a10);
    }
}
