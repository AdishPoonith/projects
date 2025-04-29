package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c6  reason: invalid package */
/* loaded from: classes.dex */
public final class c6 extends w3 implements RandomAccess, d6 {

    /* renamed from: l  reason: collision with root package name */
    private static final c6 f4437l;
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    public static final d6 f4438m;

    /* renamed from: k  reason: collision with root package name */
    private final List f4439k;

    static {
        c6 c6Var = new c6(false);
        f4437l = c6Var;
        f4438m = c6Var;
    }

    public c6() {
        this(10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.f4439k = arrayList;
    }

    private c6(ArrayList arrayList) {
        super(true);
        this.f4439k = arrayList;
    }

    private c6(boolean z10) {
        super(false);
        this.f4439k = Collections.emptyList();
    }

    private static String k(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof m4 ? ((m4) obj).x(x5.f5626b) : x5.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        b();
        this.f4439k.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof d6) {
            collection = ((d6) collection).zzh();
        }
        boolean addAll = this.f4439k.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f4439k.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i10) {
        Object obj = this.f4439k.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof m4) {
            m4 m4Var = (m4) obj;
            String x10 = m4Var.x(x5.f5626b);
            if (m4Var.t()) {
                this.f4439k.set(i10, x10);
            }
            return x10;
        }
        byte[] bArr = (byte[]) obj;
        String d10 = x5.d(bArr);
        if (t8.e(bArr)) {
            this.f4439k.set(i10, d10);
        }
        return d10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d6
    public final void n(m4 m4Var) {
        b();
        this.f4439k.add(m4Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        Object remove = this.f4439k.remove(i10);
        ((AbstractList) this).modCount++;
        return k(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        b();
        return k(this.f4439k.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4439k.size();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final /* bridge */ /* synthetic */ w5 zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f4439k);
            return new c6(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d6
    public final d6 zze() {
        return zzc() ? new j8(this) : this;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d6
    public final Object zzf(int i10) {
        return this.f4439k.get(i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d6
    public final List zzh() {
        return Collections.unmodifiableList(this.f4439k);
    }
}
