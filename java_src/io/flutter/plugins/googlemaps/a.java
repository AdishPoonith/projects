package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final w4.f f10624a = new w4.f();

    /* renamed from: b  reason: collision with root package name */
    private final float f10625b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10626c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(float f10) {
        this.f10625b = f10;
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void a(float f10) {
        this.f10624a.R(f10);
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void b(boolean z10) {
        this.f10626c = z10;
        this.f10624a.C(z10);
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void c(int i10) {
        this.f10624a.O(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w4.f d() {
        return this.f10624a;
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void e(int i10) {
        this.f10624a.D(i10);
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void f(float f10) {
        this.f10624a.P(f10 * this.f10625b);
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void g(double d10) {
        this.f10624a.N(d10);
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void h(LatLng latLng) {
        this.f10624a.B(latLng);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.f10626c;
    }

    @Override // io.flutter.plugins.googlemaps.c
    public void setVisible(boolean z10) {
        this.f10624a.Q(z10);
    }
}
