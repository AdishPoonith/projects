package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ek  reason: invalid package */
/* loaded from: classes.dex */
public abstract class ek {

    /* renamed from: a  reason: collision with root package name */
    private final Class f4551a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f4552b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ek(Class cls, Class cls2, dk dkVar) {
        this.f4551a = cls;
        this.f4552b = cls2;
    }

    public static ek b(ck ckVar, Class cls, Class cls2) {
        return new bk(cls, cls2, ckVar);
    }

    public abstract Object a(aa aaVar);

    public final Class c() {
        return this.f4551a;
    }

    public final Class d() {
        return this.f4552b;
    }
}
