package w5;

import android.content.Context;
import android.text.TextUtils;
import c4.s;
import c4.v;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f19969a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19970b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19971c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19972d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19973e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19974f;

    /* renamed from: g  reason: collision with root package name */
    private final String f19975g;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f19976a;

        /* renamed from: b  reason: collision with root package name */
        private String f19977b;

        /* renamed from: c  reason: collision with root package name */
        private String f19978c;

        /* renamed from: d  reason: collision with root package name */
        private String f19979d;

        /* renamed from: e  reason: collision with root package name */
        private String f19980e;

        /* renamed from: f  reason: collision with root package name */
        private String f19981f;

        /* renamed from: g  reason: collision with root package name */
        private String f19982g;

        public n a() {
            return new n(this.f19977b, this.f19976a, this.f19978c, this.f19979d, this.f19980e, this.f19981f, this.f19982g);
        }

        public b b(String str) {
            this.f19976a = s.g(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f19977b = s.g(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f19978c = str;
            return this;
        }

        public b e(String str) {
            this.f19979d = str;
            return this;
        }

        public b f(String str) {
            this.f19980e = str;
            return this;
        }

        public b g(String str) {
            this.f19982g = str;
            return this;
        }

        public b h(String str) {
            this.f19981f = str;
            return this;
        }
    }

    private n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        s.m(!h4.l.b(str), "ApplicationId must be set.");
        this.f19970b = str;
        this.f19969a = str2;
        this.f19971c = str3;
        this.f19972d = str4;
        this.f19973e = str5;
        this.f19974f = str6;
        this.f19975g = str7;
    }

    public static n a(Context context) {
        v vVar = new v(context);
        String a10 = vVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new n(a10, vVar.a("google_api_key"), vVar.a("firebase_database_url"), vVar.a("ga_trackingId"), vVar.a("gcm_defaultSenderId"), vVar.a("google_storage_bucket"), vVar.a("project_id"));
    }

    public String b() {
        return this.f19969a;
    }

    public String c() {
        return this.f19970b;
    }

    public String d() {
        return this.f19971c;
    }

    public String e() {
        return this.f19972d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return c4.q.b(this.f19970b, nVar.f19970b) && c4.q.b(this.f19969a, nVar.f19969a) && c4.q.b(this.f19971c, nVar.f19971c) && c4.q.b(this.f19972d, nVar.f19972d) && c4.q.b(this.f19973e, nVar.f19973e) && c4.q.b(this.f19974f, nVar.f19974f) && c4.q.b(this.f19975g, nVar.f19975g);
        }
        return false;
    }

    public String f() {
        return this.f19973e;
    }

    public String g() {
        return this.f19975g;
    }

    public String h() {
        return this.f19974f;
    }

    public int hashCode() {
        return c4.q.c(this.f19970b, this.f19969a, this.f19971c, this.f19972d, this.f19973e, this.f19974f, this.f19975g);
    }

    public String toString() {
        return c4.q.d(this).a("applicationId", this.f19970b).a("apiKey", this.f19969a).a("databaseUrl", this.f19971c).a("gcmSenderId", this.f19973e).a("storageBucket", this.f19974f).a("projectId", this.f19975g).toString();
    }
}
