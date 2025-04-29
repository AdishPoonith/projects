package s1;

import java.util.HashSet;
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<String> f17354a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static String f17355b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (k1.class) {
            if (f17354a.add(str)) {
                f17355b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (k1.class) {
            str = f17355b;
        }
        return str;
    }
}
