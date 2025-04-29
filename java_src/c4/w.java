package c4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class w extends d4.a {
    public static final Parcelable.Creator<w> CREATOR = new b0();

    /* renamed from: j  reason: collision with root package name */
    private final int f3408j;

    /* renamed from: k  reason: collision with root package name */
    private List f3409k;

    public w(int i10, List list) {
        this.f3408j = i10;
        this.f3409k = list;
    }

    public final int B() {
        return this.f3408j;
    }

    public final List C() {
        return this.f3409k;
    }

    public final void D(p pVar) {
        if (this.f3409k == null) {
            this.f3409k = new ArrayList();
        }
        this.f3409k.add(pVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f3408j);
        d4.c.v(parcel, 2, this.f3409k, false);
        d4.c.b(parcel, a10);
    }
}
