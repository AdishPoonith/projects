package z4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class b extends d4.a implements com.google.android.gms.common.api.m {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: j  reason: collision with root package name */
    final int f20882j;

    /* renamed from: k  reason: collision with root package name */
    private int f20883k;

    /* renamed from: l  reason: collision with root package name */
    private Intent f20884l;

    public b() {
        this(2, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, int i11, Intent intent) {
        this.f20882j = i10;
        this.f20883k = i11;
        this.f20884l = intent;
    }

    @Override // com.google.android.gms.common.api.m
    public final Status p() {
        return this.f20883k == 0 ? Status.f3734p : Status.f3738t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f20882j);
        d4.c.l(parcel, 2, this.f20883k);
        d4.c.r(parcel, 3, this.f20884l, i10, false);
        d4.c.b(parcel, a10);
    }
}
