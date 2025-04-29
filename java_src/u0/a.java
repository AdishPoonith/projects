package u0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final b f18410j = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f18411a;

    /* renamed from: b  reason: collision with root package name */
    private final c f18412b;

    /* renamed from: c  reason: collision with root package name */
    private final EnumC0265a f18413c;

    /* renamed from: d  reason: collision with root package name */
    private final String f18414d;

    /* renamed from: e  reason: collision with root package name */
    private final List<u0.c> f18415e;

    /* renamed from: f  reason: collision with root package name */
    private final List<u0.b> f18416f;

    /* renamed from: g  reason: collision with root package name */
    private final String f18417g;

    /* renamed from: h  reason: collision with root package name */
    private final String f18418h;

    /* renamed from: i  reason: collision with root package name */
    private final String f18419i;

    /* renamed from: u0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0265a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0265a[] valuesCustom() {
            EnumC0265a[] valuesCustom = values();
            return (EnumC0265a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final a a(JSONObject mapping) {
            int length;
            l.e(mapping, "mapping");
            String eventName = mapping.getString("event_name");
            String string = mapping.getString("method");
            l.d(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            l.d(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            l.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string2 = mapping.getString("event_type");
            l.d(string2, "mapping.getString(\"event_type\")");
            l.d(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            l.d(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            EnumC0265a valueOf2 = EnumC0265a.valueOf(upperCase2);
            String appVersion = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i10 = 0;
            if (length2 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jsonPath = jSONArray.getJSONObject(i11);
                    l.d(jsonPath, "jsonPath");
                    arrayList.add(new u0.c(jsonPath));
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                }
            }
            String pathType = mapping.optString("path_type", "absolute");
            JSONArray optJSONArray = mapping.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i13 = i10 + 1;
                    JSONObject jsonParameter = optJSONArray.getJSONObject(i10);
                    l.d(jsonParameter, "jsonParameter");
                    arrayList2.add(new u0.b(jsonParameter));
                    if (i13 >= length) {
                        break;
                    }
                    i10 = i13;
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            l.d(eventName, "eventName");
            l.d(appVersion, "appVersion");
            l.d(componentId, "componentId");
            l.d(pathType, "pathType");
            l.d(activityName, "activityName");
            return new a(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        public final List<a> b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int i10 = 0;
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            l.d(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(a(jSONObject));
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        MANUAL,
        INFERENCE;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public a(String eventName, c method, EnumC0265a type, String appVersion, List<u0.c> path, List<u0.b> parameters, String componentId, String pathType, String activityName) {
        l.e(eventName, "eventName");
        l.e(method, "method");
        l.e(type, "type");
        l.e(appVersion, "appVersion");
        l.e(path, "path");
        l.e(parameters, "parameters");
        l.e(componentId, "componentId");
        l.e(pathType, "pathType");
        l.e(activityName, "activityName");
        this.f18411a = eventName;
        this.f18412b = method;
        this.f18413c = type;
        this.f18414d = appVersion;
        this.f18415e = path;
        this.f18416f = parameters;
        this.f18417g = componentId;
        this.f18418h = pathType;
        this.f18419i = activityName;
    }

    public final String a() {
        return this.f18419i;
    }

    public final String b() {
        return this.f18411a;
    }

    public final List<u0.b> c() {
        List<u0.b> unmodifiableList = Collections.unmodifiableList(this.f18416f);
        l.d(unmodifiableList, "unmodifiableList(parameters)");
        return unmodifiableList;
    }

    public final List<u0.c> d() {
        List<u0.c> unmodifiableList = Collections.unmodifiableList(this.f18415e);
        l.d(unmodifiableList, "unmodifiableList(path)");
        return unmodifiableList;
    }
}
