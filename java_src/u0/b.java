package u0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f18427e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f18428a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18429b;

    /* renamed from: c  reason: collision with root package name */
    private final List<c> f18430c;

    /* renamed from: d  reason: collision with root package name */
    private final String f18431d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public b(JSONObject component) {
        l.e(component, "component");
        String string = component.getString("name");
        l.d(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f18428a = string;
        String optString = component.optString("value");
        l.d(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f18429b = optString;
        String optString2 = component.optString("path_type", "absolute");
        l.d(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f18431d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = component.optJSONArray("path");
        if (optJSONArray != null) {
            int i10 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject = optJSONArray.getJSONObject(i10);
                    l.d(jSONObject, "jsonPathArray.getJSONObject(i)");
                    arrayList.add(new c(jSONObject));
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        }
        this.f18430c = arrayList;
    }

    public final String a() {
        return this.f18428a;
    }

    public final List<c> b() {
        return this.f18430c;
    }

    public final String c() {
        return this.f18431d;
    }

    public final String d() {
        return this.f18429b;
    }
}
