package w4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class k extends d4.a {

    /* renamed from: j  reason: collision with root package name */
    private String f19882j;

    /* renamed from: k  reason: collision with root package name */
    private static final String f19881k = k.class.getSimpleName();
    public static final Parcelable.Creator<k> CREATOR = new m0();

    public k(String str) {
        c4.s.k(str, "json must not be null");
        this.f19882j = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 2, this.f19882j, false);
        d4.c.b(parcel, a10);
    }
}
