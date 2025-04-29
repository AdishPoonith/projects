package t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class h extends d4.a implements com.google.android.gms.common.api.m {
    public static final Parcelable.Creator<h> CREATOR = new l();

    /* renamed from: j  reason: collision with root package name */
    private final Status f18229j;

    /* renamed from: k  reason: collision with root package name */
    private final i f18230k;

    public h(Status status, i iVar) {
        this.f18229j = status;
        this.f18230k = iVar;
    }

    public i B() {
        return this.f18230k;
    }

    @Override // com.google.android.gms.common.api.m
    public Status p() {
        return this.f18229j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.r(parcel, 1, p(), i10, false);
        d4.c.r(parcel, 2, B(), i10, false);
        d4.c.b(parcel, a10);
    }
}
