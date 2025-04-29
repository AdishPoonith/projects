package q0;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import f1.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import p0.j0;
import p0.o0;
import p0.r0;
import q0.o;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f  reason: collision with root package name */
    private static ScheduledFuture<?> f15959f;

    /* renamed from: a  reason: collision with root package name */
    public static final m f15954a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static final String f15955b = m.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static final int f15956c = 100;

    /* renamed from: d  reason: collision with root package name */
    private static volatile e f15957d = new e();

    /* renamed from: e  reason: collision with root package name */
    private static final ScheduledExecutorService f15958e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: g  reason: collision with root package name */
    private static final Runnable f15960g = new Runnable() { // from class: q0.k
        @Override // java.lang.Runnable
        public final void run() {
            m.o();
        }
    };

    private m() {
    }

    public static final void g(final a accessTokenAppId, final d appEvent) {
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.l.e(appEvent, "appEvent");
            f15958e.execute(new Runnable() { // from class: q0.g
                @Override // java.lang.Runnable
                public final void run() {
                    m.h(a.this, appEvent);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a accessTokenAppId, d appEvent) {
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.l.e(appEvent, "$appEvent");
            f15957d.a(accessTokenAppId, appEvent);
            if (o.f15963b.c() != o.b.EXPLICIT_ONLY && f15957d.d() > f15956c) {
                n(z.EVENT_THRESHOLD);
            } else if (f15959f == null) {
                f15959f = f15958e.schedule(f15960g, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    public static final j0 i(final a accessTokenAppId, final e0 appEvents, boolean z10, final b0 flushState) {
        if (k1.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.l.e(appEvents, "appEvents");
            kotlin.jvm.internal.l.e(flushState, "flushState");
            String b10 = accessTokenAppId.b();
            f1.v vVar = f1.v.f8582a;
            f1.r n10 = f1.v.n(b10, false);
            j0.c cVar = j0.f14918n;
            kotlin.jvm.internal.v vVar2 = kotlin.jvm.internal.v.f12860a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{b10}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
            final j0 A = cVar.A(null, format, null, null);
            A.E(true);
            Bundle u10 = A.u();
            if (u10 == null) {
                u10 = new Bundle();
            }
            u10.putString("access_token", accessTokenAppId.a());
            String d10 = c0.f15905b.d();
            if (d10 != null) {
                u10.putString("device_token", d10);
            }
            String k10 = r.f15972c.k();
            if (k10 != null) {
                u10.putString("install_referrer", k10);
            }
            A.H(u10);
            boolean l10 = n10 != null ? n10.l() : false;
            p0.f0 f0Var = p0.f0.f14852a;
            int e10 = appEvents.e(A, p0.f0.l(), l10, z10);
            if (e10 == 0) {
                return null;
            }
            flushState.c(flushState.a() + e10);
            A.D(new j0.b() { // from class: q0.l
                @Override // p0.j0.b
                public final void b(o0 o0Var) {
                    m.j(a.this, A, appEvents, flushState, o0Var);
                }
            });
            return A;
        } catch (Throwable th) {
            k1.a.b(th, m.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(a accessTokenAppId, j0 postRequest, e0 appEvents, b0 flushState, o0 response) {
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.l.e(postRequest, "$postRequest");
            kotlin.jvm.internal.l.e(appEvents, "$appEvents");
            kotlin.jvm.internal.l.e(flushState, "$flushState");
            kotlin.jvm.internal.l.e(response, "response");
            q(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    public static final List<j0> k(e appEventCollection, b0 flushResults) {
        if (k1.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(appEventCollection, "appEventCollection");
            kotlin.jvm.internal.l.e(flushResults, "flushResults");
            p0.f0 f0Var = p0.f0.f14852a;
            boolean z10 = p0.f0.z(p0.f0.l());
            ArrayList arrayList = new ArrayList();
            for (a aVar : appEventCollection.f()) {
                e0 c10 = appEventCollection.c(aVar);
                if (c10 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                j0 i10 = i(aVar, c10, z10, flushResults);
                if (i10 != null) {
                    arrayList.add(i10);
                    if (s0.d.f16881a.f()) {
                        s0.g gVar = s0.g.f16907a;
                        s0.g.l(i10);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            k1.a.b(th, m.class);
            return null;
        }
    }

    public static final void l(final z reason) {
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(reason, "reason");
            f15958e.execute(new Runnable() { // from class: q0.i
                @Override // java.lang.Runnable
                public final void run() {
                    m.m(z.this);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(z reason) {
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(reason, "$reason");
            n(reason);
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    public static final void n(z reason) {
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(reason, "reason");
            f fVar = f.f15932a;
            f15957d.b(f.a());
            try {
                b0 u10 = u(reason, f15957d);
                if (u10 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", u10.a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", u10.b());
                    p0.f0 f0Var = p0.f0.f14852a;
                    e0.a.b(p0.f0.l()).d(intent);
                }
            } catch (Exception e10) {
                Log.w(f15955b, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o() {
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            f15959f = null;
            if (o.f15963b.c() != o.b.EXPLICIT_ONLY) {
                n(z.TIMER);
            }
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    public static final Set<a> p() {
        if (k1.a.d(m.class)) {
            return null;
        }
        try {
            return f15957d.f();
        } catch (Throwable th) {
            k1.a.b(th, m.class);
            return null;
        }
    }

    public static final void q(final a accessTokenAppId, j0 request, o0 response, final e0 appEvents, b0 flushState) {
        String str;
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(accessTokenAppId, "accessTokenAppId");
            kotlin.jvm.internal.l.e(request, "request");
            kotlin.jvm.internal.l.e(response, "response");
            kotlin.jvm.internal.l.e(appEvents, "appEvents");
            kotlin.jvm.internal.l.e(flushState, "flushState");
            p0.v b10 = response.b();
            String str2 = "Success";
            a0 a0Var = a0.SUCCESS;
            boolean z10 = true;
            if (b10 != null) {
                if (b10.b() == -1) {
                    str2 = "Failed: No Connectivity";
                    a0Var = a0.NO_CONNECTIVITY;
                } else {
                    kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), b10.toString()}, 2));
                    kotlin.jvm.internal.l.d(str2, "java.lang.String.format(format, *args)");
                    a0Var = a0.SERVER_ERROR;
                }
            }
            p0.f0 f0Var = p0.f0.f14852a;
            if (p0.f0.H(r0.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) request.w()).toString(2);
                    kotlin.jvm.internal.l.d(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                c0.a aVar = f1.c0.f8388e;
                r0 r0Var = r0.APP_EVENTS;
                String TAG = f15955b;
                kotlin.jvm.internal.l.d(TAG, "TAG");
                aVar.c(r0Var, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.q()), str2, str);
            }
            if (b10 == null) {
                z10 = false;
            }
            appEvents.b(z10);
            a0 a0Var2 = a0.NO_CONNECTIVITY;
            if (a0Var == a0Var2) {
                p0.f0 f0Var2 = p0.f0.f14852a;
                p0.f0.t().execute(new Runnable() { // from class: q0.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.r(a.this, appEvents);
                    }
                });
            }
            if (a0Var == a0.SUCCESS || flushState.b() == a0Var2) {
                return;
            }
            flushState.d(a0Var);
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(a accessTokenAppId, e0 appEvents) {
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(accessTokenAppId, "$accessTokenAppId");
            kotlin.jvm.internal.l.e(appEvents, "$appEvents");
            n nVar = n.f15961a;
            n.a(accessTokenAppId, appEvents);
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    public static final void s() {
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            f15958e.execute(new Runnable() { // from class: q0.j
                @Override // java.lang.Runnable
                public final void run() {
                    m.t();
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t() {
        if (k1.a.d(m.class)) {
            return;
        }
        try {
            n nVar = n.f15961a;
            n.b(f15957d);
            f15957d = new e();
        } catch (Throwable th) {
            k1.a.b(th, m.class);
        }
    }

    public static final b0 u(z reason, e appEventCollection) {
        if (k1.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(reason, "reason");
            kotlin.jvm.internal.l.e(appEventCollection, "appEventCollection");
            b0 b0Var = new b0();
            List<j0> k10 = k(appEventCollection, b0Var);
            if (!k10.isEmpty()) {
                c0.a aVar = f1.c0.f8388e;
                r0 r0Var = r0.APP_EVENTS;
                String TAG = f15955b;
                kotlin.jvm.internal.l.d(TAG, "TAG");
                aVar.c(r0Var, TAG, "Flushing %d events due to %s.", Integer.valueOf(b0Var.a()), reason.toString());
                for (j0 j0Var : k10) {
                    j0Var.k();
                }
                return b0Var;
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, m.class);
            return null;
        }
    }
}
