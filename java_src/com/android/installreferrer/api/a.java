package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import s3.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends InstallReferrerClient {

    /* renamed from: a  reason: collision with root package name */
    private int f3470a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3471b;

    /* renamed from: c  reason: collision with root package name */
    private s3.a f3472c;

    /* renamed from: d  reason: collision with root package name */
    private ServiceConnection f3473d;

    /* loaded from: classes.dex */
    private final class b implements ServiceConnection {

        /* renamed from: j  reason: collision with root package name */
        private final InstallReferrerStateListener f3474j;

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f3474j = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            k0.a.a("InstallReferrerClient", "Install Referrer service connected.");
            a.this.f3472c = a.AbstractBinderC0255a.p(iBinder);
            a.this.f3470a = 2;
            this.f3474j.a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            k0.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            a.this.f3472c = null;
            a.this.f3470a = 0;
            this.f3474j.b();
        }
    }

    public a(Context context) {
        this.f3471b = context.getApplicationContext();
    }

    private boolean g() {
        try {
            return this.f3471b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void a() {
        this.f3470a = 3;
        if (this.f3473d != null) {
            k0.a.a("InstallReferrerClient", "Unbinding from service.");
            this.f3471b.unbindService(this.f3473d);
            this.f3473d = null;
        }
        this.f3472c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails b() {
        if (h()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f3471b.getPackageName());
            try {
                return new ReferrerDetails(this.f3472c.T1(bundle));
            } catch (RemoteException e10) {
                k0.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f3470a = 0;
                throw e10;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void d(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (h()) {
            k0.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.a(0);
            return;
        }
        int i10 = this.f3470a;
        if (i10 == 1) {
            k0.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.a(3);
        } else if (i10 == 3) {
            k0.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.a(3);
        } else {
            k0.a.a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f3473d = new b(installReferrerStateListener);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f3471b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.f3470a = 0;
                k0.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
                installReferrerStateListener.a(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !g()) {
                k0.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f3470a = 0;
                installReferrerStateListener.a(2);
            } else if (this.f3471b.bindService(new Intent(intent), this.f3473d, 1)) {
                k0.a.a("InstallReferrerClient", "Service was bonded successfully.");
            } else {
                k0.a.b("InstallReferrerClient", "Connection to service is blocked.");
                this.f3470a = 0;
                installReferrerStateListener.a(1);
            }
        }
    }

    public boolean h() {
        return (this.f3470a != 2 || this.f3472c == null || this.f3473d == null) ? false : true;
    }
}
