package n6;

import d7.b;
import d7.b0;
import java.util.Collections;
import java.util.List;
import m6.y;
/* loaded from: classes.dex */
public abstract class a implements p {

    /* renamed from: a  reason: collision with root package name */
    private final List<b0> f14306a;

    /* renamed from: n6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0208a extends a {
        public C0208a(List<b0> list) {
            super(list);
        }

        @Override // n6.a
        protected b0 d(b0 b0Var) {
            b.C0121b e10 = a.e(b0Var);
            for (b0 b0Var2 : f()) {
                int i10 = 0;
                while (i10 < e10.K()) {
                    if (y.q(e10.J(i10), b0Var2)) {
                        e10.L(i10);
                    } else {
                        i10++;
                    }
                }
            }
            return b0.C0().I(e10).b();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(List<b0> list) {
            super(list);
        }

        @Override // n6.a
        protected b0 d(b0 b0Var) {
            b.C0121b e10 = a.e(b0Var);
            for (b0 b0Var2 : f()) {
                if (!y.p(e10, b0Var2)) {
                    e10.I(b0Var2);
                }
            }
            return b0.C0().I(e10).b();
        }
    }

    a(List<b0> list) {
        this.f14306a = Collections.unmodifiableList(list);
    }

    static b.C0121b e(b0 b0Var) {
        return y.t(b0Var) ? b0Var.q0().d() : d7.b.o0();
    }

    @Override // n6.p
    public b0 a(b0 b0Var) {
        return null;
    }

    @Override // n6.p
    public b0 b(b0 b0Var, w5.q qVar) {
        return d(b0Var);
    }

    @Override // n6.p
    public b0 c(b0 b0Var, b0 b0Var2) {
        return d(b0Var);
    }

    protected abstract b0 d(b0 b0Var);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f14306a.equals(((a) obj).f14306a);
    }

    public List<b0> f() {
        return this.f14306a;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.f14306a.hashCode();
    }
}
