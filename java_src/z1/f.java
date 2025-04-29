package z1;

import com.google.common.collect.q;
import com.google.common.collect.s0;
import p3.a0;
/* loaded from: classes.dex */
final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final q<a> f20716a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20717b;

    private f(int i10, q<a> qVar) {
        this.f20717b = i10;
        this.f20716a = qVar;
    }

    private static a b(int i10, int i11, a0 a0Var) {
        switch (i10) {
            case 1718776947:
                return g.e(i11, a0Var);
            case 1751742049:
                return c.c(a0Var);
            case 1752331379:
                return d.d(a0Var);
            case 1852994675:
                return h.b(a0Var);
            default:
                return null;
        }
    }

    public static f d(int i10, a0 a0Var) {
        q.a aVar = new q.a();
        int g10 = a0Var.g();
        int i11 = -2;
        while (a0Var.a() > 8) {
            int t10 = a0Var.t();
            int f10 = a0Var.f() + a0Var.t();
            a0Var.S(f10);
            a d10 = t10 == 1414744396 ? d(a0Var.t(), a0Var) : b(t10, i11, a0Var);
            if (d10 != null) {
                if (d10.a() == 1752331379) {
                    i11 = ((d) d10).c();
                }
                aVar.a(d10);
            }
            a0Var.T(f10);
            a0Var.S(g10);
        }
        return new f(i10, aVar.h());
    }

    @Override // z1.a
    public int a() {
        return this.f20717b;
    }

    public <T extends a> T c(Class<T> cls) {
        s0<a> it = this.f20716a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }
}
