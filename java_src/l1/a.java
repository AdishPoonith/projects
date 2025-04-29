package l1;

import h1.k;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0193a f13041d = new C0193a(null);

    /* renamed from: a  reason: collision with root package name */
    private String f13042a;

    /* renamed from: b  reason: collision with root package name */
    private String f13043b;

    /* renamed from: c  reason: collision with root package name */
    private Long f13044c;

    /* renamed from: l1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0193a {
        private C0193a() {
        }

        public /* synthetic */ C0193a(g gVar) {
            this();
        }
    }

    public a(File file) {
        l.e(file, "file");
        String name = file.getName();
        l.d(name, "file.name");
        this.f13042a = name;
        k kVar = k.f9091a;
        JSONObject r10 = k.r(name, true);
        if (r10 != null) {
            this.f13044c = Long.valueOf(r10.optLong("timestamp", 0L));
            this.f13043b = r10.optString("error_message", null);
        }
    }

    public a(String str) {
        this.f13044c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f13043b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l10 = this.f13044c;
        Objects.requireNonNull(l10, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f13042a = stringBuffer2;
    }

    public final void a() {
        k kVar = k.f9091a;
        k.d(this.f13042a);
    }

    public final int b(a data) {
        l.e(data, "data");
        Long l10 = this.f13044c;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = data.f13044c;
        if (l11 == null) {
            return 1;
        }
        return l.g(l11.longValue(), longValue);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f13044c;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            jSONObject.put("error_message", this.f13043b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        return (this.f13043b == null || this.f13044c == null) ? false : true;
    }

    public final void e() {
        if (d()) {
            k kVar = k.f9091a;
            k.t(this.f13042a, toString());
        }
    }

    public String toString() {
        JSONObject c10 = c();
        if (c10 == null) {
            return super.toString();
        }
        String jSONObject = c10.toString();
        l.d(jSONObject, "params.toString()");
        return jSONObject;
    }
}
