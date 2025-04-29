package p3;

import android.os.Trace;
/* loaded from: classes.dex */
public final class k0 {
    public static void a(String str) {
        if (n0.f15397a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (n0.f15397a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}
