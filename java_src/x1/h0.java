package x1;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3.n0;
import s1.u2;
/* loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20147a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20148b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f20149c;

        /* renamed from: d  reason: collision with root package name */
        public final int f20150d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f20151e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f20147a = i10;
            this.f20148b = i11;
            this.f20149c = jArr;
            this.f20150d = i12;
            this.f20151e = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f20152a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f20153b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20154c;

        public b(String str, String[] strArr, int i10) {
            this.f20152a = str;
            this.f20153b = strArr;
            this.f20154c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f20155a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20156b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20157c;

        /* renamed from: d  reason: collision with root package name */
        public final int f20158d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f20155a = z10;
            this.f20156b = i10;
            this.f20157c = i11;
            this.f20158d = i12;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f20159a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20160b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20161c;

        /* renamed from: d  reason: collision with root package name */
        public final int f20162d;

        /* renamed from: e  reason: collision with root package name */
        public final int f20163e;

        /* renamed from: f  reason: collision with root package name */
        public final int f20164f;

        /* renamed from: g  reason: collision with root package name */
        public final int f20165g;

        /* renamed from: h  reason: collision with root package name */
        public final int f20166h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f20167i;

        /* renamed from: j  reason: collision with root package name */
        public final byte[] f20168j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f20159a = i10;
            this.f20160b = i11;
            this.f20161c = i12;
            this.f20162d = i13;
            this.f20163e = i14;
            this.f20164f = i15;
            this.f20165g = i16;
            this.f20166h = i17;
            this.f20167i = z10;
            this.f20168j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static k2.a c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] R0 = n0.R0(str, "=");
            if (R0.length != 2) {
                p3.r.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (R0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(n2.a.a(new p3.a0(Base64.decode(R0[1], 0))));
                } catch (RuntimeException e10) {
                    p3.r.j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new s2.a(R0[0], R0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new k2.a(arrayList);
    }

    private static a d(g0 g0Var) {
        if (g0Var.d(24) != 5653314) {
            throw u2.a("expected code book to start with [0x56, 0x43, 0x42] at " + g0Var.b(), null);
        }
        int d10 = g0Var.d(16);
        int d11 = g0Var.d(24);
        long[] jArr = new long[d11];
        boolean c10 = g0Var.c();
        long j10 = 0;
        if (c10) {
            int d12 = g0Var.d(5) + 1;
            int i10 = 0;
            while (i10 < d11) {
                int d13 = g0Var.d(a(d11 - i10));
                for (int i11 = 0; i11 < d13 && i10 < d11; i11++) {
                    jArr[i10] = d12;
                    i10++;
                }
                d12++;
            }
        } else {
            boolean c11 = g0Var.c();
            for (int i12 = 0; i12 < d11; i12++) {
                if (!c11) {
                    jArr[i12] = g0Var.d(5) + 1;
                } else if (g0Var.c()) {
                    jArr[i12] = g0Var.d(5) + 1;
                } else {
                    jArr[i12] = 0;
                }
            }
        }
        int d14 = g0Var.d(4);
        if (d14 > 2) {
            throw u2.a("lookup type greater than 2 not decodable: " + d14, null);
        }
        if (d14 == 1 || d14 == 2) {
            g0Var.e(32);
            g0Var.e(32);
            int d15 = g0Var.d(4) + 1;
            g0Var.e(1);
            if (d14 != 1) {
                j10 = d11 * d10;
            } else if (d10 != 0) {
                j10 = b(d11, d10);
            }
            g0Var.e((int) (j10 * d15));
        }
        return new a(d10, d11, jArr, d14, c10);
    }

    private static void e(g0 g0Var) {
        int d10 = g0Var.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            int d11 = g0Var.d(16);
            if (d11 == 0) {
                g0Var.e(8);
                g0Var.e(16);
                g0Var.e(16);
                g0Var.e(6);
                g0Var.e(8);
                int d12 = g0Var.d(4) + 1;
                for (int i11 = 0; i11 < d12; i11++) {
                    g0Var.e(8);
                }
            } else if (d11 != 1) {
                throw u2.a("floor type greater than 1 not decodable: " + d11, null);
            } else {
                int d13 = g0Var.d(5);
                int i12 = -1;
                int[] iArr = new int[d13];
                for (int i13 = 0; i13 < d13; i13++) {
                    iArr[i13] = g0Var.d(4);
                    if (iArr[i13] > i12) {
                        i12 = iArr[i13];
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = g0Var.d(3) + 1;
                    int d14 = g0Var.d(2);
                    if (d14 > 0) {
                        g0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << d14); i16++) {
                        g0Var.e(8);
                    }
                }
                g0Var.e(2);
                int d15 = g0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < d13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        g0Var.e(d15);
                        i18++;
                    }
                }
            }
        }
    }

    private static void f(int i10, g0 g0Var) {
        int d10 = g0Var.d(6) + 1;
        for (int i11 = 0; i11 < d10; i11++) {
            int d11 = g0Var.d(16);
            if (d11 != 0) {
                p3.r.c("VorbisUtil", "mapping type other than 0 not supported: " + d11);
            } else {
                int d12 = g0Var.c() ? g0Var.d(4) + 1 : 1;
                if (g0Var.c()) {
                    int d13 = g0Var.d(8) + 1;
                    for (int i12 = 0; i12 < d13; i12++) {
                        int i13 = i10 - 1;
                        g0Var.e(a(i13));
                        g0Var.e(a(i13));
                    }
                }
                if (g0Var.d(2) != 0) {
                    throw u2.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (d12 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        g0Var.e(4);
                    }
                }
                for (int i15 = 0; i15 < d12; i15++) {
                    g0Var.e(8);
                    g0Var.e(8);
                    g0Var.e(8);
                }
            }
        }
    }

    private static c[] g(g0 g0Var) {
        int d10 = g0Var.d(6) + 1;
        c[] cVarArr = new c[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            cVarArr[i10] = new c(g0Var.c(), g0Var.d(16), g0Var.d(16), g0Var.d(8));
        }
        return cVarArr;
    }

    private static void h(g0 g0Var) {
        int d10 = g0Var.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            if (g0Var.d(16) > 2) {
                throw u2.a("residueType greater than 2 is not decodable", null);
            }
            g0Var.e(24);
            g0Var.e(24);
            g0Var.e(24);
            int d11 = g0Var.d(6) + 1;
            g0Var.e(8);
            int[] iArr = new int[d11];
            for (int i11 = 0; i11 < d11; i11++) {
                iArr[i11] = ((g0Var.c() ? g0Var.d(5) : 0) * 8) + g0Var.d(3);
            }
            for (int i12 = 0; i12 < d11; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        g0Var.e(8);
                    }
                }
            }
        }
    }

    public static b i(p3.a0 a0Var) {
        return j(a0Var, true, true);
    }

    public static b j(p3.a0 a0Var, boolean z10, boolean z11) {
        if (z10) {
            m(3, a0Var, false);
        }
        String D = a0Var.D((int) a0Var.w());
        int length = 11 + D.length();
        long w10 = a0Var.w();
        String[] strArr = new String[(int) w10];
        int i10 = length + 4;
        for (int i11 = 0; i11 < w10; i11++) {
            strArr[i11] = a0Var.D((int) a0Var.w());
            i10 = i10 + 4 + strArr[i11].length();
        }
        if (z11 && (a0Var.G() & 1) == 0) {
            throw u2.a("framing bit expected to be set", null);
        }
        return new b(D, strArr, i10 + 1);
    }

    public static d k(p3.a0 a0Var) {
        m(1, a0Var, false);
        int x10 = a0Var.x();
        int G = a0Var.G();
        int x11 = a0Var.x();
        int t10 = a0Var.t();
        if (t10 <= 0) {
            t10 = -1;
        }
        int t11 = a0Var.t();
        if (t11 <= 0) {
            t11 = -1;
        }
        int t12 = a0Var.t();
        if (t12 <= 0) {
            t12 = -1;
        }
        int G2 = a0Var.G();
        return new d(x10, G, x11, t10, t11, t12, (int) Math.pow(2.0d, G2 & 15), (int) Math.pow(2.0d, (G2 & 240) >> 4), (a0Var.G() & 1) > 0, Arrays.copyOf(a0Var.e(), a0Var.g()));
    }

    public static c[] l(p3.a0 a0Var, int i10) {
        m(5, a0Var, false);
        int G = a0Var.G() + 1;
        g0 g0Var = new g0(a0Var.e());
        g0Var.e(a0Var.f() * 8);
        for (int i11 = 0; i11 < G; i11++) {
            d(g0Var);
        }
        int d10 = g0Var.d(6) + 1;
        for (int i12 = 0; i12 < d10; i12++) {
            if (g0Var.d(16) != 0) {
                throw u2.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        e(g0Var);
        h(g0Var);
        f(i10, g0Var);
        c[] g10 = g(g0Var);
        if (g0Var.c()) {
            return g10;
        }
        throw u2.a("framing bit after modes not set as expected", null);
    }

    public static boolean m(int i10, p3.a0 a0Var, boolean z10) {
        if (a0Var.a() < 7) {
            if (z10) {
                return false;
            }
            throw u2.a("too short header: " + a0Var.a(), null);
        } else if (a0Var.G() != i10) {
            if (z10) {
                return false;
            }
            throw u2.a("expected header type " + Integer.toHexString(i10), null);
        } else if (a0Var.G() == 118 && a0Var.G() == 111 && a0Var.G() == 114 && a0Var.G() == 98 && a0Var.G() == 105 && a0Var.G() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw u2.a("expected characters 'vorbis'", null);
        }
    }
}
