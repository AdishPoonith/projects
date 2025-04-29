package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j8  reason: invalid package */
/* loaded from: classes.dex */
public final class j8 extends AbstractList implements RandomAccess, d6 {

    /* renamed from: j  reason: collision with root package name */
    private final d6 f4804j;

    public j8(d6 d6Var) {
        this.f4804j = d6Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((c6) this.f4804j).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new h8(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new g8(this, i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d6
    public final void n(m4 m4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4804j.size();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d6
    public final d6 zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d6
    public final Object zzf(int i10) {
        return this.f4804j.zzf(i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d6
    public final List zzh() {
        return this.f4804j.zzh();
    }
}
