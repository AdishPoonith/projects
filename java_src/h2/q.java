package h2;

import h2.i0;
import java.util.Collections;
import p3.n0;
import p3.w;
import s1.n1;
/* loaded from: classes.dex */
public final class q implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f9362a;

    /* renamed from: b  reason: collision with root package name */
    private String f9363b;

    /* renamed from: c  reason: collision with root package name */
    private x1.e0 f9364c;

    /* renamed from: d  reason: collision with root package name */
    private a f9365d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9366e;

    /* renamed from: l  reason: collision with root package name */
    private long f9373l;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f9367f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final u f9368g = new u(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final u f9369h = new u(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final u f9370i = new u(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final u f9371j = new u(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final u f9372k = new u(40, 128);

    /* renamed from: m  reason: collision with root package name */
    private long f9374m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private final p3.a0 f9375n = new p3.a0();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final x1.e0 f9376a;

        /* renamed from: b  reason: collision with root package name */
        private long f9377b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f9378c;

        /* renamed from: d  reason: collision with root package name */
        private int f9379d;

        /* renamed from: e  reason: collision with root package name */
        private long f9380e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f9381f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f9382g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f9383h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f9384i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f9385j;

        /* renamed from: k  reason: collision with root package name */
        private long f9386k;

        /* renamed from: l  reason: collision with root package name */
        private long f9387l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f9388m;

        public a(x1.e0 e0Var) {
            this.f9376a = e0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void d(int i10) {
            long j10 = this.f9387l;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f9388m;
            this.f9376a.c(j10, z10 ? 1 : 0, (int) (this.f9377b - this.f9386k), i10, null);
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f9385j && this.f9382g) {
                this.f9388m = this.f9378c;
                this.f9385j = false;
            } else if (this.f9383h || this.f9382g) {
                if (z10 && this.f9384i) {
                    d(i10 + ((int) (j10 - this.f9377b)));
                }
                this.f9386k = this.f9377b;
                this.f9387l = this.f9380e;
                this.f9388m = this.f9378c;
                this.f9384i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f9381f) {
                int i12 = this.f9379d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f9379d = i12 + (i11 - i10);
                    return;
                }
                this.f9382g = (bArr[i13] & 128) != 0;
                this.f9381f = false;
            }
        }

        public void f() {
            this.f9381f = false;
            this.f9382g = false;
            this.f9383h = false;
            this.f9384i = false;
            this.f9385j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11 = false;
            this.f9382g = false;
            this.f9383h = false;
            this.f9380e = j11;
            this.f9379d = 0;
            this.f9377b = j10;
            if (!c(i11)) {
                if (this.f9384i && !this.f9385j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f9384i = false;
                }
                if (b(i11)) {
                    this.f9383h = !this.f9385j;
                    this.f9385j = true;
                }
            }
            boolean z12 = i11 >= 16 && i11 <= 21;
            this.f9378c = z12;
            this.f9381f = (z12 || i11 <= 9) ? true : true;
        }
    }

    public q(d0 d0Var) {
        this.f9362a = d0Var;
    }

    private void f() {
        p3.a.h(this.f9364c);
        n0.j(this.f9365d);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f9365d.a(j10, i10, this.f9366e);
        if (!this.f9366e) {
            this.f9368g.b(i11);
            this.f9369h.b(i11);
            this.f9370i.b(i11);
            if (this.f9368g.c() && this.f9369h.c() && this.f9370i.c()) {
                this.f9364c.e(i(this.f9363b, this.f9368g, this.f9369h, this.f9370i));
                this.f9366e = true;
            }
        }
        if (this.f9371j.b(i11)) {
            u uVar = this.f9371j;
            this.f9375n.R(this.f9371j.f9431d, p3.w.q(uVar.f9431d, uVar.f9432e));
            this.f9375n.U(5);
            this.f9362a.a(j11, this.f9375n);
        }
        if (this.f9372k.b(i11)) {
            u uVar2 = this.f9372k;
            this.f9375n.R(this.f9372k.f9431d, p3.w.q(uVar2.f9431d, uVar2.f9432e));
            this.f9375n.U(5);
            this.f9362a.a(j11, this.f9375n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f9365d.e(bArr, i10, i11);
        if (!this.f9366e) {
            this.f9368g.a(bArr, i10, i11);
            this.f9369h.a(bArr, i10, i11);
            this.f9370i.a(bArr, i10, i11);
        }
        this.f9371j.a(bArr, i10, i11);
        this.f9372k.a(bArr, i10, i11);
    }

    private static n1 i(String str, u uVar, u uVar2, u uVar3) {
        int i10 = uVar.f9432e;
        byte[] bArr = new byte[uVar2.f9432e + i10 + uVar3.f9432e];
        System.arraycopy(uVar.f9431d, 0, bArr, 0, i10);
        System.arraycopy(uVar2.f9431d, 0, bArr, uVar.f9432e, uVar2.f9432e);
        System.arraycopy(uVar3.f9431d, 0, bArr, uVar.f9432e + uVar2.f9432e, uVar3.f9432e);
        w.a h10 = p3.w.h(uVar2.f9431d, 3, uVar2.f9432e);
        return new n1.b().U(str).g0("video/hevc").K(p3.e.c(h10.f15447a, h10.f15448b, h10.f15449c, h10.f15450d, h10.f15451e, h10.f15452f)).n0(h10.f15454h).S(h10.f15455i).c0(h10.f15456j).V(Collections.singletonList(bArr)).G();
    }

    private void j(long j10, int i10, int i11, long j11) {
        this.f9365d.g(j10, i10, i11, j11, this.f9366e);
        if (!this.f9366e) {
            this.f9368g.e(i11);
            this.f9369h.e(i11);
            this.f9370i.e(i11);
        }
        this.f9371j.e(i11);
        this.f9372k.e(i11);
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        f();
        while (a0Var.a() > 0) {
            int f10 = a0Var.f();
            int g10 = a0Var.g();
            byte[] e10 = a0Var.e();
            this.f9373l += a0Var.a();
            this.f9364c.d(a0Var, a0Var.a());
            while (f10 < g10) {
                int c10 = p3.w.c(e10, f10, g10, this.f9367f);
                if (c10 == g10) {
                    h(e10, f10, g10);
                    return;
                }
                int e11 = p3.w.e(e10, c10);
                int i10 = c10 - f10;
                if (i10 > 0) {
                    h(e10, f10, c10);
                }
                int i11 = g10 - c10;
                long j10 = this.f9373l - i11;
                g(j10, i11, i10 < 0 ? -i10 : 0, this.f9374m);
                j(j10, i11, e11, this.f9374m);
                f10 = c10 + 3;
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f9373l = 0L;
        this.f9374m = -9223372036854775807L;
        p3.w.a(this.f9367f);
        this.f9368g.d();
        this.f9369h.d();
        this.f9370i.d();
        this.f9371j.d();
        this.f9372k.d();
        a aVar = this.f9365d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f9363b = dVar.b();
        x1.e0 d10 = nVar.d(dVar.c(), 2);
        this.f9364c = d10;
        this.f9365d = new a(d10);
        this.f9362a.b(nVar, dVar);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9374m = j10;
        }
    }
}
