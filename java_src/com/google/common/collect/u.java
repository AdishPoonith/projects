package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class a<T> extends com.google.common.collect.b<T> {

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Iterator f6062l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b5.o f6063m;

        a(Iterator it, b5.o oVar) {
            this.f6062l = it;
            this.f6063m = oVar;
        }

        @Override // com.google.common.collect.b
        protected T a() {
            while (this.f6062l.hasNext()) {
                T t10 = (T) this.f6062l.next();
                if (this.f6063m.apply(t10)) {
                    return t10;
                }
            }
            return c();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    class b<T> extends s0<T> {

        /* renamed from: j  reason: collision with root package name */
        boolean f6064j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Object f6065k;

        b(Object obj) {
            this.f6065k = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f6064j;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f6064j) {
                throw new NoSuchElementException();
            }
            this.f6064j = true;
            return (T) this.f6065k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            h.c(false);
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        b5.n.n(collection);
        b5.n.n(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static <T> boolean b(Iterator<T> it, b5.o<? super T> oVar) {
        return l(it, oVar) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Iterator<?> it) {
        b5.n.n(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = b5.j.a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.u.e(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Iterator<T> f() {
        return c.INSTANCE;
    }

    public static <T> s0<T> g(Iterator<T> it, b5.o<? super T> oVar) {
        b5.n.n(it);
        b5.n.n(oVar);
        return new a(it, oVar);
    }

    public static <T> T h(Iterator<T> it, b5.o<? super T> oVar) {
        b5.n.n(it);
        b5.n.n(oVar);
        while (it.hasNext()) {
            T next = it.next();
            if (oVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T i(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T j(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) i(it) : t10;
    }

    public static <T> T k(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> int l(Iterator<T> it, b5.o<? super T> oVar) {
        b5.n.o(oVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T m(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static boolean n(Iterator<?> it, Collection<?> collection) {
        b5.n.n(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean o(Iterator<T> it, b5.o<? super T> oVar) {
        b5.n.n(oVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> s0<T> p(T t10) {
        return new b(t10);
    }
}
