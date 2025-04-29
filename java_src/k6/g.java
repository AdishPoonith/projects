package k6;

import com.google.protobuf.i;
import java.math.RoundingMode;
import java.util.Arrays;
/* loaded from: classes.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[][] f12598c = {new byte[]{0, 0}, new byte[]{Byte.MIN_VALUE, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, Byte.MIN_VALUE}, new byte[]{-1, -64}};

    /* renamed from: b  reason: collision with root package name */
    private int f12600b = 0;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f12599a = new byte[1024];

    private void b(int i10) {
        int i11 = i10 + this.f12600b;
        byte[] bArr = this.f12599a;
        if (i11 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i11) {
            i11 = length;
        }
        this.f12599a = Arrays.copyOf(bArr, i11);
    }

    private int d(long j10) {
        if (j10 < 0) {
            j10 = ~j10;
        }
        return f.a((64 - Long.numberOfLeadingZeros(j10)) + 1, 7, RoundingMode.UP);
    }

    private int e(long j10) {
        return f.a(64 - Long.numberOfLeadingZeros(j10), 8, RoundingMode.UP);
    }

    private void f(byte b10) {
        if (b10 == 0) {
            l((byte) 0);
            l((byte) -1);
        } else if (b10 != -1) {
            l(b10);
        } else {
            l((byte) -1);
            l((byte) 0);
        }
    }

    private void g(byte b10) {
        if (b10 == 0) {
            m((byte) 0);
            m((byte) -1);
        } else if (b10 != -1) {
            m(b10);
        } else {
            m((byte) -1);
            m((byte) 0);
        }
    }

    private void l(byte b10) {
        b(1);
        byte[] bArr = this.f12599a;
        int i10 = this.f12600b;
        this.f12600b = i10 + 1;
        bArr[i10] = b10;
    }

    private void m(byte b10) {
        b(1);
        byte[] bArr = this.f12599a;
        int i10 = this.f12600b;
        this.f12600b = i10 + 1;
        bArr[i10] = (byte) (~b10);
    }

    private void p() {
        l((byte) 0);
        l((byte) 1);
    }

    private void q() {
        m((byte) 0);
        m((byte) 1);
    }

    public byte[] a() {
        return Arrays.copyOf(this.f12599a, this.f12600b);
    }

    public void c(byte[] bArr) {
        b(bArr.length);
        for (byte b10 : bArr) {
            byte[] bArr2 = this.f12599a;
            int i10 = this.f12600b;
            this.f12600b = i10 + 1;
            bArr2[i10] = b10;
        }
    }

    public void h(i iVar) {
        for (int i10 = 0; i10 < iVar.size(); i10++) {
            f(iVar.l(i10));
        }
        p();
    }

    public void i(i iVar) {
        for (int i10 = 0; i10 < iVar.size(); i10++) {
            g(iVar.l(i10));
        }
        q();
    }

    public void j(double d10) {
        long doubleToLongBits = Double.doubleToLongBits(d10);
        t(doubleToLongBits ^ (doubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void k(double d10) {
        long doubleToLongBits = Double.doubleToLongBits(d10);
        u(doubleToLongBits ^ (doubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    public void n() {
        l((byte) -1);
        l((byte) -1);
    }

    public void o() {
        m((byte) -1);
        m((byte) -1);
    }

    public void r(long j10) {
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        long j11 = i11 < 0 ? ~j10 : j10;
        if (j11 < 64) {
            b(1);
            byte[] bArr = this.f12599a;
            int i12 = this.f12600b;
            this.f12600b = i12 + 1;
            bArr[i12] = (byte) (j10 ^ f12598c[1][0]);
            return;
        }
        int d10 = d(j11);
        b(d10);
        if (d10 < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(d10)));
        }
        byte b10 = i11 < 0 ? (byte) -1 : (byte) 0;
        int i13 = this.f12600b;
        if (d10 == 10) {
            i10 = i13 + 2;
            byte[] bArr2 = this.f12599a;
            bArr2[i13] = b10;
            bArr2[i13 + 1] = b10;
        } else if (d10 == 9) {
            i10 = i13 + 1;
            this.f12599a[i13] = b10;
        } else {
            i10 = i13;
        }
        for (int i14 = (d10 - 1) + i13; i14 >= i10; i14--) {
            this.f12599a[i14] = (byte) (255 & j10);
            j10 >>= 8;
        }
        byte[] bArr3 = this.f12599a;
        int i15 = this.f12600b;
        byte b11 = bArr3[i15];
        byte[][] bArr4 = f12598c;
        bArr3[i15] = (byte) (b11 ^ bArr4[d10][0]);
        int i16 = i15 + 1;
        bArr3[i16] = (byte) (bArr4[d10][1] ^ bArr3[i16]);
        this.f12600b = i15 + d10;
    }

    public void s(long j10) {
        r(~j10);
    }

    public void t(long j10) {
        int e10 = e(j10);
        b(e10 + 1);
        byte[] bArr = this.f12599a;
        int i10 = this.f12600b;
        int i11 = i10 + 1;
        this.f12600b = i11;
        bArr[i10] = (byte) e10;
        int i12 = i11 + e10;
        while (true) {
            i12--;
            int i13 = this.f12600b;
            if (i12 < i13) {
                this.f12600b = i13 + e10;
                return;
            } else {
                this.f12599a[i12] = (byte) (255 & j10);
                j10 >>>= 8;
            }
        }
    }

    public void u(long j10) {
        int e10 = e(j10);
        b(e10 + 1);
        byte[] bArr = this.f12599a;
        int i10 = this.f12600b;
        int i11 = i10 + 1;
        this.f12600b = i11;
        bArr[i10] = (byte) (~e10);
        int i12 = i11 + e10;
        while (true) {
            i12--;
            int i13 = this.f12600b;
            if (i12 < i13) {
                this.f12600b = i13 + e10;
                return;
            } else {
                this.f12599a[i12] = (byte) (~(255 & j10));
                j10 >>>= 8;
            }
        }
    }

    public void v(CharSequence charSequence) {
        int i10;
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length) {
            int charAt = charSequence.charAt(i11);
            if (charAt >= 128) {
                if (charAt < 2048) {
                    i10 = (charAt >>> 6) | 960;
                } else if (charAt < 55296 || 57343 < charAt) {
                    f((byte) ((charAt >>> 12) | 480));
                    i10 = ((charAt >>> 6) & 63) | 128;
                } else {
                    charAt = Character.codePointAt(charSequence, i11);
                    i11++;
                    f((byte) ((charAt >>> 18) | 240));
                    f((byte) (((charAt >>> 12) & 63) | 128));
                    f((byte) (((charAt >>> 6) & 63) | 128));
                    charAt = (charAt & 63) | 128;
                }
                f((byte) i10);
                charAt = (charAt & 63) | 128;
            }
            f((byte) charAt);
            i11++;
        }
        p();
    }

    public void w(CharSequence charSequence) {
        int i10;
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length) {
            int charAt = charSequence.charAt(i11);
            if (charAt >= 128) {
                if (charAt < 2048) {
                    i10 = (charAt >>> 6) | 960;
                } else if (charAt < 55296 || 57343 < charAt) {
                    g((byte) ((charAt >>> 12) | 480));
                    i10 = ((charAt >>> 6) & 63) | 128;
                } else {
                    charAt = Character.codePointAt(charSequence, i11);
                    i11++;
                    g((byte) ((charAt >>> 18) | 240));
                    g((byte) (((charAt >>> 12) & 63) | 128));
                    g((byte) (((charAt >>> 6) & 63) | 128));
                    charAt = (charAt & 63) | 128;
                }
                g((byte) i10);
                charAt = (charAt & 63) | 128;
            }
            g((byte) charAt);
            i11++;
        }
        q();
    }
}
