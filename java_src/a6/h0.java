package a6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h0 extends d4.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: j  reason: collision with root package name */
    private final List f226j;

    /* renamed from: k  reason: collision with root package name */
    private final List f227k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(List list, List list2) {
        this.f226j = list == null ? new ArrayList() : list;
        this.f227k = list2 == null ? new ArrayList() : list2;
    }

    public final List B() {
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.t0 t0Var : this.f226j) {
            arrayList.add(t0Var);
        }
        for (com.google.firebase.auth.t1 t1Var : this.f227k) {
            arrayList.add(t1Var);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.v(parcel, 1, this.f226j, false);
        d4.c.v(parcel, 2, this.f227k, false);
        d4.c.b(parcel, a10);
    }
}
