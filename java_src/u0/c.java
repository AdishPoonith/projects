package u0;

import java.util.Arrays;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final a f18432i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f18433a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18434b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18435c;

    /* renamed from: d  reason: collision with root package name */
    private final String f18436d;

    /* renamed from: e  reason: collision with root package name */
    private final String f18437e;

    /* renamed from: f  reason: collision with root package name */
    private final String f18438f;

    /* renamed from: g  reason: collision with root package name */
    private final String f18439g;

    /* renamed from: h  reason: collision with root package name */
    private final int f18440h;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f18447j;

        b(int i10) {
            this.f18447j = i10;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int g() {
            return this.f18447j;
        }
    }

    public c(JSONObject component) {
        l.e(component, "component");
        String string = component.getString("class_name");
        l.d(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f18433a = string;
        this.f18434b = component.optInt("index", -1);
        this.f18435c = component.optInt("id");
        String optString = component.optString("text");
        l.d(optString, "component.optString(PATH_TEXT_KEY)");
        this.f18436d = optString;
        String optString2 = component.optString("tag");
        l.d(optString2, "component.optString(PATH_TAG_KEY)");
        this.f18437e = optString2;
        String optString3 = component.optString("description");
        l.d(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f18438f = optString3;
        String optString4 = component.optString("hint");
        l.d(optString4, "component.optString(PATH_HINT_KEY)");
        this.f18439g = optString4;
        this.f18440h = component.optInt("match_bitmask");
    }

    public final String a() {
        return this.f18433a;
    }

    public final String b() {
        return this.f18438f;
    }

    public final String c() {
        return this.f18439g;
    }

    public final int d() {
        return this.f18435c;
    }

    public final int e() {
        return this.f18434b;
    }

    public final int f() {
        return this.f18440h;
    }

    public final String g() {
        return this.f18437e;
    }

    public final String h() {
        return this.f18436d;
    }
}
