package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dv  reason: invalid package */
/* loaded from: classes.dex */
public final class dv {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f4509a = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f4510b = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    public static String a(String str, String str2) {
        if (str2.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return str2.substring(19);
        }
        throw new IllegalArgumentException(String.format("key URI must start with %s", "android-keystore://"));
    }

    public static void b(int i10) {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
    }

    public static void c(int i10, int i11) {
        if (i10 < 0 || i10 > 0) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(i10), 0));
        }
    }
}
