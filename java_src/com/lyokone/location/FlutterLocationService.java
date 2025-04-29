package com.lyokone.location;

import android.app.Activity;
import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import r8.k;
import r8.m;
import r8.p;
import s9.q;
import s9.u;
import t9.g0;
import x7.f;
/* loaded from: classes.dex */
public final class FlutterLocationService extends Service implements p {

    /* renamed from: p  reason: collision with root package name */
    public static final a f7450p = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private final b f7451j = new b();

    /* renamed from: k  reason: collision with root package name */
    private boolean f7452k;

    /* renamed from: l  reason: collision with root package name */
    private Activity f7453l;

    /* renamed from: m  reason: collision with root package name */
    private x7.a f7454m;

    /* renamed from: n  reason: collision with root package name */
    private com.lyokone.location.a f7455n;

    /* renamed from: o  reason: collision with root package name */
    private k.d f7456o;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class b extends Binder {
        public b() {
        }

        public final FlutterLocationService a() {
            return FlutterLocationService.this;
        }
    }

    private final boolean m() {
        if (Build.VERSION.SDK_INT >= 29) {
            Activity activity = this.f7453l;
            if (activity != null) {
                return androidx.core.app.b.o(activity, "android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            throw new ActivityNotFoundException();
        }
        return false;
    }

    public final Map<String, Object> a(f options) {
        Map<String, Object> f10;
        l.e(options, "options");
        x7.a aVar = this.f7454m;
        if (aVar != null) {
            aVar.f(options, this.f7452k);
        }
        if (this.f7452k) {
            f10 = g0.f(q.a("channelId", "flutter_location_channel_01"), q.a("notificationId", 75418));
            return f10;
        }
        return null;
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            Activity activity = this.f7453l;
            if (activity != null) {
                return androidx.core.content.a.a(activity, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
            }
            throw new ActivityNotFoundException();
        }
        com.lyokone.location.a aVar = this.f7455n;
        if (aVar != null) {
            return aVar.i();
        }
        return false;
    }

    public final void c() {
        Log.d("FlutterLocationService", "Stop service in foreground.");
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(1);
        } else {
            stopForeground(true);
        }
        this.f7452k = false;
    }

    public final void d() {
        if (this.f7452k) {
            Log.d("FlutterLocationService", "Service already in foreground mode.");
            return;
        }
        Log.d("FlutterLocationService", "Start service in foreground mode.");
        x7.a aVar = this.f7454m;
        l.b(aVar);
        startForeground(75418, aVar.a());
        this.f7452k = true;
    }

    public final com.lyokone.location.a e() {
        return this.f7455n;
    }

    public final m f() {
        return this.f7455n;
    }

    public final p g() {
        return this.f7455n;
    }

    public final p h() {
        return this;
    }

    public final boolean i() {
        return this.f7452k;
    }

    public final void j() {
        u uVar = null;
        if (Build.VERSION.SDK_INT >= 29) {
            Activity activity = this.f7453l;
            if (activity != null) {
                androidx.core.app.b.n(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 641);
                uVar = u.f17878a;
            }
            if (uVar == null) {
                throw new ActivityNotFoundException();
            }
            return;
        }
        com.lyokone.location.a aVar = this.f7455n;
        if (aVar != null) {
            aVar.f7471w = this.f7456o;
        }
        if (aVar != null) {
            aVar.r();
        }
        this.f7456o = null;
    }

    public final void k(Activity activity) {
        this.f7453l = activity;
        com.lyokone.location.a aVar = this.f7455n;
        if (aVar != null) {
            aVar.u(activity);
        }
    }

    public final void l(k.d dVar) {
        this.f7456o = dVar;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Log.d("FlutterLocationService", "Binding to location service.");
        return this.f7451j;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d("FlutterLocationService", "Creating service.");
        this.f7455n = new com.lyokone.location.a(getApplicationContext(), null);
        Context applicationContext = getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        this.f7454m = new x7.a(applicationContext, "flutter_location_channel_01", 75418);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.d("FlutterLocationService", "Destroying service.");
        this.f7455n = null;
        this.f7454m = null;
        super.onDestroy();
    }

    @Override // r8.p
    public boolean onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        k.d dVar;
        String str;
        String str2;
        l.e(permissions, "permissions");
        l.e(grantResults, "grantResults");
        if (Build.VERSION.SDK_INT >= 29 && i10 == 641 && permissions.length == 2 && l.a(permissions[0], "android.permission.ACCESS_FINE_LOCATION") && l.a(permissions[1], "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (grantResults[0] == 0 && grantResults[1] == 0) {
                d();
                k.d dVar2 = this.f7456o;
                if (dVar2 != null) {
                    dVar2.a(1);
                }
            } else if (m()) {
                dVar = this.f7456o;
                if (dVar != null) {
                    str = "PERMISSION_DENIED";
                    str2 = "Background location permission denied";
                    dVar.b(str, str2, null);
                }
            } else {
                dVar = this.f7456o;
                if (dVar != null) {
                    str = "PERMISSION_DENIED_NEVER_ASK";
                    str2 = "Background location permission denied forever - please open app settings";
                    dVar.b(str, str2, null);
                }
            }
            this.f7456o = null;
        }
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Log.d("FlutterLocationService", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
