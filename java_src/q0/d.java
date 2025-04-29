package q0;

import android.os.Bundle;
import f1.c0;
import f1.l0;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import p0.r0;
/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final a f15907o = new a(null);

    /* renamed from: p  reason: collision with root package name */
    private static final HashSet<String> f15908p = new HashSet<>();

    /* renamed from: j  reason: collision with root package name */
    private final JSONObject f15909j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f15910k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f15911l;

    /* renamed from: m  reason: collision with root package name */
    private final String f15912m;

    /* renamed from: n  reason: collision with root package name */
    private final String f15913n;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                kotlin.jvm.internal.l.d(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    kotlin.jvm.internal.l.d(bytes, "(this as java.lang.String).getBytes(charset)");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] digest = messageDigest.digest();
                    kotlin.jvm.internal.l.d(digest, "digest.digest()");
                    y0.g gVar = y0.g.f20314a;
                    return y0.g.c(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (UnsupportedEncodingException e10) {
                l0 l0Var = l0.f8470a;
                l0.d0("Failed to generate checksum: ", e10);
                return "1";
            } catch (NoSuchAlgorithmException e11) {
                l0 l0Var2 = l0.f8470a;
                l0.d0("Failed to generate checksum: ", e11);
                return "0";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            boolean contains;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (d.f15908p) {
                        contains = d.f15908p.contains(str);
                        s9.u uVar = s9.u.f17878a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new ka.f("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").a(str)) {
                        synchronized (d.f15908p) {
                            d.f15908p.add(str);
                        }
                        return;
                    }
                    kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                    String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                    kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
                    throw new p0.s(format);
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            kotlin.jvm.internal.v vVar2 = kotlin.jvm.internal.v.f12860a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            kotlin.jvm.internal.l.d(format2, "java.lang.String.format(locale, format, *args)");
            throw new p0.s(format2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: n  reason: collision with root package name */
        public static final a f15914n = new a(null);

        /* renamed from: j  reason: collision with root package name */
        private final String f15915j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f15916k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f15917l;

        /* renamed from: m  reason: collision with root package name */
        private final String f15918m;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(String jsonString, boolean z10, boolean z11, String str) {
            kotlin.jvm.internal.l.e(jsonString, "jsonString");
            this.f15915j = jsonString;
            this.f15916k = z10;
            this.f15917l = z11;
            this.f15918m = str;
        }

        private final Object readResolve() {
            return new d(this.f15915j, this.f15916k, this.f15917l, this.f15918m, null);
        }
    }

    public d(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid) {
        kotlin.jvm.internal.l.e(contextName, "contextName");
        kotlin.jvm.internal.l.e(eventName, "eventName");
        this.f15910k = z10;
        this.f15911l = z11;
        this.f15912m = eventName;
        this.f15909j = d(contextName, eventName, d10, bundle, uuid);
        this.f15913n = b();
    }

    private d(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f15909j = jSONObject;
        this.f15910k = z10;
        String optString = jSONObject.optString("_eventName");
        kotlin.jvm.internal.l.d(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f15912m = optString;
        this.f15913n = str2;
        this.f15911l = z11;
    }

    public /* synthetic */ d(String str, boolean z10, boolean z11, String str2, kotlin.jvm.internal.g gVar) {
        this(str, z10, z11, str2);
    }

    private final String b() {
        a aVar = f15907o;
        String jSONObject = this.f15909j.toString();
        kotlin.jvm.internal.l.d(jSONObject, "jsonObject.toString()");
        return aVar.c(jSONObject);
    }

    private final JSONObject d(String str, String str2, Double d10, Bundle bundle, UUID uuid) {
        a aVar = f15907o;
        aVar.d(str2);
        JSONObject jSONObject = new JSONObject();
        b1.a aVar2 = b1.a.f2851a;
        String e10 = b1.a.e(str2);
        jSONObject.put("_eventName", e10);
        jSONObject.put("_eventName_md5", aVar.c(e10));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> i10 = i(bundle);
            for (String str3 : i10.keySet()) {
                jSONObject.put(str3, i10.get(str3));
            }
        }
        if (d10 != null) {
            jSONObject.put("_valueToSum", d10.doubleValue());
        }
        if (this.f15911l) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f15910k) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            c0.a aVar3 = f1.c0.f8388e;
            r0 r0Var = r0.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.l.d(jSONObject2, "eventObject.toString()");
            aVar3.c(r0Var, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    private final Map<String, String> i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String key : bundle.keySet()) {
            a aVar = f15907o;
            kotlin.jvm.internal.l.d(key, "key");
            aVar.d(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
                throw new p0.s(format);
            }
            hashMap.put(key, obj.toString());
        }
        x0.a aVar2 = x0.a.f20076a;
        x0.a.c(hashMap);
        b1.a aVar3 = b1.a.f2851a;
        b1.a.f(hashMap, this.f15912m);
        v0.a aVar4 = v0.a.f19332a;
        v0.a.c(hashMap, this.f15912m);
        return hashMap;
    }

    private final Object writeReplace() {
        String jSONObject = this.f15909j.toString();
        kotlin.jvm.internal.l.d(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.f15910k, this.f15911l, this.f15913n);
    }

    public final boolean c() {
        return this.f15910k;
    }

    public final JSONObject e() {
        return this.f15909j;
    }

    public final String f() {
        return this.f15912m;
    }

    public final boolean g() {
        if (this.f15913n == null) {
            return true;
        }
        return kotlin.jvm.internal.l.a(b(), this.f15913n);
    }

    public final boolean h() {
        return this.f15910k;
    }

    public String toString() {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f15909j.optString("_eventName"), Boolean.valueOf(this.f15910k), this.f15909j.toString()}, 3));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
