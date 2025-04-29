package j6;

import j6.a1;
import java.util.List;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12205a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d7.b0> f12206b;

    public i(List<d7.b0> list, boolean z10) {
        this.f12206b = list;
        this.f12205a = z10;
    }

    private int a(List<a1> list, m6.i iVar) {
        int i10;
        q6.b.d(this.f12206b.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f12206b.size(); i12++) {
            a1 a1Var = list.get(i12);
            d7.b0 b0Var = this.f12206b.get(i12);
            if (a1Var.f12120b.equals(m6.r.f13822k)) {
                q6.b.d(m6.y.B(b0Var), "Bound has a non-key value where the key path is being used %s", b0Var);
                i10 = m6.l.k(b0Var.y0()).compareTo(iVar.getKey());
            } else {
                d7.b0 b10 = iVar.b(a1Var.c());
                q6.b.d(b10 != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                i10 = m6.y.i(b0Var, b10);
            }
            if (a1Var.b().equals(a1.a.DESCENDING)) {
                i10 *= -1;
            }
            i11 = i10;
            if (i11 != 0) {
                break;
            }
        }
        return i11;
    }

    public List<d7.b0> b() {
        return this.f12206b;
    }

    public boolean c() {
        return this.f12205a;
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        boolean z10 = true;
        for (d7.b0 b0Var : this.f12206b) {
            if (!z10) {
                sb.append(",");
            }
            z10 = false;
            sb.append(m6.y.b(b0Var));
        }
        return sb.toString();
    }

    public boolean e(List<a1> list, m6.i iVar) {
        int a10 = a(list, iVar);
        if (this.f12205a) {
            if (a10 >= 0) {
                return true;
            }
        } else if (a10 > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f12205a == iVar.f12205a && this.f12206b.equals(iVar.f12206b);
    }

    public boolean f(List<a1> list, m6.i iVar) {
        int a10 = a(list, iVar);
        if (this.f12205a) {
            if (a10 <= 0) {
                return true;
            }
        } else if (a10 < 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12205a ? 1 : 0) * 31) + this.f12206b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bound(inclusive=");
        sb.append(this.f12205a);
        sb.append(", position=");
        for (int i10 = 0; i10 < this.f12206b.size(); i10++) {
            if (i10 > 0) {
                sb.append(" and ");
            }
            sb.append(m6.y.b(this.f12206b.get(i10)));
        }
        sb.append(")");
        return sb.toString();
    }
}
