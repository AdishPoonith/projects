package z4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
/* loaded from: classes.dex */
public final class h extends d4.a implements com.google.android.gms.common.api.m {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: j  reason: collision with root package name */
    private final List f20885j;

    /* renamed from: k  reason: collision with root package name */
    private final String f20886k;

    public h(List list, String str) {
        this.f20885j = list;
        this.f20886k = str;
    }

    @Override // com.google.android.gms.common.api.m
    public final Status p() {
        return this.f20886k != null ? Status.f3734p : Status.f3738t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.t(parcel, 1, this.f20885j, false);
        d4.c.s(parcel, 2, this.f20886k, false);
        d4.c.b(parcel, a10);
    }
}
