package com.mr.flutter.plugin.filepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.e;
import androidx.lifecycle.i;
import i8.a;
import java.util.ArrayList;
import java.util.HashMap;
import r8.d;
import r8.j;
import r8.k;
import r8.o;
/* loaded from: classes.dex */
public class FilePickerPlugin implements k.c, i8.a, j8.a {

    /* renamed from: r  reason: collision with root package name */
    private static String f7502r = null;

    /* renamed from: s  reason: collision with root package name */
    private static boolean f7503s = false;

    /* renamed from: t  reason: collision with root package name */
    private static boolean f7504t = false;

    /* renamed from: j  reason: collision with root package name */
    private j8.c f7505j;

    /* renamed from: k  reason: collision with root package name */
    private com.mr.flutter.plugin.filepicker.b f7506k;

    /* renamed from: l  reason: collision with root package name */
    private Application f7507l;

    /* renamed from: m  reason: collision with root package name */
    private a.b f7508m;

    /* renamed from: n  reason: collision with root package name */
    private e f7509n;

    /* renamed from: o  reason: collision with root package name */
    private LifeCycleObserver f7510o;

    /* renamed from: p  reason: collision with root package name */
    private Activity f7511p;

    /* renamed from: q  reason: collision with root package name */
    private k f7512q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: j  reason: collision with root package name */
        private final Activity f7513j;

        LifeCycleObserver(Activity activity) {
            this.f7513j = activity;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void O(i iVar) {
            onActivityStopped(this.f7513j);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void g(i iVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void i(i iVar) {
            onActivityDestroyed(this.f7513j);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void j(i iVar) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f7513j != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void r(i iVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void s(i iVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d.InterfaceC0247d {
        a() {
        }

        @Override // r8.d.InterfaceC0247d
        public void b(Object obj, d.b bVar) {
            FilePickerPlugin.this.f7506k.o(bVar);
        }

        @Override // r8.d.InterfaceC0247d
        public void c(Object obj) {
            FilePickerPlugin.this.f7506k.o(null);
        }
    }

    /* loaded from: classes.dex */
    private static class b implements k.d {

        /* renamed from: a  reason: collision with root package name */
        private final k.d f7516a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f7517b = new Handler(Looper.getMainLooper());

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ Object f7518j;

            a(Object obj) {
                this.f7518j = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f7516a.a(this.f7518j);
            }
        }

        /* renamed from: com.mr.flutter.plugin.filepicker.FilePickerPlugin$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0108b implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ String f7520j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ String f7521k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ Object f7522l;

            RunnableC0108b(String str, String str2, Object obj) {
                this.f7520j = str;
                this.f7521k = str2;
                this.f7522l = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f7516a.b(this.f7520j, this.f7521k, this.f7522l);
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f7516a.c();
            }
        }

        b(k.d dVar) {
            this.f7516a = dVar;
        }

        @Override // r8.k.d
        public void a(Object obj) {
            this.f7517b.post(new a(obj));
        }

        @Override // r8.k.d
        public void b(String str, String str2, Object obj) {
            this.f7517b.post(new RunnableC0108b(str, str2, obj));
        }

        @Override // r8.k.d
        public void c() {
            this.f7517b.post(new c());
        }
    }

    private static String b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    c10 = 0;
                    break;
                }
                break;
            case 96748:
                if (str.equals("any")) {
                    c10 = 1;
                    break;
                }
                break;
            case 99469:
                if (str.equals("dir")) {
                    c10 = 2;
                    break;
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c10 = 4;
                    break;
                }
                break;
            case 103772132:
                if (str.equals("media")) {
                    c10 = 5;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return "*/*";
            case 2:
                return "dir";
            case 3:
                return "audio/*";
            case 4:
                return "image/*";
            case 5:
                return "image/*,video/*";
            case 6:
                return "video/*";
            default:
                return null;
        }
    }

    private void c(r8.c cVar, Application application, Activity activity, o oVar, j8.c cVar2) {
        this.f7511p = activity;
        this.f7507l = application;
        this.f7506k = new com.mr.flutter.plugin.filepicker.b(activity);
        k kVar = new k(cVar, "miguelruivo.flutter.plugins.filepicker");
        this.f7512q = kVar;
        kVar.e(this);
        new d(cVar, "miguelruivo.flutter.plugins.filepickerevent").d(new a());
        LifeCycleObserver lifeCycleObserver = new LifeCycleObserver(activity);
        this.f7510o = lifeCycleObserver;
        if (oVar != null) {
            application.registerActivityLifecycleCallbacks(lifeCycleObserver);
            oVar.b(this.f7506k);
            oVar.c(this.f7506k);
            return;
        }
        cVar2.b(this.f7506k);
        cVar2.c(this.f7506k);
        e a10 = m8.a.a(cVar2);
        this.f7509n = a10;
        a10.a(this.f7510o);
    }

    private void h() {
        this.f7505j.g(this.f7506k);
        this.f7505j.e(this.f7506k);
        this.f7505j = null;
        LifeCycleObserver lifeCycleObserver = this.f7510o;
        if (lifeCycleObserver != null) {
            this.f7509n.c(lifeCycleObserver);
            this.f7507l.unregisterActivityLifecycleCallbacks(this.f7510o);
        }
        this.f7509n = null;
        this.f7506k.o(null);
        this.f7506k = null;
        this.f7512q.e(null);
        this.f7512q = null;
        this.f7507l = null;
    }

    @Override // r8.k.c
    public void I(j jVar, k.d dVar) {
        String[] f10;
        String str;
        if (this.f7511p == null) {
            dVar.b("no_activity", "file picker plugin requires a foreground activity", null);
            return;
        }
        b bVar = new b(dVar);
        HashMap hashMap = (HashMap) jVar.f16778b;
        String str2 = jVar.f16777a;
        if (str2 != null && str2.equals("clear")) {
            bVar.a(Boolean.valueOf(c.a(this.f7511p.getApplicationContext())));
            return;
        }
        String b10 = b(jVar.f16777a);
        f7502r = b10;
        if (b10 == null) {
            bVar.c();
        } else if (b10 != "dir") {
            f7503s = ((Boolean) hashMap.get("allowMultipleSelection")).booleanValue();
            f7504t = ((Boolean) hashMap.get("withData")).booleanValue();
            f10 = c.f((ArrayList) hashMap.get("allowedExtensions"));
            str = jVar.f16777a;
            if (str == null && str.equals("custom") && (f10 == null || f10.length == 0)) {
                bVar.b("FilePicker", "Unsupported filter. Make sure that you are only using the extension without the dot, (ie., jpg instead of .jpg). This could also have happened because you are using an unsupported file extension.  If the problem persists, you may want to consider using FileType.all instead.", null);
                return;
            } else {
                this.f7506k.r(f7502r, f7503s, f7504t, f10, bVar);
            }
        }
        f10 = null;
        str = jVar.f16777a;
        if (str == null) {
        }
        this.f7506k.r(f7502r, f7503s, f7504t, f10, bVar);
    }

    @Override // i8.a
    public void d(a.b bVar) {
        this.f7508m = null;
    }

    @Override // j8.a
    public void e(j8.c cVar) {
        f(cVar);
    }

    @Override // j8.a
    public void f(j8.c cVar) {
        this.f7505j = cVar;
        c(this.f7508m.b(), (Application) this.f7508m.a(), this.f7505j.d(), null, this.f7505j);
    }

    @Override // j8.a
    public void g() {
        h();
    }

    @Override // j8.a
    public void j() {
        g();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        this.f7508m = bVar;
    }
}
