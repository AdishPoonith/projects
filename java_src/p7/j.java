package p7;

import java.util.Map;
/* loaded from: classes.dex */
public final class j extends q {
    @Override // p7.n, i7.g
    public l7.b a(String str, i7.a aVar, int i10, int i11, Map<i7.c, ?> map) {
        if (aVar == i7.a.EAN_13) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    @Override // p7.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + p.b(str);
            } catch (i7.d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length != 13) {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        } else {
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (i7.d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i10 = i.f15769f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b10 = n.b(zArr, 0, p.f15774a, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit += 10;
            }
            b10 += n.b(zArr, b10, p.f15778e[digit], false);
        }
        int b11 = b10 + n.b(zArr, b10, p.f15775b, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            b11 += n.b(zArr, b11, p.f15777d[Character.digit(str.charAt(i12), 10)], true);
        }
        n.b(zArr, b11, p.f15774a, true);
        return zArr;
    }
}
