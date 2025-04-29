package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k9  reason: invalid package */
/* loaded from: classes.dex */
final class k9 extends a9 {

    /* renamed from: m  reason: collision with root package name */
    private final transient Object[] f4875m;

    /* renamed from: n  reason: collision with root package name */
    private final transient int f4876n;

    /* renamed from: o  reason: collision with root package name */
    private final transient int f4877o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k9(Object[] objArr, int i10, int i11) {
        this.f4875m = objArr;
        this.f4876n = i10;
        this.f4877o = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ht.a(i10, this.f4877o, "index");
        Object obj = this.f4875m[i10 + i10 + this.f4876n];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4877o;
    }
}
