package g2;

import g2.i;
import java.util.Arrays;
import p3.a0;
import p3.n0;
import x1.b0;
import x1.m;
import x1.s;
import x1.t;
import x1.u;
import x1.v;
/* loaded from: classes.dex */
final class b extends i {

    /* renamed from: n  reason: collision with root package name */
    private v f8898n;

    /* renamed from: o  reason: collision with root package name */
    private a f8899o;

    /* loaded from: classes.dex */
    private static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private v f8900a;

        /* renamed from: b  reason: collision with root package name */
        private v.a f8901b;

        /* renamed from: c  reason: collision with root package name */
        private long f8902c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f8903d = -1;

        public a(v vVar, v.a aVar) {
            this.f8900a = vVar;
            this.f8901b = aVar;
        }

        @Override // g2.g
        public b0 a() {
            p3.a.f(this.f8902c != -1);
            return new u(this.f8900a, this.f8902c);
        }

        @Override // g2.g
        public long b(m mVar) {
            long j10 = this.f8903d;
            if (j10 >= 0) {
                long j11 = -(j10 + 2);
                this.f8903d = -1L;
                return j11;
            }
            return -1L;
        }

        @Override // g2.g
        public void c(long j10) {
            long[] jArr = this.f8901b.f20208a;
            this.f8903d = jArr[n0.i(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f8902c = j10;
        }
    }

    private int n(a0 a0Var) {
        int i10 = (a0Var.e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            a0Var.U(4);
            a0Var.N();
        }
        int j10 = s.j(a0Var, i10);
        a0Var.T(0);
        return j10;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(a0 a0Var) {
        return a0Var.a() >= 5 && a0Var.G() == 127 && a0Var.I() == 1179402563;
    }

    @Override // g2.i
    protected long f(a0 a0Var) {
        if (o(a0Var.e())) {
            return n(a0Var);
        }
        return -1L;
    }

    @Override // g2.i
    protected boolean h(a0 a0Var, long j10, i.b bVar) {
        byte[] e10 = a0Var.e();
        v vVar = this.f8898n;
        if (vVar == null) {
            v vVar2 = new v(e10, 17);
            this.f8898n = vVar2;
            bVar.f8941a = vVar2.g(Arrays.copyOfRange(e10, 9, a0Var.g()), null);
            return true;
        } else if ((e10[0] & Byte.MAX_VALUE) == 3) {
            v.a f10 = t.f(a0Var);
            v b10 = vVar.b(f10);
            this.f8898n = b10;
            this.f8899o = new a(b10, f10);
            return true;
        } else if (o(e10)) {
            a aVar = this.f8899o;
            if (aVar != null) {
                aVar.d(j10);
                bVar.f8942b = this.f8899o;
            }
            p3.a.e(bVar.f8941a);
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g2.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f8898n = null;
            this.f8899o = null;
        }
    }
}
