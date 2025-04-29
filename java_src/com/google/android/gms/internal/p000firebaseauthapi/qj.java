package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qj  reason: invalid package */
/* loaded from: classes.dex */
public final class qj {

    /* renamed from: b  reason: collision with root package name */
    private static final qj f5262b = new qj();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f5263a = new AtomicReference(new kk(new gk(), null));

    qj() {
    }

    public static qj a() {
        return f5262b;
    }

    public final Class b(Class cls) {
        return ((kk) this.f5263a.get()).a(cls);
    }

    public final Object c(aa aaVar, Class cls) {
        return ((kk) this.f5263a.get()).b(aaVar, cls);
    }

    public final Object d(bb bbVar, Class cls) {
        return ((kk) this.f5263a.get()).c(bbVar, cls);
    }

    public final synchronized void e(ek ekVar) {
        gk gkVar = new gk((kk) this.f5263a.get());
        gkVar.a(ekVar);
        this.f5263a.set(new kk(gkVar, null));
    }

    public final synchronized void f(cb cbVar) {
        gk gkVar = new gk((kk) this.f5263a.get());
        gkVar.b(cbVar);
        this.f5263a.set(new kk(gkVar, null));
    }
}
