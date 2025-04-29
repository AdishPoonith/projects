package f1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f8465a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final HashSet<String> f8466b;

    static {
        HashSet<String> c10;
        c10 = t9.m0.c("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");
        f8466b = c10;
    }

    private k() {
    }

    public static final boolean a(Context context, String packageName) {
        boolean t10;
        boolean m10;
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(packageName, "packageName");
        String brand = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        kotlin.jvm.internal.l.d(brand, "brand");
        t10 = ka.p.t(brand, "generic", false, 2, null);
        if (!t10 || (i10 & 2) == 0) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null) {
                    kotlin.jvm.internal.l.d(signatureArr, "packageInfo.signatures");
                    if (signatureArr.length == 0) {
                        return false;
                    }
                    Signature[] signatureArr2 = packageInfo.signatures;
                    kotlin.jvm.internal.l.d(signatureArr2, "packageInfo.signatures");
                    for (Signature signature : signatureArr2) {
                        HashSet<String> hashSet = f8466b;
                        l0 l0Var = l0.f8470a;
                        byte[] byteArray = signature.toByteArray();
                        kotlin.jvm.internal.l.d(byteArray, "it.toByteArray()");
                        m10 = t9.x.m(hashSet, l0.z0(byteArray));
                        if (!m10) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return true;
    }
}
