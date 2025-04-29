package h2;

import h2.i0;
import java.util.Arrays;
import java.util.Collections;
import p3.n0;
import s1.n1;
/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f9287l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final k0 f9288a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f9289b;

    /* renamed from: e  reason: collision with root package name */
    private final u f9292e;

    /* renamed from: f  reason: collision with root package name */
    private b f9293f;

    /* renamed from: g  reason: collision with root package name */
    private long f9294g;

    /* renamed from: h  reason: collision with root package name */
    private String f9295h;

    /* renamed from: i  reason: collision with root package name */
    private x1.e0 f9296i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9297j;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f9290c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f9291d = new a(128);

    /* renamed from: k  reason: collision with root package name */
    private long f9298k = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f9299f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f9300a;

        /* renamed from: b  reason: collision with root package name */
        private int f9301b;

        /* renamed from: c  reason: collision with root package name */
        public int f9302c;

        /* renamed from: d  reason: collision with root package name */
        public int f9303d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f9304e;

        public a(int i10) {
            this.f9304e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f9300a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f9304e;
                int length = bArr2.length;
                int i13 = this.f9302c;
                if (length < i13 + i12) {
                    this.f9304e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f9304e, this.f9302c, i12);
                this.f9302c += i12;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
            if (r9 != 181) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.f9301b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L4b
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L3f
                r7 = 3
                if (r0 == r4) goto L37
                r4 = 4
                if (r0 == r7) goto L2b
                if (r0 != r4) goto L25
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L1d
                if (r9 != r3) goto L53
            L1d:
                int r9 = r8.f9302c
                int r9 = r9 - r10
                r8.f9302c = r9
                r8.f9300a = r1
                return r2
            L25:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L2b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L32
                goto L41
            L32:
                int r9 = r8.f9302c
                r8.f9303d = r9
                goto L48
            L37:
                r10 = 31
                if (r9 <= r10) goto L3c
                goto L41
            L3c:
                r8.f9301b = r7
                goto L53
            L3f:
                if (r9 == r3) goto L48
            L41:
                p3.r.i(r6, r5)
                r8.c()
                goto L53
            L48:
                r8.f9301b = r4
                goto L53
            L4b:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L53
                r8.f9301b = r2
                r8.f9300a = r2
            L53:
                byte[] r9 = h2.o.a.f9299f
                int r10 = r9.length
                r8.a(r9, r1, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.o.a.b(int, int):boolean");
        }

        public void c() {
            this.f9300a = false;
            this.f9302c = 0;
            this.f9301b = 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final x1.e0 f9305a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f9306b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f9307c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f9308d;

        /* renamed from: e  reason: collision with root package name */
        private int f9309e;

        /* renamed from: f  reason: collision with root package name */
        private int f9310f;

        /* renamed from: g  reason: collision with root package name */
        private long f9311g;

        /* renamed from: h  reason: collision with root package name */
        private long f9312h;

        public b(x1.e0 e0Var) {
            this.f9305a = e0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f9307c) {
                int i12 = this.f9310f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f9310f = i12 + (i11 - i10);
                    return;
                }
                this.f9308d = ((bArr[i13] & 192) >> 6) == 0;
                this.f9307c = false;
            }
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f9309e == 182 && z10 && this.f9306b) {
                long j11 = this.f9312h;
                if (j11 != -9223372036854775807L) {
                    this.f9305a.c(j11, this.f9308d ? 1 : 0, (int) (j10 - this.f9311g), i10, null);
                }
            }
            if (this.f9309e != 179) {
                this.f9311g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f9309e = i10;
            this.f9308d = false;
            this.f9306b = i10 == 182 || i10 == 179;
            this.f9307c = i10 == 182;
            this.f9310f = 0;
            this.f9312h = j10;
        }

        public void d() {
            this.f9306b = false;
            this.f9307c = false;
            this.f9308d = false;
            this.f9309e = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(k0 k0Var) {
        p3.a0 a0Var;
        this.f9288a = k0Var;
        if (k0Var != null) {
            this.f9292e = new u(178, 128);
            a0Var = new p3.a0();
        } else {
            a0Var = null;
            this.f9292e = null;
        }
        this.f9289b = a0Var;
    }

    private static n1 f(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f9304e, aVar.f9302c);
        p3.z zVar = new p3.z(copyOf);
        zVar.s(i10);
        zVar.s(4);
        zVar.q();
        zVar.r(8);
        if (zVar.g()) {
            zVar.r(4);
            zVar.r(3);
        }
        int h10 = zVar.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = zVar.h(8);
            int h12 = zVar.h(8);
            if (h12 != 0) {
                f10 = h11 / h12;
            }
            p3.r.i("H263Reader", "Invalid aspect ratio");
        } else {
            float[] fArr = f9287l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            }
            p3.r.i("H263Reader", "Invalid aspect ratio");
        }
        if (zVar.g()) {
            zVar.r(2);
            zVar.r(1);
            if (zVar.g()) {
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(3);
                zVar.r(11);
                zVar.q();
                zVar.r(15);
                zVar.q();
            }
        }
        if (zVar.h(2) != 0) {
            p3.r.i("H263Reader", "Unhandled video object layer shape");
        }
        zVar.q();
        int h13 = zVar.h(16);
        zVar.q();
        if (zVar.g()) {
            if (h13 == 0) {
                p3.r.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                zVar.r(i11);
            }
        }
        zVar.q();
        int h14 = zVar.h(13);
        zVar.q();
        int h15 = zVar.h(13);
        zVar.q();
        zVar.q();
        return new n1.b().U(str).g0("video/mp4v-es").n0(h14).S(h15).c0(f10).V(Collections.singletonList(copyOf)).G();
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f9293f);
        p3.a.h(this.f9296i);
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        byte[] e10 = a0Var.e();
        this.f9294g += a0Var.a();
        this.f9296i.d(a0Var, a0Var.a());
        while (true) {
            int c10 = p3.w.c(e10, f10, g10, this.f9290c);
            if (c10 == g10) {
                break;
            }
            int i10 = c10 + 3;
            int i11 = a0Var.e()[i10] & 255;
            int i12 = c10 - f10;
            int i13 = 0;
            if (!this.f9297j) {
                if (i12 > 0) {
                    this.f9291d.a(e10, f10, c10);
                }
                if (this.f9291d.b(i11, i12 < 0 ? -i12 : 0)) {
                    x1.e0 e0Var = this.f9296i;
                    a aVar = this.f9291d;
                    e0Var.e(f(aVar, aVar.f9303d, (String) p3.a.e(this.f9295h)));
                    this.f9297j = true;
                }
            }
            this.f9293f.a(e10, f10, c10);
            u uVar = this.f9292e;
            if (uVar != null) {
                if (i12 > 0) {
                    uVar.a(e10, f10, c10);
                } else {
                    i13 = -i12;
                }
                if (this.f9292e.b(i13)) {
                    u uVar2 = this.f9292e;
                    ((p3.a0) n0.j(this.f9289b)).R(this.f9292e.f9431d, p3.w.q(uVar2.f9431d, uVar2.f9432e));
                    ((k0) n0.j(this.f9288a)).a(this.f9298k, this.f9289b);
                }
                if (i11 == 178 && a0Var.e()[c10 + 2] == 1) {
                    this.f9292e.e(i11);
                }
            }
            int i14 = g10 - c10;
            this.f9293f.b(this.f9294g - i14, i14, this.f9297j);
            this.f9293f.c(i11, this.f9298k);
            f10 = i10;
        }
        if (!this.f9297j) {
            this.f9291d.a(e10, f10, g10);
        }
        this.f9293f.a(e10, f10, g10);
        u uVar3 = this.f9292e;
        if (uVar3 != null) {
            uVar3.a(e10, f10, g10);
        }
    }

    @Override // h2.m
    public void b() {
        p3.w.a(this.f9290c);
        this.f9291d.c();
        b bVar = this.f9293f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f9292e;
        if (uVar != null) {
            uVar.d();
        }
        this.f9294g = 0L;
        this.f9298k = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f9295h = dVar.b();
        x1.e0 d10 = nVar.d(dVar.c(), 2);
        this.f9296i = d10;
        this.f9293f = new b(d10);
        k0 k0Var = this.f9288a;
        if (k0Var != null) {
            k0Var.b(nVar, dVar);
        }
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9298k = j10;
        }
    }
}
