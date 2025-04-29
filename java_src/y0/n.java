package y0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import f1.c0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.v;
import p0.r0;
import q0.c0;
import q0.o;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f20344a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final String f20345b = n.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final long[] f20346c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private n() {
    }

    private final String a(Context context) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String k10 = kotlin.jvm.internal.l.k("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(k10, null);
            if (string == null || string.length() != 32) {
                l lVar = l.f20330a;
                String c10 = l.c(context, null);
                if (c10 == null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                    kotlin.jvm.internal.l.d(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                    c10 = l.b(applicationInfo.sourceDir);
                }
                sharedPreferences.edit().putString(k10, c10).apply();
                return c10;
            }
            return string;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final int b(long j10) {
        if (k1.a.d(n.class)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            try {
                long[] jArr = f20346c;
                if (i10 >= jArr.length || jArr[i10] >= j10) {
                    break;
                }
                i10++;
            } catch (Throwable th) {
                k1.a.b(th, n.class);
                return 0;
            }
        }
        return i10;
    }

    public static final void c(String activityName, o oVar, String str, Context context) {
        String oVar2;
        if (k1.a.d(n.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(activityName, "activityName");
            kotlin.jvm.internal.l.e(context, "context");
            String str2 = "Unclassified";
            if (oVar != null && (oVar2 = oVar.toString()) != null) {
                str2 = oVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str2);
            bundle.putString("fb_mobile_pckg_fp", f20344a.a(context));
            o1.a aVar = o1.a.f14384a;
            bundle.putString("fb_mobile_app_cert_hash", o1.a.a(context));
            c0.a aVar2 = c0.f15905b;
            c0 a10 = aVar2.a(activityName, str, null);
            a10.d("fb_mobile_activate_app", bundle);
            if (aVar2.c() != o.b.EXPLICIT_ONLY) {
                a10.a();
            }
        } catch (Throwable th) {
            k1.a.b(th, n.class);
        }
    }

    private final void d() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            c0.a aVar = f1.c0.f8388e;
            r0 r0Var = r0.APP_EVENTS;
            String str = f20345b;
            kotlin.jvm.internal.l.b(str);
            aVar.b(r0Var, str, "Clock skew detected");
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public static final void e(String activityName, m mVar, String str) {
        long longValue;
        String oVar;
        if (k1.a.d(n.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(activityName, "activityName");
            if (mVar == null) {
                return;
            }
            Long b10 = mVar.b();
            long j10 = 0;
            if (b10 == null) {
                Long e10 = mVar.e();
                longValue = 0 - (e10 == null ? 0L : e10.longValue());
            } else {
                longValue = b10.longValue();
            }
            if (longValue < 0) {
                f20344a.d();
                longValue = 0;
            }
            long f10 = mVar.f();
            if (f10 < 0) {
                f20344a.d();
                f10 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", mVar.c());
            v vVar = v.f12860a;
            String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(b(longValue))}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", format);
            o g10 = mVar.g();
            String str2 = "Unclassified";
            if (g10 != null && (oVar = g10.toString()) != null) {
                str2 = oVar;
            }
            bundle.putString("fb_mobile_launch_source", str2);
            Long e11 = mVar.e();
            if (e11 != null) {
                j10 = e11.longValue();
            }
            bundle.putLong("_logTime", j10 / 1000);
            q0.c0.f15905b.a(activityName, str, null).c("fb_mobile_deactivate_app", f10 / 1000, bundle);
        } catch (Throwable th) {
            k1.a.b(th, n.class);
        }
    }
}
