package w7;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
class f implements a {

    /* renamed from: a  reason: collision with root package name */
    protected final String f20018a = c();

    /* renamed from: b  reason: collision with root package name */
    protected final Context f20019b;

    public f(Context context) {
        this.f20019b = context;
        e(context);
    }

    private void d(Context context) {
        Locale locale = Locale.getDefault();
        try {
            l(Locale.ENGLISH);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 25);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(Build.VERSION.SDK_INT < 23 ? k(context, calendar, calendar2) : j(context, calendar, calendar2));
            keyPairGenerator.generateKeyPair();
        } finally {
            l(locale);
        }
    }

    private void e(Context context) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(this.f20018a, null) == null) {
            d(context);
        }
    }

    private PrivateKey g() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(this.f20018a, null);
        if (key != null) {
            if (key instanceof PrivateKey) {
                return (PrivateKey) key;
            }
            throw new Exception("Not an instance of a PrivateKey");
        }
        throw new Exception("No key found under alias: " + this.f20018a);
    }

    private PublicKey h() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Certificate certificate = keyStore.getCertificate(this.f20018a);
        if (certificate == null) {
            throw new Exception("No certificate found under alias: " + this.f20018a);
        }
        PublicKey publicKey = certificate.getPublicKey();
        if (publicKey != null) {
            return publicKey;
        }
        throw new Exception("No key found under alias: " + this.f20018a);
    }

    private AlgorithmParameterSpec k(Context context, Calendar calendar, Calendar calendar2) {
        KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(context).setAlias(this.f20018a);
        return alias.setSubject(new X500Principal("CN=" + this.f20018a)).setSerialNumber(BigInteger.valueOf(1L)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
    }

    private void l(Locale locale) {
        Locale.setDefault(locale);
        Configuration configuration = this.f20019b.getResources().getConfiguration();
        configuration.setLocale(locale);
        this.f20019b.createConfigurationContext(configuration);
    }

    @Override // w7.a
    public byte[] a(Key key) {
        PublicKey h10 = h();
        Cipher i10 = i();
        i10.init(3, h10, f());
        return i10.wrap(key);
    }

    @Override // w7.a
    public Key b(byte[] bArr, String str) {
        PrivateKey g10 = g();
        Cipher i10 = i();
        i10.init(4, g10, f());
        return i10.unwrap(bArr, str, 3);
    }

    protected String c() {
        return this.f20019b.getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    protected AlgorithmParameterSpec f() {
        return null;
    }

    protected Cipher i() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", Build.VERSION.SDK_INT < 23 ? "AndroidOpenSSL" : "AndroidKeyStoreBCWorkaround");
    }

    protected AlgorithmParameterSpec j(Context context, Calendar calendar, Calendar calendar2) {
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(this.f20018a, 3);
        return builder.setCertificateSubject(new X500Principal("CN=" + this.f20018a)).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}
