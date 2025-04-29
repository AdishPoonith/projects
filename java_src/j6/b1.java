package j6;

import j6.a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: k  reason: collision with root package name */
    private static final a1 f12130k;

    /* renamed from: l  reason: collision with root package name */
    private static final a1 f12131l;

    /* renamed from: a  reason: collision with root package name */
    private final List<a1> f12132a;

    /* renamed from: b  reason: collision with root package name */
    private List<a1> f12133b;

    /* renamed from: c  reason: collision with root package name */
    private g1 f12134c;

    /* renamed from: d  reason: collision with root package name */
    private final List<r> f12135d;

    /* renamed from: e  reason: collision with root package name */
    private final m6.u f12136e;

    /* renamed from: f  reason: collision with root package name */
    private final String f12137f;

    /* renamed from: g  reason: collision with root package name */
    private final long f12138g;

    /* renamed from: h  reason: collision with root package name */
    private final a f12139h;

    /* renamed from: i  reason: collision with root package name */
    private final i f12140i;

    /* renamed from: j  reason: collision with root package name */
    private final i f12141j;

    /* loaded from: classes.dex */
    public enum a {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    /* loaded from: classes.dex */
    private static class b implements Comparator<m6.i> {

        /* renamed from: j  reason: collision with root package name */
        private final List<a1> f12145j;

        b(List<a1> list) {
            boolean z10;
            loop0: while (true) {
                for (a1 a1Var : list) {
                    z10 = z10 || a1Var.c().equals(m6.r.f13822k);
                }
            }
            if (!z10) {
                throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
            }
            this.f12145j = list;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(m6.i iVar, m6.i iVar2) {
            for (a1 a1Var : this.f12145j) {
                int a10 = a1Var.a(iVar, iVar2);
                if (a10 != 0) {
                    return a10;
                }
            }
            return 0;
        }
    }

    static {
        a1.a aVar = a1.a.ASCENDING;
        m6.r rVar = m6.r.f13822k;
        f12130k = a1.d(aVar, rVar);
        f12131l = a1.d(a1.a.DESCENDING, rVar);
    }

    public b1(m6.u uVar, String str) {
        this(uVar, str, Collections.emptyList(), Collections.emptyList(), -1L, a.LIMIT_TO_FIRST, null, null);
    }

    public b1(m6.u uVar, String str, List<r> list, List<a1> list2, long j10, a aVar, i iVar, i iVar2) {
        this.f12136e = uVar;
        this.f12137f = str;
        this.f12132a = list2;
        this.f12135d = list;
        this.f12138g = j10;
        this.f12139h = aVar;
        this.f12140i = iVar;
        this.f12141j = iVar2;
    }

    private boolean A(m6.i iVar) {
        m6.u r10 = iVar.getKey().r();
        return this.f12137f != null ? iVar.getKey().s(this.f12137f) && this.f12136e.p(r10) : m6.l.t(this.f12136e) ? this.f12136e.equals(r10) : this.f12136e.p(r10) && this.f12136e.q() == r10.q() - 1;
    }

    public static b1 b(m6.u uVar) {
        return new b1(uVar, null);
    }

    private boolean x(m6.i iVar) {
        i iVar2 = this.f12140i;
        if (iVar2 == null || iVar2.f(m(), iVar)) {
            i iVar3 = this.f12141j;
            return iVar3 == null || iVar3.e(m(), iVar);
        }
        return false;
    }

    private boolean y(m6.i iVar) {
        for (r rVar : this.f12135d) {
            if (!rVar.e(iVar)) {
                return false;
            }
        }
        return true;
    }

    private boolean z(m6.i iVar) {
        for (a1 a1Var : m()) {
            if (!a1Var.c().equals(m6.r.f13822k) && iVar.b(a1Var.f12120b) == null) {
                return false;
            }
        }
        return true;
    }

    public b1 B(a1 a1Var) {
        m6.r q10;
        q6.b.d(!s(), "No ordering is allowed for document query", new Object[0]);
        if (!this.f12132a.isEmpty() || (q10 = q()) == null || q10.equals(a1Var.f12120b)) {
            ArrayList arrayList = new ArrayList(this.f12132a);
            arrayList.add(a1Var);
            return new b1(this.f12136e, this.f12137f, this.f12135d, arrayList, this.f12138g, this.f12139h, this.f12140i, this.f12141j);
        }
        throw q6.b.a("First orderBy must match inequality field", new Object[0]);
    }

    public b1 C(i iVar) {
        return new b1(this.f12136e, this.f12137f, this.f12135d, this.f12132a, this.f12138g, this.f12139h, iVar, this.f12141j);
    }

    public g1 D() {
        if (this.f12134c == null) {
            if (this.f12139h == a.LIMIT_TO_FIRST) {
                this.f12134c = new g1(n(), f(), i(), m(), this.f12138g, o(), g());
            } else {
                ArrayList arrayList = new ArrayList();
                for (a1 a1Var : m()) {
                    a1.a b10 = a1Var.b();
                    a1.a aVar = a1.a.DESCENDING;
                    if (b10 == aVar) {
                        aVar = a1.a.ASCENDING;
                    }
                    arrayList.add(a1.d(aVar, a1Var.c()));
                }
                i iVar = this.f12141j;
                i iVar2 = iVar != null ? new i(iVar.b(), this.f12141j.c()) : null;
                i iVar3 = this.f12140i;
                this.f12134c = new g1(n(), f(), i(), arrayList, this.f12138g, iVar2, iVar3 != null ? new i(iVar3.b(), this.f12140i.c()) : null);
            }
        }
        return this.f12134c;
    }

    public b1 a(m6.u uVar) {
        return new b1(uVar, null, this.f12135d, this.f12132a, this.f12138g, this.f12139h, this.f12140i, this.f12141j);
    }

    public Comparator<m6.i> c() {
        return new b(m());
    }

    public b1 d(i iVar) {
        return new b1(this.f12136e, this.f12137f, this.f12135d, this.f12132a, this.f12138g, this.f12139h, this.f12140i, iVar);
    }

    public b1 e(r rVar) {
        boolean z10 = true;
        q6.b.d(!s(), "No filter is allowed for document query", new Object[0]);
        m6.r c10 = rVar.c();
        m6.r q10 = q();
        q6.b.d(q10 == null || c10 == null || q10.equals(c10), "Query must only have one inequality field", new Object[0]);
        if (!this.f12132a.isEmpty() && c10 != null && !this.f12132a.get(0).f12120b.equals(c10)) {
            z10 = false;
        }
        q6.b.d(z10, "First orderBy must match inequality field", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f12135d);
        arrayList.add(rVar);
        return new b1(this.f12136e, this.f12137f, arrayList, this.f12132a, this.f12138g, this.f12139h, this.f12140i, this.f12141j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.f12139h != b1Var.f12139h) {
            return false;
        }
        return D().equals(b1Var.D());
    }

    public String f() {
        return this.f12137f;
    }

    public i g() {
        return this.f12141j;
    }

    public List<a1> h() {
        return this.f12132a;
    }

    public int hashCode() {
        return (D().hashCode() * 31) + this.f12139h.hashCode();
    }

    public List<r> i() {
        return this.f12135d;
    }

    public m6.r j() {
        if (this.f12132a.isEmpty()) {
            return null;
        }
        return this.f12132a.get(0).c();
    }

    public long k() {
        return this.f12138g;
    }

    public a l() {
        return this.f12139h;
    }

    public List<a1> m() {
        List<a1> arrayList;
        a1.a aVar;
        if (this.f12133b == null) {
            m6.r q10 = q();
            m6.r j10 = j();
            boolean z10 = false;
            if (q10 == null || j10 != null) {
                arrayList = new ArrayList<>();
                for (a1 a1Var : this.f12132a) {
                    arrayList.add(a1Var);
                    if (a1Var.c().equals(m6.r.f13822k)) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    if (this.f12132a.size() > 0) {
                        List<a1> list = this.f12132a;
                        aVar = list.get(list.size() - 1).b();
                    } else {
                        aVar = a1.a.ASCENDING;
                    }
                    arrayList.add(aVar.equals(a1.a.ASCENDING) ? f12130k : f12131l);
                }
            } else {
                arrayList = q10.x() ? Collections.singletonList(f12130k) : Arrays.asList(a1.d(a1.a.ASCENDING, q10), f12130k);
            }
            this.f12133b = arrayList;
        }
        return this.f12133b;
    }

    public m6.u n() {
        return this.f12136e;
    }

    public i o() {
        return this.f12140i;
    }

    public boolean p() {
        return this.f12138g != -1;
    }

    public m6.r q() {
        for (r rVar : this.f12135d) {
            m6.r c10 = rVar.c();
            if (c10 != null) {
                return c10;
            }
        }
        return null;
    }

    public boolean r() {
        return this.f12137f != null;
    }

    public boolean s() {
        return m6.l.t(this.f12136e) && this.f12137f == null && this.f12135d.isEmpty();
    }

    public b1 t(long j10) {
        return new b1(this.f12136e, this.f12137f, this.f12135d, this.f12132a, j10, a.LIMIT_TO_FIRST, this.f12140i, this.f12141j);
    }

    public String toString() {
        return "Query(target=" + D().toString() + ";limitType=" + this.f12139h.toString() + ")";
    }

    public b1 u(long j10) {
        return new b1(this.f12136e, this.f12137f, this.f12135d, this.f12132a, j10, a.LIMIT_TO_LAST, this.f12140i, this.f12141j);
    }

    public boolean v(m6.i iVar) {
        return iVar.c() && A(iVar) && z(iVar) && y(iVar) && x(iVar);
    }

    public boolean w() {
        if (this.f12135d.isEmpty() && this.f12138g == -1 && this.f12140i == null && this.f12141j == null) {
            if (h().isEmpty()) {
                return true;
            }
            if (h().size() == 1 && j().x()) {
                return true;
            }
        }
        return false;
    }
}
