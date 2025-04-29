package b8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import i8.a;
import java.security.MessageDigest;
import java.util.HashMap;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import r8.j;
import r8.k;
/* loaded from: classes.dex */
public final class a implements k.c, i8.a {

    /* renamed from: l  reason: collision with root package name */
    public static final C0068a f3092l = new C0068a(null);

    /* renamed from: j  reason: collision with root package name */
    private Context f3093j;

    /* renamed from: k  reason: collision with root package name */
    private k f3094k;

    /* renamed from: b8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0068a {
        private C0068a() {
        }

        public /* synthetic */ C0068a(g gVar) {
            this();
        }
    }

    private final String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            cArr2[i12] = cArr[i11 >>> 4];
            cArr2[i12 + 1] = cArr[i11 & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
        if ((r6.length == 0) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String b(android.content.pm.PackageManager r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9b
            r2 = 28
            java.lang.String r3 = "toByteArray(...)"
            if (r1 < r2) goto L5a
            android.content.Context r1 = r5.f3093j     // Catch: java.lang.Throwable -> L9b
            kotlin.jvm.internal.l.b(r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L9b
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L9b
            android.content.pm.SigningInfo r6 = r6.signingInfo     // Catch: java.lang.Throwable -> L9b
            if (r6 != 0) goto L1d
            return r0
        L1d:
            boolean r1 = r6.hasMultipleSigners()     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L3e
            android.content.pm.Signature[] r6 = r6.getApkContentsSigners()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "getApkContentsSigners(...)"
            kotlin.jvm.internal.l.d(r6, r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r6 = t9.g.n(r6)     // Catch: java.lang.Throwable -> L9b
            android.content.pm.Signature r6 = (android.content.pm.Signature) r6     // Catch: java.lang.Throwable -> L9b
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L9b
            kotlin.jvm.internal.l.d(r6, r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r5.f(r6)     // Catch: java.lang.Throwable -> L9b
            goto L58
        L3e:
            android.content.pm.Signature[] r6 = r6.getSigningCertificateHistory()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "getSigningCertificateHistory(...)"
            kotlin.jvm.internal.l.d(r6, r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r6 = t9.g.n(r6)     // Catch: java.lang.Throwable -> L9b
            android.content.pm.Signature r6 = (android.content.pm.Signature) r6     // Catch: java.lang.Throwable -> L9b
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L9b
            kotlin.jvm.internal.l.d(r6, r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r5.f(r6)     // Catch: java.lang.Throwable -> L9b
        L58:
            r0 = r6
            goto L9b
        L5a:
            android.content.Context r1 = r5.f3093j     // Catch: java.lang.Throwable -> L9b
            kotlin.jvm.internal.l.b(r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L9b
            r2 = 64
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L9b
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: java.lang.Throwable -> L9b
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L77
            int r4 = r6.length     // Catch: java.lang.Throwable -> L9b
            if (r4 != 0) goto L74
            r4 = 1
            goto L75
        L74:
            r4 = 0
        L75:
            if (r4 == 0) goto L78
        L77:
            r1 = 1
        L78:
            if (r1 != 0) goto L9b
            java.lang.String r1 = "signatures"
            kotlin.jvm.internal.l.d(r6, r1)     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = t9.g.n(r6)     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L86
            goto L9b
        L86:
            kotlin.jvm.internal.l.b(r6)     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r6 = t9.g.n(r6)     // Catch: java.lang.Throwable -> L9b
            android.content.pm.Signature r6 = (android.content.pm.Signature) r6     // Catch: java.lang.Throwable -> L9b
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L9b
            kotlin.jvm.internal.l.d(r6, r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = r5.f(r6)     // Catch: java.lang.Throwable -> L9b
            goto L58
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a.b(android.content.pm.PackageManager):java.lang.String");
    }

    private final String c() {
        Context context = this.f3093j;
        l.b(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.f3093j;
        l.b(context2);
        String packageName = context2.getPackageName();
        return Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager.getInstallerPackageName(packageName);
    }

    private final long e(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    private final String f(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        l.b(digest);
        return a(digest);
    }

    @Override // r8.k.c
    public void I(j call, k.d result) {
        l.e(call, "call");
        l.e(result, "result");
        try {
            if (!l.a(call.f16777a, "getAll")) {
                result.c();
                return;
            }
            Context context = this.f3093j;
            l.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f3093j;
            l.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            l.b(packageManager);
            String b10 = b(packageManager);
            String c10 = c();
            HashMap hashMap = new HashMap();
            hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
            Context context3 = this.f3093j;
            l.b(context3);
            hashMap.put("packageName", context3.getPackageName());
            hashMap.put("version", packageInfo.versionName);
            l.b(packageInfo);
            hashMap.put("buildNumber", String.valueOf(e(packageInfo)));
            if (b10 != null) {
                hashMap.put("buildSignature", b10);
            }
            if (c10 != null) {
                hashMap.put("installerStore", c10);
            }
            result.a(hashMap);
        } catch (PackageManager.NameNotFoundException e10) {
            result.b("Name not found", e10.getMessage(), null);
        }
    }

    @Override // i8.a
    public void d(a.b binding) {
        l.e(binding, "binding");
        this.f3093j = null;
        k kVar = this.f3094k;
        l.b(kVar);
        kVar.e(null);
        this.f3094k = null;
    }

    @Override // i8.a
    public void m(a.b binding) {
        l.e(binding, "binding");
        this.f3093j = binding.a();
        k kVar = new k(binding.b(), "dev.fluttercommunity.plus/package_info");
        this.f3094k = kVar;
        l.b(kVar);
        kVar.e(this);
    }
}
