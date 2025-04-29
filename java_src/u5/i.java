package u5;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import u5.j;
/* loaded from: classes.dex */
public final class i<T_WRAPPER extends j<T_ENGINE>, T_ENGINE> {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f19113b = Logger.getLogger(i.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final List<Provider> f19114c;

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f19115d;

    /* renamed from: e  reason: collision with root package name */
    public static final i<j.a, Cipher> f19116e;

    /* renamed from: f  reason: collision with root package name */
    public static final i<j.e, Mac> f19117f;

    /* renamed from: g  reason: collision with root package name */
    public static final i<j.g, Signature> f19118g;

    /* renamed from: h  reason: collision with root package name */
    public static final i<j.f, MessageDigest> f19119h;

    /* renamed from: i  reason: collision with root package name */
    public static final i<j.b, KeyAgreement> f19120i;

    /* renamed from: j  reason: collision with root package name */
    public static final i<j.d, KeyPairGenerator> f19121j;

    /* renamed from: k  reason: collision with root package name */
    public static final i<j.c, KeyFactory> f19122k;

    /* renamed from: a  reason: collision with root package name */
    private final T_WRAPPER f19123a;

    static {
        if (l5.b.c()) {
            f19114c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f19115d = false;
        } else {
            f19114c = q.b() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList<>();
            f19115d = true;
        }
        f19116e = new i<>(new j.a());
        f19117f = new i<>(new j.e());
        f19118g = new i<>(new j.g());
        f19119h = new i<>(new j.f());
        f19120i = new i<>(new j.b());
        f19121j = new i<>(new j.d());
        f19122k = new i<>(new j.c());
    }

    public i(T_WRAPPER t_wrapper) {
        this.f19123a = t_wrapper;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f19113b.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public T_ENGINE a(String str) {
        Exception exc = null;
        for (Provider provider : f19114c) {
            try {
                return (T_ENGINE) this.f19123a.a(str, provider);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        if (f19115d) {
            return (T_ENGINE) this.f19123a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
