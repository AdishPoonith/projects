package u1;

import java.nio.ByteBuffer;
import s1.n1;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f18463a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f18464b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f18465c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f18466d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f18467e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f18468f = {69, 87, 104, f.j.K0, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: u1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0267b {

        /* renamed from: a  reason: collision with root package name */
        public final String f18469a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18470b;

        /* renamed from: c  reason: collision with root package name */
        public final int f18471c;

        /* renamed from: d  reason: collision with root package name */
        public final int f18472d;

        /* renamed from: e  reason: collision with root package name */
        public final int f18473e;

        /* renamed from: f  reason: collision with root package name */
        public final int f18474f;

        /* renamed from: g  reason: collision with root package name */
        public final int f18475g;

        private C0267b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f18469a = str;
            this.f18470b = i10;
            this.f18472d = i11;
            this.f18471c = i12;
            this.f18473e = i13;
            this.f18474f = i14;
            this.f18475g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((p3.n0.I(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0) {
            int[] iArr = f18464b;
            if (i10 >= iArr.length || i11 < 0) {
                return -1;
            }
            int[] iArr2 = f18468f;
            if (i12 >= iArr2.length) {
                return -1;
            }
            int i13 = iArr[i10];
            if (i13 == 44100) {
                return (iArr2[i12] + (i11 % 2)) * 2;
            }
            int i14 = f18467e[i12];
            return i13 == 32000 ? i14 * 6 : i14 * 4;
        }
        return -1;
    }

    public static n1 d(p3.a0 a0Var, String str, String str2, w1.m mVar) {
        p3.z zVar = new p3.z();
        zVar.m(a0Var);
        int i10 = f18464b[zVar.h(2)];
        zVar.r(8);
        int i11 = f18466d[zVar.h(3)];
        if (zVar.h(1) != 0) {
            i11++;
        }
        int i12 = f18467e[zVar.h(5)] * 1000;
        zVar.c();
        a0Var.T(zVar.d());
        return new n1.b().U(str).g0("audio/ac3").J(i11).h0(i10).O(mVar).X(str2).I(i12).b0(i12).G();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f18463a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0267b f(p3.z zVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int e10 = zVar.e();
        zVar.r(40);
        boolean z10 = zVar.h(5) > 10;
        zVar.p(e10);
        int i22 = -1;
        if (z10) {
            zVar.r(16);
            int h10 = zVar.h(2);
            if (h10 == 0) {
                i22 = 0;
            } else if (h10 == 1) {
                i22 = 1;
            } else if (h10 == 2) {
                i22 = 2;
            }
            zVar.r(3);
            int h11 = (zVar.h(11) + 1) * 2;
            int h12 = zVar.h(2);
            if (h12 == 3) {
                i17 = f18465c[zVar.h(2)];
                i16 = 3;
                i18 = 6;
            } else {
                int h13 = zVar.h(2);
                int i23 = f18463a[h13];
                i16 = h13;
                i17 = f18464b[h12];
                i18 = i23;
            }
            int i24 = i18 * 256;
            int a10 = a(h11, i17, i18);
            int h14 = zVar.h(3);
            boolean g10 = zVar.g();
            int i25 = f18466d[h14] + (g10 ? 1 : 0);
            zVar.r(10);
            if (zVar.g()) {
                zVar.r(8);
            }
            if (h14 == 0) {
                zVar.r(5);
                if (zVar.g()) {
                    zVar.r(8);
                }
            }
            if (i22 == 1 && zVar.g()) {
                zVar.r(16);
            }
            if (zVar.g()) {
                if (h14 > 2) {
                    zVar.r(2);
                }
                if ((h14 & 1) == 0 || h14 <= 2) {
                    i20 = 6;
                } else {
                    i20 = 6;
                    zVar.r(6);
                }
                if ((h14 & 4) != 0) {
                    zVar.r(i20);
                }
                if (g10 && zVar.g()) {
                    zVar.r(5);
                }
                if (i22 == 0) {
                    if (zVar.g()) {
                        i21 = 6;
                        zVar.r(6);
                    } else {
                        i21 = 6;
                    }
                    if (h14 == 0 && zVar.g()) {
                        zVar.r(i21);
                    }
                    if (zVar.g()) {
                        zVar.r(i21);
                    }
                    int h15 = zVar.h(2);
                    if (h15 == 1) {
                        zVar.r(5);
                    } else if (h15 == 2) {
                        zVar.r(12);
                    } else if (h15 == 3) {
                        int h16 = zVar.h(5);
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                            }
                        }
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(7);
                                if (zVar.g()) {
                                    zVar.r(8);
                                }
                            }
                        }
                        zVar.r((h16 + 2) * 8);
                        zVar.c();
                    }
                    if (h14 < 2) {
                        if (zVar.g()) {
                            zVar.r(14);
                        }
                        if (h14 == 0 && zVar.g()) {
                            zVar.r(14);
                        }
                    }
                    if (zVar.g()) {
                        if (i16 == 0) {
                            zVar.r(5);
                        } else {
                            for (int i26 = 0; i26 < i18; i26++) {
                                if (zVar.g()) {
                                    zVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zVar.g()) {
                zVar.r(5);
                if (h14 == 2) {
                    zVar.r(4);
                }
                if (h14 >= 6) {
                    zVar.r(2);
                }
                if (zVar.g()) {
                    zVar.r(8);
                }
                if (h14 == 0 && zVar.g()) {
                    zVar.r(8);
                }
                if (h12 < 3) {
                    zVar.q();
                }
            }
            if (i22 == 0 && i16 != 3) {
                zVar.q();
            }
            if (i22 == 2 && (i16 == 3 || zVar.g())) {
                i19 = 6;
                zVar.r(6);
            } else {
                i19 = 6;
            }
            str = (zVar.g() && zVar.h(i19) == 1 && zVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i14 = i22;
            i15 = i24;
            i11 = h11;
            i12 = i17;
            i10 = a10;
            i13 = i25;
        } else {
            zVar.r(32);
            int h17 = zVar.h(2);
            String str2 = h17 == 3 ? null : "audio/ac3";
            int h18 = zVar.h(6);
            int i27 = f18467e[h18 / 2] * 1000;
            int c10 = c(h17, h18);
            zVar.r(8);
            int h19 = zVar.h(3);
            if ((h19 & 1) != 0 && h19 != 1) {
                zVar.r(2);
            }
            if ((h19 & 4) != 0) {
                zVar.r(2);
            }
            if (h19 == 2) {
                zVar.r(2);
            }
            int[] iArr = f18464b;
            str = str2;
            i10 = i27;
            i11 = c10;
            i12 = h17 < iArr.length ? iArr[h17] : -1;
            i13 = f18466d[h19] + (zVar.g() ? 1 : 0);
            i14 = -1;
            i15 = 1536;
        }
        return new C0267b(str, i14, i13, i12, i11, i15, i10);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return c((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static n1 h(p3.a0 a0Var, String str, String str2, w1.m mVar) {
        String str3;
        p3.z zVar = new p3.z();
        zVar.m(a0Var);
        int h10 = zVar.h(13) * 1000;
        zVar.r(3);
        int i10 = f18464b[zVar.h(2)];
        zVar.r(10);
        int i11 = f18466d[zVar.h(3)];
        if (zVar.h(1) != 0) {
            i11++;
        }
        zVar.r(3);
        int h11 = zVar.h(4);
        zVar.r(1);
        if (h11 > 0) {
            zVar.s(6);
            if (zVar.h(1) != 0) {
                i11 += 2;
            }
            zVar.r(1);
        }
        if (zVar.b() > 7) {
            zVar.r(7);
            if (zVar.h(1) != 0) {
                str3 = "audio/eac3-joc";
                zVar.c();
                a0Var.T(zVar.d());
                return new n1.b().U(str).g0(str3).J(i11).h0(i10).O(mVar).X(str2).b0(h10).G();
            }
        }
        str3 = "audio/eac3";
        zVar.c();
        a0Var.T(zVar.d());
        return new n1.b().U(str).g0(str3).J(i11).h0(i10).O(mVar).X(str2).b0(h10).G();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }
}
