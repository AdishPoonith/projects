package a6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.j2;
import com.google.firebase.auth.a2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class w1 extends com.google.firebase.auth.a0 {
    public static final Parcelable.Creator<w1> CREATOR = new x1();

    /* renamed from: j  reason: collision with root package name */
    private j2 f317j;

    /* renamed from: k  reason: collision with root package name */
    private s1 f318k;

    /* renamed from: l  reason: collision with root package name */
    private final String f319l;

    /* renamed from: m  reason: collision with root package name */
    private String f320m;

    /* renamed from: n  reason: collision with root package name */
    private List f321n;

    /* renamed from: o  reason: collision with root package name */
    private List f322o;

    /* renamed from: p  reason: collision with root package name */
    private String f323p;

    /* renamed from: q  reason: collision with root package name */
    private Boolean f324q;

    /* renamed from: r  reason: collision with root package name */
    private y1 f325r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f326s;

    /* renamed from: t  reason: collision with root package name */
    private a2 f327t;

    /* renamed from: u  reason: collision with root package name */
    private h0 f328u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w1(j2 j2Var, s1 s1Var, String str, String str2, List list, List list2, String str3, Boolean bool, y1 y1Var, boolean z10, a2 a2Var, h0 h0Var) {
        this.f317j = j2Var;
        this.f318k = s1Var;
        this.f319l = str;
        this.f320m = str2;
        this.f321n = list;
        this.f322o = list2;
        this.f323p = str3;
        this.f324q = bool;
        this.f325r = y1Var;
        this.f326s = z10;
        this.f327t = a2Var;
        this.f328u = h0Var;
    }

    public w1(w5.f fVar, List list) {
        c4.s.j(fVar);
        this.f319l = fVar.q();
        this.f320m = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f323p = "2";
        Y(list);
    }

    @Override // com.google.firebase.auth.a0
    public final com.google.firebase.auth.b0 D() {
        return this.f325r;
    }

    @Override // com.google.firebase.auth.a0
    public final /* synthetic */ com.google.firebase.auth.h0 E() {
        return new f(this);
    }

    @Override // com.google.firebase.auth.a0
    public final List<? extends com.google.firebase.auth.y0> F() {
        return this.f321n;
    }

    @Override // com.google.firebase.auth.a0
    public final String G() {
        Map map;
        j2 j2Var = this.f317j;
        if (j2Var == null || j2Var.E() == null || (map = (Map) e0.a(j2Var.E()).b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.a0
    public final boolean H() {
        Boolean bool = this.f324q;
        if (bool == null || bool.booleanValue()) {
            j2 j2Var = this.f317j;
            String e10 = j2Var != null ? e0.a(j2Var.E()).e() : "";
            boolean z10 = false;
            if (this.f321n.size() <= 1 && (e10 == null || !e10.equals("custom"))) {
                z10 = true;
            }
            this.f324q = Boolean.valueOf(z10);
        }
        return this.f324q.booleanValue();
    }

    @Override // com.google.firebase.auth.a0
    public final w5.f W() {
        return w5.f.p(this.f319l);
    }

    @Override // com.google.firebase.auth.a0
    public final /* bridge */ /* synthetic */ com.google.firebase.auth.a0 X() {
        h0();
        return this;
    }

    @Override // com.google.firebase.auth.a0
    public final synchronized com.google.firebase.auth.a0 Y(List list) {
        c4.s.j(list);
        this.f321n = new ArrayList(list.size());
        this.f322o = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.firebase.auth.y0 y0Var = (com.google.firebase.auth.y0) list.get(i10);
            if (y0Var.g().equals("firebase")) {
                this.f318k = (s1) y0Var;
            } else {
                this.f322o.add(y0Var.g());
            }
            this.f321n.add((s1) y0Var);
        }
        if (this.f318k == null) {
            this.f318k = (s1) this.f321n.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.a0
    public final j2 Z() {
        return this.f317j;
    }

    @Override // com.google.firebase.auth.a0, com.google.firebase.auth.y0
    public final String a() {
        return this.f318k.a();
    }

    @Override // com.google.firebase.auth.a0
    public final String a0() {
        return this.f317j.E();
    }

    @Override // com.google.firebase.auth.a0
    public final String b0() {
        return this.f317j.H();
    }

    @Override // com.google.firebase.auth.a0, com.google.firebase.auth.y0
    public final Uri c() {
        return this.f318k.c();
    }

    @Override // com.google.firebase.auth.a0
    public final List c0() {
        return this.f322o;
    }

    @Override // com.google.firebase.auth.a0
    public final void d0(j2 j2Var) {
        this.f317j = (j2) c4.s.j(j2Var);
    }

    @Override // com.google.firebase.auth.a0
    public final void e0(List list) {
        Parcelable.Creator<h0> creator = h0.CREATOR;
        h0 h0Var = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.firebase.auth.j0 j0Var = (com.google.firebase.auth.j0) it.next();
                if (j0Var instanceof com.google.firebase.auth.t0) {
                    arrayList.add((com.google.firebase.auth.t0) j0Var);
                } else if (j0Var instanceof com.google.firebase.auth.t1) {
                    arrayList2.add((com.google.firebase.auth.t1) j0Var);
                }
            }
            h0Var = new h0(arrayList, arrayList2);
        }
        this.f328u = h0Var;
    }

    @Override // com.google.firebase.auth.y0
    public final boolean f() {
        return this.f318k.f();
    }

    public final a2 f0() {
        return this.f327t;
    }

    @Override // com.google.firebase.auth.y0
    public final String g() {
        return this.f318k.g();
    }

    public final w1 g0(String str) {
        this.f323p = str;
        return this;
    }

    public final w1 h0() {
        this.f324q = Boolean.FALSE;
        return this;
    }

    public final List i0() {
        h0 h0Var = this.f328u;
        return h0Var != null ? h0Var.B() : new ArrayList();
    }

    @Override // com.google.firebase.auth.a0, com.google.firebase.auth.y0
    public final String j() {
        return this.f318k.j();
    }

    public final List j0() {
        return this.f321n;
    }

    public final void k0(a2 a2Var) {
        this.f327t = a2Var;
    }

    public final void l0(boolean z10) {
        this.f326s = z10;
    }

    public final void m0(y1 y1Var) {
        this.f325r = y1Var;
    }

    public final boolean n0() {
        return this.f326s;
    }

    @Override // com.google.firebase.auth.a0, com.google.firebase.auth.y0
    public final String s() {
        return this.f318k.s();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.r(parcel, 1, this.f317j, i10, false);
        d4.c.r(parcel, 2, this.f318k, i10, false);
        d4.c.s(parcel, 3, this.f319l, false);
        d4.c.s(parcel, 4, this.f320m, false);
        d4.c.v(parcel, 5, this.f321n, false);
        d4.c.t(parcel, 6, this.f322o, false);
        d4.c.s(parcel, 7, this.f323p, false);
        d4.c.d(parcel, 8, Boolean.valueOf(H()), false);
        d4.c.r(parcel, 9, this.f325r, i10, false);
        d4.c.c(parcel, 10, this.f326s);
        d4.c.r(parcel, 11, this.f327t, i10, false);
        d4.c.r(parcel, 12, this.f328u, i10, false);
        d4.c.b(parcel, a10);
    }

    @Override // com.google.firebase.auth.a0, com.google.firebase.auth.y0
    public final String x() {
        return this.f318k.x();
    }
}
