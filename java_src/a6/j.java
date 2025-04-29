package a6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class j extends com.google.firebase.auth.l0 {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: j  reason: collision with root package name */
    private String f234j;

    /* renamed from: k  reason: collision with root package name */
    private String f235k;

    /* renamed from: l  reason: collision with root package name */
    private List f236l;

    /* renamed from: m  reason: collision with root package name */
    private List f237m;

    /* renamed from: n  reason: collision with root package name */
    private w1 f238n;

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, String str2, List list, List list2, w1 w1Var) {
        this.f234j = str;
        this.f235k = str2;
        this.f236l = list;
        this.f237m = list2;
        this.f238n = w1Var;
    }

    public static j B(String str, w1 w1Var) {
        c4.s.f(str);
        j jVar = new j();
        jVar.f234j = str;
        jVar.f238n = w1Var;
        return jVar;
    }

    public static j C(List list, String str) {
        List list2;
        Parcelable parcelable;
        c4.s.j(list);
        c4.s.f(str);
        j jVar = new j();
        jVar.f236l = new ArrayList();
        jVar.f237m = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.j0 j0Var = (com.google.firebase.auth.j0) it.next();
            if (j0Var instanceof com.google.firebase.auth.t0) {
                list2 = jVar.f236l;
                parcelable = (com.google.firebase.auth.t0) j0Var;
            } else if (!(j0Var instanceof com.google.firebase.auth.t1)) {
                throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ".concat(String.valueOf(j0Var.C())));
            } else {
                list2 = jVar.f237m;
                parcelable = (com.google.firebase.auth.t1) j0Var;
            }
            list2.add(parcelable);
        }
        jVar.f235k = str;
        return jVar;
    }

    public final String D() {
        return this.f234j;
    }

    public final String E() {
        return this.f235k;
    }

    public final boolean F() {
        return this.f234j != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f234j, false);
        d4.c.s(parcel, 2, this.f235k, false);
        d4.c.v(parcel, 3, this.f236l, false);
        d4.c.v(parcel, 4, this.f237m, false);
        d4.c.r(parcel, 5, this.f238n, i10, false);
        d4.c.b(parcel, a10);
    }
}
