package u1;

import java.nio.ShortBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f18635a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18636b;

    /* renamed from: c  reason: collision with root package name */
    private final float f18637c;

    /* renamed from: d  reason: collision with root package name */
    private final float f18638d;

    /* renamed from: e  reason: collision with root package name */
    private final float f18639e;

    /* renamed from: f  reason: collision with root package name */
    private final int f18640f;

    /* renamed from: g  reason: collision with root package name */
    private final int f18641g;

    /* renamed from: h  reason: collision with root package name */
    private final int f18642h;

    /* renamed from: i  reason: collision with root package name */
    private final short[] f18643i;

    /* renamed from: j  reason: collision with root package name */
    private short[] f18644j;

    /* renamed from: k  reason: collision with root package name */
    private int f18645k;

    /* renamed from: l  reason: collision with root package name */
    private short[] f18646l;

    /* renamed from: m  reason: collision with root package name */
    private int f18647m;

    /* renamed from: n  reason: collision with root package name */
    private short[] f18648n;

    /* renamed from: o  reason: collision with root package name */
    private int f18649o;

    /* renamed from: p  reason: collision with root package name */
    private int f18650p;

    /* renamed from: q  reason: collision with root package name */
    private int f18651q;

    /* renamed from: r  reason: collision with root package name */
    private int f18652r;

    /* renamed from: s  reason: collision with root package name */
    private int f18653s;

    /* renamed from: t  reason: collision with root package name */
    private int f18654t;

    /* renamed from: u  reason: collision with root package name */
    private int f18655u;

    /* renamed from: v  reason: collision with root package name */
    private int f18656v;

    public l0(int i10, int i11, float f10, float f11, int i12) {
        this.f18635a = i10;
        this.f18636b = i11;
        this.f18637c = f10;
        this.f18638d = f11;
        this.f18639e = i10 / i12;
        this.f18640f = i10 / 400;
        int i13 = i10 / 65;
        this.f18641g = i13;
        int i14 = i13 * 2;
        this.f18642h = i14;
        this.f18643i = new short[i14];
        this.f18644j = new short[i14 * i11];
        this.f18646l = new short[i14 * i11];
        this.f18648n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f18647m == i10) {
            return;
        }
        int i13 = this.f18635a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f18649o;
            if (i15 >= i16 - 1) {
                u(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f18650p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f18651q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f18646l = f(this.f18646l, this.f18647m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f18636b;
                    if (i18 < i19) {
                        this.f18646l[(this.f18647m * i19) + i18] = n(this.f18648n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f18651q++;
                this.f18647m++;
            }
            int i20 = i11 + 1;
            this.f18650p = i20;
            if (i20 == i13) {
                this.f18650p = 0;
                p3.a.f(i12 == i14);
                this.f18651q = 0;
            }
            i15++;
        }
    }

    private void b(float f10) {
        int w10;
        int i10 = this.f18645k;
        if (i10 < this.f18642h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f18652r > 0) {
                w10 = c(i11);
            } else {
                int g10 = g(this.f18644j, i11);
                int i12 = (f10 > 1.0d ? 1 : (f10 == 1.0d ? 0 : -1));
                short[] sArr = this.f18644j;
                w10 = i12 > 0 ? g10 + w(sArr, i11, f10, g10) : m(sArr, i11, f10, g10);
            }
            i11 += w10;
        } while (this.f18642h + i11 <= i10);
        v(i11);
    }

    private int c(int i10) {
        int min = Math.min(this.f18642h, this.f18652r);
        d(this.f18644j, i10, min);
        this.f18652r -= min;
        return min;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f18646l, this.f18647m, i11);
        this.f18646l = f10;
        int i12 = this.f18636b;
        System.arraycopy(sArr, i10 * i12, f10, this.f18647m * i12, i12 * i11);
        this.f18647m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f18642h / i11;
        int i13 = this.f18636b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f18643i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f18636b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f18635a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f18636b == 1 && i13 == 1) {
            i11 = h(sArr, i10, this.f18640f, this.f18641g);
        } else {
            e(sArr, i10, i13);
            int h10 = h(this.f18643i, 0, this.f18640f / i13, this.f18641g / i13);
            if (i13 != 1) {
                int i14 = h10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f18640f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f18641g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f18636b == 1) {
                    i11 = h(sArr, i10, i16, i17);
                } else {
                    e(sArr, i10, 1);
                    i11 = h(this.f18643i, 0, i16, i17);
                }
            } else {
                i11 = h10;
            }
        }
        int i20 = q(this.f18655u, this.f18656v) ? this.f18653s : i11;
        this.f18654t = this.f18655u;
        this.f18653s = i11;
        return i20;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f18636b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f18655u = i14 / i16;
        this.f18656v = i17 / i15;
        return i16;
    }

    private int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f18652r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] f11 = f(this.f18646l, this.f18647m, i13);
        this.f18646l = f11;
        int i14 = this.f18636b;
        System.arraycopy(sArr, i10 * i14, f11, this.f18647m * i14, i14 * i11);
        p(i12, this.f18636b, this.f18646l, this.f18647m + i11, sArr, i10 + i11, sArr, i10);
        this.f18647m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f18636b];
        int i13 = this.f18651q * i11;
        int i14 = this.f18650p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void o(int i10) {
        int i11 = this.f18647m - i10;
        short[] f10 = f(this.f18648n, this.f18649o, i11);
        this.f18648n = f10;
        short[] sArr = this.f18646l;
        int i12 = this.f18636b;
        System.arraycopy(sArr, i10 * i12, f10, this.f18649o * i12, i12 * i11);
        this.f18647m = i10;
        this.f18649o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f18653s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f18654t * 3;
    }

    private void r() {
        int i10 = this.f18647m;
        float f10 = this.f18637c;
        float f11 = this.f18638d;
        float f12 = f10 / f11;
        float f13 = this.f18639e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f18644j, 0, this.f18645k);
            this.f18645k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f18648n;
        int i11 = this.f18636b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f18649o - i10) * i11);
        this.f18649o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f18645k - i10;
        short[] sArr = this.f18644j;
        int i12 = this.f18636b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f18645k = i11;
    }

    private int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f18652r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] f11 = f(this.f18646l, this.f18647m, i12);
        this.f18646l = f11;
        p(i12, this.f18636b, f11, this.f18647m, sArr, i10, sArr, i10 + i11);
        this.f18647m += i12;
        return i12;
    }

    public void i() {
        this.f18645k = 0;
        this.f18647m = 0;
        this.f18649o = 0;
        this.f18650p = 0;
        this.f18651q = 0;
        this.f18652r = 0;
        this.f18653s = 0;
        this.f18654t = 0;
        this.f18655u = 0;
        this.f18656v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f18636b, this.f18647m);
        shortBuffer.put(this.f18646l, 0, this.f18636b * min);
        int i10 = this.f18647m - min;
        this.f18647m = i10;
        short[] sArr = this.f18646l;
        int i11 = this.f18636b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f18647m * this.f18636b * 2;
    }

    public int l() {
        return this.f18645k * this.f18636b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f18645k;
        float f10 = this.f18637c;
        float f11 = this.f18638d;
        int i12 = this.f18647m + ((int) ((((i11 / (f10 / f11)) + this.f18649o) / (this.f18639e * f11)) + 0.5f));
        this.f18644j = f(this.f18644j, i11, (this.f18642h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f18642h;
            int i14 = this.f18636b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f18644j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f18645k += i10 * 2;
        r();
        if (this.f18647m > i12) {
            this.f18647m = i12;
        }
        this.f18645k = 0;
        this.f18652r = 0;
        this.f18649o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f18636b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f18644j, this.f18645k, i11);
        this.f18644j = f10;
        shortBuffer.get(f10, this.f18645k * this.f18636b, ((i10 * i11) * 2) / 2);
        this.f18645k += i11;
        r();
    }
}
