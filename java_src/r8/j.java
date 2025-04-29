package r8;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f16777a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16778b;

    public j(String str, Object obj) {
        this.f16777a = str;
        this.f16778b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f16778b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return (T) this.f16778b;
    }
}
