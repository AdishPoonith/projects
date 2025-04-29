package io.flutter.plugins.googlemaps;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class f implements m {

    /* renamed from: q  reason: collision with root package name */
    private Object f10653q;

    /* renamed from: r  reason: collision with root package name */
    private Object f10654r;

    /* renamed from: s  reason: collision with root package name */
    private Object f10655s;

    /* renamed from: t  reason: collision with root package name */
    private Object f10656t;

    /* renamed from: u  reason: collision with root package name */
    private List<Map<String, ?>> f10657u;

    /* renamed from: j  reason: collision with root package name */
    private final GoogleMapOptions f10646j = new GoogleMapOptions();

    /* renamed from: k  reason: collision with root package name */
    private boolean f10647k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10648l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10649m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10650n = true;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10651o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10652p = true;

    /* renamed from: v  reason: collision with root package name */
    private Rect f10658v = new Rect(0, 0, 0, 0);

    @Override // io.flutter.plugins.googlemaps.m
    public void B(boolean z10) {
        this.f10646j.T(z10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void C(boolean z10) {
        this.f10648l = z10;
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void D(boolean z10) {
        this.f10646j.V(z10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void F(boolean z10) {
        this.f10646j.U(z10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void G(boolean z10) {
        this.f10651o = z10;
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void J(boolean z10) {
        this.f10646j.R(z10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void K(float f10, float f11, float f12, float f13) {
        this.f10658v = new Rect((int) f11, (int) f10, (int) f13, (int) f12);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void L(boolean z10) {
        this.f10647k = z10;
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void M(boolean z10) {
        this.f10646j.M(z10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void N(LatLngBounds latLngBounds) {
        this.f10646j.L(latLngBounds);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void S(Float f10, Float f11) {
        if (f10 != null) {
            this.f10646j.Q(f10.floatValue());
        }
        if (f11 != null) {
            this.f10646j.P(f11.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleMapController a(int i10, Context context, r8.c cVar, o oVar) {
        GoogleMapController googleMapController = new GoogleMapController(i10, context, cVar, oVar, this.f10646j);
        googleMapController.e0();
        googleMapController.C(this.f10648l);
        googleMapController.m(this.f10649m);
        googleMapController.k(this.f10650n);
        googleMapController.G(this.f10651o);
        googleMapController.f(this.f10652p);
        googleMapController.L(this.f10647k);
        googleMapController.n0(this.f10653q);
        googleMapController.p0(this.f10654r);
        googleMapController.q0(this.f10655s);
        googleMapController.m0(this.f10656t);
        Rect rect = this.f10658v;
        googleMapController.K(rect.top, rect.left, rect.bottom, rect.right);
        googleMapController.r0(this.f10657u);
        return googleMapController;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(CameraPosition cameraPosition) {
        this.f10646j.B(cameraPosition);
    }

    public void c(Object obj) {
        this.f10656t = obj;
    }

    public void d(Object obj) {
        this.f10653q = obj;
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void e(int i10) {
        this.f10646j.O(i10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void f(boolean z10) {
        this.f10652p = z10;
    }

    public void g(Object obj) {
        this.f10654r = obj;
    }

    public void h(Object obj) {
        this.f10655s = obj;
    }

    public void i(List<Map<String, ?>> list) {
        this.f10657u = list;
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void k(boolean z10) {
        this.f10650n = z10;
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void m(boolean z10) {
        this.f10649m = z10;
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void n(boolean z10) {
        this.f10646j.C(z10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void o(boolean z10) {
        this.f10646j.N(z10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void u(boolean z10) {
        this.f10646j.S(z10);
    }
}
