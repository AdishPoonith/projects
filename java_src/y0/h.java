package y0;

import android.content.Context;
import f1.c0;
import f1.l0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p0.r0;
import s9.q;
import t9.g0;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f20315a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<a, String> f20316b;

    /* loaded from: classes.dex */
    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    static {
        HashMap e10;
        e10 = g0.e(q.a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), q.a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));
        f20316b = e10;
    }

    private h() {
    }

    public static final JSONObject a(a activityType, f1.a aVar, String str, boolean z10, Context context) {
        kotlin.jvm.internal.l.e(activityType, "activityType");
        kotlin.jvm.internal.l.e(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f20316b.get(activityType));
        String d10 = q0.o.f15963b.d();
        if (d10 != null) {
            jSONObject.put("app_user_id", d10);
        }
        l0 l0Var = l0.f8470a;
        l0.x0(jSONObject, aVar, str, z10, context);
        try {
            l0.y0(jSONObject, context);
        } catch (Exception e10) {
            c0.f8388e.c(r0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
        }
        l0 l0Var2 = l0.f8470a;
        JSONObject A = l0.A();
        if (A != null) {
            Iterator<String> keys = A.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, A.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
