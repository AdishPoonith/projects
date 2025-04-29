package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d5  reason: invalid package */
/* loaded from: classes.dex */
final class d5 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4484a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4485b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d5(Object obj, int i10) {
        this.f4484a = obj;
        this.f4485b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d5) {
            d5 d5Var = (d5) obj;
            return this.f4484a == d5Var.f4484a && this.f4485b == d5Var.f4485b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f4484a) * 65535) + this.f4485b;
    }
}
