package com.google.common.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class w {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<T> a(Iterable<T> iterable) {
        return (List) iterable;
    }

    static int b(int i10) {
        h.b(i10, "arraySize");
        return e5.e.j(i10 + 5 + (i10 / 10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(List<?> list, Object obj) {
        if (obj == b5.n.n(list)) {
            return true;
        }
        if (obj instanceof List) {
            List list2 = (List) obj;
            int size = list.size();
            if (size != list2.size()) {
                return false;
            }
            if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
                for (int i10 = 0; i10 < size; i10++) {
                    if (!b5.j.a(list.get(i10), list2.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return u.e(list.iterator(), list2.iterator());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (b5.j.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int e(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (b5.j.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> h() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> i(Iterator<? extends E> it) {
        ArrayList<E> h10 = h();
        u.a(h10, it);
        return h10;
    }

    @SafeVarargs
    public static <E> ArrayList<E> j(E... eArr) {
        b5.n.n(eArr);
        ArrayList<E> arrayList = new ArrayList<>(b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
