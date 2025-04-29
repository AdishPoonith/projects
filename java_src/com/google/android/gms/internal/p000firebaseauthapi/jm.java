package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jm  reason: invalid package */
/* loaded from: classes.dex */
public final class jm extends rm {

    /* renamed from: a  reason: collision with root package name */
    private final int f4828a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4829b;

    /* renamed from: c  reason: collision with root package name */
    private final hm f4830c;

    /* renamed from: d  reason: collision with root package name */
    private final gm f4831d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ jm(int i10, int i11, hm hmVar, gm gmVar, im imVar) {
        this.f4828a = i10;
        this.f4829b = i11;
        this.f4830c = hmVar;
        this.f4831d = gmVar;
    }

    public final int a() {
        return this.f4828a;
    }

    public final int b() {
        hm hmVar = this.f4830c;
        if (hmVar == hm.f4700e) {
            return this.f4829b;
        }
        if (hmVar == hm.f4697b || hmVar == hm.f4698c || hmVar == hm.f4699d) {
            return this.f4829b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final hm c() {
        return this.f4830c;
    }

    public final boolean d() {
        return this.f4830c != hm.f4700e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jm) {
            jm jmVar = (jm) obj;
            return jmVar.f4828a == this.f4828a && jmVar.b() == b() && jmVar.f4830c == this.f4830c && jmVar.f4831d == this.f4831d;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{jm.class, Integer.valueOf(this.f4828a), Integer.valueOf(this.f4829b), this.f4830c, this.f4831d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4830c);
        String valueOf2 = String.valueOf(this.f4831d);
        int i10 = this.f4829b;
        int i11 = this.f4828a;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i10 + "-byte tags, and " + i11 + "-byte key)";
    }
}
