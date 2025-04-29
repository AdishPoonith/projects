package h2;

import android.util.SparseArray;
import h2.i0;
import java.util.ArrayList;
import java.util.Arrays;
import p3.n0;
import p3.w;
import s1.n1;
/* loaded from: classes.dex */
public final class p implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f9313a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9314b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9315c;

    /* renamed from: g  reason: collision with root package name */
    private long f9319g;

    /* renamed from: i  reason: collision with root package name */
    private String f9321i;

    /* renamed from: j  reason: collision with root package name */
    private x1.e0 f9322j;

    /* renamed from: k  reason: collision with root package name */
    private b f9323k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9324l;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9326n;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f9320h = new boolean[3];

    /* renamed from: d  reason: collision with root package name */
    private final u f9316d = new u(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final u f9317e = new u(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final u f9318f = new u(6, 128);

    /* renamed from: m  reason: collision with root package name */
    private long f9325m = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    private final p3.a0 f9327o = new p3.a0();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final x1.e0 f9328a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f9329b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f9330c;

        /* renamed from: f  reason: collision with root package name */
        private final p3.b0 f9333f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f9334g;

        /* renamed from: h  reason: collision with root package name */
        private int f9335h;

        /* renamed from: i  reason: collision with root package name */
        private int f9336i;

        /* renamed from: j  reason: collision with root package name */
        private long f9337j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f9338k;

        /* renamed from: l  reason: collision with root package name */
        private long f9339l;

        /* renamed from: o  reason: collision with root package name */
        private boolean f9342o;

        /* renamed from: p  reason: collision with root package name */
        private long f9343p;

        /* renamed from: q  reason: collision with root package name */
        private long f9344q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f9345r;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray<w.c> f9331d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray<w.b> f9332e = new SparseArray<>();

        /* renamed from: m  reason: collision with root package name */
        private a f9340m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f9341n = new a();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f9346a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f9347b;

            /* renamed from: c  reason: collision with root package name */
            private w.c f9348c;

            /* renamed from: d  reason: collision with root package name */
            private int f9349d;

            /* renamed from: e  reason: collision with root package name */
            private int f9350e;

            /* renamed from: f  reason: collision with root package name */
            private int f9351f;

            /* renamed from: g  reason: collision with root package name */
            private int f9352g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f9353h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f9354i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f9355j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f9356k;

            /* renamed from: l  reason: collision with root package name */
            private int f9357l;

            /* renamed from: m  reason: collision with root package name */
            private int f9358m;

            /* renamed from: n  reason: collision with root package name */
            private int f9359n;

            /* renamed from: o  reason: collision with root package name */
            private int f9360o;

            /* renamed from: p  reason: collision with root package name */
            private int f9361p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (this.f9346a) {
                    if (aVar.f9346a) {
                        w.c cVar = (w.c) p3.a.h(this.f9348c);
                        w.c cVar2 = (w.c) p3.a.h(aVar.f9348c);
                        return (this.f9351f == aVar.f9351f && this.f9352g == aVar.f9352g && this.f9353h == aVar.f9353h && (!this.f9354i || !aVar.f9354i || this.f9355j == aVar.f9355j) && (((i10 = this.f9349d) == (i11 = aVar.f9349d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f15474l) != 0 || cVar2.f15474l != 0 || (this.f9358m == aVar.f9358m && this.f9359n == aVar.f9359n)) && ((i12 != 1 || cVar2.f15474l != 1 || (this.f9360o == aVar.f9360o && this.f9361p == aVar.f9361p)) && (z10 = this.f9356k) == aVar.f9356k && (!z10 || this.f9357l == aVar.f9357l))))) ? false : true;
                    }
                    return true;
                }
                return false;
            }

            public void b() {
                this.f9347b = false;
                this.f9346a = false;
            }

            public boolean d() {
                int i10;
                return this.f9347b && ((i10 = this.f9350e) == 7 || i10 == 2);
            }

            public void e(w.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f9348c = cVar;
                this.f9349d = i10;
                this.f9350e = i11;
                this.f9351f = i12;
                this.f9352g = i13;
                this.f9353h = z10;
                this.f9354i = z11;
                this.f9355j = z12;
                this.f9356k = z13;
                this.f9357l = i14;
                this.f9358m = i15;
                this.f9359n = i16;
                this.f9360o = i17;
                this.f9361p = i18;
                this.f9346a = true;
                this.f9347b = true;
            }

            public void f(int i10) {
                this.f9350e = i10;
                this.f9347b = true;
            }
        }

        public b(x1.e0 e0Var, boolean z10, boolean z11) {
            this.f9328a = e0Var;
            this.f9329b = z10;
            this.f9330c = z11;
            byte[] bArr = new byte[128];
            this.f9334g = bArr;
            this.f9333f = new p3.b0(bArr, 0, 0);
            g();
        }

        private void d(int i10) {
            long j10 = this.f9344q;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f9345r;
            this.f9328a.c(j10, z10 ? 1 : 0, (int) (this.f9337j - this.f9343p), i10, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f9336i == 9 || (this.f9330c && this.f9341n.c(this.f9340m))) {
                if (z10 && this.f9342o) {
                    d(i10 + ((int) (j10 - this.f9337j)));
                }
                this.f9343p = this.f9337j;
                this.f9344q = this.f9339l;
                this.f9345r = false;
                this.f9342o = true;
            }
            if (this.f9329b) {
                z11 = this.f9341n.d();
            }
            boolean z13 = this.f9345r;
            int i11 = this.f9336i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f9345r = z14;
            return z14;
        }

        public boolean c() {
            return this.f9330c;
        }

        public void e(w.b bVar) {
            this.f9332e.append(bVar.f15460a, bVar);
        }

        public void f(w.c cVar) {
            this.f9331d.append(cVar.f15466d, cVar);
        }

        public void g() {
            this.f9338k = false;
            this.f9342o = false;
            this.f9341n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f9336i = i10;
            this.f9339l = j11;
            this.f9337j = j10;
            if (!this.f9329b || i10 != 1) {
                if (!this.f9330c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f9340m;
            this.f9340m = this.f9341n;
            this.f9341n = aVar;
            aVar.b();
            this.f9335h = 0;
            this.f9338k = true;
        }
    }

    public p(d0 d0Var, boolean z10, boolean z11) {
        this.f9313a = d0Var;
        this.f9314b = z10;
        this.f9315c = z11;
    }

    private void f() {
        p3.a.h(this.f9322j);
        n0.j(this.f9323k);
    }

    private void g(long j10, int i10, int i11, long j11) {
        u uVar;
        if (!this.f9324l || this.f9323k.c()) {
            this.f9316d.b(i11);
            this.f9317e.b(i11);
            if (this.f9324l) {
                if (this.f9316d.c()) {
                    u uVar2 = this.f9316d;
                    this.f9323k.f(p3.w.l(uVar2.f9431d, 3, uVar2.f9432e));
                    uVar = this.f9316d;
                } else if (this.f9317e.c()) {
                    u uVar3 = this.f9317e;
                    this.f9323k.e(p3.w.j(uVar3.f9431d, 3, uVar3.f9432e));
                    uVar = this.f9317e;
                }
            } else if (this.f9316d.c() && this.f9317e.c()) {
                ArrayList arrayList = new ArrayList();
                u uVar4 = this.f9316d;
                arrayList.add(Arrays.copyOf(uVar4.f9431d, uVar4.f9432e));
                u uVar5 = this.f9317e;
                arrayList.add(Arrays.copyOf(uVar5.f9431d, uVar5.f9432e));
                u uVar6 = this.f9316d;
                w.c l10 = p3.w.l(uVar6.f9431d, 3, uVar6.f9432e);
                u uVar7 = this.f9317e;
                w.b j12 = p3.w.j(uVar7.f9431d, 3, uVar7.f9432e);
                this.f9322j.e(new n1.b().U(this.f9321i).g0("video/avc").K(p3.e.a(l10.f15463a, l10.f15464b, l10.f15465c)).n0(l10.f15468f).S(l10.f15469g).c0(l10.f15470h).V(arrayList).G());
                this.f9324l = true;
                this.f9323k.f(l10);
                this.f9323k.e(j12);
                this.f9316d.d();
                uVar = this.f9317e;
            }
            uVar.d();
        }
        if (this.f9318f.b(i11)) {
            u uVar8 = this.f9318f;
            this.f9327o.R(this.f9318f.f9431d, p3.w.q(uVar8.f9431d, uVar8.f9432e));
            this.f9327o.T(4);
            this.f9313a.a(j11, this.f9327o);
        }
        if (this.f9323k.b(j10, i10, this.f9324l, this.f9326n)) {
            this.f9326n = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f9324l || this.f9323k.c()) {
            this.f9316d.a(bArr, i10, i11);
            this.f9317e.a(bArr, i10, i11);
        }
        this.f9318f.a(bArr, i10, i11);
        this.f9323k.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f9324l || this.f9323k.c()) {
            this.f9316d.e(i10);
            this.f9317e.e(i10);
        }
        this.f9318f.e(i10);
        this.f9323k.h(j10, i10, j11);
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        f();
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        byte[] e10 = a0Var.e();
        this.f9319g += a0Var.a();
        this.f9322j.d(a0Var, a0Var.a());
        while (true) {
            int c10 = p3.w.c(e10, f10, g10, this.f9320h);
            if (c10 == g10) {
                h(e10, f10, g10);
                return;
            }
            int f11 = p3.w.f(e10, c10);
            int i10 = c10 - f10;
            if (i10 > 0) {
                h(e10, f10, c10);
            }
            int i11 = g10 - c10;
            long j10 = this.f9319g - i11;
            g(j10, i11, i10 < 0 ? -i10 : 0, this.f9325m);
            i(j10, f11, this.f9325m);
            f10 = c10 + 3;
        }
    }

    @Override // h2.m
    public void b() {
        this.f9319g = 0L;
        this.f9326n = false;
        this.f9325m = -9223372036854775807L;
        p3.w.a(this.f9320h);
        this.f9316d.d();
        this.f9317e.d();
        this.f9318f.d();
        b bVar = this.f9323k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f9321i = dVar.b();
        x1.e0 d10 = nVar.d(dVar.c(), 2);
        this.f9322j = d10;
        this.f9323k = new b(d10, this.f9314b, this.f9315c);
        this.f9313a.b(nVar, dVar);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9325m = j10;
        }
        this.f9326n |= (i10 & 2) != 0;
    }
}
