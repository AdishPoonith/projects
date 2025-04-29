package i9;

import java.util.List;
/* loaded from: classes.dex */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static List<h> f9803a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f9804b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized List<h> a() {
        List<h> list;
        synchronized (a0.class) {
            f9804b = true;
            list = f9803a;
        }
        return list;
    }
}
