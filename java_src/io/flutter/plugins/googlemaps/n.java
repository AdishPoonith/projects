package io.flutter.plugins.googlemaps;

import i8.a;
/* loaded from: classes.dex */
public class n implements i8.a, j8.a {

    /* renamed from: j  reason: collision with root package name */
    androidx.lifecycle.e f10680j;

    /* loaded from: classes.dex */
    class a implements o {
        a() {
        }

        @Override // io.flutter.plugins.googlemaps.o
        public androidx.lifecycle.e a() {
            return n.this.f10680j;
        }
    }

    @Override // i8.a
    public void d(a.b bVar) {
    }

    @Override // j8.a
    public void e(j8.c cVar) {
        f(cVar);
    }

    @Override // j8.a
    public void f(j8.c cVar) {
        this.f10680j = m8.a.a(cVar);
    }

    @Override // j8.a
    public void g() {
        this.f10680j = null;
    }

    @Override // j8.a
    public void j() {
        g();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        bVar.c().a("plugins.flutter.dev/google_maps_android", new j(bVar.b(), bVar.a(), new a()));
    }
}
