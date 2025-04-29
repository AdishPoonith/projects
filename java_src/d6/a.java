package d6;

import d6.c;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class a<K, V> extends c<K, V> {

    /* renamed from: j  reason: collision with root package name */
    private final K[] f7747j;

    /* renamed from: k  reason: collision with root package name */
    private final V[] f7748k;

    /* renamed from: l  reason: collision with root package name */
    private final Comparator<K> f7749l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0116a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: j  reason: collision with root package name */
        int f7750j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f7751k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f7752l;

        C0116a(int i10, boolean z10) {
            this.f7751k = i10;
            this.f7752l = z10;
            this.f7750j = i10;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            Object obj = a.this.f7747j[this.f7750j];
            Object[] objArr = a.this.f7748k;
            int i10 = this.f7750j;
            Object obj2 = objArr[i10];
            this.f7750j = this.f7752l ? i10 - 1 : i10 + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f7752l) {
                if (this.f7750j >= 0) {
                    return true;
                }
            } else if (this.f7750j < a.this.f7747j.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public a(Comparator<K> comparator) {
        this.f7747j = (K[]) new Object[0];
        this.f7748k = (V[]) new Object[0];
        this.f7749l = comparator;
    }

    private a(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f7747j = kArr;
        this.f7748k = vArr;
        this.f7749l = comparator;
    }

    private static <T> T[] A(T[] tArr, int i10, T t10) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i10] = t10;
        return tArr2;
    }

    private static <T> T[] u(T[] tArr, int i10, T t10) {
        int length = tArr.length + 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i10);
        tArr2[i10] = t10;
        System.arraycopy(tArr, i10, tArr2, i10 + 1, (length - i10) - 1);
        return tArr2;
    }

    public static <A, B, C> a<A, C> v(List<A> list, Map<B, C> map, c.a.InterfaceC0117a<A, B> interfaceC0117a, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i10 = 0;
        for (A a10 : list) {
            objArr[i10] = a10;
            objArr2[i10] = map.get(interfaceC0117a.a(a10));
            i10++;
        }
        return new a<>(comparator, objArr, objArr2);
    }

    private int w(K k10) {
        int i10 = 0;
        for (K k11 : this.f7747j) {
            if (this.f7749l.compare(k10, k11) == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private int x(K k10) {
        int i10 = 0;
        while (true) {
            K[] kArr = this.f7747j;
            if (i10 >= kArr.length || this.f7749l.compare(kArr[i10], k10) >= 0) {
                break;
            }
            i10++;
        }
        return i10;
    }

    private Iterator<Map.Entry<K, V>> y(int i10, boolean z10) {
        return new C0116a(i10, z10);
    }

    private static <T> T[] z(T[] tArr, int i10) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i10);
        System.arraycopy(tArr, i10 + 1, tArr2, i10, length - i10);
        return tArr2;
    }

    @Override // d6.c
    public boolean b(K k10) {
        return w(k10) != -1;
    }

    @Override // d6.c
    public V e(K k10) {
        int w10 = w(k10);
        if (w10 != -1) {
            return this.f7748k[w10];
        }
        return null;
    }

    @Override // d6.c
    public int indexOf(K k10) {
        return w(k10);
    }

    @Override // d6.c
    public boolean isEmpty() {
        return this.f7747j.length == 0;
    }

    @Override // d6.c, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return y(0, false);
    }

    @Override // d6.c
    public Comparator<K> k() {
        return this.f7749l;
    }

    @Override // d6.c
    public K l() {
        K[] kArr = this.f7747j;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // d6.c
    public K m() {
        K[] kArr = this.f7747j;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    @Override // d6.c
    public c<K, V> p(K k10, V v10) {
        int w10 = w(k10);
        if (w10 != -1) {
            K[] kArr = this.f7747j;
            if (kArr[w10] == k10 && this.f7748k[w10] == v10) {
                return this;
            }
            return new a(this.f7749l, A(kArr, w10, k10), A(this.f7748k, w10, v10));
        } else if (this.f7747j.length <= 25) {
            int x10 = x(k10);
            return new a(this.f7749l, u(this.f7747j, x10, k10), u(this.f7748k, x10, v10));
        } else {
            HashMap hashMap = new HashMap(this.f7747j.length + 1);
            int i10 = 0;
            while (true) {
                K[] kArr2 = this.f7747j;
                if (i10 >= kArr2.length) {
                    hashMap.put(k10, v10);
                    return k.t(hashMap, this.f7749l);
                }
                hashMap.put(kArr2[i10], this.f7748k[i10]);
                i10++;
            }
        }
    }

    @Override // d6.c
    public Iterator<Map.Entry<K, V>> q(K k10) {
        return y(x(k10), false);
    }

    @Override // d6.c
    public c<K, V> r(K k10) {
        int w10 = w(k10);
        if (w10 == -1) {
            return this;
        }
        return new a(this.f7749l, z(this.f7747j, w10), z(this.f7748k, w10));
    }

    @Override // d6.c
    public int size() {
        return this.f7747j.length;
    }
}
