package p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class i<E> implements Iterable<E> {

    /* renamed from: j  reason: collision with root package name */
    private final Object f15370j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private final Map<E, Integer> f15371k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private Set<E> f15372l = Collections.emptySet();

    /* renamed from: m  reason: collision with root package name */
    private List<E> f15373m = Collections.emptyList();

    public void b(E e10) {
        synchronized (this.f15370j) {
            ArrayList arrayList = new ArrayList(this.f15373m);
            arrayList.add(e10);
            this.f15373m = Collections.unmodifiableList(arrayList);
            Integer num = this.f15371k.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f15372l);
                hashSet.add(e10);
                this.f15372l = Collections.unmodifiableSet(hashSet);
            }
            this.f15371k.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public int e(E e10) {
        int intValue;
        synchronized (this.f15370j) {
            intValue = this.f15371k.containsKey(e10) ? this.f15371k.get(e10).intValue() : 0;
        }
        return intValue;
    }

    public Set<E> i() {
        Set<E> set;
        synchronized (this.f15370j) {
            set = this.f15372l;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f15370j) {
            it = this.f15373m.iterator();
        }
        return it;
    }

    public void k(E e10) {
        synchronized (this.f15370j) {
            Integer num = this.f15371k.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f15373m);
            arrayList.remove(e10);
            this.f15373m = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f15371k.remove(e10);
                HashSet hashSet = new HashSet(this.f15372l);
                hashSet.remove(e10);
                this.f15372l = Collections.unmodifiableSet(hashSet);
            } else {
                this.f15371k.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
