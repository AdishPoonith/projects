package m6;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class n implements Iterable<i> {

    /* renamed from: j  reason: collision with root package name */
    private final d6.c<l, i> f13810j;

    /* renamed from: k  reason: collision with root package name */
    private final d6.e<i> f13811k;

    private n(d6.c<l, i> cVar, d6.e<i> eVar) {
        this.f13810j = cVar;
        this.f13811k = eVar;
    }

    public static n k(final Comparator<i> comparator) {
        return new n(j.a(), new d6.e(Collections.emptyList(), new Comparator() { // from class: m6.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int r10;
                r10 = n.r(comparator, (i) obj, (i) obj2);
                return r10;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int r(Comparator comparator, i iVar, i iVar2) {
        int compare = comparator.compare(iVar, iVar2);
        return compare == 0 ? i.f13803a.compare(iVar, iVar2) : compare;
    }

    public n e(i iVar) {
        n s10 = s(iVar.getKey());
        return new n(s10.f13810j.p(iVar.getKey(), iVar), s10.f13811k.k(iVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (size() != nVar.size()) {
            return false;
        }
        Iterator<i> it = iterator();
        Iterator<i> it2 = nVar.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator<i> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i next = it.next();
            i10 = (((i10 * 31) + next.getKey().hashCode()) * 31) + next.k().hashCode();
        }
        return i10;
    }

    public boolean isEmpty() {
        return this.f13810j.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<i> iterator() {
        return this.f13811k.iterator();
    }

    public i l(l lVar) {
        return this.f13810j.e(lVar);
    }

    public i m() {
        return this.f13811k.e();
    }

    public i p() {
        return this.f13811k.b();
    }

    public int q(l lVar) {
        i e10 = this.f13810j.e(lVar);
        if (e10 == null) {
            return -1;
        }
        return this.f13811k.indexOf(e10);
    }

    public n s(l lVar) {
        i e10 = this.f13810j.e(lVar);
        return e10 == null ? this : new n(this.f13810j.r(lVar), this.f13811k.m(e10));
    }

    public int size() {
        return this.f13810j.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<i> it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            i next = it.next();
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append("]");
        return sb.toString();
    }
}
