package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a2;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h extends com.google.firebase.auth.k0 {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: j  reason: collision with root package name */
    private final List f220j;

    /* renamed from: k  reason: collision with root package name */
    private final j f221k;

    /* renamed from: l  reason: collision with root package name */
    private final String f222l;

    /* renamed from: m  reason: collision with root package name */
    private final a2 f223m;

    /* renamed from: n  reason: collision with root package name */
    private final w1 f224n;

    /* renamed from: o  reason: collision with root package name */
    private final List f225o;

    public h(List list, j jVar, String str, a2 a2Var, w1 w1Var, List list2) {
        this.f220j = (List) c4.s.j(list);
        this.f221k = (j) c4.s.j(jVar);
        this.f222l = c4.s.f(str);
        this.f223m = a2Var;
        this.f224n = w1Var;
        this.f225o = (List) c4.s.j(list2);
    }

    @Override // com.google.firebase.auth.k0
    public final List<com.google.firebase.auth.j0> B() {
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.t0 t0Var : this.f220j) {
            arrayList.add(t0Var);
        }
        for (com.google.firebase.auth.t1 t1Var : this.f225o) {
            arrayList.add(t1Var);
        }
        return arrayList;
    }

    @Override // com.google.firebase.auth.k0
    public final com.google.firebase.auth.l0 C() {
        return this.f221k;
    }

    @Override // com.google.firebase.auth.k0
    public final Task<com.google.firebase.auth.i> D(com.google.firebase.auth.i0 i0Var) {
        return FirebaseAuth.getInstance(w5.f.p(this.f222l)).q0(i0Var, this.f221k, this.f224n).continueWithTask(new g(this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.v(parcel, 1, this.f220j, false);
        d4.c.r(parcel, 2, this.f221k, i10, false);
        d4.c.s(parcel, 3, this.f222l, false);
        d4.c.r(parcel, 4, this.f223m, i10, false);
        d4.c.r(parcel, 5, this.f224n, i10, false);
        d4.c.v(parcel, 6, this.f225o, false);
        d4.c.b(parcel, a10);
    }
}
