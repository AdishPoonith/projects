package i2;

import android.net.Uri;
import android.util.Pair;
import f.j;
import java.util.Map;
import p3.a0;
import p3.n0;
import s1.n1;
import s1.u2;
import u1.o0;
import x1.e0;
import x1.l;
import x1.m;
import x1.n;
import x1.q;
import x1.r;
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: h  reason: collision with root package name */
    public static final r f9628h = new r() { // from class: i2.a
        @Override // x1.r
        public final l[] a() {
            l[] f10;
            f10 = b.f();
            return f10;
        }

        @Override // x1.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private n f9629a;

    /* renamed from: b  reason: collision with root package name */
    private e0 f9630b;

    /* renamed from: e  reason: collision with root package name */
    private InterfaceC0158b f9633e;

    /* renamed from: c  reason: collision with root package name */
    private int f9631c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f9632d = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f9634f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f9635g = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0158b {

        /* renamed from: m  reason: collision with root package name */
        private static final int[] f9636m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n  reason: collision with root package name */
        private static final int[] f9637n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, j.H0, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        private final n f9638a;

        /* renamed from: b  reason: collision with root package name */
        private final e0 f9639b;

        /* renamed from: c  reason: collision with root package name */
        private final i2.c f9640c;

        /* renamed from: d  reason: collision with root package name */
        private final int f9641d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f9642e;

        /* renamed from: f  reason: collision with root package name */
        private final a0 f9643f;

        /* renamed from: g  reason: collision with root package name */
        private final int f9644g;

        /* renamed from: h  reason: collision with root package name */
        private final n1 f9645h;

        /* renamed from: i  reason: collision with root package name */
        private int f9646i;

        /* renamed from: j  reason: collision with root package name */
        private long f9647j;

        /* renamed from: k  reason: collision with root package name */
        private int f9648k;

        /* renamed from: l  reason: collision with root package name */
        private long f9649l;

        public a(n nVar, e0 e0Var, i2.c cVar) {
            this.f9638a = nVar;
            this.f9639b = e0Var;
            this.f9640c = cVar;
            int max = Math.max(1, cVar.f9660c / 10);
            this.f9644g = max;
            a0 a0Var = new a0(cVar.f9664g);
            a0Var.y();
            int y10 = a0Var.y();
            this.f9641d = y10;
            int i10 = cVar.f9659b;
            int i11 = (((cVar.f9662e - (i10 * 4)) * 8) / (cVar.f9663f * i10)) + 1;
            if (y10 == i11) {
                int l10 = n0.l(max, y10);
                this.f9642e = new byte[cVar.f9662e * l10];
                this.f9643f = new a0(l10 * h(y10, i10));
                int i12 = ((cVar.f9660c * cVar.f9662e) * 8) / y10;
                this.f9645h = new n1.b().g0("audio/raw").I(i12).b0(i12).Y(h(max, i10)).J(cVar.f9659b).h0(cVar.f9660c).a0(2).G();
                return;
            }
            throw u2.a("Expected frames per block: " + i11 + "; got: " + y10, null);
        }

        private void d(byte[] bArr, int i10, a0 a0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f9640c.f9659b; i12++) {
                    e(bArr, i11, i12, a0Var.e());
                }
            }
            int g10 = g(this.f9641d * i10);
            a0Var.T(0);
            a0Var.S(g10);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            i2.c cVar = this.f9640c;
            int i12 = cVar.f9662e;
            int i13 = cVar.f9659b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i18 = f9637n[min];
            int i19 = ((i10 * this.f9641d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                int i21 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & 255;
                int i22 = i20 % 2 == 0 ? i21 & 15 : i21 >> 4;
                int i23 = ((((i22 & 7) * 2) + 1) * i18) >> 3;
                if ((i22 & 8) != 0) {
                    i23 = -i23;
                }
                i17 = n0.q(i17 + i23, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i24 = min + f9636m[i22];
                int[] iArr = f9637n;
                min = n0.q(i24, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        private int f(int i10) {
            return i10 / (this.f9640c.f9659b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f9640c.f9659b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long N0 = this.f9647j + n0.N0(this.f9649l, 1000000L, this.f9640c.f9660c);
            int g10 = g(i10);
            this.f9639b.c(N0, 1, g10, this.f9648k - g10, null);
            this.f9649l += i10;
            this.f9648k -= g10;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:4:0x001c). Please submit an issue!!! */
        @Override // i2.b.InterfaceC0158b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(x1.m r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f9644g
                int r1 = r6.f9648k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f9641d
                int r0 = p3.n0.l(r0, r1)
                i2.c r1 = r6.f9640c
                int r1 = r1.f9662e
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L1e
            L1c:
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                if (r2 != 0) goto L3f
                int r3 = r6.f9646i
                if (r3 >= r0) goto L3f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.f9642e
                int r5 = r6.f9646i
                int r3 = r7.read(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L39
                goto L1c
            L39:
                int r4 = r6.f9646i
                int r4 = r4 + r3
                r6.f9646i = r4
                goto L1f
            L3f:
                int r7 = r6.f9646i
                i2.c r8 = r6.f9640c
                int r8 = r8.f9662e
                int r7 = r7 / r8
                if (r7 <= 0) goto L77
                byte[] r8 = r6.f9642e
                p3.a0 r9 = r6.f9643f
                r6.d(r8, r7, r9)
                int r8 = r6.f9646i
                i2.c r9 = r6.f9640c
                int r9 = r9.f9662e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f9646i = r8
                p3.a0 r7 = r6.f9643f
                int r7 = r7.g()
                x1.e0 r8 = r6.f9639b
                p3.a0 r9 = r6.f9643f
                r8.d(r9, r7)
                int r8 = r6.f9648k
                int r8 = r8 + r7
                r6.f9648k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f9644g
                if (r7 < r8) goto L77
                r6.i(r8)
            L77:
                if (r2 == 0) goto L84
                int r7 = r6.f9648k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L84
                r6.i(r7)
            L84:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i2.b.a.a(x1.m, long):boolean");
        }

        @Override // i2.b.InterfaceC0158b
        public void b(int i10, long j10) {
            this.f9638a.t(new e(this.f9640c, this.f9641d, i10, j10));
            this.f9639b.e(this.f9645h);
        }

        @Override // i2.b.InterfaceC0158b
        public void c(long j10) {
            this.f9646i = 0;
            this.f9647j = j10;
            this.f9648k = 0;
            this.f9649l = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0158b {
        boolean a(m mVar, long j10);

        void b(int i10, long j10);

        void c(long j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC0158b {

        /* renamed from: a  reason: collision with root package name */
        private final n f9650a;

        /* renamed from: b  reason: collision with root package name */
        private final e0 f9651b;

        /* renamed from: c  reason: collision with root package name */
        private final i2.c f9652c;

        /* renamed from: d  reason: collision with root package name */
        private final n1 f9653d;

        /* renamed from: e  reason: collision with root package name */
        private final int f9654e;

        /* renamed from: f  reason: collision with root package name */
        private long f9655f;

        /* renamed from: g  reason: collision with root package name */
        private int f9656g;

        /* renamed from: h  reason: collision with root package name */
        private long f9657h;

        public c(n nVar, e0 e0Var, i2.c cVar, String str, int i10) {
            this.f9650a = nVar;
            this.f9651b = e0Var;
            this.f9652c = cVar;
            int i11 = (cVar.f9659b * cVar.f9663f) / 8;
            if (cVar.f9662e == i11) {
                int i12 = cVar.f9660c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f9654e = max;
                this.f9653d = new n1.b().g0(str).I(i13).b0(i13).Y(max).J(cVar.f9659b).h0(cVar.f9660c).a0(i10).G();
                return;
            }
            throw u2.a("Expected block size: " + i11 + "; got: " + cVar.f9662e, null);
        }

        @Override // i2.b.InterfaceC0158b
        public boolean a(m mVar, long j10) {
            int i10;
            i2.c cVar;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f9656g) >= (i12 = this.f9654e)) {
                    break;
                }
                int f10 = this.f9651b.f(mVar, (int) Math.min(i12 - i11, j11), true);
                if (f10 == -1) {
                    j11 = 0;
                } else {
                    this.f9656g += f10;
                    j11 -= f10;
                }
            }
            int i13 = this.f9652c.f9662e;
            int i14 = this.f9656g / i13;
            if (i14 > 0) {
                int i15 = i14 * i13;
                int i16 = this.f9656g - i15;
                this.f9651b.c(this.f9655f + n0.N0(this.f9657h, 1000000L, cVar.f9660c), 1, i15, i16, null);
                this.f9657h += i14;
                this.f9656g = i16;
            }
            return i10 <= 0;
        }

        @Override // i2.b.InterfaceC0158b
        public void b(int i10, long j10) {
            this.f9650a.t(new e(this.f9652c, 1, i10, j10));
            this.f9651b.e(this.f9653d);
        }

        @Override // i2.b.InterfaceC0158b
        public void c(long j10) {
            this.f9655f = j10;
            this.f9656g = 0;
            this.f9657h = 0L;
        }
    }

    private void e() {
        p3.a.h(this.f9630b);
        n0.j(this.f9629a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] f() {
        return new l[]{new b()};
    }

    private void g(m mVar) {
        p3.a.f(mVar.p() == 0);
        int i10 = this.f9634f;
        if (i10 != -1) {
            mVar.g(i10);
            this.f9631c = 4;
        } else if (!d.a(mVar)) {
            throw u2.a("Unsupported or unrecognized wav file type.", null);
        } else {
            mVar.g((int) (mVar.l() - mVar.p()));
            this.f9631c = 1;
        }
    }

    private void h(m mVar) {
        InterfaceC0158b cVar;
        i2.c b10 = d.b(mVar);
        int i10 = b10.f9658a;
        if (i10 == 17) {
            cVar = new a(this.f9629a, this.f9630b, b10);
        } else if (i10 == 6) {
            cVar = new c(this.f9629a, this.f9630b, b10, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            cVar = new c(this.f9629a, this.f9630b, b10, "audio/g711-mlaw", -1);
        } else {
            int a10 = o0.a(i10, b10.f9663f);
            if (a10 == 0) {
                throw u2.d("Unsupported WAV format type: " + b10.f9658a);
            }
            cVar = new c(this.f9629a, this.f9630b, b10, "audio/raw", a10);
        }
        this.f9633e = cVar;
        this.f9631c = 3;
    }

    private void k(m mVar) {
        this.f9632d = d.c(mVar);
        this.f9631c = 2;
    }

    private int l(m mVar) {
        p3.a.f(this.f9635g != -1);
        return ((InterfaceC0158b) p3.a.e(this.f9633e)).a(mVar, this.f9635g - mVar.p()) ? -1 : 0;
    }

    private void m(m mVar) {
        Pair<Long, Long> e10 = d.e(mVar);
        this.f9634f = ((Long) e10.first).intValue();
        long longValue = ((Long) e10.second).longValue();
        long j10 = this.f9632d;
        if (j10 != -1 && longValue == 4294967295L) {
            longValue = j10;
        }
        this.f9635g = this.f9634f + longValue;
        long a10 = mVar.a();
        if (a10 != -1 && this.f9635g > a10) {
            p3.r.i("WavExtractor", "Data exceeds input length: " + this.f9635g + ", " + a10);
            this.f9635g = a10;
        }
        ((InterfaceC0158b) p3.a.e(this.f9633e)).b(this.f9634f, this.f9635g);
        this.f9631c = 4;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f9631c = j10 == 0 ? 0 : 4;
        InterfaceC0158b interfaceC0158b = this.f9633e;
        if (interfaceC0158b != null) {
            interfaceC0158b.c(j11);
        }
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f9629a = nVar;
        this.f9630b = nVar.d(0, 1);
        nVar.k();
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        e();
        int i10 = this.f9631c;
        if (i10 == 0) {
            g(mVar);
            return 0;
        } else if (i10 == 1) {
            k(mVar);
            return 0;
        } else if (i10 == 2) {
            h(mVar);
            return 0;
        } else if (i10 == 3) {
            m(mVar);
            return 0;
        } else if (i10 == 4) {
            return l(mVar);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // x1.l
    public boolean j(m mVar) {
        return d.a(mVar);
    }
}
