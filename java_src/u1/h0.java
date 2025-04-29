package u1;
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f18601a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f18602b = {44100, 48000, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f18603c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f18604d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f18605e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f18606f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f18607g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f18608a;

        /* renamed from: b  reason: collision with root package name */
        public String f18609b;

        /* renamed from: c  reason: collision with root package name */
        public int f18610c;

        /* renamed from: d  reason: collision with root package name */
        public int f18611d;

        /* renamed from: e  reason: collision with root package name */
        public int f18612e;

        /* renamed from: f  reason: collision with root package name */
        public int f18613f;

        /* renamed from: g  reason: collision with root package name */
        public int f18614g;

        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(int r9) {
            /*
                r8 = this;
                boolean r0 = u1.h0.a(r9)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                int r0 = r9 >>> 19
                r2 = 3
                r0 = r0 & r2
                r3 = 1
                if (r0 != r3) goto L10
                return r1
            L10:
                int r4 = r9 >>> 17
                r4 = r4 & r2
                if (r4 != 0) goto L16
                return r1
            L16:
                int r5 = r9 >>> 12
                r6 = 15
                r5 = r5 & r6
                if (r5 == 0) goto Lac
                if (r5 != r6) goto L21
                goto Lac
            L21:
                int r6 = r9 >>> 10
                r6 = r6 & r2
                if (r6 != r2) goto L27
                return r1
            L27:
                r8.f18608a = r0
                java.lang.String[] r1 = u1.h0.b()
                int r7 = 3 - r4
                r1 = r1[r7]
                r8.f18609b = r1
                int[] r1 = u1.h0.c()
                r1 = r1[r6]
                r8.f18611d = r1
                r6 = 2
                if (r0 != r6) goto L42
                int r1 = r1 / r6
            L3f:
                r8.f18611d = r1
                goto L47
            L42:
                if (r0 != 0) goto L47
                int r1 = r1 / 4
                goto L3f
            L47:
                int r1 = r9 >>> 9
                r1 = r1 & r3
                int r7 = u1.h0.d(r0, r4)
                r8.f18614g = r7
                if (r4 != r2) goto L70
                if (r0 != r2) goto L5c
                int[] r0 = u1.h0.e()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L63
            L5c:
                int[] r0 = u1.h0.f()
                int r5 = r5 - r3
                r0 = r0[r5]
            L63:
                r8.f18613f = r0
                int r0 = r0 * 12
                int r4 = r8.f18611d
                int r0 = r0 / r4
                int r0 = r0 + r1
                int r0 = r0 * 4
            L6d:
                r8.f18610c = r0
                goto La3
            L70:
                r7 = 144(0x90, float:2.02E-43)
                if (r0 != r2) goto L8e
                if (r4 != r6) goto L7e
                int[] r0 = u1.h0.g()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L85
            L7e:
                int[] r0 = u1.h0.h()
                int r5 = r5 - r3
                r0 = r0[r5]
            L85:
                r8.f18613f = r0
                int r0 = r0 * 144
                int r4 = r8.f18611d
                int r0 = r0 / r4
                int r0 = r0 + r1
                goto L6d
            L8e:
                int[] r0 = u1.h0.i()
                int r5 = r5 - r3
                r0 = r0[r5]
                r8.f18613f = r0
                if (r4 != r3) goto L9b
                r7 = 72
            L9b:
                int r7 = r7 * r0
                int r0 = r8.f18611d
                int r7 = r7 / r0
                int r7 = r7 + r1
                r8.f18610c = r7
            La3:
                int r9 = r9 >> 6
                r9 = r9 & r2
                if (r9 != r2) goto La9
                r6 = 1
            La9:
                r8.f18612e = r6
                return r3
            Lac:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.h0.a.a(int):boolean");
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f18602b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f18603c[i13 - 1] : f18604d[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f18605e[i13 - 1] : f18606f[i13 - 1] : f18607g[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        } else if (i11 != 2) {
            if (i11 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
