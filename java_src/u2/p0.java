package u2;

import java.util.Arrays;
import java.util.Random;
/* loaded from: classes.dex */
public interface p0 {

    /* loaded from: classes.dex */
    public static class a implements p0 {

        /* renamed from: a  reason: collision with root package name */
        private final Random f18944a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f18945b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f18946c;

        public a(int i10) {
            this(i10, new Random());
        }

        private a(int i10, Random random) {
            this(i(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f18945b = iArr;
            this.f18944a = random;
            this.f18946c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f18946c[iArr[i10]] = i10;
            }
        }

        private static int[] i(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // u2.p0
        public int a() {
            return this.f18945b.length;
        }

        @Override // u2.p0
        public p0 b(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f18945b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f18945b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f18944a.nextLong()));
                }
                if (iArr2[i13] < i10 || iArr2[i13] >= i11) {
                    iArr[i13 - i14] = iArr2[i13] >= i10 ? iArr2[i13] - i12 : iArr2[i13];
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // u2.p0
        public int c(int i10) {
            int i11 = this.f18946c[i10] + 1;
            int[] iArr = this.f18945b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // u2.p0
        public p0 d(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f18944a.nextInt(this.f18945b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f18944a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f18945b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f18945b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f18944a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    iArr3[i12] = iArr4[i16];
                    if (iArr3[i12] >= i10) {
                        iArr3[i12] = iArr3[i12] + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // u2.p0
        public int e() {
            int[] iArr = this.f18945b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // u2.p0
        public int f(int i10) {
            int i11 = this.f18946c[i10] - 1;
            if (i11 >= 0) {
                return this.f18945b[i11];
            }
            return -1;
        }

        @Override // u2.p0
        public int g() {
            int[] iArr = this.f18945b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // u2.p0
        public p0 h() {
            return new a(0, new Random(this.f18944a.nextLong()));
        }
    }

    int a();

    p0 b(int i10, int i11);

    int c(int i10);

    p0 d(int i10, int i11);

    int e();

    int f(int i10);

    int g();

    p0 h();
}
