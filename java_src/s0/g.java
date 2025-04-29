package s0;

import da.p;
import f1.c0;
import f1.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ka.q;
import kotlin.jvm.internal.w;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.j0;
import p0.r0;
import s0.g;
import s9.t;
import s9.u;
import t9.f0;
import t9.g0;
import t9.m0;
import t9.x;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f16907a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final HashSet<Integer> f16908b;

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet<Integer> f16909c;

    /* renamed from: d  reason: collision with root package name */
    public static a f16910d;

    /* renamed from: e  reason: collision with root package name */
    public static List<Map<String, Object>> f16911e;

    /* renamed from: f  reason: collision with root package name */
    private static int f16912f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f16913a;

        /* renamed from: b  reason: collision with root package name */
        private final String f16914b;

        /* renamed from: c  reason: collision with root package name */
        private final String f16915c;

        public a(String datasetID, String cloudBridgeURL, String accessKey) {
            kotlin.jvm.internal.l.e(datasetID, "datasetID");
            kotlin.jvm.internal.l.e(cloudBridgeURL, "cloudBridgeURL");
            kotlin.jvm.internal.l.e(accessKey, "accessKey");
            this.f16913a = datasetID;
            this.f16914b = cloudBridgeURL;
            this.f16915c = accessKey;
        }

        public final String a() {
            return this.f16915c;
        }

        public final String b() {
            return this.f16914b;
        }

        public final String c() {
            return this.f16913a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.l.a(this.f16913a, aVar.f16913a) && kotlin.jvm.internal.l.a(this.f16914b, aVar.f16914b) && kotlin.jvm.internal.l.a(this.f16915c, aVar.f16915c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f16913a.hashCode() * 31) + this.f16914b.hashCode()) * 31) + this.f16915c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f16913a + ", cloudBridgeURL=" + this.f16914b + ", accessKey=" + this.f16915c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.m implements p<String, Integer, u> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List<Map<String, Object>> f16916j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends Map<String, ? extends Object>> list) {
            super(2);
            this.f16916j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Integer num, List processedEvents) {
            boolean m10;
            kotlin.jvm.internal.l.e(processedEvents, "$processedEvents");
            m10 = x.m(g.f16908b, num);
            if (m10) {
                return;
            }
            g.f16907a.g(num, processedEvents, 5);
        }

        public final void b(String str, final Integer num) {
            l0 l0Var = l0.f8470a;
            final List<Map<String, Object>> list = this.f16916j;
            l0.w0(new Runnable() { // from class: s0.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.c(num, list);
                }
            });
        }

        @Override // da.p
        public /* bridge */ /* synthetic */ u invoke(String str, Integer num) {
            b(str, num);
            return u.f17878a;
        }
    }

    static {
        HashSet<Integer> c10;
        HashSet<Integer> c11;
        c10 = m0.c(200, 202);
        f16908b = c10;
        c11 = m0.c(503, 504, 429);
        f16909c = c11;
    }

    private g() {
    }

    public static final void d(String datasetID, String url, String accessKey) {
        kotlin.jvm.internal.l.e(datasetID, "datasetID");
        kotlin.jvm.internal.l.e(url, "url");
        kotlin.jvm.internal.l.e(accessKey, "accessKey");
        c0.a aVar = c0.f8388e;
        r0 r0Var = r0.APP_EVENTS;
        g gVar = f16907a;
        aVar.c(r0Var, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        gVar.i(new a(datasetID, url, accessKey));
        gVar.j(new ArrayList());
    }

    private final List<Map<String, Object>> k(j0 j0Var) {
        Map<String, ? extends Object> o10;
        JSONObject q10 = j0Var.q();
        if (q10 != null) {
            l0 l0Var = l0.f8470a;
            o10 = g0.o(l0.n(q10));
            Object w10 = j0Var.w();
            Objects.requireNonNull(w10, "null cannot be cast to non-null type kotlin.Any");
            o10.put("custom_events", w10);
            StringBuilder sb = new StringBuilder();
            for (String str : o10.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(o10.get(str));
                sb.append(System.getProperty("line.separator"));
            }
            c0.f8388e.c(r0.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
            return e.f16884a.e(o10);
        }
        return null;
    }

    public static final void l(final j0 request) {
        kotlin.jvm.internal.l.e(request, "request");
        l0 l0Var = l0.f8470a;
        l0.w0(new Runnable() { // from class: s0.f
            @Override // java.lang.Runnable
            public final void run() {
                g.m(j0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(j0 request) {
        List J;
        Map<String, String> b10;
        kotlin.jvm.internal.l.e(request, "$request");
        String r10 = request.r();
        List b02 = r10 == null ? null : q.b0(r10, new String[]{"/"}, false, 0, 6, null);
        if (b02 == null || b02.size() != 2) {
            c0.f8388e.c(r0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            g gVar = f16907a;
            String str = gVar.e().b() + "/capi/" + gVar.e().c() + "/events";
            List<Map<String, Object>> k10 = gVar.k(request);
            if (k10 == null) {
                return;
            }
            gVar.c(k10);
            int min = Math.min(gVar.f().size(), 10);
            J = x.J(gVar.f(), new ha.f(0, min - 1));
            gVar.f().subList(0, min).clear();
            JSONArray jSONArray = new JSONArray((Collection) J);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", gVar.e().a());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            c0.a aVar = c0.f8388e;
            r0 r0Var = r0.APP_EVENTS;
            String jSONObject2 = jSONObject.toString(2);
            kotlin.jvm.internal.l.d(jSONObject2, "jsonBodyStr.toString(2)");
            aVar.c(r0Var, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, jSONObject2);
            String jSONObject3 = jSONObject.toString();
            b10 = f0.b(s9.q.a("Content-Type", "application/json"));
            gVar.h(str, "POST", jSONObject3, b10, 60000, new b(J));
        } catch (t e10) {
            c0.f8388e.c(r0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e10);
        }
    }

    public final void c(List<? extends Map<String, ? extends Object>> list) {
        List n10;
        if (list != null) {
            f().addAll(list);
        }
        int max = Math.max(0, f().size() - 1000);
        if (max > 0) {
            n10 = x.n(f(), max);
            j(w.a(n10));
        }
    }

    public final a e() {
        a aVar = f16910d;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.l.p("credentials");
        throw null;
    }

    public final List<Map<String, Object>> f() {
        List<Map<String, Object>> list = f16911e;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.l.p("transformedEvents");
        throw null;
    }

    public final void g(Integer num, List<? extends Map<String, ? extends Object>> processedEvents, int i10) {
        boolean m10;
        kotlin.jvm.internal.l.e(processedEvents, "processedEvents");
        m10 = x.m(f16909c, num);
        if (m10) {
            if (f16912f >= i10) {
                f().clear();
                f16912f = 0;
                return;
            }
            f().addAll(0, processedEvents);
            f16912f++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[Catch: IOException -> 0x00f7, UnknownHostException -> 0x010a, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x010a, IOException -> 0x00f7, blocks: (B:3:0x0011, B:5:0x001c, B:15:0x0045, B:17:0x0051, B:22:0x0061, B:24:0x009b, B:29:0x00b5, B:34:0x00bc, B:35:0x00bf, B:36:0x00c0, B:38:0x00e3, B:8:0x0024, B:11:0x002b, B:12:0x002f, B:14:0x0035, B:39:0x00ef, B:40:0x00f6), top: B:52:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3 A[Catch: IOException -> 0x00f7, UnknownHostException -> 0x010a, TryCatch #4 {UnknownHostException -> 0x010a, IOException -> 0x00f7, blocks: (B:3:0x0011, B:5:0x001c, B:15:0x0045, B:17:0x0051, B:22:0x0061, B:24:0x009b, B:29:0x00b5, B:34:0x00bc, B:35:0x00bf, B:36:0x00c0, B:38:0x00e3, B:8:0x0024, B:11:0x002b, B:12:0x002f, B:14:0x0035, B:39:0x00ef, B:40:0x00f6), top: B:52:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, int r12, da.p<? super java.lang.String, ? super java.lang.Integer, s9.u> r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.g.h(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, da.p):void");
    }

    public final void i(a aVar) {
        kotlin.jvm.internal.l.e(aVar, "<set-?>");
        f16910d = aVar;
    }

    public final void j(List<Map<String, Object>> list) {
        kotlin.jvm.internal.l.e(list, "<set-?>");
        f16911e = list;
    }
}
