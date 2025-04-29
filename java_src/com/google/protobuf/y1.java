package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class y1 extends AbstractList<String> implements k0, RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    private final k0 f7398j;

    /* loaded from: classes.dex */
    class a implements ListIterator<String> {

        /* renamed from: j  reason: collision with root package name */
        ListIterator<String> f7399j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f7400k;

        a(int i10) {
            this.f7400k = i10;
            this.f7399j = y1.this.f7398j.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c */
        public String next() {
            return this.f7399j.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public String previous() {
            return this.f7399j.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f7399j.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f7399j.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f7399j.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f7399j.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    class b implements Iterator<String> {

        /* renamed from: j  reason: collision with root package name */
        Iterator<String> f7402j;

        b() {
            this.f7402j = y1.this.f7398j.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.f7402j.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7402j.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public y1(k0 k0Var) {
        this.f7398j = k0Var;
    }

    @Override // com.google.protobuf.k0
    public k0 d() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public String get(int i10) {
        return (String) this.f7398j.get(i10);
    }

    @Override // com.google.protobuf.k0
    public Object f(int i10) {
        return this.f7398j.f(i10);
    }

    @Override // com.google.protobuf.k0
    public List<?> g() {
        return this.f7398j.g();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // com.google.protobuf.k0
    public void j(i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7398j.size();
    }
}
