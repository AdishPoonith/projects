package n6;

import d7.b0;
import m6.y;
/* loaded from: classes.dex */
public class j implements p {

    /* renamed from: a  reason: collision with root package name */
    private b0 f14327a;

    public j(b0 b0Var) {
        q6.b.d(y.A(b0Var), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f14327a = b0Var;
    }

    private double e() {
        if (y.u(this.f14327a)) {
            return this.f14327a.u0();
        }
        if (y.v(this.f14327a)) {
            return this.f14327a.w0();
        }
        throw q6.b.a("Expected 'operand' to be of Number type, but was " + this.f14327a.getClass().getCanonicalName(), new Object[0]);
    }

    private long f() {
        if (y.u(this.f14327a)) {
            return (long) this.f14327a.u0();
        }
        if (y.v(this.f14327a)) {
            return this.f14327a.w0();
        }
        throw q6.b.a("Expected 'operand' to be of Number type, but was " + this.f14327a.getClass().getCanonicalName(), new Object[0]);
    }

    private long g(long j10, long j11) {
        long j12 = j10 + j11;
        return ((j10 ^ j12) & (j11 ^ j12)) >= 0 ? j12 : j12 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    @Override // n6.p
    public b0 a(b0 b0Var) {
        return y.A(b0Var) ? b0Var : b0.C0().O(0L).b();
    }

    @Override // n6.p
    public b0 b(b0 b0Var, w5.q qVar) {
        double u02;
        b0.b M;
        b0 a10 = a(b0Var);
        if (y.v(a10) && y.v(this.f14327a)) {
            M = b0.C0().O(g(a10.w0(), f()));
        } else {
            if (y.v(a10)) {
                u02 = a10.w0();
            } else {
                q6.b.d(y.u(a10), "Expected NumberValue to be of type DoubleValue, but was ", b0Var.getClass().getCanonicalName());
                u02 = a10.u0();
            }
            M = b0.C0().M(u02 + e());
        }
        return M.b();
    }

    @Override // n6.p
    public b0 c(b0 b0Var, b0 b0Var2) {
        return b0Var2;
    }

    public b0 d() {
        return this.f14327a;
    }
}
