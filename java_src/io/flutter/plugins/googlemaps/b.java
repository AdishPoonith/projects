package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final w4.e f10632a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10633b;

    /* renamed from: c  reason: collision with root package name */
    private final float f10634c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10635d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(w4.e eVar, boolean z10, float f10) {
        this.f10632a = eVar;
        this.f10635d = z10;
        this.f10634c = f10;
        this.f10633b = eVar.a();
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void a(float f10) {
        this.f10632a.j(f10);
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void b(boolean z10) {
        this.f10635d = z10;
        this.f10632a.d(z10);
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void c(int i10) {
        this.f10632a.g(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f10635d;
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void e(int i10) {
        this.f10632a.e(i10);
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void f(float f10) {
        this.f10632a.h(f10 * this.f10634c);
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void g(double d10) {
        this.f10632a.f(d10);
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void h(LatLng latLng) {
        this.f10632a.c(latLng);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        return this.f10633b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        this.f10632a.b();
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void setVisible(boolean z10) {
        this.f10632a.i(z10);
    }
}
