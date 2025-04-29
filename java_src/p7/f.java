package p7;

import java.util.Map;
/* loaded from: classes.dex */
public final class f extends n {
    private static void f(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    private static String g(String str) {
        String str2;
        int i10;
        int i11;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = str.charAt(i12);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        str2 = "%V";
                    } else if (charAt == '`') {
                        str2 = "%W";
                    } else if (charAt != '-' && charAt != '.') {
                        if (charAt <= 26) {
                            sb.append('$');
                            i10 = charAt - 1;
                        } else if (charAt < ' ') {
                            sb.append('%');
                            i10 = charAt - 27;
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb.append('/');
                            i10 = charAt - '!';
                        } else {
                            if (charAt <= '9') {
                                i11 = (charAt - '0') + 48;
                            } else if (charAt <= '?') {
                                sb.append('%');
                                i11 = (charAt - ';') + 70;
                            } else if (charAt <= 'Z') {
                                i10 = charAt - 'A';
                            } else if (charAt <= '_') {
                                sb.append('%');
                                i11 = (charAt - '[') + 75;
                            } else if (charAt <= 'z') {
                                sb.append('+');
                                i10 = charAt - 'a';
                            } else if (charAt > 127) {
                                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i12) + "'");
                            } else {
                                sb.append('%');
                                i11 = (charAt - '{') + 80;
                            }
                            charAt = (char) i11;
                        }
                        i11 = i10 + 65;
                        charAt = (char) i11;
                    }
                }
                sb.append(charAt);
            } else {
                str2 = "%U";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    @Override // p7.n, i7.g
    public l7.b a(String str, i7.a aVar, int i10, int i11, Map<i7.c, ?> map) {
        if (aVar == i7.a.CODE_39) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    @Override // p7.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 80) {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10)) < 0) {
                    str = g(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i10++;
                }
            }
            int[] iArr = new int[9];
            int i11 = length + 25;
            for (int i12 = 0; i12 < length; i12++) {
                f(e.f15765a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i12))], iArr);
                for (int i13 = 0; i13 < 9; i13++) {
                    i11 += iArr[i13];
                }
            }
            boolean[] zArr = new boolean[i11];
            f(148, iArr);
            int b10 = n.b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int b11 = b10 + n.b(zArr, b10, iArr2, false);
            for (int i14 = 0; i14 < length; i14++) {
                f(e.f15765a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i14))], iArr);
                int b12 = b11 + n.b(zArr, b11, iArr, true);
                b11 = b12 + n.b(zArr, b12, iArr2, false);
            }
            f(148, iArr);
            n.b(zArr, b11, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
