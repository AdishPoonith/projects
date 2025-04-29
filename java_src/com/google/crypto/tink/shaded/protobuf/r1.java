package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class r1 extends AbstractList<String> implements h0, RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    private final h0 f6292j;

    /* loaded from: classes.dex */
    class a implements ListIterator<String> {

        /* renamed from: j  reason: collision with root package name */
        ListIterator<String> f6293j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f6294k;

        a(int i10) {
            this.f6294k = i10;
            this.f6293j = r1.this.f6292j.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c */
        public String next() {
            return this.f6293j.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public String previous() {
            return this.f6293j.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f6293j.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f6293j.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f6293j.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f6293j.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    class b implements Iterator<String> {

        /* renamed from: j  reason: collision with root package name */
        Iterator<String> f6296j;

        b() {
            this.f6296j = r1.this.f6292j.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.f6296j.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6296j.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r1(h0 h0Var) {
        this.f6292j = h0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public h0 d() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public String get(int i10) {
        return (String) this.f6292j.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Object f(int i10) {
        return this.f6292j.f(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public List<?> g() {
        return this.f6292j.g();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public void o(i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6292j.size();
    }
}
