package d6;

import d6.c;
import d6.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class k<K, V> extends c<K, V> {

    /* renamed from: j  reason: collision with root package name */
    private h<K, V> f7769j;

    /* renamed from: k  reason: collision with root package name */
    private Comparator<K> f7770k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<A, B, C> {

        /* renamed from: a  reason: collision with root package name */
        private final List<A> f7771a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<B, C> f7772b;

        /* renamed from: c  reason: collision with root package name */
        private final c.a.InterfaceC0117a<A, B> f7773c;

        /* renamed from: d  reason: collision with root package name */
        private j<A, C> f7774d;

        /* renamed from: e  reason: collision with root package name */
        private j<A, C> f7775e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a implements Iterable<C0119b> {

            /* renamed from: j  reason: collision with root package name */
            private long f7776j;

            /* renamed from: k  reason: collision with root package name */
            private final int f7777k;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: d6.k$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0118a implements Iterator<C0119b> {

                /* renamed from: j  reason: collision with root package name */
                private int f7778j;

                C0118a() {
                    this.f7778j = a.this.f7777k - 1;
                }

                @Override // java.util.Iterator
                /* renamed from: a */
                public C0119b next() {
                    C0119b c0119b = new C0119b();
                    c0119b.f7780a = (a.this.f7776j & ((long) (1 << this.f7778j))) == 0;
                    c0119b.f7781b = (int) Math.pow(2.0d, this.f7778j);
                    this.f7778j--;
                    return c0119b;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f7778j >= 0;
                }

                @Override // java.util.Iterator
                public void remove() {
                }
            }

            public a(int i10) {
                int i11 = i10 + 1;
                int floor = (int) Math.floor(Math.log(i11) / Math.log(2.0d));
                this.f7777k = floor;
                this.f7776j = (((long) Math.pow(2.0d, floor)) - 1) & i11;
            }

            @Override // java.lang.Iterable
            public Iterator<C0119b> iterator() {
                return new C0118a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d6.k$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0119b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f7780a;

            /* renamed from: b  reason: collision with root package name */
            public int f7781b;

            C0119b() {
            }
        }

        private b(List<A> list, Map<B, C> map, c.a.InterfaceC0117a<A, B> interfaceC0117a) {
            this.f7771a = list;
            this.f7772b = map;
            this.f7773c = interfaceC0117a;
        }

        private h<A, C> a(int i10, int i11) {
            if (i11 == 0) {
                return g.i();
            }
            if (i11 == 1) {
                A a10 = this.f7771a.get(i10);
                return new f(a10, d(a10), null, null);
            }
            int i12 = i11 / 2;
            int i13 = i10 + i12;
            h<A, C> a11 = a(i10, i12);
            h<A, C> a12 = a(i13 + 1, i12);
            A a13 = this.f7771a.get(i13);
            return new f(a13, d(a13), a11, a12);
        }

        public static <A, B, C> k<A, C> b(List<A> list, Map<B, C> map, c.a.InterfaceC0117a<A, B> interfaceC0117a, Comparator<A> comparator) {
            b bVar = new b(list, map, interfaceC0117a);
            Collections.sort(list, comparator);
            Iterator<C0119b> it = new a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                C0119b next = it.next();
                int i10 = next.f7781b;
                size -= i10;
                if (next.f7780a) {
                    bVar.c(h.a.BLACK, i10, size);
                } else {
                    bVar.c(h.a.BLACK, i10, size);
                    int i11 = next.f7781b;
                    size -= i11;
                    bVar.c(h.a.RED, i11, size);
                }
            }
            h hVar = bVar.f7774d;
            if (hVar == null) {
                hVar = g.i();
            }
            return new k<>(hVar, comparator);
        }

        private void c(h.a aVar, int i10, int i11) {
            h<A, C> a10 = a(i11 + 1, i10 - 1);
            A a11 = this.f7771a.get(i11);
            j<A, C> iVar = aVar == h.a.RED ? new i<>(a11, d(a11), null, a10) : new f<>(a11, d(a11), null, a10);
            if (this.f7774d == null) {
                this.f7774d = iVar;
            } else {
                this.f7775e.t(iVar);
            }
            this.f7775e = iVar;
        }

        private C d(A a10) {
            return this.f7772b.get(this.f7773c.a(a10));
        }
    }

    private k(h<K, V> hVar, Comparator<K> comparator) {
        this.f7769j = hVar;
        this.f7770k = comparator;
    }

    public static <A, B, C> k<A, C> s(List<A> list, Map<B, C> map, c.a.InterfaceC0117a<A, B> interfaceC0117a, Comparator<A> comparator) {
        return b.b(list, map, interfaceC0117a, comparator);
    }

    public static <A, B> k<A, B> t(Map<A, B> map, Comparator<A> comparator) {
        return b.b(new ArrayList(map.keySet()), map, c.a.d(), comparator);
    }

    private h<K, V> u(K k10) {
        h<K, V> hVar = this.f7769j;
        while (!hVar.isEmpty()) {
            int compare = this.f7770k.compare(k10, hVar.getKey());
            if (compare < 0) {
                hVar = hVar.a();
            } else if (compare == 0) {
                return hVar;
            } else {
                hVar = hVar.d();
            }
        }
        return null;
    }

    @Override // d6.c
    public boolean b(K k10) {
        return u(k10) != null;
    }

    @Override // d6.c
    public V e(K k10) {
        h<K, V> u10 = u(k10);
        if (u10 != null) {
            return u10.getValue();
        }
        return null;
    }

    @Override // d6.c
    public int indexOf(K k10) {
        h<K, V> hVar = this.f7769j;
        int i10 = 0;
        while (!hVar.isEmpty()) {
            int compare = this.f7770k.compare(k10, hVar.getKey());
            if (compare == 0) {
                return i10 + hVar.a().size();
            }
            if (compare < 0) {
                hVar = hVar.a();
            } else {
                i10 += hVar.a().size() + 1;
                hVar = hVar.d();
            }
        }
        return -1;
    }

    @Override // d6.c
    public boolean isEmpty() {
        return this.f7769j.isEmpty();
    }

    @Override // d6.c, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new d(this.f7769j, null, this.f7770k, false);
    }

    @Override // d6.c
    public Comparator<K> k() {
        return this.f7770k;
    }

    @Override // d6.c
    public K l() {
        return this.f7769j.h().getKey();
    }

    @Override // d6.c
    public K m() {
        return this.f7769j.f().getKey();
    }

    @Override // d6.c
    public c<K, V> p(K k10, V v10) {
        return new k(this.f7769j.b(k10, v10, this.f7770k).g(null, null, h.a.BLACK, null, null), this.f7770k);
    }

    @Override // d6.c
    public Iterator<Map.Entry<K, V>> q(K k10) {
        return new d(this.f7769j, k10, this.f7770k, false);
    }

    @Override // d6.c
    public c<K, V> r(K k10) {
        return !b(k10) ? this : new k(this.f7769j.e(k10, this.f7770k).g(null, null, h.a.BLACK, null, null), this.f7770k);
    }

    @Override // d6.c
    public int size() {
        return this.f7769j.size();
    }
}
