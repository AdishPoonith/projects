package f1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f8428a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f8429b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private f() {
    }

    public static final String a() {
        HashSet O;
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            p0.f0 f0Var = p0.f0.f14852a;
            Context l10 = p0.f0.l();
            List<ResolveInfo> queryIntentServices = l10.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            kotlin.jvm.internal.l.d(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            O = t9.k.O(f8429b);
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && O.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    public static final String b() {
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            p0.f0 f0Var = p0.f0.f14852a;
            return kotlin.jvm.internal.l.k("fbconnect://cct.", p0.f0.l().getPackageName());
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    public static final String c(String developerDefinedRedirectURI) {
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            m0 m0Var = m0.f8479a;
            p0.f0 f0Var = p0.f0.f14852a;
            return m0.d(p0.f0.l(), developerDefinedRedirectURI) ? developerDefinedRedirectURI : m0.d(p0.f0.l(), b()) ? b() : "";
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }
}
