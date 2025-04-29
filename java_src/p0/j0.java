package p0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import f1.c0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.j0;
import p0.n0;
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: n  reason: collision with root package name */
    public static final c f14918n = new c(null);

    /* renamed from: o  reason: collision with root package name */
    public static final String f14919o = j0.class.getSimpleName();

    /* renamed from: p  reason: collision with root package name */
    private static final String f14920p;

    /* renamed from: q  reason: collision with root package name */
    private static String f14921q;

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f14922r;

    /* renamed from: s  reason: collision with root package name */
    private static volatile String f14923s;

    /* renamed from: a  reason: collision with root package name */
    private p0.a f14924a;

    /* renamed from: b  reason: collision with root package name */
    private String f14925b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f14926c;

    /* renamed from: d  reason: collision with root package name */
    private String f14927d;

    /* renamed from: e  reason: collision with root package name */
    private String f14928e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14929f;

    /* renamed from: g  reason: collision with root package name */
    private Bundle f14930g;

    /* renamed from: h  reason: collision with root package name */
    private Object f14931h;

    /* renamed from: i  reason: collision with root package name */
    private String f14932i;

    /* renamed from: j  reason: collision with root package name */
    private b f14933j;

    /* renamed from: k  reason: collision with root package name */
    private p0 f14934k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f14935l;

    /* renamed from: m  reason: collision with root package name */
    private String f14936m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final j0 f14937a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f14938b;

        public a(j0 request, Object obj) {
            kotlin.jvm.internal.l.e(request, "request");
            this.f14937a = request;
            this.f14938b = obj;
        }

        public final j0 a() {
            return this.f14937a;
        }

        public final Object b() {
            return this.f14938b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void b(o0 o0Var);
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                kotlin.jvm.internal.l.d(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void D(org.json.JSONObject r10, java.lang.String r11, p0.j0.e r12) {
            /*
                r9 = this;
                boolean r0 = r9.u(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L23
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.lang.String r4 = ":"
                r3 = r11
                int r0 = ka.g.F(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = ka.g.F(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L23
                r3 = -1
                if (r11 == r3) goto L21
                if (r0 >= r11) goto L23
            L21:
                r11 = 1
                goto L24
            L23:
                r11 = 0
            L24:
                java.util.Iterator r0 = r10.keys()
            L28:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L53
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L44
                java.lang.String r5 = "image"
                boolean r5 = ka.g.l(r3, r5, r1)
                if (r5 == 0) goto L44
                r5 = 1
                goto L45
            L44:
                r5 = 0
            L45:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.l.d(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.l.d(r4, r6)
                r9.E(r3, r4, r12, r5)
                goto L28
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.j0.c.D(org.json.JSONObject, java.lang.String, p0.j0$e):void");
        }

        private final void E(String str, Object obj, e eVar, boolean z10) {
            String obj2;
            String jSONObject;
            String str2;
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (z10) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject2.opt(next);
                        kotlin.jvm.internal.l.d(opt, "jsonObject.opt(propertyName)");
                        E(format, opt, eVar, z10);
                    }
                    return;
                }
                if (jSONObject2.has("id")) {
                    jSONObject = jSONObject2.optString("id");
                    str2 = "jsonObject.optString(\"id\")";
                } else if (jSONObject2.has("url")) {
                    jSONObject = jSONObject2.optString("url");
                    str2 = "jsonObject.optString(\"url\")";
                } else if (!jSONObject2.has("fbsdk:create_object")) {
                    return;
                } else {
                    jSONObject = jSONObject2.toString();
                    str2 = "jsonObject.toString()";
                }
                kotlin.jvm.internal.l.d(jSONObject, str2);
                E(str, jSONObject, eVar, z10);
            } else if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    obj2 = obj.toString();
                } else if (!Date.class.isAssignableFrom(cls)) {
                    f1.l0 l0Var = f1.l0.f8470a;
                    String str3 = j0.f14919o;
                    f1.l0.e0(str3, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                    return;
                } else {
                    obj2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    kotlin.jvm.internal.l.d(obj2, "iso8601DateFormat.format(date)");
                }
                eVar.a(str, obj2);
            } else {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length <= 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    kotlin.jvm.internal.v vVar2 = kotlin.jvm.internal.v.f12860a;
                    String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                    kotlin.jvm.internal.l.d(format2, "java.lang.String.format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i10);
                    kotlin.jvm.internal.l.d(opt2, "jsonArray.opt(i)");
                    E(format2, opt2, eVar, z10);
                    if (i11 >= length) {
                        return;
                    }
                    i10 = i11;
                }
            }
        }

        private final void F(n0 n0Var, f1.c0 c0Var, int i10, URL url, OutputStream outputStream, boolean z10) {
            h hVar = new h(outputStream, c0Var, z10);
            if (i10 != 1) {
                String p10 = p(n0Var);
                if (p10.length() == 0) {
                    throw new s("App ID was not specified at the request or Settings.");
                }
                hVar.a("batch_app_id", p10);
                Map<String, a> hashMap = new HashMap<>();
                K(hVar, n0Var, hashMap);
                if (c0Var != null) {
                    c0Var.b("  Attachments:\n");
                }
                I(hashMap, hVar);
                return;
            }
            j0 j0Var = n0Var.get(0);
            Map<String, a> hashMap2 = new HashMap<>();
            for (String key : j0Var.u().keySet()) {
                Object obj = j0Var.u().get(key);
                if (v(obj)) {
                    kotlin.jvm.internal.l.d(key, "key");
                    hashMap2.put(key, new a(j0Var, obj));
                }
            }
            if (c0Var != null) {
                c0Var.b("  Parameters:\n");
            }
            J(j0Var.u(), hVar, j0Var);
            if (c0Var != null) {
                c0Var.b("  Attachments:\n");
            }
            I(hashMap2, hVar);
            JSONObject q10 = j0Var.q();
            if (q10 != null) {
                String path = url.getPath();
                kotlin.jvm.internal.l.d(path, "url.path");
                D(q10, path, hVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void H(ArrayList callbacks, n0 requests) {
            kotlin.jvm.internal.l.e(callbacks, "$callbacks");
            kotlin.jvm.internal.l.e(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.second;
                kotlin.jvm.internal.l.d(obj, "pair.second");
                ((b) pair.first).b((o0) obj);
            }
            for (n0.a aVar : requests.v()) {
                aVar.b(requests);
            }
        }

        private final void I(Map<String, a> map, h hVar) {
            for (Map.Entry<String, a> entry : map.entrySet()) {
                if (j0.f14918n.v(entry.getValue().b())) {
                    hVar.j(entry.getKey(), entry.getValue().b(), entry.getValue().a());
                }
            }
        }

        private final void J(Bundle bundle, h hVar, j0 j0Var) {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (w(obj)) {
                    kotlin.jvm.internal.l.d(key, "key");
                    hVar.j(key, obj, j0Var);
                }
            }
        }

        private final void K(h hVar, Collection<j0> collection, Map<String, a> map) {
            JSONArray jSONArray = new JSONArray();
            for (j0 j0Var : collection) {
                j0Var.C(jSONArray, map);
            }
            hVar.l("batch", jSONArray, collection);
        }

        private final void M(HttpURLConnection httpURLConnection, boolean z10) {
            if (!z10) {
                httpURLConnection.setRequestProperty("Content-Type", q());
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        }

        private final HttpURLConnection g(URL url) {
            URLConnection openConnection = url.openConnection();
            Objects.requireNonNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", r());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String p(n0 n0Var) {
            String t10 = n0Var.t();
            if (t10 == null || !(!n0Var.isEmpty())) {
                Iterator<j0> it = n0Var.iterator();
                while (it.hasNext()) {
                    p0.a m10 = it.next().m();
                    if (m10 != null) {
                        return m10.c();
                    }
                }
                String str = j0.f14921q;
                if (str != null) {
                    if (str.length() > 0) {
                        return str;
                    }
                }
                f0 f0Var = f0.f14852a;
                return f0.m();
            }
            return t10;
        }

        private final String q() {
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{j0.f14920p}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
            return format;
        }

        private final String r() {
            if (j0.f14923s == null) {
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "16.0.1"}, 2));
                kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
                j0.f14923s = format;
                f1.z zVar = f1.z.f8603a;
                String a10 = f1.z.a();
                f1.l0 l0Var = f1.l0.f8470a;
                if (!f1.l0.X(a10)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{j0.f14923s, a10}, 2));
                    kotlin.jvm.internal.l.d(format2, "java.lang.String.format(locale, format, *args)");
                    j0.f14923s = format2;
                }
            }
            return j0.f14923s;
        }

        private final boolean s(n0 n0Var) {
            for (n0.a aVar : n0Var.v()) {
                if (aVar instanceof n0.c) {
                    return true;
                }
            }
            Iterator<j0> it = n0Var.iterator();
            while (it.hasNext()) {
                if (it.next().o() instanceof f) {
                    return true;
                }
            }
            return false;
        }

        private final boolean t(n0 n0Var) {
            Iterator<j0> it = n0Var.iterator();
            while (it.hasNext()) {
                j0 next = it.next();
                for (String str : next.u().keySet()) {
                    if (v(next.u().get(str))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean u(String str) {
            boolean t10;
            boolean t11;
            Matcher matcher = j0.f14922r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                kotlin.jvm.internal.l.d(str, "matcher.group(1)");
            }
            t10 = ka.p.t(str, "me/", false, 2, null);
            if (t10) {
                return true;
            }
            t11 = ka.p.t(str, "/me/", false, 2, null);
            return t11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean v(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean w(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(d dVar, o0 response) {
            kotlin.jvm.internal.l.e(response, "response");
            if (dVar == null) {
                return;
            }
            dVar.a(response.c(), response);
        }

        public final j0 A(p0.a aVar, String str, JSONObject jSONObject, b bVar) {
            j0 j0Var = new j0(aVar, str, null, p0.POST, bVar, null, 32, null);
            j0Var.F(jSONObject);
            return j0Var;
        }

        public final j0 B(p0.a aVar, String str, Bundle bundle, b bVar) {
            return new j0(aVar, str, bundle, p0.POST, bVar, null, 32, null);
        }

        public final void G(final n0 requests, List<o0> responses) {
            kotlin.jvm.internal.l.e(requests, "requests");
            kotlin.jvm.internal.l.e(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    j0 j0Var = requests.get(i10);
                    if (j0Var.o() != null) {
                        arrayList.add(new Pair(j0Var.o(), responses.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    }
                    i10 = i11;
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: p0.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j0.c.H(arrayList, requests);
                    }
                };
                Handler u10 = requests.u();
                if ((u10 == null ? null : Boolean.valueOf(u10.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void L(p0.n0 r14, java.net.HttpURLConnection r15) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.j0.c.L(p0.n0, java.net.HttpURLConnection):void");
        }

        public final HttpURLConnection N(n0 requests) {
            URL url;
            kotlin.jvm.internal.l.e(requests, "requests");
            O(requests);
            try {
                if (requests.size() == 1) {
                    url = new URL(requests.get(0).x());
                } else {
                    f1.h0 h0Var = f1.h0.f8445a;
                    url = new URL(f1.h0.h());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = g(url);
                    L(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e10) {
                    f1.l0 l0Var = f1.l0.f8470a;
                    f1.l0.q(httpURLConnection);
                    throw new s("could not construct request body", e10);
                } catch (JSONException e11) {
                    f1.l0 l0Var2 = f1.l0.f8470a;
                    f1.l0.q(httpURLConnection);
                    throw new s("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new s("could not construct URL for request", e12);
            }
        }

        public final void O(n0 requests) {
            kotlin.jvm.internal.l.e(requests, "requests");
            Iterator<j0> it = requests.iterator();
            while (it.hasNext()) {
                j0 next = it.next();
                if (p0.GET == next.t()) {
                    f1.l0 l0Var = f1.l0.f8470a;
                    if (f1.l0.X(next.u().getString("fields"))) {
                        c0.a aVar = f1.c0.f8388e;
                        r0 r0Var = r0.DEVELOPER_ERRORS;
                        StringBuilder sb = new StringBuilder();
                        sb.append("GET requests for /");
                        String r10 = next.r();
                        if (r10 == null) {
                            r10 = "";
                        }
                        sb.append(r10);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        aVar.a(r0Var, 5, "Request", sb.toString());
                    }
                }
            }
        }

        public final o0 h(j0 request) {
            kotlin.jvm.internal.l.e(request, "request");
            List<o0> k10 = k(request);
            if (k10.size() == 1) {
                return k10.get(0);
            }
            throw new s("invalid state: expected a single response");
        }

        public final List<o0> i(Collection<j0> requests) {
            kotlin.jvm.internal.l.e(requests, "requests");
            return j(new n0(requests));
        }

        public final List<o0> j(n0 requests) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<o0> list;
            kotlin.jvm.internal.l.e(requests, "requests");
            f1.m0 m0Var = f1.m0.f8479a;
            f1.m0.i(requests, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = N(requests);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                f1.l0 l0Var = f1.l0.f8470a;
                f1.l0.q(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = o(httpURLConnection, requests);
                } else {
                    List<o0> a10 = o0.f14986i.a(requests.x(), null, new s(exc));
                    G(requests, a10);
                    list = a10;
                }
                f1.l0 l0Var2 = f1.l0.f8470a;
                f1.l0.q(httpURLConnection);
                return list;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                f1.l0 l0Var3 = f1.l0.f8470a;
                f1.l0.q(httpURLConnection2);
                throw th;
            }
        }

        public final List<o0> k(j0... requests) {
            List U;
            kotlin.jvm.internal.l.e(requests, "requests");
            U = t9.k.U(requests);
            return i(U);
        }

        public final m0 l(Collection<j0> requests) {
            kotlin.jvm.internal.l.e(requests, "requests");
            return m(new n0(requests));
        }

        public final m0 m(n0 requests) {
            kotlin.jvm.internal.l.e(requests, "requests");
            f1.m0 m0Var = f1.m0.f8479a;
            f1.m0.i(requests, "requests");
            m0 m0Var2 = new m0(requests);
            f0 f0Var = f0.f14852a;
            m0Var2.executeOnExecutor(f0.t(), new Void[0]);
            return m0Var2;
        }

        public final m0 n(j0... requests) {
            List U;
            kotlin.jvm.internal.l.e(requests, "requests");
            U = t9.k.U(requests);
            return l(U);
        }

        public final List<o0> o(HttpURLConnection connection, n0 requests) {
            kotlin.jvm.internal.l.e(connection, "connection");
            kotlin.jvm.internal.l.e(requests, "requests");
            List<o0> f10 = o0.f14986i.f(connection, requests);
            f1.l0 l0Var = f1.l0.f8470a;
            f1.l0.q(connection);
            int size = requests.size();
            if (size == f10.size()) {
                G(requests, f10);
                p0.g.f14876f.e().h();
                return f10;
            }
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(f10.size()), Integer.valueOf(size)}, 2));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
            throw new s(format);
        }

        public final j0 x(p0.a aVar, String str, b bVar) {
            return new j0(aVar, str, null, null, bVar, null, 32, null);
        }

        public final j0 y(p0.a aVar, final d dVar) {
            return new j0(aVar, "me", null, null, new b() { // from class: p0.l0
                @Override // p0.j0.b
                public final void b(o0 o0Var) {
                    j0.c.z(j0.d.this, o0Var);
                }
            }, null, 32, null);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(JSONObject jSONObject, o0 o0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface e {
        void a(String str, String str2);
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        void a(long j10, long j11);
    }

    /* loaded from: classes.dex */
    public static final class g<RESOURCE extends Parcelable> implements Parcelable {

        /* renamed from: j  reason: collision with root package name */
        private final String f14940j;

        /* renamed from: k  reason: collision with root package name */
        private final RESOURCE f14941k;

        /* renamed from: l  reason: collision with root package name */
        public static final b f14939l = new b(null);
        public static final Parcelable.Creator<g<?>> CREATOR = new a();

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<g<?>> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g<?> createFromParcel(Parcel source) {
                kotlin.jvm.internal.l.e(source, "source");
                return new g<>(source, (kotlin.jvm.internal.g) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public g<?>[] newArray(int i10) {
                return new g[i10];
            }
        }

        /* loaded from: classes.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        private g(Parcel parcel) {
            this.f14940j = parcel.readString();
            f0 f0Var = f0.f14852a;
            this.f14941k = (RESOURCE) parcel.readParcelable(f0.l().getClassLoader());
        }

        public /* synthetic */ g(Parcel parcel, kotlin.jvm.internal.g gVar) {
            this(parcel);
        }

        public g(RESOURCE resource, String str) {
            this.f14940j = str;
            this.f14941k = resource;
        }

        public final String a() {
            return this.f14940j;
        }

        public final RESOURCE b() {
            return this.f14941k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i10) {
            kotlin.jvm.internal.l.e(out, "out");
            out.writeString(this.f14940j);
            out.writeParcelable(this.f14941k, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h implements e {

        /* renamed from: a  reason: collision with root package name */
        private final OutputStream f14942a;

        /* renamed from: b  reason: collision with root package name */
        private final f1.c0 f14943b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f14944c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f14945d;

        public h(OutputStream outputStream, f1.c0 c0Var, boolean z10) {
            kotlin.jvm.internal.l.e(outputStream, "outputStream");
            this.f14942a = outputStream;
            this.f14943b = c0Var;
            this.f14944c = true;
            this.f14945d = z10;
        }

        private final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // p0.j0.e
        public void a(String key, String value) {
            kotlin.jvm.internal.l.e(key, "key");
            kotlin.jvm.internal.l.e(value, "value");
            f(key, null, null);
            i("%s", value);
            k();
            f1.c0 c0Var = this.f14943b;
            if (c0Var == null) {
                return;
            }
            c0Var.d(kotlin.jvm.internal.l.k("    ", key), value);
        }

        public final void c(String format, Object... args) {
            kotlin.jvm.internal.l.e(format, "format");
            kotlin.jvm.internal.l.e(args, "args");
            if (this.f14945d) {
                OutputStream outputStream = this.f14942a;
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.l.d(format2, "java.lang.String.format(locale, format, *args)");
                String encode = URLEncoder.encode(format2, "UTF-8");
                kotlin.jvm.internal.l.d(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = encode.getBytes(ka.d.f12805b);
                kotlin.jvm.internal.l.d(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f14944c) {
                OutputStream outputStream2 = this.f14942a;
                Charset charset = ka.d.f12805b;
                byte[] bytes2 = "--".getBytes(charset);
                kotlin.jvm.internal.l.d(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f14942a;
                String str = j0.f14920p;
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes3 = str.getBytes(charset);
                kotlin.jvm.internal.l.d(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f14942a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                kotlin.jvm.internal.l.d(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f14944c = false;
            }
            OutputStream outputStream5 = this.f14942a;
            kotlin.jvm.internal.v vVar2 = kotlin.jvm.internal.v.f12860a;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format3 = String.format(format, Arrays.copyOf(copyOf2, copyOf2.length));
            kotlin.jvm.internal.l.d(format3, "java.lang.String.format(format, *args)");
            Charset charset2 = ka.d.f12805b;
            Objects.requireNonNull(format3, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes5 = format3.getBytes(charset2);
            kotlin.jvm.internal.l.d(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String key, Bitmap bitmap) {
            kotlin.jvm.internal.l.e(key, "key");
            kotlin.jvm.internal.l.e(bitmap, "bitmap");
            f(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f14942a);
            i("", new Object[0]);
            k();
            f1.c0 c0Var = this.f14943b;
            if (c0Var == null) {
                return;
            }
            c0Var.d(kotlin.jvm.internal.l.k("    ", key), "<Image>");
        }

        public final void e(String key, byte[] bytes) {
            kotlin.jvm.internal.l.e(key, "key");
            kotlin.jvm.internal.l.e(bytes, "bytes");
            f(key, key, "content/unknown");
            this.f14942a.write(bytes);
            i("", new Object[0]);
            k();
            f1.c0 c0Var = this.f14943b;
            if (c0Var == null) {
                return;
            }
            String k10 = kotlin.jvm.internal.l.k("    ", key);
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
            c0Var.d(k10, format);
        }

        public final void f(String str, String str2, String str3) {
            if (!this.f14945d) {
                c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    c("; filename=\"%s\"", str2);
                }
                i("", new Object[0]);
                if (str3 != null) {
                    i("%s: %s", "Content-Type", str3);
                }
                i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f14942a;
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
            Charset charset = ka.d.f12805b;
            Objects.requireNonNull(format, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = format.getBytes(charset);
            kotlin.jvm.internal.l.d(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void g(String key, Uri contentUri, String str) {
            int p10;
            kotlin.jvm.internal.l.e(key, "key");
            kotlin.jvm.internal.l.e(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            if (this.f14942a instanceof w0) {
                f1.l0 l0Var = f1.l0.f8470a;
                ((w0) this.f14942a).b(f1.l0.x(contentUri));
                p10 = 0;
            } else {
                f0 f0Var = f0.f14852a;
                InputStream openInputStream = f0.l().getContentResolver().openInputStream(contentUri);
                f1.l0 l0Var2 = f1.l0.f8470a;
                p10 = f1.l0.p(openInputStream, this.f14942a) + 0;
            }
            i("", new Object[0]);
            k();
            f1.c0 c0Var = this.f14943b;
            if (c0Var == null) {
                return;
            }
            String k10 = kotlin.jvm.internal.l.k("    ", key);
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(p10)}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
            c0Var.d(k10, format);
        }

        public final void h(String key, ParcelFileDescriptor descriptor, String str) {
            int p10;
            kotlin.jvm.internal.l.e(key, "key");
            kotlin.jvm.internal.l.e(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            OutputStream outputStream = this.f14942a;
            if (outputStream instanceof w0) {
                ((w0) outputStream).b(descriptor.getStatSize());
                p10 = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                f1.l0 l0Var = f1.l0.f8470a;
                p10 = f1.l0.p(autoCloseInputStream, this.f14942a) + 0;
            }
            i("", new Object[0]);
            k();
            f1.c0 c0Var = this.f14943b;
            if (c0Var == null) {
                return;
            }
            String k10 = kotlin.jvm.internal.l.k("    ", key);
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(p10)}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
            c0Var.d(k10, format);
        }

        public final void i(String format, Object... args) {
            kotlin.jvm.internal.l.e(format, "format");
            kotlin.jvm.internal.l.e(args, "args");
            c(format, Arrays.copyOf(args, args.length));
            if (this.f14945d) {
                return;
            }
            c("\r\n", new Object[0]);
        }

        public final void j(String key, Object obj, j0 j0Var) {
            kotlin.jvm.internal.l.e(key, "key");
            OutputStream outputStream = this.f14942a;
            if (outputStream instanceof z0) {
                ((z0) outputStream).a(j0Var);
            }
            c cVar = j0.f14918n;
            if (cVar.w(obj)) {
                a(key, cVar.C(obj));
            } else if (obj instanceof Bitmap) {
                d(key, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                e(key, (byte[]) obj);
            } else if (obj instanceof Uri) {
                g(key, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) obj, null);
            } else if (!(obj instanceof g)) {
                throw b();
            } else {
                g gVar = (g) obj;
                Parcelable b10 = gVar.b();
                String a10 = gVar.a();
                if (b10 instanceof ParcelFileDescriptor) {
                    h(key, (ParcelFileDescriptor) b10, a10);
                } else if (!(b10 instanceof Uri)) {
                    throw b();
                } else {
                    g(key, (Uri) b10, a10);
                }
            }
        }

        public final void k() {
            if (!this.f14945d) {
                i("--%s", j0.f14920p);
                return;
            }
            OutputStream outputStream = this.f14942a;
            byte[] bytes = "&".getBytes(ka.d.f12805b);
            kotlin.jvm.internal.l.d(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String key, JSONArray requestJsonArray, Collection<j0> requests) {
            kotlin.jvm.internal.l.e(key, "key");
            kotlin.jvm.internal.l.e(requestJsonArray, "requestJsonArray");
            kotlin.jvm.internal.l.e(requests, "requests");
            OutputStream outputStream = this.f14942a;
            if (!(outputStream instanceof z0)) {
                String jSONArray = requestJsonArray.toString();
                kotlin.jvm.internal.l.d(jSONArray, "requestJsonArray.toString()");
                a(key, jSONArray);
                return;
            }
            z0 z0Var = (z0) outputStream;
            f(key, null, null);
            c("[", new Object[0]);
            int i10 = 0;
            for (j0 j0Var : requests) {
                int i11 = i10 + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i10);
                z0Var.a(j0Var);
                if (i10 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            c("]", new Object[0]);
            f1.c0 c0Var = this.f14943b;
            if (c0Var == null) {
                return;
            }
            String k10 = kotlin.jvm.internal.l.k("    ", key);
            String jSONArray2 = requestJsonArray.toString();
            kotlin.jvm.internal.l.d(jSONArray2, "requestJsonArray.toString()");
            c0Var.d(k10, jSONArray2);
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f14946a;

        i(ArrayList<String> arrayList) {
            this.f14946a = arrayList;
        }

        @Override // p0.j0.e
        public void a(String key, String value) {
            kotlin.jvm.internal.l.e(key, "key");
            kotlin.jvm.internal.l.e(value, "value");
            ArrayList<String> arrayList = this.f14946a;
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        kotlin.jvm.internal.l.d(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt <= 0) {
            String sb2 = sb.toString();
            kotlin.jvm.internal.l.d(sb2, "buffer.toString()");
            f14920p = sb2;
            f14922r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
        }
        int i10 = 0;
        do {
            i10++;
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        } while (i10 < nextInt);
        String sb22 = sb.toString();
        kotlin.jvm.internal.l.d(sb22, "buffer.toString()");
        f14920p = sb22;
        f14922r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public j0() {
        this(null, null, null, null, null, null, 63, null);
    }

    public j0(p0.a aVar, String str, Bundle bundle, p0 p0Var, b bVar, String str2) {
        this.f14929f = true;
        this.f14924a = aVar;
        this.f14925b = str;
        this.f14932i = str2;
        D(bVar);
        G(p0Var);
        this.f14930g = bundle != null ? new Bundle(bundle) : new Bundle();
        if (this.f14932i == null) {
            f0 f0Var = f0.f14852a;
            this.f14932i = f0.w();
        }
    }

    public /* synthetic */ j0(p0.a aVar, String str, Bundle bundle, p0 p0Var, b bVar, String str2, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? null : p0Var, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : str2);
    }

    private final boolean A() {
        f0 f0Var = f0.f14852a;
        if (kotlin.jvm.internal.l.a(f0.x(), "instagram.com")) {
            return !z();
        }
        return true;
    }

    public static final j0 B(p0.a aVar, d dVar) {
        return f14918n.y(aVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(JSONArray jSONArray, Map<String, a> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f14927d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f14929f);
        }
        String str2 = this.f14928e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String v10 = v();
        jSONObject.put("relative_url", v10);
        jSONObject.put("method", this.f14934k);
        p0.a aVar = this.f14924a;
        if (aVar != null) {
            f1.c0.f8388e.d(aVar.s());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f14930g.keySet()) {
            Object obj = this.f14930g.get(str3);
            if (f14918n.v(obj)) {
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f14926c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f14918n.D(jSONObject2, v10, new i(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private final boolean J() {
        boolean z10;
        boolean t10;
        String n10 = n();
        boolean w10 = n10 == null ? false : ka.q.w(n10, "|", false, 2, null);
        if (n10 != null) {
            t10 = ka.p.t(n10, "IG", false, 2, null);
            if (t10 && !w10) {
                z10 = true;
                if (z10 || !z()) {
                    return A() && !w10;
                }
                return true;
            }
        }
        z10 = false;
        if (z10) {
        }
        if (A()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(b bVar, o0 response) {
        kotlin.jvm.internal.l.e(response, "response");
        JSONObject c10 = response.c();
        JSONObject optJSONObject = c10 == null ? null : c10.optJSONObject("__debug__");
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray("messages");
        if (optJSONArray != null) {
            int i10 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                    String optString = optJSONObject2 == null ? null : optJSONObject2.optString("message");
                    String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString("type");
                    String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString("link");
                    if (optString != null && optString2 != null) {
                        r0 r0Var = r0.GRAPH_API_DEBUG_INFO;
                        if (kotlin.jvm.internal.l.a(optString2, "warning")) {
                            r0Var = r0.GRAPH_API_DEBUG_WARNING;
                        }
                        f1.l0 l0Var = f1.l0.f8470a;
                        if (!f1.l0.X(optString3)) {
                            optString = ((Object) optString) + " Link: " + ((Object) optString3);
                        }
                        c0.a aVar = f1.c0.f8388e;
                        String TAG = f14919o;
                        kotlin.jvm.internal.l.d(TAG, "TAG");
                        aVar.b(r0Var, TAG, optString);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        }
        if (bVar == null) {
            return;
        }
        bVar.b(response);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 != null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i() {
        /*
            r3 = this;
            android.os.Bundle r0 = r3.f14930g
            boolean r1 = r3.J()
            java.lang.String r2 = "access_token"
            if (r1 == 0) goto L12
            java.lang.String r1 = r3.p()
        Le:
            r0.putString(r2, r1)
            goto L19
        L12:
            java.lang.String r1 = r3.n()
            if (r1 == 0) goto L19
            goto Le
        L19:
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto L34
            f1.l0 r1 = f1.l0.f8470a
            p0.f0 r1 = p0.f0.f14852a
            java.lang.String r1 = p0.f0.r()
            boolean r1 = f1.l0.X(r1)
            if (r1 == 0) goto L34
            java.lang.String r1 = p0.j0.f14919o
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
        L34:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            p0.f0 r1 = p0.f0.f14852a
            p0.r0 r1 = p0.r0.GRAPH_API_DEBUG_INFO
            boolean r1 = p0.f0.H(r1)
            java.lang.String r2 = "debug"
            if (r1 == 0) goto L54
            java.lang.String r1 = "info"
        L50:
            r0.putString(r2, r1)
            goto L5f
        L54:
            p0.r0 r1 = p0.r0.GRAPH_API_DEBUG_WARNING
            boolean r1 = p0.f0.H(r1)
            if (r1 == 0) goto L5f
            java.lang.String r1 = "warning"
            goto L50
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j0.i():void");
    }

    private final String j(String str, boolean z10) {
        if (z10 || this.f14934k != p0.POST) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (String str2 : this.f14930g.keySet()) {
                Object obj = this.f14930g.get(str2);
                if (obj == null) {
                    obj = "";
                }
                c cVar = f14918n;
                if (cVar.w(obj)) {
                    buildUpon.appendQueryParameter(str2, cVar.C(obj).toString());
                } else if (this.f14934k != p0.GET) {
                    kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                    String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                    kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
                    throw new IllegalArgumentException(format);
                }
            }
            String builder = buildUpon.toString();
            kotlin.jvm.internal.l.d(builder, "uriBuilder.toString()");
            return builder;
        }
        return str;
    }

    private final String n() {
        p0.a aVar = this.f14924a;
        if (aVar != null) {
            if (!this.f14930g.containsKey("access_token")) {
                String s10 = aVar.s();
                f1.c0.f8388e.d(s10);
                return s10;
            }
        } else if (!this.f14930g.containsKey("access_token")) {
            return p();
        }
        return this.f14930g.getString("access_token");
    }

    private final String p() {
        f0 f0Var = f0.f14852a;
        String m10 = f0.m();
        String r10 = f0.r();
        if (m10.length() > 0) {
            if (r10.length() > 0) {
                return m10 + '|' + r10;
            }
        }
        f1.l0 l0Var = f1.l0.f8470a;
        f1.l0.e0(f14919o, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    private final String s() {
        if (f14922r.matcher(this.f14925b).matches()) {
            return this.f14925b;
        }
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f14932i, this.f14925b}, 2));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String y(String str) {
        if (!A()) {
            f1.h0 h0Var = f1.h0.f8445a;
            str = f1.h0.f();
        }
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, s()}, 2));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean z() {
        if (this.f14925b == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        f0 f0Var = f0.f14852a;
        sb.append(f0.m());
        sb.append("/?.*");
        return this.f14935l || Pattern.matches(sb.toString(), this.f14925b) || Pattern.matches("^/?app/?.*", this.f14925b);
    }

    public final void D(final b bVar) {
        f0 f0Var = f0.f14852a;
        if (f0.H(r0.GRAPH_API_DEBUG_INFO) || f0.H(r0.GRAPH_API_DEBUG_WARNING)) {
            this.f14933j = new b() { // from class: p0.i0
                @Override // p0.j0.b
                public final void b(o0 o0Var) {
                    j0.b(j0.b.this, o0Var);
                }
            };
        } else {
            this.f14933j = bVar;
        }
    }

    public final void E(boolean z10) {
        this.f14935l = z10;
    }

    public final void F(JSONObject jSONObject) {
        this.f14926c = jSONObject;
    }

    public final void G(p0 p0Var) {
        if (this.f14936m != null && p0Var != p0.GET) {
            throw new s("Can't change HTTP method on request with overridden URL.");
        }
        if (p0Var == null) {
            p0Var = p0.GET;
        }
        this.f14934k = p0Var;
    }

    public final void H(Bundle bundle) {
        kotlin.jvm.internal.l.e(bundle, "<set-?>");
        this.f14930g = bundle;
    }

    public final void I(Object obj) {
        this.f14931h = obj;
    }

    public final o0 k() {
        return f14918n.h(this);
    }

    public final m0 l() {
        return f14918n.n(this);
    }

    public final p0.a m() {
        return this.f14924a;
    }

    public final b o() {
        return this.f14933j;
    }

    public final JSONObject q() {
        return this.f14926c;
    }

    public final String r() {
        return this.f14925b;
    }

    public final p0 t() {
        return this.f14934k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f14924a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f14925b);
        sb.append(", graphObject: ");
        sb.append(this.f14926c);
        sb.append(", httpMethod: ");
        sb.append(this.f14934k);
        sb.append(", parameters: ");
        sb.append(this.f14930g);
        sb.append("}");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.d(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    public final Bundle u() {
        return this.f14930g;
    }

    public final String v() {
        if (this.f14936m == null) {
            f1.h0 h0Var = f1.h0.f8445a;
            String y10 = y(f1.h0.h());
            i();
            Uri parse = Uri.parse(j(y10, true));
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
            return format;
        }
        throw new s("Can't override URL for a batch request");
    }

    public final Object w() {
        return this.f14931h;
    }

    public final String x() {
        String i10;
        boolean k10;
        String str = this.f14936m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f14925b;
        if (this.f14934k == p0.POST && str2 != null) {
            k10 = ka.p.k(str2, "/videos", false, 2, null);
            if (k10) {
                f1.h0 h0Var = f1.h0.f8445a;
                i10 = f1.h0.j();
                String y10 = y(i10);
                i();
                return j(y10, false);
            }
        }
        f1.h0 h0Var2 = f1.h0.f8445a;
        f0 f0Var = f0.f14852a;
        i10 = f1.h0.i(f0.x());
        String y102 = y(i10);
        i();
        return j(y102, false);
    }
}
