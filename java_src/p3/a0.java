package p3;

import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f15328d = {'\r', '\n'};

    /* renamed from: e  reason: collision with root package name */
    private static final char[] f15329e = {'\n'};

    /* renamed from: f  reason: collision with root package name */
    private static final com.google.common.collect.s<Charset> f15330f = com.google.common.collect.s.B(b5.d.f2948a, b5.d.f2950c, b5.d.f2953f, b5.d.f2951d, b5.d.f2952e);

    /* renamed from: a  reason: collision with root package name */
    private byte[] f15331a;

    /* renamed from: b  reason: collision with root package name */
    private int f15332b;

    /* renamed from: c  reason: collision with root package name */
    private int f15333c;

    public a0() {
        this.f15331a = n0.f15402f;
    }

    public a0(int i10) {
        this.f15331a = new byte[i10];
        this.f15333c = i10;
    }

    public a0(byte[] bArr) {
        this.f15331a = bArr;
        this.f15333c = bArr.length;
    }

    public a0(byte[] bArr, int i10) {
        this.f15331a = bArr;
        this.f15333c = i10;
    }

    private void V(Charset charset) {
        if (m(charset, f15328d) == '\r') {
            m(charset, f15329e);
        }
    }

    private int d(Charset charset) {
        int i10;
        if (charset.equals(b5.d.f2950c) || charset.equals(b5.d.f2948a)) {
            i10 = 1;
        } else if (!charset.equals(b5.d.f2953f) && !charset.equals(b5.d.f2952e) && !charset.equals(b5.d.f2951d)) {
            throw new IllegalArgumentException("Unsupported charset: " + charset);
        } else {
            i10 = 2;
        }
        int i11 = this.f15332b;
        while (true) {
            int i12 = this.f15333c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((charset.equals(b5.d.f2950c) || charset.equals(b5.d.f2948a)) && n0.u0(this.f15331a[i11])) {
                return i11;
            }
            if (charset.equals(b5.d.f2953f) || charset.equals(b5.d.f2951d)) {
                byte[] bArr = this.f15331a;
                if (bArr[i11] == 0 && n0.u0(bArr[i11 + 1])) {
                    return i11;
                }
            }
            if (charset.equals(b5.d.f2952e)) {
                byte[] bArr2 = this.f15331a;
                if (bArr2[i11 + 1] == 0 && n0.u0(bArr2[i11])) {
                    return i11;
                }
            }
            i11 += i10;
        }
    }

    private int i(Charset charset) {
        byte a10;
        char c10;
        int i10 = 2;
        if ((charset.equals(b5.d.f2950c) || charset.equals(b5.d.f2948a)) && a() >= 1) {
            a10 = (byte) e5.b.a(e5.h.a(this.f15331a[this.f15332b]));
            i10 = 1;
        } else {
            if ((charset.equals(b5.d.f2953f) || charset.equals(b5.d.f2951d)) && a() >= 2) {
                byte[] bArr = this.f15331a;
                int i11 = this.f15332b;
                c10 = e5.b.c(bArr[i11], bArr[i11 + 1]);
            } else if (!charset.equals(b5.d.f2952e) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.f15331a;
                int i12 = this.f15332b;
                c10 = e5.b.c(bArr2[i12 + 1], bArr2[i12]);
            }
            a10 = (byte) c10;
        }
        return (e5.b.a(a10) << 16) + i10;
    }

    private char m(Charset charset, char[] cArr) {
        int i10 = i(charset);
        if (i10 != 0) {
            char c10 = (char) (i10 >> 16);
            if (e5.b.b(cArr, c10)) {
                this.f15332b += i10 & 65535;
                return c10;
            }
            return (char) 0;
        }
        return (char) 0;
    }

    public String A() {
        return n((char) 0);
    }

    public String B(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f15332b;
        int i12 = (i11 + i10) - 1;
        String E = n0.E(this.f15331a, i11, (i12 >= this.f15333c || this.f15331a[i12] != 0) ? i10 : i10 - 1);
        this.f15332b += i10;
        return E;
    }

    public short C() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        this.f15332b = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public String D(int i10) {
        return E(i10, b5.d.f2950c);
    }

    public String E(int i10, Charset charset) {
        String str = new String(this.f15331a, this.f15332b, i10, charset);
        this.f15332b += i10;
        return str;
    }

    public int F() {
        return (G() << 21) | (G() << 14) | (G() << 7) | G();
    }

    public int G() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        this.f15332b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int H() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        int i12 = i11 + 1;
        this.f15332b = i12;
        int i13 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f15332b = i12 + 2;
        return i13;
    }

    public long I() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        int i12 = i11 + 1;
        this.f15332b = i12;
        int i13 = i12 + 1;
        this.f15332b = i13;
        this.f15332b = i13 + 1;
        return ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
    }

    public int J() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        int i12 = i11 + 1;
        this.f15332b = i12;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f15332b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int K() {
        int p10 = p();
        if (p10 >= 0) {
            return p10;
        }
        throw new IllegalStateException("Top bit not zero: " + p10);
    }

    public long L() {
        long z10 = z();
        if (z10 >= 0) {
            return z10;
        }
        throw new IllegalStateException("Top bit not zero: " + z10);
    }

    public int M() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        this.f15332b = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long N() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j10 = this.f15331a[this.f15332b];
        int i13 = 7;
        while (true) {
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j10) != 0) {
                i13--;
            } else if (i13 < 6) {
                j10 &= i12 - 1;
                i11 = 7 - i13;
            } else if (i13 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f15331a[this.f15332b + i10] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (b10 & 63);
        }
        this.f15332b += i11;
        return j10;
    }

    public Charset O() {
        if (a() >= 3) {
            byte[] bArr = this.f15331a;
            int i10 = this.f15332b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f15332b = i10 + 3;
                return b5.d.f2950c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f15331a;
            int i11 = this.f15332b;
            if (bArr2[i11] == -2 && bArr2[i11 + 1] == -1) {
                this.f15332b = i11 + 2;
                return b5.d.f2951d;
            } else if (bArr2[i11] == -1 && bArr2[i11 + 1] == -2) {
                this.f15332b = i11 + 2;
                return b5.d.f2952e;
            } else {
                return null;
            }
        }
        return null;
    }

    public void P(int i10) {
        R(b() < i10 ? new byte[i10] : this.f15331a, i10);
    }

    public void Q(byte[] bArr) {
        R(bArr, bArr.length);
    }

    public void R(byte[] bArr, int i10) {
        this.f15331a = bArr;
        this.f15333c = i10;
        this.f15332b = 0;
    }

    public void S(int i10) {
        a.a(i10 >= 0 && i10 <= this.f15331a.length);
        this.f15333c = i10;
    }

    public void T(int i10) {
        a.a(i10 >= 0 && i10 <= this.f15333c);
        this.f15332b = i10;
    }

    public void U(int i10) {
        T(this.f15332b + i10);
    }

    public int a() {
        return this.f15333c - this.f15332b;
    }

    public int b() {
        return this.f15331a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f15331a = Arrays.copyOf(this.f15331a, i10);
        }
    }

    public byte[] e() {
        return this.f15331a;
    }

    public int f() {
        return this.f15332b;
    }

    public int g() {
        return this.f15333c;
    }

    public char h(Charset charset) {
        boolean contains = f15330f.contains(charset);
        a.b(contains, "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f15331a[this.f15332b] & 255;
    }

    public void k(z zVar, int i10) {
        l(zVar.f15486a, 0, i10);
        zVar.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f15331a, this.f15332b, bArr, i10, i11);
        this.f15332b += i11;
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f15332b;
        while (i10 < this.f15333c && this.f15331a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f15331a;
        int i11 = this.f15332b;
        String E = n0.E(bArr, i11, i10 - i11);
        this.f15332b = i10;
        if (i10 < this.f15333c) {
            this.f15332b = i10 + 1;
        }
        return E;
    }

    public double o() {
        return Double.longBitsToDouble(z());
    }

    public int p() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        int i12 = i11 + 1;
        this.f15332b = i12;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        this.f15332b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f15332b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public int q() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        int i12 = i11 + 1;
        this.f15332b = i12;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f15332b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public String r() {
        return s(b5.d.f2950c);
    }

    public String s(Charset charset) {
        boolean contains = f15330f.contains(charset);
        a.b(contains, "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(b5.d.f2948a)) {
            O();
        }
        String E = E(d(charset) - this.f15332b, charset);
        if (this.f15332b == this.f15333c) {
            return E;
        }
        V(charset);
        return E;
    }

    public int t() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        int i12 = i11 + 1;
        this.f15332b = i12;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        this.f15332b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f15332b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public long u() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        int i12 = i11 + 1;
        this.f15332b = i12;
        int i13 = i12 + 1;
        this.f15332b = i13;
        int i14 = i13 + 1;
        this.f15332b = i14;
        int i15 = i14 + 1;
        this.f15332b = i15;
        int i16 = i15 + 1;
        this.f15332b = i16;
        int i17 = i16 + 1;
        this.f15332b = i17;
        this.f15332b = i17 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40) | ((bArr[i16] & 255) << 48) | ((bArr[i17] & 255) << 56);
    }

    public short v() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        this.f15332b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long w() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        int i12 = i11 + 1;
        this.f15332b = i12;
        int i13 = i12 + 1;
        this.f15332b = i13;
        this.f15332b = i13 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public int x() {
        int t10 = t();
        if (t10 >= 0) {
            return t10;
        }
        throw new IllegalStateException("Top bit not zero: " + t10);
    }

    public int y() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        this.f15332b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public long z() {
        byte[] bArr = this.f15331a;
        int i10 = this.f15332b;
        int i11 = i10 + 1;
        this.f15332b = i11;
        int i12 = i11 + 1;
        this.f15332b = i12;
        int i13 = i12 + 1;
        this.f15332b = i13;
        int i14 = i13 + 1;
        this.f15332b = i14;
        int i15 = i14 + 1;
        this.f15332b = i15;
        int i16 = i15 + 1;
        this.f15332b = i16;
        int i17 = i16 + 1;
        this.f15332b = i17;
        this.f15332b = i17 + 1;
        return ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40) | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24) | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8) | (bArr[i17] & 255);
    }
}
