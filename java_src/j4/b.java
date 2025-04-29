package j4;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import h4.j;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f12109a;

    public b(Context context) {
        this.f12109a = context;
    }

    @ResultIgnorabilityUnspecified
    public ApplicationInfo a(String str, int i10) {
        return this.f12109a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence b(String str) {
        return this.f12109a.getPackageManager().getApplicationLabel(this.f12109a.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    public PackageInfo c(String str, int i10) {
        return this.f12109a.getPackageManager().getPackageInfo(str, i10);
    }

    public final boolean d(int i10, String str) {
        if (j.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f12109a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f12109a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
