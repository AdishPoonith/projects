package h1;

import android.os.Build;
import f1.l0;
import java.io.File;
import java.util.Arrays;
import ka.p;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static final b f9066h = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private String f9067a;

    /* renamed from: b  reason: collision with root package name */
    private EnumC0151c f9068b;

    /* renamed from: c  reason: collision with root package name */
    private JSONArray f9069c;

    /* renamed from: d  reason: collision with root package name */
    private String f9070d;

    /* renamed from: e  reason: collision with root package name */
    private String f9071e;

    /* renamed from: f  reason: collision with root package name */
    private String f9072f;

    /* renamed from: g  reason: collision with root package name */
    private Long f9073g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9074a = new a();

        private a() {
        }

        public static final c a(String str, String str2) {
            return new c(str, str2, (kotlin.jvm.internal.g) null);
        }

        public static final c b(Throwable th, EnumC0151c t10) {
            l.e(t10, "t");
            return new c(th, t10, (kotlin.jvm.internal.g) null);
        }

        public static final c c(JSONArray features) {
            l.e(features, "features");
            return new c(features, (kotlin.jvm.internal.g) null);
        }

        public static final c d(File file) {
            l.e(file, "file");
            return new c(file, (kotlin.jvm.internal.g) null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EnumC0151c b(String str) {
            boolean t10;
            boolean t11;
            boolean t12;
            boolean t13;
            boolean t14;
            t10 = p.t(str, "crash_log_", false, 2, null);
            if (t10) {
                return EnumC0151c.CrashReport;
            }
            t11 = p.t(str, "shield_log_", false, 2, null);
            if (t11) {
                return EnumC0151c.CrashShield;
            }
            t12 = p.t(str, "thread_check_log_", false, 2, null);
            if (t12) {
                return EnumC0151c.ThreadCheck;
            }
            t13 = p.t(str, "analysis_log_", false, 2, null);
            if (t13) {
                return EnumC0151c.Analysis;
            }
            t14 = p.t(str, "anr_log_", false, 2, null);
            return t14 ? EnumC0151c.AnrReport : EnumC0151c.Unknown;
        }
    }

    /* renamed from: h1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0151c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: h1.c$c$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f9082a;

            static {
                int[] iArr = new int[EnumC0151c.valuesCustom().length];
                iArr[EnumC0151c.Analysis.ordinal()] = 1;
                iArr[EnumC0151c.AnrReport.ordinal()] = 2;
                iArr[EnumC0151c.CrashReport.ordinal()] = 3;
                iArr[EnumC0151c.CrashShield.ordinal()] = 4;
                iArr[EnumC0151c.ThreadCheck.ordinal()] = 5;
                f9082a = iArr;
            }
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0151c[] valuesCustom() {
            EnumC0151c[] valuesCustom = values();
            return (EnumC0151c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String g() {
            int i10 = a.f9082a[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f9082a[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9083a;

        static {
            int[] iArr = new int[EnumC0151c.valuesCustom().length];
            iArr[EnumC0151c.Analysis.ordinal()] = 1;
            iArr[EnumC0151c.AnrReport.ordinal()] = 2;
            iArr[EnumC0151c.CrashReport.ordinal()] = 3;
            iArr[EnumC0151c.CrashShield.ordinal()] = 4;
            iArr[EnumC0151c.ThreadCheck.ordinal()] = 5;
            f9083a = iArr;
        }
    }

    private c(File file) {
        String name = file.getName();
        l.d(name, "file.name");
        this.f9067a = name;
        this.f9068b = f9066h.b(name);
        k kVar = k.f9091a;
        JSONObject r10 = k.r(this.f9067a, true);
        if (r10 != null) {
            this.f9073g = Long.valueOf(r10.optLong("timestamp", 0L));
            this.f9070d = r10.optString("app_version", null);
            this.f9071e = r10.optString("reason", null);
            this.f9072f = r10.optString("callstack", null);
            this.f9069c = r10.optJSONArray("feature_names");
        }
    }

    public /* synthetic */ c(File file, kotlin.jvm.internal.g gVar) {
        this(file);
    }

    private c(String str, String str2) {
        this.f9068b = EnumC0151c.AnrReport;
        l0 l0Var = l0.f8470a;
        this.f9070d = l0.v();
        this.f9071e = str;
        this.f9072f = str2;
        this.f9073g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f9073g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f9067a = stringBuffer2;
    }

    public /* synthetic */ c(String str, String str2, kotlin.jvm.internal.g gVar) {
        this(str, str2);
    }

    private c(Throwable th, EnumC0151c enumC0151c) {
        this.f9068b = enumC0151c;
        l0 l0Var = l0.f8470a;
        this.f9070d = l0.v();
        k kVar = k.f9091a;
        this.f9071e = k.e(th);
        this.f9072f = k.h(th);
        this.f9073g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC0151c.g());
        stringBuffer.append(String.valueOf(this.f9073g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.d(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.f9067a = stringBuffer2;
    }

    public /* synthetic */ c(Throwable th, EnumC0151c enumC0151c, kotlin.jvm.internal.g gVar) {
        this(th, enumC0151c);
    }

    private c(JSONArray jSONArray) {
        this.f9068b = EnumC0151c.Analysis;
        this.f9073g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f9069c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f9073g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f9067a = stringBuffer2;
    }

    public /* synthetic */ c(JSONArray jSONArray, kotlin.jvm.internal.g gVar) {
        this(jSONArray);
    }

    private final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f9069c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l10 = this.f9073g;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f9070d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l10 = this.f9073g;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            String str2 = this.f9071e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f9072f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC0151c enumC0151c = this.f9068b;
            if (enumC0151c != null) {
                jSONObject.put("type", enumC0151c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject e() {
        EnumC0151c enumC0151c = this.f9068b;
        int i10 = enumC0151c == null ? -1 : d.f9083a[enumC0151c.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                return d();
            }
            return null;
        }
        return c();
    }

    public final void a() {
        k kVar = k.f9091a;
        k.d(this.f9067a);
    }

    public final int b(c data) {
        l.e(data, "data");
        Long l10 = this.f9073g;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = data.f9073g;
        if (l11 == null) {
            return 1;
        }
        return l.g(l11.longValue(), longValue);
    }

    public final boolean f() {
        EnumC0151c enumC0151c = this.f9068b;
        int i10 = enumC0151c == null ? -1 : d.f9083a[enumC0151c.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || this.f9072f == null || this.f9073g == null) {
                    return false;
                }
            } else if (this.f9072f == null || this.f9071e == null || this.f9073g == null) {
                return false;
            }
        } else if (this.f9069c == null || this.f9073g == null) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (f()) {
            k kVar = k.f9091a;
            k.t(this.f9067a, toString());
        }
    }

    public String toString() {
        String jSONObject;
        String str;
        JSONObject e10 = e();
        if (e10 == null) {
            jSONObject = new JSONObject().toString();
            str = "JSONObject().toString()";
        } else {
            jSONObject = e10.toString();
            str = "params.toString()";
        }
        l.d(jSONObject, str);
        return jSONObject;
    }
}
