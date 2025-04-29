package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
class q implements r {

    /* renamed from: a  reason: collision with root package name */
    private final w4.l f10684a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10685b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10686c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(w4.l lVar, boolean z10) {
        this.f10684a = lVar;
        this.f10686c = z10;
        this.f10685b = lVar.a();
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void a(float f10) {
        this.f10684a.q(f10);
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void b(boolean z10) {
        this.f10686c = z10;
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void c(w4.a aVar) {
        this.f10684a.j(aVar);
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void d(float f10) {
        this.f10684a.f(f10);
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void e(boolean z10) {
        this.f10684a.h(z10);
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void f(boolean z10) {
        this.f10684a.i(z10);
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void g(float f10, float f11) {
        this.f10684a.k(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void h(float f10) {
        this.f10684a.m(f10);
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void i(float f10, float f11) {
        this.f10684a.g(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void j(LatLng latLng) {
        this.f10684a.l(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void k(String str, String str2) {
        this.f10684a.o(str);
        this.f10684a.n(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f10686c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String m() {
        return this.f10685b;
    }

    public void n() {
        this.f10684a.c();
    }

    public boolean o() {
        return this.f10684a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        this.f10684a.e();
    }

    public void q() {
        this.f10684a.r();
    }

    @Override // io.flutter.plugins.googlemaps.r
    public void setVisible(boolean z10) {
        this.f10684a.p(z10);
    }
}
