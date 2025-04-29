package f1;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f8442a = new g0();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<String, JSONObject> f8443b = new ConcurrentHashMap<>();

    private g0() {
    }

    public static final JSONObject a(String accessToken) {
        kotlin.jvm.internal.l.e(accessToken, "accessToken");
        return f8443b.get(accessToken);
    }

    public static final void b(String key, JSONObject value) {
        kotlin.jvm.internal.l.e(key, "key");
        kotlin.jvm.internal.l.e(value, "value");
        f8443b.put(key, value);
    }
}
