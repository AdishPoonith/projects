package p0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import p0.a;
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f14986i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private static final String f14987j = o0.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private final j0 f14988a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpURLConnection f14989b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14990c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f14991d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONArray f14992e;

    /* renamed from: f  reason: collision with root package name */
    private final v f14993f;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f14994g;

    /* renamed from: h  reason: collision with root package name */
    private final JSONArray f14995h;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final o0 b(j0 j0Var, HttpURLConnection httpURLConnection, Object NULL, Object obj) {
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                v a10 = v.f15031x.a(jSONObject, obj, httpURLConnection);
                if (a10 != null) {
                    Log.e(o0.f14987j, a10.toString());
                    if (a10.b() == 190) {
                        f1.l0 l0Var = f1.l0.f8470a;
                        if (f1.l0.T(j0Var.m())) {
                            if (a10.j() != 493) {
                                p0.a.f14786u.h(null);
                            } else {
                                a.c cVar = p0.a.f14786u;
                                p0.a e10 = cVar.e();
                                if (kotlin.jvm.internal.l.a(e10 != null ? Boolean.valueOf(e10.z()) : null, Boolean.FALSE)) {
                                    cVar.d();
                                }
                            }
                        }
                    }
                    return new o0(j0Var, httpURLConnection, a10);
                }
                f1.l0 l0Var2 = f1.l0.f8470a;
                Object K = f1.l0.K(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (K instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) K;
                    return new o0(j0Var, httpURLConnection, jSONObject2.toString(), jSONObject2);
                } else if (K instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) K;
                    return new o0(j0Var, httpURLConnection, jSONArray.toString(), jSONArray);
                } else {
                    NULL = JSONObject.NULL;
                    kotlin.jvm.internal.l.d(NULL, "NULL");
                }
            }
            if (NULL == JSONObject.NULL) {
                return new o0(j0Var, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new s(kotlin.jvm.internal.l.k("Got unexpected object type in response, class: ", NULL.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[LOOP:0: B:23:0x0062->B:33:0x009b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[EDGE_INSN: B:41:0x009d->B:34:0x009d ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.util.List<p0.o0> c(java.net.HttpURLConnection r9, java.util.List<p0.j0> r10, java.lang.Object r11) {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
                r3 = 1
                if (r0 != r3) goto L4e
                java.lang.Object r3 = r10.get(r2)
                p0.j0 r3 = (p0.j0) r3
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                r4.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                if (r9 != 0) goto L22
                r5 = 200(0xc8, float:2.8E-43)
                goto L26
            L22:
                int r5 = r9.getResponseCode()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
            L26:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                r5.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                r5.put(r4)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L40
                goto L4f
            L34:
                r4 = move-exception
                p0.o0 r5 = new p0.o0
                p0.v r6 = new p0.v
                r6.<init>(r9, r4)
                r5.<init>(r3, r9, r6)
                goto L4b
            L40:
                r4 = move-exception
                p0.o0 r5 = new p0.o0
                p0.v r6 = new p0.v
                r6.<init>(r9, r4)
                r5.<init>(r3, r9, r6)
            L4b:
                r1.add(r5)
            L4e:
                r5 = r11
            L4f:
                boolean r3 = r5 instanceof org.json.JSONArray
                if (r3 == 0) goto L9e
                r3 = r5
                org.json.JSONArray r3 = (org.json.JSONArray) r3
                int r4 = r3.length()
                if (r4 != r0) goto L9e
                int r0 = r3.length()
                if (r0 <= 0) goto L9d
            L62:
                int r3 = r2 + 1
                java.lang.Object r4 = r10.get(r2)
                p0.j0 r4 = (p0.j0) r4
                r6 = r5
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch: p0.s -> L7e org.json.JSONException -> L8a
                java.lang.Object r2 = r6.get(r2)     // Catch: p0.s -> L7e org.json.JSONException -> L8a
                java.lang.String r6 = "obj"
                kotlin.jvm.internal.l.d(r2, r6)     // Catch: p0.s -> L7e org.json.JSONException -> L8a
                p0.o0 r2 = r8.b(r4, r9, r2, r11)     // Catch: p0.s -> L7e org.json.JSONException -> L8a
                r1.add(r2)     // Catch: p0.s -> L7e org.json.JSONException -> L8a
                goto L98
            L7e:
                r2 = move-exception
                p0.o0 r6 = new p0.o0
                p0.v r7 = new p0.v
                r7.<init>(r9, r2)
                r6.<init>(r4, r9, r7)
                goto L95
            L8a:
                r2 = move-exception
                p0.o0 r6 = new p0.o0
                p0.v r7 = new p0.v
                r7.<init>(r9, r2)
                r6.<init>(r4, r9, r7)
            L95:
                r1.add(r6)
            L98:
                if (r3 < r0) goto L9b
                goto L9d
            L9b:
                r2 = r3
                goto L62
            L9d:
                return r1
            L9e:
                p0.s r9 = new p0.s
                java.lang.String r10 = "Unexpected number of results"
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.o0.a.c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        public final List<o0> a(List<j0> requests, HttpURLConnection httpURLConnection, s sVar) {
            int j10;
            kotlin.jvm.internal.l.e(requests, "requests");
            j10 = t9.q.j(requests, 10);
            ArrayList arrayList = new ArrayList(j10);
            for (j0 j0Var : requests) {
                arrayList.add(new o0(j0Var, httpURLConnection, new v(httpURLConnection, sVar)));
            }
            return arrayList;
        }

        public final List<o0> d(InputStream inputStream, HttpURLConnection httpURLConnection, n0 requests) {
            kotlin.jvm.internal.l.e(requests, "requests");
            f1.l0 l0Var = f1.l0.f8470a;
            String n02 = f1.l0.n0(inputStream);
            f1.c0.f8388e.c(r0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(n02.length()), n02);
            return e(n02, httpURLConnection, requests);
        }

        public final List<o0> e(String responseString, HttpURLConnection httpURLConnection, n0 requests) {
            kotlin.jvm.internal.l.e(responseString, "responseString");
            kotlin.jvm.internal.l.e(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            kotlin.jvm.internal.l.d(resultObject, "resultObject");
            List<o0> c10 = c(httpURLConnection, requests, resultObject);
            f1.c0.f8388e.c(r0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.w(), Integer.valueOf(responseString.length()), c10);
            return c10;
        }

        public final List<o0> f(HttpURLConnection connection, n0 requests) {
            List<o0> a10;
            kotlin.jvm.internal.l.e(connection, "connection");
            kotlin.jvm.internal.l.e(requests, "requests");
            InputStream inputStream = null;
            try {
                try {
                    try {
                        f0 f0Var = f0.f14852a;
                    } catch (s e10) {
                        f1.c0.f8388e.c(r0.REQUESTS, "Response", "Response <Error>: %s", e10);
                        a10 = a(requests, connection, e10);
                    }
                } catch (Exception e11) {
                    f1.c0.f8388e.c(r0.REQUESTS, "Response", "Response <Error>: %s", e11);
                    a10 = a(requests, connection, new s(e11));
                }
                if (!f0.E()) {
                    Log.e(o0.f14987j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new s("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                inputStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                a10 = d(inputStream, connection, requests);
                return a10;
            } finally {
                f1.l0 l0Var = f1.l0.f8470a;
                f1.l0.j(null);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(j0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        kotlin.jvm.internal.l.e(request, "request");
        kotlin.jvm.internal.l.e(rawResponse, "rawResponse");
        kotlin.jvm.internal.l.e(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(j0 request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        kotlin.jvm.internal.l.e(request, "request");
        kotlin.jvm.internal.l.e(rawResponse, "rawResponse");
    }

    public o0(j0 request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, v vVar) {
        kotlin.jvm.internal.l.e(request, "request");
        this.f14988a = request;
        this.f14989b = httpURLConnection;
        this.f14990c = str;
        this.f14991d = jSONObject;
        this.f14992e = jSONArray;
        this.f14993f = vVar;
        this.f14994g = jSONObject;
        this.f14995h = jSONArray;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(j0 request, HttpURLConnection httpURLConnection, v error) {
        this(request, httpURLConnection, null, null, null, error);
        kotlin.jvm.internal.l.e(request, "request");
        kotlin.jvm.internal.l.e(error, "error");
    }

    public final v b() {
        return this.f14993f;
    }

    public final JSONObject c() {
        return this.f14991d;
    }

    public final JSONObject d() {
        return this.f14994g;
    }

    public String toString() {
        String str;
        try {
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f14989b;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.l.d(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f14991d + ", error: " + this.f14993f + "}";
        kotlin.jvm.internal.l.d(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }
}
