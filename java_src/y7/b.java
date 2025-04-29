package y7;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import i8.a;
import j8.c;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import r8.d;
import r8.j;
import r8.k;
import r8.n;
import s9.m;
import s9.q;
import t9.g0;
/* loaded from: classes.dex */
public final class b implements i8.a, k.c, j8.a, n {

    /* renamed from: r  reason: collision with root package name */
    public static final a f20521r = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private k f20522j;

    /* renamed from: k  reason: collision with root package name */
    private d f20523k;

    /* renamed from: l  reason: collision with root package name */
    private d.b f20524l;

    /* renamed from: m  reason: collision with root package name */
    private c f20525m;

    /* renamed from: n  reason: collision with root package name */
    private String f20526n = "";

    /* renamed from: o  reason: collision with root package name */
    private z7.a f20527o;

    /* renamed from: p  reason: collision with root package name */
    private r8.c f20528p;

    /* renamed from: q  reason: collision with root package name */
    private Activity f20529q;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: y7.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0289b implements d.InterfaceC0247d {
        C0289b() {
        }

        @Override // r8.d.InterfaceC0247d
        public void b(Object obj, d.b bVar) {
            b bVar2 = b.this;
            l.b(bVar);
            bVar2.f20524l = bVar;
        }

        @Override // r8.d.InterfaceC0247d
        public void c(Object obj) {
            b.this.f20524l = null;
        }
    }

    private final void i(r8.c cVar) {
        this.f20528p = cVar;
        this.f20527o = new z7.a(this);
        k kVar = new k(cVar, "twitter_login");
        this.f20522j = kVar;
        l.b(kVar);
        kVar.e(this);
        d dVar = new d(cVar, "twitter_login/event");
        this.f20523k = dVar;
        l.b(dVar);
        dVar.d(new C0289b());
    }

    @Override // r8.k.c
    public void I(j call, k.d result) {
        l.e(call, "call");
        l.e(result, "result");
        if (!l.a(call.f16777a, "setScheme")) {
            result.c();
            return;
        }
        Object obj = call.f16778b;
        l.c(obj, "null cannot be cast to non-null type kotlin.String");
        this.f20526n = (String) obj;
        result.a(null);
    }

    public final r8.c b() {
        return this.f20528p;
    }

    @Override // r8.n
    public boolean c(Intent intent) {
        Map f10;
        l.e(intent, "intent");
        String str = this.f20526n;
        Uri data = intent.getData();
        if (l.a(str, data != null ? data.getScheme() : null)) {
            d.b bVar = this.f20524l;
            if (bVar != null) {
                m[] mVarArr = new m[2];
                mVarArr[0] = q.a("type", "url");
                Uri data2 = intent.getData();
                mVarArr[1] = q.a("url", data2 != null ? data2.toString() : null);
                f10 = g0.f(mVarArr);
                bVar.a(f10);
            }
            return true;
        }
        return false;
    }

    @Override // i8.a
    public void d(a.b flutterPluginBinding) {
        l.e(flutterPluginBinding, "flutterPluginBinding");
        z7.a aVar = this.f20527o;
        l.b(aVar);
        aVar.a();
        this.f20527o = null;
        k kVar = this.f20522j;
        l.b(kVar);
        kVar.e(null);
        this.f20522j = null;
        d dVar = this.f20523k;
        l.b(dVar);
        dVar.d(null);
        this.f20523k = null;
    }

    @Override // j8.a
    public void e(c binding) {
        l.e(binding, "binding");
        this.f20525m = binding;
        this.f20529q = binding.d();
        binding.f(this);
    }

    @Override // j8.a
    public void f(c binding) {
        l.e(binding, "binding");
        this.f20525m = binding;
        this.f20529q = binding.d();
        binding.f(this);
    }

    @Override // j8.a
    public void g() {
        c cVar = this.f20525m;
        if (cVar != null) {
            cVar.h(this);
        }
        this.f20525m = null;
        this.f20529q = null;
    }

    public final Activity h() {
        return this.f20529q;
    }

    @Override // j8.a
    public void j() {
        c cVar = this.f20525m;
        if (cVar != null) {
            cVar.h(this);
        }
        this.f20525m = null;
        this.f20529q = null;
    }

    @Override // i8.a
    public void m(a.b flutterPluginBinding) {
        l.e(flutterPluginBinding, "flutterPluginBinding");
        r8.c b10 = flutterPluginBinding.b();
        l.d(b10, "getBinaryMessenger(...)");
        i(b10);
    }
}
