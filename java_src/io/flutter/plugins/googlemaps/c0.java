package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
class c0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final w4.z f10637a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(w4.z zVar) {
        this.f10637a = zVar;
    }

    @Override // io.flutter.plugins.googlemaps.d0
    public void a(float f10) {
        this.f10637a.k(f10);
    }

    @Override // io.flutter.plugins.googlemaps.d0
    public void b(boolean z10) {
        this.f10637a.h(z10);
    }

    @Override // io.flutter.plugins.googlemaps.d0
    public void c(float f10) {
        this.f10637a.i(f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f10637a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("fadeIn", Boolean.valueOf(this.f10637a.b()));
        hashMap.put("transparency", Float.valueOf(this.f10637a.d()));
        hashMap.put("id", this.f10637a.c());
        hashMap.put("zIndex", Float.valueOf(this.f10637a.e()));
        hashMap.put("visible", Boolean.valueOf(this.f10637a.f()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f10637a.g();
    }

    @Override // io.flutter.plugins.googlemaps.d0
    public void setVisible(boolean z10) {
        this.f10637a.j(z10);
    }
}
