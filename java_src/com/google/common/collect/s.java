package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
/* loaded from: classes.dex */
public abstract class s<E> extends o<E> implements Set<E> {

    /* renamed from: k  reason: collision with root package name */
    private transient q<E> f6060k;

    /* loaded from: classes.dex */
    private static class a implements Serializable {

        /* renamed from: j  reason: collision with root package name */
        final Object[] f6061j;

        a(Object[] objArr) {
            this.f6061j = objArr;
        }

        Object readResolve() {
            return s.u(this.f6061j);
        }
    }

    public static <E> s<E> A(E e10, E e11, E e12) {
        return s(3, e10, e11, e12);
    }

    public static <E> s<E> B(E e10, E e11, E e12, E e13, E e14) {
        return s(5, e10, e11, e12, e13, e14);
    }

    private static boolean C(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            b5.n.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private static <E> s<E> s(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 == 1) {
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                return y(obj);
            }
            int r10 = r(i10);
            Object[] objArr2 = new Object[r10];
            int i11 = r10 - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object a10 = g0.a(objArr[i14], i14);
                int hashCode = a10.hashCode();
                int a11 = n.a(hashCode);
                while (true) {
                    int i15 = a11 & i11;
                    Object obj2 = objArr2[i15];
                    if (obj2 == null) {
                        objArr[i13] = a10;
                        objArr2[i15] = a10;
                        i12 += hashCode;
                        i13++;
                        break;
                    } else if (obj2.equals(a10)) {
                        break;
                    } else {
                        a11++;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new q0(obj3);
            } else if (r(i13) < r10 / 2) {
                return s(i13, objArr);
            } else {
                if (C(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new l0(objArr, i12, objArr2, i11, i13);
            }
        }
        return x();
    }

    public static <E> s<E> t(Collection<? extends E> collection) {
        if ((collection instanceof s) && !(collection instanceof SortedSet)) {
            s<E> sVar = (s) collection;
            if (!sVar.p()) {
                return sVar;
            }
        }
        Object[] array = collection.toArray();
        return s(array.length, array);
    }

    public static <E> s<E> u(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? s(eArr.length, (Object[]) eArr.clone()) : y(eArr[0]) : x();
    }

    public static <E> s<E> x() {
        return l0.f6020r;
    }

    public static <E> s<E> y(E e10) {
        return new q0(e10);
    }

    public static <E> s<E> z(E e10, E e11) {
        return s(2, e10, e11);
    }

    @Override // com.google.common.collect.o
    public q<E> b() {
        q<E> qVar = this.f6060k;
        if (qVar == null) {
            q<E> v10 = v();
            this.f6060k = v10;
            return v10;
        }
        return qVar;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof s) && w() && ((s) obj).w() && hashCode() != obj.hashCode()) {
            return false;
        }
        return p0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return p0.d(this);
    }

    @Override // com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: q */
    public abstract s0<E> iterator();

    q<E> v() {
        return q.r(toArray());
    }

    boolean w() {
        return false;
    }

    @Override // com.google.common.collect.o
    Object writeReplace() {
        return new a(toArray());
    }
}
