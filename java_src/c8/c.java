package c8;

import defpackage.g;
import i8.a;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class c implements i8.a, g, j8.a {

    /* renamed from: j  reason: collision with root package name */
    private b f3455j;

    @Override // defpackage.g
    public void a(d msg) {
        l.e(msg, "msg");
        b bVar = this.f3455j;
        l.b(bVar);
        bVar.d(msg);
    }

    @Override // i8.a
    public void d(a.b binding) {
        l.e(binding, "binding");
        g.a aVar = g.f8875a;
        r8.c b10 = binding.b();
        l.d(b10, "getBinaryMessenger(...)");
        aVar.d(b10, null);
        this.f3455j = null;
    }

    @Override // j8.a
    public void e(j8.c binding) {
        l.e(binding, "binding");
        f(binding);
    }

    @Override // j8.a
    public void f(j8.c binding) {
        l.e(binding, "binding");
        b bVar = this.f3455j;
        if (bVar == null) {
            return;
        }
        bVar.c(binding.d());
    }

    @Override // j8.a
    public void g() {
        b bVar = this.f3455j;
        if (bVar == null) {
            return;
        }
        bVar.c(null);
    }

    @Override // defpackage.g
    public defpackage.b isEnabled() {
        b bVar = this.f3455j;
        l.b(bVar);
        return bVar.b();
    }

    @Override // j8.a
    public void j() {
        g();
    }

    @Override // i8.a
    public void m(a.b flutterPluginBinding) {
        l.e(flutterPluginBinding, "flutterPluginBinding");
        g.a aVar = g.f8875a;
        r8.c b10 = flutterPluginBinding.b();
        l.d(b10, "getBinaryMessenger(...)");
        aVar.d(b10, this);
        this.f3455j = new b();
    }
}
