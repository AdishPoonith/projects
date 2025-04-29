package y2;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p3.n0;
import s1.n1;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    final i f20445a;

    /* renamed from: b  reason: collision with root package name */
    final long f20446b;

    /* renamed from: c  reason: collision with root package name */
    final long f20447c;

    /* loaded from: classes.dex */
    public static abstract class a extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f20448d;

        /* renamed from: e  reason: collision with root package name */
        final long f20449e;

        /* renamed from: f  reason: collision with root package name */
        final List<d> f20450f;

        /* renamed from: g  reason: collision with root package name */
        private final long f20451g;

        /* renamed from: h  reason: collision with root package name */
        private final long f20452h;

        /* renamed from: i  reason: collision with root package name */
        final long f20453i;

        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f20448d = j12;
            this.f20449e = j13;
            this.f20450f = list;
            this.f20453i = j14;
            this.f20451g = j15;
            this.f20452h = j16;
        }

        public long c(long j10, long j11) {
            long g10 = g(j10);
            return g10 != -1 ? g10 : (int) (i((j11 - this.f20452h) + this.f20453i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f20451g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f20452h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f20448d;
        }

        public long f(long j10, long j11) {
            if (this.f20450f != null) {
                return -9223372036854775807L;
            }
            long d10 = d(j10, j11) + c(j10, j11);
            return (j(d10) + h(d10, j10)) - this.f20453i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List<d> list = this.f20450f;
            if (list != null) {
                return (list.get((int) (j10 - this.f20448d)).f20459b * 1000000) / this.f20446b;
            }
            long g10 = g(j11);
            return (g10 == -1 || j10 != (e() + g10) - 1) ? (this.f20449e * 1000000) / this.f20446b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long e10 = e();
            long g10 = g(j11);
            if (g10 == 0) {
                return e10;
            }
            if (this.f20450f == null) {
                long j12 = this.f20448d + (j10 / ((this.f20449e * 1000000) / this.f20446b));
                return j12 < e10 ? e10 : g10 == -1 ? j12 : Math.min(j12, (e10 + g10) - 1);
            }
            long j13 = (g10 + e10) - 1;
            long j14 = e10;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                int i10 = (j(j15) > j10 ? 1 : (j(j15) == j10 ? 0 : -1));
                if (i10 < 0) {
                    j14 = j15 + 1;
                } else if (i10 <= 0) {
                    return j15;
                } else {
                    j13 = j15 - 1;
                }
            }
            return j14 == e10 ? j14 : j13;
        }

        public final long j(long j10) {
            List<d> list = this.f20450f;
            return n0.N0(list != null ? list.get((int) (j10 - this.f20448d)).f20458a - this.f20447c : (j10 - this.f20448d) * this.f20449e, 1000000L, this.f20446b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f20450f != null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: j  reason: collision with root package name */
        final List<i> f20454j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f20454j = list2;
        }

        @Override // y2.k.a
        public long g(long j10) {
            return this.f20454j.size();
        }

        @Override // y2.k.a
        public i k(j jVar, long j10) {
            return this.f20454j.get((int) (j10 - this.f20448d));
        }

        @Override // y2.k.a
        public boolean l() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: j  reason: collision with root package name */
        final n f20455j;

        /* renamed from: k  reason: collision with root package name */
        final n f20456k;

        /* renamed from: l  reason: collision with root package name */
        final long f20457l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f20455j = nVar;
            this.f20456k = nVar2;
            this.f20457l = j13;
        }

        @Override // y2.k
        public i a(j jVar) {
            n nVar = this.f20455j;
            if (nVar != null) {
                n1 n1Var = jVar.f20432b;
                return new i(nVar.a(n1Var.f17408j, 0L, n1Var.f17415q, 0L), 0L, -1L);
            }
            return super.a(jVar);
        }

        @Override // y2.k.a
        public long g(long j10) {
            List<d> list = this.f20450f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f20457l;
            if (j11 != -1) {
                return (j11 - this.f20448d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return d5.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f20446b)), BigInteger.valueOf(this.f20449e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // y2.k.a
        public i k(j jVar, long j10) {
            List<d> list = this.f20450f;
            long j11 = list != null ? list.get((int) (j10 - this.f20448d)).f20458a : (j10 - this.f20448d) * this.f20449e;
            n nVar = this.f20456k;
            n1 n1Var = jVar.f20432b;
            return new i(nVar.a(n1Var.f17408j, j10, n1Var.f17415q, j11), 0L, -1L);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final long f20458a;

        /* renamed from: b  reason: collision with root package name */
        final long f20459b;

        public d(long j10, long j11) {
            this.f20458a = j10;
            this.f20459b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f20458a == dVar.f20458a && this.f20459b == dVar.f20459b;
        }

        public int hashCode() {
            return (((int) this.f20458a) * 31) + ((int) this.f20459b);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f20460d;

        /* renamed from: e  reason: collision with root package name */
        final long f20461e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f20460d = j12;
            this.f20461e = j13;
        }

        public i c() {
            long j10 = this.f20461e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f20460d, j10);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f20445a = iVar;
        this.f20446b = j10;
        this.f20447c = j11;
    }

    public i a(j jVar) {
        return this.f20445a;
    }

    public long b() {
        return n0.N0(this.f20447c, 1000000L, this.f20446b);
    }
}
