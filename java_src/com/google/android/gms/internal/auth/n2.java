package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class n2 extends b1 implements RandomAccess, o2 {

    /* renamed from: l  reason: collision with root package name */
    private static final n2 f4192l;

    /* renamed from: m  reason: collision with root package name */
    public static final o2 f4193m;

    /* renamed from: k  reason: collision with root package name */
    private final List f4194k;

    static {
        n2 n2Var = new n2(10);
        f4192l = n2Var;
        n2Var.zzb();
        f4193m = n2Var;
    }

    public n2() {
        this(10);
    }

    public n2(int i10) {
        this.f4194k = new ArrayList(i10);
    }

    private n2(ArrayList arrayList) {
        this.f4194k = arrayList;
    }

    private static String k(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof q1 ? ((q1) obj).v(k2.f4144b) : k2.h((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        b();
        this.f4194k.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof o2) {
            collection = ((o2) collection).zzg();
        }
        boolean addAll = this.f4194k.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f4194k.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i10) {
        Object obj = this.f4194k.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            String v10 = q1Var.v(k2.f4144b);
            if (q1Var.q()) {
                this.f4194k.set(i10, v10);
            }
            return v10;
        }
        byte[] bArr = (byte[]) obj;
        String h10 = k2.h(bArr);
        if (k2.i(bArr)) {
            this.f4194k.set(i10, h10);
        }
        return h10;
    }

    @Override // com.google.android.gms.internal.auth.b1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        Object remove = this.f4194k.remove(i10);
        ((AbstractList) this).modCount++;
        return k(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        b();
        return k(this.f4194k.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4194k.size();
    }

    @Override // com.google.android.gms.internal.auth.j2
    public final /* bridge */ /* synthetic */ j2 zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f4194k);
            return new n2(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.auth.o2
    public final o2 zze() {
        return zzc() ? new p4(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.o2
    public final List zzg() {
        return Collections.unmodifiableList(this.f4194k);
    }
}
