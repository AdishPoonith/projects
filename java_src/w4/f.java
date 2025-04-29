package w4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* loaded from: classes.dex */
public final class f extends d4.a {
    public static final Parcelable.Creator<f> CREATOR = new j0();

    /* renamed from: j  reason: collision with root package name */
    private LatLng f19867j;

    /* renamed from: k  reason: collision with root package name */
    private double f19868k;

    /* renamed from: l  reason: collision with root package name */
    private float f19869l;

    /* renamed from: m  reason: collision with root package name */
    private int f19870m;

    /* renamed from: n  reason: collision with root package name */
    private int f19871n;

    /* renamed from: o  reason: collision with root package name */
    private float f19872o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f19873p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f19874q;

    /* renamed from: r  reason: collision with root package name */
    private List f19875r;

    public f() {
        this.f19867j = null;
        this.f19868k = 0.0d;
        this.f19869l = 10.0f;
        this.f19870m = -16777216;
        this.f19871n = 0;
        this.f19872o = 0.0f;
        this.f19873p = true;
        this.f19874q = false;
        this.f19875r = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(LatLng latLng, double d10, float f10, int i10, int i11, float f11, boolean z10, boolean z11, List list) {
        this.f19867j = latLng;
        this.f19868k = d10;
        this.f19869l = f10;
        this.f19870m = i10;
        this.f19871n = i11;
        this.f19872o = f11;
        this.f19873p = z10;
        this.f19874q = z11;
        this.f19875r = list;
    }

    public f B(LatLng latLng) {
        c4.s.k(latLng, "center must not be null.");
        this.f19867j = latLng;
        return this;
    }

    public f C(boolean z10) {
        this.f19874q = z10;
        return this;
    }

    public f D(int i10) {
        this.f19871n = i10;
        return this;
    }

    public LatLng E() {
        return this.f19867j;
    }

    public int F() {
        return this.f19871n;
    }

    public double G() {
        return this.f19868k;
    }

    public int H() {
        return this.f19870m;
    }

    public List<n> I() {
        return this.f19875r;
    }

    public float J() {
        return this.f19869l;
    }

    public float K() {
        return this.f19872o;
    }

    public boolean L() {
        return this.f19874q;
    }

    public boolean M() {
        return this.f19873p;
    }

    public f N(double d10) {
        this.f19868k = d10;
        return this;
    }

    public f O(int i10) {
        this.f19870m = i10;
        return this;
    }

    public f P(float f10) {
        this.f19869l = f10;
        return this;
    }

    public f Q(boolean z10) {
        this.f19873p = z10;
        return this;
    }

    public f R(float f10) {
        this.f19872o = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.r(parcel, 2, E(), i10, false);
        d4.c.h(parcel, 3, G());
        d4.c.i(parcel, 4, J());
        d4.c.l(parcel, 5, H());
        d4.c.l(parcel, 6, F());
        d4.c.i(parcel, 7, K());
        d4.c.c(parcel, 8, M());
        d4.c.c(parcel, 9, L());
        d4.c.v(parcel, 10, I(), false);
        d4.c.b(parcel, a10);
    }
}
