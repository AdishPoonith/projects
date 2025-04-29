package w0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import f1.n;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.q;
import p0.f0;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f19605a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f19606b = new AtomicBoolean(false);

    private k() {
    }

    public static final void a() {
        if (k1.a.d(k.class)) {
            return;
        }
        try {
            f19606b.set(true);
            b();
        } catch (Throwable th) {
            k1.a.b(th, k.class);
        }
    }

    public static final void b() {
        if (k1.a.d(k.class)) {
            return;
        }
        try {
            if (f19606b.get()) {
                if (f19605a.c()) {
                    n nVar = n.f8481a;
                    if (n.g(n.b.IapLoggingLib2)) {
                        f fVar = f.f19564a;
                        f0 f0Var = f0.f14852a;
                        f.d(f0.l());
                        return;
                    }
                }
                a aVar = a.f19551a;
                a.g();
            }
        } catch (Throwable th) {
            k1.a.b(th, k.class);
        }
    }

    private final boolean c() {
        List b02;
        if (k1.a.d(this)) {
            return false;
        }
        try {
            f0 f0Var = f0.f14852a;
            Context l10 = f0.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
            kotlin.jvm.internal.l.d(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            b02 = q.b0(string, new String[]{"."}, false, 3, 2, null);
            return Integer.parseInt((String) b02.get(0)) >= 2;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }
}
