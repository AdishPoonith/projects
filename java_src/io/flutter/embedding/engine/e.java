package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f10337b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, d> f10338a = new HashMap();

    e() {
    }

    public static e b() {
        if (f10337b == null) {
            synchronized (e.class) {
                if (f10337b == null) {
                    f10337b = new e();
                }
            }
        }
        return f10337b;
    }

    public d a(String str) {
        return this.f10338a.get(str);
    }
}
