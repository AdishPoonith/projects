package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* loaded from: classes.dex */
class t implements v {

    /* renamed from: a  reason: collision with root package name */
    private final w4.p f10691a = new w4.p();

    /* renamed from: b  reason: collision with root package name */
    private final float f10692b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10693c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(float f10) {
        this.f10692b = f10;
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void a(float f10) {
        this.f10691a.T(f10);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void b(boolean z10) {
        this.f10693c = z10;
        this.f10691a.D(z10);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void c(int i10) {
        this.f10691a.Q(i10);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void d(boolean z10) {
        this.f10691a.F(z10);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void e(int i10) {
        this.f10691a.E(i10);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void f(float f10) {
        this.f10691a.R(f10 * this.f10692b);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void g(List<LatLng> list) {
        this.f10691a.B(list);
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void h(List<List<LatLng>> list) {
        for (List<LatLng> list2 : list) {
            this.f10691a.C(list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w4.p i() {
        return this.f10691a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f10693c;
    }

    @Override // io.flutter.plugins.googlemaps.v
    public void setVisible(boolean z10) {
        this.f10691a.S(z10);
    }
}
