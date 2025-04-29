package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fg  reason: invalid package */
/* loaded from: classes.dex */
public final class fg {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4583a = Logger.getLogger(fg.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f4584b = new AtomicBoolean(false);

    private fg() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f4583a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return f4584b.get();
    }
}
