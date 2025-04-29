package t0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import f1.c0;
import f1.l0;
import f1.z;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
import p0.j0;
import p0.o0;
import p0.r0;
import t0.l;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: e  reason: collision with root package name */
    public static final a f17957e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f17958f;

    /* renamed from: g  reason: collision with root package name */
    private static l f17959g;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f17960a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Activity> f17961b;

    /* renamed from: c  reason: collision with root package name */
    private Timer f17962c;

    /* renamed from: d  reason: collision with root package name */
    private String f17963d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(o0 it) {
            kotlin.jvm.internal.l.e(it, "it");
            c0.f8388e.b(r0.APP_EVENTS, l.d(), "App index sent to FB!");
        }

        public final j0 b(String str, p0.a aVar, String str2, String requestType) {
            kotlin.jvm.internal.l.e(requestType, "requestType");
            if (str == null) {
                return null;
            }
            j0.c cVar = j0.f14918n;
            v vVar = v.f12860a;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
            j0 A = cVar.A(aVar, format, null, null);
            Bundle u10 = A.u();
            if (u10 == null) {
                u10 = new Bundle();
            }
            u10.putString("tree", str);
            y0.g gVar = y0.g.f20314a;
            u10.putString("app_version", y0.g.d());
            u10.putString("platform", "android");
            u10.putString("request_type", requestType);
            if (kotlin.jvm.internal.l.a(requestType, "app_indexing")) {
                e eVar = e.f17921a;
                u10.putString("device_session_id", e.g());
            }
            A.H(u10);
            A.D(new j0.b() { // from class: t0.k
                @Override // p0.j0.b
                public final void b(o0 o0Var) {
                    l.a.c(o0Var);
                }
            });
            return A;
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<View> f17964a;

        public b(View rootView) {
            kotlin.jvm.internal.l.e(rootView, "rootView");
            this.f17964a = new WeakReference<>(rootView);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            View view = this.f17964a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            kotlin.jvm.internal.l.d(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) l.c(l.this).get();
                y0.g gVar = y0.g.f20314a;
                View e10 = y0.g.e(activity);
                if (activity != null && e10 != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    e eVar = e.f17921a;
                    if (e.h()) {
                        z zVar = z.f8603a;
                        if (z.b()) {
                            u0.e eVar2 = u0.e.f18449a;
                            u0.e.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(e10));
                        l.e(l.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e11) {
                            Log.e(l.d(), "Failed to take screenshot.", e11);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            u0.f fVar = u0.f.f18452a;
                            jSONArray.put(u0.f.d(e10));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(l.d(), "Failed to create JSONObject");
                        }
                        String jSONObject2 = jSONObject.toString();
                        kotlin.jvm.internal.l.d(jSONObject2, "viewTree.toString()");
                        l.f(l.this, jSONObject2);
                    }
                }
            } catch (Exception e12) {
                Log.e(l.d(), "UI Component tree indexing failure!", e12);
            }
        }
    }

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f17958f = canonicalName;
    }

    public l(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
        this.f17961b = new WeakReference<>(activity);
        this.f17963d = null;
        this.f17960a = new Handler(Looper.getMainLooper());
        f17959g = this;
    }

    public static final /* synthetic */ WeakReference c(l lVar) {
        if (k1.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f17961b;
        } catch (Throwable th) {
            k1.a.b(th, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (k1.a.d(l.class)) {
            return null;
        }
        try {
            return f17958f;
        } catch (Throwable th) {
            k1.a.b(th, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler e(l lVar) {
        if (k1.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.f17960a;
        } catch (Throwable th) {
            k1.a.b(th, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void f(l lVar, String str) {
        if (k1.a.d(l.class)) {
            return;
        }
        try {
            lVar.j(str);
        } catch (Throwable th) {
            k1.a.b(th, l.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(l this$0, TimerTask indexingTask) {
        if (k1.a.d(l.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(this$0, "this$0");
            kotlin.jvm.internal.l.e(indexingTask, "$indexingTask");
            try {
                Timer timer = this$0.f17962c;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.f17963d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.f17962c = timer2;
            } catch (Exception e10) {
                Log.e(f17958f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th) {
            k1.a.b(th, l.class);
        }
    }

    private final void j(final String str) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            f0 f0Var = f0.f14852a;
            f0.t().execute(new Runnable() { // from class: t0.i
                @Override // java.lang.Runnable
                public final void run() {
                    l.k(str, this);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(String tree, l this$0) {
        if (k1.a.d(l.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(tree, "$tree");
            kotlin.jvm.internal.l.e(this$0, "this$0");
            l0 l0Var = l0.f8470a;
            String h02 = l0.h0(tree);
            p0.a e10 = p0.a.f14786u.e();
            if (h02 == null || !kotlin.jvm.internal.l.a(h02, this$0.f17963d)) {
                a aVar = f17957e;
                f0 f0Var = f0.f14852a;
                this$0.g(aVar.b(tree, e10, f0.m(), "app_indexing"), h02);
            }
        } catch (Throwable th) {
            k1.a.b(th, l.class);
        }
    }

    public final void g(j0 j0Var, String str) {
        if (k1.a.d(this) || j0Var == null) {
            return;
        }
        try {
            o0 k10 = j0Var.k();
            try {
                JSONObject c10 = k10.c();
                if (c10 == null) {
                    Log.e(f17958f, kotlin.jvm.internal.l.k("Error sending UI component tree to Facebook: ", k10.b()));
                    return;
                }
                if (kotlin.jvm.internal.l.a("true", c10.optString("success"))) {
                    c0.f8388e.b(r0.APP_EVENTS, f17958f, "Successfully send UI component tree to server");
                    this.f17963d = str;
                }
                if (c10.has("is_app_indexing_enabled")) {
                    boolean z10 = c10.getBoolean("is_app_indexing_enabled");
                    e eVar = e.f17921a;
                    e.n(z10);
                }
            } catch (JSONException e10) {
                Log.e(f17958f, "Error decoding server response.", e10);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void h() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            final c cVar = new c();
            try {
                f0 f0Var = f0.f14852a;
                f0.t().execute(new Runnable() { // from class: t0.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.i(l.this, cVar);
                    }
                });
            } catch (RejectedExecutionException e10) {
                Log.e(f17958f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void l() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (this.f17961b.get() == null) {
                return;
            }
            try {
                Timer timer = this.f17962c;
                if (timer != null) {
                    timer.cancel();
                }
                this.f17962c = null;
            } catch (Exception e10) {
                Log.e(f17958f, "Error unscheduling indexing job", e10);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
