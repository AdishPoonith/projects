package d6;

import d6.c;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class c<K, V> implements Iterable<Map.Entry<K, V>> {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final InterfaceC0117a f7755a = new InterfaceC0117a() { // from class: d6.b
            @Override // d6.c.a.InterfaceC0117a
            public final Object a(Object obj) {
                Object e10;
                e10 = c.a.e(obj);
                return e10;
            }
        };

        /* renamed from: d6.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0117a<C, D> {
            D a(C c10);
        }

        public static <A, B, C> c<A, C> b(List<A> list, Map<B, C> map, InterfaceC0117a<A, B> interfaceC0117a, Comparator<A> comparator) {
            return list.size() < 25 ? d6.a.v(list, map, interfaceC0117a, comparator) : k.s(list, map, interfaceC0117a, comparator);
        }

        public static <K, V> c<K, V> c(Comparator<K> comparator) {
            return new d6.a(comparator);
        }

        public static <A> InterfaceC0117a<A, A> d() {
            return f7755a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object e(Object obj) {
            return obj;
        }
    }

    public abstract boolean b(K k10);

    public abstract V e(K k10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (k().equals(cVar.k()) && size() == cVar.size()) {
                Iterator<Map.Entry<K, V>> it = iterator();
                Iterator<Map.Entry<K, V>> it2 = cVar.iterator();
                while (it.hasNext()) {
                    if (!it.next().equals(it2.next())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = k().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + it.next().hashCode();
        }
        return hashCode;
    }

    public abstract int indexOf(K k10);

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    public abstract Comparator<K> k();

    public abstract K l();

    public abstract K m();

    public abstract c<K, V> p(K k10, V v10);

    public abstract Iterator<Map.Entry<K, V>> q(K k10);

    public abstract c<K, V> r(K k10);

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator<Map.Entry<K, V>> it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(next.getKey());
            sb.append("=>");
            sb.append(next.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
