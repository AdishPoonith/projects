package a1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import f1.k;
import f1.l0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import p0.f0;
import q1.a;
import t9.p;
import y0.g;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f26a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final String f27b = e.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f28c;

    /* loaded from: classes.dex */
    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        

        /* renamed from: j  reason: collision with root package name */
        private final String f32j;

        a(String str) {
            this.f32j = str;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f32j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements ServiceConnection {

        /* renamed from: j  reason: collision with root package name */
        private final CountDownLatch f33j = new CountDownLatch(1);

        /* renamed from: k  reason: collision with root package name */
        private IBinder f34k;

        public final IBinder a() {
            this.f33j.await(5L, TimeUnit.SECONDS);
            return this.f34k;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            l.e(name, "name");
            this.f33j.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            l.e(name, "name");
            l.e(serviceBinder, "serviceBinder");
            this.f34k = serviceBinder;
            this.f33j.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            l.e(name, "name");
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    private e() {
    }

    private final Intent a(Context context) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null) {
                    k kVar = k.f8465a;
                    if (k.a(context, "com.facebook.katana")) {
                        return intent;
                    }
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    k kVar2 = k.f8465a;
                    if (k.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final boolean b() {
        if (k1.a.d(e.class)) {
            return false;
        }
        try {
            if (f28c == null) {
                f0 f0Var = f0.f14852a;
                f28c = Boolean.valueOf(f26a.a(f0.l()) != null);
            }
            Boolean bool = f28c;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th) {
            k1.a.b(th, e.class);
            return false;
        }
    }

    public static final c c(String applicationId, List<q0.d> appEvents) {
        if (k1.a.d(e.class)) {
            return null;
        }
        try {
            l.e(applicationId, "applicationId");
            l.e(appEvents, "appEvents");
            return f26a.d(a.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th) {
            k1.a.b(th, e.class);
            return null;
        }
    }

    private final c d(a aVar, String str, List<q0.d> list) {
        c cVar;
        String str2;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            g gVar = g.f20314a;
            g.b();
            f0 f0Var = f0.f14852a;
            Context l10 = f0.l();
            Intent a10 = a(l10);
            if (a10 != null) {
                b bVar = new b();
                if (l10.bindService(a10, bVar, 1)) {
                    try {
                        try {
                            IBinder a11 = bVar.a();
                            if (a11 != null) {
                                q1.a p10 = a.AbstractBinderC0234a.p(a11);
                                d dVar = d.f24a;
                                Bundle a12 = d.a(aVar, str, list);
                                if (a12 != null) {
                                    p10.u0(a12);
                                    l0 l0Var = l0.f8470a;
                                    l0.e0(f27b, l.k("Successfully sent events to the remote service: ", a12));
                                }
                                cVar2 = c.OPERATION_SUCCESS;
                            }
                            l10.unbindService(bVar);
                            l0 l0Var2 = l0.f8470a;
                            l0.e0(f27b, "Unbound from the remote service");
                            return cVar2;
                        } catch (InterruptedException e10) {
                            cVar = c.SERVICE_ERROR;
                            l0 l0Var3 = l0.f8470a;
                            str2 = f27b;
                            l0.d0(str2, e10);
                            l10.unbindService(bVar);
                            l0.e0(str2, "Unbound from the remote service");
                            return cVar;
                        }
                    } catch (RemoteException e11) {
                        cVar = c.SERVICE_ERROR;
                        l0 l0Var4 = l0.f8470a;
                        str2 = f27b;
                        l0.d0(str2, e11);
                        l10.unbindService(bVar);
                        l0.e0(str2, "Unbound from the remote service");
                        return cVar;
                    }
                }
                return c.SERVICE_ERROR;
            }
            return cVar2;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final c e(String applicationId) {
        List<q0.d> e10;
        if (k1.a.d(e.class)) {
            return null;
        }
        try {
            l.e(applicationId, "applicationId");
            e eVar = f26a;
            a aVar = a.MOBILE_APP_INSTALL;
            e10 = p.e();
            return eVar.d(aVar, applicationId, e10);
        } catch (Throwable th) {
            k1.a.b(th, e.class);
            return null;
        }
    }
}
