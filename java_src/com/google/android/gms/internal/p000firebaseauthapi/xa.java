package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xa  reason: invalid package */
/* loaded from: classes.dex */
public final class xa {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5638a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f5639b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f5640c;

    /* renamed from: d  reason: collision with root package name */
    private final ct f5641d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5642e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5643f;

    /* renamed from: g  reason: collision with root package name */
    private final aa f5644g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5645h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xa(Object obj, Object obj2, byte[] bArr, int i10, ct ctVar, int i11, String str, aa aaVar) {
        this.f5638a = obj;
        this.f5639b = obj2;
        this.f5640c = Arrays.copyOf(bArr, bArr.length);
        this.f5645h = i10;
        this.f5641d = ctVar;
        this.f5642e = i11;
        this.f5643f = str;
        this.f5644g = aaVar;
    }

    public final int a() {
        return this.f5642e;
    }

    public final aa b() {
        return this.f5644g;
    }

    public final ct c() {
        return this.f5641d;
    }

    public final Object d() {
        return this.f5638a;
    }

    public final Object e() {
        return this.f5639b;
    }

    public final String f() {
        return this.f5643f;
    }

    public final byte[] g() {
        byte[] bArr = this.f5640c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int h() {
        return this.f5645h;
    }
}
