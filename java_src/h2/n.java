package h2;

import h2.i0;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: q  reason: collision with root package name */
    private static final double[] f9265q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f9266a;

    /* renamed from: b  reason: collision with root package name */
    private x1.e0 f9267b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f9268c;

    /* renamed from: d  reason: collision with root package name */
    private final p3.a0 f9269d;

    /* renamed from: e  reason: collision with root package name */
    private final u f9270e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f9271f;

    /* renamed from: g  reason: collision with root package name */
    private final a f9272g;

    /* renamed from: h  reason: collision with root package name */
    private long f9273h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9274i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9275j;

    /* renamed from: k  reason: collision with root package name */
    private long f9276k;

    /* renamed from: l  reason: collision with root package name */
    private long f9277l;

    /* renamed from: m  reason: collision with root package name */
    private long f9278m;

    /* renamed from: n  reason: collision with root package name */
    private long f9279n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9280o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9281p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        private static final byte[] f9282e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f9283a;

        /* renamed from: b  reason: collision with root package name */
        public int f9284b;

        /* renamed from: c  reason: collision with root package name */
        public int f9285c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f9286d;

        public a(int i10) {
            this.f9286d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f9283a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f9286d;
                int length = bArr2.length;
                int i13 = this.f9284b;
                if (length < i13 + i12) {
                    this.f9286d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f9286d, this.f9284b, i12);
                this.f9284b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f9283a) {
                int i12 = this.f9284b - i11;
                this.f9284b = i12;
                if (this.f9285c != 0 || i10 != 181) {
                    this.f9283a = false;
                    return true;
                }
                this.f9285c = i12;
            } else if (i10 == 179) {
                this.f9283a = true;
            }
            byte[] bArr = f9282e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f9283a = false;
            this.f9284b = 0;
            this.f9285c = 0;
        }
    }

    public n() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(k0 k0Var) {
        p3.a0 a0Var;
        this.f9268c = k0Var;
        this.f9271f = new boolean[4];
        this.f9272g = new a(128);
        if (k0Var != null) {
            this.f9270e = new u(178, 128);
            a0Var = new p3.a0();
        } else {
            a0Var = null;
            this.f9270e = null;
        }
        this.f9269d = a0Var;
        this.f9277l = -9223372036854775807L;
        this.f9279n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<s1.n1, java.lang.Long> f(h2.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f9286d
            int r1 = r8.f9284b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            s1.n1$b r6 = new s1.n1$b
            r6.<init>()
            s1.n1$b r9 = r6.U(r9)
            java.lang.String r6 = "video/mpeg2"
            s1.n1$b r9 = r9.g0(r6)
            s1.n1$b r9 = r9.n0(r2)
            s1.n1$b r9 = r9.S(r4)
            s1.n1$b r9 = r9.c0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            s1.n1$b r9 = r9.V(r1)
            s1.n1 r9 = r9.G()
            r1 = 0
            r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + (-1)
            if (r4 < 0) goto L9d
            double[] r5 = h2.n.f9265q
            int r6 = r5.length
            if (r4 >= r6) goto L9d
            r1 = r5[r4]
            int r8 = r8.f9285c
            int r8 = r8 + 9
            r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L96
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L96:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L9d:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.n.f(h2.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    @Override // h2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(p3.a0 r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.n.a(p3.a0):void");
    }

    @Override // h2.m
    public void b() {
        p3.w.a(this.f9271f);
        this.f9272g.c();
        u uVar = this.f9270e;
        if (uVar != null) {
            uVar.d();
        }
        this.f9273h = 0L;
        this.f9274i = false;
        this.f9277l = -9223372036854775807L;
        this.f9279n = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f9266a = dVar.b();
        this.f9267b = nVar.d(dVar.c(), 2);
        k0 k0Var = this.f9268c;
        if (k0Var != null) {
            k0Var.b(nVar, dVar);
        }
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        this.f9277l = j10;
    }
}
