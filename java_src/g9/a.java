package g9;

import android.content.Context;
import i8.a;
import kotlin.jvm.internal.l;
import r8.k;
/* loaded from: classes.dex */
public final class a implements i8.a {

    /* renamed from: j  reason: collision with root package name */
    private k f9048j;

    private final void a(r8.c cVar, Context context) {
        this.f9048j = new k(cVar, "PonnamKarthik/fluttertoast");
        c cVar2 = new c(context);
        k kVar = this.f9048j;
        if (kVar != null) {
            kVar.e(cVar2);
        }
    }

    private final void b() {
        k kVar = this.f9048j;
        if (kVar != null) {
            kVar.e(null);
        }
        this.f9048j = null;
    }

    @Override // i8.a
    public void d(a.b p02) {
        l.e(p02, "p0");
        b();
    }

    @Override // i8.a
    public void m(a.b binding) {
        l.e(binding, "binding");
        r8.c b10 = binding.b();
        l.d(b10, "getBinaryMessenger(...)");
        Context a10 = binding.a();
        l.d(a10, "getApplicationContext(...)");
        a(b10, a10);
    }
}
