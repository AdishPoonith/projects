package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* loaded from: classes.dex */
class y implements z {

    /* renamed from: a  reason: collision with root package name */
    private final w4.q f10706a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10707b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10708c;

    /* renamed from: d  reason: collision with root package name */
    private final float f10709d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(w4.q qVar, boolean z10, float f10) {
        this.f10706a = qVar;
        this.f10708c = z10;
        this.f10709d = f10;
        this.f10707b = qVar.a();
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void a(float f10) {
        this.f10706a.m(f10);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void b(boolean z10) {
        this.f10708c = z10;
        this.f10706a.c(z10);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void c(List<w4.n> list) {
        this.f10706a.h(list);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void d(boolean z10) {
        this.f10706a.f(z10);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void e(int i10) {
        this.f10706a.g(i10);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void f(float f10) {
        this.f10706a.l(f10 * this.f10709d);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void g(List<LatLng> list) {
        this.f10706a.i(list);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void h(w4.d dVar) {
        this.f10706a.e(dVar);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void i(w4.d dVar) {
        this.f10706a.j(dVar);
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void j(int i10) {
        this.f10706a.d(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return this.f10708c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String l() {
        return this.f10707b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        this.f10706a.b();
    }

    @Override // io.flutter.plugins.googlemaps.z
    public void setVisible(boolean z10) {
        this.f10706a.k(z10);
    }
}
