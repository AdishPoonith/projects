package com.lyokone.location;

import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import r8.j;
import r8.k;
import x7.f;
/* loaded from: classes.dex */
final class c implements k.c {

    /* renamed from: j  reason: collision with root package name */
    private a f7483j;

    /* renamed from: k  reason: collision with root package name */
    private FlutterLocationService f7484k;

    /* renamed from: l  reason: collision with root package name */
    private k f7485l;

    private void a(j jVar, k.d dVar) {
        Boolean bool = (Boolean) jVar.a("enable");
        FlutterLocationService flutterLocationService = this.f7484k;
        if (flutterLocationService != null && bool != null) {
            boolean b10 = flutterLocationService.b();
            boolean booleanValue = bool.booleanValue();
            if (b10) {
                if (booleanValue) {
                    this.f7484k.d();
                    dVar.a(1);
                    return;
                }
            } else if (booleanValue) {
                this.f7484k.l(dVar);
                this.f7484k.j();
                return;
            }
            this.f7484k.c();
        }
        dVar.a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    private void b(k.d dVar) {
        FlutterLocationService flutterLocationService = this.f7484k;
        dVar.a(Integer.valueOf((int) (flutterLocationService != null ? flutterLocationService.i() : 0)));
    }

    private void c(j jVar, k.d dVar) {
        try {
            String str = (String) jVar.a("channelName");
            if (str == null) {
                str = "Location background service";
            }
            String str2 = str;
            String str3 = (String) jVar.a("title");
            if (str3 == null) {
                str3 = "Location background service running";
            }
            String str4 = str3;
            String str5 = (String) jVar.a("iconName");
            if (str5 == null) {
                str5 = "navigation_empty_icon";
            }
            String str6 = str5;
            String str7 = (String) jVar.a("subtitle");
            String str8 = (String) jVar.a("description");
            Boolean bool = (Boolean) jVar.a("onTapBringToFront");
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            String str9 = (String) jVar.a("color");
            dVar.a(this.f7484k.a(new f(str2, str4, str6, str7, str8, str9 != null ? Integer.valueOf(Color.parseColor(str9)) : null, bool.booleanValue())));
        } catch (Exception e10) {
            dVar.b("CHANGE_NOTIFICATION_OPTIONS_ERROR", "An unexpected error happened during notification options change:" + e10.getMessage(), null);
        }
    }

    private void d(j jVar, k.d dVar) {
        try {
            Long l10 = new Long(((Integer) jVar.a("interval")).intValue());
            Long valueOf = Long.valueOf(l10.longValue() / 2);
            Float f10 = new Float(((Double) jVar.a("distanceFilter")).doubleValue());
            this.f7483j.h(this.f7483j.A.get(((Integer) jVar.a("accuracy")).intValue()), l10, valueOf, f10);
            dVar.a(1);
        } catch (Exception e10) {
            dVar.b("CHANGE_SETTINGS_ERROR", "An unexcepted error happened during location settings change:" + e10.getMessage(), null);
        }
    }

    private void e(k.d dVar) {
        a aVar = this.f7483j;
        aVar.f7473y = dVar;
        if (aVar.i()) {
            this.f7483j.w();
        } else {
            this.f7483j.r();
        }
    }

    private void f(k.d dVar) {
        if (Build.VERSION.SDK_INT < 23) {
            dVar.a(1);
        } else if (this.f7483j.i()) {
            dVar.a(1);
        } else {
            dVar.a(0);
        }
    }

    private void g(k.d dVar) {
        if (Build.VERSION.SDK_INT < 23) {
            dVar.a(1);
            return;
        }
        a aVar = this.f7483j;
        aVar.f7471w = dVar;
        aVar.r();
    }

    private void h(k.d dVar) {
        try {
            dVar.a(Integer.valueOf(this.f7483j.j() ? 1 : 0));
        } catch (Exception unused) {
            dVar.b("SERVICE_STATUS_ERROR", "Location service status couldn't be determined", null);
        }
    }

    @Override // r8.k.c
    public void I(j jVar, k.d dVar) {
        String str = jVar.f16777a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -972798202:
                if (str.equals("isBackgroundModeEnabled")) {
                    c10 = 0;
                    break;
                }
                break;
            case -724480940:
                if (str.equals("enableBackgroundMode")) {
                    c10 = 1;
                    break;
                }
                break;
            case -316023509:
                if (str.equals("getLocation")) {
                    c10 = 2;
                    break;
                }
                break;
            case 128007462:
                if (str.equals("requestService")) {
                    c10 = 3;
                    break;
                }
                break;
            case 171850761:
                if (str.equals("hasPermission")) {
                    c10 = 4;
                    break;
                }
                break;
            case 473496931:
                if (str.equals("changeNotificationOptions")) {
                    c10 = 5;
                    break;
                }
                break;
            case 646862540:
                if (str.equals("serviceEnabled")) {
                    c10 = 6;
                    break;
                }
                break;
            case 746581438:
                if (str.equals("requestPermission")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1149076467:
                if (str.equals("changeSettings")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                b(dVar);
                return;
            case 1:
                a(jVar, dVar);
                return;
            case 2:
                e(dVar);
                return;
            case 3:
                this.f7483j.s(dVar);
                return;
            case 4:
                f(dVar);
                return;
            case 5:
                c(jVar, dVar);
                return;
            case 6:
                h(dVar);
                return;
            case 7:
                g(dVar);
                return;
            case '\b':
                d(jVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(a aVar) {
        this.f7483j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(FlutterLocationService flutterLocationService) {
        this.f7484k = flutterLocationService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(r8.c cVar) {
        if (this.f7485l != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            l();
        }
        k kVar = new k(cVar, "lyokone/location");
        this.f7485l = kVar;
        kVar.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        k kVar = this.f7485l;
        if (kVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        kVar.e(null);
        this.f7485l = null;
    }
}
