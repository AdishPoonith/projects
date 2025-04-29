package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class p4 extends AbstractList implements RandomAccess, o2 {

    /* renamed from: j  reason: collision with root package name */
    private final o2 f4211j;

    public p4(o2 o2Var) {
        this.f4211j = o2Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((n2) this.f4211j).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new o4(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new n4(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4211j.size();
    }

    @Override // com.google.android.gms.internal.auth.o2
    public final o2 zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.auth.o2
    public final List zzg() {
        return this.f4211j.zzg();
    }
}
