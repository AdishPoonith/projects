package f2;

import android.util.Pair;
import f2.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k2.a;
import p3.a0;
import p3.n0;
import p3.v;
import s1.n1;
import s1.u2;
import x1.x;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f8610a = n0.l0("OpusHead");

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8611a;

        /* renamed from: b  reason: collision with root package name */
        public int f8612b;

        /* renamed from: c  reason: collision with root package name */
        public int f8613c;

        /* renamed from: d  reason: collision with root package name */
        public long f8614d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f8615e;

        /* renamed from: f  reason: collision with root package name */
        private final a0 f8616f;

        /* renamed from: g  reason: collision with root package name */
        private final a0 f8617g;

        /* renamed from: h  reason: collision with root package name */
        private int f8618h;

        /* renamed from: i  reason: collision with root package name */
        private int f8619i;

        public a(a0 a0Var, a0 a0Var2, boolean z10) {
            this.f8617g = a0Var;
            this.f8616f = a0Var2;
            this.f8615e = z10;
            a0Var2.T(12);
            this.f8611a = a0Var2.K();
            a0Var.T(12);
            this.f8619i = a0Var.K();
            x1.o.a(a0Var.p() == 1, "first_chunk must be 1");
            this.f8612b = -1;
        }

        public boolean a() {
            int i10 = this.f8612b + 1;
            this.f8612b = i10;
            if (i10 == this.f8611a) {
                return false;
            }
            this.f8614d = this.f8615e ? this.f8616f.L() : this.f8616f.I();
            if (this.f8612b == this.f8618h) {
                this.f8613c = this.f8617g.K();
                this.f8617g.U(4);
                int i11 = this.f8619i - 1;
                this.f8619i = i11;
                this.f8618h = i11 > 0 ? this.f8617g.K() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0142b {

        /* renamed from: a  reason: collision with root package name */
        private final String f8620a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f8621b;

        /* renamed from: c  reason: collision with root package name */
        private final long f8622c;

        /* renamed from: d  reason: collision with root package name */
        private final long f8623d;

        public C0142b(String str, byte[] bArr, long j10, long j11) {
            this.f8620a = str;
            this.f8621b = bArr;
            this.f8622c = j10;
            this.f8623d = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final p[] f8624a;

        /* renamed from: b  reason: collision with root package name */
        public n1 f8625b;

        /* renamed from: c  reason: collision with root package name */
        public int f8626c;

        /* renamed from: d  reason: collision with root package name */
        public int f8627d = 0;

        public d(int i10) {
            this.f8624a = new p[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final int f8628a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8629b;

        /* renamed from: c  reason: collision with root package name */
        private final a0 f8630c;

        public e(a.b bVar, n1 n1Var) {
            a0 a0Var = bVar.f8609b;
            this.f8630c = a0Var;
            a0Var.T(12);
            int K = a0Var.K();
            if ("audio/raw".equals(n1Var.f17419u)) {
                int d02 = n0.d0(n1Var.J, n1Var.H);
                if (K == 0 || K % d02 != 0) {
                    p3.r.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + d02 + ", stsz sample size: " + K);
                    K = d02;
                }
            }
            this.f8628a = K == 0 ? -1 : K;
            this.f8629b = a0Var.K();
        }

        @Override // f2.b.c
        public int a() {
            return this.f8628a;
        }

        @Override // f2.b.c
        public int b() {
            return this.f8629b;
        }

        @Override // f2.b.c
        public int c() {
            int i10 = this.f8628a;
            return i10 == -1 ? this.f8630c.K() : i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f implements c {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f8631a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8632b;

        /* renamed from: c  reason: collision with root package name */
        private final int f8633c;

        /* renamed from: d  reason: collision with root package name */
        private int f8634d;

        /* renamed from: e  reason: collision with root package name */
        private int f8635e;

        public f(a.b bVar) {
            a0 a0Var = bVar.f8609b;
            this.f8631a = a0Var;
            a0Var.T(12);
            this.f8633c = a0Var.K() & 255;
            this.f8632b = a0Var.K();
        }

        @Override // f2.b.c
        public int a() {
            return -1;
        }

        @Override // f2.b.c
        public int b() {
            return this.f8632b;
        }

        @Override // f2.b.c
        public int c() {
            int i10 = this.f8633c;
            if (i10 == 8) {
                return this.f8631a.G();
            }
            if (i10 == 16) {
                return this.f8631a.M();
            }
            int i11 = this.f8634d;
            this.f8634d = i11 + 1;
            if (i11 % 2 == 0) {
                int G = this.f8631a.G();
                this.f8635e = G;
                return (G & 240) >> 4;
            }
            return this.f8635e & 15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final int f8636a;

        /* renamed from: b  reason: collision with root package name */
        private final long f8637b;

        /* renamed from: c  reason: collision with root package name */
        private final int f8638c;

        public g(int i10, long j10, int i11) {
            this.f8636a = i10;
            this.f8637b = j10;
            this.f8638c = i11;
        }
    }

    public static List<r> A(a.C0141a c0141a, x xVar, long j10, w1.m mVar, boolean z10, boolean z11, b5.f<o, o> fVar) {
        o apply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0141a.f8608d.size(); i10++) {
            a.C0141a c0141a2 = c0141a.f8608d.get(i10);
            if (c0141a2.f8605a == 1953653099 && (apply = fVar.apply(z(c0141a2, (a.b) p3.a.e(c0141a.g(1836476516)), j10, mVar, z10, z11))) != null) {
                arrayList.add(v(apply, (a.C0141a) p3.a.e(((a.C0141a) p3.a.e(((a.C0141a) p3.a.e(c0141a2.f(1835297121))).f(1835626086))).f(1937007212)), xVar));
            }
        }
        return arrayList;
    }

    public static Pair<k2.a, k2.a> B(a.b bVar) {
        a0 a0Var = bVar.f8609b;
        a0Var.T(8);
        k2.a aVar = null;
        k2.a aVar2 = null;
        while (a0Var.a() >= 8) {
            int f10 = a0Var.f();
            int p10 = a0Var.p();
            int p11 = a0Var.p();
            if (p11 == 1835365473) {
                a0Var.T(f10);
                aVar = C(a0Var, f10 + p10);
            } else if (p11 == 1936553057) {
                a0Var.T(f10);
                aVar2 = u(a0Var, f10 + p10);
            }
            a0Var.T(f10 + p10);
        }
        return Pair.create(aVar, aVar2);
    }

    private static k2.a C(a0 a0Var, int i10) {
        a0Var.U(8);
        e(a0Var);
        while (a0Var.f() < i10) {
            int f10 = a0Var.f();
            int p10 = a0Var.p();
            if (a0Var.p() == 1768715124) {
                a0Var.T(f10);
                return l(a0Var, f10 + p10);
            }
            a0Var.T(f10 + p10);
        }
        return null;
    }

    private static void D(a0 a0Var, int i10, int i11, int i12, int i13, int i14, w1.m mVar, d dVar, int i15) {
        String str;
        w1.m mVar2;
        int i16;
        int i17;
        float f10;
        List<byte[]> list;
        int i18;
        int i19;
        int i20;
        String str2;
        int i21 = i11;
        int i22 = i12;
        w1.m mVar3 = mVar;
        d dVar2 = dVar;
        a0Var.T(i21 + 8 + 8);
        a0Var.U(16);
        int M = a0Var.M();
        int M2 = a0Var.M();
        a0Var.U(50);
        int f11 = a0Var.f();
        int i23 = i10;
        if (i23 == 1701733238) {
            Pair<Integer, p> s10 = s(a0Var, i21, i22);
            if (s10 != null) {
                i23 = ((Integer) s10.first).intValue();
                mVar3 = mVar3 == null ? null : mVar3.c(((p) s10.second).f8749b);
                dVar2.f8624a[i15] = (p) s10.second;
            }
            a0Var.T(f11);
        }
        String str3 = "video/3gpp";
        String str4 = i23 == 1831958048 ? "video/mpeg" : i23 == 1211250227 ? "video/3gpp" : null;
        float f12 = 1.0f;
        String str5 = null;
        List<byte[]> list2 = null;
        byte[] bArr = null;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        ByteBuffer byteBuffer = null;
        C0142b c0142b = null;
        boolean z10 = false;
        while (f11 - i21 < i22) {
            a0Var.T(f11);
            int f13 = a0Var.f();
            int p10 = a0Var.p();
            if (p10 == 0) {
                str = str3;
                if (a0Var.f() - i21 == i22) {
                    break;
                }
            } else {
                str = str3;
            }
            x1.o.a(p10 > 0, "childAtomSize must be positive");
            int p11 = a0Var.p();
            if (p11 == 1635148611) {
                x1.o.a(str4 == null, null);
                a0Var.T(f13 + 8);
                q3.a b10 = q3.a.b(a0Var);
                list2 = b10.f16015a;
                dVar2.f8626c = b10.f16016b;
                if (!z10) {
                    f12 = b10.f16019e;
                }
                str5 = b10.f16020f;
                str2 = "video/avc";
            } else {
                if (p11 == 1752589123) {
                    x1.o.a(str4 == null, null);
                    a0Var.T(f13 + 8);
                    q3.f a10 = q3.f.a(a0Var);
                    list2 = a10.f16050a;
                    dVar2.f8626c = a10.f16051b;
                    if (!z10) {
                        f12 = a10.f16054e;
                    }
                    str5 = a10.f16058i;
                    int i28 = a10.f16055f;
                    int i29 = a10.f16056g;
                    i27 = a10.f16057h;
                    mVar2 = mVar3;
                    i16 = M2;
                    i25 = i28;
                    i17 = i23;
                    i26 = i29;
                    str4 = "video/hevc";
                } else {
                    if (p11 == 1685480259 || p11 == 1685485123) {
                        mVar2 = mVar3;
                        i16 = M2;
                        i17 = i23;
                        f10 = f12;
                        list = list2;
                        i18 = i25;
                        i19 = i26;
                        i20 = i27;
                        q3.d a11 = q3.d.a(a0Var);
                        if (a11 != null) {
                            str5 = a11.f16035c;
                            str4 = "video/dolby-vision";
                        }
                    } else if (p11 == 1987076931) {
                        x1.o.a(str4 == null, null);
                        str2 = i23 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        a0Var.T(f13 + 12);
                        a0Var.U(2);
                        boolean z11 = (a0Var.G() & 1) != 0;
                        int G = a0Var.G();
                        int G2 = a0Var.G();
                        i25 = q3.c.b(G);
                        i26 = z11 ? 1 : 2;
                        i27 = q3.c.c(G2);
                    } else if (p11 == 1635135811) {
                        x1.o.a(str4 == null, null);
                        str2 = "video/av01";
                    } else if (p11 == 1668050025) {
                        ByteBuffer a12 = byteBuffer == null ? a() : byteBuffer;
                        a12.position(21);
                        a12.putShort(a0Var.C());
                        a12.putShort(a0Var.C());
                        byteBuffer = a12;
                        mVar2 = mVar3;
                        i16 = M2;
                        i17 = i23;
                    } else if (p11 == 1835295606) {
                        ByteBuffer a13 = byteBuffer == null ? a() : byteBuffer;
                        short C = a0Var.C();
                        short C2 = a0Var.C();
                        short C3 = a0Var.C();
                        i17 = i23;
                        short C4 = a0Var.C();
                        short C5 = a0Var.C();
                        mVar2 = mVar3;
                        short C6 = a0Var.C();
                        List<byte[]> list3 = list2;
                        short C7 = a0Var.C();
                        float f14 = f12;
                        short C8 = a0Var.C();
                        long I = a0Var.I();
                        long I2 = a0Var.I();
                        i16 = M2;
                        a13.position(1);
                        a13.putShort(C5);
                        a13.putShort(C6);
                        a13.putShort(C);
                        a13.putShort(C2);
                        a13.putShort(C3);
                        a13.putShort(C4);
                        a13.putShort(C7);
                        a13.putShort(C8);
                        a13.putShort((short) (I / 10000));
                        a13.putShort((short) (I2 / 10000));
                        byteBuffer = a13;
                        list2 = list3;
                        f12 = f14;
                    } else {
                        mVar2 = mVar3;
                        i16 = M2;
                        i17 = i23;
                        f10 = f12;
                        list = list2;
                        if (p11 == 1681012275) {
                            x1.o.a(str4 == null, null);
                            str4 = str;
                        } else if (p11 == 1702061171) {
                            x1.o.a(str4 == null, null);
                            c0142b = i(a0Var, f13);
                            String str6 = c0142b.f8620a;
                            byte[] bArr2 = c0142b.f8621b;
                            list2 = bArr2 != null ? com.google.common.collect.q.A(bArr2) : list;
                            str4 = str6;
                            f12 = f10;
                            f11 += p10;
                            i21 = i11;
                            i22 = i12;
                            dVar2 = dVar;
                            str3 = str;
                            i23 = i17;
                            mVar3 = mVar2;
                            M2 = i16;
                        } else if (p11 == 1885434736) {
                            f12 = q(a0Var, f13);
                            list2 = list;
                            z10 = true;
                            f11 += p10;
                            i21 = i11;
                            i22 = i12;
                            dVar2 = dVar;
                            str3 = str;
                            i23 = i17;
                            mVar3 = mVar2;
                            M2 = i16;
                        } else if (p11 == 1937126244) {
                            bArr = r(a0Var, f13, p10);
                        } else if (p11 == 1936995172) {
                            int G3 = a0Var.G();
                            a0Var.U(3);
                            if (G3 == 0) {
                                int G4 = a0Var.G();
                                if (G4 == 0) {
                                    i24 = 0;
                                } else if (G4 == 1) {
                                    i24 = 1;
                                } else if (G4 == 2) {
                                    i24 = 2;
                                } else if (G4 == 3) {
                                    i24 = 3;
                                }
                            }
                        } else {
                            i18 = i25;
                            if (p11 == 1668246642) {
                                i19 = i26;
                                if (i18 == -1) {
                                    i20 = i27;
                                    if (i19 == -1 && i20 == -1) {
                                        int p12 = a0Var.p();
                                        if (p12 == 1852009592 || p12 == 1852009571) {
                                            int M3 = a0Var.M();
                                            int M4 = a0Var.M();
                                            a0Var.U(2);
                                            boolean z12 = p10 == 19 && (a0Var.G() & 128) != 0;
                                            i25 = q3.c.b(M3);
                                            i26 = z12 ? 1 : 2;
                                            i27 = q3.c.c(M4);
                                        } else {
                                            p3.r.i("AtomParsers", "Unsupported color type: " + f2.a.a(p12));
                                        }
                                    }
                                }
                            } else {
                                i19 = i26;
                            }
                            i20 = i27;
                        }
                        list2 = list;
                        f12 = f10;
                        f11 += p10;
                        i21 = i11;
                        i22 = i12;
                        dVar2 = dVar;
                        str3 = str;
                        i23 = i17;
                        mVar3 = mVar2;
                        M2 = i16;
                    }
                    i26 = i19;
                    i27 = i20;
                    i25 = i18;
                    list2 = list;
                    f12 = f10;
                    f11 += p10;
                    i21 = i11;
                    i22 = i12;
                    dVar2 = dVar;
                    str3 = str;
                    i23 = i17;
                    mVar3 = mVar2;
                    M2 = i16;
                }
                f11 += p10;
                i21 = i11;
                i22 = i12;
                dVar2 = dVar;
                str3 = str;
                i23 = i17;
                mVar3 = mVar2;
                M2 = i16;
            }
            str4 = str2;
            mVar2 = mVar3;
            i16 = M2;
            i17 = i23;
            f11 += p10;
            i21 = i11;
            i22 = i12;
            dVar2 = dVar;
            str3 = str;
            i23 = i17;
            mVar3 = mVar2;
            M2 = i16;
        }
        w1.m mVar4 = mVar3;
        int i30 = M2;
        float f15 = f12;
        List<byte[]> list4 = list2;
        int i31 = i25;
        int i32 = i26;
        int i33 = i27;
        if (str4 == null) {
            return;
        }
        n1.b O = new n1.b().T(i13).g0(str4).K(str5).n0(M).S(i30).c0(f15).f0(i14).d0(bArr).j0(i24).V(list4).O(mVar4);
        if (i31 != -1 || i32 != -1 || i33 != -1 || byteBuffer != null) {
            O.L(new q3.c(i31, i32, i33, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (c0142b != null) {
            O.I(e5.e.j(c0142b.f8622c)).b0(e5.e.j(c0142b.f8623d));
        }
        dVar.f8625b = O.G();
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[n0.q(4, 0, length)] && jArr[n0.q(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(a0 a0Var, int i10, int i11, int i12) {
        int f10 = a0Var.f();
        x1.o.a(f10 >= i11, null);
        while (f10 - i11 < i12) {
            a0Var.T(f10);
            int p10 = a0Var.p();
            x1.o.a(p10 > 0, "childAtomSize must be positive");
            if (a0Var.p() == i10) {
                return f10;
            }
            f10 += p10;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(a0 a0Var) {
        int f10 = a0Var.f();
        a0Var.U(4);
        if (a0Var.p() != 1751411826) {
            f10 += 4;
        }
        a0Var.T(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(p3.a0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, w1.m r29, f2.b.d r30, int r31) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.f(p3.a0, int, int, int, int, java.lang.String, boolean, w1.m, f2.b$d, int):void");
    }

    static Pair<Integer, p> g(a0 a0Var, int i10, int i11) {
        int i12 = i10 + 8;
        String str = null;
        Integer num = null;
        int i13 = -1;
        int i14 = 0;
        while (i12 - i10 < i11) {
            a0Var.T(i12);
            int p10 = a0Var.p();
            int p11 = a0Var.p();
            if (p11 == 1718775137) {
                num = Integer.valueOf(a0Var.p());
            } else if (p11 == 1935894637) {
                a0Var.U(4);
                str = a0Var.D(4);
            } else if (p11 == 1935894633) {
                i13 = i12;
                i14 = p10;
            }
            i12 += p10;
        }
        if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
            x1.o.a(num != null, "frma atom is mandatory");
            x1.o.a(i13 != -1, "schi atom is mandatory");
            p t10 = t(a0Var, i13, i14, str);
            x1.o.a(t10 != null, "tenc atom is mandatory");
            return Pair.create(num, (p) n0.j(t10));
        }
        return null;
    }

    private static Pair<long[], long[]> h(a.C0141a c0141a) {
        a.b g10 = c0141a.g(1701606260);
        if (g10 == null) {
            return null;
        }
        a0 a0Var = g10.f8609b;
        a0Var.T(8);
        int c10 = f2.a.c(a0Var.p());
        int K = a0Var.K();
        long[] jArr = new long[K];
        long[] jArr2 = new long[K];
        for (int i10 = 0; i10 < K; i10++) {
            jArr[i10] = c10 == 1 ? a0Var.L() : a0Var.I();
            jArr2[i10] = c10 == 1 ? a0Var.z() : a0Var.p();
            if (a0Var.C() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            a0Var.U(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0142b i(a0 a0Var, int i10) {
        a0Var.T(i10 + 8 + 4);
        a0Var.U(1);
        j(a0Var);
        a0Var.U(2);
        int G = a0Var.G();
        if ((G & 128) != 0) {
            a0Var.U(2);
        }
        if ((G & 64) != 0) {
            a0Var.U(a0Var.G());
        }
        if ((G & 32) != 0) {
            a0Var.U(2);
        }
        a0Var.U(1);
        j(a0Var);
        String h10 = v.h(a0Var.G());
        if ("audio/mpeg".equals(h10) || "audio/vnd.dts".equals(h10) || "audio/vnd.dts.hd".equals(h10)) {
            return new C0142b(h10, null, -1L, -1L);
        }
        a0Var.U(4);
        long I = a0Var.I();
        long I2 = a0Var.I();
        a0Var.U(1);
        int j10 = j(a0Var);
        byte[] bArr = new byte[j10];
        a0Var.l(bArr, 0, j10);
        return new C0142b(h10, bArr, I2 > 0 ? I2 : -1L, I > 0 ? I : -1L);
    }

    private static int j(a0 a0Var) {
        int G = a0Var.G();
        int i10 = G & 127;
        while ((G & 128) == 128) {
            G = a0Var.G();
            i10 = (i10 << 7) | (G & 127);
        }
        return i10;
    }

    private static int k(a0 a0Var) {
        a0Var.T(16);
        return a0Var.p();
    }

    private static k2.a l(a0 a0Var, int i10) {
        a0Var.U(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var.f() < i10) {
            a.b c10 = h.c(a0Var);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new k2.a(arrayList);
    }

    private static Pair<Long, String> m(a0 a0Var) {
        a0Var.T(8);
        int c10 = f2.a.c(a0Var.p());
        a0Var.U(c10 == 0 ? 8 : 16);
        long I = a0Var.I();
        a0Var.U(c10 == 0 ? 4 : 8);
        int M = a0Var.M();
        return Pair.create(Long.valueOf(I), "" + ((char) (((M >> 10) & 31) + 96)) + ((char) (((M >> 5) & 31) + 96)) + ((char) ((M & 31) + 96)));
    }

    public static k2.a n(a.C0141a c0141a) {
        a.b g10 = c0141a.g(1751411826);
        a.b g11 = c0141a.g(1801812339);
        a.b g12 = c0141a.g(1768715124);
        if (g10 == null || g11 == null || g12 == null || k(g10.f8609b) != 1835299937) {
            return null;
        }
        a0 a0Var = g11.f8609b;
        a0Var.T(12);
        int p10 = a0Var.p();
        String[] strArr = new String[p10];
        for (int i10 = 0; i10 < p10; i10++) {
            int p11 = a0Var.p();
            a0Var.U(4);
            strArr[i10] = a0Var.D(p11 - 8);
        }
        a0 a0Var2 = g12.f8609b;
        a0Var2.T(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var2.a() > 8) {
            int f10 = a0Var2.f();
            int p12 = a0Var2.p();
            int p13 = a0Var2.p() - 1;
            if (p13 < 0 || p13 >= p10) {
                p3.r.i("AtomParsers", "Skipped metadata with unknown key index: " + p13);
            } else {
                q2.a f11 = h.f(a0Var2, f10 + p12, strArr[p13]);
                if (f11 != null) {
                    arrayList.add(f11);
                }
            }
            a0Var2.T(f10 + p12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new k2.a(arrayList);
    }

    private static void o(a0 a0Var, int i10, int i11, int i12, d dVar) {
        a0Var.T(i11 + 8 + 8);
        if (i10 == 1835365492) {
            a0Var.A();
            String A = a0Var.A();
            if (A != null) {
                dVar.f8625b = new n1.b().T(i12).g0(A).G();
            }
        }
    }

    private static long p(a0 a0Var) {
        a0Var.T(8);
        a0Var.U(f2.a.c(a0Var.p()) != 0 ? 16 : 8);
        return a0Var.I();
    }

    private static float q(a0 a0Var, int i10) {
        a0Var.T(i10 + 8);
        return a0Var.K() / a0Var.K();
    }

    private static byte[] r(a0 a0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            a0Var.T(i12);
            int p10 = a0Var.p();
            if (a0Var.p() == 1886547818) {
                return Arrays.copyOfRange(a0Var.e(), i12, p10 + i12);
            }
            i12 += p10;
        }
        return null;
    }

    private static Pair<Integer, p> s(a0 a0Var, int i10, int i11) {
        Pair<Integer, p> g10;
        int f10 = a0Var.f();
        while (f10 - i10 < i11) {
            a0Var.T(f10);
            int p10 = a0Var.p();
            x1.o.a(p10 > 0, "childAtomSize must be positive");
            if (a0Var.p() == 1936289382 && (g10 = g(a0Var, f10, p10)) != null) {
                return g10;
            }
            f10 += p10;
        }
        return null;
    }

    private static p t(a0 a0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            a0Var.T(i14);
            int p10 = a0Var.p();
            if (a0Var.p() == 1952804451) {
                int c10 = f2.a.c(a0Var.p());
                a0Var.U(1);
                if (c10 == 0) {
                    a0Var.U(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int G = a0Var.G();
                    i12 = G & 15;
                    i13 = (G & 240) >> 4;
                }
                boolean z10 = a0Var.G() == 1;
                int G2 = a0Var.G();
                byte[] bArr2 = new byte[16];
                a0Var.l(bArr2, 0, 16);
                if (z10 && G2 == 0) {
                    int G3 = a0Var.G();
                    bArr = new byte[G3];
                    a0Var.l(bArr, 0, G3);
                }
                return new p(z10, str, G2, bArr2, i13, i12, bArr);
            }
            i14 += p10;
        }
    }

    private static k2.a u(a0 a0Var, int i10) {
        a0Var.U(12);
        while (a0Var.f() < i10) {
            int f10 = a0Var.f();
            int p10 = a0Var.p();
            if (a0Var.p() == 1935766900) {
                if (p10 < 14) {
                    return null;
                }
                a0Var.U(5);
                int G = a0Var.G();
                if (G == 12 || G == 13) {
                    float f11 = G == 12 ? 240.0f : 120.0f;
                    a0Var.U(1);
                    return new k2.a(new q2.e(f11, a0Var.G()));
                }
                return null;
            }
            a0Var.T(f10 + p10);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0431 A[EDGE_INSN: B:211:0x0431->B:170:0x0431 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static f2.r v(f2.o r38, f2.a.C0141a r39, x1.x r40) {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.v(f2.o, f2.a$a, x1.x):f2.r");
    }

    private static d w(a0 a0Var, int i10, int i11, String str, w1.m mVar, boolean z10) {
        int i12;
        a0Var.T(12);
        int p10 = a0Var.p();
        d dVar = new d(p10);
        for (int i13 = 0; i13 < p10; i13++) {
            int f10 = a0Var.f();
            int p11 = a0Var.p();
            x1.o.a(p11 > 0, "childAtomSize must be positive");
            int p12 = a0Var.p();
            if (p12 == 1635148593 || p12 == 1635148595 || p12 == 1701733238 || p12 == 1831958048 || p12 == 1836070006 || p12 == 1752589105 || p12 == 1751479857 || p12 == 1932670515 || p12 == 1211250227 || p12 == 1987063864 || p12 == 1987063865 || p12 == 1635135537 || p12 == 1685479798 || p12 == 1685479729 || p12 == 1685481573 || p12 == 1685481521) {
                i12 = f10;
                D(a0Var, p12, i12, p11, i10, i11, mVar, dVar, i13);
            } else if (p12 == 1836069985 || p12 == 1701733217 || p12 == 1633889587 || p12 == 1700998451 || p12 == 1633889588 || p12 == 1835823201 || p12 == 1685353315 || p12 == 1685353317 || p12 == 1685353320 || p12 == 1685353324 || p12 == 1685353336 || p12 == 1935764850 || p12 == 1935767394 || p12 == 1819304813 || p12 == 1936684916 || p12 == 1953984371 || p12 == 778924082 || p12 == 778924083 || p12 == 1835557169 || p12 == 1835560241 || p12 == 1634492771 || p12 == 1634492791 || p12 == 1970037111 || p12 == 1332770163 || p12 == 1716281667) {
                i12 = f10;
                f(a0Var, p12, f10, p11, i10, str, z10, mVar, dVar, i13);
            } else {
                if (p12 == 1414810956 || p12 == 1954034535 || p12 == 2004251764 || p12 == 1937010800 || p12 == 1664495672) {
                    x(a0Var, p12, f10, p11, i10, str, dVar);
                } else if (p12 == 1835365492) {
                    o(a0Var, p12, f10, i10, dVar);
                } else if (p12 == 1667329389) {
                    dVar.f8625b = new n1.b().T(i10).g0("application/x-camera-motion").G();
                }
                i12 = f10;
            }
            a0Var.T(i12 + p11);
        }
        return dVar;
    }

    private static void x(a0 a0Var, int i10, int i11, int i12, int i13, String str, d dVar) {
        a0Var.T(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        com.google.common.collect.q qVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                a0Var.l(bArr, 0, i14);
                qVar = com.google.common.collect.q.A(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 != 1664495672) {
                throw new IllegalStateException();
            } else {
                dVar.f8627d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.f8625b = new n1.b().T(i13).g0(str2).X(str).k0(j10).V(qVar).G();
    }

    private static g y(a0 a0Var) {
        boolean z10;
        a0Var.T(8);
        int c10 = f2.a.c(a0Var.p());
        a0Var.U(c10 == 0 ? 8 : 16);
        int p10 = a0Var.p();
        a0Var.U(4);
        int f10 = a0Var.f();
        int i10 = c10 == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            } else if (a0Var.e()[f10 + i12] != -1) {
                z10 = false;
                break;
            } else {
                i12++;
            }
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            a0Var.U(i10);
        } else {
            long I = c10 == 0 ? a0Var.I() : a0Var.L();
            if (I != 0) {
                j10 = I;
            }
        }
        a0Var.U(16);
        int p11 = a0Var.p();
        int p12 = a0Var.p();
        a0Var.U(4);
        int p13 = a0Var.p();
        int p14 = a0Var.p();
        if (p11 == 0 && p12 == 65536 && p13 == -65536 && p14 == 0) {
            i11 = 90;
        } else if (p11 == 0 && p12 == -65536 && p13 == 65536 && p14 == 0) {
            i11 = 270;
        } else if (p11 == -65536 && p12 == 0 && p13 == 0 && p14 == -65536) {
            i11 = 180;
        }
        return new g(p10, j10, i11);
    }

    private static o z(a.C0141a c0141a, a.b bVar, long j10, w1.m mVar, boolean z10, boolean z11) {
        a.b bVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        a.C0141a f10;
        Pair<long[], long[]> h10;
        a.C0141a c0141a2 = (a.C0141a) p3.a.e(c0141a.f(1835297121));
        int d10 = d(k(((a.b) p3.a.e(c0141a2.g(1751411826))).f8609b));
        if (d10 == -1) {
            return null;
        }
        g y10 = y(((a.b) p3.a.e(c0141a.g(1953196132))).f8609b);
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = y10.f8637b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long p10 = p(bVar2.f8609b);
        long N0 = j11 != -9223372036854775807L ? n0.N0(j11, 1000000L, p10) : -9223372036854775807L;
        Pair<Long, String> m10 = m(((a.b) p3.a.e(c0141a2.g(1835296868))).f8609b);
        a.b g10 = ((a.C0141a) p3.a.e(((a.C0141a) p3.a.e(c0141a2.f(1835626086))).f(1937007212))).g(1937011556);
        if (g10 != null) {
            d w10 = w(g10.f8609b, y10.f8636a, y10.f8638c, (String) m10.second, mVar, z11);
            if (z10 || (f10 = c0141a.f(1701082227)) == null || (h10 = h(f10)) == null) {
                jArr = null;
                jArr2 = null;
            } else {
                jArr2 = (long[]) h10.second;
                jArr = (long[]) h10.first;
            }
            if (w10.f8625b == null) {
                return null;
            }
            return new o(y10.f8636a, d10, ((Long) m10.first).longValue(), p10, N0, w10.f8625b, w10.f8627d, w10.f8624a, w10.f8626c, jArr, jArr2);
        }
        throw u2.a("Malformed sample table (stbl) missing sample description (stsd)", null);
    }
}
