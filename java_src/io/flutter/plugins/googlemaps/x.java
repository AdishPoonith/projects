package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* loaded from: classes.dex */
class x implements z {

    /* renamed from: a  reason: collision with root package name */
    private final w4.r f10703a = new w4.r();

    /* renamed from: b  reason: collision with root package name */
    private boolean f10704b;

    /* renamed from: c  reason: collision with root package name */
    private final float f10705c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(float f10) {
        this.f10705c = f10;
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void a(float f10) {
        this.f10703a.W(f10);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void b(boolean z10) {
        this.f10704b = z10;
        this.f10703a.C(z10);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void c(List<w4.n> list) {
        this.f10703a.S(list);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void d(boolean z10) {
        this.f10703a.F(z10);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void e(int i10) {
        this.f10703a.R(i10);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void f(float f10) {
        this.f10703a.V(f10 * this.f10705c);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void g(List<LatLng> list) {
        this.f10703a.B(list);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void h(w4.d dVar) {
        this.f10703a.E(dVar);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void i(w4.d dVar) {
        this.f10703a.T(dVar);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void j(int i10) {
        this.f10703a.D(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w4.r k() {
        return this.f10703a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f10704b;
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void setVisible(boolean z10) {
        this.f10703a.U(z10);
    }
}
