package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import e8.a;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.c;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
class e implements io.flutter.embedding.android.c<Activity> {

    /* renamed from: a  reason: collision with root package name */
    private c f10148a;

    /* renamed from: b  reason: collision with root package name */
    private io.flutter.embedding.engine.a f10149b;

    /* renamed from: c  reason: collision with root package name */
    k f10150c;

    /* renamed from: d  reason: collision with root package name */
    private io.flutter.plugin.platform.c f10151d;

    /* renamed from: e  reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f10152e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10153f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10154g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10155h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10156i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f10157j;

    /* renamed from: k  reason: collision with root package name */
    private io.flutter.embedding.engine.d f10158k;

    /* renamed from: l  reason: collision with root package name */
    private final p8.b f10159l;

    /* loaded from: classes.dex */
    class a implements p8.b {
        a() {
        }

        @Override // p8.b
        public void c() {
            e.this.f10148a.c();
            e.this.f10154g = false;
        }

        @Override // p8.b
        public void f() {
            e.this.f10148a.f();
            e.this.f10154g = true;
            e.this.f10155h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ k f10161j;

        b(k kVar) {
            this.f10161j = kVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (e.this.f10154g && e.this.f10152e != null) {
                this.f10161j.getViewTreeObserver().removeOnPreDrawListener(this);
                e.this.f10152e = null;
            }
            return e.this.f10154g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c extends c.d {
        io.flutter.embedding.engine.a A(Context context);

        y B();

        void C(i iVar);

        void D(io.flutter.embedding.engine.a aVar);

        androidx.lifecycle.e a();

        void c();

        Activity d();

        void e();

        void f();

        String g();

        Context getContext();

        String h();

        List<String> k();

        boolean l();

        boolean m();

        boolean n();

        String o();

        boolean p();

        String q();

        void r(io.flutter.embedding.engine.a aVar);

        String s();

        io.flutter.plugin.platform.c t(Activity activity, io.flutter.embedding.engine.a aVar);

        void u(h hVar);

        String v();

        boolean w();

        io.flutter.embedding.engine.g x();

        v y();

        x z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(c cVar) {
        this(cVar, null);
    }

    e(c cVar, io.flutter.embedding.engine.d dVar) {
        this.f10159l = new a();
        this.f10148a = cVar;
        this.f10155h = false;
        this.f10158k = dVar;
    }

    private d.b g(d.b bVar) {
        String v10 = this.f10148a.v();
        if (v10 == null || v10.isEmpty()) {
            v10 = d8.a.e().c().f();
        }
        a.b bVar2 = new a.b(v10, this.f10148a.q());
        String h10 = this.f10148a.h();
        if (h10 == null && (h10 = o(this.f10148a.d().getIntent())) == null) {
            h10 = "/";
        }
        return bVar.i(bVar2).k(h10).j(this.f10148a.k());
    }

    private void h(k kVar) {
        if (this.f10148a.y() != v.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f10152e != null) {
            kVar.getViewTreeObserver().removeOnPreDrawListener(this.f10152e);
        }
        this.f10152e = new b(kVar);
        kVar.getViewTreeObserver().addOnPreDrawListener(this.f10152e);
    }

    private void i() {
        String str;
        if (this.f10148a.o() == null && !this.f10149b.i().l()) {
            String h10 = this.f10148a.h();
            if (h10 == null && (h10 = o(this.f10148a.d().getIntent())) == null) {
                h10 = "/";
            }
            String s10 = this.f10148a.s();
            if (("Executing Dart entrypoint: " + this.f10148a.q() + ", library uri: " + s10) == null) {
                str = "\"\"";
            } else {
                str = s10 + ", and sending initial route: " + h10;
            }
            d8.b.f("FlutterActivityAndFragmentDelegate", str);
            this.f10149b.m().c(h10);
            String v10 = this.f10148a.v();
            if (v10 == null || v10.isEmpty()) {
                v10 = d8.a.e().c().f();
            }
            this.f10149b.i().j(s10 == null ? new a.b(v10, this.f10148a.q()) : new a.b(v10, s10, this.f10148a.q()), this.f10148a.k());
        }
    }

    private void j() {
        if (this.f10148a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String o(Intent intent) {
        Uri data;
        String path;
        if (!this.f10148a.w() || (data = intent.getData()) == null || (path = data.getPath()) == null || path.isEmpty()) {
            return null;
        }
        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
            path = path + "?" + data.getQuery();
        }
        if (data.getFragment() == null || data.getFragment().isEmpty()) {
            return path;
        }
        return path + "#" + data.getFragment();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        d8.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        j();
        if (this.f10148a.n()) {
            this.f10149b.j().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(Bundle bundle) {
        d8.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        j();
        if (this.f10148a.p()) {
            bundle.putByteArray("framework", this.f10149b.r().h());
        }
        if (this.f10148a.l()) {
            Bundle bundle2 = new Bundle();
            this.f10149b.h().a(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        d8.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        j();
        i();
        Integer num = this.f10157j;
        if (num != null) {
            this.f10150c.setVisibility(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        d8.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        j();
        if (this.f10148a.n()) {
            this.f10149b.j().c();
        }
        this.f10157j = Integer.valueOf(this.f10150c.getVisibility());
        this.f10150c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(int i10) {
        j();
        io.flutter.embedding.engine.a aVar = this.f10149b;
        if (aVar != null) {
            if (this.f10155h && i10 >= 10) {
                aVar.i().m();
                this.f10149b.u().a();
            }
            this.f10149b.q().n(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        j();
        if (this.f10149b == null) {
            d8.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d8.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
        this.f10149b.h().e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        this.f10148a = null;
        this.f10149b = null;
        this.f10150c = null;
        this.f10151d = null;
    }

    void H() {
        io.flutter.embedding.engine.d dVar;
        d.b l10;
        d8.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String o10 = this.f10148a.o();
        if (o10 != null) {
            io.flutter.embedding.engine.a a10 = io.flutter.embedding.engine.b.b().a(o10);
            this.f10149b = a10;
            this.f10153f = true;
            if (a10 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + o10 + "'");
        }
        c cVar = this.f10148a;
        io.flutter.embedding.engine.a A = cVar.A(cVar.getContext());
        this.f10149b = A;
        if (A != null) {
            this.f10153f = true;
            return;
        }
        String g10 = this.f10148a.g();
        if (g10 != null) {
            dVar = io.flutter.embedding.engine.e.b().a(g10);
            if (dVar == null) {
                throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + g10 + "'");
            }
            l10 = new d.b(this.f10148a.getContext());
        } else {
            d8.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            dVar = this.f10158k;
            if (dVar == null) {
                dVar = new io.flutter.embedding.engine.d(this.f10148a.getContext(), this.f10148a.x().b());
            }
            l10 = new d.b(this.f10148a.getContext()).h(false).l(this.f10148a.p());
        }
        this.f10149b = dVar.a(g(l10));
        this.f10153f = false;
    }

    void I() {
        io.flutter.plugin.platform.c cVar = this.f10151d;
        if (cVar != null) {
            cVar.A();
        }
    }

    @Override // io.flutter.embedding.android.c
    public void e() {
        if (!this.f10148a.m()) {
            this.f10148a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f10148a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    @Override // io.flutter.embedding.android.c
    /* renamed from: k */
    public Activity f() {
        Activity d10 = this.f10148a.d();
        if (d10 != null) {
            return d10;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public io.flutter.embedding.engine.a l() {
        return this.f10149b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f10156i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f10153f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i10, int i11, Intent intent) {
        j();
        if (this.f10149b == null) {
            d8.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d8.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i10 + "\nresultCode: " + i11 + "\ndata: " + intent);
        this.f10149b.h().b(i10, i11, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context) {
        j();
        if (this.f10149b == null) {
            H();
        }
        if (this.f10148a.l()) {
            d8.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f10149b.h().f(this, this.f10148a.a());
        }
        c cVar = this.f10148a;
        this.f10151d = cVar.t(cVar.d(), this.f10149b);
        this.f10148a.D(this.f10149b);
        this.f10156i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        j();
        if (this.f10149b == null) {
            d8.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            return;
        }
        d8.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
        this.f10149b.m().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i10, boolean z10) {
        k kVar;
        d8.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        j();
        if (this.f10148a.y() == v.surface) {
            h hVar = new h(this.f10148a.getContext(), this.f10148a.B() == y.transparent);
            this.f10148a.u(hVar);
            kVar = new k(this.f10148a.getContext(), hVar);
        } else {
            i iVar = new i(this.f10148a.getContext());
            iVar.setOpaque(this.f10148a.B() == y.opaque);
            this.f10148a.C(iVar);
            kVar = new k(this.f10148a.getContext(), iVar);
        }
        this.f10150c = kVar;
        this.f10150c.m(this.f10159l);
        d8.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f10150c.o(this.f10149b);
        this.f10150c.setId(i10);
        x z11 = this.f10148a.z();
        if (z11 == null) {
            if (z10) {
                h(this.f10150c);
            }
            return this.f10150c;
        }
        d8.b.g("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
        FlutterSplashView flutterSplashView = new FlutterSplashView(this.f10148a.getContext());
        flutterSplashView.setId(f9.h.d(486947586));
        flutterSplashView.g(this.f10150c, z11);
        return flutterSplashView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        d8.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        j();
        if (this.f10152e != null) {
            this.f10150c.getViewTreeObserver().removeOnPreDrawListener(this.f10152e);
            this.f10152e = null;
        }
        this.f10150c.t();
        this.f10150c.B(this.f10159l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        d8.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
        j();
        this.f10148a.r(this.f10149b);
        if (this.f10148a.l()) {
            d8.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f10148a.d().isChangingConfigurations()) {
                this.f10149b.h().g();
            } else {
                this.f10149b.h().h();
            }
        }
        io.flutter.plugin.platform.c cVar = this.f10151d;
        if (cVar != null) {
            cVar.o();
            this.f10151d = null;
        }
        if (this.f10148a.n()) {
            this.f10149b.j().a();
        }
        if (this.f10148a.m()) {
            this.f10149b.f();
            if (this.f10148a.o() != null) {
                io.flutter.embedding.engine.b.b().d(this.f10148a.o());
            }
            this.f10149b = null;
        }
        this.f10156i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(Intent intent) {
        j();
        if (this.f10149b == null) {
            d8.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d8.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.f10149b.h().c(intent);
        String o10 = o(intent);
        if (o10 == null || o10.isEmpty()) {
            return;
        }
        this.f10149b.m().b(o10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        d8.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        j();
        if (this.f10148a.n()) {
            this.f10149b.j().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        d8.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        j();
        if (this.f10149b != null) {
            I();
        } else {
            d8.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(int i10, String[] strArr, int[] iArr) {
        j();
        if (this.f10149b == null) {
            d8.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d8.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i10 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f10149b.h().onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(Bundle bundle) {
        Bundle bundle2;
        d8.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        j();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f10148a.p()) {
            this.f10149b.r().j(bArr);
        }
        if (this.f10148a.l()) {
            this.f10149b.h().d(bundle2);
        }
    }
}
