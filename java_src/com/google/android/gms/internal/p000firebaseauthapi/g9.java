package com.google.android.gms.internal.p000firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g9  reason: invalid package */
/* loaded from: classes.dex */
public final class g9 extends a9 {

    /* renamed from: o  reason: collision with root package name */
    static final a9 f4613o = new g9(new Object[0], 0);

    /* renamed from: m  reason: collision with root package name */
    final transient Object[] f4614m;

    /* renamed from: n  reason: collision with root package name */
    private final transient int f4615n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g9(Object[] objArr, int i10) {
        this.f4614m = objArr;
        this.f4615n = i10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a9, com.google.android.gms.internal.p000firebaseauthapi.h7
    final int b(Object[] objArr, int i10) {
        System.arraycopy(this.f4614m, 0, objArr, 0, this.f4615n);
        return this.f4615n;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h7
    final int e() {
        return this.f4615n;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ht.a(i10, this.f4615n, "index");
        Object obj = this.f4614m[i10];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.h7
    public final int k() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.h7
    public final Object[] l() {
        return this.f4614m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4615n;
    }
}
