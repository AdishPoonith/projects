package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rg  reason: invalid package */
/* loaded from: classes.dex */
public final class rg extends ah {

    /* renamed from: a  reason: collision with root package name */
    private final int f5291a;

    /* renamed from: b  reason: collision with root package name */
    private final pg f5292b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ rg(int i10, pg pgVar, qg qgVar) {
        this.f5291a = i10;
        this.f5292b = pgVar;
    }

    public final int a() {
        return this.f5291a;
    }

    public final pg b() {
        return this.f5292b;
    }

    public final boolean c() {
        return this.f5292b != pg.f5188d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rg) {
            rg rgVar = (rg) obj;
            return rgVar.f5291a == this.f5291a && rgVar.f5292b == this.f5292b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{rg.class, Integer.valueOf(this.f5291a), this.f5292b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5292b);
        int i10 = this.f5291a;
        return "AesSiv Parameters (variant: " + valueOf + ", " + i10 + "-byte key)";
    }
}
