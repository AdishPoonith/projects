package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gn  reason: invalid package */
/* loaded from: classes.dex */
public final class gn {

    /* renamed from: a  reason: collision with root package name */
    private final ia f4653a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4654b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4655c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4656d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ gn(ia iaVar, int i10, String str, String str2, fn fnVar) {
        this.f4653a = iaVar;
        this.f4654b = i10;
        this.f4655c = str;
        this.f4656d = str2;
    }

    public final int a() {
        return this.f4654b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gn) {
            gn gnVar = (gn) obj;
            return this.f4653a == gnVar.f4653a && this.f4654b == gnVar.f4654b && this.f4655c.equals(gnVar.f4655c) && this.f4656d.equals(gnVar.f4656d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4653a, Integer.valueOf(this.f4654b), this.f4655c, this.f4656d});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f4653a, Integer.valueOf(this.f4654b), this.f4655c, this.f4656d);
    }
}
