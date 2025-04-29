package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qi  reason: invalid package */
/* loaded from: classes.dex */
public final class qi implements ra {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f5259b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final String f5260c = "qi";

    /* renamed from: a  reason: collision with root package name */
    private KeyStore f5261a;

    public qi() {
        if (Build.VERSION.SDK_INT < 23) {
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f5261a = keyStore;
        } catch (IOException | GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(String str) {
        qi qiVar = new qi();
        synchronized (f5259b) {
            if (qiVar.c(str)) {
                return false;
            }
            String a10 = dv.a("android-keystore://", str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(a10, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return true;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ra
    public final synchronized boolean a(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    final synchronized boolean c(String str) {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w(f5260c, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f5261a = keyStore;
                keyStore.load(null);
                return this.f5261a.containsAlias(str2);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        return this.f5261a.containsAlias(dv.a("android-keystore://", str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ra
    public final synchronized s9 zza(String str) {
        pi piVar;
        piVar = new pi(dv.a("android-keystore://", str), this.f5261a);
        byte[] a10 = bv.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a10, piVar.a(piVar.b(a10, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return piVar;
    }
}
