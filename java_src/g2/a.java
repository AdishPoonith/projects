package g2;

import java.io.EOFException;
import java.io.IOException;
import p3.n0;
import x1.b0;
import x1.c0;
import x1.m;
import x1.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final f f8885a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8886b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8887c;

    /* renamed from: d  reason: collision with root package name */
    private final i f8888d;

    /* renamed from: e  reason: collision with root package name */
    private int f8889e;

    /* renamed from: f  reason: collision with root package name */
    private long f8890f;

    /* renamed from: g  reason: collision with root package name */
    private long f8891g;

    /* renamed from: h  reason: collision with root package name */
    private long f8892h;

    /* renamed from: i  reason: collision with root package name */
    private long f8893i;

    /* renamed from: j  reason: collision with root package name */
    private long f8894j;

    /* renamed from: k  reason: collision with root package name */
    private long f8895k;

    /* renamed from: l  reason: collision with root package name */
    private long f8896l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements b0 {
        private b() {
        }

        @Override // x1.b0
        public boolean f() {
            return true;
        }

        @Override // x1.b0
        public b0.a g(long j10) {
            return new b0.a(new c0(j10, n0.r((a.this.f8886b + ((a.this.f8888d.c(j10) * (a.this.f8887c - a.this.f8886b)) / a.this.f8890f)) - 30000, a.this.f8886b, a.this.f8887c - 1)));
        }

        @Override // x1.b0
        public long h() {
            return a.this.f8888d.b(a.this.f8890f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        p3.a.a(j10 >= 0 && j11 > j10);
        this.f8888d = iVar;
        this.f8886b = j10;
        this.f8887c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f8890f = j13;
            this.f8889e = 4;
        } else {
            this.f8889e = 0;
        }
        this.f8885a = new f();
    }

    private long i(m mVar) {
        if (this.f8893i == this.f8894j) {
            return -1L;
        }
        long p10 = mVar.p();
        if (!this.f8885a.d(mVar, this.f8894j)) {
            long j10 = this.f8893i;
            if (j10 != p10) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f8885a.a(mVar, false);
        mVar.f();
        long j11 = this.f8892h;
        f fVar = this.f8885a;
        long j12 = fVar.f8916c;
        long j13 = j11 - j12;
        int i10 = fVar.f8921h + fVar.f8922i;
        if (0 > j13 || j13 >= 72000) {
            int i11 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
            if (i11 < 0) {
                this.f8894j = p10;
                this.f8896l = j12;
            } else {
                this.f8893i = mVar.p() + i10;
                this.f8895k = this.f8885a.f8916c;
            }
            long j14 = this.f8894j;
            long j15 = this.f8893i;
            if (j14 - j15 < 100000) {
                this.f8894j = j15;
                return j15;
            }
            long j16 = i10 * (i11 <= 0 ? 2L : 1L);
            long j17 = this.f8894j;
            long j18 = this.f8893i;
            return n0.r((mVar.p() - j16) + ((j13 * (j17 - j18)) / (this.f8896l - this.f8895k)), j18, j17 - 1);
        }
        return -1L;
    }

    private void k(m mVar) {
        while (true) {
            this.f8885a.c(mVar);
            this.f8885a.a(mVar, false);
            f fVar = this.f8885a;
            if (fVar.f8916c > this.f8892h) {
                mVar.f();
                return;
            }
            mVar.g(fVar.f8921h + fVar.f8922i);
            this.f8893i = mVar.p();
            this.f8895k = this.f8885a.f8916c;
        }
    }

    @Override // g2.g
    public long b(m mVar) {
        int i10 = this.f8889e;
        if (i10 == 0) {
            long p10 = mVar.p();
            this.f8891g = p10;
            this.f8889e = 1;
            long j10 = this.f8887c - 65307;
            if (j10 > p10) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(mVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f8889e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(mVar);
            this.f8889e = 4;
            return -(this.f8895k + 2);
        }
        this.f8890f = j(mVar);
        this.f8889e = 4;
        return this.f8891g;
    }

    @Override // g2.g
    public void c(long j10) {
        this.f8892h = n0.r(j10, 0L, this.f8890f - 1);
        this.f8889e = 2;
        this.f8893i = this.f8886b;
        this.f8894j = this.f8887c;
        this.f8895k = 0L;
        this.f8896l = this.f8890f;
    }

    @Override // g2.g
    /* renamed from: h */
    public b a() {
        if (this.f8890f != 0) {
            return new b();
        }
        return null;
    }

    long j(m mVar) {
        long j10;
        f fVar;
        this.f8885a.b();
        if (this.f8885a.c(mVar)) {
            this.f8885a.a(mVar, false);
            f fVar2 = this.f8885a;
            mVar.g(fVar2.f8921h + fVar2.f8922i);
            do {
                j10 = this.f8885a.f8916c;
                f fVar3 = this.f8885a;
                if ((fVar3.f8915b & 4) == 4 || !fVar3.c(mVar) || mVar.p() >= this.f8887c || !this.f8885a.a(mVar, true)) {
                    break;
                }
                fVar = this.f8885a;
            } while (o.e(mVar, fVar.f8921h + fVar.f8922i));
            return j10;
        }
        throw new EOFException();
    }
}
