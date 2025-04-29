package h2;

import p3.n0;
import x1.a;
/* loaded from: classes.dex */
final class e0 extends x1.a {

    /* loaded from: classes.dex */
    private static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final p3.j0 f9142a;

        /* renamed from: b  reason: collision with root package name */
        private final p3.a0 f9143b = new p3.a0();

        /* renamed from: c  reason: collision with root package name */
        private final int f9144c;

        /* renamed from: d  reason: collision with root package name */
        private final int f9145d;

        public a(int i10, p3.j0 j0Var, int i11) {
            this.f9144c = i10;
            this.f9142a = j0Var;
            this.f9145d = i11;
        }

        private a.e c(p3.a0 a0Var, long j10, long j11) {
            int a10;
            int a11;
            int g10 = a0Var.g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (a0Var.a() >= 188 && (a11 = (a10 = j0.a(a0Var.e(), a0Var.f(), g10)) + 188) <= g10) {
                long c10 = j0.c(a0Var, a10, this.f9144c);
                if (c10 != -9223372036854775807L) {
                    long b10 = this.f9142a.b(c10);
                    if (b10 > j10) {
                        return j14 == -9223372036854775807L ? a.e.d(b10, j11) : a.e.e(j11 + j13);
                    } else if (100000 + b10 > j10) {
                        return a.e.e(j11 + a10);
                    } else {
                        j13 = a10;
                        j14 = b10;
                    }
                }
                a0Var.T(a11);
                j12 = a11;
            }
            return j14 != -9223372036854775807L ? a.e.f(j14, j11 + j12) : a.e.f20098d;
        }

        @Override // x1.a.f
        public a.e a(x1.m mVar, long j10) {
            long p10 = mVar.p();
            int min = (int) Math.min(this.f9145d, mVar.a() - p10);
            this.f9143b.P(min);
            mVar.n(this.f9143b.e(), 0, min);
            return c(this.f9143b, j10, p10);
        }

        @Override // x1.a.f
        public void b() {
            this.f9143b.Q(n0.f15402f);
        }
    }

    public e0(p3.j0 j0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, j0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
