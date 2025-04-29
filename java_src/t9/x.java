package t9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
/* loaded from: classes.dex */
public class x extends w {

    /* loaded from: classes.dex */
    public static final class a<T> extends kotlin.jvm.internal.m implements da.l<Integer, T> {

        /* renamed from: j */
        final /* synthetic */ int f18407j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(1);
            this.f18407j = i10;
        }

        public final T a(int i10) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f18407j + '.');
        }

        @Override // da.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public static final <T> T A(Iterable<? extends T> iterable) {
        T next;
        Object B;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            B = B((List) iterable);
            return (T) B;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T B(List<? extends T> list) {
        int f10;
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        f10 = p.f(list);
        return list.get(f10);
    }

    public static <T extends Comparable<? super T>> T C(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static <T> List<T> D(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        List<T> E;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(elements, "elements");
        if (iterable instanceof Collection) {
            E = E((Collection) iterable, elements);
            return E;
        }
        ArrayList arrayList = new ArrayList();
        u.l(arrayList, iterable);
        u.l(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> E(Collection<? extends T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        kotlin.jvm.internal.l.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            u.l(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> F(Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> T G(Collection<? extends T> collection, fa.c random) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        kotlin.jvm.internal.l.e(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) o(collection, random.d(collection.size()));
    }

    public static <T> T H(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) I((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T I(List<? extends T> list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> List<T> J(List<? extends T> list, ha.f indices) {
        List<T> P;
        List<T> e10;
        kotlin.jvm.internal.l.e(list, "<this>");
        kotlin.jvm.internal.l.e(indices, "indices");
        if (indices.isEmpty()) {
            e10 = p.e();
            return e10;
        }
        P = P(list.subList(indices.r().intValue(), indices.q().intValue() + 1));
        return P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> K(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> b10;
        List<T> P;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> Q = Q(iterable);
            t.k(Q, comparator);
            return Q;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            P = P(iterable);
            return P;
        }
        Object[] array = collection.toArray(new Object[0]);
        j.i(array, comparator);
        b10 = j.b(array);
        return b10;
    }

    public static <T> List<T> L(Iterable<? extends T> iterable, int i10) {
        List<T> b10;
        List<T> P;
        List<T> e10;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            e10 = p.e();
            return e10;
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    P = P(iterable);
                    return P;
                } else if (i10 == 1) {
                    b10 = o.b(s(iterable));
                    return b10;
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (T t10 : iterable) {
                arrayList.add(t10);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return p.h(arrayList);
        }
    }

    public static byte[] M(Collection<Byte> collection) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        int i10 = 0;
        for (Byte b10 : collection) {
            bArr[i10] = b10.byteValue();
            i10++;
        }
        return bArr;
    }

    public static final <T, C extends Collection<? super T>> C N(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        for (T t10 : iterable) {
            destination.add(t10);
        }
        return destination;
    }

    public static int[] O(Collection<Integer> collection) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Integer num : collection) {
            iArr[i10] = num.intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> P(Iterable<? extends T> iterable) {
        List<T> e10;
        List<T> b10;
        List<T> R;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                e10 = p.e();
                return e10;
            } else if (size != 1) {
                R = R(collection);
                return R;
            } else {
                b10 = o.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return b10;
            }
        }
        return p.h(Q(iterable));
    }

    public static final <T> List<T> Q(Iterable<? extends T> iterable) {
        List<T> R;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            R = R((Collection) iterable);
            return R;
        }
        return (List) N(iterable, new ArrayList());
    }

    public static <T> List<T> R(Collection<? extends T> collection) {
        kotlin.jvm.internal.l.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> S(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) N(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> T(Iterable<? extends T> iterable) {
        Set<T> b10;
        int a10;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                b10 = m0.b();
                return b10;
            } else if (size == 1) {
                return l0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            } else {
                a10 = f0.a(collection.size());
                return (Set) N(iterable, new LinkedHashSet(a10));
            }
        }
        return m0.e((Set) N(iterable, new LinkedHashSet()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0031, code lost:
        r5 = ha.i.c(r10, r0 - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.util.List<java.util.List<T>> U(java.lang.Iterable<? extends T> r9, int r10, int r11, boolean r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.e(r9, r0)
            t9.o0.a(r10, r11)
            boolean r0 = r9 instanceof java.util.RandomAccess
            r1 = 0
            if (r0 == 0) goto L55
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L55
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            int r2 = r0 / r11
            int r3 = r0 % r11
            r4 = 1
            if (r3 != 0) goto L20
            r3 = 0
            goto L21
        L20:
            r3 = 1
        L21:
            int r2 = r2 + r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r2 = 0
        L28:
            if (r2 < 0) goto L2e
            if (r2 >= r0) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            if (r5 == 0) goto L54
            int r5 = r0 - r2
            int r5 = ha.g.c(r10, r5)
            if (r5 >= r10) goto L3b
            if (r12 == 0) goto L54
        L3b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            r7 = 0
        L41:
            if (r7 >= r5) goto L4f
            int r8 = r7 + r2
            java.lang.Object r8 = r9.get(r8)
            r6.add(r8)
            int r7 = r7 + 1
            goto L41
        L4f:
            r3.add(r6)
            int r2 = r2 + r11
            goto L28
        L54:
            return r3
        L55:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
            java.util.Iterator r9 = t9.o0.b(r9, r10, r11, r12, r1)
        L62:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L72
            java.lang.Object r10 = r9.next()
            java.util.List r10 = (java.util.List) r10
            r0.add(r10)
            goto L62
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.x.U(java.lang.Iterable, int, int, boolean):java.util.List");
    }

    public static <T, R> List<s9.m<T, R>> V(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        int j10;
        int j11;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        j10 = q.j(iterable, 10);
        j11 = q.j(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(j10, j11));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(s9.q.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> boolean m(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : v(iterable, t10) >= 0;
    }

    public static <T> List<T> n(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        List<T> b10;
        List<T> e10;
        List<T> P;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            P = P(iterable);
            return P;
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i10;
                if (size <= 0) {
                    e10 = p.e();
                    return e10;
                } else if (size == 1) {
                    b10 = o.b(A(iterable));
                    return b10;
                } else {
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i10 < size2) {
                                arrayList.add(((List) iterable).get(i10));
                                i10++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i10);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            for (T t10 : iterable) {
                if (i11 >= i10) {
                    arrayList.add(t10);
                } else {
                    i11++;
                }
            }
            return p.h(arrayList);
        }
    }

    public static final <T> T o(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) p(iterable, i10, new a(i10));
    }

    public static final <T> T p(Iterable<? extends T> iterable, int i10, da.l<? super Integer, ? extends T> defaultValue) {
        int f10;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i10 >= 0) {
                f10 = p.f(list);
                if (i10 <= f10) {
                    return (T) list.get(i10);
                }
            }
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        if (i10 >= 0) {
            int i11 = 0;
            for (T t10 : iterable) {
                int i12 = i11 + 1;
                if (i10 == i11) {
                    return t10;
                }
                i11 = i12;
            }
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    public static <T> List<T> q(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        return (List) r(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C r(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static final <T> T s(Iterable<? extends T> iterable) {
        Object t10;
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            t10 = t((List) iterable);
            return (T) t10;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T t(List<? extends T> list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T u(List<? extends T> list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> int v(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                p.i();
            }
            if (kotlin.jvm.internal.l.a(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A w(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            ka.h.a(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String y(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(iterable, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String sb = ((StringBuilder) w(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String z(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, da.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return y(iterable, charSequence, str, str2, i12, charSequence5, lVar);
    }
}
