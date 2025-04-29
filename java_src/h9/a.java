package h9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import i8.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import r8.j;
import r8.k;
/* loaded from: classes.dex */
public final class a implements k.c, i8.a {

    /* renamed from: j  reason: collision with root package name */
    private k f9542j;

    /* renamed from: k  reason: collision with root package name */
    private Context f9543k;

    private final void a(Signature signature, k.d dVar) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        l.d(messageDigest, "getInstance(...)");
        messageDigest.update(signature.toByteArray());
        byte[] digest = messageDigest.digest();
        l.d(digest, "digest(...)");
        BigInteger bigInteger = new BigInteger(1, digest);
        v vVar = v.f12860a;
        String format = String.format("%0" + (digest.length << 1) + 'x', Arrays.copyOf(new Object[]{bigInteger}, 1));
        l.d(format, "format(format, *args)");
        dVar.a(format);
    }

    @Override // r8.k.c
    public void I(j call, k.d result) {
        l.e(call, "call");
        l.e(result, "result");
        if (!l.a(call.f16777a, "getSigningCertSha1")) {
            result.c();
            return;
        }
        try {
            Context context = this.f9543k;
            l.b(context);
            PackageManager packageManager = context.getPackageManager();
            Object b10 = call.b();
            l.b(b10);
            String str = (String) b10;
            int i10 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                Signature[] apkContentsSigners = packageManager.getPackageInfo(str, 134217728).signingInfo.getApkContentsSigners();
                l.d(apkContentsSigners, "getApkContentsSigners(...)");
                int length = apkContentsSigners.length;
                while (i10 < length) {
                    Signature signature = apkContentsSigners[i10];
                    l.b(signature);
                    a(signature, result);
                    i10++;
                }
                return;
            }
            Signature[] signatures = packageManager.getPackageInfo(str, 64).signatures;
            l.d(signatures, "signatures");
            int length2 = signatures.length;
            while (i10 < length2) {
                Signature signature2 = signatures[i10];
                l.b(signature2);
                a(signature2, result);
                i10++;
            }
        } catch (Exception e10) {
            result.b("ERROR", e10.toString(), null);
        }
    }

    @Override // i8.a
    public void d(a.b binding) {
        l.e(binding, "binding");
        k kVar = this.f9542j;
        if (kVar != null) {
            kVar.e(null);
        }
        this.f9542j = null;
        this.f9543k = null;
    }

    @Override // i8.a
    public void m(a.b binding) {
        l.e(binding, "binding");
        this.f9543k = binding.a();
        k kVar = new k(binding.b(), "google_api_headers");
        kVar.e(this);
        this.f9542j = kVar;
    }
}
