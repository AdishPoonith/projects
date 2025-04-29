package t9;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class f<E> extends d<E> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f18379m = new a(null);

    /* renamed from: n  reason: collision with root package name */
    private static final Object[] f18380n = new Object[0];

    /* renamed from: j  reason: collision with root package name */
    private int f18381j;

    /* renamed from: k  reason: collision with root package name */
    private Object[] f18382k = f18380n;

    /* renamed from: l  reason: collision with root package name */
    private int f18383l;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
        }
    }

    private final void k(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f18382k.length;
        while (i10 < length && it.hasNext()) {
            this.f18382k[i10] = it.next();
            i10++;
        }
        int i11 = this.f18381j;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f18382k[i12] = it.next();
        }
        this.f18383l = size() + collection.size();
    }

    private final void l(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f18382k;
        j.c(objArr2, objArr, 0, this.f18381j, objArr2.length);
        Object[] objArr3 = this.f18382k;
        int length = objArr3.length;
        int i11 = this.f18381j;
        j.c(objArr3, objArr, length - i11, 0, i11);
        this.f18381j = 0;
        this.f18382k = objArr;
    }

    private final int m(int i10) {
        return i10 == 0 ? k.p(this.f18382k) : i10 - 1;
    }

    private final void p(int i10) {
        int a10;
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f18382k;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr != f18380n) {
            l(f18379m.a(objArr.length, i10));
            return;
        }
        a10 = ha.i.a(i10, 10);
        this.f18382k = new Object[a10];
    }

    private final int q(int i10) {
        if (i10 == k.p(this.f18382k)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int r(int i10) {
        return i10 < 0 ? i10 + this.f18382k.length : i10;
    }

    private final int s(int i10) {
        Object[] objArr = this.f18382k;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        c.f18370j.b(i10, size());
        if (i10 == size()) {
            addLast(e10);
        } else if (i10 == 0) {
            addFirst(e10);
        } else {
            p(size() + 1);
            int s10 = s(this.f18381j + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int m10 = m(s10);
                int m11 = m(this.f18381j);
                int i11 = this.f18381j;
                if (m10 >= i11) {
                    Object[] objArr = this.f18382k;
                    objArr[m11] = objArr[i11];
                    j.c(objArr, objArr, i11, i11 + 1, m10 + 1);
                } else {
                    Object[] objArr2 = this.f18382k;
                    j.c(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f18382k;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    j.c(objArr3, objArr3, 0, 1, m10 + 1);
                }
                this.f18382k[m10] = e10;
                this.f18381j = m11;
            } else {
                int s11 = s(this.f18381j + size());
                Object[] objArr4 = this.f18382k;
                if (s10 < s11) {
                    j.c(objArr4, objArr4, s10 + 1, s10, s11);
                } else {
                    j.c(objArr4, objArr4, 1, 0, s11);
                    Object[] objArr5 = this.f18382k;
                    objArr5[0] = objArr5[objArr5.length - 1];
                    j.c(objArr5, objArr5, s10 + 1, s10, objArr5.length - 1);
                }
                this.f18382k[s10] = e10;
            }
            this.f18383l = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        c.f18370j.b(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        p(size() + elements.size());
        int s10 = s(this.f18381j + size());
        int s11 = s(this.f18381j + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f18381j;
            int i12 = i11 - size;
            if (s11 < i11) {
                Object[] objArr = this.f18382k;
                j.c(objArr, objArr, i12, i11, objArr.length);
                Object[] objArr2 = this.f18382k;
                if (size >= s11) {
                    j.c(objArr2, objArr2, objArr2.length - size, 0, s11);
                } else {
                    j.c(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f18382k;
                    j.c(objArr3, objArr3, 0, size, s11);
                }
            } else if (i12 >= 0) {
                Object[] objArr4 = this.f18382k;
                j.c(objArr4, objArr4, i12, i11, s11);
            } else {
                Object[] objArr5 = this.f18382k;
                i12 += objArr5.length;
                int i13 = s11 - i11;
                int length = objArr5.length - i12;
                if (length >= i13) {
                    j.c(objArr5, objArr5, i12, i11, s11);
                } else {
                    j.c(objArr5, objArr5, i12, i11, i11 + length);
                    Object[] objArr6 = this.f18382k;
                    j.c(objArr6, objArr6, 0, this.f18381j + length, s11);
                }
            }
            this.f18381j = i12;
            k(r(s11 - size), elements);
        } else {
            int i14 = s11 + size;
            if (s11 < s10) {
                int i15 = size + s10;
                Object[] objArr7 = this.f18382k;
                if (i15 > objArr7.length) {
                    if (i14 >= objArr7.length) {
                        i14 -= objArr7.length;
                    } else {
                        int length2 = s10 - (i15 - objArr7.length);
                        j.c(objArr7, objArr7, 0, length2, s10);
                        Object[] objArr8 = this.f18382k;
                        j.c(objArr8, objArr8, i14, s11, length2);
                    }
                }
                j.c(objArr7, objArr7, i14, s11, s10);
            } else {
                Object[] objArr9 = this.f18382k;
                j.c(objArr9, objArr9, size, 0, s10);
                Object[] objArr10 = this.f18382k;
                if (i14 >= objArr10.length) {
                    j.c(objArr10, objArr10, i14 - objArr10.length, s11, objArr10.length);
                } else {
                    j.c(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f18382k;
                    j.c(objArr11, objArr11, i14, s11, objArr11.length - size);
                }
            }
            k(s11, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        p(size() + elements.size());
        k(s(this.f18381j + size()), elements);
        return true;
    }

    public final void addFirst(E e10) {
        p(size() + 1);
        int m10 = m(this.f18381j);
        this.f18381j = m10;
        this.f18382k[m10] = e10;
        this.f18383l = size() + 1;
    }

    public final void addLast(E e10) {
        p(size() + 1);
        this.f18382k[s(this.f18381j + size())] = e10;
        this.f18383l = size() + 1;
    }

    @Override // t9.d
    public int b() {
        return this.f18383l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int s10 = s(this.f18381j + size());
        int i10 = this.f18381j;
        if (i10 < s10) {
            j.e(this.f18382k, null, i10, s10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f18382k;
            j.e(objArr, null, this.f18381j, objArr.length);
            j.e(this.f18382k, null, 0, s10);
        }
        this.f18381j = 0;
        this.f18383l = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // t9.d
    public E e(int i10) {
        int f10;
        int f11;
        c.f18370j.a(i10, size());
        f10 = p.f(this);
        if (i10 == f10) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        int s10 = s(this.f18381j + i10);
        E e10 = (E) this.f18382k[s10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f18381j;
            if (s10 >= i11) {
                Object[] objArr = this.f18382k;
                j.c(objArr, objArr, i11 + 1, i11, s10);
            } else {
                Object[] objArr2 = this.f18382k;
                j.c(objArr2, objArr2, 1, 0, s10);
                Object[] objArr3 = this.f18382k;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f18381j;
                j.c(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f18382k;
            int i13 = this.f18381j;
            objArr4[i13] = null;
            this.f18381j = q(i13);
        } else {
            int i14 = this.f18381j;
            f11 = p.f(this);
            int s11 = s(i14 + f11);
            Object[] objArr5 = this.f18382k;
            if (s10 <= s11) {
                j.c(objArr5, objArr5, s10, s10 + 1, s11 + 1);
            } else {
                j.c(objArr5, objArr5, s10, s10 + 1, objArr5.length);
                Object[] objArr6 = this.f18382k;
                objArr6[objArr6.length - 1] = objArr6[0];
                j.c(objArr6, objArr6, 0, 1, s11 + 1);
            }
            this.f18382k[s11] = null;
        }
        this.f18383l = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c.f18370j.a(i10, size());
        return (E) this.f18382k[s(this.f18381j + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int s10 = s(this.f18381j + size());
        int i10 = this.f18381j;
        if (i10 < s10) {
            while (i10 < s10) {
                if (!kotlin.jvm.internal.l.a(obj, this.f18382k[i10])) {
                    i10++;
                }
            }
            return -1;
        } else if (i10 < s10) {
            return -1;
        } else {
            int length = this.f18382k.length;
            while (true) {
                if (i10 >= length) {
                    for (int i11 = 0; i11 < s10; i11++) {
                        if (kotlin.jvm.internal.l.a(obj, this.f18382k[i11])) {
                            i10 = i11 + this.f18382k.length;
                        }
                    }
                    return -1;
                } else if (kotlin.jvm.internal.l.a(obj, this.f18382k[i10])) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        return i10 - this.f18381j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int p10;
        int s10 = s(this.f18381j + size());
        int i10 = this.f18381j;
        if (i10 < s10) {
            p10 = s10 - 1;
            if (i10 <= p10) {
                while (!kotlin.jvm.internal.l.a(obj, this.f18382k[p10])) {
                    if (p10 != i10) {
                        p10--;
                    }
                }
                return p10 - this.f18381j;
            }
            return -1;
        }
        if (i10 > s10) {
            int i11 = s10 - 1;
            while (true) {
                if (-1 >= i11) {
                    p10 = k.p(this.f18382k);
                    int i12 = this.f18381j;
                    if (i12 <= p10) {
                        while (!kotlin.jvm.internal.l.a(obj, this.f18382k[p10])) {
                            if (p10 != i12) {
                                p10--;
                            }
                        }
                    }
                } else if (kotlin.jvm.internal.l.a(obj, this.f18382k[i11])) {
                    p10 = i11 + this.f18382k.length;
                    break;
                } else {
                    i11--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int s10;
        kotlin.jvm.internal.l.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if (!(this.f18382k.length == 0)) {
                int s11 = s(this.f18381j + size());
                int i10 = this.f18381j;
                if (i10 < s11) {
                    s10 = i10;
                    while (i10 < s11) {
                        Object obj = this.f18382k[i10];
                        if (!elements.contains(obj)) {
                            this.f18382k[s10] = obj;
                            s10++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    j.e(this.f18382k, null, s10, s11);
                } else {
                    int length = this.f18382k.length;
                    int i11 = i10;
                    boolean z11 = false;
                    while (i10 < length) {
                        Object[] objArr = this.f18382k;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!elements.contains(obj2)) {
                            this.f18382k[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    s10 = s(i11);
                    for (int i12 = 0; i12 < s11; i12++) {
                        Object[] objArr2 = this.f18382k;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!elements.contains(obj3)) {
                            this.f18382k[s10] = obj3;
                            s10 = q(s10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f18383l = r(s10 - this.f18381j);
                }
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f18382k;
        int i10 = this.f18381j;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f18381j = q(i10);
        this.f18383l = size() - 1;
        return e10;
    }

    public final E removeLast() {
        int f10;
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int i10 = this.f18381j;
        f10 = p.f(this);
        int s10 = s(i10 + f10);
        Object[] objArr = this.f18382k;
        E e10 = (E) objArr[s10];
        objArr[s10] = null;
        this.f18383l = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int s10;
        kotlin.jvm.internal.l.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if (!(this.f18382k.length == 0)) {
                int s11 = s(this.f18381j + size());
                int i10 = this.f18381j;
                if (i10 < s11) {
                    s10 = i10;
                    while (i10 < s11) {
                        Object obj = this.f18382k[i10];
                        if (elements.contains(obj)) {
                            this.f18382k[s10] = obj;
                            s10++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    j.e(this.f18382k, null, s10, s11);
                } else {
                    int length = this.f18382k.length;
                    int i11 = i10;
                    boolean z11 = false;
                    while (i10 < length) {
                        Object[] objArr = this.f18382k;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (elements.contains(obj2)) {
                            this.f18382k[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    s10 = s(i11);
                    for (int i12 = 0; i12 < s11; i12++) {
                        Object[] objArr2 = this.f18382k;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (elements.contains(obj3)) {
                            this.f18382k[s10] = obj3;
                            s10 = q(s10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f18383l = r(s10 - this.f18381j);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c.f18370j.a(i10, size());
        int s10 = s(this.f18381j + i10);
        Object[] objArr = this.f18382k;
        E e11 = (E) objArr[s10];
        objArr[s10] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.l.e(array, "array");
        if (array.length < size()) {
            array = (T[]) h.a(array, size());
        }
        int s10 = s(this.f18381j + size());
        int i10 = this.f18381j;
        if (i10 < s10) {
            j.d(this.f18382k, array, 0, i10, s10, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f18382k;
            j.c(objArr, array, 0, this.f18381j, objArr.length);
            Object[] objArr2 = this.f18382k;
            j.c(objArr2, array, objArr2.length - this.f18381j, 0, s10);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
