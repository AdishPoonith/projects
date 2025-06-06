package u1;

import s1.u2;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f18456a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f18457b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f18458a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18459b;

        /* renamed from: c  reason: collision with root package name */
        public final String f18460c;

        private b(int i10, int i11, String str) {
            this.f18458a = i10;
            this.f18459b = i11;
            this.f18460c = str;
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            int[] iArr = f18456a;
            if (i13 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i13]) {
                i14 = i13;
            }
            i13++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f18457b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 == -1 || i15 == -1) {
            throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
        }
        return b(2, i14, i15);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & f.j.J0))};
    }

    private static int c(p3.z zVar) {
        int h10 = zVar.h(5);
        return h10 == 31 ? zVar.h(6) + 32 : h10;
    }

    private static int d(p3.z zVar) {
        int h10 = zVar.h(4);
        if (h10 == 15) {
            if (zVar.b() >= 24) {
                return zVar.h(24);
            }
            throw u2.a("AAC header insufficient data", null);
        } else if (h10 < 13) {
            return f18456a[h10];
        } else {
            throw u2.a("AAC header wrong Sampling Frequency Index", null);
        }
    }

    public static b e(p3.z zVar, boolean z10) {
        int c10 = c(zVar);
        int d10 = d(zVar);
        int h10 = zVar.h(4);
        String str = "mp4a.40." + c10;
        if (c10 == 5 || c10 == 29) {
            d10 = d(zVar);
            c10 = c(zVar);
            if (c10 == 22) {
                h10 = zVar.h(4);
            }
        }
        if (z10) {
            if (c10 != 1 && c10 != 2 && c10 != 3 && c10 != 4 && c10 != 6 && c10 != 7 && c10 != 17) {
                switch (c10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case f.j.f8330t3 /* 23 */:
                        break;
                    default:
                        throw u2.d("Unsupported audio object type: " + c10);
                }
            }
            g(zVar, c10, h10);
            switch (c10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case f.j.f8330t3 /* 23 */:
                    int h11 = zVar.h(2);
                    if (h11 == 2 || h11 == 3) {
                        throw u2.d("Unsupported epConfig: " + h11);
                    }
            }
        }
        int i10 = f18457b[h10];
        if (i10 != -1) {
            return new b(d10, i10, str);
        }
        throw u2.a(null, null);
    }

    public static b f(byte[] bArr) {
        return e(new p3.z(bArr), false);
    }

    private static void g(p3.z zVar, int i10, int i11) {
        if (zVar.g()) {
            p3.r.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (zVar.g()) {
            zVar.r(14);
        }
        boolean g10 = zVar.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            zVar.r(3);
        }
        if (g10) {
            if (i10 == 22) {
                zVar.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                zVar.r(3);
            }
            zVar.r(1);
        }
    }
}
