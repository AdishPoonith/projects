package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.he  reason: invalid package */
/* loaded from: classes.dex */
public final class he extends mb {

    /* renamed from: a  reason: collision with root package name */
    private final int f4687a;

    /* renamed from: b  reason: collision with root package name */
    private final fe f4688b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ he(int i10, fe feVar, ge geVar) {
        this.f4687a = i10;
        this.f4688b = feVar;
    }

    public final int a() {
        return this.f4687a;
    }

    public final fe b() {
        return this.f4688b;
    }

    public final boolean c() {
        return this.f4688b != fe.f4581d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof he) {
            he heVar = (he) obj;
            return heVar.f4687a == this.f4687a && heVar.f4688b == this.f4688b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{he.class, Integer.valueOf(this.f4687a), this.f4688b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4688b);
        int i10 = this.f4687a;
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + i10 + "-byte key)";
    }
}
