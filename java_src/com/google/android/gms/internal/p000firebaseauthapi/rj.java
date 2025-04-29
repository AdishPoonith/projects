package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rj  reason: invalid package */
/* loaded from: classes.dex */
public final class rj {

    /* renamed from: b  reason: collision with root package name */
    private static final rj f5295b = new rj();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f5296a = new AtomicReference(new vk(new pk(), null));

    public static rj b() {
        return f5295b;
    }

    public final aa a(mk mkVar, hb hbVar) {
        if (((vk) this.f5296a.get()).f(mkVar)) {
            return ((vk) this.f5296a.get()).a(mkVar, hbVar);
        }
        try {
            return new jj(mkVar, hbVar);
        } catch (GeneralSecurityException e10) {
            throw new wk("Creating a LegacyProtoKey failed", e10);
        }
    }

    public final synchronized void c(aj ajVar) {
        pk pkVar = new pk((vk) this.f5296a.get());
        pkVar.a(ajVar);
        this.f5296a.set(new vk(pkVar, null));
    }

    public final synchronized void d(ej ejVar) {
        pk pkVar = new pk((vk) this.f5296a.get());
        pkVar.b(ejVar);
        this.f5296a.set(new vk(pkVar, null));
    }

    public final synchronized void e(vj vjVar) {
        pk pkVar = new pk((vk) this.f5296a.get());
        pkVar.c(vjVar);
        this.f5296a.set(new vk(pkVar, null));
    }

    public final synchronized void f(ak akVar) {
        pk pkVar = new pk((vk) this.f5296a.get());
        pkVar.d(akVar);
        this.f5296a.set(new vk(pkVar, null));
    }
}
