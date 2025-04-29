package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.li  reason: invalid package */
/* loaded from: classes.dex */
public final class li {

    /* renamed from: a  reason: collision with root package name */
    private final s9 f4956a;

    /* renamed from: b  reason: collision with root package name */
    private final x9 f4957b;

    public li(s9 s9Var) {
        this.f4956a = s9Var;
        this.f4957b = null;
    }

    public li(x9 x9Var) {
        this.f4956a = null;
        this.f4957b = x9Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        s9 s9Var = this.f4956a;
        return s9Var != null ? s9Var.a(bArr, bArr2) : this.f4957b.a(bArr, bArr2);
    }
}
