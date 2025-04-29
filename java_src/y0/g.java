package y0;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import f1.l0;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.v;
import p0.f0;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f20314a = new g();

    private g() {
    }

    public static final void a() {
    }

    public static final void b() {
    }

    public static final String c(byte[] bytes) {
        kotlin.jvm.internal.l.e(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bytes.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bytes[i10];
            i10++;
            v vVar = v.f12860a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.l.d(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static final String d() {
        f0 f0Var = f0.f14852a;
        Context l10 = f0.l();
        try {
            String str = l10.getPackageManager().getPackageInfo(l10.getPackageName(), 0).versionName;
            kotlin.jvm.internal.l.d(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View e(Activity activity) {
        if (k1.a.d(g.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            k1.a.b(th, g.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (r0 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = ka.g.t(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L73
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = ka.g.t(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r6 = "google_sdk"
            boolean r7 = ka.g.w(r0, r6, r3, r4, r5)
            if (r7 != 0) goto L73
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r7 = "Emulator"
            boolean r7 = ka.g.w(r0, r7, r3, r4, r5)
            if (r7 != 0) goto L73
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = ka.g.w(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.l.d(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = ka.g.w(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.l.d(r0, r1)
            boolean r0 = ka.g.t(r0, r2, r3, r4, r5)
            if (r0 == 0) goto L6b
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            kotlin.jvm.internal.l.d(r0, r1)
            boolean r0 = ka.g.t(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L73
        L6b:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = kotlin.jvm.internal.l.a(r6, r0)
            if (r0 == 0) goto L74
        L73:
            r3 = 1
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.g.f():boolean");
    }

    public static final double g(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (matcher.find()) {
                String group = matcher.group(0);
                l0 l0Var = l0.f8470a;
                return NumberFormat.getNumberInstance(l0.y()).parse(group).doubleValue();
            }
            return 0.0d;
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
