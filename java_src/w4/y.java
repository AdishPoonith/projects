package w4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class y extends d4.a {
    public static final Parcelable.Creator<y> CREATOR = new u0();

    /* renamed from: j  reason: collision with root package name */
    public final int f19939j;

    /* renamed from: k  reason: collision with root package name */
    public final int f19940k;

    /* renamed from: l  reason: collision with root package name */
    public final byte[] f19941l;

    public y(int i10, int i11, byte[] bArr) {
        this.f19939j = i10;
        this.f19940k = i11;
        this.f19941l = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 2, this.f19939j);
        d4.c.l(parcel, 3, this.f19940k);
        d4.c.g(parcel, 4, this.f19941l, false);
        d4.c.b(parcel, a10);
    }
}
