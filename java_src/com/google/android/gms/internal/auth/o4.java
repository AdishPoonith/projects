package com.google.android.gms.internal.auth;

import java.util.Iterator;
/* loaded from: classes.dex */
final class o4 implements Iterator {

    /* renamed from: j  reason: collision with root package name */
    final Iterator f4205j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ p4 f4206k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o4(p4 p4Var) {
        o2 o2Var;
        this.f4206k = p4Var;
        o2Var = p4Var.f4211j;
        this.f4205j = o2Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4205j.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f4205j.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
