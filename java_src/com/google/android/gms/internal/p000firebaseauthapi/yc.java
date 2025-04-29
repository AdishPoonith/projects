package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yc  reason: invalid package */
/* loaded from: classes.dex */
public final class yc extends mb {

    /* renamed from: a  reason: collision with root package name */
    private final int f5700a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5701b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5702c = 16;

    /* renamed from: d  reason: collision with root package name */
    private final wc f5703d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ yc(int i10, int i11, int i12, wc wcVar, xc xcVar) {
        this.f5700a = i10;
        this.f5701b = i11;
        this.f5703d = wcVar;
    }

    public final int a() {
        return this.f5700a;
    }

    public final wc b() {
        return this.f5703d;
    }

    public final boolean c() {
        return this.f5703d != wc.f5594d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yc) {
            yc ycVar = (yc) obj;
            return ycVar.f5700a == this.f5700a && ycVar.f5701b == this.f5701b && ycVar.f5703d == this.f5703d;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{yc.class, Integer.valueOf(this.f5700a), Integer.valueOf(this.f5701b), 16, this.f5703d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5703d);
        int i10 = this.f5701b;
        int i11 = this.f5700a;
        return "AesEax Parameters (variant: " + valueOf + ", " + i10 + "-byte IV, 16-byte tag, and " + i11 + "-byte key)";
    }
}
