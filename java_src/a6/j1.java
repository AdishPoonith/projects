package a6;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.dp;
import com.google.android.gms.internal.p000firebaseauthapi.ih;
import com.google.android.gms.internal.p000firebaseauthapi.mi;
import com.google.android.gms.internal.p000firebaseauthapi.nh;
import com.google.android.gms.internal.p000firebaseauthapi.oi;
import com.google.android.gms.internal.p000firebaseauthapi.qa;
import com.google.android.gms.internal.p000firebaseauthapi.u9;
import com.google.android.gms.internal.p000firebaseauthapi.y9;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: c  reason: collision with root package name */
    private static j1 f244c;

    /* renamed from: a  reason: collision with root package name */
    private final String f245a;

    /* renamed from: b  reason: collision with root package name */
    private final oi f246b;

    private j1(Context context, String str, boolean z10) {
        oi oiVar;
        this.f245a = str;
        try {
            ih.a();
            mi miVar = new mi();
            miVar.f(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str));
            miVar.d(nh.f5075b);
            miVar.e(String.format("android-keystore://firebear_master_key_id.%s", str));
            oiVar = miVar.g();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e10.getMessage())));
            oiVar = null;
        }
        this.f246b = oiVar;
    }

    public static j1 a(Context context, String str) {
        j1 j1Var = f244c;
        if (j1Var == null || !dp.a(j1Var.f245a, str)) {
            f244c = new j1(context, str, true);
        }
        return f244c;
    }

    public final String b(String str) {
        String str2;
        oi oiVar = this.f246b;
        if (oiVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (oiVar) {
                str2 = new String(((y9) this.f246b.a().e(y9.class)).a(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e10.getMessage())));
            return null;
        }
    }

    public final String c() {
        if (this.f246b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        qa c10 = u9.c(byteArrayOutputStream);
        try {
            synchronized (this.f246b) {
                this.f246b.a().b().g(c10);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e10.getMessage())));
            return null;
        }
    }
}
