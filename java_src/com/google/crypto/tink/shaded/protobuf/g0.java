package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class g0 extends c<String> implements h0, RandomAccess {

    /* renamed from: l  reason: collision with root package name */
    private static final g0 f6187l;

    /* renamed from: m  reason: collision with root package name */
    public static final h0 f6188m;

    /* renamed from: k  reason: collision with root package name */
    private final List<Object> f6189k;

    static {
        g0 g0Var = new g0();
        f6187l = g0Var;
        g0Var.a();
        f6188m = g0Var;
    }

    public g0() {
        this(10);
    }

    public g0(int i10) {
        this(new ArrayList(i10));
    }

    private g0(ArrayList<Object> arrayList) {
        this.f6189k = arrayList;
    }

    private static String k(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof i ? ((i) obj).E() : b0.j((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        b();
        if (collection instanceof h0) {
            collection = ((h0) collection).g();
        }
        boolean addAll = this.f6189k.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f6189k.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public h0 d() {
        return h() ? new r1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public void add(int i10, String str) {
        b();
        this.f6189k.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Object f(int i10) {
        return this.f6189k.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public List<?> g() {
        return Collections.unmodifiableList(this.f6189k);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, com.google.crypto.tink.shaded.protobuf.b0.i
    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l */
    public String get(int i10) {
        Object obj = this.f6189k.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String E = iVar.E();
            if (iVar.t()) {
                this.f6189k.set(i10, E);
            }
            return E;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = b0.j(bArr);
        if (b0.g(bArr)) {
            this.f6189k.set(i10, j10);
        }
        return j10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.i
    /* renamed from: m */
    public g0 c(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f6189k);
            return new g0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public void o(i iVar) {
        b();
        this.f6189k.add(iVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: p */
    public String remove(int i10) {
        b();
        Object remove = this.f6189k.remove(i10);
        ((AbstractList) this).modCount++;
        return k(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q */
    public String set(int i10, String str) {
        b();
        return k(this.f6189k.set(i10, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6189k.size();
    }
}
