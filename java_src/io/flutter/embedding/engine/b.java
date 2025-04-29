package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f10304b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f10305a = new HashMap();

    b() {
    }

    public static b b() {
        if (f10304b == null) {
            f10304b = new b();
        }
        return f10304b;
    }

    public a a(String str) {
        return this.f10305a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f10305a.put(str, aVar);
        } else {
            this.f10305a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
