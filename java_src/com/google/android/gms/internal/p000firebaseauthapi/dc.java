package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dc  reason: invalid package */
/* loaded from: classes.dex */
public final class dc extends mb {

    /* renamed from: a  reason: collision with root package name */
    private final int f4491a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4492b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4493c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4494d;

    /* renamed from: e  reason: collision with root package name */
    private final bc f4495e;

    /* renamed from: f  reason: collision with root package name */
    private final ac f4496f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ dc(int i10, int i11, int i12, int i13, bc bcVar, ac acVar, cc ccVar) {
        this.f4491a = i10;
        this.f4492b = i11;
        this.f4493c = i12;
        this.f4494d = i13;
        this.f4495e = bcVar;
        this.f4496f = acVar;
    }

    public final int a() {
        return this.f4491a;
    }

    public final int b() {
        return this.f4492b;
    }

    public final bc c() {
        return this.f4495e;
    }

    public final boolean d() {
        return this.f4495e != bc.f4395d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dc) {
            dc dcVar = (dc) obj;
            return dcVar.f4491a == this.f4491a && dcVar.f4492b == this.f4492b && dcVar.f4493c == this.f4493c && dcVar.f4494d == this.f4494d && dcVar.f4495e == this.f4495e && dcVar.f4496f == this.f4496f;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{dc.class, Integer.valueOf(this.f4491a), Integer.valueOf(this.f4492b), Integer.valueOf(this.f4493c), Integer.valueOf(this.f4494d), this.f4495e, this.f4496f});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4495e);
        String valueOf2 = String.valueOf(this.f4496f);
        int i10 = this.f4493c;
        int i11 = this.f4494d;
        int i12 = this.f4491a;
        int i13 = this.f4492b;
        return "AesCtrHmacAead Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i10 + "-byte IV, and " + i11 + "-byte tags, and " + i12 + "-byte AES key, and " + i13 + "-byte HMAC key)";
    }
}
