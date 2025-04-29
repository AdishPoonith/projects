package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ListIterator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g8  reason: invalid package */
/* loaded from: classes.dex */
final class g8 implements ListIterator {

    /* renamed from: j  reason: collision with root package name */
    final ListIterator f4610j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ int f4611k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ j8 f4612l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g8(j8 j8Var, int i10) {
        d6 d6Var;
        this.f4612l = j8Var;
        this.f4611k = i10;
        d6Var = j8Var.f4804j;
        this.f4610j = d6Var.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4610j.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4610j.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f4610j.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4610j.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f4610j.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4610j.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
