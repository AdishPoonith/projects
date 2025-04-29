package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import java.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gv  reason: invalid package */
/* loaded from: classes.dex */
public final class gv {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f4661a;

    private gv(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f4661a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static gv b(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new gv(bArr, 0, bArr.length);
    }

    public final int a() {
        return this.f4661a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.f4661a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gv) {
            return Arrays.equals(((gv) obj).f4661a, this.f4661a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4661a);
    }

    public final String toString() {
        String a10 = uu.a(this.f4661a);
        return "Bytes(" + a10 + ")";
    }
}
