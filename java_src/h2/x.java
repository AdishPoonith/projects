package h2;

import p3.n0;
import x1.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends x1.a {

    /* loaded from: classes.dex */
    private static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final p3.j0 f9448a;

        /* renamed from: b  reason: collision with root package name */
        private final p3.a0 f9449b;

        private b(p3.j0 j0Var) {
            this.f9448a = j0Var;
            this.f9449b = new p3.a0();
        }

        private a.e c(p3.a0 a0Var, long j10, long j11) {
            int i10 = -1;
            long j12 = -9223372036854775807L;
            int i11 = -1;
            while (a0Var.a() >= 4) {
                if (x.k(a0Var.e(), a0Var.f()) != 442) {
                    a0Var.U(1);
                } else {
                    a0Var.U(4);
                    long l10 = y.l(a0Var);
                    if (l10 != -9223372036854775807L) {
                        long b10 = this.f9448a.b(l10);
                        if (b10 > j10) {
                            return j12 == -9223372036854775807L ? a.e.d(b10, j11) : a.e.e(j11 + i11);
                        } else if (100000 + b10 > j10) {
                            return a.e.e(j11 + a0Var.f());
                        } else {
                            i11 = a0Var.f();
                            j12 = b10;
                        }
                    }
                    d(a0Var);
                    i10 = a0Var.f();
                }
            }
            return j12 != -9223372036854775807L ? a.e.f(j12, j11 + i10) : a.e.f20098d;
        }

        private static void d(p3.a0 a0Var) {
            int k10;
            int g10 = a0Var.g();
            if (a0Var.a() < 10) {
                a0Var.T(g10);
                return;
            }
            a0Var.U(9);
            int G = a0Var.G() & 7;
            if (a0Var.a() < G) {
                a0Var.T(g10);
                return;
            }
            a0Var.U(G);
            if (a0Var.a() < 4) {
                a0Var.T(g10);
                return;
            }
            if (x.k(a0Var.e(), a0Var.f()) == 443) {
                a0Var.U(4);
                int M = a0Var.M();
                if (a0Var.a() < M) {
                    a0Var.T(g10);
                    return;
                }
                a0Var.U(M);
            }
            while (a0Var.a() >= 4 && (k10 = x.k(a0Var.e(), a0Var.f())) != 442 && k10 != 441 && (k10 >>> 8) == 1) {
                a0Var.U(4);
                if (a0Var.a() < 2) {
                    a0Var.T(g10);
                    return;
                }
                a0Var.T(Math.min(a0Var.g(), a0Var.f() + a0Var.M()));
            }
        }

        @Override // x1.a.f
        public a.e a(x1.m mVar, long j10) {
            long p10 = mVar.p();
            int min = (int) Math.min(20000L, mVar.a() - p10);
            this.f9449b.P(min);
            mVar.n(this.f9449b.e(), 0, min);
            return c(this.f9449b, j10, p10);
        }

        @Override // x1.a.f
        public void b() {
            this.f9449b.Q(n0.f15402f);
        }
    }

    public x(p3.j0 j0Var, long j10, long j11) {
        super(new a.b(), new b(j0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
