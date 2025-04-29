package h2;

import h2.i0;
import s1.n1;
/* loaded from: classes.dex */
public final class r implements m {

    /* renamed from: b  reason: collision with root package name */
    private x1.e0 f9390b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9391c;

    /* renamed from: e  reason: collision with root package name */
    private int f9393e;

    /* renamed from: f  reason: collision with root package name */
    private int f9394f;

    /* renamed from: a  reason: collision with root package name */
    private final p3.a0 f9389a = new p3.a0(10);

    /* renamed from: d  reason: collision with root package name */
    private long f9392d = -9223372036854775807L;

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f9390b);
        if (this.f9391c) {
            int a10 = a0Var.a();
            int i10 = this.f9394f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(a0Var.e(), a0Var.f(), this.f9389a.e(), this.f9394f, min);
                if (this.f9394f + min == 10) {
                    this.f9389a.T(0);
                    if (73 != this.f9389a.G() || 68 != this.f9389a.G() || 51 != this.f9389a.G()) {
                        p3.r.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f9391c = false;
                        return;
                    }
                    this.f9389a.U(3);
                    this.f9393e = this.f9389a.F() + 10;
                }
            }
            int min2 = Math.min(a10, this.f9393e - this.f9394f);
            this.f9390b.d(a0Var, min2);
            this.f9394f += min2;
        }
    }

    @Override // h2.m
    public void b() {
        this.f9391c = false;
        this.f9392d = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        x1.e0 d10 = nVar.d(dVar.c(), 5);
        this.f9390b = d10;
        d10.e(new n1.b().U(dVar.b()).g0("application/id3").G());
    }

    @Override // h2.m
    public void d() {
        int i10;
        p3.a.h(this.f9390b);
        if (this.f9391c && (i10 = this.f9393e) != 0 && this.f9394f == i10) {
            long j10 = this.f9392d;
            if (j10 != -9223372036854775807L) {
                this.f9390b.c(j10, 1, i10, 0, null);
            }
            this.f9391c = false;
        }
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f9391c = true;
        if (j10 != -9223372036854775807L) {
            this.f9392d = j10;
        }
        this.f9393e = 0;
        this.f9394f = 0;
    }
}
