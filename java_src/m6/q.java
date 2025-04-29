package m6;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import m6.q;
@AutoValue
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static b f13814a = b.a(0, a.f13816j);

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<q> f13815b = new Comparator() { // from class: m6.o
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i10;
            i10 = q.i((q) obj, (q) obj2);
            return i10;
        }
    };

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class a implements Comparable<a> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f13816j = h(w.f13842k, l.h(), -1);

        /* renamed from: k  reason: collision with root package name */
        public static final Comparator<s> f13817k = new Comparator() { // from class: m6.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int p10;
                p10 = q.a.p((s) obj, (s) obj2);
                return p10;
            }
        };

        public static a h(w wVar, l lVar, int i10) {
            return new m6.b(wVar, lVar, i10);
        }

        public static a i(w wVar, int i10) {
            long l10 = wVar.g().l();
            int k10 = wVar.g().k() + 1;
            return h(new w(((double) k10) == 1.0E9d ? new w5.q(l10 + 1, 0) : new w5.q(l10, k10)), l.h(), i10);
        }

        public static a k(i iVar) {
            return h(iVar.g(), iVar.getKey(), -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int p(s sVar, s sVar2) {
            return k(sVar).compareTo(k(sVar2));
        }

        @Override // java.lang.Comparable
        /* renamed from: g */
        public int compareTo(a aVar) {
            int compareTo = o().compareTo(aVar.o());
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = l().compareTo(aVar.l());
            return compareTo2 != 0 ? compareTo2 : Integer.compare(n(), aVar.n());
        }

        public abstract l l();

        public abstract int n();

        public abstract w o();
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class b {
        public static b a(long j10, a aVar) {
            return new m6.c(j10, aVar);
        }

        public static b b(long j10, w wVar, l lVar, int i10) {
            return a(j10, a.h(wVar, lVar, i10));
        }

        public abstract a c();

        public abstract long d();
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class c implements Comparable<c> {

        /* loaded from: classes.dex */
        public enum a {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        public static c g(r rVar, a aVar) {
            return new d(rVar, aVar);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(c cVar) {
            int compareTo = h().compareTo(cVar.h());
            return compareTo != 0 ? compareTo : i().compareTo(cVar.i());
        }

        public abstract r h();

        public abstract a i();
    }

    public static q b(int i10, String str, List<c> list, b bVar) {
        return new m6.a(i10, str, list, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int i(q qVar, q qVar2) {
        int compareTo = qVar.d().compareTo(qVar2.d());
        if (compareTo != 0) {
            return compareTo;
        }
        Iterator<c> it = qVar.h().iterator();
        Iterator<c> it2 = qVar2.h().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo2 = it.next().compareTo(it2.next());
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    public c c() {
        for (c cVar : h()) {
            if (cVar.i().equals(c.a.CONTAINS)) {
                return cVar;
            }
        }
        return null;
    }

    public abstract String d();

    public List<c> e() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : h()) {
            if (!cVar.i().equals(c.a.CONTAINS)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public abstract int f();

    public abstract b g();

    public abstract List<c> h();
}
