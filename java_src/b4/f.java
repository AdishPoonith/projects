package b4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2908a = j.f2913a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f2909b = new f();

    public static f e() {
        return f2909b;
    }

    public Intent a(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && h4.g.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f2908a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(j4.c.a(context).c(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb2 = sb.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb2)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    public PendingIntent b(Context context, int i10, int i11) {
        return c(context, i10, i11, null);
    }

    public PendingIntent c(Context context, int i10, int i11, String str) {
        Intent a10 = a(context, i10, str);
        if (a10 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, a10, p4.d.f15493a | 134217728);
    }

    public String d(int i10) {
        return j.b(i10);
    }

    @ResultIgnorabilityUnspecified
    public int f(Context context) {
        return g(context, f2908a);
    }

    public int g(Context context, int i10) {
        int f10 = j.f(context, i10);
        if (j.g(context, f10)) {
            return 18;
        }
        return f10;
    }

    public boolean h(Context context, String str) {
        return j.j(context, str);
    }

    public boolean i(int i10) {
        return j.i(i10);
    }

    public void j(Context context, int i10) {
        j.a(context, i10);
    }
}
