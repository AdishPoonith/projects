package z4;

import android.os.Parcel;
import android.os.Parcelable;
import c4.r0;
/* loaded from: classes.dex */
public final class j extends d4.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: j  reason: collision with root package name */
    final int f20887j;

    /* renamed from: k  reason: collision with root package name */
    final r0 f20888k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i10, r0 r0Var) {
        this.f20887j = i10;
        this.f20888k = r0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f20887j);
        d4.c.r(parcel, 2, this.f20888k, i10, false);
        d4.c.b(parcel, a10);
    }
}
