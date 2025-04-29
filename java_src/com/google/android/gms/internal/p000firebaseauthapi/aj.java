package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.aj  reason: invalid package */
/* loaded from: classes.dex */
public abstract class aj {

    /* renamed from: a  reason: collision with root package name */
    private final gv f4350a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f4351b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ aj(gv gvVar, Class cls, zi ziVar) {
        this.f4350a = gvVar;
        this.f4351b = cls;
    }

    public static aj b(yi yiVar, gv gvVar, Class cls) {
        return new wi(gvVar, cls, yiVar);
    }

    public abstract aa a(ok okVar, hb hbVar);

    public final gv c() {
        return this.f4350a;
    }

    public final Class d() {
        return this.f4351b;
    }
}
