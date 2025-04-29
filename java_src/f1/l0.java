package f1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import f1.l0;
import f1.n;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p0.j0;
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b  reason: collision with root package name */
    private static int f8471b;

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f8470a = new l0();

    /* renamed from: c  reason: collision with root package name */
    private static long f8472c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static long f8473d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static long f8474e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static String f8475f = "";

    /* renamed from: g  reason: collision with root package name */
    private static String f8476g = "";

    /* renamed from: h  reason: collision with root package name */
    private static String f8477h = "NoCarrier";

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void b(p0.s sVar);
    }

    private l0() {
    }

    public static final JSONObject A() {
        if (k1.a.d(l0.class)) {
            return null;
        }
        try {
            p0.f0 f0Var = p0.f0.f14852a;
            String string = p0.f0.l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, l0.class);
            return null;
        }
    }

    public static final String A0(String str) {
        if (str == null) {
            return null;
        }
        return f8470a.M("SHA-256", str);
    }

    public static final String B(String str) {
        boolean z10;
        int i10;
        Object obj;
        String str2;
        String str3;
        String r10;
        p0.f0 f0Var = p0.f0.f14852a;
        String u10 = p0.f0.u();
        if (str == null) {
            return u10;
        }
        if (kotlin.jvm.internal.l.a(str, "gaming")) {
            z10 = false;
            i10 = 4;
            obj = null;
            str2 = "facebook.com";
            str3 = "fb.gg";
        } else if (!kotlin.jvm.internal.l.a(str, "instagram")) {
            return u10;
        } else {
            z10 = false;
            i10 = 4;
            obj = null;
            str2 = "facebook.com";
            str3 = "instagram.com";
        }
        r10 = ka.p.r(u10, str2, str3, z10, i10, obj);
        return r10;
    }

    public static final void B0(Parcel parcel, Map<String, String> map) {
        kotlin.jvm.internal.l.e(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    private final p0.j0 C(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", I(z()));
        bundle.putString("access_token", str);
        p0.j0 y10 = p0.j0.f14918n.y(null, null);
        y10.H(bundle);
        y10.G(p0.p0.GET);
        return y10;
    }

    public static final void C0(Parcel parcel, Map<String, String> map) {
        kotlin.jvm.internal.l.e(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static final void D(final String accessToken, final a callback) {
        kotlin.jvm.internal.l.e(accessToken, "accessToken");
        kotlin.jvm.internal.l.e(callback, "callback");
        g0 g0Var = g0.f8442a;
        JSONObject a10 = g0.a(accessToken);
        if (a10 != null) {
            callback.a(a10);
            return;
        }
        j0.b bVar = new j0.b() { // from class: f1.k0
            @Override // p0.j0.b
            public final void b(p0.o0 o0Var) {
                l0.E(l0.a.this, accessToken, o0Var);
            }
        };
        p0.j0 C = f8470a.C(accessToken);
        C.D(bVar);
        C.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(a callback, String accessToken, p0.o0 response) {
        kotlin.jvm.internal.l.e(callback, "$callback");
        kotlin.jvm.internal.l.e(accessToken, "$accessToken");
        kotlin.jvm.internal.l.e(response, "response");
        if (response.b() != null) {
            callback.b(response.b().e());
            return;
        }
        g0 g0Var = g0.f8442a;
        JSONObject d10 = response.d();
        if (d10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        g0.b(accessToken, d10);
        callback.a(response.d());
    }

    public static final String F(Context context) {
        m0 m0Var = m0.f8479a;
        m0.j(context, "context");
        p0.f0 f0Var = p0.f0.f14852a;
        return p0.f0.m();
    }

    public static final Method G(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        kotlin.jvm.internal.l.e(clazz, "clazz");
        kotlin.jvm.internal.l.e(methodName, "methodName");
        kotlin.jvm.internal.l.e(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method H(String className, String methodName, Class<?>... parameterTypes) {
        kotlin.jvm.internal.l.e(className, "className");
        kotlin.jvm.internal.l.e(methodName, "methodName");
        kotlin.jvm.internal.l.e(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            kotlin.jvm.internal.l.d(clazz, "clazz");
            return G(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final String I(String str) {
        return kotlin.jvm.internal.l.a(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public static final Locale J() {
        try {
            p0.f0 f0Var = p0.f0.f14852a;
            return p0.f0.l().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object K(JSONObject jsonObject, String str, String str2) {
        kotlin.jvm.internal.l.e(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(str2, opt);
            return jSONObject;
        }
        throw new p0.s("Got an unexpected non-JSON object.");
    }

    private final String L(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        kotlin.jvm.internal.l.d(digest, "digest");
        int length = digest.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = digest[i10];
            i10++;
            sb.append(Integer.toHexString((b10 >> 4) & 15));
            sb.append(Integer.toHexString((b10 >> 0) & 15));
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.d(sb2, "builder.toString()");
        return sb2;
    }

    private final String M(String str, String str2) {
        Charset charset = ka.d.f12805b;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str2.getBytes(charset);
        kotlin.jvm.internal.l.d(bytes, "(this as java.lang.String).getBytes(charset)");
        return N(str, bytes);
    }

    private final String N(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            kotlin.jvm.internal.l.d(hash, "hash");
            return L(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object O(Object obj, Method method, Object... args) {
        kotlin.jvm.internal.l.e(method, "method");
        kotlin.jvm.internal.l.e(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean P() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            p0.f0 f0Var = p0.f0.f14852a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{p0.f0.m()}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context l10 = p0.f0.l();
            PackageManager packageManager = l10.getPackageManager();
            String packageName = l10.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            kotlin.jvm.internal.l.d(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (kotlin.jvm.internal.l.a(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean Q(Context context) {
        AutofillManager autofillManager;
        kotlin.jvm.internal.l.e(context, "context");
        return Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    public static final boolean R(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE != null) {
            kotlin.jvm.internal.l.d(DEVICE, "DEVICE");
            if (new ka.f(".+_cheets|cheets_.+").a(DEVICE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean S(Uri uri) {
        boolean l10;
        if (uri != null) {
            l10 = ka.p.l("content", uri.getScheme(), true);
            if (l10) {
                return true;
            }
        }
        return false;
    }

    public static final boolean T(p0.a aVar) {
        return aVar != null && kotlin.jvm.internal.l.a(aVar, p0.a.f14786u.e());
    }

    public static final boolean U() {
        if (k1.a.d(l0.class)) {
            return false;
        }
        try {
            JSONObject A = A();
            if (A == null) {
                return false;
            }
            try {
                JSONArray jSONArray = A.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        kotlin.jvm.internal.l.d(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        kotlin.jvm.internal.l.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (kotlin.jvm.internal.l.a(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, l0.class);
            return false;
        }
    }

    public static final boolean V(Uri uri) {
        boolean l10;
        if (uri != null) {
            l10 = ka.p.l("file", uri.getScheme(), true);
            if (l10) {
                return true;
            }
        }
        return false;
    }

    private final boolean W(Context context) {
        Method H = H("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (H == null) {
            return false;
        }
        Object O = O(null, H, context);
        return (O instanceof Integer) && kotlin.jvm.internal.l.a(O, 0);
    }

    public static final boolean X(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean Y(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean Z(Uri uri) {
        boolean l10;
        boolean l11;
        boolean l12;
        if (uri != null) {
            l10 = ka.p.l("http", uri.getScheme(), true);
            if (l10) {
                return true;
            }
            l11 = ka.p.l("https", uri.getScheme(), true);
            if (l11) {
                return true;
            }
            l12 = ka.p.l("fbstaging", uri.getScheme(), true);
            if (l12) {
                return true;
            }
        }
        return false;
    }

    public static final Set<String> a0(JSONArray jsonArray) {
        kotlin.jvm.internal.l.e(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String string = jsonArray.getString(i10);
                kotlin.jvm.internal.l.d(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashSet;
    }

    public static final List<String> b0(JSONArray jsonArray) {
        kotlin.jvm.internal.l.e(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jsonArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    private final void c(JSONObject jSONObject, f1.a aVar, String str, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && W(context) && aVar.k()) {
            return;
        }
        jSONObject.put("anon_id", str);
    }

    public static final Map<String, String> c0(String str) {
        kotlin.jvm.internal.l.e(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                kotlin.jvm.internal.l.d(key, "key");
                String string = jSONObject.getString(key);
                kotlin.jvm.internal.l.d(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    private final void d(JSONObject jSONObject, f1.a aVar, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && W(context) && aVar.k()) {
            return;
        }
        jSONObject.put("attribution", aVar.j());
    }

    public static final void d0(String str, Exception exc) {
        p0.f0 f0Var = p0.f0.f14852a;
        if (!p0.f0.D() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
    }

    public static final <T> boolean e(T t10, T t11) {
        return t10 == null ? t11 == null : kotlin.jvm.internal.l.a(t10, t11);
    }

    public static final void e0(String str, String str2) {
        p0.f0 f0Var = p0.f0.f14852a;
        if (!p0.f0.D() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static final JSONObject f(String accessToken) {
        kotlin.jvm.internal.l.e(accessToken, "accessToken");
        g0 g0Var = g0.f8442a;
        JSONObject a10 = g0.a(accessToken);
        if (a10 != null) {
            return a10;
        }
        p0.o0 k10 = f8470a.C(accessToken).k();
        if (k10.b() != null) {
            return null;
        }
        return k10.d();
    }

    public static final void f0(String str, String str2, Throwable th) {
        p0.f0 f0Var = p0.f0.f14852a;
        if (!p0.f0.D() || X(str)) {
            return;
        }
        Log.d(str, str2, th);
    }

    public static final Uri g(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        kotlin.jvm.internal.l.d(build, "builder.build()");
        return build;
    }

    public static final String g0(Map<String, String> map) {
        kotlin.jvm.internal.l.e(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            kotlin.jvm.internal.l.d(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    private final void h(Context context, String str) {
        List b02;
        List b03;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        b02 = ka.q.b0(cookie, new String[]{";"}, false, 0, 6, null);
        Object[] array = b02.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            i10++;
            b03 = ka.q.b0(str2, new String[]{"="}, false, 0, 6, null);
            Object[] array2 = b03.toArray(new String[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length2) {
                    boolean z11 = kotlin.jvm.internal.l.f(str3.charAt(!z10 ? i11 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length2--;
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                cookieManager.setCookie(str, kotlin.jvm.internal.l.k(str3.subSequence(i11, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static final String h0(String key) {
        kotlin.jvm.internal.l.e(key, "key");
        return f8470a.M("MD5", key);
    }

    public static final void i(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        try {
            l0 l0Var = f8470a;
            l0Var.h(context, "facebook.com");
            l0Var.h(context, ".facebook.com");
            l0Var.h(context, "https://facebook.com");
            l0Var.h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final boolean i0(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        return Q(context);
    }

    public static final void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Bundle j0(String str) {
        List b02;
        List b03;
        Bundle bundle = new Bundle();
        if (!X(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            b02 = ka.q.b0(str, new String[]{"&"}, false, 0, 6, null);
            Object[] array = b02.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                b03 = ka.q.b0(str2, new String[]{"="}, false, 0, 6, null);
                Object[] array2 = b03.toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e10) {
                    d0("FacebookSDK", e10);
                }
            }
        }
        return bundle;
    }

    public static final String k(String str, String str2) {
        return X(str) ? str2 : str;
    }

    public static final boolean k0(Bundle bundle, String str, Object obj) {
        String jSONObject;
        kotlin.jvm.internal.l.e(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else {
            if (obj instanceof String) {
                jSONObject = (String) obj;
            } else if (obj instanceof JSONArray) {
                jSONObject = ((JSONArray) obj).toString();
            } else if (!(obj instanceof JSONObject)) {
                return false;
            } else {
                jSONObject = ((JSONObject) obj).toString();
            }
            bundle.putString(str, jSONObject);
            return true;
        }
    }

    private final long l(double d10) {
        return Math.round(d10 / 1.073741824E9d);
    }

    public static final void l0(Bundle b10, String str, String str2) {
        kotlin.jvm.internal.l.e(b10, "b");
        if (X(str2)) {
            return;
        }
        b10.putString(str, str2);
    }

    public static final List<String> m(JSONArray jsonArray) {
        kotlin.jvm.internal.l.e(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            int length = jsonArray.length();
            if (length <= 0) {
                return arrayList;
            }
            while (true) {
                int i11 = i10 + 1;
                String string = jsonArray.getString(i10);
                kotlin.jvm.internal.l.d(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i11 >= length) {
                    return arrayList;
                }
                i10 = i11;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final Map<String, String> m0(Parcel parcel) {
        kotlin.jvm.internal.l.e(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i10 = 0;
        if (readInt > 0) {
            do {
                i10++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                    continue;
                }
            } while (i10 < readInt);
            return hashMap;
        }
        return hashMap;
    }

    public static final Map<String, Object> n(JSONObject jsonObject) {
        kotlin.jvm.internal.l.e(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names == null) {
            return hashMap;
        }
        int i10 = 0;
        int length = names.length();
        if (length > 0) {
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = names.getString(i10);
                    kotlin.jvm.internal.l.d(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = n((JSONObject) value);
                    }
                    kotlin.jvm.internal.l.d(value, "value");
                    hashMap.put(string, value);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    public static final String n0(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read == -1) {
                            String sb2 = sb.toString();
                            kotlin.jvm.internal.l.d(sb2, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            j(bufferedInputStream);
                            j(inputStreamReader);
                            return sb2;
                        }
                        sb.append(cArr, 0, read);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j(bufferedInputStream);
                    j(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    public static final Map<String, String> o(JSONObject jsonObject) {
        kotlin.jvm.internal.l.e(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                kotlin.jvm.internal.l.d(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final Map<String, String> o0(Parcel parcel) {
        kotlin.jvm.internal.l.e(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i10 = 0;
        if (readInt > 0) {
            do {
                i10++;
                hashMap.put(parcel.readString(), parcel.readString());
            } while (i10 < readInt);
            return hashMap;
        }
        return hashMap;
    }

    public static final int p(InputStream inputStream, OutputStream outputStream) {
        kotlin.jvm.internal.l.e(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i10 = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i10 += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i10;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void p0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f8474e = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f8474e = l(f8474e);
        } catch (Exception unused) {
        }
    }

    public static final void q(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    private final int q0() {
        int i10 = f8471b;
        if (i10 > 0) {
            return i10;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: f1.j0
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean r02;
                    r02 = l0.r0(file, str);
                    return r02;
                }
            });
            if (listFiles != null) {
                f8471b = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f8471b <= 0) {
            f8471b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f8471b;
    }

    private final boolean r() {
        return kotlin.jvm.internal.l.a("mounted", Environment.getExternalStorageState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    public static final String s(int i10) {
        String bigInteger = new BigInteger(i10 * 5, new Random()).toString(32);
        kotlin.jvm.internal.l.d(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    private final void s0(Context context) {
        if (kotlin.jvm.internal.l.a(f8477h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                kotlin.jvm.internal.l.d(networkOperatorName, "telephonyManager.networkOperatorName");
                f8477h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    public static final String t(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        kotlin.jvm.internal.l.d(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    private final void t0(Context context) {
        if (f8472c == -1 || System.currentTimeMillis() - f8472c >= 1800000) {
            f8472c = System.currentTimeMillis();
            u0();
            s0(context);
            v0();
            p0();
        }
    }

    public static final String u(Context context) {
        String string;
        kotlin.jvm.internal.l.e(context, "context");
        try {
            p0.f0 f0Var = p0.f0.f14852a;
            String n10 = p0.f0.n();
            if (n10 != null) {
                return n10;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                kotlin.jvm.internal.l.d(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    private final void u0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            kotlin.jvm.internal.l.d(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f8475f = displayName;
            String id = timeZone.getID();
            kotlin.jvm.internal.l.d(id, "tz.id");
            f8476g = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    public static final String v() {
        p0.f0 f0Var = p0.f0.f14852a;
        Context l10 = p0.f0.l();
        if (l10 == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = l10.getPackageManager().getPackageInfo(l10.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void v0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f8473d = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f8473d = l(f8473d);
        } catch (Exception unused) {
        }
    }

    public static final Date w(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        kotlin.jvm.internal.l.e(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        parseLong = ((Number) obj).longValue();
        return parseLong == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (parseLong * 1000));
    }

    public static final void w0(Runnable runnable) {
        try {
            p0.f0 f0Var = p0.f0.f14852a;
            p0.f0.t().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final long x(Uri contentUri) {
        kotlin.jvm.internal.l.e(contentUri, "contentUri");
        Cursor cursor = null;
        try {
            p0.f0 f0Var = p0.f0.f14852a;
            cursor = p0.f0.l().getContentResolver().query(contentUri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j10 = cursor.getLong(columnIndex);
            cursor.close();
            return j10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static final void x0(JSONObject params, f1.a aVar, String str, boolean z10, Context context) {
        kotlin.jvm.internal.l.e(params, "params");
        kotlin.jvm.internal.l.e(context, "context");
        n nVar = n.f8481a;
        n.b bVar = n.b.ServiceUpdateCompliance;
        if (!n.g(bVar)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z10);
        p0.f0 f0Var = p0.f0.f14852a;
        params.put("advertiser_id_collection_enabled", p0.f0.k());
        if (aVar != null) {
            if (n.g(bVar)) {
                f8470a.c(params, aVar, str, context);
            }
            if (aVar.j() != null) {
                if (n.g(bVar)) {
                    f8470a.d(params, aVar, context);
                } else {
                    params.put("attribution", aVar.j());
                }
            }
            if (aVar.h() != null) {
                params.put("advertiser_id", aVar.h());
                params.put("advertiser_tracking_enabled", !aVar.k());
            }
            if (!aVar.k()) {
                q0.g0 g0Var = q0.g0.f15939a;
                String b10 = q0.g0.b();
                if (!(b10.length() == 0)) {
                    params.put("ud", b10);
                }
            }
            if (aVar.i() != null) {
                params.put("installer_package", aVar.i());
            }
        }
    }

    public static final Locale y() {
        Locale J = J();
        if (J == null) {
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.l.d(locale, "getDefault()");
            return locale;
        }
        return J;
    }

    public static final void y0(JSONObject params, Context appContext) {
        String str;
        Locale locale;
        int i10;
        Display display;
        PackageInfo packageInfo;
        kotlin.jvm.internal.l.e(params, "params");
        kotlin.jvm.internal.l.e(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        l0 l0Var = f8470a;
        jSONArray.put("a2");
        l0Var.t0(appContext);
        String packageName = appContext.getPackageName();
        int i11 = 0;
        int i12 = -1;
        try {
            packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        if (packageInfo == null) {
            return;
        }
        i12 = packageInfo.versionCode;
        str = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i12);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
        jSONArray.put(f8475f);
        jSONArray.put(f8477h);
        double d10 = 0.0d;
        try {
            Object systemService = appContext.getSystemService("display");
            display = null;
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
        } catch (Exception unused3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i13 = displayMetrics.widthPixels;
            try {
                int i14 = displayMetrics.heightPixels;
                try {
                    d10 = displayMetrics.density;
                } catch (Exception unused4) {
                }
                i10 = i14;
                i11 = i13;
            } catch (Exception unused5) {
                i11 = i13;
            }
            jSONArray.put(i11);
            jSONArray.put(i10);
            jSONArray.put(new DecimalFormat("#.##").format(d10));
            jSONArray.put(f8470a.q0());
            jSONArray.put(f8473d);
            jSONArray.put(f8474e);
            jSONArray.put(f8476g);
            params.put("extinfo", jSONArray.toString());
        }
        i10 = 0;
        jSONArray.put(i11);
        jSONArray.put(i10);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        jSONArray.put(f8470a.q0());
        jSONArray.put(f8473d);
        jSONArray.put(f8474e);
        jSONArray.put(f8476g);
        params.put("extinfo", jSONArray.toString());
    }

    private final String z() {
        p0.a e10 = p0.a.f14786u.e();
        return (e10 == null || e10.l() == null) ? "facebook" : e10.l();
    }

    public static final String z0(byte[] bytes) {
        kotlin.jvm.internal.l.e(bytes, "bytes");
        return f8470a.N("SHA-1", bytes);
    }
}
