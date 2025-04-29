package e3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d3.b;
import d3.h;
import d3.l;
import d3.m;
import e3.c;
import f.j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p3.a0;
import p3.r;
import p3.z;
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: g  reason: collision with root package name */
    private final a0 f8060g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final z f8061h = new z();

    /* renamed from: i  reason: collision with root package name */
    private int f8062i = -1;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f8063j;

    /* renamed from: k  reason: collision with root package name */
    private final int f8064k;

    /* renamed from: l  reason: collision with root package name */
    private final b[] f8065l;

    /* renamed from: m  reason: collision with root package name */
    private b f8066m;

    /* renamed from: n  reason: collision with root package name */
    private List<d3.b> f8067n;

    /* renamed from: o  reason: collision with root package name */
    private List<d3.b> f8068o;

    /* renamed from: p  reason: collision with root package name */
    private C0134c f8069p;

    /* renamed from: q  reason: collision with root package name */
    private int f8070q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        private static final Comparator<a> f8071c = new Comparator() { // from class: e3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c10;
                c10 = c.a.c((c.a) obj, (c.a) obj2);
                return c10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final d3.b f8072a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8073b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            b.C0115b n10 = new b.C0115b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                n10.s(i13);
            }
            this.f8072a = n10.a();
            this.f8073b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f8073b, aVar.f8073b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;

        /* renamed from: w  reason: collision with root package name */
        public static final int f8074w = h(2, 2, 2, 0);

        /* renamed from: x  reason: collision with root package name */
        public static final int f8075x;

        /* renamed from: y  reason: collision with root package name */
        public static final int f8076y;

        /* renamed from: z  reason: collision with root package name */
        private static final int[] f8077z;

        /* renamed from: a  reason: collision with root package name */
        private final List<SpannableString> f8078a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final SpannableStringBuilder f8079b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        private boolean f8080c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f8081d;

        /* renamed from: e  reason: collision with root package name */
        private int f8082e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8083f;

        /* renamed from: g  reason: collision with root package name */
        private int f8084g;

        /* renamed from: h  reason: collision with root package name */
        private int f8085h;

        /* renamed from: i  reason: collision with root package name */
        private int f8086i;

        /* renamed from: j  reason: collision with root package name */
        private int f8087j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f8088k;

        /* renamed from: l  reason: collision with root package name */
        private int f8089l;

        /* renamed from: m  reason: collision with root package name */
        private int f8090m;

        /* renamed from: n  reason: collision with root package name */
        private int f8091n;

        /* renamed from: o  reason: collision with root package name */
        private int f8092o;

        /* renamed from: p  reason: collision with root package name */
        private int f8093p;

        /* renamed from: q  reason: collision with root package name */
        private int f8094q;

        /* renamed from: r  reason: collision with root package name */
        private int f8095r;

        /* renamed from: s  reason: collision with root package name */
        private int f8096s;

        /* renamed from: t  reason: collision with root package name */
        private int f8097t;

        /* renamed from: u  reason: collision with root package name */
        private int f8098u;

        /* renamed from: v  reason: collision with root package name */
        private int f8099v;

        static {
            int h10 = h(0, 0, 0, 0);
            f8075x = h10;
            int h11 = h(0, 0, 0, 3);
            f8076y = h11;
            f8077z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{h10, h11, h10, h10, h11, h10, h10};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{h10, h10, h10, h10, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p3.a.c(r4, r0, r1)
                p3.a.c(r5, r0, r1)
                p3.a.c(r6, r0, r1)
                p3.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = 0
                goto L23
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L23
            L21:
                r7 = 255(0xff, float:3.57E-43)
            L23:
                if (r4 <= r1) goto L28
                r4 = 255(0xff, float:3.57E-43)
                goto L29
            L28:
                r4 = 0
            L29:
                if (r5 <= r1) goto L2e
                r5 = 255(0xff, float:3.57E-43)
                goto L2f
            L2e:
                r5 = 0
            L2f:
                if (r6 <= r1) goto L33
                r0 = 255(0xff, float:3.57E-43)
            L33:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: e3.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f8079b.append(c10);
                return;
            }
            this.f8078a.add(d());
            this.f8079b.clear();
            if (this.f8093p != -1) {
                this.f8093p = 0;
            }
            if (this.f8094q != -1) {
                this.f8094q = 0;
            }
            if (this.f8095r != -1) {
                this.f8095r = 0;
            }
            if (this.f8097t != -1) {
                this.f8097t = 0;
            }
            while (true) {
                if ((!this.f8088k || this.f8078a.size() < this.f8087j) && this.f8078a.size() < 15) {
                    return;
                }
                this.f8078a.remove(0);
            }
        }

        public void b() {
            int length = this.f8079b.length();
            if (length > 0) {
                this.f8079b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e3.c.a c() {
            /*
                Method dump skipped, instructions count: 197
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e3.c.b.c():e3.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8079b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f8093p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f8093p, length, 33);
                }
                if (this.f8094q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f8094q, length, 33);
                }
                if (this.f8095r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f8096s), this.f8095r, length, 33);
                }
                if (this.f8097t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8098u), this.f8097t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f8078a.clear();
            this.f8079b.clear();
            this.f8093p = -1;
            this.f8094q = -1;
            this.f8095r = -1;
            this.f8097t = -1;
            this.f8099v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f8080c = true;
            this.f8081d = z10;
            this.f8088k = z11;
            this.f8082e = i10;
            this.f8083f = z13;
            this.f8084g = i11;
            this.f8085h = i12;
            this.f8086i = i15;
            int i18 = i13 + 1;
            if (this.f8087j != i18) {
                this.f8087j = i18;
                while (true) {
                    if ((!z11 || this.f8078a.size() < this.f8087j) && this.f8078a.size() < 15) {
                        break;
                    }
                    this.f8078a.remove(0);
                }
            }
            if (i16 != 0 && this.f8090m != i16) {
                this.f8090m = i16;
                int i19 = i16 - 1;
                q(D[i19], f8076y, C[i19], 0, A[i19], B[i19], f8077z[i19]);
            }
            if (i17 == 0 || this.f8091n == i17) {
                return;
            }
            this.f8091n = i17;
            int i20 = i17 - 1;
            m(0, 1, 1, false, false, F[i20], E[i20]);
            n(f8074w, G[i20], f8075x);
        }

        public boolean i() {
            return this.f8080c;
        }

        public boolean j() {
            return !i() || (this.f8078a.isEmpty() && this.f8079b.length() == 0);
        }

        public boolean k() {
            return this.f8081d;
        }

        public void l() {
            e();
            this.f8080c = false;
            this.f8081d = false;
            this.f8082e = 4;
            this.f8083f = false;
            this.f8084g = 0;
            this.f8085h = 0;
            this.f8086i = 0;
            this.f8087j = 15;
            this.f8088k = true;
            this.f8089l = 0;
            this.f8090m = 0;
            this.f8091n = 0;
            int i10 = f8075x;
            this.f8092o = i10;
            this.f8096s = f8074w;
            this.f8098u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f8093p != -1) {
                if (!z10) {
                    this.f8079b.setSpan(new StyleSpan(2), this.f8093p, this.f8079b.length(), 33);
                    this.f8093p = -1;
                }
            } else if (z10) {
                this.f8093p = this.f8079b.length();
            }
            if (this.f8094q == -1) {
                if (z11) {
                    this.f8094q = this.f8079b.length();
                }
            } else if (z11) {
            } else {
                this.f8079b.setSpan(new UnderlineSpan(), this.f8094q, this.f8079b.length(), 33);
                this.f8094q = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f8095r != -1 && this.f8096s != i10) {
                this.f8079b.setSpan(new ForegroundColorSpan(this.f8096s), this.f8095r, this.f8079b.length(), 33);
            }
            if (i10 != f8074w) {
                this.f8095r = this.f8079b.length();
                this.f8096s = i10;
            }
            if (this.f8097t != -1 && this.f8098u != i11) {
                this.f8079b.setSpan(new BackgroundColorSpan(this.f8098u), this.f8097t, this.f8079b.length(), 33);
            }
            if (i11 != f8075x) {
                this.f8097t = this.f8079b.length();
                this.f8098u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f8099v != i10) {
                a('\n');
            }
            this.f8099v = i10;
        }

        public void p(boolean z10) {
            this.f8081d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f8092o = i10;
            this.f8089l = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0134c {

        /* renamed from: a  reason: collision with root package name */
        public final int f8100a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8101b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f8102c;

        /* renamed from: d  reason: collision with root package name */
        int f8103d = 0;

        public C0134c(int i10, int i11) {
            this.f8100a = i10;
            this.f8101b = i11;
            this.f8102c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List<byte[]> list) {
        boolean z10 = true;
        this.f8064k = i10 == -1 ? 1 : i10;
        this.f8063j = (list == null || !p3.e.h(list)) ? false : false;
        this.f8065l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f8065l[i11] = new b();
        }
        this.f8066m = this.f8065l[0];
    }

    private void A() {
        this.f8066m.m(this.f8061h.h(4), this.f8061h.h(2), this.f8061h.h(2), this.f8061h.g(), this.f8061h.g(), this.f8061h.h(3), this.f8061h.h(3));
    }

    private void B() {
        int h10 = b.h(this.f8061h.h(2), this.f8061h.h(2), this.f8061h.h(2), this.f8061h.h(2));
        int h11 = b.h(this.f8061h.h(2), this.f8061h.h(2), this.f8061h.h(2), this.f8061h.h(2));
        this.f8061h.r(2);
        this.f8066m.n(h10, h11, b.g(this.f8061h.h(2), this.f8061h.h(2), this.f8061h.h(2)));
    }

    private void C() {
        this.f8061h.r(4);
        int h10 = this.f8061h.h(4);
        this.f8061h.r(2);
        this.f8066m.o(h10, this.f8061h.h(6));
    }

    private void D() {
        int h10 = b.h(this.f8061h.h(2), this.f8061h.h(2), this.f8061h.h(2), this.f8061h.h(2));
        int h11 = this.f8061h.h(2);
        int g10 = b.g(this.f8061h.h(2), this.f8061h.h(2), this.f8061h.h(2));
        if (this.f8061h.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f8061h.g();
        int h12 = this.f8061h.h(2);
        int h13 = this.f8061h.h(2);
        int h14 = this.f8061h.h(2);
        this.f8061h.r(8);
        this.f8066m.q(h10, g10, g11, h11, h12, h13, h14);
    }

    private void E() {
        StringBuilder sb;
        String str;
        C0134c c0134c = this.f8069p;
        if (c0134c.f8103d != (c0134c.f8101b * 2) - 1) {
            r.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f8069p.f8101b * 2) - 1) + ", but current index is " + this.f8069p.f8103d + " (sequence number " + this.f8069p.f8100a + ");");
        }
        boolean z10 = false;
        z zVar = this.f8061h;
        C0134c c0134c2 = this.f8069p;
        zVar.o(c0134c2.f8102c, c0134c2.f8103d);
        while (true) {
            if (this.f8061h.b() <= 0) {
                break;
            }
            int h10 = this.f8061h.h(3);
            int h11 = this.f8061h.h(5);
            if (h10 == 7) {
                this.f8061h.r(2);
                h10 = this.f8061h.h(6);
                if (h10 < 7) {
                    r.i("Cea708Decoder", "Invalid extended service number: " + h10);
                }
            }
            if (h11 == 0) {
                if (h10 != 0) {
                    r.i("Cea708Decoder", "serviceNumber is non-zero (" + h10 + ") when blockSize is 0");
                }
            } else if (h10 != this.f8064k) {
                this.f8061h.s(h11);
            } else {
                int e10 = this.f8061h.e() + (h11 * 8);
                while (this.f8061h.e() < e10) {
                    int h12 = this.f8061h.h(8);
                    if (h12 == 16) {
                        h12 = this.f8061h.h(8);
                        if (h12 <= 31) {
                            t(h12);
                        } else {
                            if (h12 <= 127) {
                                y(h12);
                            } else if (h12 <= 159) {
                                u(h12);
                            } else if (h12 <= 255) {
                                z(h12);
                            } else {
                                sb = new StringBuilder();
                                str = "Invalid extended command: ";
                                sb.append(str);
                                sb.append(h12);
                                r.i("Cea708Decoder", sb.toString());
                            }
                            z10 = true;
                        }
                    } else if (h12 <= 31) {
                        r(h12);
                    } else {
                        if (h12 <= 127) {
                            w(h12);
                        } else if (h12 <= 159) {
                            s(h12);
                        } else if (h12 <= 255) {
                            x(h12);
                        } else {
                            sb = new StringBuilder();
                            str = "Invalid base command: ";
                            sb.append(str);
                            sb.append(h12);
                            r.i("Cea708Decoder", sb.toString());
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f8067n = q();
        }
    }

    private void F() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f8065l[i10].l();
        }
    }

    private void p() {
        if (this.f8069p == null) {
            return;
        }
        E();
        this.f8069p = null;
    }

    private List<d3.b> q() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f8065l[i10].j() && this.f8065l[i10].k() && (c10 = this.f8065l[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f8071c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f8072a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void r(int i10) {
        z zVar;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f8067n = q();
                return;
            }
            int i11 = 8;
            if (i10 == 8) {
                this.f8066m.b();
                return;
            }
            switch (i10) {
                case 12:
                    F();
                    return;
                case 13:
                    this.f8066m.a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        zVar = this.f8061h;
                    } else if (i10 < 24 || i10 > 31) {
                        r.i("Cea708Decoder", "Invalid C0 command: " + i10);
                        return;
                    } else {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        zVar = this.f8061h;
                        i11 = 16;
                    }
                    zVar.r(i11);
                    return;
            }
        }
    }

    private void s(int i10) {
        b bVar;
        b bVar2;
        z zVar;
        int i11 = 16;
        int i12 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i13 = i10 - 128;
                if (this.f8070q != i13) {
                    this.f8070q = i13;
                    bVar = this.f8065l[i13];
                    this.f8066m = bVar;
                    return;
                }
                return;
            case 136:
                while (i12 <= 8) {
                    if (this.f8061h.g()) {
                        this.f8065l[8 - i12].e();
                    }
                    i12++;
                }
                return;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f8061h.g()) {
                        this.f8065l[8 - i14].p(true);
                    }
                }
                return;
            case 138:
                while (i12 <= 8) {
                    if (this.f8061h.g()) {
                        this.f8065l[8 - i12].p(false);
                    }
                    i12++;
                }
                return;
            case 139:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.f8061h.g()) {
                        this.f8065l[8 - i15].p(!bVar2.k());
                    }
                }
                return;
            case 140:
                while (i12 <= 8) {
                    if (this.f8061h.g()) {
                        this.f8065l[8 - i12].l();
                    }
                    i12++;
                }
                return;
            case 141:
                this.f8061h.r(8);
                return;
            case 142:
                return;
            case 143:
                F();
                return;
            case 144:
                if (this.f8066m.i()) {
                    A();
                    return;
                }
                zVar = this.f8061h;
                zVar.r(i11);
                return;
            case 145:
                if (this.f8066m.i()) {
                    B();
                    return;
                }
                zVar = this.f8061h;
                i11 = 24;
                zVar.r(i11);
                return;
            case 146:
                if (this.f8066m.i()) {
                    C();
                    return;
                }
                zVar = this.f8061h;
                zVar.r(i11);
                return;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                r.i("Cea708Decoder", "Invalid C1 command: " + i10);
                return;
            case 151:
                if (this.f8066m.i()) {
                    D();
                    return;
                }
                zVar = this.f8061h;
                i11 = 32;
                zVar.r(i11);
                return;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i16 = i10 - 152;
                v(i16);
                if (this.f8070q != i16) {
                    this.f8070q = i16;
                    bVar = this.f8065l[i16];
                    this.f8066m = bVar;
                    return;
                }
                return;
        }
    }

    private void t(int i10) {
        z zVar;
        int i11;
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            zVar = this.f8061h;
            i11 = 8;
        } else if (i10 <= 23) {
            zVar = this.f8061h;
            i11 = 16;
        } else if (i10 > 31) {
            return;
        } else {
            zVar = this.f8061h;
            i11 = 24;
        }
        zVar.r(i11);
    }

    private void u(int i10) {
        z zVar;
        int i11;
        if (i10 <= 135) {
            zVar = this.f8061h;
            i11 = 32;
        } else if (i10 > 143) {
            if (i10 <= 159) {
                this.f8061h.r(2);
                this.f8061h.r(this.f8061h.h(6) * 8);
                return;
            }
            return;
        } else {
            zVar = this.f8061h;
            i11 = 40;
        }
        zVar.r(i11);
    }

    private void v(int i10) {
        b bVar = this.f8065l[i10];
        this.f8061h.r(2);
        boolean g10 = this.f8061h.g();
        boolean g11 = this.f8061h.g();
        boolean g12 = this.f8061h.g();
        int h10 = this.f8061h.h(3);
        boolean g13 = this.f8061h.g();
        int h11 = this.f8061h.h(7);
        int h12 = this.f8061h.h(8);
        int h13 = this.f8061h.h(4);
        int h14 = this.f8061h.h(4);
        this.f8061h.r(2);
        int h15 = this.f8061h.h(6);
        this.f8061h.r(2);
        bVar.f(g10, g11, g12, h10, g13, h11, h12, h14, h15, h13, this.f8061h.h(3), this.f8061h.h(3));
    }

    private void w(int i10) {
        if (i10 == 127) {
            this.f8066m.a((char) 9835);
        } else {
            this.f8066m.a((char) (i10 & 255));
        }
    }

    private void x(int i10) {
        this.f8066m.a((char) (i10 & 255));
    }

    private void y(int i10) {
        b bVar;
        char c10 = ' ';
        if (i10 == 32) {
            bVar = this.f8066m;
        } else if (i10 == 33) {
            bVar = this.f8066m;
            c10 = 160;
        } else if (i10 == 37) {
            bVar = this.f8066m;
            c10 = 8230;
        } else if (i10 == 42) {
            bVar = this.f8066m;
            c10 = 352;
        } else if (i10 == 44) {
            bVar = this.f8066m;
            c10 = 338;
        } else if (i10 == 63) {
            bVar = this.f8066m;
            c10 = 376;
        } else if (i10 == 57) {
            bVar = this.f8066m;
            c10 = 8482;
        } else if (i10 == 58) {
            bVar = this.f8066m;
            c10 = 353;
        } else if (i10 == 60) {
            bVar = this.f8066m;
            c10 = 339;
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    bVar = this.f8066m;
                    c10 = 9608;
                    break;
                case 49:
                    bVar = this.f8066m;
                    c10 = 8216;
                    break;
                case 50:
                    bVar = this.f8066m;
                    c10 = 8217;
                    break;
                case 51:
                    bVar = this.f8066m;
                    c10 = 8220;
                    break;
                case 52:
                    bVar = this.f8066m;
                    c10 = 8221;
                    break;
                case 53:
                    bVar = this.f8066m;
                    c10 = 8226;
                    break;
                default:
                    switch (i10) {
                        case j.H0 /* 118 */:
                            bVar = this.f8066m;
                            c10 = 8539;
                            break;
                        case j.I0 /* 119 */:
                            bVar = this.f8066m;
                            c10 = 8540;
                            break;
                        case j.J0 /* 120 */:
                            bVar = this.f8066m;
                            c10 = 8541;
                            break;
                        case j.K0 /* 121 */:
                            bVar = this.f8066m;
                            c10 = 8542;
                            break;
                        case j.L0 /* 122 */:
                            bVar = this.f8066m;
                            c10 = 9474;
                            break;
                        case j.M0 /* 123 */:
                            bVar = this.f8066m;
                            c10 = 9488;
                            break;
                        case j.N0 /* 124 */:
                            bVar = this.f8066m;
                            c10 = 9492;
                            break;
                        case 125:
                            bVar = this.f8066m;
                            c10 = 9472;
                            break;
                        case 126:
                            bVar = this.f8066m;
                            c10 = 9496;
                            break;
                        case 127:
                            bVar = this.f8066m;
                            c10 = 9484;
                            break;
                        default:
                            r.i("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            bVar = this.f8066m;
            c10 = 8480;
        }
        bVar.a(c10);
    }

    private void z(int i10) {
        b bVar;
        char c10;
        if (i10 == 160) {
            bVar = this.f8066m;
            c10 = 13252;
        } else {
            r.i("Cea708Decoder", "Invalid G3 character: " + i10);
            bVar = this.f8066m;
            c10 = '_';
        }
        bVar.a(c10);
    }

    @Override // e3.e, v1.d
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // e3.e, d3.i
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // e3.e
    protected h f() {
        List<d3.b> list = this.f8067n;
        this.f8068o = list;
        return new f((List) p3.a.e(list));
    }

    @Override // e3.e, v1.d
    public void flush() {
        super.flush();
        this.f8067n = null;
        this.f8068o = null;
        this.f8070q = 0;
        this.f8066m = this.f8065l[0];
        F();
        this.f8069p = null;
    }

    @Override // e3.e
    protected void g(l lVar) {
        ByteBuffer byteBuffer = (ByteBuffer) p3.a.e(lVar.f19364l);
        this.f8060g.R(byteBuffer.array(), byteBuffer.limit());
        while (this.f8060g.a() >= 3) {
            int G = this.f8060g.G() & 7;
            int i10 = G & 3;
            boolean z10 = (G & 4) == 4;
            byte G2 = (byte) this.f8060g.G();
            byte G3 = (byte) this.f8060g.G();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        p();
                        int i11 = (G2 & 192) >> 6;
                        int i12 = this.f8062i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            F();
                            r.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f8062i + " current=" + i11);
                        }
                        this.f8062i = i11;
                        int i13 = G2 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0134c c0134c = new C0134c(i11, i13);
                        this.f8069p = c0134c;
                        byte[] bArr = c0134c.f8102c;
                        int i14 = c0134c.f8103d;
                        c0134c.f8103d = i14 + 1;
                        bArr[i14] = G3;
                    } else {
                        p3.a.a(i10 == 2);
                        C0134c c0134c2 = this.f8069p;
                        if (c0134c2 == null) {
                            r.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0134c2.f8102c;
                            int i15 = c0134c2.f8103d;
                            int i16 = i15 + 1;
                            c0134c2.f8103d = i16;
                            bArr2[i15] = G2;
                            c0134c2.f8103d = i16 + 1;
                            bArr2[i16] = G3;
                        }
                    }
                    C0134c c0134c3 = this.f8069p;
                    if (c0134c3.f8103d == (c0134c3.f8101b * 2) - 1) {
                        p();
                    }
                }
            }
        }
    }

    @Override // e3.e
    public /* bridge */ /* synthetic */ l h() {
        return super.e();
    }

    @Override // e3.e
    public /* bridge */ /* synthetic */ m i() {
        return super.d();
    }

    @Override // e3.e
    protected boolean l() {
        return this.f8067n != this.f8068o;
    }

    @Override // e3.e
    public /* bridge */ /* synthetic */ void m(l lVar) {
        super.c(lVar);
    }
}
