package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vk  reason: invalid package */
/* loaded from: classes.dex */
public final class vk {

    /* renamed from: a  reason: collision with root package name */
    private final Map f5543a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f5544b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f5545c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f5546d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ vk(pk pkVar, uk ukVar) {
        this.f5543a = new HashMap(pk.f(pkVar));
        this.f5544b = new HashMap(pk.e(pkVar));
        this.f5545c = new HashMap(pk.h(pkVar));
        this.f5546d = new HashMap(pk.g(pkVar));
    }

    public final aa a(ok okVar, hb hbVar) {
        rk rkVar = new rk(okVar.getClass(), okVar.zzd(), null);
        if (this.f5544b.containsKey(rkVar)) {
            return ((aj) this.f5544b.get(rkVar)).a(okVar, hbVar);
        }
        String obj = rkVar.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }

    public final boolean f(ok okVar) {
        return this.f5544b.containsKey(new rk(okVar.getClass(), okVar.zzd(), null));
    }
}
