package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ll  reason: invalid package */
/* loaded from: classes.dex */
public final class ll extends rm {

    /* renamed from: a  reason: collision with root package name */
    private final int f4959a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4960b;

    /* renamed from: c  reason: collision with root package name */
    private final jl f4961c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ll(int i10, int i11, jl jlVar, kl klVar) {
        this.f4959a = i10;
        this.f4960b = i11;
        this.f4961c = jlVar;
    }

    public final int a() {
        return this.f4959a;
    }

    public final int b() {
        jl jlVar = this.f4961c;
        if (jlVar == jl.f4826e) {
            return this.f4960b;
        }
        if (jlVar == jl.f4823b || jlVar == jl.f4824c || jlVar == jl.f4825d) {
            return this.f4960b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final jl c() {
        return this.f4961c;
    }

    public final boolean d() {
        return this.f4961c != jl.f4826e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ll) {
            ll llVar = (ll) obj;
            return llVar.f4959a == this.f4959a && llVar.b() == b() && llVar.f4961c == this.f4961c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{ll.class, Integer.valueOf(this.f4959a), Integer.valueOf(this.f4960b), this.f4961c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4961c);
        int i10 = this.f4960b;
        int i11 = this.f4959a;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i10 + "-byte tags, and " + i11 + "-byte key)";
    }
}
