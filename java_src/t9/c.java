package t9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public abstract class c<E> extends t9.a<E> implements List<E> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f18370j = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            } else if (i10 <= i11) {
            } else {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final boolean d(Collection<?> c10, Collection<?> other) {
            kotlin.jvm.internal.l.e(c10, "c");
            kotlin.jvm.internal.l.e(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.l.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection<?> c10) {
            kotlin.jvm.internal.l.e(c10, "c");
            Iterator<?> it = c10.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Iterator<E>, ea.a {

        /* renamed from: j  reason: collision with root package name */
        private int f18371j;

        public b() {
        }

        protected final int a() {
            return this.f18371j;
        }

        protected final void c(int i10) {
            this.f18371j = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18371j < c.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                c<E> cVar = c.this;
                int i10 = this.f18371j;
                this.f18371j = i10 + 1;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: t9.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0264c extends c<E>.b implements ListIterator<E> {
        public C0264c(int i10) {
            super();
            c.f18370j.b(i10, c.this.size());
            c(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                c<E> cVar = c.this;
                c(a() - 1);
                return cVar.get(a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes.dex */
    private static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: k  reason: collision with root package name */
        private final c<E> f18374k;

        /* renamed from: l  reason: collision with root package name */
        private final int f18375l;

        /* renamed from: m  reason: collision with root package name */
        private int f18376m;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> list, int i10, int i11) {
            kotlin.jvm.internal.l.e(list, "list");
            this.f18374k = list;
            this.f18375l = i10;
            c.f18370j.c(i10, i11, list.size());
            this.f18376m = i11 - i10;
        }

        @Override // t9.a
        public int b() {
            return this.f18376m;
        }

        @Override // t9.c, java.util.List
        public E get(int i10) {
            c.f18370j.a(i10, this.f18376m);
            return this.f18374k.get(this.f18375l + i10);
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f18370j.d(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f18370j.e(this);
    }

    @Override // java.util.List
    public int indexOf(E e10) {
        int i10 = 0;
        for (E e11 : this) {
            if (kotlin.jvm.internal.l.a(e11, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.l.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C0264c(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new C0264c(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
