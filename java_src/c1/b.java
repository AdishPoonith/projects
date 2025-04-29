package c1;

import android.content.SharedPreferences;
import android.view.View;
import f1.l0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
import t9.g0;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    private static SharedPreferences f3141c;

    /* renamed from: a  reason: collision with root package name */
    public static final b f3139a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, String> f3140b = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f3142d = new AtomicBoolean(false);

    private b() {
    }

    public static final void a(String pathID, String predictedEvent) {
        Map m10;
        if (k1.a.d(b.class)) {
            return;
        }
        try {
            l.e(pathID, "pathID");
            l.e(predictedEvent, "predictedEvent");
            if (!f3142d.get()) {
                f3139a.c();
            }
            Map<String, String> map = f3140b;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f3141c;
            if (sharedPreferences == null) {
                l.p("shardPreferences");
                throw null;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            l0 l0Var = l0.f8470a;
            m10 = g0.m(map);
            edit.putString("SUGGESTED_EVENTS_HISTORY", l0.g0(m10)).apply();
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }

    public static final String b(View view, String text) {
        if (k1.a.d(b.class)) {
            return null;
        }
        try {
            l.e(view, "view");
            l.e(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    u0.f fVar = u0.f.f18452a;
                    view = u0.f.j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            l0 l0Var = l0.f8470a;
            return l0.A0(jSONObject.toString());
        } catch (Throwable th) {
            k1.a.b(th, b.class);
            return null;
        }
    }

    private final void c() {
        String str = "";
        if (k1.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f3142d;
            if (atomicBoolean.get()) {
                return;
            }
            f0 f0Var = f0.f14852a;
            SharedPreferences sharedPreferences = f0.l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            l.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f3141c = sharedPreferences;
            Map<String, String> map = f3140b;
            l0 l0Var = l0.f8470a;
            SharedPreferences sharedPreferences2 = f3141c;
            if (sharedPreferences2 == null) {
                l.p("shardPreferences");
                throw null;
            }
            String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(l0.c0(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public static final String d(String pathID) {
        if (k1.a.d(b.class)) {
            return null;
        }
        try {
            l.e(pathID, "pathID");
            Map<String, String> map = f3140b;
            if (map.containsKey(pathID)) {
                return map.get(pathID);
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, b.class);
            return null;
        }
    }
}
