package v1;

import s1.n1;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f19374a;

    /* renamed from: b  reason: collision with root package name */
    public final n1 f19375b;

    /* renamed from: c  reason: collision with root package name */
    public final n1 f19376c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19377d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19378e;

    public i(String str, n1 n1Var, n1 n1Var2, int i10, int i11) {
        p3.a.a(i10 == 0 || i11 == 0);
        this.f19374a = p3.a.d(str);
        this.f19375b = (n1) p3.a.e(n1Var);
        this.f19376c = (n1) p3.a.e(n1Var2);
        this.f19377d = i10;
        this.f19378e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f19377d == iVar.f19377d && this.f19378e == iVar.f19378e && this.f19374a.equals(iVar.f19374a) && this.f19375b.equals(iVar.f19375b) && this.f19376c.equals(iVar.f19376c);
    }

    public int hashCode() {
        return ((((((((527 + this.f19377d) * 31) + this.f19378e) * 31) + this.f19374a.hashCode()) * 31) + this.f19375b.hashCode()) * 31) + this.f19376c.hashCode();
    }
}
