package f1;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: t  reason: collision with root package name */
    public static final a f8547t = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8548a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8549b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8550c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8551d;

    /* renamed from: e  reason: collision with root package name */
    private final EnumSet<i0> f8552e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<String, b>> f8553f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8554g;

    /* renamed from: h  reason: collision with root package name */
    private final j f8555h;

    /* renamed from: i  reason: collision with root package name */
    private final String f8556i;

    /* renamed from: j  reason: collision with root package name */
    private final String f8557j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f8558k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f8559l;

    /* renamed from: m  reason: collision with root package name */
    private final JSONArray f8560m;

    /* renamed from: n  reason: collision with root package name */
    private final String f8561n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f8562o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f8563p;

    /* renamed from: q  reason: collision with root package name */
    private final String f8564q;

    /* renamed from: r  reason: collision with root package name */
    private final String f8565r;

    /* renamed from: s  reason: collision with root package name */
    private final String f8566s;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final a f8567e = new a(null);

        /* renamed from: a  reason: collision with root package name */
        private final String f8568a;

        /* renamed from: b  reason: collision with root package name */
        private final String f8569b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f8570c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f8571d;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            private final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                int i10 = 0;
                if (length <= 0) {
                    return iArr;
                }
                while (true) {
                    int i11 = i10 + 1;
                    int i12 = -1;
                    int optInt = jSONArray.optInt(i10, -1);
                    if (optInt == -1) {
                        String versionString = jSONArray.optString(i10);
                        l0 l0Var = l0.f8470a;
                        if (!l0.X(versionString)) {
                            try {
                                kotlin.jvm.internal.l.d(versionString, "versionString");
                                i12 = Integer.parseInt(versionString);
                            } catch (NumberFormatException e10) {
                                l0 l0Var2 = l0.f8470a;
                                l0.d0("FacebookSDK", e10);
                            }
                            optInt = i12;
                        }
                    }
                    iArr[i10] = optInt;
                    if (i11 >= length) {
                        return iArr;
                    }
                    i10 = i11;
                }
            }

            public final b a(JSONObject dialogConfigJSON) {
                List b02;
                Object t10;
                Object B;
                kotlin.jvm.internal.l.e(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                l0 l0Var = l0.f8470a;
                if (l0.X(dialogNameWithFeature)) {
                    return null;
                }
                kotlin.jvm.internal.l.d(dialogNameWithFeature, "dialogNameWithFeature");
                b02 = ka.q.b0(dialogNameWithFeature, new String[]{"|"}, false, 0, 6, null);
                if (b02.size() != 2) {
                    return null;
                }
                t10 = t9.x.t(b02);
                String str = (String) t10;
                B = t9.x.B(b02);
                String str2 = (String) B;
                if (l0.X(str) || l0.X(str2)) {
                    return null;
                }
                String optString = dialogConfigJSON.optString("url");
                return new b(str, str2, l0.X(optString) ? null : Uri.parse(optString), b(dialogConfigJSON.optJSONArray("versions")), null);
            }
        }

        private b(String str, String str2, Uri uri, int[] iArr) {
            this.f8568a = str;
            this.f8569b = str2;
            this.f8570c = uri;
            this.f8571d = iArr;
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, kotlin.jvm.internal.g gVar) {
            this(str, str2, uri, iArr);
        }

        public final String a() {
            return this.f8568a;
        }

        public final String b() {
            return this.f8569b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(boolean z10, String nuxContent, boolean z11, int i10, EnumSet<i0> smartLoginOptions, Map<String, ? extends Map<String, b>> dialogConfigurations, boolean z12, j errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z13, boolean z14, JSONArray jSONArray, String sdkUpdateMessage, boolean z15, boolean z16, String str, String str2, String str3) {
        kotlin.jvm.internal.l.e(nuxContent, "nuxContent");
        kotlin.jvm.internal.l.e(smartLoginOptions, "smartLoginOptions");
        kotlin.jvm.internal.l.e(dialogConfigurations, "dialogConfigurations");
        kotlin.jvm.internal.l.e(errorClassification, "errorClassification");
        kotlin.jvm.internal.l.e(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        kotlin.jvm.internal.l.e(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        kotlin.jvm.internal.l.e(sdkUpdateMessage, "sdkUpdateMessage");
        this.f8548a = z10;
        this.f8549b = nuxContent;
        this.f8550c = z11;
        this.f8551d = i10;
        this.f8552e = smartLoginOptions;
        this.f8553f = dialogConfigurations;
        this.f8554g = z12;
        this.f8555h = errorClassification;
        this.f8556i = smartLoginBookmarkIconURL;
        this.f8557j = smartLoginMenuIconURL;
        this.f8558k = z13;
        this.f8559l = z14;
        this.f8560m = jSONArray;
        this.f8561n = sdkUpdateMessage;
        this.f8562o = z15;
        this.f8563p = z16;
        this.f8564q = str;
        this.f8565r = str2;
        this.f8566s = str3;
    }

    public final boolean a() {
        return this.f8554g;
    }

    public final boolean b() {
        return this.f8559l;
    }

    public final j c() {
        return this.f8555h;
    }

    public final JSONArray d() {
        return this.f8560m;
    }

    public final boolean e() {
        return this.f8558k;
    }

    public final String f() {
        return this.f8564q;
    }

    public final String g() {
        return this.f8566s;
    }

    public final String h() {
        return this.f8561n;
    }

    public final int i() {
        return this.f8551d;
    }

    public final EnumSet<i0> j() {
        return this.f8552e;
    }

    public final String k() {
        return this.f8565r;
    }

    public final boolean l() {
        return this.f8548a;
    }
}
