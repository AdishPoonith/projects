package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pj  reason: invalid package */
/* loaded from: classes.dex */
public final class pj {

    /* renamed from: b  reason: collision with root package name */
    private static final pj f5198b = new pj();

    /* renamed from: c  reason: collision with root package name */
    private static final oj f5199c = new oj(null);

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f5200a = new AtomicReference();

    public static pj a() {
        return f5198b;
    }

    public final dn b() {
        dn dnVar = (dn) this.f5200a.get();
        return dnVar == null ? f5199c : dnVar;
    }
}
