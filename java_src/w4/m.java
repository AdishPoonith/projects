package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import k4.b;
/* loaded from: classes.dex */
public final class m extends d4.a {
    public static final Parcelable.Creator<m> CREATOR = new n0();

    /* renamed from: j  reason: collision with root package name */
    private LatLng f19884j;

    /* renamed from: k  reason: collision with root package name */
    private String f19885k;

    /* renamed from: l  reason: collision with root package name */
    private String f19886l;

    /* renamed from: m  reason: collision with root package name */
    private a f19887m;

    /* renamed from: n  reason: collision with root package name */
    private float f19888n;

    /* renamed from: o  reason: collision with root package name */
    private float f19889o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f19890p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f19891q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f19892r;

    /* renamed from: s  reason: collision with root package name */
    private float f19893s;

    /* renamed from: t  reason: collision with root package name */
    private float f19894t;

    /* renamed from: u  reason: collision with root package name */
    private float f19895u;

    /* renamed from: v  reason: collision with root package name */
    private float f19896v;

    /* renamed from: w  reason: collision with root package name */
    private float f19897w;

    public m() {
        this.f19888n = 0.5f;
        this.f19889o = 1.0f;
        this.f19891q = true;
        this.f19892r = false;
        this.f19893s = 0.0f;
        this.f19894t = 0.5f;
        this.f19895u = 0.0f;
        this.f19896v = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16) {
        this.f19888n = 0.5f;
        this.f19889o = 1.0f;
        this.f19891q = true;
        this.f19892r = false;
        this.f19893s = 0.0f;
        this.f19894t = 0.5f;
        this.f19895u = 0.0f;
        this.f19896v = 1.0f;
        this.f19884j = latLng;
        this.f19885k = str;
        this.f19886l = str2;
        this.f19887m = iBinder == null ? null : new a(b.a.x(iBinder));
        this.f19888n = f10;
        this.f19889o = f11;
        this.f19890p = z10;
        this.f19891q = z11;
        this.f19892r = z12;
        this.f19893s = f12;
        this.f19894t = f13;
        this.f19895u = f14;
        this.f19896v = f15;
        this.f19897w = f16;
    }

    public m B(float f10) {
        this.f19896v = f10;
        return this;
    }

    public m C(float f10, float f11) {
        this.f19888n = f10;
        this.f19889o = f11;
        return this;
    }

    public m D(boolean z10) {
        this.f19890p = z10;
        return this;
    }

    public m E(boolean z10) {
        this.f19892r = z10;
        return this;
    }

    public float F() {
        return this.f19896v;
    }

    public float G() {
        return this.f19888n;
    }

    public float H() {
        return this.f19889o;
    }

    public float I() {
        return this.f19894t;
    }

    public float J() {
        return this.f19895u;
    }

    public LatLng K() {
        return this.f19884j;
    }

    public float L() {
        return this.f19893s;
    }

    public String M() {
        return this.f19886l;
    }

    public String N() {
        return this.f19885k;
    }

    public float O() {
        return this.f19897w;
    }

    public m P(a aVar) {
        this.f19887m = aVar;
        return this;
    }

    public m Q(float f10, float f11) {
        this.f19894t = f10;
        this.f19895u = f11;
        return this;
    }

    public boolean R() {
        return this.f19890p;
    }

    public boolean S() {
        return this.f19892r;
    }

    public boolean T() {
        return this.f19891q;
    }

    public m U(LatLng latLng) {
        if (latLng != null) {
            this.f19884j = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public m V(float f10) {
        this.f19893s = f10;
        return this;
    }

    public m W(String str) {
        this.f19886l = str;
        return this;
    }

    public m X(String str) {
        this.f19885k = str;
        return this;
    }

    public m Y(boolean z10) {
        this.f19891q = z10;
        return this;
    }

    public m Z(float f10) {
        this.f19897w = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.r(parcel, 2, K(), i10, false);
        d4.c.s(parcel, 3, N(), false);
        d4.c.s(parcel, 4, M(), false);
        a aVar = this.f19887m;
        d4.c.k(parcel, 5, aVar == null ? null : aVar.a().asBinder(), false);
        d4.c.i(parcel, 6, G());
        d4.c.i(parcel, 7, H());
        d4.c.c(parcel, 8, R());
        d4.c.c(parcel, 9, T());
        d4.c.c(parcel, 10, S());
        d4.c.i(parcel, 11, L());
        d4.c.i(parcel, 12, I());
        d4.c.i(parcel, 13, J());
        d4.c.i(parcel, 14, F());
        d4.c.i(parcel, 15, O());
        d4.c.b(parcel, a10);
    }
}
