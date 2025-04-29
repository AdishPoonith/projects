package e3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d3.b;
import d3.h;
import d3.l;
import d3.m;
import f.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.a0;
import p3.n0;
import p3.r;
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: h  reason: collision with root package name */
    private final int f8031h;

    /* renamed from: i  reason: collision with root package name */
    private final int f8032i;

    /* renamed from: j  reason: collision with root package name */
    private final int f8033j;

    /* renamed from: k  reason: collision with root package name */
    private final long f8034k;

    /* renamed from: n  reason: collision with root package name */
    private List<d3.b> f8037n;

    /* renamed from: o  reason: collision with root package name */
    private List<d3.b> f8038o;

    /* renamed from: p  reason: collision with root package name */
    private int f8039p;

    /* renamed from: q  reason: collision with root package name */
    private int f8040q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8041r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f8042s;

    /* renamed from: t  reason: collision with root package name */
    private byte f8043t;

    /* renamed from: u  reason: collision with root package name */
    private byte f8044u;

    /* renamed from: w  reason: collision with root package name */
    private boolean f8046w;

    /* renamed from: x  reason: collision with root package name */
    private long f8047x;

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f8028y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f8029z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, j.D0, j.E0, j.F0, j.G0, j.H0, j.I0, j.J0, j.K0, j.L0, 231, 247, 209, 241, 9632};
    private static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, j.M0, 125, 92, 94, 95, j.N0, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g  reason: collision with root package name */
    private final a0 f8030g = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<C0132a> f8035l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private C0132a f8036m = new C0132a(0, 4);

    /* renamed from: v  reason: collision with root package name */
    private int f8045v = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0132a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0133a> f8048a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<SpannableString> f8049b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f8050c = new StringBuilder();

        /* renamed from: d  reason: collision with root package name */
        private int f8051d;

        /* renamed from: e  reason: collision with root package name */
        private int f8052e;

        /* renamed from: f  reason: collision with root package name */
        private int f8053f;

        /* renamed from: g  reason: collision with root package name */
        private int f8054g;

        /* renamed from: h  reason: collision with root package name */
        private int f8055h;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e3.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0133a {

            /* renamed from: a  reason: collision with root package name */
            public final int f8056a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f8057b;

            /* renamed from: c  reason: collision with root package name */
            public int f8058c;

            public C0133a(int i10, boolean z10, int i11) {
                this.f8056a = i10;
                this.f8057b = z10;
                this.f8058c = i11;
            }
        }

        public C0132a(int i10, int i11) {
            j(i10);
            this.f8055h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8050c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = -1;
            int i15 = -1;
            boolean z10 = false;
            while (i10 < this.f8048a.size()) {
                C0133a c0133a = this.f8048a.get(i10);
                boolean z11 = c0133a.f8057b;
                int i16 = c0133a.f8056a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0133a.f8058c;
                i10++;
                if (i17 != (i10 < this.f8048a.size() ? this.f8048a.get(i10).f8058c : length)) {
                    if (i11 != -1 && !z11) {
                        q(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z11) {
                        i11 = i17;
                    }
                    if (i12 != -1 && !z10) {
                        o(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z10) {
                        i12 = i17;
                    }
                    if (i15 != i14) {
                        n(spannableStringBuilder, i13, i17, i14);
                        i14 = i15;
                        i13 = i17;
                    }
                }
            }
            if (i11 != -1 && i11 != length) {
                q(spannableStringBuilder, i11, length);
            }
            if (i12 != -1 && i12 != length) {
                o(spannableStringBuilder, i12, length);
            }
            if (i13 != length) {
                n(spannableStringBuilder, i13, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f8050c.length() < 32) {
                this.f8050c.append(c10);
            }
        }

        public void f() {
            int length = this.f8050c.length();
            if (length > 0) {
                this.f8050c.delete(length - 1, length);
                for (int size = this.f8048a.size() - 1; size >= 0; size--) {
                    C0133a c0133a = this.f8048a.get(size);
                    int i10 = c0133a.f8058c;
                    if (i10 != length) {
                        return;
                    }
                    c0133a.f8058c = i10 - 1;
                }
            }
        }

        public d3.b g(int i10) {
            float f10;
            int i11 = this.f8052e + this.f8053f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f8049b.size(); i13++) {
                spannableStringBuilder.append(n0.X0(this.f8049b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(n0.X0(h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f8054g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f8054g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f8051d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f8054g == 1) {
                i15 -= this.f8055h - 1;
            }
            return new b.C0115b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i15, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f8048a.isEmpty() && this.f8049b.isEmpty() && this.f8050c.length() == 0;
        }

        public void j(int i10) {
            this.f8054g = i10;
            this.f8048a.clear();
            this.f8049b.clear();
            this.f8050c.setLength(0);
            this.f8051d = 15;
            this.f8052e = 0;
            this.f8053f = 0;
        }

        public void k() {
            this.f8049b.add(h());
            this.f8050c.setLength(0);
            this.f8048a.clear();
            int min = Math.min(this.f8055h, this.f8051d);
            while (this.f8049b.size() >= min) {
                this.f8049b.remove(0);
            }
        }

        public void l(int i10) {
            this.f8054g = i10;
        }

        public void m(int i10) {
            this.f8055h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f8048a.add(new C0133a(i10, z10, this.f8050c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        this.f8034k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f8031h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f8033j = 1;
                this.f8032i = 0;
                N(0);
                M();
                this.f8046w = true;
                this.f8047x = -9223372036854775807L;
            }
            if (i10 == 3) {
                this.f8033j = 0;
            } else if (i10 != 4) {
                r.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            } else {
                this.f8033j = 1;
            }
            this.f8032i = 1;
            N(0);
            M();
            this.f8046w = true;
            this.f8047x = -9223372036854775807L;
        }
        this.f8033j = 0;
        this.f8032i = 0;
        N(0);
        M();
        this.f8046w = true;
        this.f8047x = -9223372036854775807L;
    }

    private static boolean A(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean B(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean F(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean G(boolean z10, byte b10, byte b11) {
        if (!z10 || !F(b10)) {
            this.f8042s = false;
        } else if (this.f8042s && this.f8043t == b10 && this.f8044u == b11) {
            this.f8042s = false;
            return true;
        } else {
            this.f8042s = true;
            this.f8043t = b10;
            this.f8044u = b11;
        }
        return false;
    }

    private static boolean H(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean I(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean J(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean K(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void L(byte b10, byte b11) {
        if (!K(b10)) {
            if (H(b10)) {
                if (b11 != 32 && b11 != 47) {
                    switch (b11) {
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (b11) {
                                case 41:
                                    break;
                                case 42:
                                case 43:
                                    break;
                                default:
                                    return;
                            }
                    }
                }
                this.f8046w = true;
                return;
            }
            return;
        }
        this.f8046w = false;
    }

    private void M() {
        this.f8036m.j(this.f8039p);
        this.f8035l.clear();
        this.f8035l.add(this.f8036m);
    }

    private void N(int i10) {
        int i11 = this.f8039p;
        if (i11 == i10) {
            return;
        }
        this.f8039p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f8035l.size(); i12++) {
                this.f8035l.get(i12).l(i10);
            }
            return;
        }
        M();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f8037n = Collections.emptyList();
        }
    }

    private void O(int i10) {
        this.f8040q = i10;
        this.f8036m.m(i10);
    }

    private boolean P() {
        return (this.f8034k == -9223372036854775807L || this.f8047x == -9223372036854775807L || k() - this.f8047x < this.f8034k) ? false : true;
    }

    private boolean Q(byte b10) {
        if (A(b10)) {
            this.f8045v = r(b10);
        }
        return this.f8045v == this.f8033j;
    }

    private static char q(byte b10) {
        return (char) B[(b10 & Byte.MAX_VALUE) - 32];
    }

    private static int r(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<d3.b> s() {
        int size = this.f8035l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            d3.b g10 = this.f8035l.get(i11).g(Integer.MIN_VALUE);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.f7679r);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            d3.b bVar = (d3.b) arrayList.get(i12);
            if (bVar != null) {
                if (bVar.f7679r != i10) {
                    bVar = (d3.b) p3.a.e(this.f8035l.get(i12).g(i10));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char t(byte b10) {
        return (char) D[b10 & 31];
    }

    private static char u(byte b10) {
        return (char) E[b10 & 31];
    }

    private static char v(byte b10, byte b11) {
        return (b10 & 1) == 0 ? t(b11) : u(b11);
    }

    private static char w(byte b10) {
        return (char) C[b10 & 15];
    }

    private void x(byte b10) {
        this.f8036m.e(' ');
        this.f8036m.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void y(byte b10) {
        if (b10 == 32) {
            N(2);
        } else if (b10 == 41) {
            N(3);
        } else {
            switch (b10) {
                case 37:
                    N(1);
                    O(2);
                    return;
                case 38:
                    N(1);
                    O(3);
                    return;
                case 39:
                    N(1);
                    O(4);
                    return;
                default:
                    int i10 = this.f8039p;
                    if (i10 == 0) {
                        return;
                    }
                    if (b10 == 33) {
                        this.f8036m.f();
                        return;
                    }
                    switch (b10) {
                        case 44:
                            this.f8037n = Collections.emptyList();
                            int i11 = this.f8039p;
                            if (i11 != 1 && i11 != 3) {
                                return;
                            }
                            break;
                        case 45:
                            if (i10 != 1 || this.f8036m.i()) {
                                return;
                            }
                            this.f8036m.k();
                            return;
                        case 46:
                            break;
                        case 47:
                            this.f8037n = s();
                            break;
                        default:
                            return;
                    }
                    M();
                    return;
            }
        }
    }

    private void z(byte b10, byte b11) {
        int i10 = f8028y[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f8036m.f8051d) {
            if (this.f8039p != 1 && !this.f8036m.i()) {
                C0132a c0132a = new C0132a(this.f8039p, this.f8040q);
                this.f8036m = c0132a;
                this.f8035l.add(c0132a);
            }
            this.f8036m.f8051d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f8036m.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f8036m.f8052e = f8029z[i11];
        }
    }

    @Override // e3.e, v1.d
    public void a() {
    }

    @Override // e3.e, d3.i
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // e3.e
    protected h f() {
        List<d3.b> list = this.f8037n;
        this.f8038o = list;
        return new f((List) p3.a.e(list));
    }

    @Override // e3.e, v1.d
    public void flush() {
        super.flush();
        this.f8037n = null;
        this.f8038o = null;
        N(0);
        O(4);
        M();
        this.f8041r = false;
        this.f8042s = false;
        this.f8043t = (byte) 0;
        this.f8044u = (byte) 0;
        this.f8045v = 0;
        this.f8046w = true;
        this.f8047x = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0018 A[SYNTHETIC] */
    @Override // e3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void g(d3.l r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.a.g(d3.l):void");
    }

    @Override // e3.e
    public /* bridge */ /* synthetic */ l h() {
        return super.e();
    }

    @Override // e3.e, v1.d
    /* renamed from: i */
    public m d() {
        m j10;
        m d10 = super.d();
        if (d10 != null) {
            return d10;
        }
        if (!P() || (j10 = j()) == null) {
            return null;
        }
        this.f8037n = Collections.emptyList();
        this.f8047x = -9223372036854775807L;
        j10.x(k(), f(), Long.MAX_VALUE);
        return j10;
    }

    @Override // e3.e
    protected boolean l() {
        return this.f8037n != this.f8038o;
    }

    @Override // e3.e
    public /* bridge */ /* synthetic */ void m(l lVar) {
        super.c(lVar);
    }
}
