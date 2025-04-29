package t6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import g6.c;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f18324a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f18325b;

    /* renamed from: c  reason: collision with root package name */
    private final c f18326c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18327d;

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f18324a = a10;
        this.f18325b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f18326c = cVar;
        this.f18327d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f18325b.contains("firebase_data_collection_default_enabled") ? this.f18325b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f18324a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f18324a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f18327d != z10) {
            this.f18327d = z10;
            this.f18326c.a(new g6.a<>(w5.b.class, new w5.b(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f18327d;
    }

    public synchronized void e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.f18325b.edit().remove("firebase_data_collection_default_enabled").apply();
            equals = d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.f18325b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
        }
        f(equals);
    }
}
