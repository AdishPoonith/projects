package com.google.android.gms.internal.auth;

import java.util.ListIterator;
/* loaded from: classes.dex */
final class n4 implements ListIterator {

    /* renamed from: j  reason: collision with root package name */
    final ListIterator f4197j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ int f4198k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ p4 f4199l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n4(p4 p4Var, int i10) {
        o2 o2Var;
        this.f4199l = p4Var;
        this.f4198k = i10;
        o2Var = p4Var.f4211j;
        this.f4197j = o2Var.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4197j.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4197j.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f4197j.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4197j.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f4197j.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4197j.previousIndex();
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
