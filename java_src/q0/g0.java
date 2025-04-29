package q0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import f1.l0;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: c  reason: collision with root package name */
    private static SharedPreferences f15941c;

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f15939a = new g0();

    /* renamed from: b  reason: collision with root package name */
    private static final String f15940b = g0.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f15942d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f15943e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f15944f = new ConcurrentHashMap<>();

    private g0() {
    }

    public static final String b() {
        if (k1.a.d(g0.class)) {
            return null;
        }
        try {
            if (!f15942d.get()) {
                f15939a.d();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f15943e);
            hashMap.putAll(f15939a.c());
            l0 l0Var = l0.f8470a;
            return l0.g0(hashMap);
        } catch (Throwable th) {
            k1.a.b(th, g0.class);
            return null;
        }
    }

    private final Map<String, String> c() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> b10 = r0.d.f16622d.b();
            for (String str : f15944f.keySet()) {
                if (b10.contains(str)) {
                    hashMap.put(str, f15944f.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final synchronized void d() {
        if (k1.a.d(this)) {
            return;
        }
        AtomicBoolean atomicBoolean = f15942d;
        if (atomicBoolean.get()) {
            return;
        }
        p0.f0 f0Var = p0.f0.f14852a;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(p0.f0.l());
        kotlin.jvm.internal.l.d(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
        f15941c = defaultSharedPreferences;
        if (defaultSharedPreferences == null) {
            kotlin.jvm.internal.l.p("sharedPreferences");
            throw null;
        }
        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
        if (string == null) {
            string = "";
        }
        SharedPreferences sharedPreferences = f15941c;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.l.p("sharedPreferences");
            throw null;
        }
        String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
        if (string2 == null) {
            string2 = "";
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f15943e;
        l0 l0Var = l0.f8470a;
        concurrentHashMap.putAll(l0.c0(string));
        f15944f.putAll(l0.c0(string2));
        atomicBoolean.set(true);
    }

    public static final void e() {
        if (k1.a.d(g0.class)) {
            return;
        }
        try {
            if (f15942d.get()) {
                return;
            }
            f15939a.d();
        } catch (Throwable th) {
            k1.a.b(th, g0.class);
        }
    }

    private final String f(String str, String str2) {
        String str3;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.l.f(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            String obj = str2.subSequence(i10, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                kotlin.jvm.internal.l.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (kotlin.jvm.internal.l.a("em", str)) {
                    if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        return lowerCase;
                    }
                    Log.e(f15940b, "Setting email failure: this is not a valid email address");
                    return "";
                } else if (kotlin.jvm.internal.l.a("ph", str)) {
                    return new ka.f("[^0-9]").b(lowerCase, "");
                } else {
                    if (kotlin.jvm.internal.l.a("ge", str)) {
                        if (!(lowerCase.length() > 0)) {
                            str3 = "";
                        } else if (lowerCase == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        } else {
                            str3 = lowerCase.substring(0, 1);
                            kotlin.jvm.internal.l.d(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        }
                        if (!kotlin.jvm.internal.l.a("f", str3) && !kotlin.jvm.internal.l.a("m", str3)) {
                            Log.e(f15940b, "Setting gender failure: the supported value for gender is f or m");
                            return "";
                        }
                        return str3;
                    }
                    return lowerCase;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        r4 = new java.lang.String[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.g0.g(java.util.Map):void");
    }

    private final void h(final String str, final String str2) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            p0.f0 f0Var = p0.f0.f14852a;
            p0.f0.t().execute(new Runnable() { // from class: q0.f0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.i(str, str2);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String key, String value) {
        if (k1.a.d(g0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(key, "$key");
            kotlin.jvm.internal.l.e(value, "$value");
            if (!f15942d.get()) {
                f15939a.d();
            }
            SharedPreferences sharedPreferences = f15941c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(key, value).apply();
            } else {
                kotlin.jvm.internal.l.p("sharedPreferences");
                throw null;
            }
        } catch (Throwable th) {
            k1.a.b(th, g0.class);
        }
    }
}
