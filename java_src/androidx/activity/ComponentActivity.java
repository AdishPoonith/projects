package androidx.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.p;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.x;
import androidx.savedstate.a;
import e.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import s9.u;
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.g implements b0, androidx.lifecycle.d, f0.d, l, androidx.activity.result.d, i {
    private final CopyOnWriteArrayList<androidx.core.util.a<p>> A;
    private boolean B;
    private boolean C;

    /* renamed from: l  reason: collision with root package name */
    final d.a f459l = new d.a();

    /* renamed from: m  reason: collision with root package name */
    private final androidx.core.view.h f460m = new androidx.core.view.h(new Runnable() { // from class: androidx.activity.e
        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.z();
        }
    });

    /* renamed from: n  reason: collision with root package name */
    private final androidx.lifecycle.j f461n = new androidx.lifecycle.j(this);

    /* renamed from: o  reason: collision with root package name */
    final f0.c f462o;

    /* renamed from: p  reason: collision with root package name */
    private a0 f463p;

    /* renamed from: q  reason: collision with root package name */
    private final OnBackPressedDispatcher f464q;

    /* renamed from: r  reason: collision with root package name */
    private final f f465r;

    /* renamed from: s  reason: collision with root package name */
    final h f466s;

    /* renamed from: t  reason: collision with root package name */
    private int f467t;

    /* renamed from: u  reason: collision with root package name */
    private final AtomicInteger f468u;

    /* renamed from: v  reason: collision with root package name */
    private final ActivityResultRegistry f469v;

    /* renamed from: w  reason: collision with root package name */
    private final CopyOnWriteArrayList<androidx.core.util.a<Configuration>> f470w;

    /* renamed from: x  reason: collision with root package name */
    private final CopyOnWriteArrayList<androidx.core.util.a<Integer>> f471x;

    /* renamed from: y  reason: collision with root package name */
    private final CopyOnWriteArrayList<androidx.core.util.a<Intent>> f472y;

    /* renamed from: z  reason: collision with root package name */
    private final CopyOnWriteArrayList<androidx.core.util.a<androidx.core.app.h>> f473z;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f479j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ a.C0128a f480k;

            a(int i10, a.C0128a c0128a) {
                this.f479j = i10;
                this.f480k = c0128a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f479j, this.f480k.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0009b implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f482j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f483k;

            RunnableC0009b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f482j = i10;
                this.f483k = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f482j, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f483k));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i10, e.a<I, O> aVar, I i11, androidx.core.app.c cVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0128a<O> b10 = aVar.b(componentActivity, i11);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, i11);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.n(componentActivity, stringArrayExtra, i10);
            } else if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.core.app.b.p(componentActivity, a10, i10, bundle2);
            } else {
                androidx.activity.result.e eVar = (androidx.activity.result.e) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.b.q(componentActivity, eVar.d(), i10, eVar.a(), eVar.b(), eVar.c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0009b(i10, e10));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        Object f485a;

        /* renamed from: b  reason: collision with root package name */
        a0 f486b;

        e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f extends Executor {
        void y(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: k  reason: collision with root package name */
        Runnable f488k;

        /* renamed from: j  reason: collision with root package name */
        final long f487j = SystemClock.uptimeMillis() + 10000;

        /* renamed from: l  reason: collision with root package name */
        boolean f489l = false;

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            Runnable runnable = this.f488k;
            if (runnable != null) {
                runnable.run();
                this.f488k = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f488k = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f489l) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.g.this.b();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f488k;
            if (runnable != null) {
                runnable.run();
                this.f488k = null;
                if (!ComponentActivity.this.f466s.c()) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f487j) {
                return;
            }
            this.f489l = false;
            ComponentActivity.this.getWindow().getDecorView().post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.f
        public void y(View view) {
            if (this.f489l) {
                return;
            }
            this.f489l = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        f0.c a10 = f0.c.a(this);
        this.f462o = a10;
        this.f464q = new OnBackPressedDispatcher(new a());
        f w10 = w();
        this.f465r = w10;
        this.f466s = new h(w10, new da.a() { // from class: androidx.activity.d
            @Override // da.a
            public final Object invoke() {
                u A;
                A = ComponentActivity.this.A();
                return A;
            }
        });
        this.f468u = new AtomicInteger();
        this.f469v = new b();
        this.f470w = new CopyOnWriteArrayList<>();
        this.f471x = new CopyOnWriteArrayList<>();
        this.f472y = new CopyOnWriteArrayList<>();
        this.f473z = new CopyOnWriteArrayList<>();
        this.A = new CopyOnWriteArrayList<>();
        this.B = false;
        this.C = false;
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i10 = Build.VERSION.SDK_INT;
        a().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.g
            public void q(androidx.lifecycle.i iVar, e.a aVar) {
                if (aVar == e.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        c.a(peekDecorView);
                    }
                }
            }
        });
        a().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.g
            public void q(androidx.lifecycle.i iVar, e.a aVar) {
                if (aVar == e.a.ON_DESTROY) {
                    ComponentActivity.this.f459l.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.p().a();
                }
            }
        });
        a().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.g
            public void q(androidx.lifecycle.i iVar, e.a aVar) {
                ComponentActivity.this.x();
                ComponentActivity.this.a().c(this);
            }
        });
        a10.c();
        t.a(this);
        if (i10 <= 23) {
            a().a(new ImmLeaksCleaner(this));
        }
        j().h("android:support:activity-result", new a.c() { // from class: androidx.activity.b
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle B;
                B = ComponentActivity.this.B();
                return B;
            }
        });
        v(new d.b() { // from class: androidx.activity.c
            @Override // d.b
            public final void a(Context context) {
                ComponentActivity.this.C(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u A() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle B() {
        Bundle bundle = new Bundle();
        this.f469v.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Context context) {
        Bundle b10 = j().b("android:support:activity-result");
        if (b10 != null) {
            this.f469v.g(b10);
        }
    }

    private f w() {
        return new g();
    }

    private void y() {
        c0.a(getWindow().getDecorView(), this);
        d0.a(getWindow().getDecorView(), this);
        f0.e.a(getWindow().getDecorView(), this);
        o.a(getWindow().getDecorView(), this);
        n.a(getWindow().getDecorView(), this);
    }

    @Deprecated
    public Object D() {
        return null;
    }

    @Override // androidx.core.app.g, androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        return this.f461n;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        this.f465r.y(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.d
    public c0.a h() {
        c0.d dVar = new c0.d();
        if (getApplication() != null) {
            dVar.b(x.a.f2578e, getApplication());
        }
        dVar.b(t.f2561a, this);
        dVar.b(t.f2562b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            dVar.b(t.f2563c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // androidx.activity.l
    public final OnBackPressedDispatcher i() {
        return this.f464q;
    }

    @Override // f0.d
    public final androidx.savedstate.a j() {
        return this.f462o.b();
    }

    @Override // androidx.activity.result.d
    public final ActivityResultRegistry m() {
        return this.f469v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f469v.b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f464q.e();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.a<Configuration>> it = this.f470w.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f462o.d(bundle);
        this.f459l.c(this);
        super.onCreate(bundle);
        q.e(this);
        if (androidx.core.os.a.c()) {
            this.f464q.f(d.a(this));
        }
        int i10 = this.f467t;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            this.f460m.a(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.f460m.c(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.B) {
            return;
        }
        Iterator<androidx.core.util.a<androidx.core.app.h>> it = this.f473z.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.h(z10));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.B = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.B = false;
            Iterator<androidx.core.util.a<androidx.core.app.h>> it = this.f473z.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.h(z10, configuration));
            }
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.a<Intent>> it = this.f472y.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.f460m.b(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.C) {
            return;
        }
        Iterator<androidx.core.util.a<p>> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().accept(new p(z10));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.C = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.C = false;
            Iterator<androidx.core.util.a<p>> it = this.A.iterator();
            while (it.hasNext()) {
                it.next().accept(new p(z10, configuration));
            }
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            this.f460m.d(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.f469v.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object D = D();
        a0 a0Var = this.f463p;
        if (a0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            a0Var = eVar.f486b;
        }
        if (a0Var == null && D == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f485a = D;
        eVar2.f486b = a0Var;
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.e a10 = a();
        if (a10 instanceof androidx.lifecycle.j) {
            ((androidx.lifecycle.j) a10).n(e.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f462o.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<androidx.core.util.a<Integer>> it = this.f471x.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // androidx.lifecycle.b0
    public a0 p() {
        if (getApplication() != null) {
            x();
            return this.f463p;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (h0.a.h()) {
                h0.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f466s.b();
        } finally {
            h0.a.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        y();
        this.f465r.y(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        y();
        this.f465r.y(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        this.f465r.y(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public final void v(d.b bVar) {
        this.f459l.a(bVar);
    }

    void x() {
        if (this.f463p == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f463p = eVar.f486b;
            }
            if (this.f463p == null) {
                this.f463p = new a0();
            }
        }
    }

    public void z() {
        invalidateOptionsMenu();
    }
}
