package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import i8.a;
import io.flutter.plugins.imagepicker.k;
import io.flutter.plugins.imagepicker.o;
import java.util.List;
/* loaded from: classes.dex */
public class ImagePickerPlugin implements i8.a, j8.a, o.e {

    /* renamed from: j  reason: collision with root package name */
    private a.b f10710j;

    /* renamed from: k  reason: collision with root package name */
    b f10711k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: j  reason: collision with root package name */
        private final Activity f10712j;

        LifeCycleObserver(Activity activity) {
            this.f10712j = activity;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void O(androidx.lifecycle.i iVar) {
            onActivityStopped(this.f10712j);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void g(androidx.lifecycle.i iVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void i(androidx.lifecycle.i iVar) {
            onActivityDestroyed(this.f10712j);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void j(androidx.lifecycle.i iVar) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f10712j != activity || activity.getApplicationContext() == null) {
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
            if (this.f10712j == activity) {
                ImagePickerPlugin.this.f10711k.b().O();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void r(androidx.lifecycle.i iVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void s(androidx.lifecycle.i iVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10714a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10715b;

        static {
            int[] iArr = new int[o.k.values().length];
            f10715b = iArr;
            try {
                iArr[o.k.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10715b[o.k.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[o.i.values().length];
            f10714a = iArr2;
            try {
                iArr2[o.i.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10714a[o.i.REAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private Application f10716a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f10717b;

        /* renamed from: c  reason: collision with root package name */
        private k f10718c;

        /* renamed from: d  reason: collision with root package name */
        private LifeCycleObserver f10719d;

        /* renamed from: e  reason: collision with root package name */
        private j8.c f10720e;

        /* renamed from: f  reason: collision with root package name */
        private r8.c f10721f;

        /* renamed from: g  reason: collision with root package name */
        private androidx.lifecycle.e f10722g;

        b(Application application, Activity activity, r8.c cVar, o.e eVar, r8.o oVar, j8.c cVar2) {
            this.f10716a = application;
            this.f10717b = activity;
            this.f10720e = cVar2;
            this.f10721f = cVar;
            this.f10718c = ImagePickerPlugin.this.h(activity);
            s.e(cVar, eVar);
            LifeCycleObserver lifeCycleObserver = new LifeCycleObserver(activity);
            this.f10719d = lifeCycleObserver;
            if (oVar != null) {
                application.registerActivityLifecycleCallbacks(lifeCycleObserver);
                oVar.b(this.f10718c);
                oVar.c(this.f10718c);
                return;
            }
            cVar2.b(this.f10718c);
            cVar2.c(this.f10718c);
            androidx.lifecycle.e a10 = m8.a.a(cVar2);
            this.f10722g = a10;
            a10.a(this.f10719d);
        }

        Activity a() {
            return this.f10717b;
        }

        k b() {
            return this.f10718c;
        }

        void c() {
            j8.c cVar = this.f10720e;
            if (cVar != null) {
                cVar.g(this.f10718c);
                this.f10720e.e(this.f10718c);
                this.f10720e = null;
            }
            androidx.lifecycle.e eVar = this.f10722g;
            if (eVar != null) {
                eVar.c(this.f10719d);
                this.f10722g = null;
            }
            s.e(this.f10721f, null);
            Application application = this.f10716a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.f10719d);
                this.f10716a = null;
            }
            this.f10717b = null;
            this.f10719d = null;
            this.f10718c = null;
        }
    }

    private k i() {
        b bVar = this.f10711k;
        if (bVar == null || bVar.a() == null) {
            return null;
        }
        return this.f10711k.b();
    }

    private void k(k kVar, o.j jVar) {
        o.i b10 = jVar.b();
        if (b10 != null) {
            kVar.P(a.f10714a[b10.ordinal()] != 1 ? k.c.REAR : k.c.FRONT);
        }
    }

    private void l(r8.c cVar, Application application, Activity activity, r8.o oVar, j8.c cVar2) {
        this.f10711k = new b(application, activity, cVar, this, oVar, cVar2);
    }

    private void n() {
        b bVar = this.f10711k;
        if (bVar != null) {
            bVar.c();
            this.f10711k = null;
        }
    }

    @Override // io.flutter.plugins.imagepicker.o.e
    public void a(o.j jVar, o.g gVar, Boolean bool, Boolean bool2, o.h<List<String>> hVar) {
        k i10 = i();
        if (i10 == null) {
            hVar.b(new o.d("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        k(i10, jVar);
        if (bool.booleanValue()) {
            i10.i(gVar, bool2.booleanValue(), hVar);
            return;
        }
        int i11 = a.f10715b[jVar.c().ordinal()];
        if (i11 == 1) {
            i10.h(gVar, bool2.booleanValue(), hVar);
        } else if (i11 != 2) {
        } else {
            i10.R(gVar, hVar);
        }
    }

    @Override // io.flutter.plugins.imagepicker.o.e
    public o.b b() {
        k i10 = i();
        if (i10 != null) {
            return i10.N();
        }
        throw new o.d("no_activity", "image_picker plugin requires a foreground activity.", null);
    }

    @Override // io.flutter.plugins.imagepicker.o.e
    public void c(o.j jVar, o.l lVar, Boolean bool, Boolean bool2, o.h<List<String>> hVar) {
        k i10 = i();
        if (i10 == null) {
            hVar.b(new o.d("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        k(i10, jVar);
        if (bool.booleanValue()) {
            hVar.b(new RuntimeException("Multi-video selection is not implemented"));
            return;
        }
        int i11 = a.f10715b[jVar.c().ordinal()];
        if (i11 == 1) {
            i10.j(lVar, bool2.booleanValue(), hVar);
        } else if (i11 != 2) {
        } else {
            i10.S(lVar, hVar);
        }
    }

    @Override // i8.a
    public void d(a.b bVar) {
        this.f10710j = null;
    }

    @Override // j8.a
    public void e(j8.c cVar) {
        f(cVar);
    }

    @Override // j8.a
    public void f(j8.c cVar) {
        l(this.f10710j.b(), (Application) this.f10710j.a(), cVar.d(), null, cVar);
    }

    @Override // j8.a
    public void g() {
        n();
    }

    final k h(Activity activity) {
        return new k(activity, new n(activity, new io.flutter.plugins.imagepicker.a()), new c(activity));
    }

    @Override // j8.a
    public void j() {
        g();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        this.f10710j = bVar;
    }
}
