package w0;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import ka.q;
import org.json.JSONObject;
import p0.f0;
import t9.g0;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f19602b;

    /* renamed from: a  reason: collision with root package name */
    public static final j f19601a = new j();

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f19603c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Long> f19604d = new ConcurrentHashMap();

    private j() {
    }

    public static final boolean d() {
        if (k1.a.d(j.class)) {
            return false;
        }
        try {
            f19601a.g();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f19602b;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.l.p("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j10 == 0 || currentTimeMillis - j10 >= 86400) {
                SharedPreferences sharedPreferences2 = f19602b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                    return true;
                }
                kotlin.jvm.internal.l.p("sharedPreferences");
                throw null;
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, j.class);
            return false;
        }
    }

    public static final void e(Map<String, JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap) {
        if (k1.a.d(j.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.l.e(skuDetailsMap, "skuDetailsMap");
            j jVar = f19601a;
            jVar.g();
            jVar.f(jVar.c(jVar.a(purchaseDetailsMap), skuDetailsMap));
        } catch (Throwable th) {
            k1.a.b(th, j.class);
        }
    }

    private final void f(Map<String, String> map) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    y0.i iVar = y0.i.f20320a;
                    y0.i.f(key, value, false);
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g() {
        List b02;
        if (k1.a.d(this)) {
            return;
        }
        try {
            f0 f0Var = f0.f14852a;
            SharedPreferences sharedPreferences = f0.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = f0.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = f0.l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            kotlin.jvm.internal.l.d(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f19602b = sharedPreferences3;
            Set<String> set = f19603c;
            if (sharedPreferences3 == null) {
                kotlin.jvm.internal.l.p("sharedPreferences");
                throw null;
            }
            Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            set.addAll(stringSet);
            for (String str : set) {
                b02 = q.b0(str, new String[]{";"}, false, 2, 2, null);
                f19604d.put(b02.get(0), Long.valueOf(Long.parseLong((String) b02.get(1))));
            }
            b();
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final Map<String, JSONObject> a(Map<String, JSONObject> purchaseDetailsMap) {
        Map m10;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(purchaseDetailsMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            m10 = g0.m(purchaseDetailsMap);
            for (Map.Entry entry : m10.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f19604d.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            Set<String> set = f19603c;
                            StringBuilder sb = new StringBuilder();
                            sb.append((Object) string);
                            sb.append(';');
                            sb.append(currentTimeMillis);
                            set.add(sb.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f19602b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", f19603c).apply();
                return new HashMap(purchaseDetailsMap);
            }
            kotlin.jvm.internal.l.p("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public final void b() {
        Map m10;
        SharedPreferences.Editor putLong;
        if (k1.a.d(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f19602b;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.l.p("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                SharedPreferences sharedPreferences2 = f19602b;
                if (sharedPreferences2 == null) {
                    kotlin.jvm.internal.l.p("sharedPreferences");
                    throw null;
                }
                putLong = sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis);
            } else if (currentTimeMillis - j10 <= 604800) {
                return;
            } else {
                m10 = g0.m(f19604d);
                for (Map.Entry entry : m10.entrySet()) {
                    String str = (String) entry.getKey();
                    long longValue = ((Number) entry.getValue()).longValue();
                    if (currentTimeMillis - longValue > 86400) {
                        Set<String> set = f19603c;
                        set.remove(str + ';' + longValue);
                        f19604d.remove(str);
                    }
                }
                SharedPreferences sharedPreferences3 = f19602b;
                if (sharedPreferences3 == null) {
                    kotlin.jvm.internal.l.p("sharedPreferences");
                    throw null;
                }
                putLong = sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", f19603c).putLong("LAST_CLEARED_TIME", currentTimeMillis);
            }
            putLong.apply();
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final Map<String, String> c(Map<String, ? extends JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.l.e(skuDetailsMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : purchaseDetailsMap.entrySet()) {
                JSONObject value = entry.getValue();
                JSONObject jSONObject = skuDetailsMap.get(entry.getKey());
                if (value != null && value.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                            String jSONObject2 = value.toString();
                            kotlin.jvm.internal.l.d(jSONObject2, "purchaseDetail.toString()");
                            String jSONObject3 = jSONObject.toString();
                            kotlin.jvm.internal.l.d(jSONObject3, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject2, jSONObject3);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }
}
