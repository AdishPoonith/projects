package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rk  reason: invalid package */
/* loaded from: classes.dex */
final class rk {

    /* renamed from: a  reason: collision with root package name */
    private final Class f5297a;

    /* renamed from: b  reason: collision with root package name */
    private final gv f5298b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ rk(Class cls, gv gvVar, qk qkVar) {
        this.f5297a = cls;
        this.f5298b = gvVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rk) {
            rk rkVar = (rk) obj;
            return rkVar.f5297a.equals(this.f5297a) && rkVar.f5298b.equals(this.f5298b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5297a, this.f5298b});
    }

    public final String toString() {
        String simpleName = this.f5297a.getSimpleName();
        String valueOf = String.valueOf(this.f5298b);
        return simpleName + ", object identifier: " + valueOf;
    }
}
