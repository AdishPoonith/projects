package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pd  reason: invalid package */
/* loaded from: classes.dex */
public final class pd extends mb {

    /* renamed from: a  reason: collision with root package name */
    private final int f5180a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5181b = 12;

    /* renamed from: c  reason: collision with root package name */
    private final int f5182c = 16;

    /* renamed from: d  reason: collision with root package name */
    private final nd f5183d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ pd(int i10, int i11, int i12, nd ndVar, od odVar) {
        this.f5180a = i10;
        this.f5183d = ndVar;
    }

    public final int a() {
        return this.f5180a;
    }

    public final nd b() {
        return this.f5183d;
    }

    public final boolean c() {
        return this.f5183d != nd.f5067d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pd) {
            pd pdVar = (pd) obj;
            return pdVar.f5180a == this.f5180a && pdVar.f5183d == this.f5183d;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{pd.class, Integer.valueOf(this.f5180a), 12, 16, this.f5183d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5183d);
        int i10 = this.f5180a;
        return "AesGcm Parameters (variant: " + valueOf + ", 12-byte IV, 16-byte tag, and " + i10 + "-byte key)";
    }
}
