package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f16804n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    private static final Object[] f16805o = new Object[0];

    /* renamed from: p  reason: collision with root package name */
    private static Object[] f16806p;

    /* renamed from: q  reason: collision with root package name */
    private static int f16807q;

    /* renamed from: r  reason: collision with root package name */
    private static Object[] f16808r;

    /* renamed from: s  reason: collision with root package name */
    private static int f16809s;

    /* renamed from: j  reason: collision with root package name */
    private int[] f16810j;

    /* renamed from: k  reason: collision with root package name */
    Object[] f16811k;

    /* renamed from: l  reason: collision with root package name */
    int f16812l;

    /* renamed from: m  reason: collision with root package name */
    private f<E, E> f16813m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f<E, E> {
        a() {
        }

        @Override // s.f
        protected void a() {
            b.this.clear();
        }

        @Override // s.f
        protected Object b(int i10, int i11) {
            return b.this.f16811k[i10];
        }

        @Override // s.f
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // s.f
        protected int d() {
            return b.this.f16812l;
        }

        @Override // s.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // s.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // s.f
        protected void g(E e10, E e11) {
            b.this.add(e10);
        }

        @Override // s.f
        protected void h(int i10) {
            b.this.q(i10);
        }

        @Override // s.f
        protected E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f16810j = f16804n;
            this.f16811k = f16805o;
        } else {
            b(i10);
        }
        this.f16812l = 0;
    }

    private void b(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f16808r;
                if (objArr != null) {
                    this.f16811k = objArr;
                    f16808r = (Object[]) objArr[0];
                    this.f16810j = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f16809s--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f16806p;
                if (objArr2 != null) {
                    this.f16811k = objArr2;
                    f16806p = (Object[]) objArr2[0];
                    this.f16810j = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f16807q--;
                    return;
                }
            }
        }
        this.f16810j = new int[i10];
        this.f16811k = new Object[i10];
    }

    private static void k(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f16809s < 10) {
                    objArr[0] = f16808r;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f16808r = objArr;
                    f16809s++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f16807q < 10) {
                    objArr[0] = f16806p;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f16806p = objArr;
                    f16807q++;
                }
            }
        }
    }

    private f<E, E> l() {
        if (this.f16813m == null) {
            this.f16813m = new a();
        }
        return this.f16813m;
    }

    private int m(Object obj, int i10) {
        int i11 = this.f16812l;
        if (i11 == 0) {
            return -1;
        }
        int a10 = c.a(this.f16810j, i11, i10);
        if (a10 >= 0 && !obj.equals(this.f16811k[a10])) {
            int i12 = a10 + 1;
            while (i12 < i11 && this.f16810j[i12] == i10) {
                if (obj.equals(this.f16811k[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a10 - 1; i13 >= 0 && this.f16810j[i13] == i10; i13--) {
                if (obj.equals(this.f16811k[i13])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return a10;
    }

    private int p() {
        int i10 = this.f16812l;
        if (i10 == 0) {
            return -1;
        }
        int a10 = c.a(this.f16810j, i10, 0);
        if (a10 >= 0 && this.f16811k[a10] != null) {
            int i11 = a10 + 1;
            while (i11 < i10 && this.f16810j[i11] == 0) {
                if (this.f16811k[i11] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && this.f16810j[i12] == 0; i12--) {
                if (this.f16811k[i12] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return a10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int m10;
        if (e10 == null) {
            m10 = p();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            m10 = m(e10, hashCode);
        }
        if (m10 >= 0) {
            return false;
        }
        int i11 = ~m10;
        int i12 = this.f16812l;
        int[] iArr = this.f16810j;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f16811k;
            b(i13);
            int[] iArr2 = this.f16810j;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f16811k, 0, objArr.length);
            }
            k(iArr, objArr, this.f16812l);
        }
        int i14 = this.f16812l;
        if (i11 < i14) {
            int[] iArr3 = this.f16810j;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f16811k;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f16812l - i11);
        }
        this.f16810j[i11] = i10;
        this.f16811k[i11] = e10;
        this.f16812l++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        e(this.f16812l + collection.size());
        boolean z10 = false;
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f16812l;
        if (i10 != 0) {
            k(this.f16810j, this.f16811k, i10);
            this.f16810j = f16804n;
            this.f16811k = f16805o;
            this.f16812l = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void e(int i10) {
        int[] iArr = this.f16810j;
        if (iArr.length < i10) {
            Object[] objArr = this.f16811k;
            b(i10);
            int i11 = this.f16812l;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f16810j, 0, i11);
                System.arraycopy(objArr, 0, this.f16811k, 0, this.f16812l);
            }
            k(iArr, objArr, this.f16812l);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f16812l; i10++) {
                try {
                    if (!set.contains(r(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f16810j;
        int i10 = this.f16812l;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? p() : m(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f16812l <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return l().m().iterator();
    }

    public E q(int i10) {
        Object[] objArr = this.f16811k;
        E e10 = (E) objArr[i10];
        int i11 = this.f16812l;
        if (i11 <= 1) {
            k(this.f16810j, objArr, i11);
            this.f16810j = f16804n;
            this.f16811k = f16805o;
            this.f16812l = 0;
        } else {
            int[] iArr = this.f16810j;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i12 = i11 - 1;
                this.f16812l = i12;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                    Object[] objArr2 = this.f16811k;
                    System.arraycopy(objArr2, i13, objArr2, i10, this.f16812l - i10);
                }
                this.f16811k[this.f16812l] = null;
            } else {
                b(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f16812l--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f16810j, 0, i10);
                    System.arraycopy(objArr, 0, this.f16811k, 0, i10);
                }
                int i14 = this.f16812l;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, this.f16810j, i10, i14 - i10);
                    System.arraycopy(objArr, i15, this.f16811k, i10, this.f16812l - i10);
                }
            }
        }
        return e10;
    }

    public E r(int i10) {
        return (E) this.f16811k[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            q(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f16812l - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f16811k[i10])) {
                q(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f16812l;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f16812l;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f16811k, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f16812l) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f16812l));
        }
        System.arraycopy(this.f16811k, 0, tArr, 0, this.f16812l);
        int length = tArr.length;
        int i10 = this.f16812l;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16812l * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16812l; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            E r10 = r(i10);
            if (r10 != this) {
                sb.append(r10);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
