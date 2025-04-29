package a8;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f348a = "android.support.customtabs.extra.KEEP_ALIVE";

    /* renamed from: b  reason: collision with root package name */
    private static final String f349b = "android.support.customtabs.action.CustomTabsService";

    /* renamed from: c  reason: collision with root package name */
    private static String f350c;

    public static void a(Context context, Intent intent) {
        intent.putExtra(f348a, new Intent().setClassName(context.getPackageName(), b.class.getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
        if (r6.contains("com.google.android.apps.chrome") != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r10) {
        /*
            java.lang.String r0 = a8.a.f350c
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "http://www.example.com"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r2)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)
            r4 = 0
            if (r3 == 0) goto L23
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L24
        L23:
            r3 = r4
        L24:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 < r6) goto L31
            r5 = 131072(0x20000, float:1.83671E-40)
            java.util.List r5 = r0.queryIntentActivities(r1, r5)
            goto L35
        L31:
            java.util.List r5 = r0.queryIntentActivities(r1, r2)
        L35:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L3e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = a8.a.f349b
            r8.setAction(r9)
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            java.lang.String r9 = r9.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r0.resolveService(r8, r2)
            if (r8 == 0) goto L3e
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
            r6.add(r7)
            goto L3e
        L69:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L72
            a8.a.f350c = r4
            goto Lbb
        L72:
            int r0 = r6.size()
            r4 = 1
            if (r0 != r4) goto L82
            java.lang.Object r10 = r6.get(r2)
            java.lang.String r10 = (java.lang.String) r10
        L7f:
            a8.a.f350c = r10
            goto Lbb
        L82:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L97
            boolean r10 = c(r10, r1)
            if (r10 != 0) goto L97
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto L97
            a8.a.f350c = r3
            goto Lbb
        L97:
            java.lang.String r10 = "com.android.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto La0
        L9f:
            goto L7f
        La0:
            java.lang.String r10 = "com.chrome.beta"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto La9
            goto L9f
        La9:
            java.lang.String r10 = "com.chrome.dev"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Lb2
            goto L9f
        Lb2:
            java.lang.String r10 = "com.google.android.apps.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Lbb
            goto L9f
        Lbb:
            java.lang.String r10 = a8.a.f350c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.a.b(android.content.Context):java.lang.String");
    }

    private static boolean c(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
