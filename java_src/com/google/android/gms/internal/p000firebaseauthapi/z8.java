package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z8  reason: invalid package */
/* loaded from: classes.dex */
public final class z8 extends a9 {

    /* renamed from: m  reason: collision with root package name */
    final transient int f5774m;

    /* renamed from: n  reason: collision with root package name */
    final transient int f5775n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ a9 f5776o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z8(a9 a9Var, int i10, int i11) {
        this.f5776o = a9Var;
        this.f5774m = i10;
        this.f5775n = i11;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h7
    final int e() {
        return this.f5776o.k() + this.f5774m + this.f5775n;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ht.a(i10, this.f5775n, "index");
        return this.f5776o.get(i10 + this.f5774m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.h7
    public final int k() {
        return this.f5776o.k() + this.f5774m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.h7
    public final Object[] l() {
        return this.f5776o.l();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a9
    public final a9 m(int i10, int i11) {
        ht.c(i10, i11, this.f5775n);
        a9 a9Var = this.f5776o;
        int i12 = this.f5774m;
        return a9Var.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5775n;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a9, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
