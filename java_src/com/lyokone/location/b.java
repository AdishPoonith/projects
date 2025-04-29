package com.lyokone.location;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.lyokone.location.FlutterLocationService;
import i8.a;
/* loaded from: classes.dex */
public class b implements i8.a, j8.a {

    /* renamed from: j  reason: collision with root package name */
    private c f7477j;

    /* renamed from: k  reason: collision with root package name */
    private d f7478k;

    /* renamed from: l  reason: collision with root package name */
    private FlutterLocationService f7479l;

    /* renamed from: m  reason: collision with root package name */
    private j8.c f7480m;

    /* renamed from: n  reason: collision with root package name */
    private final ServiceConnection f7481n = new a();

    /* loaded from: classes.dex */
    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("LocationPlugin", "Service connected: " + componentName);
            b.this.i(((FlutterLocationService.b) iBinder).a());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("LocationPlugin", "Service disconnected:" + componentName);
        }
    }

    private void b(j8.c cVar) {
        this.f7480m = cVar;
        cVar.d().bindService(new Intent(cVar.d(), FlutterLocationService.class), this.f7481n, 1);
    }

    private void c() {
        h();
        this.f7480m.d().unbindService(this.f7481n);
        this.f7480m = null;
    }

    private void h() {
        this.f7478k.a(null);
        this.f7477j.j(null);
        this.f7477j.i(null);
        this.f7480m.e(this.f7479l.h());
        this.f7480m.e(this.f7479l.g());
        this.f7480m.g(this.f7479l.f());
        this.f7479l.k(null);
        this.f7479l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(FlutterLocationService flutterLocationService) {
        this.f7479l = flutterLocationService;
        flutterLocationService.k(this.f7480m.d());
        this.f7480m.b(this.f7479l.f());
        this.f7480m.c(this.f7479l.g());
        this.f7480m.c(this.f7479l.h());
        this.f7477j.i(this.f7479l.e());
        this.f7477j.j(this.f7479l);
        this.f7478k.a(this.f7479l.e());
    }

    @Override // i8.a
    public void d(a.b bVar) {
        c cVar = this.f7477j;
        if (cVar != null) {
            cVar.l();
            this.f7477j = null;
        }
        d dVar = this.f7478k;
        if (dVar != null) {
            dVar.e();
            this.f7478k = null;
        }
    }

    @Override // j8.a
    public void e(j8.c cVar) {
        b(cVar);
    }

    @Override // j8.a
    public void f(j8.c cVar) {
        b(cVar);
    }

    @Override // j8.a
    public void g() {
        c();
    }

    @Override // j8.a
    public void j() {
        c();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        c cVar = new c();
        this.f7477j = cVar;
        cVar.k(bVar.b());
        d dVar = new d();
        this.f7478k = dVar;
        dVar.d(bVar.b());
    }
}
