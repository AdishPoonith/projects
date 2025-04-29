package c4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class i1 extends d4.a {
    public static final Parcelable.Creator<i1> CREATOR = new j1();

    /* renamed from: j  reason: collision with root package name */
    Bundle f3332j;

    /* renamed from: k  reason: collision with root package name */
    b4.d[] f3333k;

    /* renamed from: l  reason: collision with root package name */
    int f3334l;

    /* renamed from: m  reason: collision with root package name */
    f f3335m;

    public i1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(Bundle bundle, b4.d[] dVarArr, int i10, f fVar) {
        this.f3332j = bundle;
        this.f3333k = dVarArr;
        this.f3334l = i10;
        this.f3335m = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.e(parcel, 1, this.f3332j, false);
        d4.c.u(parcel, 2, this.f3333k, i10, false);
        d4.c.l(parcel, 3, this.f3334l);
        d4.c.r(parcel, 4, this.f3335m, i10, false);
        d4.c.b(parcel, a10);
    }
}
