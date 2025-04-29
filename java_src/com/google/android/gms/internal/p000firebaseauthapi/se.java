package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.se  reason: invalid package */
/* loaded from: classes.dex */
public final class se extends mb {

    /* renamed from: a  reason: collision with root package name */
    private final re f5344a;

    private se(re reVar) {
        this.f5344a = reVar;
    }

    public static se b(re reVar) {
        return new se(reVar);
    }

    public final re a() {
        return this.f5344a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof se) && ((se) obj).f5344a == this.f5344a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{se.class, this.f5344a});
    }

    public final String toString() {
        String obj = this.f5344a.toString();
        return "ChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }
}
