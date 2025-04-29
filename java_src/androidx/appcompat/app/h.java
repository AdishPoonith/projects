package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
/* loaded from: classes.dex */
class h {

    /* renamed from: d  reason: collision with root package name */
    private static h f738d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f739a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f740b;

    /* renamed from: c  reason: collision with root package name */
    private final a f741c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f742a;

        /* renamed from: b  reason: collision with root package name */
        long f743b;

        /* renamed from: c  reason: collision with root package name */
        long f744c;

        /* renamed from: d  reason: collision with root package name */
        long f745d;

        /* renamed from: e  reason: collision with root package name */
        long f746e;

        /* renamed from: f  reason: collision with root package name */
        long f747f;

        a() {
        }
    }

    h(Context context, LocationManager locationManager) {
        this.f739a = context;
        this.f740b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h a(Context context) {
        if (f738d == null) {
            Context applicationContext = context.getApplicationContext();
            f738d = new h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f738d;
    }

    private Location b() {
        Location c10 = androidx.core.content.c.b(this.f739a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c11 = androidx.core.content.c.b(this.f739a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c11 == null || c10 == null) ? c11 != null ? c11 : c10 : c11.getTime() > c10.getTime() ? c11 : c10;
    }

    private Location c(String str) {
        try {
            if (this.f740b.isProviderEnabled(str)) {
                return this.f740b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f741c.f747f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f741c;
        long currentTimeMillis = System.currentTimeMillis();
        g b10 = g.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b10.f735a;
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f737c == 1;
        long j12 = b10.f736b;
        long j13 = b10.f735a;
        boolean z11 = z10;
        b10.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j14 = b10.f736b;
        if (j12 == -1 || j13 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j13 ? 0 + j14 : currentTimeMillis > j12 ? 0 + j13 : 0 + j12) + 60000;
        }
        aVar.f742a = z11;
        aVar.f743b = j11;
        aVar.f744c = j12;
        aVar.f745d = j13;
        aVar.f746e = j14;
        aVar.f747f = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f741c;
        if (e()) {
            return aVar.f742a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f742a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
