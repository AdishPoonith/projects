package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lf  reason: invalid package */
/* loaded from: classes.dex */
public final class lf extends mb {

    /* renamed from: a  reason: collision with root package name */
    private final kf f4952a;

    private lf(kf kfVar) {
        this.f4952a = kfVar;
    }

    public static lf b(kf kfVar) {
        return new lf(kfVar);
    }

    public final kf a() {
        return this.f4952a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lf) && ((lf) obj).f4952a == this.f4952a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{lf.class, this.f4952a});
    }

    public final String toString() {
        String obj = this.f4952a.toString();
        return "XChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }
}
