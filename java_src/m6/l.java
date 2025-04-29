package m6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public final class l implements Comparable<l> {

    /* renamed from: k  reason: collision with root package name */
    private static final Comparator<l> f13806k;

    /* renamed from: l  reason: collision with root package name */
    private static final d6.e<l> f13807l;

    /* renamed from: j  reason: collision with root package name */
    private final u f13808j;

    static {
        k kVar = new Comparator() { // from class: m6.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((l) obj).compareTo((l) obj2);
            }
        };
        f13806k = kVar;
        f13807l = new d6.e<>(Collections.emptyList(), kVar);
    }

    private l(u uVar) {
        q6.b.d(t(uVar), "Not a document key path: %s", uVar);
        this.f13808j = uVar;
    }

    public static Comparator<l> b() {
        return f13806k;
    }

    public static l h() {
        return n(Collections.emptyList());
    }

    public static d6.e<l> i() {
        return f13807l;
    }

    public static l k(String str) {
        u v10 = u.v(str);
        q6.b.d(v10.q() > 4 && v10.n(0).equals("projects") && v10.n(2).equals("databases") && v10.n(4).equals("documents"), "Tried to parse an invalid key: %s", v10);
        return l(v10.r(5));
    }

    public static l l(u uVar) {
        return new l(uVar);
    }

    public static l n(List<String> list) {
        return new l(u.u(list));
    }

    public static boolean t(u uVar) {
        return uVar.q() % 2 == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f13808j.equals(((l) obj).f13808j);
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(l lVar) {
        return this.f13808j.compareTo(lVar.f13808j);
    }

    public int hashCode() {
        return this.f13808j.hashCode();
    }

    public String o() {
        u uVar = this.f13808j;
        return uVar.n(uVar.q() - 2);
    }

    public u p() {
        return this.f13808j.s();
    }

    public String q() {
        return this.f13808j.l();
    }

    public u r() {
        return this.f13808j;
    }

    public boolean s(String str) {
        if (this.f13808j.q() >= 2) {
            u uVar = this.f13808j;
            if (uVar.f13798j.get(uVar.q() - 2).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.f13808j.toString();
    }
}
