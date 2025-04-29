package q4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class v0 extends d4.a implements com.google.android.gms.common.api.m {

    /* renamed from: j  reason: collision with root package name */
    private final Status f16219j;

    /* renamed from: k  reason: collision with root package name */
    public static final v0 f16218k = new v0(Status.f3734p);
    public static final Parcelable.Creator<v0> CREATOR = new w0();

    public v0(Status status) {
        this.f16219j = status;
    }

    @Override // com.google.android.gms.common.api.m
    public final Status p() {
        return this.f16219j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.r(parcel, 1, this.f16219j, i10, false);
        d4.c.b(parcel, a10);
    }
}
