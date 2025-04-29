package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2709a;

    /* renamed from: b  reason: collision with root package name */
    private final KeyGenParameterSpec f2710b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String f2711a;

        /* renamed from: b  reason: collision with root package name */
        KeyGenParameterSpec f2712b;

        /* renamed from: c  reason: collision with root package name */
        EnumC0052b f2713c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2714d;

        /* renamed from: e  reason: collision with root package name */
        int f2715e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2716f;

        /* renamed from: g  reason: collision with root package name */
        final Context f2717g;

        /* renamed from: androidx.security.crypto.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0049a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.security.crypto.b$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0050a {
                static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.security.crypto.b$a$a$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0051b {
                static void a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            static b a(a aVar) {
                EnumC0052b enumC0052b = aVar.f2713c;
                if (enumC0052b == null && aVar.f2712b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (enumC0052b == EnumC0052b.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(aVar.f2711a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (aVar.f2714d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            C0051b.a(keySize, aVar.f2715e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(aVar.f2715e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && aVar.f2716f && aVar.f2717g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0050a.a(keySize);
                    }
                    aVar.f2712b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = aVar.f2712b;
                Objects.requireNonNull(keyGenParameterSpec, "KeyGenParameterSpec was null after build() check");
                return new b(c.c(keyGenParameterSpec), aVar.f2712b);
            }

            static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public a(Context context, String str) {
            this.f2717g = context.getApplicationContext();
            this.f2711a = str;
        }

        public b a() {
            return Build.VERSION.SDK_INT >= 23 ? C0049a.a(this) : new b(this.f2711a, null);
        }

        public a b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f2713c == null) {
                if (this.f2711a.equals(C0049a.b(keyGenParameterSpec))) {
                    this.f2712b = keyGenParameterSpec;
                    return this;
                }
                throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f2711a + " vs " + C0049a.b(keyGenParameterSpec));
            }
            throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
        }
    }

    /* renamed from: androidx.security.crypto.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0052b {
        AES256_GCM
    }

    b(String str, Object obj) {
        this.f2709a = str;
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2710b = (KeyGenParameterSpec) obj;
        } else {
            this.f2710b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.f2709a;
    }

    public boolean b() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f2709a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f2709a + ", isKeyStoreBacked=" + b() + "}";
    }
}
