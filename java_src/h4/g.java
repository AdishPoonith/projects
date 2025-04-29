package h4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9466a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f9467b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f9468c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f9469d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f9469d == null) {
            boolean z10 = false;
            if (j.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f9469d = Boolean.valueOf(z10);
        }
        return f9469d.booleanValue();
    }

    public static boolean b() {
        int i10 = b4.j.f2913a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (!c(context) || j.g()) {
            if (e(context)) {
                return !j.h() || j.k();
            }
            return false;
        }
        return true;
    }

    public static boolean e(Context context) {
        if (f9467b == null) {
            boolean z10 = false;
            if (j.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f9467b = Boolean.valueOf(z10);
        }
        return f9467b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f9468c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f9468c = Boolean.valueOf(z10);
        }
        return f9468c.booleanValue();
    }

    @SideEffectFree
    public static boolean g(PackageManager packageManager) {
        if (f9466a == null) {
            boolean z10 = false;
            if (j.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f9466a = Boolean.valueOf(z10);
        }
        return f9466a.booleanValue();
    }
}
