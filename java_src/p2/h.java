package p2;

import com.google.common.collect.q;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p3.a0;
import p3.n0;
import p3.r;
import p3.z;
/* loaded from: classes.dex */
public final class h extends k2.h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15307b = new a() { // from class: p2.g
        @Override // p2.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            boolean A;
            A = h.A(i10, i11, i12, i13, i14);
            return A;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final a f15308a;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f15309a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f15310b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15311c;

        public b(int i10, boolean z10, int i11) {
            this.f15309a = i10;
            this.f15310b = z10;
            this.f15311c = i11;
        }
    }

    public h() {
        this(null);
    }

    public h(a aVar) {
        this.f15308a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean A(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static int B(a0 a0Var, int i10) {
        byte[] e10 = a0Var.e();
        int f10 = a0Var.f();
        int i11 = f10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= f10 + i10) {
                return i10;
            }
            if ((e10[i11] & 255) == 255 && e10[i12] == 0) {
                System.arraycopy(e10, i11 + 2, e10, i12, (i10 - (i11 - f10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean C(p3.a0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.f()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.p()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.I()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.M()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.J()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.J()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.T(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4b
            r1.T(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = 0
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = 0
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = 1
            goto L84
        L83:
            r3 = 0
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = 0
            goto L79
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L98
            r1.T(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La5
            r1.T(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.U(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.T(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.T(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.h.C(p3.a0, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? n0.f15402f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static p2.a f(a0 a0Var, int i10, int i11) {
        int z10;
        String str;
        int G = a0Var.G();
        Charset w10 = w(G);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        a0Var.l(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + b5.b.e(new String(bArr, 0, 3, b5.d.f2949b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            z10 = 2;
        } else {
            z10 = z(bArr, 0);
            String e10 = b5.b.e(new String(bArr, 0, z10, b5.d.f2949b));
            if (e10.indexOf(47) == -1) {
                str = "image/" + e10;
            } else {
                str = e10;
            }
        }
        int i13 = z10 + 2;
        int y10 = y(bArr, i13, G);
        return new p2.a(str, new String(bArr, i13, y10 - i13, w10), bArr[z10 + 1] & 255, d(bArr, y10 + v(G), i12));
    }

    private static p2.b g(a0 a0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        a0Var.l(bArr, 0, i10);
        return new p2.b(str, bArr);
    }

    private static c h(a0 a0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        int f10 = a0Var.f();
        int z11 = z(a0Var.e(), f10);
        String str = new String(a0Var.e(), f10, z11 - f10, b5.d.f2949b);
        a0Var.T(z11 + 1);
        int p10 = a0Var.p();
        int p11 = a0Var.p();
        long I = a0Var.I();
        long j10 = I == 4294967295L ? -1L : I;
        long I2 = a0Var.I();
        long j11 = I2 == 4294967295L ? -1L : I2;
        ArrayList arrayList = new ArrayList();
        int i13 = f10 + i10;
        while (a0Var.f() < i13) {
            i k10 = k(i11, a0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new c(str, p10, p11, j10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(a0 a0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        int f10 = a0Var.f();
        int z11 = z(a0Var.e(), f10);
        String str = new String(a0Var.e(), f10, z11 - f10, b5.d.f2949b);
        a0Var.T(z11 + 1);
        int G = a0Var.G();
        boolean z12 = (G & 2) != 0;
        boolean z13 = (G & 1) != 0;
        int G2 = a0Var.G();
        String[] strArr = new String[G2];
        for (int i13 = 0; i13 < G2; i13++) {
            int f11 = a0Var.f();
            int z14 = z(a0Var.e(), f11);
            strArr[i13] = new String(a0Var.e(), f11, z14 - f11, b5.d.f2949b);
            a0Var.T(z14 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = f10 + i10;
        while (a0Var.f() < i14) {
            i k10 = k(i11, a0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new d(str, z12, z13, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(a0 a0Var, int i10) {
        if (i10 < 4) {
            return null;
        }
        int G = a0Var.G();
        Charset w10 = w(G);
        byte[] bArr = new byte[3];
        a0Var.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        a0Var.l(bArr2, 0, i11);
        int y10 = y(bArr2, 0, G);
        String str2 = new String(bArr2, 0, y10, w10);
        int v10 = y10 + v(G);
        return new e(str, str2, p(bArr2, v10, y(bArr2, v10, G), w10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0190, code lost:
        if (r13 == 67) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static p2.i k(int r19, p3.a0 r20, boolean r21, int r22, p2.h.a r23) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.h.k(int, p3.a0, boolean, int, p2.h$a):p2.i");
    }

    private static f l(a0 a0Var, int i10) {
        int G = a0Var.G();
        Charset w10 = w(G);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        int z10 = z(bArr, 0);
        String str = new String(bArr, 0, z10, b5.d.f2949b);
        int i12 = z10 + 1;
        int y10 = y(bArr, i12, G);
        String p10 = p(bArr, i12, y10, w10);
        int v10 = y10 + v(G);
        int y11 = y(bArr, v10, G);
        return new f(str, p10, p(bArr, v10, y11, w10), d(bArr, y11 + v(G), i11));
    }

    private static b m(a0 a0Var) {
        StringBuilder sb;
        String str;
        if (a0Var.a() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int J = a0Var.J();
            boolean z10 = false;
            if (J == 4801587) {
                int G = a0Var.G();
                a0Var.U(1);
                int G2 = a0Var.G();
                int F = a0Var.F();
                if (G == 2) {
                    if ((G2 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (G == 3) {
                    if ((G2 & 64) != 0) {
                        int p10 = a0Var.p();
                        a0Var.U(p10);
                        F -= p10 + 4;
                    }
                } else if (G == 4) {
                    if ((G2 & 64) != 0) {
                        int F2 = a0Var.F();
                        a0Var.U(F2 - 4);
                        F -= F2;
                    }
                    if ((G2 & 16) != 0) {
                        F -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb.append(G);
                }
                if (G < 4 && (G2 & 128) != 0) {
                    z10 = true;
                }
                return new b(G, z10, F);
            }
            sb = new StringBuilder();
            sb.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb.append(String.format("%06X", Integer.valueOf(J)));
            str = sb.toString();
        }
        r.i("Id3Decoder", str);
        return null;
    }

    private static k n(a0 a0Var, int i10) {
        int M = a0Var.M();
        int J = a0Var.J();
        int J2 = a0Var.J();
        int G = a0Var.G();
        int G2 = a0Var.G();
        z zVar = new z();
        zVar.m(a0Var);
        int i11 = ((i10 - 10) * 8) / (G + G2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = zVar.h(G);
            int h11 = zVar.h(G2);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new k(M, J, J2, iArr, iArr2);
    }

    private static l o(a0 a0Var, int i10) {
        byte[] bArr = new byte[i10];
        a0Var.l(bArr, 0, i10);
        int z10 = z(bArr, 0);
        return new l(new String(bArr, 0, z10, b5.d.f2949b), d(bArr, z10 + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static m q(a0 a0Var, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int G = a0Var.G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        return new m(str, null, r(bArr, G, 0));
    }

    private static q<String> r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return q.A("");
        }
        q.a t10 = q.t();
        while (true) {
            int y10 = y(bArr, i11, i10);
            if (i11 >= y10) {
                break;
            }
            t10.a(new String(bArr, i11, y10 - i11, w(i10)));
            i11 = v(i10) + y10;
        }
        q<String> h10 = t10.h();
        return h10.isEmpty() ? q.A("") : h10;
    }

    private static m s(a0 a0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int G = a0Var.G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        int y10 = y(bArr, 0, G);
        return new m("TXXX", new String(bArr, 0, y10, w(G)), r(bArr, G, y10 + v(G)));
    }

    private static n t(a0 a0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        a0Var.l(bArr, 0, i10);
        return new n(str, null, new String(bArr, 0, z(bArr, 0), b5.d.f2949b));
    }

    private static n u(a0 a0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int G = a0Var.G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        int y10 = y(bArr, 0, G);
        String str = new String(bArr, 0, y10, w(G));
        int v10 = y10 + v(G);
        return new n("WXXX", str, p(bArr, v10, z(bArr, v10), b5.d.f2949b));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? b5.d.f2949b : b5.d.f2950c : b5.d.f2951d : b5.d.f2953f;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int z10 = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return z10;
        }
        while (z10 < bArr.length - 1) {
            if ((z10 - i10) % 2 == 0 && bArr[z10 + 1] == 0) {
                return z10;
            }
            z10 = z(bArr, z10 + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // k2.h
    protected k2.a b(k2.e eVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public k2.a e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        b m10 = m(a0Var);
        if (m10 == null) {
            return null;
        }
        int f10 = a0Var.f();
        int i11 = m10.f15309a == 2 ? 6 : 10;
        int i12 = m10.f15311c;
        if (m10.f15310b) {
            i12 = B(a0Var, m10.f15311c);
        }
        a0Var.S(f10 + i12);
        boolean z10 = false;
        if (!C(a0Var, m10.f15309a, i11, false)) {
            if (m10.f15309a != 4 || !C(a0Var, 4, i11, true)) {
                r.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m10.f15309a);
                return null;
            }
            z10 = true;
        }
        while (a0Var.a() >= i11) {
            i k10 = k(m10.f15309a, a0Var, z10, i11, this.f15308a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new k2.a(arrayList);
    }
}
