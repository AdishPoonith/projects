package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f1749a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f1750b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f1751c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f1752d;

    /* renamed from: androidx.core.os.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0025a {

        /* renamed from: a  reason: collision with root package name */
        static final int f1753a = SdkExtensions.getExtensionVersion(30);

        /* renamed from: b  reason: collision with root package name */
        static final int f1754b = SdkExtensions.getExtensionVersion(31);

        /* renamed from: c  reason: collision with root package name */
        static final int f1755c = SdkExtensions.getExtensionVersion(33);

        /* renamed from: d  reason: collision with root package name */
        static final int f1756d = SdkExtensions.getExtensionVersion(1000000);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f1749a = i10 >= 30 ? C0025a.f1753a : 0;
        f1750b = i10 >= 30 ? C0025a.f1754b : 0;
        f1751c = i10 >= 30 ? C0025a.f1755c : 0;
        f1752d = i10 >= 30 ? C0025a.f1756d : 0;
    }

    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
