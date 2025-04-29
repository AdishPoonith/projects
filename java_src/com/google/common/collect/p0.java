package com.google.common.collect;

import com.google.common.collect.i;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
/* loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* loaded from: classes.dex */
    class a<E> extends e<E> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Set f6034j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Set f6035k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.common.collect.p0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0093a extends com.google.common.collect.b<E> {

            /* renamed from: l  reason: collision with root package name */
            final Iterator<E> f6036l;

            C0093a() {
                this.f6036l = a.this.f6034j.iterator();
            }

            @Override // com.google.common.collect.b
            protected E a() {
                while (this.f6036l.hasNext()) {
                    E next = this.f6036l.next();
                    if (a.this.f6035k.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f6034j = set;
            this.f6035k = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b */
        public s0<E> iterator() {
            return new C0093a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f6034j.contains(obj) && this.f6035k.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f6034j.containsAll(collection) && this.f6035k.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f6035k, this.f6034j);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i10 = 0;
            for (E e10 : this.f6034j) {
                if (this.f6035k.contains(e10)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<E> extends i.a<E> implements Set<E> {
        b(Set<E> set, b5.o<? super E> oVar) {
            super(set, oVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return p0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return p0.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<E> extends b<E> implements SortedSet<E> {
        c(SortedSet<E> sortedSet, b5.o<? super E> oVar) {
            super(sortedSet, oVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f5995j).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) u.h(this.f5995j.iterator(), this.f5996k);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new c(((SortedSet) this.f5995j).headSet(e10), this.f5996k);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f5995j;
            while (true) {
                ?? r12 = (Object) sortedSet.last();
                if (this.f5996k.apply(r12)) {
                    return r12;
                }
                sortedSet = sortedSet.headSet(r12);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new c(((SortedSet) this.f5995j).subSet(e10, e11), this.f5996k);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new c(((SortedSet) this.f5995j).tailSet(e10), this.f5996k);
        }
    }

    /* loaded from: classes.dex */
    static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return p0.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) b5.n.n(collection));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<E> extends AbstractSet<E> {
        private e() {
        }

        /* synthetic */ e(o0 o0Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, b5.o<? super E> oVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, oVar);
        }
        if (set instanceof b) {
            b bVar = (b) set;
            return new b((Set) bVar.f5995j, b5.p.b(bVar.f5996k, oVar));
        }
        return new b((Set) b5.n.n(set), (b5.o) b5.n.n(oVar));
    }

    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, b5.o<? super E> oVar) {
        if (sortedSet instanceof b) {
            b bVar = (b) sortedSet;
            return new c((SortedSet) bVar.f5995j, b5.p.b(bVar.f5996k, oVar));
        }
        return new c((SortedSet) b5.n.n(sortedSet), (b5.o) b5.n.n(oVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        b5.n.o(set, "set1");
        b5.n.o(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(y.a(i10));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(y.e());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        b5.n.n(collection);
        if (collection instanceof d0) {
            collection = ((d0) collection).i();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : u.n(set.iterator(), collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
