package c5;

import b5.n;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final a f3418a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b  reason: collision with root package name */
    private static final a f3419b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c  reason: collision with root package name */
    private static final a f3420c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d  reason: collision with root package name */
    private static final a f3421d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e  reason: collision with root package name */
    private static final a f3422e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0077a {

        /* renamed from: a  reason: collision with root package name */
        private final String f3423a;

        /* renamed from: b  reason: collision with root package name */
        private final char[] f3424b;

        /* renamed from: c  reason: collision with root package name */
        final int f3425c;

        /* renamed from: d  reason: collision with root package name */
        final int f3426d;

        /* renamed from: e  reason: collision with root package name */
        final int f3427e;

        /* renamed from: f  reason: collision with root package name */
        final int f3428f;

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f3429g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean[] f3430h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f3431i;

        C0077a(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        private C0077a(String str, char[] cArr, byte[] bArr, boolean z10) {
            this.f3423a = (String) n.n(str);
            this.f3424b = (char[]) n.n(cArr);
            try {
                int d10 = d5.b.d(cArr.length, RoundingMode.UNNECESSARY);
                this.f3426d = d10;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(d10);
                int i10 = 1 << (3 - numberOfTrailingZeros);
                this.f3427e = i10;
                this.f3428f = d10 >> numberOfTrailingZeros;
                this.f3425c = cArr.length - 1;
                this.f3429g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f3428f; i11++) {
                    zArr[d5.b.a(i11 * 8, this.f3426d, RoundingMode.CEILING)] = true;
                }
                this.f3430h = zArr;
                this.f3431i = z10;
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
            }
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < cArr.length; i10++) {
                char c10 = cArr[i10];
                boolean z10 = true;
                n.f(c10 < 128, "Non-ASCII character: %s", c10);
                if (bArr[c10] != -1) {
                    z10 = false;
                }
                n.f(z10, "Duplicate character: %s", c10);
                bArr[c10] = (byte) i10;
            }
            return bArr;
        }

        int c(char c10) {
            if (c10 > 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            byte b10 = this.f3429g[c10];
            if (b10 == -1) {
                if (c10 <= ' ' || c10 == 127) {
                    throw new d("Unrecognized character: 0x" + Integer.toHexString(c10));
                }
                throw new d("Unrecognized character: " + c10);
            }
            return b10;
        }

        char d(int i10) {
            return this.f3424b[i10];
        }

        boolean e(int i10) {
            return this.f3430h[i10 % this.f3427e];
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0077a) {
                C0077a c0077a = (C0077a) obj;
                return this.f3431i == c0077a.f3431i && Arrays.equals(this.f3424b, c0077a.f3424b);
            }
            return false;
        }

        public boolean f(char c10) {
            byte[] bArr = this.f3429g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f3424b) + (this.f3431i ? 1231 : 1237);
        }

        public String toString() {
            return this.f3423a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends e {

        /* renamed from: h  reason: collision with root package name */
        final char[] f3432h;

        private b(C0077a c0077a) {
            super(c0077a, null);
            this.f3432h = new char[512];
            n.d(c0077a.f3424b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f3432h[i10] = c0077a.d(i10 >>> 4);
                this.f3432h[i10 | 256] = c0077a.d(i10 & 15);
            }
        }

        b(String str, String str2) {
            this(new C0077a(str, str2.toCharArray()));
        }

        @Override // c5.a.e, c5.a
        int d(byte[] bArr, CharSequence charSequence) {
            n.n(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new d("Invalid input length " + charSequence.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f3433f.c(charSequence.charAt(i10)) << 4) | this.f3433f.c(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // c5.a.e, c5.a
        void g(Appendable appendable, byte[] bArr, int i10, int i11) {
            n.n(appendable);
            n.s(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & 255;
                appendable.append(this.f3432h[i13]);
                appendable.append(this.f3432h[i13 | 256]);
            }
        }

        @Override // c5.a.e
        a n(C0077a c0077a, Character ch) {
            return new b(c0077a);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends e {
        private c(C0077a c0077a, Character ch) {
            super(c0077a, ch);
            n.d(c0077a.f3424b.length == 64);
        }

        c(String str, String str2, Character ch) {
            this(new C0077a(str, str2.toCharArray()), ch);
        }

        @Override // c5.a.e, c5.a
        int d(byte[] bArr, CharSequence charSequence) {
            n.n(bArr);
            CharSequence l10 = l(charSequence);
            if (!this.f3433f.e(l10.length())) {
                throw new d("Invalid input length " + l10.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < l10.length()) {
                int i12 = i10 + 1;
                int i13 = i12 + 1;
                int c10 = (this.f3433f.c(l10.charAt(i10)) << 18) | (this.f3433f.c(l10.charAt(i12)) << 12);
                int i14 = i11 + 1;
                bArr[i11] = (byte) (c10 >>> 16);
                if (i13 < l10.length()) {
                    int i15 = i13 + 1;
                    int c11 = c10 | (this.f3433f.c(l10.charAt(i13)) << 6);
                    i11 = i14 + 1;
                    bArr[i14] = (byte) ((c11 >>> 8) & 255);
                    if (i15 < l10.length()) {
                        i13 = i15 + 1;
                        i14 = i11 + 1;
                        bArr[i11] = (byte) ((c11 | this.f3433f.c(l10.charAt(i15))) & 255);
                    } else {
                        i10 = i15;
                    }
                }
                i11 = i14;
                i10 = i13;
            }
            return i11;
        }

        @Override // c5.a.e, c5.a
        void g(Appendable appendable, byte[] bArr, int i10, int i11) {
            n.n(appendable);
            int i12 = i10 + i11;
            n.s(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 1;
                int i14 = i13 + 1;
                int i15 = ((bArr[i10] & 255) << 16) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                appendable.append(this.f3433f.d(i15 >>> 18));
                appendable.append(this.f3433f.d((i15 >>> 12) & 63));
                appendable.append(this.f3433f.d((i15 >>> 6) & 63));
                appendable.append(this.f3433f.d(i15 & 63));
                i11 -= 3;
                i10 = i14 + 1;
            }
            if (i10 < i12) {
                m(appendable, bArr, i10, i12 - i10);
            }
        }

        @Override // c5.a.e
        a n(C0077a c0077a, Character ch) {
            return new c(c0077a, ch);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends IOException {
        d(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    static class e extends a {

        /* renamed from: f  reason: collision with root package name */
        final C0077a f3433f;

        /* renamed from: g  reason: collision with root package name */
        final Character f3434g;

        e(C0077a c0077a, Character ch) {
            this.f3433f = (C0077a) n.n(c0077a);
            n.j(ch == null || !c0077a.f(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f3434g = ch;
        }

        e(String str, String str2, Character ch) {
            this(new C0077a(str, str2.toCharArray()), ch);
        }

        @Override // c5.a
        int d(byte[] bArr, CharSequence charSequence) {
            C0077a c0077a;
            n.n(bArr);
            CharSequence l10 = l(charSequence);
            if (!this.f3433f.e(l10.length())) {
                throw new d("Invalid input length " + l10.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < l10.length()) {
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    c0077a = this.f3433f;
                    if (i12 >= c0077a.f3427e) {
                        break;
                    }
                    j10 <<= c0077a.f3426d;
                    if (i10 + i12 < l10.length()) {
                        j10 |= this.f3433f.c(l10.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = c0077a.f3428f;
                int i15 = (i14 * 8) - (i13 * c0077a.f3426d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((j10 >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f3433f.f3427e;
            }
            return i11;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.f3433f.equals(eVar.f3433f) && Objects.equals(this.f3434g, eVar.f3434g);
            }
            return false;
        }

        @Override // c5.a
        void g(Appendable appendable, byte[] bArr, int i10, int i11) {
            n.n(appendable);
            n.s(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                m(appendable, bArr, i10 + i12, Math.min(this.f3433f.f3428f, i11 - i12));
                i12 += this.f3433f.f3428f;
            }
        }

        public int hashCode() {
            return this.f3433f.hashCode() ^ Objects.hashCode(this.f3434g);
        }

        @Override // c5.a
        int i(int i10) {
            return (int) (((this.f3433f.f3426d * i10) + 7) / 8);
        }

        @Override // c5.a
        int j(int i10) {
            C0077a c0077a = this.f3433f;
            return c0077a.f3427e * d5.b.a(i10, c0077a.f3428f, RoundingMode.CEILING);
        }

        @Override // c5.a
        public a k() {
            return this.f3434g == null ? this : n(this.f3433f, null);
        }

        @Override // c5.a
        CharSequence l(CharSequence charSequence) {
            n.n(charSequence);
            Character ch = this.f3434g;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        void m(Appendable appendable, byte[] bArr, int i10, int i11) {
            n.n(appendable);
            n.s(i10, i10 + i11, bArr.length);
            int i12 = 0;
            n.d(i11 <= this.f3433f.f3428f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f3433f.f3426d;
            while (i12 < i11 * 8) {
                C0077a c0077a = this.f3433f;
                appendable.append(c0077a.d(((int) (j10 >>> (i14 - i12))) & c0077a.f3425c));
                i12 += this.f3433f.f3426d;
            }
            if (this.f3434g != null) {
                while (i12 < this.f3433f.f3428f * 8) {
                    appendable.append(this.f3434g.charValue());
                    i12 += this.f3433f.f3426d;
                }
            }
        }

        a n(C0077a c0077a, Character ch) {
            return new e(c0077a, ch);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f3433f);
            if (8 % this.f3433f.f3426d != 0) {
                if (this.f3434g == null) {
                    str = ".omitPadding()";
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f3434g);
                    str = "')";
                }
                sb.append(str);
            }
            return sb.toString();
        }
    }

    a() {
    }

    public static a a() {
        return f3418a;
    }

    private static byte[] h(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public final byte[] b(CharSequence charSequence) {
        try {
            return c(charSequence);
        } catch (d e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    final byte[] c(CharSequence charSequence) {
        CharSequence l10 = l(charSequence);
        byte[] bArr = new byte[i(l10.length())];
        return h(bArr, d(bArr, l10));
    }

    abstract int d(byte[] bArr, CharSequence charSequence);

    public String e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public final String f(byte[] bArr, int i10, int i11) {
        n.s(i10, i10 + i11, bArr.length);
        StringBuilder sb = new StringBuilder(j(i11));
        try {
            g(sb, bArr, i10, i11);
            return sb.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract void g(Appendable appendable, byte[] bArr, int i10, int i11);

    abstract int i(int i10);

    abstract int j(int i10);

    public abstract a k();

    abstract CharSequence l(CharSequence charSequence);
}
