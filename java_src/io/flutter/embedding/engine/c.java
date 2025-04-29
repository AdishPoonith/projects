package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import i8.a;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import j8.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r8.m;
import r8.n;
import r8.p;
import r8.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements i8.b, j8.b {

    /* renamed from: b  reason: collision with root package name */
    private final io.flutter.embedding.engine.a f10307b;

    /* renamed from: c  reason: collision with root package name */
    private final a.b f10308c;

    /* renamed from: e  reason: collision with root package name */
    private io.flutter.embedding.android.c<Activity> f10310e;

    /* renamed from: f  reason: collision with root package name */
    private C0165c f10311f;

    /* renamed from: i  reason: collision with root package name */
    private Service f10314i;

    /* renamed from: k  reason: collision with root package name */
    private BroadcastReceiver f10316k;

    /* renamed from: m  reason: collision with root package name */
    private ContentProvider f10318m;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends i8.a>, i8.a> f10306a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<? extends i8.a>, j8.a> f10309d = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private boolean f10312g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<? extends i8.a>, n8.a> f10313h = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<? extends i8.a>, k8.a> f10315j = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<? extends i8.a>, l8.a> f10317l = new HashMap();

    /* loaded from: classes.dex */
    private static class b implements a.InterfaceC0159a {

        /* renamed from: a  reason: collision with root package name */
        final g8.d f10319a;

        private b(g8.d dVar) {
            this.f10319a = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.embedding.engine.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0165c implements j8.c {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f10320a;

        /* renamed from: b  reason: collision with root package name */
        private final HiddenLifecycleReference f10321b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<p> f10322c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Set<m> f10323d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        private final Set<n> f10324e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        private final Set<q> f10325f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        private final Set<c.a> f10326g = new HashSet();

        public C0165c(Activity activity, androidx.lifecycle.e eVar) {
            this.f10320a = activity;
            this.f10321b = new HiddenLifecycleReference(eVar);
        }

        @Override // j8.c
        public Object a() {
            return this.f10321b;
        }

        @Override // j8.c
        public void b(m mVar) {
            this.f10323d.add(mVar);
        }

        @Override // j8.c
        public void c(p pVar) {
            this.f10322c.add(pVar);
        }

        @Override // j8.c
        public Activity d() {
            return this.f10320a;
        }

        @Override // j8.c
        public void e(p pVar) {
            this.f10322c.remove(pVar);
        }

        @Override // j8.c
        public void f(n nVar) {
            this.f10324e.add(nVar);
        }

        @Override // j8.c
        public void g(m mVar) {
            this.f10323d.remove(mVar);
        }

        @Override // j8.c
        public void h(n nVar) {
            this.f10324e.remove(nVar);
        }

        boolean i(int i10, int i11, Intent intent) {
            boolean z10;
            Iterator it = new HashSet(this.f10323d).iterator();
            while (true) {
                while (it.hasNext()) {
                    z10 = ((m) it.next()).b(i10, i11, intent) || z10;
                }
                return z10;
            }
        }

        void j(Intent intent) {
            for (n nVar : this.f10324e) {
                nVar.c(intent);
            }
        }

        boolean k(int i10, String[] strArr, int[] iArr) {
            boolean z10;
            while (true) {
                for (p pVar : this.f10322c) {
                    z10 = pVar.onRequestPermissionsResult(i10, strArr, iArr) || z10;
                }
                return z10;
            }
        }

        void l(Bundle bundle) {
            for (c.a aVar : this.f10326g) {
                aVar.d(bundle);
            }
        }

        void m(Bundle bundle) {
            for (c.a aVar : this.f10326g) {
                aVar.a(bundle);
            }
        }

        void n() {
            for (q qVar : this.f10325f) {
                qVar.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, io.flutter.embedding.engine.a aVar, g8.d dVar, d dVar2) {
        this.f10307b = aVar;
        this.f10308c = new a.b(context, aVar, aVar.i(), aVar.q(), aVar.o().P(), new b(dVar), dVar2);
    }

    private void j(Activity activity, androidx.lifecycle.e eVar) {
        this.f10311f = new C0165c(activity, eVar);
        this.f10307b.o().h0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f10307b.o().B(activity, this.f10307b.q(), this.f10307b.i());
        for (j8.a aVar : this.f10309d.values()) {
            if (this.f10312g) {
                aVar.e(this.f10311f);
            } else {
                aVar.f(this.f10311f);
            }
        }
        this.f10312g = false;
    }

    private void l() {
        this.f10307b.o().J();
        this.f10310e = null;
        this.f10311f = null;
    }

    private void m() {
        if (r()) {
            h();
        } else if (u()) {
            p();
        } else if (s()) {
            n();
        } else if (t()) {
            o();
        }
    }

    private boolean r() {
        return this.f10310e != null;
    }

    private boolean s() {
        return this.f10316k != null;
    }

    private boolean t() {
        return this.f10318m != null;
    }

    private boolean u() {
        return this.f10314i != null;
    }

    @Override // j8.b
    public void a(Bundle bundle) {
        if (!r()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        f9.e.a("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f10311f.m(bundle);
        } finally {
            f9.e.d();
        }
    }

    @Override // j8.b
    public boolean b(int i10, int i11, Intent intent) {
        if (!r()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        f9.e.a("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            return this.f10311f.i(i10, i11, intent);
        } finally {
            f9.e.d();
        }
    }

    @Override // j8.b
    public void c(Intent intent) {
        if (!r()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        f9.e.a("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f10311f.j(intent);
        } finally {
            f9.e.d();
        }
    }

    @Override // j8.b
    public void d(Bundle bundle) {
        if (!r()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        f9.e.a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f10311f.l(bundle);
        } finally {
            f9.e.d();
        }
    }

    @Override // j8.b
    public void e() {
        if (!r()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        f9.e.a("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f10311f.n();
        } finally {
            f9.e.d();
        }
    }

    @Override // j8.b
    public void f(io.flutter.embedding.android.c<Activity> cVar, androidx.lifecycle.e eVar) {
        f9.e.a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.c<Activity> cVar2 = this.f10310e;
            if (cVar2 != null) {
                cVar2.e();
            }
            m();
            this.f10310e = cVar;
            j(cVar.f(), eVar);
        } finally {
            f9.e.d();
        }
    }

    @Override // j8.b
    public void g() {
        if (!r()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        f9.e.a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f10312g = true;
            for (j8.a aVar : this.f10309d.values()) {
                aVar.j();
            }
            l();
        } finally {
            f9.e.d();
        }
    }

    @Override // j8.b
    public void h() {
        if (!r()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        f9.e.a("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            for (j8.a aVar : this.f10309d.values()) {
                aVar.g();
            }
            l();
        } finally {
            f9.e.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i8.b
    public void i(i8.a aVar) {
        f9.e.a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (q(aVar.getClass())) {
                d8.b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f10307b + ").");
                return;
            }
            d8.b.f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f10306a.put(aVar.getClass(), aVar);
            aVar.m(this.f10308c);
            if (aVar instanceof j8.a) {
                j8.a aVar2 = (j8.a) aVar;
                this.f10309d.put(aVar.getClass(), aVar2);
                if (r()) {
                    aVar2.f(this.f10311f);
                }
            }
            if (aVar instanceof n8.a) {
                n8.a aVar3 = (n8.a) aVar;
                this.f10313h.put(aVar.getClass(), aVar3);
                if (u()) {
                    aVar3.b(null);
                }
            }
            if (aVar instanceof k8.a) {
                k8.a aVar4 = (k8.a) aVar;
                this.f10315j.put(aVar.getClass(), aVar4);
                if (s()) {
                    aVar4.a(null);
                }
            }
            if (aVar instanceof l8.a) {
                l8.a aVar5 = (l8.a) aVar;
                this.f10317l.put(aVar.getClass(), aVar5);
                if (t()) {
                    aVar5.b(null);
                }
            }
        } finally {
            f9.e.d();
        }
    }

    public void k() {
        d8.b.f("FlutterEngineCxnRegstry", "Destroying.");
        m();
        x();
    }

    public void n() {
        if (!s()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        f9.e.a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            for (k8.a aVar : this.f10315j.values()) {
                aVar.b();
            }
        } finally {
            f9.e.d();
        }
    }

    public void o() {
        if (!t()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        f9.e.a("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            for (l8.a aVar : this.f10317l.values()) {
                aVar.a();
            }
        } finally {
            f9.e.d();
        }
    }

    @Override // j8.b
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!r()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        f9.e.a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            return this.f10311f.k(i10, strArr, iArr);
        } finally {
            f9.e.d();
        }
    }

    public void p() {
        if (!u()) {
            d8.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        f9.e.a("FlutterEngineConnectionRegistry#detachFromService");
        try {
            for (n8.a aVar : this.f10313h.values()) {
                aVar.a();
            }
            this.f10314i = null;
        } finally {
            f9.e.d();
        }
    }

    public boolean q(Class<? extends i8.a> cls) {
        return this.f10306a.containsKey(cls);
    }

    public void v(Class<? extends i8.a> cls) {
        i8.a aVar = this.f10306a.get(cls);
        if (aVar == null) {
            return;
        }
        f9.e.a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (aVar instanceof j8.a) {
                if (r()) {
                    ((j8.a) aVar).g();
                }
                this.f10309d.remove(cls);
            }
            if (aVar instanceof n8.a) {
                if (u()) {
                    ((n8.a) aVar).a();
                }
                this.f10313h.remove(cls);
            }
            if (aVar instanceof k8.a) {
                if (s()) {
                    ((k8.a) aVar).b();
                }
                this.f10315j.remove(cls);
            }
            if (aVar instanceof l8.a) {
                if (t()) {
                    ((l8.a) aVar).a();
                }
                this.f10317l.remove(cls);
            }
            aVar.d(this.f10308c);
            this.f10306a.remove(cls);
        } finally {
            f9.e.d();
        }
    }

    public void w(Set<Class<? extends i8.a>> set) {
        for (Class<? extends i8.a> cls : set) {
            v(cls);
        }
    }

    public void x() {
        w(new HashSet(this.f10306a.keySet()));
        this.f10306a.clear();
    }
}
