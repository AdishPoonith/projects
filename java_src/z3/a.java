package z3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class a extends d4.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: j  reason: collision with root package name */
    final int f20857j;

    /* renamed from: k  reason: collision with root package name */
    private int f20858k;

    /* renamed from: l  reason: collision with root package name */
    private Bundle f20859l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, int i11, Bundle bundle) {
        this.f20857j = i10;
        this.f20858k = i11;
        this.f20859l = bundle;
    }

    public int B() {
        return this.f20858k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f20857j);
        d4.c.l(parcel, 2, B());
        d4.c.e(parcel, 3, this.f20859l, false);
        d4.c.b(parcel, a10);
    }
}
