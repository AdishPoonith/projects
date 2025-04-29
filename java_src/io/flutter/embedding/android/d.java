package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.e;
import io.flutter.embedding.android.e;
import java.util.List;
/* loaded from: classes.dex */
public class d extends Activity implements e.c, androidx.lifecycle.i {

    /* renamed from: m  reason: collision with root package name */
    public static final int f10143m = f9.h.d(61938);

    /* renamed from: j  reason: collision with root package name */
    protected e f10144j;

    /* renamed from: k  reason: collision with root package name */
    private androidx.lifecycle.j f10145k;

    /* renamed from: l  reason: collision with root package name */
    private final OnBackInvokedCallback f10146l;

    /* loaded from: classes.dex */
    class a implements OnBackInvokedCallback {
        a() {
        }

        public void onBackInvoked() {
            d.this.onBackPressed();
        }
    }

    public d() {
        this.f10146l = Build.VERSION.SDK_INT >= 33 ? new a() : null;
        this.f10145k = new androidx.lifecycle.j(this);
    }

    private void E() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void F() {
        if (H() == f.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View G() {
        return this.f10144j.s(null, null, null, f10143m, y() == v.surface);
    }

    private Drawable K() {
        try {
            Bundle J = J();
            int i10 = J != null ? J.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i10 != 0) {
                return androidx.core.content.res.h.d(getResources(), i10, getTheme());
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (Resources.NotFoundException e10) {
            d8.b.b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e10;
        }
    }

    private boolean L() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private boolean O(String str) {
        StringBuilder sb;
        String str2;
        e eVar = this.f10144j;
        if (eVar == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else if (eVar.m()) {
            return true;
        } else {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        d8.b.g("FlutterActivity", sb.toString());
        return false;
    }

    private void P() {
        try {
            Bundle J = J();
            if (J != null) {
                int i10 = J.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i10 != -1) {
                    setTheme(i10);
                }
            } else {
                d8.b.f("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            d8.b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.embedding.engine.a A(Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.e.c
    public y B() {
        return H() == f.opaque ? y.opaque : y.transparent;
    }

    @Override // io.flutter.embedding.android.e.c
    public void C(i iVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public void D(io.flutter.embedding.engine.a aVar) {
        if (this.f10144j.n()) {
            return;
        }
        o8.a.a(aVar);
    }

    protected f H() {
        return getIntent().hasExtra("background_mode") ? f.valueOf(getIntent().getStringExtra("background_mode")) : f.opaque;
    }

    protected io.flutter.embedding.engine.a I() {
        return this.f10144j.l();
    }

    protected Bundle J() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public void M() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f10146l);
        }
    }

    public void N() {
        Q();
        e eVar = this.f10144j;
        if (eVar != null) {
            eVar.G();
            this.f10144j = null;
        }
    }

    public void Q() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f10146l);
        }
    }

    @Override // io.flutter.embedding.android.e.c, androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        return this.f10145k;
    }

    @Override // io.flutter.plugin.platform.c.d
    public boolean b() {
        return false;
    }

    @Override // io.flutter.embedding.android.e.c
    public void c() {
    }

    @Override // io.flutter.embedding.android.e.c
    public Activity d() {
        return this;
    }

    @Override // io.flutter.embedding.android.e.c
    public void e() {
        d8.b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + I() + " evicted by another attaching activity");
        e eVar = this.f10144j;
        if (eVar != null) {
            eVar.t();
            this.f10144j.u();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public String g() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // io.flutter.embedding.android.e.c
    public Context getContext() {
        return this;
    }

    @Override // io.flutter.embedding.android.e.c
    public String h() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle J = J();
            if (J != null) {
                return J.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public List<String> k() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean l() {
        return true;
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean m() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (o() != null || this.f10144j.n()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean n() {
        return true;
    }

    @Override // io.flutter.embedding.android.e.c
    public String o() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (O("onActivityResult")) {
            this.f10144j.p(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (O("onBackPressed")) {
            this.f10144j.r();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        P();
        super.onCreate(bundle);
        e eVar = new e(this);
        this.f10144j = eVar;
        eVar.q(this);
        this.f10144j.z(bundle);
        this.f10145k.h(e.a.ON_CREATE);
        M();
        F();
        setContentView(G());
        E();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (O("onDestroy")) {
            this.f10144j.t();
            this.f10144j.u();
        }
        N();
        this.f10145k.h(e.a.ON_DESTROY);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (O("onNewIntent")) {
            this.f10144j.v(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (O("onPause")) {
            this.f10144j.w();
        }
        this.f10145k.h(e.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (O("onPostResume")) {
            this.f10144j.x();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (O("onRequestPermissionsResult")) {
            this.f10144j.y(i10, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f10145k.h(e.a.ON_RESUME);
        if (O("onResume")) {
            this.f10144j.A();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (O("onSaveInstanceState")) {
            this.f10144j.B(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f10145k.h(e.a.ON_START);
        if (O("onStart")) {
            this.f10144j.C();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (O("onStop")) {
            this.f10144j.D();
        }
        this.f10145k.h(e.a.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (O("onTrimMemory")) {
            this.f10144j.E(i10);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (O("onUserLeaveHint")) {
            this.f10144j.F();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean p() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : o() == null;
    }

    @Override // io.flutter.embedding.android.e.c
    public String q() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle J = J();
            String string = J != null ? J.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public void r(io.flutter.embedding.engine.a aVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public String s() {
        try {
            Bundle J = J();
            if (J != null) {
                return J.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.plugin.platform.c t(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new io.flutter.plugin.platform.c(d(), aVar.n(), this);
    }

    @Override // io.flutter.embedding.android.e.c
    public void u(h hVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public String v() {
        String dataString;
        if (L() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean w() {
        try {
            Bundle J = J();
            if (J != null) {
                return J.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.embedding.engine.g x() {
        return io.flutter.embedding.engine.g.a(getIntent());
    }

    @Override // io.flutter.embedding.android.e.c
    public v y() {
        return H() == f.opaque ? v.surface : v.texture;
    }

    @Override // io.flutter.embedding.android.e.c
    public x z() {
        Drawable K = K();
        if (K != null) {
            return new b(K);
        }
        return null;
    }
}
