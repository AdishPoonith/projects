package h2;

import h2.i0;
/* loaded from: classes.dex */
public final class w implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final m f9436a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.z f9437b = new p3.z(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f9438c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f9439d;

    /* renamed from: e  reason: collision with root package name */
    private p3.j0 f9440e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9441f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9442g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9443h;

    /* renamed from: i  reason: collision with root package name */
    private int f9444i;

    /* renamed from: j  reason: collision with root package name */
    private int f9445j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9446k;

    /* renamed from: l  reason: collision with root package name */
    private long f9447l;

    public w(m mVar) {
        this.f9436a = mVar;
    }

    private boolean d(p3.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f9439d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            a0Var.U(min);
        } else {
            a0Var.l(bArr, this.f9439d, min);
        }
        int i11 = this.f9439d + min;
        this.f9439d = i11;
        return i11 == i10;
    }

    private boolean e() {
        this.f9437b.p(0);
        int h10 = this.f9437b.h(24);
        if (h10 != 1) {
            p3.r.i("PesReader", "Unexpected start code prefix: " + h10);
            this.f9445j = -1;
            return false;
        }
        this.f9437b.r(8);
        int h11 = this.f9437b.h(16);
        this.f9437b.r(5);
        this.f9446k = this.f9437b.g();
        this.f9437b.r(2);
        this.f9441f = this.f9437b.g();
        this.f9442g = this.f9437b.g();
        this.f9437b.r(6);
        int h12 = this.f9437b.h(8);
        this.f9444i = h12;
        if (h11 != 0) {
            int i10 = ((h11 + 6) - 9) - h12;
            this.f9445j = i10;
            if (i10 < 0) {
                p3.r.i("PesReader", "Found negative packet payload size: " + this.f9445j);
            }
            return true;
        }
        this.f9445j = -1;
        return true;
    }

    private void f() {
        this.f9437b.p(0);
        this.f9447l = -9223372036854775807L;
        if (this.f9441f) {
            this.f9437b.r(4);
            this.f9437b.r(1);
            this.f9437b.r(1);
            long h10 = (this.f9437b.h(3) << 30) | (this.f9437b.h(15) << 15) | this.f9437b.h(15);
            this.f9437b.r(1);
            if (!this.f9443h && this.f9442g) {
                this.f9437b.r(4);
                this.f9437b.r(1);
                this.f9437b.r(1);
                this.f9437b.r(1);
                this.f9440e.b((this.f9437b.h(3) << 30) | (this.f9437b.h(15) << 15) | this.f9437b.h(15));
                this.f9443h = true;
            }
            this.f9447l = this.f9440e.b(h10);
        }
    }

    private void g(int i10) {
        this.f9438c = i10;
        this.f9439d = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:35:0x007c). Please submit an issue!!! */
    @Override // h2.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(p3.a0 r8, int r9) {
        /*
            r7 = this;
            p3.j0 r0 = r7.f9440e
            p3.a.h(r0)
            r0 = r9 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L47
            int r0 = r7.f9438c
            if (r0 == 0) goto L44
            if (r0 == r4) goto L44
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L3f
            if (r0 != r2) goto L39
            int r0 = r7.f9445j
            if (r0 == r1) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unexpected start indicator: expected "
            r0.append(r6)
            int r6 = r7.f9445j
            r0.append(r6)
            java.lang.String r6 = " more bytes"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p3.r.i(r5, r0)
            goto L7c
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L3f:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            p3.r.i(r5, r0)
        L44:
            r7.g(r4)
        L47:
            int r0 = r8.a()
            if (r0 <= 0) goto Ld8
            int r0 = r7.f9438c
            if (r0 == 0) goto Lcf
            r5 = 0
            if (r0 == r4) goto Lb7
            if (r0 == r3) goto L88
            if (r0 != r2) goto L82
            int r0 = r8.a()
            int r6 = r7.f9445j
            if (r6 != r1) goto L61
            goto L63
        L61:
            int r5 = r0 - r6
        L63:
            if (r5 <= 0) goto L6e
            int r0 = r0 - r5
            int r5 = r8.f()
            int r5 = r5 + r0
            r8.S(r5)
        L6e:
            h2.m r5 = r7.f9436a
            r5.a(r8)
            int r5 = r7.f9445j
            if (r5 == r1) goto L47
            int r5 = r5 - r0
            r7.f9445j = r5
            if (r5 != 0) goto L47
        L7c:
            h2.m r0 = r7.f9436a
            r0.d()
            goto L44
        L82:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L88:
            r0 = 10
            int r6 = r7.f9444i
            int r0 = java.lang.Math.min(r0, r6)
            p3.z r6 = r7.f9437b
            byte[] r6 = r6.f15486a
            boolean r0 = r7.d(r8, r6, r0)
            if (r0 == 0) goto L47
            r0 = 0
            int r6 = r7.f9444i
            boolean r0 = r7.d(r8, r0, r6)
            if (r0 == 0) goto L47
            r7.f()
            boolean r0 = r7.f9446k
            if (r0 == 0) goto Lab
            r5 = 4
        Lab:
            r9 = r9 | r5
            h2.m r0 = r7.f9436a
            long r5 = r7.f9447l
            r0.e(r5, r9)
            r7.g(r2)
            goto L47
        Lb7:
            p3.z r0 = r7.f9437b
            byte[] r0 = r0.f15486a
            r6 = 9
            boolean r0 = r7.d(r8, r0, r6)
            if (r0 == 0) goto L47
            boolean r0 = r7.e()
            if (r0 == 0) goto Lca
            r5 = 2
        Lca:
            r7.g(r5)
            goto L47
        Lcf:
            int r0 = r8.a()
            r8.U(r0)
            goto L47
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.w.a(p3.a0, int):void");
    }

    @Override // h2.i0
    public final void b() {
        this.f9438c = 0;
        this.f9439d = 0;
        this.f9443h = false;
        this.f9436a.b();
    }

    @Override // h2.i0
    public void c(p3.j0 j0Var, x1.n nVar, i0.d dVar) {
        this.f9440e = j0Var;
        this.f9436a.c(nVar, dVar);
    }
}
