package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ha  reason: invalid package */
/* loaded from: classes.dex */
final class ha {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f4679b = Logger.getLogger(ha.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap f4680a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ha() {
        this.f4680a = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ha(ha haVar) {
        this.f4680a = new ConcurrentHashMap(haVar.f4680a);
    }

    private final synchronized ga f(String str) {
        if (!this.f4680a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (ga) this.f4680a.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        r6.f4680a.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void g(com.google.android.gms.internal.p000firebaseauthapi.ga r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.firebase-auth-api.ba r0 = r7.zzb()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.zze()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.ConcurrentMap r1 = r6.f4680a     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.firebase-auth-api.ga r1 = (com.google.android.gms.internal.p000firebaseauthapi.ga) r1     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L5b
            java.lang.Class r2 = r1.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r3 = r7.zzc()     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L22
            goto L5b
        L22:
            java.lang.String r8 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r8 = r8.concat(r0)     // Catch: java.lang.Throwable -> L6b
            java.util.logging.Logger r2 = com.google.android.gms.internal.p000firebaseauthapi.ha.f4679b     // Catch: java.lang.Throwable -> L6b
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "com.google.crypto.tink.KeyManagerRegistry"
            java.lang.String r5 = "registerKeyManagerContainer"
            r2.logp(r3, r4, r5, r8)     // Catch: java.lang.Throwable -> L6b
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L6b
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L6b
            r0 = 1
            java.lang.Class r1 = r1.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r1     // Catch: java.lang.Throwable -> L6b
            r0 = 2
            java.lang.Class r7 = r7.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r7     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r7 = java.lang.String.format(r7, r2)     // Catch: java.lang.Throwable -> L6b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L6b
            throw r8     // Catch: java.lang.Throwable -> L6b
        L5b:
            if (r8 != 0) goto L64
            java.util.concurrent.ConcurrentMap r8 = r6.f4680a     // Catch: java.lang.Throwable -> L6b
            r8.putIfAbsent(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L64:
            java.util.concurrent.ConcurrentMap r8 = r6.f4680a     // Catch: java.lang.Throwable -> L6b
            r8.put(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L6b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.ha.g(com.google.android.gms.internal.firebase-auth-api.ga, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ba a(String str, Class cls) {
        ga f10 = f(str);
        if (f10.zze().contains(cls)) {
            return f10.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(f10.zzc());
        Set<Class> zze = f10.zze();
        StringBuilder sb = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : zze) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z10 = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ba b(String str) {
        return f(str).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(lk lkVar, hj hjVar) {
        Class zzd;
        if (!eg.a(1)) {
            String valueOf = String.valueOf(lkVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (!eg.a(hjVar.f())) {
            String valueOf2 = String.valueOf(hjVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        } else {
            String d10 = lkVar.d();
            String d11 = hjVar.d();
            if (this.f4680a.containsKey(d10) && ((ga) this.f4680a.get(d10)).zzd() != null && (zzd = ((ga) this.f4680a.get(d10)).zzd()) != null && !zzd.getName().equals(hjVar.getClass().getName())) {
                Logger logger = f4679b;
                Level level = Level.WARNING;
                logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d10 + " with inconsistent public key type " + d11);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", lkVar.getClass().getName(), zzd.getName(), hjVar.getClass().getName()));
            }
            g(new fa(lkVar, hjVar), true);
            g(new ea(hjVar), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(hj hjVar) {
        if (!eg.a(hjVar.f())) {
            String valueOf = String.valueOf(hjVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
        g(new ea(hjVar), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(String str) {
        return this.f4680a.containsKey(str);
    }
}
