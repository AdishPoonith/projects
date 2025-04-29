package w4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import w4.w;
/* loaded from: classes.dex */
public final class r extends d4.a {
    public static final Parcelable.Creator<r> CREATOR = new q0();

    /* renamed from: j  reason: collision with root package name */
    private final List f19914j;

    /* renamed from: k  reason: collision with root package name */
    private float f19915k;

    /* renamed from: l  reason: collision with root package name */
    private int f19916l;

    /* renamed from: m  reason: collision with root package name */
    private float f19917m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f19918n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f19919o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f19920p;

    /* renamed from: q  reason: collision with root package name */
    private d f19921q;

    /* renamed from: r  reason: collision with root package name */
    private d f19922r;

    /* renamed from: s  reason: collision with root package name */
    private int f19923s;

    /* renamed from: t  reason: collision with root package name */
    private List f19924t;

    /* renamed from: u  reason: collision with root package name */
    private List f19925u;

    public r() {
        this.f19915k = 10.0f;
        this.f19916l = -16777216;
        this.f19917m = 0.0f;
        this.f19918n = true;
        this.f19919o = false;
        this.f19920p = false;
        this.f19921q = new c();
        this.f19922r = new c();
        this.f19923s = 0;
        this.f19924t = null;
        this.f19925u = new ArrayList();
        this.f19914j = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(List list, float f10, int i10, float f11, boolean z10, boolean z11, boolean z12, d dVar, d dVar2, int i11, List list2, List list3) {
        this.f19915k = 10.0f;
        this.f19916l = -16777216;
        this.f19917m = 0.0f;
        this.f19918n = true;
        this.f19919o = false;
        this.f19920p = false;
        this.f19921q = new c();
        this.f19922r = new c();
        this.f19923s = 0;
        this.f19924t = null;
        this.f19925u = new ArrayList();
        this.f19914j = list;
        this.f19915k = f10;
        this.f19916l = i10;
        this.f19917m = f11;
        this.f19918n = z10;
        this.f19919o = z11;
        this.f19920p = z12;
        if (dVar != null) {
            this.f19921q = dVar;
        }
        if (dVar2 != null) {
            this.f19922r = dVar2;
        }
        this.f19923s = i11;
        this.f19924t = list2;
        if (list3 != null) {
            this.f19925u = list3;
        }
    }

    public r B(Iterable<LatLng> iterable) {
        c4.s.k(iterable, "points must not be null.");
        for (LatLng latLng : iterable) {
            this.f19914j.add(latLng);
        }
        return this;
    }

    public r C(boolean z10) {
        this.f19920p = z10;
        return this;
    }

    public r D(int i10) {
        this.f19916l = i10;
        return this;
    }

    public r E(d dVar) {
        this.f19922r = (d) c4.s.k(dVar, "endCap must not be null");
        return this;
    }

    public r F(boolean z10) {
        this.f19919o = z10;
        return this;
    }

    public int G() {
        return this.f19916l;
    }

    public d H() {
        return this.f19922r.B();
    }

    public int I() {
        return this.f19923s;
    }

    public List<n> J() {
        return this.f19924t;
    }

    public List<LatLng> K() {
        return this.f19914j;
    }

    public d L() {
        return this.f19921q.B();
    }

    public float M() {
        return this.f19915k;
    }

    public float N() {
        return this.f19917m;
    }

    public boolean O() {
        return this.f19920p;
    }

    public boolean P() {
        return this.f19919o;
    }

    public boolean Q() {
        return this.f19918n;
    }

    public r R(int i10) {
        this.f19923s = i10;
        return this;
    }

    public r S(List<n> list) {
        this.f19924t = list;
        return this;
    }

    public r T(d dVar) {
        this.f19921q = (d) c4.s.k(dVar, "startCap must not be null");
        return this;
    }

    public r U(boolean z10) {
        this.f19918n = z10;
        return this;
    }

    public r V(float f10) {
        this.f19915k = f10;
        return this;
    }

    public r W(float f10) {
        this.f19917m = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.v(parcel, 2, K(), false);
        d4.c.i(parcel, 3, M());
        d4.c.l(parcel, 4, G());
        d4.c.i(parcel, 5, N());
        d4.c.c(parcel, 6, Q());
        d4.c.c(parcel, 7, P());
        d4.c.c(parcel, 8, O());
        d4.c.r(parcel, 9, L(), i10, false);
        d4.c.r(parcel, 10, H(), i10, false);
        d4.c.l(parcel, 11, I());
        d4.c.v(parcel, 12, J(), false);
        ArrayList arrayList = new ArrayList(this.f19925u.size());
        for (x xVar : this.f19925u) {
            w.a aVar = new w.a(xVar.C());
            aVar.c(this.f19915k);
            aVar.b(this.f19918n);
            arrayList.add(new x(aVar.a(), xVar.B()));
        }
        d4.c.v(parcel, 13, arrayList, false);
        d4.c.b(parcel, a10);
    }
}
