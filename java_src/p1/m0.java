package p1;

import android.os.Bundle;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f15174a = new m0();

    private m0() {
    }

    public static final p0.j0 a(String authorizationCode, String redirectUri, String codeVerifier) {
        kotlin.jvm.internal.l.e(authorizationCode, "authorizationCode");
        kotlin.jvm.internal.l.e(redirectUri, "redirectUri");
        kotlin.jvm.internal.l.e(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        p0.f0 f0Var = p0.f0.f14852a;
        bundle.putString("client_id", p0.f0.m());
        bundle.putString("redirect_uri", redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        p0.j0 x10 = p0.j0.f14918n.x(null, "oauth/access_token", null);
        x10.G(p0.p0.GET);
        x10.H(bundle);
        return x10;
    }

    public static final String b(String codeVerifier, a codeChallengeMethod) {
        kotlin.jvm.internal.l.e(codeVerifier, "codeVerifier");
        kotlin.jvm.internal.l.e(codeChallengeMethod, "codeChallengeMethod");
        if (d(codeVerifier)) {
            if (codeChallengeMethod == a.PLAIN) {
                return codeVerifier;
            }
            try {
                byte[] bytes = codeVerifier.getBytes(ka.d.f12809f);
                kotlin.jvm.internal.l.d(bytes, "(this as java.lang.String).getBytes(charset)");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                kotlin.jvm.internal.l.d(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
                return encodeToString;
            } catch (Exception e10) {
                throw new p0.s(e10);
            }
        }
        throw new p0.s("Invalid Code Verifier.");
    }

    public static final String c() {
        int g10;
        List D;
        List E;
        List F;
        List F2;
        List F3;
        List F4;
        String z10;
        Object G;
        g10 = ha.i.g(new ha.f(43, 128), fa.c.f8872j);
        D = t9.x.D(new ha.c('a', 'z'), new ha.c('A', 'Z'));
        E = t9.x.E(D, new ha.c('0', '9'));
        F = t9.x.F(E, '-');
        F2 = t9.x.F(F, '.');
        F3 = t9.x.F(F2, '_');
        F4 = t9.x.F(F3, '~');
        ArrayList arrayList = new ArrayList(g10);
        for (int i10 = 0; i10 < g10; i10++) {
            G = t9.x.G(F4, fa.c.f8872j);
            arrayList.add(Character.valueOf(((Character) G).charValue()));
        }
        z10 = t9.x.z(arrayList, "", null, null, 0, null, null, 62, null);
        return z10;
    }

    public static final boolean d(String str) {
        if ((str == null || str.length() == 0) || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new ka.f("^[-._~A-Za-z0-9]+$").a(str);
    }
}
