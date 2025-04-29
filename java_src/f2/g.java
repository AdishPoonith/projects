package f2;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import f2.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p3.a0;
import p3.j0;
import p3.n0;
import p3.w;
import s1.n1;
import s1.u2;
import w1.m;
import x1.b0;
import x1.e0;
import x1.x;
/* loaded from: classes.dex */
public class g implements x1.l {
    public static final x1.r I = new x1.r() { // from class: f2.f
        @Override // x1.r
        public final x1.l[] a() {
            x1.l[] n10;
            n10 = g.n();
            return n10;
        }

        @Override // x1.r
        public /* synthetic */ x1.l[] b(Uri uri, Map map) {
            return x1.q.a(this, uri, map);
        }
    };
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final n1 K = new n1.b().g0("application/x-emsg").G();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private x1.n E;
    private e0[] F;
    private e0[] G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final int f8651a;

    /* renamed from: b  reason: collision with root package name */
    private final o f8652b;

    /* renamed from: c  reason: collision with root package name */
    private final List<n1> f8653c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<b> f8654d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f8655e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f8656f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f8657g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f8658h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f8659i;

    /* renamed from: j  reason: collision with root package name */
    private final j0 f8660j;

    /* renamed from: k  reason: collision with root package name */
    private final m2.c f8661k;

    /* renamed from: l  reason: collision with root package name */
    private final a0 f8662l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayDeque<a.C0141a> f8663m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque<a> f8664n;

    /* renamed from: o  reason: collision with root package name */
    private final e0 f8665o;

    /* renamed from: p  reason: collision with root package name */
    private int f8666p;

    /* renamed from: q  reason: collision with root package name */
    private int f8667q;

    /* renamed from: r  reason: collision with root package name */
    private long f8668r;

    /* renamed from: s  reason: collision with root package name */
    private int f8669s;

    /* renamed from: t  reason: collision with root package name */
    private a0 f8670t;

    /* renamed from: u  reason: collision with root package name */
    private long f8671u;

    /* renamed from: v  reason: collision with root package name */
    private int f8672v;

    /* renamed from: w  reason: collision with root package name */
    private long f8673w;

    /* renamed from: x  reason: collision with root package name */
    private long f8674x;

    /* renamed from: y  reason: collision with root package name */
    private long f8675y;

    /* renamed from: z  reason: collision with root package name */
    private b f8676z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f8677a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8678b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8679c;

        public a(long j10, boolean z10, int i10) {
            this.f8677a = j10;
            this.f8678b = z10;
            this.f8679c = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final e0 f8680a;

        /* renamed from: d  reason: collision with root package name */
        public r f8683d;

        /* renamed from: e  reason: collision with root package name */
        public c f8684e;

        /* renamed from: f  reason: collision with root package name */
        public int f8685f;

        /* renamed from: g  reason: collision with root package name */
        public int f8686g;

        /* renamed from: h  reason: collision with root package name */
        public int f8687h;

        /* renamed from: i  reason: collision with root package name */
        public int f8688i;

        /* renamed from: l  reason: collision with root package name */
        private boolean f8691l;

        /* renamed from: b  reason: collision with root package name */
        public final q f8681b = new q();

        /* renamed from: c  reason: collision with root package name */
        public final a0 f8682c = new a0();

        /* renamed from: j  reason: collision with root package name */
        private final a0 f8689j = new a0(1);

        /* renamed from: k  reason: collision with root package name */
        private final a0 f8690k = new a0();

        public b(e0 e0Var, r rVar, c cVar) {
            this.f8680a = e0Var;
            this.f8683d = rVar;
            this.f8684e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10 = !this.f8691l ? this.f8683d.f8777g[this.f8685f] : this.f8681b.f8763k[this.f8685f] ? 1 : 0;
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f8691l ? this.f8683d.f8773c[this.f8685f] : this.f8681b.f8759g[this.f8687h];
        }

        public long e() {
            return !this.f8691l ? this.f8683d.f8776f[this.f8685f] : this.f8681b.c(this.f8685f);
        }

        public int f() {
            return !this.f8691l ? this.f8683d.f8774d[this.f8685f] : this.f8681b.f8761i[this.f8685f];
        }

        public p g() {
            if (this.f8691l) {
                int i10 = ((c) n0.j(this.f8681b.f8753a)).f8639a;
                p pVar = this.f8681b.f8766n;
                if (pVar == null) {
                    pVar = this.f8683d.f8771a.a(i10);
                }
                if (pVar == null || !pVar.f8748a) {
                    return null;
                }
                return pVar;
            }
            return null;
        }

        public boolean h() {
            this.f8685f++;
            if (this.f8691l) {
                int i10 = this.f8686g + 1;
                this.f8686g = i10;
                int[] iArr = this.f8681b.f8760h;
                int i11 = this.f8687h;
                if (i10 == iArr[i11]) {
                    this.f8687h = i11 + 1;
                    this.f8686g = 0;
                    return false;
                }
                return true;
            }
            return false;
        }

        public int i(int i10, int i11) {
            a0 a0Var;
            p g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i12 = g10.f8751d;
            if (i12 != 0) {
                a0Var = this.f8681b.f8767o;
            } else {
                byte[] bArr = (byte[]) n0.j(g10.f8752e);
                this.f8690k.R(bArr, bArr.length);
                a0 a0Var2 = this.f8690k;
                i12 = bArr.length;
                a0Var = a0Var2;
            }
            boolean g11 = this.f8681b.g(this.f8685f);
            boolean z10 = g11 || i11 != 0;
            this.f8689j.e()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f8689j.T(0);
            this.f8680a.b(this.f8689j, 1, 1);
            this.f8680a.b(a0Var, i12, 1);
            if (z10) {
                if (!g11) {
                    this.f8682c.P(8);
                    byte[] e10 = this.f8682c.e();
                    e10[0] = 0;
                    e10[1] = 1;
                    e10[2] = (byte) ((i11 >> 8) & 255);
                    e10[3] = (byte) (i11 & 255);
                    e10[4] = (byte) ((i10 >> 24) & 255);
                    e10[5] = (byte) ((i10 >> 16) & 255);
                    e10[6] = (byte) ((i10 >> 8) & 255);
                    e10[7] = (byte) (i10 & 255);
                    this.f8680a.b(this.f8682c, 8, 1);
                    return i12 + 1 + 8;
                }
                a0 a0Var3 = this.f8681b.f8767o;
                int M = a0Var3.M();
                a0Var3.U(-2);
                int i13 = (M * 6) + 2;
                if (i11 != 0) {
                    this.f8682c.P(i13);
                    byte[] e11 = this.f8682c.e();
                    a0Var3.l(e11, 0, i13);
                    int i14 = (((e11[2] & 255) << 8) | (e11[3] & 255)) + i11;
                    e11[2] = (byte) ((i14 >> 8) & 255);
                    e11[3] = (byte) (i14 & 255);
                    a0Var3 = this.f8682c;
                }
                this.f8680a.b(a0Var3, i13, 1);
                return i12 + 1 + i13;
            }
            return i12 + 1;
        }

        public void j(r rVar, c cVar) {
            this.f8683d = rVar;
            this.f8684e = cVar;
            this.f8680a.e(rVar.f8771a.f8742f);
            k();
        }

        public void k() {
            this.f8681b.f();
            this.f8685f = 0;
            this.f8687h = 0;
            this.f8686g = 0;
            this.f8688i = 0;
            this.f8691l = false;
        }

        public void l(long j10) {
            int i10 = this.f8685f;
            while (true) {
                q qVar = this.f8681b;
                if (i10 >= qVar.f8758f || qVar.c(i10) > j10) {
                    return;
                }
                if (this.f8681b.f8763k[i10]) {
                    this.f8688i = i10;
                }
                i10++;
            }
        }

        public void m() {
            p g10 = g();
            if (g10 == null) {
                return;
            }
            a0 a0Var = this.f8681b.f8767o;
            int i10 = g10.f8751d;
            if (i10 != 0) {
                a0Var.U(i10);
            }
            if (this.f8681b.g(this.f8685f)) {
                a0Var.U(a0Var.M() * 6);
            }
        }

        public void n(w1.m mVar) {
            p a10 = this.f8683d.f8771a.a(((c) n0.j(this.f8681b.f8753a)).f8639a);
            this.f8680a.e(this.f8683d.f8771a.f8742f.b().O(mVar.c(a10 != null ? a10.f8749b : null)).G());
        }
    }

    public g() {
        this(0);
    }

    public g(int i10) {
        this(i10, null);
    }

    public g(int i10, j0 j0Var) {
        this(i10, j0Var, null, Collections.emptyList());
    }

    public g(int i10, j0 j0Var, o oVar) {
        this(i10, j0Var, oVar, Collections.emptyList());
    }

    public g(int i10, j0 j0Var, o oVar, List<n1> list) {
        this(i10, j0Var, oVar, list, null);
    }

    public g(int i10, j0 j0Var, o oVar, List<n1> list, e0 e0Var) {
        this.f8651a = i10;
        this.f8660j = j0Var;
        this.f8652b = oVar;
        this.f8653c = Collections.unmodifiableList(list);
        this.f8665o = e0Var;
        this.f8661k = new m2.c();
        this.f8662l = new a0(16);
        this.f8655e = new a0(w.f15443a);
        this.f8656f = new a0(5);
        this.f8657g = new a0();
        byte[] bArr = new byte[16];
        this.f8658h = bArr;
        this.f8659i = new a0(bArr);
        this.f8663m = new ArrayDeque<>();
        this.f8664n = new ArrayDeque<>();
        this.f8654d = new SparseArray<>();
        this.f8674x = -9223372036854775807L;
        this.f8673w = -9223372036854775807L;
        this.f8675y = -9223372036854775807L;
        this.E = x1.n.f20189i;
        this.F = new e0[0];
        this.G = new e0[0];
    }

    private static void A(a0 a0Var, int i10, q qVar) {
        a0Var.T(i10 + 8);
        int b10 = f2.a.b(a0Var.p());
        if ((b10 & 1) != 0) {
            throw u2.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (b10 & 2) != 0;
        int K2 = a0Var.K();
        if (K2 == 0) {
            Arrays.fill(qVar.f8765m, 0, qVar.f8758f, false);
        } else if (K2 == qVar.f8758f) {
            Arrays.fill(qVar.f8765m, 0, K2, z10);
            qVar.d(a0Var.a());
            qVar.a(a0Var);
        } else {
            throw u2.a("Senc sample count " + K2 + " is different from fragment sample count" + qVar.f8758f, null);
        }
    }

    private static void B(a0 a0Var, q qVar) {
        A(a0Var, 0, qVar);
    }

    private static Pair<Long, x1.d> C(a0 a0Var, long j10) {
        long L;
        long L2;
        a0Var.T(8);
        int c10 = f2.a.c(a0Var.p());
        a0Var.U(4);
        long I2 = a0Var.I();
        if (c10 == 0) {
            L = a0Var.I();
            L2 = a0Var.I();
        } else {
            L = a0Var.L();
            L2 = a0Var.L();
        }
        long j11 = L;
        long j12 = j10 + L2;
        long N0 = n0.N0(j11, 1000000L, I2);
        a0Var.U(2);
        int M = a0Var.M();
        int[] iArr = new int[M];
        long[] jArr = new long[M];
        long[] jArr2 = new long[M];
        long[] jArr3 = new long[M];
        long j13 = j11;
        long j14 = N0;
        int i10 = 0;
        while (i10 < M) {
            int p10 = a0Var.p();
            if ((p10 & Integer.MIN_VALUE) != 0) {
                throw u2.a("Unhandled indirect reference", null);
            }
            long I3 = a0Var.I();
            iArr[i10] = p10 & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j14;
            long j15 = j13 + I3;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = M;
            int[] iArr2 = iArr;
            long N02 = n0.N0(j15, 1000000L, I2);
            jArr4[i10] = N02 - jArr5[i10];
            a0Var.U(4);
            j12 += iArr2[i10];
            i10++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            M = i11;
            j13 = j15;
            j14 = N02;
        }
        return Pair.create(Long.valueOf(N0), new x1.d(iArr, jArr, jArr2, jArr3));
    }

    private static long D(a0 a0Var) {
        a0Var.T(8);
        return f2.a.c(a0Var.p()) == 1 ? a0Var.L() : a0Var.I();
    }

    private static b E(a0 a0Var, SparseArray<b> sparseArray, boolean z10) {
        a0Var.T(8);
        int b10 = f2.a.b(a0Var.p());
        b valueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(a0Var.p());
        if (valueAt == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long L = a0Var.L();
            q qVar = valueAt.f8681b;
            qVar.f8755c = L;
            qVar.f8756d = L;
        }
        c cVar = valueAt.f8684e;
        valueAt.f8681b.f8753a = new c((b10 & 2) != 0 ? a0Var.p() - 1 : cVar.f8639a, (b10 & 8) != 0 ? a0Var.p() : cVar.f8640b, (b10 & 16) != 0 ? a0Var.p() : cVar.f8641c, (b10 & 32) != 0 ? a0Var.p() : cVar.f8642d);
        return valueAt;
    }

    private static void F(a.C0141a c0141a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        b E = E(((a.b) p3.a.e(c0141a.g(1952868452))).f8609b, sparseArray, z10);
        if (E == null) {
            return;
        }
        q qVar = E.f8681b;
        long j10 = qVar.f8769q;
        boolean z11 = qVar.f8770r;
        E.k();
        E.f8691l = true;
        a.b g10 = c0141a.g(1952867444);
        if (g10 == null || (i10 & 2) != 0) {
            qVar.f8769q = j10;
            qVar.f8770r = z11;
        } else {
            qVar.f8769q = D(g10.f8609b);
            qVar.f8770r = true;
        }
        I(c0141a, E, i10);
        p a10 = E.f8683d.f8771a.a(((c) p3.a.e(qVar.f8753a)).f8639a);
        a.b g11 = c0141a.g(1935763834);
        if (g11 != null) {
            y((p) p3.a.e(a10), g11.f8609b, qVar);
        }
        a.b g12 = c0141a.g(1935763823);
        if (g12 != null) {
            x(g12.f8609b, qVar);
        }
        a.b g13 = c0141a.g(1936027235);
        if (g13 != null) {
            B(g13.f8609b, qVar);
        }
        z(c0141a, a10 != null ? a10.f8749b : null, qVar);
        int size = c0141a.f8607c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0141a.f8607c.get(i11);
            if (bVar.f8605a == 1970628964) {
                J(bVar.f8609b, qVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> G(a0 a0Var) {
        a0Var.T(12);
        return Pair.create(Integer.valueOf(a0Var.p()), new c(a0Var.p() - 1, a0Var.p(), a0Var.p(), a0Var.p()));
    }

    private static int H(b bVar, int i10, int i11, a0 a0Var, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        b bVar2 = bVar;
        a0Var.T(8);
        int b10 = f2.a.b(a0Var.p());
        o oVar = bVar2.f8683d.f8771a;
        q qVar = bVar2.f8681b;
        c cVar = (c) n0.j(qVar.f8753a);
        qVar.f8760h[i10] = a0Var.K();
        long[] jArr = qVar.f8759g;
        jArr[i10] = qVar.f8755c;
        if ((b10 & 1) != 0) {
            jArr[i10] = jArr[i10] + a0Var.p();
        }
        boolean z15 = (b10 & 4) != 0;
        int i16 = cVar.f8642d;
        if (z15) {
            i16 = a0Var.p();
        }
        boolean z16 = (b10 & 256) != 0;
        boolean z17 = (b10 & 512) != 0;
        boolean z18 = (b10 & 1024) != 0;
        boolean z19 = (b10 & 2048) != 0;
        long j10 = m(oVar) ? ((long[]) n0.j(oVar.f8745i))[0] : 0L;
        int[] iArr = qVar.f8761i;
        long[] jArr2 = qVar.f8762j;
        boolean[] zArr = qVar.f8763k;
        int i17 = i16;
        boolean z20 = oVar.f8738b == 2 && (i11 & 1) != 0;
        int i18 = i12 + qVar.f8760h[i10];
        boolean z21 = z20;
        long j11 = oVar.f8739c;
        long j12 = qVar.f8769q;
        int i19 = i12;
        while (i19 < i18) {
            int e10 = e(z16 ? a0Var.p() : cVar.f8640b);
            if (z17) {
                i13 = a0Var.p();
                z10 = z16;
            } else {
                z10 = z16;
                i13 = cVar.f8641c;
            }
            int e11 = e(i13);
            if (z18) {
                z11 = z15;
                i14 = a0Var.p();
            } else if (i19 == 0 && z15) {
                z11 = z15;
                i14 = i17;
            } else {
                z11 = z15;
                i14 = cVar.f8642d;
            }
            if (z19) {
                z12 = z19;
                z13 = z17;
                z14 = z18;
                i15 = a0Var.p();
            } else {
                z12 = z19;
                z13 = z17;
                z14 = z18;
                i15 = 0;
            }
            jArr2[i19] = n0.N0((i15 + j12) - j10, 1000000L, j11);
            if (!qVar.f8770r) {
                jArr2[i19] = jArr2[i19] + bVar2.f8683d.f8778h;
            }
            iArr[i19] = e11;
            zArr[i19] = ((i14 >> 16) & 1) == 0 && (!z21 || i19 == 0);
            j12 += e10;
            i19++;
            bVar2 = bVar;
            z16 = z10;
            z15 = z11;
            z19 = z12;
            z17 = z13;
            z18 = z14;
        }
        qVar.f8769q = j12;
        return i18;
    }

    private static void I(a.C0141a c0141a, b bVar, int i10) {
        List<a.b> list = c0141a.f8607c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f8605a == 1953658222) {
                a0 a0Var = bVar2.f8609b;
                a0Var.T(12);
                int K2 = a0Var.K();
                if (K2 > 0) {
                    i12 += K2;
                    i11++;
                }
            }
        }
        bVar.f8687h = 0;
        bVar.f8686g = 0;
        bVar.f8685f = 0;
        bVar.f8681b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar3 = list.get(i16);
            if (bVar3.f8605a == 1953658222) {
                i15 = H(bVar, i14, i10, bVar3.f8609b, i15);
                i14++;
            }
        }
    }

    private static void J(a0 a0Var, q qVar, byte[] bArr) {
        a0Var.T(8);
        a0Var.l(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            A(a0Var, 16, qVar);
        }
    }

    private void K(long j10) {
        while (!this.f8663m.isEmpty() && this.f8663m.peek().f8606b == j10) {
            p(this.f8663m.pop());
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean L(x1.m r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.g.L(x1.m):boolean");
    }

    private void M(x1.m mVar) {
        int i10 = ((int) this.f8668r) - this.f8669s;
        a0 a0Var = this.f8670t;
        if (a0Var != null) {
            mVar.readFully(a0Var.e(), 8, i10);
            r(new a.b(this.f8667q, a0Var), mVar.p());
        } else {
            mVar.g(i10);
        }
        K(mVar.p());
    }

    private void N(x1.m mVar) {
        int size = this.f8654d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f8654d.valueAt(i10).f8681b;
            if (qVar.f8768p) {
                long j11 = qVar.f8756d;
                if (j11 < j10) {
                    bVar = this.f8654d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f8666p = 3;
            return;
        }
        int p10 = (int) (j10 - mVar.p());
        if (p10 < 0) {
            throw u2.a("Offset to encryption data was negative.", null);
        }
        mVar.g(p10);
        bVar.f8681b.b(mVar);
    }

    private boolean O(x1.m mVar) {
        int f10;
        int i10;
        b bVar = this.f8676z;
        Throwable th = null;
        if (bVar == null) {
            bVar = k(this.f8654d);
            if (bVar == null) {
                int p10 = (int) (this.f8671u - mVar.p());
                if (p10 >= 0) {
                    mVar.g(p10);
                    f();
                    return false;
                }
                throw u2.a("Offset to end of mdat was negative.", null);
            }
            int d10 = (int) (bVar.d() - mVar.p());
            if (d10 < 0) {
                p3.r.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d10 = 0;
            }
            mVar.g(d10);
            this.f8676z = bVar;
        }
        int i11 = 4;
        int i12 = 1;
        if (this.f8666p == 3) {
            int f11 = bVar.f();
            this.A = f11;
            if (bVar.f8685f < bVar.f8688i) {
                mVar.g(f11);
                bVar.m();
                if (!bVar.h()) {
                    this.f8676z = null;
                }
                this.f8666p = 3;
                return true;
            }
            if (bVar.f8683d.f8771a.f8743g == 1) {
                this.A = f11 - 8;
                mVar.g(8);
            }
            if ("audio/ac4".equals(bVar.f8683d.f8771a.f8742f.f17419u)) {
                this.B = bVar.i(this.A, 7);
                u1.c.a(this.A, this.f8659i);
                bVar.f8680a.d(this.f8659i, 7);
                i10 = this.B + 7;
            } else {
                i10 = bVar.i(this.A, 0);
            }
            this.B = i10;
            this.A += this.B;
            this.f8666p = 4;
            this.C = 0;
        }
        o oVar = bVar.f8683d.f8771a;
        e0 e0Var = bVar.f8680a;
        long e10 = bVar.e();
        j0 j0Var = this.f8660j;
        if (j0Var != null) {
            e10 = j0Var.a(e10);
        }
        long j10 = e10;
        if (oVar.f8746j == 0) {
            while (true) {
                int i13 = this.B;
                int i14 = this.A;
                if (i13 >= i14) {
                    break;
                }
                this.B += e0Var.f(mVar, i14 - i13, false);
            }
        } else {
            byte[] e11 = this.f8656f.e();
            e11[0] = 0;
            e11[1] = 0;
            e11[2] = 0;
            int i15 = oVar.f8746j;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.B < this.A) {
                int i18 = this.C;
                if (i18 == 0) {
                    mVar.readFully(e11, i17, i16);
                    this.f8656f.T(0);
                    int p11 = this.f8656f.p();
                    if (p11 < i12) {
                        throw u2.a("Invalid NAL length", th);
                    }
                    this.C = p11 - 1;
                    this.f8655e.T(0);
                    e0Var.d(this.f8655e, i11);
                    e0Var.d(this.f8656f, i12);
                    this.D = this.G.length > 0 && w.g(oVar.f8742f.f17419u, e11[i11]);
                    this.B += 5;
                    this.A += i17;
                } else {
                    if (this.D) {
                        this.f8657g.P(i18);
                        mVar.readFully(this.f8657g.e(), 0, this.C);
                        e0Var.d(this.f8657g, this.C);
                        f10 = this.C;
                        int q10 = w.q(this.f8657g.e(), this.f8657g.g());
                        this.f8657g.T("video/hevc".equals(oVar.f8742f.f17419u) ? 1 : 0);
                        this.f8657g.S(q10);
                        x1.c.a(j10, this.f8657g, this.G);
                    } else {
                        f10 = e0Var.f(mVar, i18, false);
                    }
                    this.B += f10;
                    this.C -= f10;
                    th = null;
                    i11 = 4;
                    i12 = 1;
                }
            }
        }
        int c10 = bVar.c();
        p g10 = bVar.g();
        e0Var.c(j10, c10, this.A, 0, g10 != null ? g10.f8750c : null);
        u(j10);
        if (!bVar.h()) {
            this.f8676z = null;
        }
        this.f8666p = 3;
        return true;
    }

    private static boolean P(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean Q(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static int e(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw u2.a("Unexpected negative value: " + i10, null);
    }

    private void f() {
        this.f8666p = 0;
        this.f8669s = 0;
    }

    private c g(SparseArray<c> sparseArray, int i10) {
        return (c) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : p3.a.e(sparseArray.get(i10)));
    }

    private static w1.m h(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f8605a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] e10 = bVar.f8609b.e();
                UUID f10 = l.f(e10);
                if (f10 == null) {
                    p3.r.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new m.b(f10, "video/mp4", e10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new w1.m(arrayList);
    }

    private static b k(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f8691l || valueAt.f8685f != valueAt.f8683d.f8772b) && (!valueAt.f8691l || valueAt.f8687h != valueAt.f8681b.f8757e)) {
                long d10 = valueAt.d();
                if (d10 < j10) {
                    bVar = valueAt;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    private void l() {
        int i10;
        e0[] e0VarArr = new e0[2];
        this.F = e0VarArr;
        e0 e0Var = this.f8665o;
        int i11 = 0;
        if (e0Var != null) {
            e0VarArr[0] = e0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f8651a & 4) != 0) {
            e0VarArr[i10] = this.E.d(100, 5);
            i10++;
            i12 = 101;
        }
        e0[] e0VarArr2 = (e0[]) n0.G0(this.F, i10);
        this.F = e0VarArr2;
        for (e0 e0Var2 : e0VarArr2) {
            e0Var2.e(K);
        }
        this.G = new e0[this.f8653c.size()];
        while (i11 < this.G.length) {
            e0 d10 = this.E.d(i12, 3);
            d10.e(this.f8653c.get(i11));
            this.G[i11] = d10;
            i11++;
            i12++;
        }
    }

    private static boolean m(o oVar) {
        long[] jArr;
        long[] jArr2 = oVar.f8744h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = oVar.f8745i) == null) {
            return false;
        }
        return jArr2[0] == 0 || n0.N0(jArr2[0] + jArr[0], 1000000L, oVar.f8740d) >= oVar.f8741e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] n() {
        return new x1.l[]{new g()};
    }

    private void p(a.C0141a c0141a) {
        int i10 = c0141a.f8605a;
        if (i10 == 1836019574) {
            t(c0141a);
        } else if (i10 == 1836019558) {
            s(c0141a);
        } else if (this.f8663m.isEmpty()) {
        } else {
            this.f8663m.peek().d(c0141a);
        }
    }

    private void q(a0 a0Var) {
        long N0;
        String str;
        long N02;
        String str2;
        long I2;
        long j10;
        e0[] e0VarArr;
        if (this.F.length == 0) {
            return;
        }
        a0Var.T(8);
        int c10 = f2.a.c(a0Var.p());
        if (c10 == 0) {
            String str3 = (String) p3.a.e(a0Var.A());
            String str4 = (String) p3.a.e(a0Var.A());
            long I3 = a0Var.I();
            N0 = n0.N0(a0Var.I(), 1000000L, I3);
            long j11 = this.f8675y;
            long j12 = j11 != -9223372036854775807L ? j11 + N0 : -9223372036854775807L;
            str = str3;
            N02 = n0.N0(a0Var.I(), 1000L, I3);
            str2 = str4;
            I2 = a0Var.I();
            j10 = j12;
        } else if (c10 != 1) {
            p3.r.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + c10);
            return;
        } else {
            long I4 = a0Var.I();
            j10 = n0.N0(a0Var.L(), 1000000L, I4);
            long N03 = n0.N0(a0Var.I(), 1000L, I4);
            long I5 = a0Var.I();
            str = (String) p3.a.e(a0Var.A());
            N02 = N03;
            I2 = I5;
            str2 = (String) p3.a.e(a0Var.A());
            N0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[a0Var.a()];
        a0Var.l(bArr, 0, a0Var.a());
        a0 a0Var2 = new a0(this.f8661k.a(new m2.a(str, str2, N02, I2, bArr)));
        int a10 = a0Var2.a();
        for (e0 e0Var : this.F) {
            a0Var2.T(0);
            e0Var.d(a0Var2, a10);
        }
        if (j10 == -9223372036854775807L) {
            this.f8664n.addLast(new a(N0, true, a10));
        } else if (this.f8664n.isEmpty()) {
            j0 j0Var = this.f8660j;
            if (j0Var != null) {
                j10 = j0Var.a(j10);
            }
            for (e0 e0Var2 : this.F) {
                e0Var2.c(j10, 1, a10, 0, null);
            }
            return;
        } else {
            this.f8664n.addLast(new a(j10, false, a10));
        }
        this.f8672v += a10;
    }

    private void r(a.b bVar, long j10) {
        if (!this.f8663m.isEmpty()) {
            this.f8663m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f8605a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                q(bVar.f8609b);
                return;
            }
            return;
        }
        Pair<Long, x1.d> C = C(bVar.f8609b, j10);
        this.f8675y = ((Long) C.first).longValue();
        this.E.t((b0) C.second);
        this.H = true;
    }

    private void s(a.C0141a c0141a) {
        w(c0141a, this.f8654d, this.f8652b != null, this.f8651a, this.f8658h);
        w1.m h10 = h(c0141a.f8607c);
        if (h10 != null) {
            int size = this.f8654d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f8654d.valueAt(i10).n(h10);
            }
        }
        if (this.f8673w != -9223372036854775807L) {
            int size2 = this.f8654d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f8654d.valueAt(i11).l(this.f8673w);
            }
            this.f8673w = -9223372036854775807L;
        }
    }

    private void t(a.C0141a c0141a) {
        int i10 = 0;
        p3.a.g(this.f8652b == null, "Unexpected moov box.");
        w1.m h10 = h(c0141a.f8607c);
        a.C0141a c0141a2 = (a.C0141a) p3.a.e(c0141a.f(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0141a2.f8607c.size();
        long j10 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0141a2.f8607c.get(i11);
            int i12 = bVar.f8605a;
            if (i12 == 1953654136) {
                Pair<Integer, c> G = G(bVar.f8609b);
                sparseArray.put(((Integer) G.first).intValue(), (c) G.second);
            } else if (i12 == 1835362404) {
                j10 = v(bVar.f8609b);
            }
        }
        List<r> A = f2.b.A(c0141a, new x(), j10, h10, (this.f8651a & 16) != 0, false, new b5.f() { // from class: f2.e
            @Override // b5.f
            public final Object apply(Object obj) {
                return g.this.o((o) obj);
            }
        });
        int size2 = A.size();
        if (this.f8654d.size() != 0) {
            p3.a.f(this.f8654d.size() == size2);
            while (i10 < size2) {
                r rVar = A.get(i10);
                o oVar = rVar.f8771a;
                this.f8654d.get(oVar.f8737a).j(rVar, g(sparseArray, oVar.f8737a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            r rVar2 = A.get(i10);
            o oVar2 = rVar2.f8771a;
            this.f8654d.put(oVar2.f8737a, new b(this.E.d(i10, oVar2.f8738b), rVar2, g(sparseArray, oVar2.f8737a)));
            this.f8674x = Math.max(this.f8674x, oVar2.f8741e);
            i10++;
        }
        this.E.k();
    }

    private void u(long j10) {
        while (!this.f8664n.isEmpty()) {
            a removeFirst = this.f8664n.removeFirst();
            this.f8672v -= removeFirst.f8679c;
            long j11 = removeFirst.f8677a;
            if (removeFirst.f8678b) {
                j11 += j10;
            }
            j0 j0Var = this.f8660j;
            if (j0Var != null) {
                j11 = j0Var.a(j11);
            }
            for (e0 e0Var : this.F) {
                e0Var.c(j11, 1, removeFirst.f8679c, this.f8672v, null);
            }
        }
    }

    private static long v(a0 a0Var) {
        a0Var.T(8);
        return f2.a.c(a0Var.p()) == 0 ? a0Var.I() : a0Var.L();
    }

    private static void w(a.C0141a c0141a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = c0141a.f8608d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0141a c0141a2 = c0141a.f8608d.get(i11);
            if (c0141a2.f8605a == 1953653094) {
                F(c0141a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void x(a0 a0Var, q qVar) {
        a0Var.T(8);
        int p10 = a0Var.p();
        if ((f2.a.b(p10) & 1) == 1) {
            a0Var.U(8);
        }
        int K2 = a0Var.K();
        if (K2 == 1) {
            qVar.f8756d += f2.a.c(p10) == 0 ? a0Var.I() : a0Var.L();
            return;
        }
        throw u2.a("Unexpected saio entry count: " + K2, null);
    }

    private static void y(p pVar, a0 a0Var, q qVar) {
        int i10;
        int i11 = pVar.f8751d;
        a0Var.T(8);
        if ((f2.a.b(a0Var.p()) & 1) == 1) {
            a0Var.U(8);
        }
        int G = a0Var.G();
        int K2 = a0Var.K();
        if (K2 > qVar.f8758f) {
            throw u2.a("Saiz sample count " + K2 + " is greater than fragment sample count" + qVar.f8758f, null);
        }
        if (G == 0) {
            boolean[] zArr = qVar.f8765m;
            i10 = 0;
            for (int i12 = 0; i12 < K2; i12++) {
                int G2 = a0Var.G();
                i10 += G2;
                zArr[i12] = G2 > i11;
            }
        } else {
            i10 = (G * K2) + 0;
            Arrays.fill(qVar.f8765m, 0, K2, G > i11);
        }
        Arrays.fill(qVar.f8765m, K2, qVar.f8758f, false);
        if (i10 > 0) {
            qVar.d(i10);
        }
    }

    private static void z(a.C0141a c0141a, String str, q qVar) {
        byte[] bArr = null;
        a0 a0Var = null;
        a0 a0Var2 = null;
        for (int i10 = 0; i10 < c0141a.f8607c.size(); i10++) {
            a.b bVar = c0141a.f8607c.get(i10);
            a0 a0Var3 = bVar.f8609b;
            int i11 = bVar.f8605a;
            if (i11 == 1935828848) {
                a0Var3.T(12);
                if (a0Var3.p() == 1936025959) {
                    a0Var = a0Var3;
                }
            } else if (i11 == 1936158820) {
                a0Var3.T(12);
                if (a0Var3.p() == 1936025959) {
                    a0Var2 = a0Var3;
                }
            }
        }
        if (a0Var == null || a0Var2 == null) {
            return;
        }
        a0Var.T(8);
        int c10 = f2.a.c(a0Var.p());
        a0Var.U(4);
        if (c10 == 1) {
            a0Var.U(4);
        }
        if (a0Var.p() != 1) {
            throw u2.d("Entry count in sbgp != 1 (unsupported).");
        }
        a0Var2.T(8);
        int c11 = f2.a.c(a0Var2.p());
        a0Var2.U(4);
        if (c11 == 1) {
            if (a0Var2.I() == 0) {
                throw u2.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (c11 >= 2) {
            a0Var2.U(4);
        }
        if (a0Var2.I() != 1) {
            throw u2.d("Entry count in sgpd != 1 (unsupported).");
        }
        a0Var2.U(1);
        int G = a0Var2.G();
        int i12 = (G & 240) >> 4;
        int i13 = G & 15;
        boolean z10 = a0Var2.G() == 1;
        if (z10) {
            int G2 = a0Var2.G();
            byte[] bArr2 = new byte[16];
            a0Var2.l(bArr2, 0, 16);
            if (G2 == 0) {
                int G3 = a0Var2.G();
                bArr = new byte[G3];
                a0Var2.l(bArr, 0, G3);
            }
            qVar.f8764l = true;
            qVar.f8766n = new p(z10, str, G2, bArr2, i12, i13, bArr);
        }
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        int size = this.f8654d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f8654d.valueAt(i10).k();
        }
        this.f8664n.clear();
        this.f8672v = 0;
        this.f8673w = j11;
        this.f8663m.clear();
        f();
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.E = nVar;
        f();
        l();
        o oVar = this.f8652b;
        if (oVar != null) {
            this.f8654d.put(0, new b(nVar.d(0, oVar.f8738b), new r(this.f8652b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.k();
        }
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        while (true) {
            int i10 = this.f8666p;
            if (i10 != 0) {
                if (i10 == 1) {
                    M(mVar);
                } else if (i10 == 2) {
                    N(mVar);
                } else if (O(mVar)) {
                    return 0;
                }
            } else if (!L(mVar)) {
                return -1;
            }
        }
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        return n.b(mVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o o(o oVar) {
        return oVar;
    }
}
