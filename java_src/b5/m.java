package b5;

import java.util.Locale;
import java.util.logging.Logger;
/* loaded from: classes.dex */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f2963a = Logger.getLogger(m.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final l f2964b = c();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements l {
        private b() {
        }
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    private static l c() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        return str == null || str.isEmpty();
    }
}
