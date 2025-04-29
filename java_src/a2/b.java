package a2;

import java.util.Objects;
import x1.a;
import x1.m;
import x1.s;
import x1.v;
/* loaded from: classes.dex */
final class b extends x1.a {

    /* renamed from: a2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0002b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final v f40a;

        /* renamed from: b  reason: collision with root package name */
        private final int f41b;

        /* renamed from: c  reason: collision with root package name */
        private final s.a f42c;

        private C0002b(v vVar, int i10) {
            this.f40a = vVar;
            this.f41b = i10;
            this.f42c = new s.a();
        }

        private long c(m mVar) {
            while (mVar.l() < mVar.a() - 6 && !s.h(mVar, this.f40a, this.f41b, this.f42c)) {
                mVar.o(1);
            }
            if (mVar.l() >= mVar.a() - 6) {
                mVar.o((int) (mVar.a() - mVar.l()));
                return this.f40a.f20205j;
            }
            return this.f42c.f20192a;
        }

        @Override // x1.a.f
        public a.e a(m mVar, long j10) {
            long p10 = mVar.p();
            long c10 = c(mVar);
            long l10 = mVar.l();
            mVar.o(Math.max(6, this.f40a.f20198c));
            long c11 = c(mVar);
            return (c10 > j10 || c11 <= j10) ? c11 <= j10 ? a.e.f(c11, mVar.l()) : a.e.d(c10, p10) : a.e.e(l10);
        }

        @Override // x1.a.f
        public /* synthetic */ void b() {
            x1.b.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final v vVar, int i10, long j10, long j11) {
        super(new a.d() { // from class: a2.a
            @Override // x1.a.d
            public final long a(long j12) {
                return v.this.i(j12);
            }
        }, new C0002b(vVar, i10), vVar.f(), 0L, vVar.f20205j, j10, j11, vVar.d(), Math.max(6, vVar.f20198c));
        Objects.requireNonNull(vVar);
    }
}
