package z0;

import android.os.Bundle;
import android.text.TextUtils;
import f1.l0;
import f1.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ka.p;
import ka.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.j0;
import s9.l;
import t9.c0;
import y0.k;
import z0.f;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f20652a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, b> f20653b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f20654c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f20655d;

    /* loaded from: classes.dex */
    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: z0.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0293a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f20659a;

            static {
                int[] iArr = new int[a.valuesCustom().length];
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                f20659a = iArr;
            }
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String g() {
            int i10 = C0293a.f20659a[ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return "app_event_pred";
                }
                throw new l();
            }
            return "integrity_detect";
        }

        public final String h() {
            int i10 = C0293a.f20659a[ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return "MTML_APP_EVENT_PRED";
                }
                throw new l();
            }
            return "MTML_INTEGRITY_DETECT";
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: i  reason: collision with root package name */
        public static final a f20660i = new a(null);

        /* renamed from: a  reason: collision with root package name */
        private String f20661a;

        /* renamed from: b  reason: collision with root package name */
        private String f20662b;

        /* renamed from: c  reason: collision with root package name */
        private String f20663c;

        /* renamed from: d  reason: collision with root package name */
        private int f20664d;

        /* renamed from: e  reason: collision with root package name */
        private float[] f20665e;

        /* renamed from: f  reason: collision with root package name */
        private File f20666f;

        /* renamed from: g  reason: collision with root package name */
        private z0.b f20667g;

        /* renamed from: h  reason: collision with root package name */
        private Runnable f20668h;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            private final void d(String str, int i10) {
                File[] listFiles;
                boolean t10;
                boolean t11;
                j jVar = j.f20674a;
                File a10 = j.a();
                if (a10 == null || (listFiles = a10.listFiles()) == null) {
                    return;
                }
                if (listFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i10;
                int length = listFiles.length;
                int i11 = 0;
                while (i11 < length) {
                    File file = listFiles[i11];
                    i11++;
                    String name = file.getName();
                    kotlin.jvm.internal.l.d(name, "name");
                    t10 = p.t(name, str, false, 2, null);
                    if (t10) {
                        t11 = p.t(name, str2, false, 2, null);
                        if (!t11) {
                            file.delete();
                        }
                    }
                }
            }

            private final void e(String str, String str2, k.a aVar) {
                j jVar = j.f20674a;
                File file = new File(j.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new k(str, file, aVar).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g(List slaves, File file) {
                kotlin.jvm.internal.l.e(slaves, "$slaves");
                kotlin.jvm.internal.l.e(file, "file");
                final z0.b a10 = z0.b.f20635m.a(file);
                if (a10 != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final b bVar = (b) it.next();
                        b.f20660i.e(bVar.e(), bVar.g() + '_' + bVar.h() + "_rule", new k.a() { // from class: z0.h
                            @Override // y0.k.a
                            public final void a(File file2) {
                                f.b.a.h(f.b.this, a10, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void h(b slave, z0.b bVar, File file) {
                kotlin.jvm.internal.l.e(slave, "$slave");
                kotlin.jvm.internal.l.e(file, "file");
                slave.i(bVar);
                slave.k(file);
                Runnable runnable = slave.f20668h;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            public final b c(JSONObject jSONObject) {
                String useCase;
                String assetUri;
                String optString;
                int i10;
                float[] d10;
                if (jSONObject != null) {
                    try {
                        useCase = jSONObject.getString("use_case");
                        assetUri = jSONObject.getString("asset_uri");
                        optString = jSONObject.optString("rules_uri", null);
                        i10 = jSONObject.getInt("version_id");
                        d10 = f.d(f.f20652a, jSONObject.getJSONArray("thresholds"));
                        kotlin.jvm.internal.l.d(useCase, "useCase");
                        kotlin.jvm.internal.l.d(assetUri, "assetUri");
                    } catch (Exception unused) {
                        return null;
                    }
                }
                return new b(useCase, assetUri, optString, i10, d10);
            }

            public final void f(b master, final List<b> slaves) {
                kotlin.jvm.internal.l.e(master, "master");
                kotlin.jvm.internal.l.e(slaves, "slaves");
                d(master.g(), master.h());
                e(master.b(), master.g() + '_' + master.h(), new k.a() { // from class: z0.g
                    @Override // y0.k.a
                    public final void a(File file) {
                        f.b.a.g(slaves, file);
                    }
                });
            }
        }

        public b(String useCase, String assetUri, String str, int i10, float[] fArr) {
            kotlin.jvm.internal.l.e(useCase, "useCase");
            kotlin.jvm.internal.l.e(assetUri, "assetUri");
            this.f20661a = useCase;
            this.f20662b = assetUri;
            this.f20663c = str;
            this.f20664d = i10;
            this.f20665e = fArr;
        }

        public final String b() {
            return this.f20662b;
        }

        public final z0.b c() {
            return this.f20667g;
        }

        public final File d() {
            return this.f20666f;
        }

        public final String e() {
            return this.f20663c;
        }

        public final float[] f() {
            return this.f20665e;
        }

        public final String g() {
            return this.f20661a;
        }

        public final int h() {
            return this.f20664d;
        }

        public final void i(z0.b bVar) {
            this.f20667g = bVar;
        }

        public final b j(Runnable runnable) {
            this.f20668h = runnable;
            return this;
        }

        public final void k(File file) {
            this.f20666f = file;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20669a;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            f20669a = iArr;
        }
    }

    static {
        List<String> g10;
        List<String> g11;
        g10 = t9.p.g("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
        f20654c = g10;
        g11 = t9.p.g("none", "address", "health");
        f20655d = g11;
    }

    private f() {
    }

    public static final /* synthetic */ float[] d(f fVar, JSONArray jSONArray) {
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            return fVar.o(jSONArray);
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    private final void e(JSONObject jSONObject) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    b c10 = b.f20660i.c(jSONObject.getJSONObject(keys.next()));
                    if (c10 != null) {
                        f20653b.put(c10.g(), c10);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public static final void f() {
        if (k1.a.d(f.class)) {
            return;
        }
        try {
            l0 l0Var = l0.f8470a;
            l0.w0(new Runnable() { // from class: z0.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.g();
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: all -> 0x007d, Exception -> 0x0081, TryCatch #2 {Exception -> 0x0081, all -> 0x007d, blocks: (B:5:0x000d, B:7:0x0021, B:12:0x002b, B:14:0x0036, B:16:0x0046, B:18:0x004c, B:24:0x0074, B:20:0x0054, B:23:0x005d, B:13:0x0031), top: B:30:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g() {
        /*
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            java.lang.Class<z0.f> r2 = z0.f.class
            boolean r3 = k1.a.d(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            p0.f0 r3 = p0.f0.f14852a     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            android.content.Context r3 = p0.f0.l()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.lang.String r4 = "com.facebook.internal.MODEL_STORE"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r4 = 0
            java.lang.String r4 = r3.getString(r1, r4)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            if (r4 == 0) goto L31
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            if (r6 != 0) goto L28
            r5 = 1
        L28:
            if (r5 == 0) goto L2b
            goto L31
        L2b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            goto L36
        L31:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r5.<init>()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
        L36:
            r6 = 0
            long r6 = r3.getLong(r0, r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            f1.n r4 = f1.n.f8481a     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            f1.n$b r4 = f1.n.b.ModelRequest     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            boolean r4 = f1.n.g(r4)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            if (r4 == 0) goto L54
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            if (r4 == 0) goto L54
            z0.f r4 = z0.f.f20652a     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            boolean r4 = r4.n(r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            if (r4 != 0) goto L74
        L54:
            z0.f r4 = z0.f.f20652a     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            org.json.JSONObject r5 = r4.k()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            if (r5 != 0) goto L5d
            return
        L5d:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r4)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r3)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r0.apply()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
        L74:
            z0.f r0 = z0.f.f20652a     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r0.e(r5)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            r0.h()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L81
            goto L81
        L7d:
            r0 = move-exception
            k1.a.b(r0, r2)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.f.g():void");
    }

    private final void h() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i10 = 0;
            for (Map.Entry<String, b> entry : f20653b.entrySet()) {
                String key = entry.getKey();
                b value = entry.getValue();
                if (kotlin.jvm.internal.l.a(key, a.MTML_APP_EVENT_PREDICTION.h())) {
                    String b10 = value.b();
                    int max = Math.max(i10, value.h());
                    n nVar = n.f8481a;
                    if (n.g(n.b.SuggestedEvents) && m()) {
                        arrayList.add(value.j(new Runnable() { // from class: z0.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.i();
                            }
                        }));
                    }
                    str = b10;
                    i10 = max;
                }
                if (kotlin.jvm.internal.l.a(key, a.MTML_INTEGRITY_DETECT.h())) {
                    str = value.b();
                    i10 = Math.max(i10, value.h());
                    n nVar2 = n.f8481a;
                    if (n.g(n.b.IntelligentIntegrity)) {
                        arrayList.add(value.j(new Runnable() { // from class: z0.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.j();
                            }
                        }));
                    }
                }
            }
            if (str == null || i10 <= 0 || arrayList.isEmpty()) {
                return;
            }
            b.f20660i.f(new b("MTML", str, null, i10, null), arrayList);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i() {
        if (k1.a.d(f.class)) {
            return;
        }
        try {
            c1.e eVar = c1.e.f3146a;
            c1.e.b();
        } catch (Throwable th) {
            k1.a.b(th, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
        if (k1.a.d(f.class)) {
            return;
        }
        try {
            x0.a aVar = x0.a.f20076a;
            x0.a.a();
        } catch (Throwable th) {
            k1.a.b(th, f.class);
        }
    }

    private final JSONObject k() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            j0 x10 = j0.f14918n.x(null, "app/model_asset", null);
            x10.H(bundle);
            JSONObject c10 = x10.k().c();
            if (c10 == null) {
                return null;
            }
            return p(c10);
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final File l(a task) {
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(task, "task");
            b bVar = f20653b.get(task.h());
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    private final boolean m() {
        boolean w10;
        if (k1.a.d(this)) {
            return false;
        }
        try {
            l0 l0Var = l0.f8470a;
            Locale J = l0.J();
            if (J != null) {
                String language = J.getLanguage();
                kotlin.jvm.internal.l.d(language, "locale.language");
                w10 = q.w(language, "en", false, 2, null);
                if (!w10) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    private final boolean n(long j10) {
        if (k1.a.d(this) || j10 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j10 < 259200000;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    private final float[] o(JSONArray jSONArray) {
        if (k1.a.d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int i10 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        String string = jSONArray.getString(i10);
                        kotlin.jvm.internal.l.d(string, "jsonArray.getString(i)");
                        fArr[i10] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return fArr;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final JSONObject p(JSONObject jSONObject) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int i10 = 0;
                int length = jSONArray.length();
                if (length <= 0) {
                    return jSONObject2;
                }
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                    if (i11 >= length) {
                        return jSONObject2;
                    }
                    i10 = i11;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final String[] q(a task, float[][] denses, String[] texts) {
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(task, "task");
            kotlin.jvm.internal.l.e(denses, "denses");
            kotlin.jvm.internal.l.e(texts, "texts");
            b bVar = f20653b.get(task.h());
            z0.b c10 = bVar == null ? null : bVar.c();
            if (c10 == null) {
                return null;
            }
            float[] f10 = bVar.f();
            int length = texts.length;
            int length2 = denses[0].length;
            z0.a aVar = new z0.a(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(denses[i10], 0, aVar.a(), i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            z0.a b10 = c10.b(aVar, texts, task.g());
            if (b10 != null && f10 != null) {
                if (!(b10.a().length == 0)) {
                    if (!(f10.length == 0)) {
                        int i12 = c.f20669a[task.ordinal()];
                        if (i12 != 1) {
                            if (i12 == 2) {
                                return f20652a.r(b10, f10);
                            }
                            throw new l();
                        }
                        return f20652a.s(b10, f10);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    private final String[] r(z0.a aVar, float[] fArr) {
        ha.f h10;
        int j10;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            int b10 = aVar.b(0);
            int b11 = aVar.b(1);
            float[] a10 = aVar.a();
            if (b11 != fArr.length) {
                return null;
            }
            h10 = ha.i.h(0, b10);
            j10 = t9.q.j(h10, 10);
            ArrayList arrayList = new ArrayList(j10);
            Iterator<Integer> it = h10.iterator();
            while (it.hasNext()) {
                int a11 = ((c0) it).a();
                String str = "none";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (a10[(a11 * b11) + i11] >= fArr[i10]) {
                        str = f20655d.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final String[] s(z0.a aVar, float[] fArr) {
        ha.f h10;
        int j10;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            int b10 = aVar.b(0);
            int b11 = aVar.b(1);
            float[] a10 = aVar.a();
            if (b11 != fArr.length) {
                return null;
            }
            h10 = ha.i.h(0, b10);
            j10 = t9.q.j(h10, 10);
            ArrayList arrayList = new ArrayList(j10);
            Iterator<Integer> it = h10.iterator();
            while (it.hasNext()) {
                int a11 = ((c0) it).a();
                String str = "other";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (a10[(a11 * b11) + i11] >= fArr[i10]) {
                        str = f20654c.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }
}
