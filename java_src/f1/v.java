package f1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import f1.j;
import f1.r;
import f1.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f8582a = new v();

    /* renamed from: b  reason: collision with root package name */
    private static final String f8583b = v.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f8584c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, r> f8585d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference<a> f8586e;

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentLinkedQueue<b> f8587f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f8588g;

    /* renamed from: h  reason: collision with root package name */
    private static JSONArray f8589h;

    /* loaded from: classes.dex */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(r rVar);
    }

    static {
        List<String> g10;
        g10 = t9.p.g("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");
        f8584c = g10;
        f8585d = new ConcurrentHashMap();
        f8586e = new AtomicReference<>(a.NOT_LOADED);
        f8587f = new ConcurrentLinkedQueue<>();
    }

    private v() {
    }

    public static final void d(b callback) {
        kotlin.jvm.internal.l.e(callback, "callback");
        f8587f.add(callback);
        g();
    }

    private final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f8584c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        p0.j0 x10 = p0.j0.f14918n.x(null, "app", null);
        x10.E(true);
        x10.H(bundle);
        JSONObject d10 = x10.k().d();
        return d10 == null ? new JSONObject() : d10;
    }

    public static final r f(String str) {
        if (str != null) {
            return f8585d.get(str);
        }
        return null;
    }

    public static final void g() {
        p0.f0 f0Var = p0.f0.f14852a;
        final Context l10 = p0.f0.l();
        final String m10 = p0.f0.m();
        l0 l0Var = l0.f8470a;
        if (l0.X(m10)) {
            f8586e.set(a.ERROR);
            f8582a.k();
        } else if (f8585d.containsKey(m10)) {
            f8586e.set(a.SUCCESS);
            f8582a.k();
        } else {
            AtomicReference<a> atomicReference = f8586e;
            a aVar = a.NOT_LOADED;
            a aVar2 = a.LOADING;
            if (!(atomicReference.compareAndSet(aVar, aVar2) || atomicReference.compareAndSet(a.ERROR, aVar2))) {
                f8582a.k();
                return;
            }
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m10}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
            p0.f0.t().execute(new Runnable() { // from class: f1.s
                @Override // java.lang.Runnable
                public final void run() {
                    v.h(l10, format, m10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        kotlin.jvm.internal.l.e(context, "$context");
        kotlin.jvm.internal.l.e(settingsKey, "$settingsKey");
        kotlin.jvm.internal.l.e(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        r rVar = null;
        String string = sharedPreferences.getString(settingsKey, null);
        l0 l0Var = l0.f8470a;
        if (!l0.X(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                l0 l0Var2 = l0.f8470a;
                l0.d0("FacebookSDK", e10);
                jSONObject = null;
            }
            if (jSONObject != null) {
                rVar = f8582a.i(applicationId, jSONObject);
            }
        }
        v vVar = f8582a;
        JSONObject e11 = vVar.e(applicationId);
        if (e11 != null) {
            vVar.i(applicationId, e11);
            sharedPreferences.edit().putString(settingsKey, e11.toString()).apply();
        }
        if (rVar != null) {
            String h10 = rVar.h();
            if (!f8588g && h10 != null && h10.length() > 0) {
                f8588g = true;
                Log.w(f8583b, h10);
            }
        }
        q qVar = q.f8511a;
        q.m(applicationId, true);
        y0.i iVar = y0.i.f20320a;
        y0.i.d();
        f8586e.set(f8585d.containsKey(applicationId) ? a.SUCCESS : a.ERROR);
        vVar.k();
    }

    private final Map<String, Map<String, r.b>> j(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
            int i10 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    r.b.a aVar = r.b.f8567e;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    kotlin.jvm.internal.l.d(optJSONObject, "dialogConfigData.optJSONObject(i)");
                    r.b a10 = aVar.a(optJSONObject);
                    if (a10 != null) {
                        String a11 = a10.a();
                        Map map = (Map) hashMap.get(a11);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(a11, map);
                        }
                        map.put(a10.b(), a10);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        }
        return hashMap;
    }

    private final synchronized void k() {
        a aVar = f8586e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            p0.f0 f0Var = p0.f0.f14852a;
            final r rVar = f8585d.get(p0.f0.m());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = f8587f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final b poll = concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: f1.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.l(v.b.this);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = f8587f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final b poll2 = concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: f1.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.m(v.b.this, rVar);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(b bVar) {
        bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(b bVar, r rVar) {
        bVar.b(rVar);
    }

    public static final r n(String applicationId, boolean z10) {
        kotlin.jvm.internal.l.e(applicationId, "applicationId");
        if (!z10) {
            Map<String, r> map = f8585d;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        v vVar = f8582a;
        JSONObject e10 = vVar.e(applicationId);
        if (e10 == null) {
            return null;
        }
        r i10 = vVar.i(applicationId, e10);
        p0.f0 f0Var = p0.f0.f14852a;
        if (kotlin.jvm.internal.l.a(applicationId, p0.f0.m())) {
            f8586e.set(a.SUCCESS);
            vVar.k();
        }
        return i10;
    }

    public final r i(String applicationId, JSONObject settingsJSON) {
        kotlin.jvm.internal.l.e(applicationId, "applicationId");
        kotlin.jvm.internal.l.e(settingsJSON, "settingsJSON");
        JSONArray optJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        j.a aVar = j.f8455g;
        j a10 = aVar.a(optJSONArray);
        if (a10 == null) {
            a10 = aVar.b();
        }
        j jVar = a10;
        int optInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z10 = (optInt & 8) != 0;
        boolean z11 = (optInt & 16) != 0;
        boolean z12 = (optInt & 32) != 0;
        boolean z13 = (optInt & 256) != 0;
        boolean z14 = (optInt & 16384) != 0;
        JSONArray optJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        f8589h = optJSONArray2;
        if (optJSONArray2 != null) {
            z zVar = z.f8603a;
            if (z.b()) {
                u0.e eVar = u0.e.f18449a;
                u0.e.c(optJSONArray2 == null ? null : optJSONArray2.toString());
            }
        }
        boolean optBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String optString = settingsJSON.optString("gdpv4_nux_content", "");
        kotlin.jvm.internal.l.d(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        y0.j jVar2 = y0.j.f20326a;
        int optInt2 = settingsJSON.optInt("app_events_session_timeout", y0.j.a());
        EnumSet<i0> a11 = i0.f8448k.a(settingsJSON.optLong("seamless_login"));
        Map<String, Map<String, r.b>> j10 = j(settingsJSON.optJSONObject("android_dialog_configs"));
        String optString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        kotlin.jvm.internal.l.d(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = settingsJSON.optString("smart_login_menu_icon_url");
        kotlin.jvm.internal.l.d(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = settingsJSON.optString("sdk_update_message");
        kotlin.jvm.internal.l.d(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        r rVar = new r(optBoolean, optString, optBoolean2, optInt2, a11, j10, z10, jVar, optString2, optString3, z11, z12, optJSONArray2, optString4, z13, z14, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"));
        f8585d.put(applicationId, rVar);
        return rVar;
    }
}
