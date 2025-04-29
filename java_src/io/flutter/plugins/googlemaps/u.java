package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* loaded from: classes.dex */
class u implements v {

    /* renamed from: a  reason: collision with root package name */
    private final w4.o f10694a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10695b;

    /* renamed from: c  reason: collision with root package name */
    private final float f10696c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10697d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(w4.o oVar, boolean z10, float f10) {
        this.f10694a = oVar;
        this.f10696c = f10;
        this.f10697d = z10;
        this.f10695b = oVar.a();
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void a(float f10) {
        this.f10694a.k(f10);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void b(boolean z10) {
        this.f10697d = z10;
        this.f10694a.c(z10);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void c(int i10) {
        this.f10694a.h(i10);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void d(boolean z10) {
        this.f10694a.e(z10);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void e(int i10) {
        this.f10694a.d(i10);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void f(float f10) {
        this.f10694a.i(f10 * this.f10696c);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void g(List<LatLng> list) {
        this.f10694a.g(list);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void h(List<List<LatLng>> list) {
        this.f10694a.f(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.f10697d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String j() {
        return this.f10695b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.f10694a.b();
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void setVisible(boolean z10) {
        this.f10694a.j(z10);
    }
}
