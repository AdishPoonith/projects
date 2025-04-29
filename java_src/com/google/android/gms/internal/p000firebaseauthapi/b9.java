package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b9  reason: invalid package */
/* loaded from: classes.dex */
final class b9 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4385a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f4386b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4387c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b9(Object obj, Object obj2, Object obj3) {
        this.f4385a = obj;
        this.f4386b = obj2;
        this.f4387c = obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final IllegalArgumentException a() {
        String valueOf = String.valueOf(this.f4385a);
        String valueOf2 = String.valueOf(this.f4386b);
        String valueOf3 = String.valueOf(this.f4385a);
        String valueOf4 = String.valueOf(this.f4387c);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + "=" + valueOf2 + " and " + valueOf3 + "=" + valueOf4);
    }
}
