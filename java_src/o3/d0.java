package o3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f14418a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f14419b;

    public synchronized void a(Map<String, String> map) {
        this.f14419b = null;
        this.f14418a.clear();
        this.f14418a.putAll(map);
    }

    public synchronized Map<String, String> b() {
        if (this.f14419b == null) {
            this.f14419b = Collections.unmodifiableMap(new HashMap(this.f14418a));
        }
        return this.f14419b;
    }
}
