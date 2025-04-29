package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.e;
import java.util.Collection;
import java.util.ListIterator;
import s9.u;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f496a;

    /* renamed from: b  reason: collision with root package name */
    private final t9.f<j> f497b = new t9.f<>();

    /* renamed from: c  reason: collision with root package name */
    private da.a<u> f498c;

    /* renamed from: d  reason: collision with root package name */
    private OnBackInvokedCallback f499d;

    /* renamed from: e  reason: collision with root package name */
    private OnBackInvokedDispatcher f500e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f501f;

    /* loaded from: classes.dex */
    private final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.g, androidx.activity.a {

        /* renamed from: j  reason: collision with root package name */
        private final androidx.lifecycle.e f502j;

        /* renamed from: k  reason: collision with root package name */
        private final j f503k;

        /* renamed from: l  reason: collision with root package name */
        private androidx.activity.a f504l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f505m;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.e lifecycle, j onBackPressedCallback) {
            kotlin.jvm.internal.l.e(lifecycle, "lifecycle");
            kotlin.jvm.internal.l.e(onBackPressedCallback, "onBackPressedCallback");
            this.f505m = onBackPressedDispatcher;
            this.f502j = lifecycle;
            this.f503k = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f502j.c(this);
            this.f503k.e(this);
            androidx.activity.a aVar = this.f504l;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f504l = null;
        }

        @Override // androidx.lifecycle.g
        public void q(androidx.lifecycle.i source, e.a event) {
            kotlin.jvm.internal.l.e(source, "source");
            kotlin.jvm.internal.l.e(event, "event");
            if (event == e.a.ON_START) {
                this.f504l = this.f505m.c(this.f503k);
            } else if (event != e.a.ON_STOP) {
                if (event == e.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f504l;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.m implements da.a<u> {
        a() {
            super(0);
        }

        public final void a() {
            OnBackPressedDispatcher.this.g();
        }

        @Override // da.a
        public /* bridge */ /* synthetic */ u invoke() {
            a();
            return u.f17878a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.m implements da.a<u> {
        b() {
            super(0);
        }

        public final void a() {
            OnBackPressedDispatcher.this.e();
        }

        @Override // da.a
        public /* bridge */ /* synthetic */ u invoke() {
            a();
            return u.f17878a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f508a = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(da.a onBackInvoked) {
            kotlin.jvm.internal.l.e(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback b(final da.a<u> onBackInvoked) {
            kotlin.jvm.internal.l.e(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.k
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.c.c(da.a.this);
                }
            };
        }

        public final void d(Object dispatcher, int i10, Object callback) {
            kotlin.jvm.internal.l.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.l.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            kotlin.jvm.internal.l.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.l.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d implements androidx.activity.a {

        /* renamed from: j  reason: collision with root package name */
        private final j f509j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f510k;

        public d(OnBackPressedDispatcher onBackPressedDispatcher, j onBackPressedCallback) {
            kotlin.jvm.internal.l.e(onBackPressedCallback, "onBackPressedCallback");
            this.f510k = onBackPressedDispatcher;
            this.f509j = onBackPressedCallback;
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f510k.f497b.remove(this.f509j);
            this.f509j.e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f509j.g(null);
                this.f510k.g();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f496a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f498c = new a();
            this.f499d = c.f508a.b(new b());
        }
    }

    public final void b(androidx.lifecycle.i owner, j onBackPressedCallback) {
        kotlin.jvm.internal.l.e(owner, "owner");
        kotlin.jvm.internal.l.e(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.e a10 = owner.a();
        if (a10.b() == e.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new LifecycleOnBackPressedCancellable(this, a10, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            onBackPressedCallback.g(this.f498c);
        }
    }

    public final androidx.activity.a c(j onBackPressedCallback) {
        kotlin.jvm.internal.l.e(onBackPressedCallback, "onBackPressedCallback");
        this.f497b.add(onBackPressedCallback);
        d dVar = new d(this, onBackPressedCallback);
        onBackPressedCallback.a(dVar);
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            onBackPressedCallback.g(this.f498c);
        }
        return dVar;
    }

    public final boolean d() {
        t9.f<j> fVar = this.f497b;
        if ((fVar instanceof Collection) && fVar.isEmpty()) {
            return false;
        }
        for (j jVar : fVar) {
            if (jVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        j jVar;
        t9.f<j> fVar = this.f497b;
        ListIterator<j> listIterator = fVar.listIterator(fVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                jVar = null;
                break;
            }
            jVar = listIterator.previous();
            if (jVar.c()) {
                break;
            }
        }
        j jVar2 = jVar;
        if (jVar2 != null) {
            jVar2.b();
            return;
        }
        Runnable runnable = this.f496a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.l.e(invoker, "invoker");
        this.f500e = invoker;
        g();
    }

    public final void g() {
        boolean d10 = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f500e;
        OnBackInvokedCallback onBackInvokedCallback = this.f499d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (d10 && !this.f501f) {
            c.f508a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f501f = true;
        } else if (d10 || !this.f501f) {
        } else {
            c.f508a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f501f = false;
        }
    }
}
