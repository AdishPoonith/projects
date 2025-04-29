package j6;

import android.util.Pair;
import j6.a1;
import j6.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m6.q;
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    private String f12190a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a1> f12191b;

    /* renamed from: c  reason: collision with root package name */
    private final List<r> f12192c;

    /* renamed from: d  reason: collision with root package name */
    private final m6.u f12193d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12194e;

    /* renamed from: f  reason: collision with root package name */
    private final long f12195f;

    /* renamed from: g  reason: collision with root package name */
    private final i f12196g;

    /* renamed from: h  reason: collision with root package name */
    private final i f12197h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12198a;

        static {
            int[] iArr = new int[q.b.values().length];
            f12198a = iArr;
            try {
                iArr[q.b.ARRAY_CONTAINS_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12198a[q.b.ARRAY_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12198a[q.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12198a[q.b.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12198a[q.b.NOT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12198a[q.b.NOT_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12198a[q.b.LESS_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12198a[q.b.LESS_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12198a[q.b.GREATER_THAN_OR_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12198a[q.b.GREATER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public g1(m6.u uVar, String str, List<r> list, List<a1> list2, long j10, i iVar, i iVar2) {
        this.f12193d = uVar;
        this.f12194e = str;
        this.f12191b = list2;
        this.f12192c = list;
        this.f12195f = j10;
        this.f12196g = iVar;
        this.f12197h = iVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Pair<d7.b0, Boolean> b(q.c cVar, i iVar) {
        d7.b0 b0Var = m6.y.f13850c;
        Iterator<q> it = g(cVar.h()).iterator();
        boolean z10 = true;
        while (true) {
            int i10 = 0;
            boolean z11 = false;
            if (!it.hasNext()) {
                if (iVar != null) {
                    while (true) {
                        if (i10 < this.f12191b.size()) {
                            if (this.f12191b.get(i10).c().equals(cVar.h())) {
                                d7.b0 b0Var2 = iVar.b().get(i10);
                                if (m6.y.C(b0Var, z10, b0Var2, iVar.c()) < 0) {
                                    z10 = iVar.c();
                                    b0Var = b0Var2;
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                return new Pair<>(b0Var, Boolean.valueOf(z10));
            }
            q next = it.next();
            d7.b0 b0Var3 = m6.y.f13850c;
            switch (a.f12198a[next.h().ordinal()]) {
                case 3:
                case 4:
                case 9:
                    b0Var3 = next.i();
                    z11 = true;
                    break;
                case 5:
                case 6:
                default:
                    z11 = true;
                    break;
                case 7:
                case 8:
                    b0Var3 = m6.y.r(next.i().B0());
                    z11 = true;
                    break;
                case 10:
                    b0Var3 = next.i();
                    break;
            }
            if (m6.y.C(b0Var, z10, b0Var3, z11) < 0) {
                z10 = z11;
                b0Var = b0Var3;
            }
        }
    }

    private Pair<d7.b0, Boolean> e(q.c cVar, i iVar) {
        d7.b0 b0Var = m6.y.f13852e;
        Iterator<q> it = g(cVar.h()).iterator();
        boolean z10 = true;
        while (true) {
            int i10 = 0;
            r5 = false;
            boolean z11 = false;
            if (!it.hasNext()) {
                if (iVar != null) {
                    while (true) {
                        if (i10 < this.f12191b.size()) {
                            if (this.f12191b.get(i10).c().equals(cVar.h())) {
                                d7.b0 b0Var2 = iVar.b().get(i10);
                                if (m6.y.H(b0Var, z10, b0Var2, iVar.c()) > 0) {
                                    z10 = iVar.c();
                                    b0Var = b0Var2;
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                return new Pair<>(b0Var, Boolean.valueOf(z10));
            }
            q next = it.next();
            d7.b0 b0Var3 = m6.y.f13852e;
            switch (a.f12198a[next.h().ordinal()]) {
                case 3:
                case 4:
                case 8:
                    b0Var3 = next.i();
                case 5:
                case 6:
                default:
                    z11 = true;
                    break;
                case 7:
                    b0Var3 = next.i();
                    break;
                case 9:
                case 10:
                    b0Var3 = m6.y.s(next.i().B0());
                    break;
            }
            if (m6.y.H(b0Var, z10, b0Var3, z11) > 0) {
                z10 = z11;
                b0Var = b0Var3;
            }
        }
    }

    private List<q> g(m6.r rVar) {
        ArrayList arrayList = new ArrayList();
        for (r rVar2 : this.f12192c) {
            if (rVar2 instanceof q) {
                q qVar = (q) rVar2;
                if (qVar.g().equals(rVar)) {
                    arrayList.add(qVar);
                }
            }
        }
        return arrayList;
    }

    public List<d7.b0> a(m6.q qVar) {
        q.c c10 = qVar.c();
        if (c10 == null) {
            return null;
        }
        for (q qVar2 : g(c10.h())) {
            int i10 = a.f12198a[qVar2.h().ordinal()];
            if (i10 == 1) {
                return qVar2.i().q0().o();
            }
            if (i10 == 2) {
                return Collections.singletonList(qVar2.i());
            }
        }
        return null;
    }

    public String c() {
        String str = this.f12190a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n().h());
        if (this.f12194e != null) {
            sb.append("|cg:");
            sb.append(this.f12194e);
        }
        sb.append("|f:");
        for (r rVar : h()) {
            sb.append(rVar.a());
        }
        sb.append("|ob:");
        for (a1 a1Var : m()) {
            sb.append(a1Var.c().h());
            sb.append(a1Var.b().equals(a1.a.ASCENDING) ? "asc" : "desc");
        }
        if (r()) {
            sb.append("|l:");
            sb.append(j());
        }
        if (this.f12196g != null) {
            sb.append("|lb:");
            sb.append(this.f12196g.c() ? "b:" : "a:");
            sb.append(this.f12196g.d());
        }
        if (this.f12197h != null) {
            sb.append("|ub:");
            sb.append(this.f12197h.c() ? "a:" : "b:");
            sb.append(this.f12197h.d());
        }
        String sb2 = sb.toString();
        this.f12190a = sb2;
        return sb2;
    }

    public String d() {
        return this.f12194e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g1.class != obj.getClass()) {
            return false;
        }
        g1 g1Var = (g1) obj;
        String str = this.f12194e;
        if (str == null ? g1Var.f12194e == null : str.equals(g1Var.f12194e)) {
            if (this.f12195f == g1Var.f12195f && this.f12191b.equals(g1Var.f12191b) && this.f12192c.equals(g1Var.f12192c) && this.f12193d.equals(g1Var.f12193d)) {
                i iVar = this.f12196g;
                if (iVar == null ? g1Var.f12196g == null : iVar.equals(g1Var.f12196g)) {
                    i iVar2 = this.f12197h;
                    i iVar3 = g1Var.f12197h;
                    return iVar2 != null ? iVar2.equals(iVar3) : iVar3 == null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public i f() {
        return this.f12197h;
    }

    public List<r> h() {
        return this.f12192c;
    }

    public int hashCode() {
        int hashCode = this.f12191b.hashCode() * 31;
        String str = this.f12194e;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j10 = this.f12195f;
        int hashCode3 = (((((((hashCode + hashCode2) * 31) + this.f12192c.hashCode()) * 31) + this.f12193d.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        i iVar = this.f12196g;
        int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        i iVar2 = this.f12197h;
        return hashCode4 + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    public a1.a i() {
        List<a1> list = this.f12191b;
        return list.get(list.size() - 1).b();
    }

    public long j() {
        return this.f12195f;
    }

    public i k(m6.q qVar) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (q.c cVar : qVar.e()) {
            Pair<d7.b0, Boolean> b10 = cVar.i().equals(q.c.a.ASCENDING) ? b(cVar, this.f12196g) : e(cVar, this.f12196g);
            arrayList.add((d7.b0) b10.first);
            z10 &= ((Boolean) b10.second).booleanValue();
        }
        return new i(arrayList, z10);
    }

    public Collection<d7.b0> l(m6.q qVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (q.c cVar : qVar.e()) {
            for (q qVar2 : g(cVar.h())) {
                int i10 = a.f12198a[qVar2.h().ordinal()];
                if (i10 == 3 || i10 == 4) {
                    linkedHashMap.put(cVar.h(), qVar2.i());
                } else if (i10 == 5 || i10 == 6) {
                    linkedHashMap.put(cVar.h(), qVar2.i());
                    return linkedHashMap.values();
                }
            }
        }
        return null;
    }

    public List<a1> m() {
        return this.f12191b;
    }

    public m6.u n() {
        return this.f12193d;
    }

    public int o() {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (r rVar : this.f12192c) {
            for (q qVar : rVar.d()) {
                if (!qVar.g().x()) {
                    if (qVar.h().equals(q.b.ARRAY_CONTAINS) || qVar.h().equals(q.b.ARRAY_CONTAINS_ANY)) {
                        i10 = 1;
                    } else {
                        hashSet.add(qVar.g());
                    }
                }
            }
        }
        for (a1 a1Var : this.f12191b) {
            if (!a1Var.c().x()) {
                hashSet.add(a1Var.c());
            }
        }
        return hashSet.size() + i10;
    }

    public i p() {
        return this.f12196g;
    }

    public i q(m6.q qVar) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (q.c cVar : qVar.e()) {
            Pair<d7.b0, Boolean> e10 = cVar.i().equals(q.c.a.ASCENDING) ? e(cVar, this.f12197h) : b(cVar, this.f12197h);
            arrayList.add((d7.b0) e10.first);
            z10 &= ((Boolean) e10.second).booleanValue();
        }
        return new i(arrayList, z10);
    }

    public boolean r() {
        return this.f12195f != -1;
    }

    public boolean s() {
        return m6.l.t(this.f12193d) && this.f12194e == null && this.f12192c.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append(this.f12193d.h());
        if (this.f12194e != null) {
            sb.append(" collectionGroup=");
            sb.append(this.f12194e);
        }
        if (!this.f12192c.isEmpty()) {
            sb.append(" where ");
            for (int i10 = 0; i10 < this.f12192c.size(); i10++) {
                if (i10 > 0) {
                    sb.append(" and ");
                }
                sb.append(this.f12192c.get(i10));
            }
        }
        if (!this.f12191b.isEmpty()) {
            sb.append(" order by ");
            for (int i11 = 0; i11 < this.f12191b.size(); i11++) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f12191b.get(i11));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
