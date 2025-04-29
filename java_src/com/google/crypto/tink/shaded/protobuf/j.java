package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: f  reason: collision with root package name */
    private static volatile int f6205f = 100;

    /* renamed from: a  reason: collision with root package name */
    int f6206a;

    /* renamed from: b  reason: collision with root package name */
    int f6207b;

    /* renamed from: c  reason: collision with root package name */
    int f6208c;

    /* renamed from: d  reason: collision with root package name */
    k f6209d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6210e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends j {

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f6211g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f6212h;

        /* renamed from: i  reason: collision with root package name */
        private int f6213i;

        /* renamed from: j  reason: collision with root package name */
        private int f6214j;

        /* renamed from: k  reason: collision with root package name */
        private int f6215k;

        /* renamed from: l  reason: collision with root package name */
        private int f6216l;

        /* renamed from: m  reason: collision with root package name */
        private int f6217m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f6218n;

        /* renamed from: o  reason: collision with root package name */
        private int f6219o;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f6219o = Integer.MAX_VALUE;
            this.f6211g = bArr;
            this.f6213i = i11 + i10;
            this.f6215k = i10;
            this.f6216l = i10;
            this.f6212h = z10;
        }

        private void K() {
            int i10 = this.f6213i + this.f6214j;
            this.f6213i = i10;
            int i11 = i10 - this.f6216l;
            int i12 = this.f6219o;
            if (i11 <= i12) {
                this.f6214j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f6214j = i13;
            this.f6213i = i10 - i13;
        }

        private void N() {
            if (this.f6213i - this.f6215k >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f6211g;
                int i11 = this.f6215k;
                this.f6215k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw c0.f();
        }

        private void P() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (D() >= 0) {
                    return;
                }
            }
            throw c0.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int A() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long B() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public boolean C(int i10) {
            int b10 = u1.b(i10);
            if (b10 == 0) {
                N();
                return true;
            } else if (b10 == 1) {
                M(8);
                return true;
            } else if (b10 == 2) {
                M(H());
                return true;
            } else if (b10 == 3) {
                L();
                a(u1.c(u1.a(i10), 4));
                return true;
            } else if (b10 != 4) {
                if (b10 == 5) {
                    M(4);
                    return true;
                }
                throw c0.e();
            } else {
                return false;
            }
        }

        public byte D() {
            int i10 = this.f6215k;
            if (i10 != this.f6213i) {
                byte[] bArr = this.f6211g;
                this.f6215k = i10 + 1;
                return bArr[i10];
            }
            throw c0.k();
        }

        public byte[] E(int i10) {
            if (i10 > 0) {
                int i11 = this.f6213i;
                int i12 = this.f6215k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f6215k = i13;
                    return Arrays.copyOfRange(this.f6211g, i12, i13);
                }
            }
            if (i10 <= 0) {
                if (i10 == 0) {
                    return b0.f6128d;
                }
                throw c0.g();
            }
            throw c0.k();
        }

        public int F() {
            int i10 = this.f6215k;
            if (this.f6213i - i10 >= 4) {
                byte[] bArr = this.f6211g;
                this.f6215k = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw c0.k();
        }

        public long G() {
            int i10 = this.f6215k;
            if (this.f6213i - i10 >= 8) {
                byte[] bArr = this.f6211g;
                this.f6215k = i10 + 8;
                return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
            }
            throw c0.k();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int H() {
            /*
                r5 = this;
                int r0 = r5.f6215k
                int r1 = r5.f6213i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f6211g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f6215k = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.J()
                int r1 = (int) r0
                return r1
            L70:
                r5.f6215k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j.b.H():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long I() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j.b.I():long");
        }

        long J() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte D = D();
                j10 |= (D & Byte.MAX_VALUE) << i10;
                if ((D & 128) == 0) {
                    return j10;
                }
            }
            throw c0.f();
        }

        public void L() {
            int z10;
            do {
                z10 = z();
                if (z10 == 0) {
                    return;
                }
            } while (C(z10));
        }

        public void M(int i10) {
            if (i10 >= 0) {
                int i11 = this.f6213i;
                int i12 = this.f6215k;
                if (i10 <= i11 - i12) {
                    this.f6215k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw c0.k();
            }
            throw c0.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public void a(int i10) {
            if (this.f6217m != i10) {
                throw c0.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int d() {
            return this.f6215k - this.f6216l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public boolean e() {
            return this.f6215k == this.f6213i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public void i(int i10) {
            this.f6219o = i10;
            K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int j(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                if (d10 >= 0) {
                    int i11 = this.f6219o;
                    if (d10 <= i11) {
                        this.f6219o = d10;
                        K();
                        return i11;
                    }
                    throw c0.k();
                }
                throw c0.h();
            }
            throw c0.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public boolean k() {
            return I() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public i l() {
            int H = H();
            if (H > 0) {
                int i10 = this.f6213i;
                int i11 = this.f6215k;
                if (H <= i10 - i11) {
                    i H2 = (this.f6212h && this.f6218n) ? i.H(this.f6211g, i11, H) : i.p(this.f6211g, i11, H);
                    this.f6215k += H;
                    return H2;
                }
            }
            return H == 0 ? i.f6190k : i.G(E(H));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public double m() {
            return Double.longBitsToDouble(G());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int n() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int o() {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long p() {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public float q() {
            return Float.intBitsToFloat(F());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int r() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long s() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int t() {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long u() {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int v() {
            return j.b(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long w() {
            return j.c(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public String x() {
            int H = H();
            if (H > 0) {
                int i10 = this.f6213i;
                int i11 = this.f6215k;
                if (H <= i10 - i11) {
                    String str = new String(this.f6211g, i11, H, b0.f6126b);
                    this.f6215k += H;
                    return str;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H < 0) {
                throw c0.g();
            }
            throw c0.k();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public String y() {
            int H = H();
            if (H > 0) {
                int i10 = this.f6213i;
                int i11 = this.f6215k;
                if (H <= i10 - i11) {
                    String e10 = t1.e(this.f6211g, i11, H);
                    this.f6215k += H;
                    return e10;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw c0.g();
            }
            throw c0.k();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int z() {
            if (e()) {
                this.f6217m = 0;
                return 0;
            }
            int H = H();
            this.f6217m = H;
            if (u1.a(H) != 0) {
                return this.f6217m;
            }
            throw c0.c();
        }
    }

    private j() {
        this.f6207b = f6205f;
        this.f6208c = Integer.MAX_VALUE;
        this.f6210e = false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static j f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static j g(byte[] bArr, int i10, int i11) {
        return h(bArr, i10, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j h(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.j(i11);
            return bVar;
        } catch (c0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i10);

    public abstract int j(int i10);

    public abstract boolean k();

    public abstract i l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
