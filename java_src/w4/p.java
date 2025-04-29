package w4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class p extends d4.a {
    public static final Parcelable.Creator<p> CREATOR = new p0();

    /* renamed from: j  reason: collision with root package name */
    private final List f19902j;

    /* renamed from: k  reason: collision with root package name */
    private final List f19903k;

    /* renamed from: l  reason: collision with root package name */
    private float f19904l;

    /* renamed from: m  reason: collision with root package name */
    private int f19905m;

    /* renamed from: n  reason: collision with root package name */
    private int f19906n;

    /* renamed from: o  reason: collision with root package name */
    private float f19907o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f19908p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f19909q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f19910r;

    /* renamed from: s  reason: collision with root package name */
    private int f19911s;

    /* renamed from: t  reason: collision with root package name */
    private List f19912t;

    public p() {
        this.f19904l = 10.0f;
        this.f19905m = -16777216;
        this.f19906n = 0;
        this.f19907o = 0.0f;
        this.f19908p = true;
        this.f19909q = false;
        this.f19910r = false;
        this.f19911s = 0;
        this.f19912t = null;
        this.f19902j = new ArrayList();
        this.f19903k = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(List list, List list2, float f10, int i10, int i11, float f11, boolean z10, boolean z11, boolean z12, int i12, List list3) {
        this.f19902j = list;
        this.f19903k = list2;
        this.f19904l = f10;
        this.f19905m = i10;
        this.f19906n = i11;
        this.f19907o = f11;
        this.f19908p = z10;
        this.f19909q = z11;
        this.f19910r = z12;
        this.f19911s = i12;
        this.f19912t = list3;
    }

    public p B(Iterable<LatLng> iterable) {
        c4.s.k(iterable, "points must not be null.");
        for (LatLng latLng : iterable) {
            this.f19902j.add(latLng);
        }
        return this;
    }

    public p C(Iterable<LatLng> iterable) {
        c4.s.k(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : iterable) {
            arrayList.add(latLng);
        }
        this.f19903k.add(arrayList);
        return this;
    }

    public p D(boolean z10) {
        this.f19910r = z10;
        return this;
    }

    public p E(int i10) {
        this.f19906n = i10;
        return this;
    }

    public p F(boolean z10) {
        this.f19909q = z10;
        return this;
    }

    public int G() {
        return this.f19906n;
    }

    public List<LatLng> H() {
        return this.f19902j;
    }

    public int I() {
        return this.f19905m;
    }

    public int J() {
        return this.f19911s;
    }

    public List<n> K() {
        return this.f19912t;
    }

    public float L() {
        return this.f19904l;
    }

    public float M() {
        return this.f19907o;
    }

    public boolean N() {
        return this.f19910r;
    }

    public boolean O() {
        return this.f19909q;
    }

    public boolean P() {
        return this.f19908p;
    }

    public p Q(int i10) {
        this.f19905m = i10;
        return this;
    }

    public p R(float f10) {
        this.f19904l = f10;
        return this;
    }

    public p S(boolean z10) {
        this.f19908p = z10;
        return this;
    }

    public p T(float f10) {
        this.f19907o = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.v(parcel, 2, H(), false);
        d4.c.o(parcel, 3, this.f19903k, false);
        d4.c.i(parcel, 4, L());
        d4.c.l(parcel, 5, I());
        d4.c.l(parcel, 6, G());
        d4.c.i(parcel, 7, M());
        d4.c.c(parcel, 8, P());
        d4.c.c(parcel, 9, O());
        d4.c.c(parcel, 10, N());
        d4.c.l(parcel, 11, J());
        d4.c.v(parcel, 12, K(), false);
        d4.c.b(parcel, a10);
    }
}
