package p1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p1.u;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f15079d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final ScheduledExecutorService f15080e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a  reason: collision with root package name */
    private final String f15081a;

    /* renamed from: b  reason: collision with root package name */
    private final q0.c0 f15082b;

    /* renamed from: c  reason: collision with root package name */
    private String f15083c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    public a0(Context context, String applicationId) {
        PackageInfo packageInfo;
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(applicationId, "applicationId");
        this.f15081a = applicationId;
        this.f15082b = new q0.c0(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f15083c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void g(String str) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            final Bundle b10 = f15079d.b(str);
            f15080e.schedule(new Runnable() { // from class: p1.z
                @Override // java.lang.Runnable
                public final void run() {
                    a0.h(a0.this, b10);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a0 this$0, Bundle bundle) {
        if (k1.a.d(a0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(this$0, "this$0");
            kotlin.jvm.internal.l.e(bundle, "$bundle");
            this$0.f15082b.g("fb_mobile_login_heartbeat", bundle);
        } catch (Throwable th) {
            k1.a.b(th, a0.class);
        }
    }

    public static /* synthetic */ void o(a0 a0Var, String str, String str2, String str3, int i10, Object obj) {
        if (k1.a.d(a0.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        try {
            a0Var.n(str, str2, str3);
        } catch (Throwable th) {
            k1.a.b(th, a0.class);
        }
    }

    public final String b() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            return this.f15081a;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public final void c(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f15079d.b(str);
            if (str3 != null) {
                b10.putString("2_result", str3);
            }
            if (str4 != null) {
                b10.putString("5_error_message", str4);
            }
            if (str5 != null) {
                b10.putString("4_error_code", str5);
            }
            if (map != null && (!map.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                b10.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            b10.putString("3_method", str2);
            this.f15082b.g(str6, b10);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void d(String str, String str2, String str3) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f15079d.b(str);
            b10.putString("3_method", str2);
            this.f15082b.g(str3, b10);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void e(String str, String str2, String str3) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f15079d.b(str);
            b10.putString("3_method", str2);
            this.f15082b.g(str3, b10);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void f(String str, Map<String, String> loggingExtras, u.f.a aVar, Map<String, String> map, Exception exc, String str2) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(loggingExtras, "loggingExtras");
            Bundle b10 = f15079d.b(str);
            if (aVar != null) {
                b10.putString("2_result", aVar.g());
            }
            if ((exc == null ? null : exc.getMessage()) != null) {
                b10.putString("5_error_message", exc.getMessage());
            }
            JSONObject jSONObject = loggingExtras.isEmpty() ^ true ? new JSONObject(loggingExtras) : null;
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (key != null) {
                            jSONObject.put(key, value);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                b10.putString("6_extras", jSONObject.toString());
            }
            this.f15082b.g(str2, b10);
            if (aVar == u.f.a.SUCCESS) {
                g(str);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void i(String str, Exception exception) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(exception, "exception");
            Bundle b10 = f15079d.b(str);
            b10.putString("2_result", u.f.a.ERROR.g());
            b10.putString("5_error_message", exception.toString());
            this.f15082b.g("fb_mobile_login_status_complete", b10);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void j(String str) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f15079d.b(str);
            b10.putString("2_result", "failure");
            this.f15082b.g("fb_mobile_login_status_complete", b10);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void k(String str) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            this.f15082b.g("fb_mobile_login_status_start", f15079d.b(str));
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void l(String str) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f15079d.b(str);
            b10.putString("2_result", u.f.a.SUCCESS.g());
            this.f15082b.g("fb_mobile_login_status_complete", b10);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void m(u.e pendingLoginRequest, String str) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(pendingLoginRequest, "pendingLoginRequest");
            Bundle b10 = f15079d.b(pendingLoginRequest.b());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", pendingLoginRequest.m().toString());
                jSONObject.put("request_code", u.f15222v.b());
                jSONObject.put("permissions", TextUtils.join(",", pendingLoginRequest.x()));
                jSONObject.put("default_audience", pendingLoginRequest.j().toString());
                jSONObject.put("isReauthorize", pendingLoginRequest.E());
                String str2 = this.f15083c;
                if (str2 != null) {
                    jSONObject.put("facebookVersion", str2);
                }
                if (pendingLoginRequest.p() != null) {
                    jSONObject.put("target_app", pendingLoginRequest.p().toString());
                }
                b10.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.f15082b.g(str, b10);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void n(String str, String str2, String str3) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Bundle b10 = f15079d.b("");
            b10.putString("2_result", u.f.a.ERROR.g());
            b10.putString("5_error_message", str2);
            b10.putString("3_method", str3);
            this.f15082b.g(str, b10);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
