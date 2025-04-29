package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: f  reason: collision with root package name */
    private static volatile int f7163f = 100;

    /* renamed from: a  reason: collision with root package name */
    int f7164a;

    /* renamed from: b  reason: collision with root package name */
    int f7165b;

    /* renamed from: c  reason: collision with root package name */
    int f7166c;

    /* renamed from: d  reason: collision with root package name */
    k f7167d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7168e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends j {

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f7169g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f7170h;

        /* renamed from: i  reason: collision with root package name */
        private int f7171i;

        /* renamed from: j  reason: collision with root package name */
        private int f7172j;

        /* renamed from: k  reason: collision with root package name */
        private int f7173k;

        /* renamed from: l  reason: collision with root package name */
        private int f7174l;

        /* renamed from: m  reason: collision with root package name */
        private int f7175m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f7176n;

        /* renamed from: o  reason: collision with root package name */
        private int f7177o;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f7177o = Integer.MAX_VALUE;
            this.f7169g = bArr;
            this.f7171i = i11 + i10;
            this.f7173k = i10;
            this.f7174l = i10;
            this.f7170h = z10;
        }

        private void P() {
            int i10 = this.f7171i + this.f7172j;
            this.f7171i = i10;
            int i11 = i10 - this.f7174l;
            int i12 = this.f7177o;
            if (i11 <= i12) {
                this.f7172j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f7172j = i13;
            this.f7171i = i10 - i13;
        }

        private void S() {
            if (this.f7171i - this.f7173k >= 10) {
                T();
            } else {
                U();
            }
        }

        private void T() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f7169g;
                int i11 = this.f7173k;
                this.f7173k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private void U() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        @Override // com.google.protobuf.j
        public long A() {
            return j.c(N());
        }

        @Override // com.google.protobuf.j
        public String B() {
            int M = M();
            if (M > 0) {
                int i10 = this.f7171i;
                int i11 = this.f7173k;
                if (M <= i10 - i11) {
                    String str = new String(this.f7169g, i11, M, d0.f7092b);
                    this.f7173k += M;
                    return str;
                }
            }
            if (M == 0) {
                return "";
            }
            if (M < 0) {
                throw e0.g();
            }
            throw e0.m();
        }

        @Override // com.google.protobuf.j
        public String C() {
            int M = M();
            if (M > 0) {
                int i10 = this.f7171i;
                int i11 = this.f7173k;
                if (M <= i10 - i11) {
                    String h10 = a2.h(this.f7169g, i11, M);
                    this.f7173k += M;
                    return h10;
                }
            }
            if (M == 0) {
                return "";
            }
            if (M <= 0) {
                throw e0.g();
            }
            throw e0.m();
        }

        @Override // com.google.protobuf.j
        public int D() {
            if (e()) {
                this.f7175m = 0;
                return 0;
            }
            int M = M();
            this.f7175m = M;
            if (b2.a(M) != 0) {
                return this.f7175m;
            }
            throw e0.c();
        }

        @Override // com.google.protobuf.j
        public int E() {
            return M();
        }

        @Override // com.google.protobuf.j
        public long F() {
            return N();
        }

        @Override // com.google.protobuf.j
        public boolean H(int i10) {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                S();
                return true;
            } else if (b10 == 1) {
                R(8);
                return true;
            } else if (b10 == 2) {
                R(M());
                return true;
            } else if (b10 == 3) {
                Q();
                a(b2.c(b2.a(i10), 4));
                return true;
            } else if (b10 != 4) {
                if (b10 == 5) {
                    R(4);
                    return true;
                }
                throw e0.e();
            } else {
                return false;
            }
        }

        public byte I() {
            int i10 = this.f7173k;
            if (i10 != this.f7171i) {
                byte[] bArr = this.f7169g;
                this.f7173k = i10 + 1;
                return bArr[i10];
            }
            throw e0.m();
        }

        public byte[] J(int i10) {
            if (i10 > 0) {
                int i11 = this.f7171i;
                int i12 = this.f7173k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f7173k = i13;
                    return Arrays.copyOfRange(this.f7169g, i12, i13);
                }
            }
            if (i10 <= 0) {
                if (i10 == 0) {
                    return d0.f7094d;
                }
                throw e0.g();
            }
            throw e0.m();
        }

        public int K() {
            int i10 = this.f7173k;
            if (this.f7171i - i10 >= 4) {
                byte[] bArr = this.f7169g;
                this.f7173k = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw e0.m();
        }

        public long L() {
            int i10 = this.f7173k;
            if (this.f7171i - i10 >= 8) {
                byte[] bArr = this.f7169g;
                this.f7173k = i10 + 8;
                return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
            }
            throw e0.m();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int M() {
            /*
                r5 = this;
                int r0 = r5.f7173k
                int r1 = r5.f7171i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f7169g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f7173k = r3
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
                long r0 = r5.O()
                int r1 = (int) r0
                return r1
            L70:
                r5.f7173k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.b.M():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long N() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.b.N():long");
        }

        long O() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte I = I();
                j10 |= (I & Byte.MAX_VALUE) << i10;
                if ((I & 128) == 0) {
                    return j10;
                }
            }
            throw e0.f();
        }

        public void Q() {
            int D;
            do {
                D = D();
                if (D == 0) {
                    return;
                }
            } while (H(D));
        }

        public void R(int i10) {
            if (i10 >= 0) {
                int i11 = this.f7171i;
                int i12 = this.f7173k;
                if (i10 <= i11 - i12) {
                    this.f7173k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw e0.m();
            }
            throw e0.g();
        }

        @Override // com.google.protobuf.j
        public void a(int i10) {
            if (this.f7175m != i10) {
                throw e0.b();
            }
        }

        @Override // com.google.protobuf.j
        public int d() {
            return this.f7173k - this.f7174l;
        }

        @Override // com.google.protobuf.j
        public boolean e() {
            return this.f7173k == this.f7171i;
        }

        @Override // com.google.protobuf.j
        public void m(int i10) {
            this.f7177o = i10;
            P();
        }

        @Override // com.google.protobuf.j
        public int n(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                if (d10 >= 0) {
                    int i11 = this.f7177o;
                    if (d10 <= i11) {
                        this.f7177o = d10;
                        P();
                        return i11;
                    }
                    throw e0.m();
                }
                throw e0.h();
            }
            throw e0.g();
        }

        @Override // com.google.protobuf.j
        public boolean o() {
            return N() != 0;
        }

        @Override // com.google.protobuf.j
        public i p() {
            int M = M();
            if (M > 0) {
                int i10 = this.f7171i;
                int i11 = this.f7173k;
                if (M <= i10 - i11) {
                    i T = (this.f7170h && this.f7176n) ? i.T(this.f7169g, i11, M) : i.v(this.f7169g, i11, M);
                    this.f7173k += M;
                    return T;
                }
            }
            return M == 0 ? i.f7143k : i.S(J(M));
        }

        @Override // com.google.protobuf.j
        public double q() {
            return Double.longBitsToDouble(L());
        }

        @Override // com.google.protobuf.j
        public int r() {
            return M();
        }

        @Override // com.google.protobuf.j
        public int s() {
            return K();
        }

        @Override // com.google.protobuf.j
        public long t() {
            return L();
        }

        @Override // com.google.protobuf.j
        public float u() {
            return Float.intBitsToFloat(K());
        }

        @Override // com.google.protobuf.j
        public int v() {
            return M();
        }

        @Override // com.google.protobuf.j
        public long w() {
            return N();
        }

        @Override // com.google.protobuf.j
        public int x() {
            return K();
        }

        @Override // com.google.protobuf.j
        public long y() {
            return L();
        }

        @Override // com.google.protobuf.j
        public int z() {
            return j.b(M());
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends j {

        /* renamed from: g  reason: collision with root package name */
        private final Iterable<ByteBuffer> f7178g;

        /* renamed from: h  reason: collision with root package name */
        private final Iterator<ByteBuffer> f7179h;

        /* renamed from: i  reason: collision with root package name */
        private ByteBuffer f7180i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f7181j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f7182k;

        /* renamed from: l  reason: collision with root package name */
        private int f7183l;

        /* renamed from: m  reason: collision with root package name */
        private int f7184m;

        /* renamed from: n  reason: collision with root package name */
        private int f7185n;

        /* renamed from: o  reason: collision with root package name */
        private int f7186o;

        /* renamed from: p  reason: collision with root package name */
        private int f7187p;

        /* renamed from: q  reason: collision with root package name */
        private int f7188q;

        /* renamed from: r  reason: collision with root package name */
        private long f7189r;

        /* renamed from: s  reason: collision with root package name */
        private long f7190s;

        /* renamed from: t  reason: collision with root package name */
        private long f7191t;

        /* renamed from: u  reason: collision with root package name */
        private long f7192u;

        private c(Iterable<ByteBuffer> iterable, int i10, boolean z10) {
            super();
            this.f7185n = Integer.MAX_VALUE;
            this.f7183l = i10;
            this.f7178g = iterable;
            this.f7179h = iterable.iterator();
            this.f7181j = z10;
            this.f7187p = 0;
            this.f7188q = 0;
            if (i10 != 0) {
                X();
                return;
            }
            this.f7180i = d0.f7095e;
            this.f7189r = 0L;
            this.f7190s = 0L;
            this.f7192u = 0L;
            this.f7191t = 0L;
        }

        private long I() {
            return this.f7192u - this.f7189r;
        }

        private void J() {
            if (!this.f7179h.hasNext()) {
                throw e0.m();
            }
            X();
        }

        private void L(byte[] bArr, int i10, int i11) {
            if (i11 < 0 || i11 > S()) {
                if (i11 > 0) {
                    throw e0.m();
                }
                if (i11 != 0) {
                    throw e0.g();
                }
                return;
            }
            int i12 = i11;
            while (i12 > 0) {
                if (I() == 0) {
                    J();
                }
                int min = Math.min(i12, (int) I());
                long j10 = min;
                z1.p(this.f7189r, bArr, (i11 - i12) + i10, j10);
                i12 -= min;
                this.f7189r += j10;
            }
        }

        private void R() {
            int i10 = this.f7183l + this.f7184m;
            this.f7183l = i10;
            int i11 = i10 - this.f7188q;
            int i12 = this.f7185n;
            if (i11 <= i12) {
                this.f7184m = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f7184m = i13;
            this.f7183l = i10 - i13;
        }

        private int S() {
            return (int) (((this.f7183l - this.f7187p) - this.f7189r) + this.f7190s);
        }

        private void V() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private ByteBuffer W(int i10, int i11) {
            int position = this.f7180i.position();
            int limit = this.f7180i.limit();
            ByteBuffer byteBuffer = this.f7180i;
            try {
                try {
                    byteBuffer.position(i10);
                    byteBuffer.limit(i11);
                    return this.f7180i.slice();
                } catch (IllegalArgumentException unused) {
                    throw e0.m();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        private void X() {
            ByteBuffer next = this.f7179h.next();
            this.f7180i = next;
            this.f7187p += (int) (this.f7189r - this.f7190s);
            long position = next.position();
            this.f7189r = position;
            this.f7190s = position;
            this.f7192u = this.f7180i.limit();
            long k10 = z1.k(this.f7180i);
            this.f7191t = k10;
            this.f7189r += k10;
            this.f7190s += k10;
            this.f7192u += k10;
        }

        @Override // com.google.protobuf.j
        public long A() {
            return j.c(P());
        }

        @Override // com.google.protobuf.j
        public String B() {
            int O = O();
            if (O > 0) {
                long j10 = O;
                long j11 = this.f7192u;
                long j12 = this.f7189r;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[O];
                    z1.p(j12, bArr, 0L, j10);
                    String str = new String(bArr, d0.f7092b);
                    this.f7189r += j10;
                    return str;
                }
            }
            if (O > 0 && O <= S()) {
                byte[] bArr2 = new byte[O];
                L(bArr2, 0, O);
                return new String(bArr2, d0.f7092b);
            } else if (O == 0) {
                return "";
            } else {
                if (O < 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
        }

        @Override // com.google.protobuf.j
        public String C() {
            int O = O();
            if (O > 0) {
                long j10 = O;
                long j11 = this.f7192u;
                long j12 = this.f7189r;
                if (j10 <= j11 - j12) {
                    String g10 = a2.g(this.f7180i, (int) (j12 - this.f7190s), O);
                    this.f7189r += j10;
                    return g10;
                }
            }
            if (O >= 0 && O <= S()) {
                byte[] bArr = new byte[O];
                L(bArr, 0, O);
                return a2.h(bArr, 0, O);
            } else if (O == 0) {
                return "";
            } else {
                if (O <= 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
        }

        @Override // com.google.protobuf.j
        public int D() {
            if (e()) {
                this.f7186o = 0;
                return 0;
            }
            int O = O();
            this.f7186o = O;
            if (b2.a(O) != 0) {
                return this.f7186o;
            }
            throw e0.c();
        }

        @Override // com.google.protobuf.j
        public int E() {
            return O();
        }

        @Override // com.google.protobuf.j
        public long F() {
            return P();
        }

        @Override // com.google.protobuf.j
        public boolean H(int i10) {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                V();
                return true;
            } else if (b10 == 1) {
                U(8);
                return true;
            } else if (b10 == 2) {
                U(O());
                return true;
            } else if (b10 == 3) {
                T();
                a(b2.c(b2.a(i10), 4));
                return true;
            } else if (b10 != 4) {
                if (b10 == 5) {
                    U(4);
                    return true;
                }
                throw e0.e();
            } else {
                return false;
            }
        }

        public byte K() {
            if (I() == 0) {
                J();
            }
            long j10 = this.f7189r;
            this.f7189r = 1 + j10;
            return z1.w(j10);
        }

        public int M() {
            if (I() >= 4) {
                long j10 = this.f7189r;
                this.f7189r = 4 + j10;
                return ((z1.w(j10 + 3) & 255) << 24) | (z1.w(j10) & 255) | ((z1.w(1 + j10) & 255) << 8) | ((z1.w(2 + j10) & 255) << 16);
            }
            return (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16) | ((K() & 255) << 24);
        }

        public long N() {
            if (I() >= 8) {
                long j10 = this.f7189r;
                this.f7189r = 8 + j10;
                return ((z1.w(j10 + 7) & 255) << 56) | (z1.w(j10) & 255) | ((z1.w(1 + j10) & 255) << 8) | ((z1.w(2 + j10) & 255) << 16) | ((z1.w(3 + j10) & 255) << 24) | ((z1.w(4 + j10) & 255) << 32) | ((z1.w(5 + j10) & 255) << 40) | ((z1.w(6 + j10) & 255) << 48);
            }
            return (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16) | ((K() & 255) << 24) | ((K() & 255) << 32) | ((K() & 255) << 40) | ((K() & 255) << 48) | ((K() & 255) << 56);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
            if (com.google.protobuf.z1.w(r4) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int O() {
            /*
                r10 = this;
                long r0 = r10.f7189r
                long r2 = r10.f7192u
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L8a
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.z1.w(r0)
                if (r0 < 0) goto L1a
                long r4 = r10.f7189r
                long r4 = r4 + r2
                r10.f7189r = r4
                return r0
            L1a:
                long r6 = r10.f7192u
                long r8 = r10.f7189r
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L26
                goto L8a
            L26:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L34
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L90
            L34:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L43
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r4
                goto L90
            L43:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L53
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L90
            L53:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L90
            L8a:
                long r0 = r10.Q()
                int r1 = (int) r0
                return r1
            L90:
                r10.f7189r = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.c.O():int");
        }

        public long P() {
            long w10;
            long j10;
            long j11;
            int i10;
            long j12 = this.f7189r;
            if (this.f7192u != j12) {
                long j13 = j12 + 1;
                byte w11 = z1.w(j12);
                if (w11 >= 0) {
                    this.f7189r++;
                    return w11;
                } else if (this.f7192u - this.f7189r >= 10) {
                    long j14 = j13 + 1;
                    int w12 = w11 ^ (z1.w(j13) << 7);
                    if (w12 >= 0) {
                        long j15 = j14 + 1;
                        int w13 = w12 ^ (z1.w(j14) << 14);
                        if (w13 >= 0) {
                            w10 = w13 ^ 16256;
                        } else {
                            j14 = j15 + 1;
                            int w14 = w13 ^ (z1.w(j15) << 21);
                            if (w14 < 0) {
                                i10 = w14 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long w15 = w14 ^ (z1.w(j14) << 28);
                                if (w15 < 0) {
                                    long j16 = j15 + 1;
                                    long w16 = w15 ^ (z1.w(j15) << 35);
                                    if (w16 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        w15 = w16 ^ (z1.w(j16) << 42);
                                        if (w15 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            w16 = w15 ^ (z1.w(j15) << 49);
                                            if (w16 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                w10 = (w16 ^ (z1.w(j16) << 56)) ^ 71499008037633920L;
                                                if (w10 < 0) {
                                                    long j17 = 1 + j15;
                                                    if (z1.w(j15) >= 0) {
                                                        j14 = j17;
                                                        this.f7189r = j14;
                                                        return w10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    w10 = w16 ^ j10;
                                    j14 = j16;
                                    this.f7189r = j14;
                                    return w10;
                                }
                                j11 = 266354560;
                                w10 = w15 ^ j11;
                            }
                        }
                        j14 = j15;
                        this.f7189r = j14;
                        return w10;
                    }
                    i10 = w12 ^ (-128);
                    w10 = i10;
                    this.f7189r = j14;
                    return w10;
                }
            }
            return Q();
        }

        long Q() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte K = K();
                j10 |= (K & Byte.MAX_VALUE) << i10;
                if ((K & 128) == 0) {
                    return j10;
                }
            }
            throw e0.f();
        }

        public void T() {
            int D;
            do {
                D = D();
                if (D == 0) {
                    return;
                }
            } while (H(D));
        }

        public void U(int i10) {
            if (i10 < 0 || i10 > ((this.f7183l - this.f7187p) - this.f7189r) + this.f7190s) {
                if (i10 >= 0) {
                    throw e0.m();
                }
                throw e0.g();
            }
            while (i10 > 0) {
                if (I() == 0) {
                    J();
                }
                int min = Math.min(i10, (int) I());
                i10 -= min;
                this.f7189r += min;
            }
        }

        @Override // com.google.protobuf.j
        public void a(int i10) {
            if (this.f7186o != i10) {
                throw e0.b();
            }
        }

        @Override // com.google.protobuf.j
        public int d() {
            return (int) (((this.f7187p - this.f7188q) + this.f7189r) - this.f7190s);
        }

        @Override // com.google.protobuf.j
        public boolean e() {
            return (((long) this.f7187p) + this.f7189r) - this.f7190s == ((long) this.f7183l);
        }

        @Override // com.google.protobuf.j
        public void m(int i10) {
            this.f7185n = i10;
            R();
        }

        @Override // com.google.protobuf.j
        public int n(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                int i11 = this.f7185n;
                if (d10 <= i11) {
                    this.f7185n = d10;
                    R();
                    return i11;
                }
                throw e0.m();
            }
            throw e0.g();
        }

        @Override // com.google.protobuf.j
        public boolean o() {
            return P() != 0;
        }

        @Override // com.google.protobuf.j
        public i p() {
            int O = O();
            if (O > 0) {
                long j10 = O;
                long j11 = this.f7192u;
                long j12 = this.f7189r;
                if (j10 <= j11 - j12) {
                    if (this.f7181j && this.f7182k) {
                        int i10 = (int) (j12 - this.f7191t);
                        i R = i.R(W(i10, O + i10));
                        this.f7189r += j10;
                        return R;
                    }
                    byte[] bArr = new byte[O];
                    z1.p(j12, bArr, 0L, j10);
                    this.f7189r += j10;
                    return i.S(bArr);
                }
            }
            if (O <= 0 || O > S()) {
                if (O == 0) {
                    return i.f7143k;
                }
                if (O < 0) {
                    throw e0.g();
                }
                throw e0.m();
            } else if (!this.f7181j || !this.f7182k) {
                byte[] bArr2 = new byte[O];
                L(bArr2, 0, O);
                return i.S(bArr2);
            } else {
                ArrayList arrayList = new ArrayList();
                while (O > 0) {
                    if (I() == 0) {
                        J();
                    }
                    int min = Math.min(O, (int) I());
                    int i11 = (int) (this.f7189r - this.f7191t);
                    arrayList.add(i.R(W(i11, i11 + min)));
                    O -= min;
                    this.f7189r += min;
                }
                return i.r(arrayList);
            }
        }

        @Override // com.google.protobuf.j
        public double q() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.protobuf.j
        public int r() {
            return O();
        }

        @Override // com.google.protobuf.j
        public int s() {
            return M();
        }

        @Override // com.google.protobuf.j
        public long t() {
            return N();
        }

        @Override // com.google.protobuf.j
        public float u() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.protobuf.j
        public int v() {
            return O();
        }

        @Override // com.google.protobuf.j
        public long w() {
            return P();
        }

        @Override // com.google.protobuf.j
        public int x() {
            return M();
        }

        @Override // com.google.protobuf.j
        public long y() {
            return N();
        }

        @Override // com.google.protobuf.j
        public int z() {
            return j.b(O());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends j {

        /* renamed from: g  reason: collision with root package name */
        private final InputStream f7193g;

        /* renamed from: h  reason: collision with root package name */
        private final byte[] f7194h;

        /* renamed from: i  reason: collision with root package name */
        private int f7195i;

        /* renamed from: j  reason: collision with root package name */
        private int f7196j;

        /* renamed from: k  reason: collision with root package name */
        private int f7197k;

        /* renamed from: l  reason: collision with root package name */
        private int f7198l;

        /* renamed from: m  reason: collision with root package name */
        private int f7199m;

        /* renamed from: n  reason: collision with root package name */
        private int f7200n;

        /* renamed from: o  reason: collision with root package name */
        private a f7201o;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        private d(InputStream inputStream, int i10) {
            super();
            this.f7200n = Integer.MAX_VALUE;
            this.f7201o = null;
            d0.b(inputStream, "input");
            this.f7193g = inputStream;
            this.f7194h = new byte[i10];
            this.f7195i = 0;
            this.f7197k = 0;
            this.f7199m = 0;
        }

        private static int I(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (e0 e10) {
                e10.j();
                throw e10;
            }
        }

        private static int J(InputStream inputStream, byte[] bArr, int i10, int i11) {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (e0 e10) {
                e10.j();
                throw e10;
            }
        }

        private i K(int i10) {
            byte[] N = N(i10);
            if (N != null) {
                return i.u(N);
            }
            int i11 = this.f7197k;
            int i12 = this.f7195i;
            int i13 = i12 - i11;
            this.f7199m += i12;
            this.f7197k = 0;
            this.f7195i = 0;
            List<byte[]> O = O(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f7194h, i11, bArr, 0, i13);
            for (byte[] bArr2 : O) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return i.S(bArr);
        }

        private byte[] M(int i10, boolean z10) {
            byte[] N = N(i10);
            if (N != null) {
                return z10 ? (byte[]) N.clone() : N;
            }
            int i11 = this.f7197k;
            int i12 = this.f7195i;
            int i13 = i12 - i11;
            this.f7199m += i12;
            this.f7197k = 0;
            this.f7195i = 0;
            List<byte[]> O = O(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f7194h, i11, bArr, 0, i13);
            for (byte[] bArr2 : O) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        private byte[] N(int i10) {
            if (i10 == 0) {
                return d0.f7094d;
            }
            if (i10 >= 0) {
                int i11 = this.f7199m;
                int i12 = this.f7197k;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f7166c <= 0) {
                    int i14 = this.f7200n;
                    if (i13 > i14) {
                        Y((i14 - i11) - i12);
                        throw e0.m();
                    }
                    int i15 = this.f7195i - i12;
                    int i16 = i10 - i15;
                    if (i16 < 4096 || i16 <= I(this.f7193g)) {
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f7194h, this.f7197k, bArr, 0, i15);
                        this.f7199m += this.f7195i;
                        this.f7197k = 0;
                        this.f7195i = 0;
                        while (i15 < i10) {
                            int J = J(this.f7193g, bArr, i15, i10 - i15);
                            if (J == -1) {
                                throw e0.m();
                            }
                            this.f7199m += J;
                            i15 += J;
                        }
                        return bArr;
                    }
                    return null;
                }
                throw e0.l();
            }
            throw e0.g();
        }

        private List<byte[]> O(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f7193g.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw e0.m();
                    }
                    this.f7199m += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void U() {
            int i10 = this.f7195i + this.f7196j;
            this.f7195i = i10;
            int i11 = this.f7199m + i10;
            int i12 = this.f7200n;
            if (i11 <= i12) {
                this.f7196j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f7196j = i13;
            this.f7195i = i10 - i13;
        }

        private void V(int i10) {
            if (d0(i10)) {
                return;
            }
            if (i10 <= (this.f7166c - this.f7199m) - this.f7197k) {
                throw e0.m();
            }
            throw e0.l();
        }

        private static long W(InputStream inputStream, long j10) {
            try {
                return inputStream.skip(j10);
            } catch (e0 e10) {
                e10.j();
                throw e10;
            }
        }

        private void Z(int i10) {
            if (i10 < 0) {
                throw e0.g();
            }
            int i11 = this.f7199m;
            int i12 = this.f7197k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f7200n;
            if (i13 > i14) {
                Y((i14 - i11) - i12);
                throw e0.m();
            }
            int i15 = 0;
            if (this.f7201o == null) {
                this.f7199m = i11 + i12;
                this.f7195i = 0;
                this.f7197k = 0;
                i15 = this.f7195i - i12;
                while (i15 < i10) {
                    try {
                        long j10 = i10 - i15;
                        long W = W(this.f7193g, j10);
                        int i16 = (W > 0L ? 1 : (W == 0L ? 0 : -1));
                        if (i16 < 0 || W > j10) {
                            throw new IllegalStateException(this.f7193g.getClass() + "#skip returned invalid result: " + W + "\nThe InputStream implementation is buggy.");
                        } else if (i16 == 0) {
                            break;
                        } else {
                            i15 += (int) W;
                        }
                    } finally {
                        this.f7199m += i15;
                        U();
                    }
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i17 = this.f7195i;
            int i18 = i17 - this.f7197k;
            this.f7197k = i17;
            while (true) {
                V(1);
                int i19 = i10 - i18;
                int i20 = this.f7195i;
                if (i19 <= i20) {
                    this.f7197k = i19;
                    return;
                } else {
                    i18 += i20;
                    this.f7197k = i20;
                }
            }
        }

        private void a0() {
            if (this.f7195i - this.f7197k >= 10) {
                b0();
            } else {
                c0();
            }
        }

        private void b0() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f7194h;
                int i11 = this.f7197k;
                this.f7197k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private void c0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (L() >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private boolean d0(int i10) {
            int i11 = this.f7197k;
            if (i11 + i10 <= this.f7195i) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i12 = this.f7166c;
            int i13 = this.f7199m;
            if (i10 <= (i12 - i13) - i11 && i13 + i11 + i10 <= this.f7200n) {
                a aVar = this.f7201o;
                if (aVar != null) {
                    aVar.a();
                }
                int i14 = this.f7197k;
                if (i14 > 0) {
                    int i15 = this.f7195i;
                    if (i15 > i14) {
                        byte[] bArr = this.f7194h;
                        System.arraycopy(bArr, i14, bArr, 0, i15 - i14);
                    }
                    this.f7199m += i14;
                    this.f7195i -= i14;
                    this.f7197k = 0;
                }
                InputStream inputStream = this.f7193g;
                byte[] bArr2 = this.f7194h;
                int i16 = this.f7195i;
                int J = J(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f7166c - this.f7199m) - i16));
                if (J == 0 || J < -1 || J > this.f7194h.length) {
                    throw new IllegalStateException(this.f7193g.getClass() + "#read(byte[]) returned invalid result: " + J + "\nThe InputStream implementation is buggy.");
                } else if (J > 0) {
                    this.f7195i += J;
                    U();
                    if (this.f7195i >= i10) {
                        return true;
                    }
                    return d0(i10);
                } else {
                    return false;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.j
        public long A() {
            return j.c(S());
        }

        @Override // com.google.protobuf.j
        public String B() {
            int R = R();
            if (R > 0) {
                int i10 = this.f7195i;
                int i11 = this.f7197k;
                if (R <= i10 - i11) {
                    String str = new String(this.f7194h, i11, R, d0.f7092b);
                    this.f7197k += R;
                    return str;
                }
            }
            if (R == 0) {
                return "";
            }
            if (R <= this.f7195i) {
                V(R);
                String str2 = new String(this.f7194h, this.f7197k, R, d0.f7092b);
                this.f7197k += R;
                return str2;
            }
            return new String(M(R, false), d0.f7092b);
        }

        @Override // com.google.protobuf.j
        public String C() {
            byte[] M;
            int R = R();
            int i10 = this.f7197k;
            int i11 = this.f7195i;
            if (R <= i11 - i10 && R > 0) {
                M = this.f7194h;
                this.f7197k = i10 + R;
            } else if (R == 0) {
                return "";
            } else {
                if (R <= i11) {
                    V(R);
                    M = this.f7194h;
                    this.f7197k = R + 0;
                } else {
                    M = M(R, false);
                }
                i10 = 0;
            }
            return a2.h(M, i10, R);
        }

        @Override // com.google.protobuf.j
        public int D() {
            if (e()) {
                this.f7198l = 0;
                return 0;
            }
            int R = R();
            this.f7198l = R;
            if (b2.a(R) != 0) {
                return this.f7198l;
            }
            throw e0.c();
        }

        @Override // com.google.protobuf.j
        public int E() {
            return R();
        }

        @Override // com.google.protobuf.j
        public long F() {
            return S();
        }

        @Override // com.google.protobuf.j
        public boolean H(int i10) {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                a0();
                return true;
            } else if (b10 == 1) {
                Y(8);
                return true;
            } else if (b10 == 2) {
                Y(R());
                return true;
            } else if (b10 == 3) {
                X();
                a(b2.c(b2.a(i10), 4));
                return true;
            } else if (b10 != 4) {
                if (b10 == 5) {
                    Y(4);
                    return true;
                }
                throw e0.e();
            } else {
                return false;
            }
        }

        public byte L() {
            if (this.f7197k == this.f7195i) {
                V(1);
            }
            byte[] bArr = this.f7194h;
            int i10 = this.f7197k;
            this.f7197k = i10 + 1;
            return bArr[i10];
        }

        public int P() {
            int i10 = this.f7197k;
            if (this.f7195i - i10 < 4) {
                V(4);
                i10 = this.f7197k;
            }
            byte[] bArr = this.f7194h;
            this.f7197k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long Q() {
            int i10 = this.f7197k;
            if (this.f7195i - i10 < 8) {
                V(8);
                i10 = this.f7197k;
            }
            byte[] bArr = this.f7194h;
            this.f7197k = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int R() {
            /*
                r5 = this;
                int r0 = r5.f7197k
                int r1 = r5.f7195i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f7194h
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f7197k = r3
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
                long r0 = r5.T()
                int r1 = (int) r0
                return r1
            L70:
                r5.f7197k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.d.R():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long S() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.d.S():long");
        }

        long T() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte L = L();
                j10 |= (L & Byte.MAX_VALUE) << i10;
                if ((L & 128) == 0) {
                    return j10;
                }
            }
            throw e0.f();
        }

        public void X() {
            int D;
            do {
                D = D();
                if (D == 0) {
                    return;
                }
            } while (H(D));
        }

        public void Y(int i10) {
            int i11 = this.f7195i;
            int i12 = this.f7197k;
            if (i10 > i11 - i12 || i10 < 0) {
                Z(i10);
            } else {
                this.f7197k = i12 + i10;
            }
        }

        @Override // com.google.protobuf.j
        public void a(int i10) {
            if (this.f7198l != i10) {
                throw e0.b();
            }
        }

        @Override // com.google.protobuf.j
        public int d() {
            return this.f7199m + this.f7197k;
        }

        @Override // com.google.protobuf.j
        public boolean e() {
            return this.f7197k == this.f7195i && !d0(1);
        }

        @Override // com.google.protobuf.j
        public void m(int i10) {
            this.f7200n = i10;
            U();
        }

        @Override // com.google.protobuf.j
        public int n(int i10) {
            if (i10 >= 0) {
                int i11 = i10 + this.f7199m + this.f7197k;
                int i12 = this.f7200n;
                if (i11 <= i12) {
                    this.f7200n = i11;
                    U();
                    return i12;
                }
                throw e0.m();
            }
            throw e0.g();
        }

        @Override // com.google.protobuf.j
        public boolean o() {
            return S() != 0;
        }

        @Override // com.google.protobuf.j
        public i p() {
            int R = R();
            int i10 = this.f7195i;
            int i11 = this.f7197k;
            if (R > i10 - i11 || R <= 0) {
                return R == 0 ? i.f7143k : K(R);
            }
            i v10 = i.v(this.f7194h, i11, R);
            this.f7197k += R;
            return v10;
        }

        @Override // com.google.protobuf.j
        public double q() {
            return Double.longBitsToDouble(Q());
        }

        @Override // com.google.protobuf.j
        public int r() {
            return R();
        }

        @Override // com.google.protobuf.j
        public int s() {
            return P();
        }

        @Override // com.google.protobuf.j
        public long t() {
            return Q();
        }

        @Override // com.google.protobuf.j
        public float u() {
            return Float.intBitsToFloat(P());
        }

        @Override // com.google.protobuf.j
        public int v() {
            return R();
        }

        @Override // com.google.protobuf.j
        public long w() {
            return S();
        }

        @Override // com.google.protobuf.j
        public int x() {
            return P();
        }

        @Override // com.google.protobuf.j
        public long y() {
            return Q();
        }

        @Override // com.google.protobuf.j
        public int z() {
            return j.b(R());
        }
    }

    /* loaded from: classes.dex */
    private static final class e extends j {

        /* renamed from: g  reason: collision with root package name */
        private final ByteBuffer f7202g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f7203h;

        /* renamed from: i  reason: collision with root package name */
        private final long f7204i;

        /* renamed from: j  reason: collision with root package name */
        private long f7205j;

        /* renamed from: k  reason: collision with root package name */
        private long f7206k;

        /* renamed from: l  reason: collision with root package name */
        private long f7207l;

        /* renamed from: m  reason: collision with root package name */
        private int f7208m;

        /* renamed from: n  reason: collision with root package name */
        private int f7209n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f7210o;

        /* renamed from: p  reason: collision with root package name */
        private int f7211p;

        private e(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f7211p = Integer.MAX_VALUE;
            this.f7202g = byteBuffer;
            long k10 = z1.k(byteBuffer);
            this.f7204i = k10;
            this.f7205j = byteBuffer.limit() + k10;
            long position = k10 + byteBuffer.position();
            this.f7206k = position;
            this.f7207l = position;
            this.f7203h = z10;
        }

        private int I(long j10) {
            return (int) (j10 - this.f7204i);
        }

        static boolean J() {
            return z1.J();
        }

        private void Q() {
            long j10 = this.f7205j + this.f7208m;
            this.f7205j = j10;
            int i10 = (int) (j10 - this.f7207l);
            int i11 = this.f7211p;
            if (i10 <= i11) {
                this.f7208m = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f7208m = i12;
            this.f7205j = j10 - i12;
        }

        private int R() {
            return (int) (this.f7205j - this.f7206k);
        }

        private void U() {
            if (R() >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f7206k;
                this.f7206k = 1 + j10;
                if (z1.w(j10) >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private void W() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private ByteBuffer X(long j10, long j11) {
            int position = this.f7202g.position();
            int limit = this.f7202g.limit();
            ByteBuffer byteBuffer = this.f7202g;
            try {
                try {
                    byteBuffer.position(I(j10));
                    byteBuffer.limit(I(j11));
                    return this.f7202g.slice();
                } catch (IllegalArgumentException e10) {
                    e0 m10 = e0.m();
                    m10.initCause(e10);
                    throw m10;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        @Override // com.google.protobuf.j
        public long A() {
            return j.c(O());
        }

        @Override // com.google.protobuf.j
        public String B() {
            int N = N();
            if (N <= 0 || N > R()) {
                if (N == 0) {
                    return "";
                }
                if (N < 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
            byte[] bArr = new byte[N];
            long j10 = N;
            z1.p(this.f7206k, bArr, 0L, j10);
            String str = new String(bArr, d0.f7092b);
            this.f7206k += j10;
            return str;
        }

        @Override // com.google.protobuf.j
        public String C() {
            int N = N();
            if (N > 0 && N <= R()) {
                String g10 = a2.g(this.f7202g, I(this.f7206k), N);
                this.f7206k += N;
                return g10;
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
        }

        @Override // com.google.protobuf.j
        public int D() {
            if (e()) {
                this.f7209n = 0;
                return 0;
            }
            int N = N();
            this.f7209n = N;
            if (b2.a(N) != 0) {
                return this.f7209n;
            }
            throw e0.c();
        }

        @Override // com.google.protobuf.j
        public int E() {
            return N();
        }

        @Override // com.google.protobuf.j
        public long F() {
            return O();
        }

        @Override // com.google.protobuf.j
        public boolean H(int i10) {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                U();
                return true;
            } else if (b10 == 1) {
                T(8);
                return true;
            } else if (b10 == 2) {
                T(N());
                return true;
            } else if (b10 == 3) {
                S();
                a(b2.c(b2.a(i10), 4));
                return true;
            } else if (b10 != 4) {
                if (b10 == 5) {
                    T(4);
                    return true;
                }
                throw e0.e();
            } else {
                return false;
            }
        }

        public byte K() {
            long j10 = this.f7206k;
            if (j10 != this.f7205j) {
                this.f7206k = 1 + j10;
                return z1.w(j10);
            }
            throw e0.m();
        }

        public int L() {
            long j10 = this.f7206k;
            if (this.f7205j - j10 >= 4) {
                this.f7206k = 4 + j10;
                return ((z1.w(j10 + 3) & 255) << 24) | (z1.w(j10) & 255) | ((z1.w(1 + j10) & 255) << 8) | ((z1.w(2 + j10) & 255) << 16);
            }
            throw e0.m();
        }

        public long M() {
            long j10 = this.f7206k;
            if (this.f7205j - j10 >= 8) {
                this.f7206k = 8 + j10;
                return ((z1.w(j10 + 7) & 255) << 56) | (z1.w(j10) & 255) | ((z1.w(1 + j10) & 255) << 8) | ((z1.w(2 + j10) & 255) << 16) | ((z1.w(3 + j10) & 255) << 24) | ((z1.w(4 + j10) & 255) << 32) | ((z1.w(5 + j10) & 255) << 40) | ((z1.w(6 + j10) & 255) << 48);
            }
            throw e0.m();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
            if (com.google.protobuf.z1.w(r4) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() {
            /*
                r10 = this;
                long r0 = r10.f7206k
                long r2 = r10.f7205j
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L85
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.z1.w(r0)
                if (r0 < 0) goto L17
                r10.f7206k = r4
                return r0
            L17:
                long r6 = r10.f7205j
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L21
                goto L85
            L21:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L2f
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8b
            L2f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3c:
                r6 = r4
                goto L8b
            L3e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L4e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8b
            L4e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L8b
            L85:
                long r0 = r10.P()
                int r1 = (int) r0
                return r1
            L8b:
                r10.f7206k = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.e.N():int");
        }

        public long O() {
            long w10;
            long j10;
            long j11;
            int i10;
            long j12 = this.f7206k;
            if (this.f7205j != j12) {
                long j13 = j12 + 1;
                byte w11 = z1.w(j12);
                if (w11 >= 0) {
                    this.f7206k = j13;
                    return w11;
                } else if (this.f7205j - j13 >= 9) {
                    long j14 = j13 + 1;
                    int w12 = w11 ^ (z1.w(j13) << 7);
                    if (w12 >= 0) {
                        long j15 = j14 + 1;
                        int w13 = w12 ^ (z1.w(j14) << 14);
                        if (w13 >= 0) {
                            w10 = w13 ^ 16256;
                        } else {
                            j14 = j15 + 1;
                            int w14 = w13 ^ (z1.w(j15) << 21);
                            if (w14 < 0) {
                                i10 = w14 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long w15 = w14 ^ (z1.w(j14) << 28);
                                if (w15 < 0) {
                                    long j16 = j15 + 1;
                                    long w16 = w15 ^ (z1.w(j15) << 35);
                                    if (w16 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        w15 = w16 ^ (z1.w(j16) << 42);
                                        if (w15 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            w16 = w15 ^ (z1.w(j15) << 49);
                                            if (w16 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                w10 = (w16 ^ (z1.w(j16) << 56)) ^ 71499008037633920L;
                                                if (w10 < 0) {
                                                    long j17 = 1 + j15;
                                                    if (z1.w(j15) >= 0) {
                                                        j14 = j17;
                                                        this.f7206k = j14;
                                                        return w10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    w10 = w16 ^ j10;
                                    j14 = j16;
                                    this.f7206k = j14;
                                    return w10;
                                }
                                j11 = 266354560;
                                w10 = w15 ^ j11;
                            }
                        }
                        j14 = j15;
                        this.f7206k = j14;
                        return w10;
                    }
                    i10 = w12 ^ (-128);
                    w10 = i10;
                    this.f7206k = j14;
                    return w10;
                }
            }
            return P();
        }

        long P() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte K = K();
                j10 |= (K & Byte.MAX_VALUE) << i10;
                if ((K & 128) == 0) {
                    return j10;
                }
            }
            throw e0.f();
        }

        public void S() {
            int D;
            do {
                D = D();
                if (D == 0) {
                    return;
                }
            } while (H(D));
        }

        public void T(int i10) {
            if (i10 >= 0 && i10 <= R()) {
                this.f7206k += i10;
            } else if (i10 >= 0) {
                throw e0.m();
            } else {
                throw e0.g();
            }
        }

        @Override // com.google.protobuf.j
        public void a(int i10) {
            if (this.f7209n != i10) {
                throw e0.b();
            }
        }

        @Override // com.google.protobuf.j
        public int d() {
            return (int) (this.f7206k - this.f7207l);
        }

        @Override // com.google.protobuf.j
        public boolean e() {
            return this.f7206k == this.f7205j;
        }

        @Override // com.google.protobuf.j
        public void m(int i10) {
            this.f7211p = i10;
            Q();
        }

        @Override // com.google.protobuf.j
        public int n(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                int i11 = this.f7211p;
                if (d10 <= i11) {
                    this.f7211p = d10;
                    Q();
                    return i11;
                }
                throw e0.m();
            }
            throw e0.g();
        }

        @Override // com.google.protobuf.j
        public boolean o() {
            return O() != 0;
        }

        @Override // com.google.protobuf.j
        public i p() {
            int N = N();
            if (N <= 0 || N > R()) {
                if (N == 0) {
                    return i.f7143k;
                }
                if (N < 0) {
                    throw e0.g();
                }
                throw e0.m();
            } else if (this.f7203h && this.f7210o) {
                long j10 = this.f7206k;
                long j11 = N;
                ByteBuffer X = X(j10, j10 + j11);
                this.f7206k += j11;
                return i.R(X);
            } else {
                byte[] bArr = new byte[N];
                long j12 = N;
                z1.p(this.f7206k, bArr, 0L, j12);
                this.f7206k += j12;
                return i.S(bArr);
            }
        }

        @Override // com.google.protobuf.j
        public double q() {
            return Double.longBitsToDouble(M());
        }

        @Override // com.google.protobuf.j
        public int r() {
            return N();
        }

        @Override // com.google.protobuf.j
        public int s() {
            return L();
        }

        @Override // com.google.protobuf.j
        public long t() {
            return M();
        }

        @Override // com.google.protobuf.j
        public float u() {
            return Float.intBitsToFloat(L());
        }

        @Override // com.google.protobuf.j
        public int v() {
            return N();
        }

        @Override // com.google.protobuf.j
        public long w() {
            return O();
        }

        @Override // com.google.protobuf.j
        public int x() {
            return L();
        }

        @Override // com.google.protobuf.j
        public long y() {
            return M();
        }

        @Override // com.google.protobuf.j
        public int z() {
            return j.b(N());
        }
    }

    private j() {
        this.f7165b = f7163f;
        this.f7166c = Integer.MAX_VALUE;
        this.f7168e = false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static j f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static j g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? j(d0.f7094d) : new d(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j h(Iterable<ByteBuffer> iterable, boolean z10) {
        boolean z11 = false;
        int i10 = 0;
        for (ByteBuffer byteBuffer : iterable) {
            i10 += byteBuffer.remaining();
            z11 = byteBuffer.hasArray() ? z11 | true : byteBuffer.isDirect() ? z11 | true : z11 | true;
        }
        return z11 ? new c(iterable, i10, z10) : f(new f0(iterable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j i(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && e.J()) {
            return new e(byteBuffer, z10);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return l(bArr, 0, remaining, true);
    }

    public static j j(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static j k(byte[] bArr, int i10, int i11) {
        return l(bArr, i10, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j l(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.n(i11);
            return bVar;
        } catch (e0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract long A();

    public abstract String B();

    public abstract String C();

    public abstract int D();

    public abstract int E();

    public abstract long F();

    public final int G(int i10) {
        if (i10 >= 0) {
            int i11 = this.f7166c;
            this.f7166c = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    public abstract boolean H(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void m(int i10);

    public abstract int n(int i10);

    public abstract boolean o();

    public abstract i p();

    public abstract double q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract float u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract int z();
}
