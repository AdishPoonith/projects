package c1;

import android.os.Bundle;
import android.view.View;
import c1.j;
import f1.l0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import ka.p;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
import p0.j0;
import q0.c0;
import z0.f;
/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: n  reason: collision with root package name */
    public static final a f3162n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    private static final Set<Integer> f3163o = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f3164j;

    /* renamed from: k  reason: collision with root package name */
    private final WeakReference<View> f3165k;

    /* renamed from: l  reason: collision with root package name */
    private final WeakReference<View> f3166l;

    /* renamed from: m  reason: collision with root package name */
    private final String f3167m;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2, float[] fArr) {
            e eVar = e.f3146a;
            if (e.f(str)) {
                f0 f0Var = f0.f14852a;
                new c0(f0.l()).e(str, str2);
            } else if (e.e(str)) {
                h(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f(String str, final String str2) {
            b bVar = b.f3139a;
            final String d10 = b.d(str);
            if (d10 == null) {
                return false;
            }
            if (l.a(d10, "other")) {
                return true;
            }
            l0 l0Var = l0.f8470a;
            l0.w0(new Runnable() { // from class: c1.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.a.g(d10, str2);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(String queriedEvent, String buttonText) {
            l.e(queriedEvent, "$queriedEvent");
            l.e(buttonText, "$buttonText");
            j.f3162n.e(queriedEvent, buttonText, new float[0]);
        }

        private final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                int length = fArr.length;
                int i10 = 0;
                while (i10 < length) {
                    float f10 = fArr[i10];
                    i10++;
                    sb.append(f10);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                j0.c cVar = j0.f14918n;
                v vVar = v.f12860a;
                Locale locale = Locale.US;
                f0 f0Var = f0.f14852a;
                String format = String.format(locale, "%s/suggested_events", Arrays.copyOf(new Object[]{f0.m()}, 1));
                l.d(format, "java.lang.String.format(locale, format, *args)");
                j0 A = cVar.A(null, format, null, null);
                A.H(bundle);
                A.k();
            } catch (JSONException unused) {
            }
        }

        public final void d(View hostView, View rootView, String activityName) {
            l.e(hostView, "hostView");
            l.e(rootView, "rootView");
            l.e(activityName, "activityName");
            int hashCode = hostView.hashCode();
            if (j.b().contains(Integer.valueOf(hashCode))) {
                return;
            }
            u0.f fVar = u0.f.f18452a;
            u0.f.r(hostView, new j(hostView, rootView, activityName, null));
            j.b().add(Integer.valueOf(hashCode));
        }
    }

    private j(View view, View view2, String str) {
        String r10;
        u0.f fVar = u0.f.f18452a;
        this.f3164j = u0.f.g(view);
        this.f3165k = new WeakReference<>(view2);
        this.f3166l = new WeakReference<>(view);
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        l.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        r10 = p.r(lowerCase, "activity", "", false, 4, null);
        this.f3167m = r10;
    }

    public /* synthetic */ j(View view, View view2, String str, kotlin.jvm.internal.g gVar) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set b() {
        if (k1.a.d(j.class)) {
            return null;
        }
        try {
            return f3163o;
        } catch (Throwable th) {
            k1.a.b(th, j.class);
            return null;
        }
    }

    private final void c(final String str, final String str2, final JSONObject jSONObject) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            l0 l0Var = l0.f8470a;
            l0.w0(new Runnable() { // from class: c1.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.d(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(JSONObject viewData, String buttonText, j this$0, String pathID) {
        if (k1.a.d(j.class)) {
            return;
        }
        try {
            l.e(viewData, "$viewData");
            l.e(buttonText, "$buttonText");
            l.e(this$0, "this$0");
            l.e(pathID, "$pathID");
            try {
                l0 l0Var = l0.f8470a;
                f0 f0Var = f0.f14852a;
                String u10 = l0.u(f0.l());
                if (u10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = u10.toLowerCase();
                l.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                c1.a aVar = c1.a.f3133a;
                float[] a10 = c1.a.a(viewData, lowerCase);
                String c10 = c1.a.c(buttonText, this$0.f3167m, lowerCase);
                if (a10 == null) {
                    return;
                }
                z0.f fVar = z0.f.f20652a;
                String[] q10 = z0.f.q(f.a.MTML_APP_EVENT_PREDICTION, new float[][]{a10}, new String[]{c10});
                if (q10 == null) {
                    return;
                }
                String str = q10[0];
                b bVar = b.f3139a;
                b.a(pathID, str);
                if (l.a(str, "other")) {
                    return;
                }
                f3162n.e(str, buttonText, a10);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            k1.a.b(th, j.class);
        }
    }

    private final void e() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            View view = this.f3165k.get();
            View view2 = this.f3166l.get();
            if (view != null && view2 != null) {
                try {
                    c cVar = c.f3143a;
                    String d10 = c.d(view2);
                    b bVar = b.f3139a;
                    String b10 = b.b(view2, d10);
                    if (b10 == null || f3162n.f(b10, d10)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", c.b(view, view2));
                    jSONObject.put("screenname", this.f3167m);
                    c(b10, d10, jSONObject);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            l.e(view, "view");
            View.OnClickListener onClickListener = this.f3164j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            e();
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
