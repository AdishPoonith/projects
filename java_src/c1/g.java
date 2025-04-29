package c1;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import c1.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: m  reason: collision with root package name */
    public static final a f3151m = new a(null);

    /* renamed from: n  reason: collision with root package name */
    private static final Map<Integer, g> f3152n = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final WeakReference<Activity> f3153j;

    /* renamed from: k  reason: collision with root package name */
    private final Handler f3154k;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicBoolean f3155l;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(Activity activity) {
            l.e(activity, "activity");
            int hashCode = activity.hashCode();
            Map b10 = g.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b10.get(valueOf);
            if (obj == null) {
                obj = new g(activity, null);
                b10.put(valueOf, obj);
            }
            g.c((g) obj);
        }

        public final void b(Activity activity) {
            l.e(activity, "activity");
            g gVar = (g) g.b().remove(Integer.valueOf(activity.hashCode()));
            if (gVar == null) {
                return;
            }
            g.d(gVar);
        }
    }

    private g(Activity activity) {
        this.f3153j = new WeakReference<>(activity);
        this.f3154k = new Handler(Looper.getMainLooper());
        this.f3155l = new AtomicBoolean(false);
    }

    public /* synthetic */ g(Activity activity, kotlin.jvm.internal.g gVar) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (k1.a.d(g.class)) {
            return null;
        }
        try {
            return f3152n;
        } catch (Throwable th) {
            k1.a.b(th, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(g gVar) {
        if (k1.a.d(g.class)) {
            return;
        }
        try {
            gVar.g();
        } catch (Throwable th) {
            k1.a.b(th, g.class);
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (k1.a.d(g.class)) {
            return;
        }
        try {
            gVar.h();
        } catch (Throwable th) {
            k1.a.b(th, g.class);
        }
    }

    private final void e() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: c1.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.f(g.this);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f3154k.post(runnable);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g this$0) {
        if (k1.a.d(g.class)) {
            return;
        }
        try {
            l.e(this$0, "this$0");
            try {
                y0.g gVar = y0.g.f20314a;
                View e10 = y0.g.e(this$0.f3153j.get());
                Activity activity = this$0.f3153j.get();
                if (e10 != null && activity != null) {
                    c cVar = c.f3143a;
                    for (View view : c.a(e10)) {
                        u0.d dVar = u0.d.f18448a;
                        if (!u0.d.g(view)) {
                            c cVar2 = c.f3143a;
                            String d10 = c.d(view);
                            if ((d10.length() > 0) && d10.length() <= 300) {
                                j.a aVar = j.f3162n;
                                String localClassName = activity.getLocalClassName();
                                l.d(localClassName, "activity.localClassName");
                                aVar.d(view, e10, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            k1.a.b(th, g.class);
        }
    }

    private final void g() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (this.f3155l.getAndSet(true)) {
                return;
            }
            y0.g gVar = y0.g.f20314a;
            View e10 = y0.g.e(this.f3153j.get());
            if (e10 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e10.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                e();
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void h() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (this.f3155l.getAndSet(false)) {
                y0.g gVar = y0.g.f20314a;
                View e10 = y0.g.e(this.f3153j.get());
                if (e10 == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = e10.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
