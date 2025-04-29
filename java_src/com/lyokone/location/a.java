package com.lyokone.location;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashMap;
import r8.d;
import r8.k;
import r8.m;
import r8.p;
import t4.e;
import t4.f;
import t4.g;
import t4.k;
/* loaded from: classes.dex */
public class a implements p, m {

    /* renamed from: j  reason: collision with root package name */
    public Activity f7458j;

    /* renamed from: k  reason: collision with root package name */
    public t4.b f7459k;

    /* renamed from: l  reason: collision with root package name */
    private k f7460l;

    /* renamed from: m  reason: collision with root package name */
    private LocationRequest f7461m;

    /* renamed from: n  reason: collision with root package name */
    private f f7462n;

    /* renamed from: o  reason: collision with root package name */
    public t4.d f7463o;

    /* renamed from: p  reason: collision with root package name */
    private OnNmeaMessageListener f7464p;

    /* renamed from: q  reason: collision with root package name */
    private Double f7465q;

    /* renamed from: v  reason: collision with root package name */
    public d.b f7470v;

    /* renamed from: w  reason: collision with root package name */
    public k.d f7471w;

    /* renamed from: x  reason: collision with root package name */
    private k.d f7472x;

    /* renamed from: y  reason: collision with root package name */
    public k.d f7473y;

    /* renamed from: z  reason: collision with root package name */
    private final LocationManager f7474z;

    /* renamed from: r  reason: collision with root package name */
    private long f7466r = 5000;

    /* renamed from: s  reason: collision with root package name */
    private long f7467s = 5000 / 2;

    /* renamed from: t  reason: collision with root package name */
    private Integer f7468t = 100;

    /* renamed from: u  reason: collision with root package name */
    private float f7469u = 0.0f;
    public SparseArray<Integer> A = new C0106a();

    /* renamed from: com.lyokone.location.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0106a extends SparseArray<Integer> {
        C0106a() {
            put(0, 105);
            put(1, 104);
            put(2, 102);
            put(3, 100);
            put(4, 100);
            put(5, 104);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends t4.d {
        b() {
        }

        @Override // t4.d
        public void b(LocationResult locationResult) {
            super.b(locationResult);
            Location B = locationResult.B();
            HashMap hashMap = new HashMap();
            hashMap.put("latitude", Double.valueOf(B.getLatitude()));
            hashMap.put("longitude", Double.valueOf(B.getLongitude()));
            hashMap.put("accuracy", Double.valueOf(B.getAccuracy()));
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                hashMap.put("verticalAccuracy", Double.valueOf(B.getVerticalAccuracyMeters()));
                hashMap.put("headingAccuracy", Double.valueOf(B.getBearingAccuracyDegrees()));
            }
            if (i10 >= 29) {
                hashMap.put("elapsedRealtimeUncertaintyNanos", Double.valueOf(B.getElapsedRealtimeUncertaintyNanos()));
            }
            hashMap.put("provider", B.getProvider());
            if (B.getExtras() != null) {
                hashMap.put("satelliteNumber", Integer.valueOf(B.getExtras().getInt("satellites")));
            }
            hashMap.put("elapsedRealtimeNanos", Double.valueOf(B.getElapsedRealtimeNanos()));
            if (B.isFromMockProvider()) {
                hashMap.put("isMock", Double.valueOf(1.0d));
            }
            hashMap.put("altitude", (a.this.f7465q == null || i10 < 24) ? Double.valueOf(B.getAltitude()) : a.this.f7465q);
            hashMap.put("speed", Double.valueOf(B.getSpeed()));
            if (i10 >= 26) {
                hashMap.put("speed_accuracy", Double.valueOf(B.getSpeedAccuracyMetersPerSecond()));
            }
            hashMap.put("heading", Double.valueOf(B.getBearing()));
            hashMap.put("time", Double.valueOf(B.getTime()));
            k.d dVar = a.this.f7473y;
            if (dVar != null) {
                dVar.a(hashMap);
                a.this.f7473y = null;
            }
            a aVar = a.this;
            d.b bVar = aVar.f7470v;
            if (bVar != null) {
                bVar.a(hashMap);
                return;
            }
            t4.b bVar2 = aVar.f7459k;
            if (bVar2 != null) {
                bVar2.e(aVar.f7463o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, Activity activity) {
        this.f7458j = activity;
        this.f7474z = (LocationManager) context.getSystemService("location");
    }

    private void g() {
        f.a aVar = new f.a();
        aVar.a(this.f7461m);
        this.f7462n = aVar.b();
    }

    private void k() {
        t4.d dVar = this.f7463o;
        if (dVar != null) {
            this.f7459k.e(dVar);
            this.f7463o = null;
        }
        this.f7463o = new b();
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7464p = new OnNmeaMessageListener() { // from class: x7.b
                @Override // android.location.OnNmeaMessageListener
                public final void onNmeaMessage(String str, long j10) {
                    com.lyokone.location.a.this.m(str, j10);
                }
            };
        }
    }

    private void l() {
        LocationRequest B = LocationRequest.B();
        this.f7461m = B;
        B.P(this.f7466r);
        this.f7461m.O(this.f7467s);
        this.f7461m.Q(this.f7468t.intValue());
        this.f7461m.R(this.f7469u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, long j10) {
        if (str.startsWith("$")) {
            String[] split = str.split(",");
            if (!split[0].startsWith("$GPGGA") || split.length <= 9 || split[9].isEmpty()) {
                return;
            }
            this.f7465q = Double.valueOf(Double.parseDouble(split[9]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(k.d dVar, Exception exc) {
        String str;
        if (exc instanceof com.google.android.gms.common.api.k) {
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) exc;
            int statusCode = kVar.getStatusCode();
            if (statusCode != 6) {
                if (statusCode != 8502) {
                    return;
                }
                dVar.b("SERVICE_STATUS_DISABLED", "Failed to get location. Location services disabled", null);
                return;
            }
            try {
                kVar.a(this.f7458j, 4097);
                return;
            } catch (IntentSender.SendIntentException unused) {
                str = "Could not resolve location request";
            }
        } else {
            str = "Unexpected error type received";
        }
        dVar.b("SERVICE_STATUS_ERROR", str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7474z.addNmeaListener(this.f7464p, (Handler) null);
        }
        t4.b bVar = this.f7459k;
        if (bVar != null) {
            bVar.f(this.f7461m, this.f7463o, Looper.myLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Exception exc) {
        if (exc instanceof com.google.android.gms.common.api.k) {
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) exc;
            if (kVar.getStatusCode() == 6) {
                try {
                    kVar.a(this.f7458j, 1);
                } catch (IntentSender.SendIntentException unused) {
                    Log.i("FlutterLocation", "PendingIntent unable to execute request.");
                }
            }
        } else if (((com.google.android.gms.common.api.b) exc).getStatusCode() != 8502) {
            t("UNEXPECTED_ERROR", exc.getMessage(), null);
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f7474z.addNmeaListener(this.f7464p, (Handler) null);
            }
            this.f7459k.f(this.f7461m, this.f7463o, Looper.myLooper());
        }
    }

    private void t(String str, String str2, Object obj) {
        k.d dVar = this.f7473y;
        if (dVar != null) {
            dVar.b(str, str2, obj);
            this.f7473y = null;
        }
        d.b bVar = this.f7470v;
        if (bVar != null) {
            bVar.b(str, str2, obj);
            this.f7470v = null;
        }
    }

    @Override // r8.m
    public boolean b(int i10, int i11, Intent intent) {
        k.d dVar;
        if (i10 != 1) {
            if (i10 == 4097 && (dVar = this.f7472x) != null) {
                dVar.a(i11 == -1 ? 1 : 0);
                this.f7472x = null;
                return true;
            }
            return false;
        }
        k.d dVar2 = this.f7471w;
        if (dVar2 == null) {
            return false;
        }
        if (i11 == -1) {
            w();
            return true;
        }
        dVar2.b("SERVICE_STATUS_DISABLED", "Failed to get location. Location services disabled", null);
        this.f7471w = null;
        return true;
    }

    public void h(Integer num, Long l10, Long l11, Float f10) {
        this.f7468t = num;
        this.f7466r = l10.longValue();
        this.f7467s = l11.longValue();
        this.f7469u = f10.floatValue();
        k();
        l();
        g();
        w();
    }

    public boolean i() {
        Activity activity = this.f7458j;
        if (activity != null) {
            return androidx.core.content.a.a(activity, "android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        this.f7471w.b("MISSING_ACTIVITY", "You should not checkPermissions activation outside of an activity.", null);
        throw new ActivityNotFoundException();
    }

    public boolean j() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f7474z.isLocationEnabled();
        }
        return this.f7474z.isProviderEnabled("gps") || this.f7474z.isProviderEnabled("network");
    }

    @Override // r8.p
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        return q(i10, strArr, iArr);
    }

    public boolean q(int i10, String[] strArr, int[] iArr) {
        k.d dVar;
        int i11;
        if (i10 == 34 && strArr.length == 1 && strArr[0].equals("android.permission.ACCESS_FINE_LOCATION")) {
            if (iArr[0] == 0) {
                if (this.f7473y != null || this.f7470v != null) {
                    w();
                }
                dVar = this.f7471w;
                if (dVar != null) {
                    i11 = 1;
                    dVar.a(i11);
                    this.f7471w = null;
                }
                return true;
            } else if (v()) {
                t("PERMISSION_DENIED", "Location permission denied", null);
                dVar = this.f7471w;
                if (dVar != null) {
                    i11 = 0;
                    dVar.a(i11);
                    this.f7471w = null;
                }
                return true;
            } else {
                t("PERMISSION_DENIED_NEVER_ASK", "Location permission denied forever - please open app settings", null);
                dVar = this.f7471w;
                if (dVar != null) {
                    i11 = 2;
                    dVar.a(i11);
                    this.f7471w = null;
                }
                return true;
            }
        }
        return false;
    }

    public void r() {
        if (this.f7458j == null) {
            this.f7471w.b("MISSING_ACTIVITY", "You should not requestPermissions activation outside of an activity.", null);
            throw new ActivityNotFoundException();
        } else if (i()) {
            this.f7471w.a(1);
        } else {
            androidx.core.app.b.n(this.f7458j, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 34);
        }
    }

    public void s(final k.d dVar) {
        if (this.f7458j == null) {
            dVar.b("MISSING_ACTIVITY", "You should not requestService activation outside of an activity.", null);
            throw new ActivityNotFoundException();
        }
        try {
            if (j()) {
                dVar.a(1);
                return;
            }
            this.f7472x = dVar;
            this.f7460l.b(this.f7462n).addOnFailureListener(this.f7458j, new OnFailureListener() { // from class: x7.d
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    com.lyokone.location.a.this.n(dVar, exc);
                }
            });
        } catch (Exception unused) {
            dVar.b("SERVICE_STATUS_ERROR", "Location service status couldn't be determined", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Activity activity) {
        LocationManager locationManager;
        this.f7458j = activity;
        if (activity != null) {
            this.f7459k = e.a(activity);
            this.f7460l = e.b(activity);
            k();
            l();
            g();
            return;
        }
        t4.b bVar = this.f7459k;
        if (bVar != null) {
            bVar.e(this.f7463o);
        }
        this.f7459k = null;
        this.f7460l = null;
        if (Build.VERSION.SDK_INT < 24 || (locationManager = this.f7474z) == null) {
            return;
        }
        locationManager.removeNmeaListener(this.f7464p);
        this.f7464p = null;
    }

    public boolean v() {
        Activity activity = this.f7458j;
        if (activity == null) {
            return false;
        }
        return androidx.core.app.b.o(activity, "android.permission.ACCESS_FINE_LOCATION");
    }

    public void w() {
        if (this.f7458j != null) {
            this.f7460l.b(this.f7462n).addOnSuccessListener(this.f7458j, new OnSuccessListener() { // from class: x7.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    com.lyokone.location.a.this.o((g) obj);
                }
            }).addOnFailureListener(this.f7458j, new OnFailureListener() { // from class: x7.c
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    com.lyokone.location.a.this.p(exc);
                }
            });
        } else {
            this.f7471w.b("MISSING_ACTIVITY", "You should not requestLocation activation outside of an activity.", null);
            throw new ActivityNotFoundException();
        }
    }
}
