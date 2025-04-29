package o0;

import android.os.Build;
import i8.a;
import kotlin.jvm.internal.l;
import r8.j;
import r8.k;
/* loaded from: classes.dex */
public final class a implements i8.a, k.c {

    /* renamed from: j  reason: collision with root package name */
    private k f14383j;

    @Override // r8.k.c
    public void I(j call, k.d result) {
        l.e(call, "call");
        l.e(result, "result");
        if (!l.a(call.f16777a, "getPlatformVersion")) {
            result.c();
            return;
        }
        result.a("Android " + Build.VERSION.RELEASE);
    }

    @Override // i8.a
    public void d(a.b binding) {
        l.e(binding, "binding");
        k kVar = this.f14383j;
        if (kVar == null) {
            l.p("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    @Override // i8.a
    public void m(a.b flutterPluginBinding) {
        l.e(flutterPluginBinding, "flutterPluginBinding");
        k kVar = new k(flutterPluginBinding.b(), "maps_launcher");
        this.f14383j = kVar;
        kVar.e(this);
    }
}
