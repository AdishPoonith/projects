package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h9  reason: invalid package */
/* loaded from: classes.dex */
final class h9 extends a9 {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ i9 f4678m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h9(i9 i9Var) {
        this.f4678m = i9Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.f4678m.f4737n;
        ht.a(i10, i11, "index");
        i9 i9Var = this.f4678m;
        objArr = i9Var.f4736m;
        int i12 = i10 + i10;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = i9Var.f4736m;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.f4678m.f4737n;
        return i10;
    }
}
