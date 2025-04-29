package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class j0 extends c<String> implements k0, RandomAccess {

    /* renamed from: l  reason: collision with root package name */
    private static final j0 f7212l;

    /* renamed from: m  reason: collision with root package name */
    public static final k0 f7213m;

    /* renamed from: k  reason: collision with root package name */
    private final List<Object> f7214k;

    static {
        j0 j0Var = new j0();
        f7212l = j0Var;
        j0Var.a();
        f7213m = j0Var;
    }

    public j0() {
        this(10);
    }

    public j0(int i10) {
        this(new ArrayList(i10));
    }

    private j0(ArrayList<Object> arrayList) {
        this.f7214k = arrayList;
    }

    private static String k(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof i ? ((i) obj).P() : d0.j((byte[]) obj);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        b();
        if (collection instanceof k0) {
            collection = ((k0) collection).g();
        }
        boolean addAll = this.f7214k.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f7214k.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.k0
    public k0 d() {
        return h() ? new y1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public void add(int i10, String str) {
        b();
        this.f7214k.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.protobuf.k0
    public Object f(int i10) {
        return this.f7214k.get(i10);
    }

    @Override // com.google.protobuf.k0
    public List<?> g() {
        return Collections.unmodifiableList(this.f7214k);
    }

    @Override // com.google.protobuf.c, com.google.protobuf.d0.i
    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.k0
    public void j(i iVar) {
        b();
        this.f7214k.add(iVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l */
    public String get(int i10) {
        Object obj = this.f7214k.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String P = iVar.P();
            if (iVar.C()) {
                this.f7214k.set(i10, P);
            }
            return P;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = d0.j(bArr);
        if (d0.g(bArr)) {
            this.f7214k.set(i10, j10);
        }
        return j10;
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: m */
    public j0 c(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f7214k);
            return new j0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: p */
    public String remove(int i10) {
        b();
        Object remove = this.f7214k.remove(i10);
        ((AbstractList) this).modCount++;
        return k(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q */
    public String set(int i10, String str) {
        b();
        return k(this.f7214k.set(i10, str));
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7214k.size();
    }
}
