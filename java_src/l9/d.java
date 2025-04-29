package l9;

import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f13516a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13517b;

    /* renamed from: c  reason: collision with root package name */
    private int f13518c;

    /* renamed from: d  reason: collision with root package name */
    private int f13519d;

    /* renamed from: e  reason: collision with root package name */
    private int f13520e;

    /* renamed from: f  reason: collision with root package name */
    private int f13521f;

    /* renamed from: g  reason: collision with root package name */
    private char[] f13522g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f13516a = name;
        this.f13517b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
        return new java.lang.String(r1, r2, r8.f13521f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f13518c
            r8.f13519d = r0
            r8.f13520e = r0
        L6:
            int r0 = r8.f13518c
            int r1 = r8.f13517b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f13522g
            int r2 = r8.f13519d
            int r3 = r8.f13520e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f13522g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5a
            if (r2 == r5) goto L4f
            r5 = 92
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L4f
            if (r2 == r3) goto L4f
            int r2 = r8.f13520e
            int r3 = r2 + 1
            r8.f13520e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            goto L4a
        L3c:
            int r0 = r8.f13520e
            int r2 = r0 + 1
            r8.f13520e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f13518c
        L4a:
            int r0 = r0 + 1
            r8.f13518c = r0
            goto L6
        L4f:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f13519d
            int r3 = r8.f13520e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5a:
            int r2 = r8.f13520e
            r8.f13521f = r2
            int r0 = r0 + 1
            r8.f13518c = r0
            int r0 = r2 + 1
            r8.f13520e = r0
            r1[r2] = r6
        L68:
            int r0 = r8.f13518c
            int r1 = r8.f13517b
            if (r0 >= r1) goto L81
            char[] r2 = r8.f13522g
            char r7 = r2[r0]
            if (r7 != r6) goto L81
            int r1 = r8.f13520e
            int r7 = r1 + 1
            r8.f13520e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f13518c = r0
            goto L68
        L81:
            if (r0 == r1) goto L91
            char[] r1 = r8.f13522g
            char r2 = r1[r0]
            if (r2 == r3) goto L91
            char r2 = r1[r0]
            if (r2 == r4) goto L91
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L91:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f13522g
            int r2 = r8.f13519d
            int r3 = r8.f13521f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.d.a():java.lang.String");
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 >= this.f13517b) {
            throw new IllegalStateException("Malformed DN: " + this.f13516a);
        }
        char[] cArr = this.f13522g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else if (c10 < 'A' || c10 > 'F') {
            throw new IllegalStateException("Malformed DN: " + this.f13516a);
        } else {
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else if (c11 < 'A' || c11 > 'F') {
            throw new IllegalStateException("Malformed DN: " + this.f13516a);
        } else {
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    private char d() {
        int i10 = this.f13518c + 1;
        this.f13518c = i10;
        if (i10 == this.f13517b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f13516a);
        }
        char[] cArr = this.f13522g;
        char c10 = cArr[i10];
        if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
            switch (c10) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c10) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            return e();
                    }
            }
        }
        return cArr[i10];
    }

    private char e() {
        int i10;
        int i11;
        int c10 = c(this.f13518c);
        this.f13518c++;
        if (c10 < 128) {
            return (char) c10;
        }
        if (c10 < 192 || c10 > 247) {
            return '?';
        }
        if (c10 <= 223) {
            i11 = c10 & 31;
            i10 = 1;
        } else if (c10 <= 239) {
            i10 = 2;
            i11 = c10 & 15;
        } else {
            i10 = 3;
            i11 = c10 & 7;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.f13518c + 1;
            this.f13518c = i13;
            if (i13 == this.f13517b || this.f13522g[i13] != '\\') {
                return '?';
            }
            int i14 = i13 + 1;
            this.f13518c = i14;
            int c11 = c(i14);
            this.f13518c++;
            if ((c11 & 192) != 128) {
                return '?';
            }
            i11 = (i11 << 6) + (c11 & 63);
        }
        return (char) i11;
    }

    private String f() {
        int i10 = this.f13518c;
        if (i10 + 4 >= this.f13517b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f13516a);
        }
        this.f13519d = i10;
        while (true) {
            this.f13518c = i10 + 1;
            i10 = this.f13518c;
            if (i10 == this.f13517b) {
                break;
            }
            char[] cArr = this.f13522g;
            if (cArr[i10] == '+' || cArr[i10] == ',' || cArr[i10] == ';') {
                break;
            } else if (cArr[i10] == ' ') {
                this.f13520e = i10;
                do {
                    this.f13518c = i10 + 1;
                    i10 = this.f13518c;
                    if (i10 >= this.f13517b) {
                        break;
                    }
                } while (this.f13522g[i10] == ' ');
            } else if (cArr[i10] >= 'A' && cArr[i10] <= 'F') {
                cArr[i10] = (char) (cArr[i10] + ' ');
            }
        }
        this.f13520e = i10;
        int i11 = this.f13520e;
        int i12 = this.f13519d;
        int i13 = i11 - i12;
        if (i13 < 5 || (i13 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f13516a);
        }
        int i14 = i13 / 2;
        byte[] bArr = new byte[i14];
        int i15 = i12 + 1;
        for (int i16 = 0; i16 < i14; i16++) {
            bArr[i16] = (byte) c(i15);
            i15 += 2;
        }
        return new String(this.f13522g, this.f13519d, i13);
    }

    private String g() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char[] cArr;
        while (true) {
            i10 = this.f13518c;
            i11 = this.f13517b;
            if (i10 >= i11 || this.f13522g[i10] != ' ') {
                break;
            }
            this.f13518c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f13519d = i10;
        do {
            this.f13518c = i10 + 1;
            i10 = this.f13518c;
            i12 = this.f13517b;
            if (i10 >= i12) {
                break;
            }
            cArr = this.f13522g;
            if (cArr[i10] == '=') {
                break;
            }
        } while (cArr[i10] != ' ');
        if (i10 >= i12) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f13516a);
        }
        this.f13520e = i10;
        if (this.f13522g[i10] == ' ') {
            while (true) {
                i13 = this.f13518c;
                i14 = this.f13517b;
                if (i13 >= i14) {
                    break;
                }
                char[] cArr2 = this.f13522g;
                if (cArr2[i13] == '=' || cArr2[i13] != ' ') {
                    break;
                }
                this.f13518c = i13 + 1;
            }
            if (this.f13522g[i13] != '=' || i13 == i14) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f13516a);
            }
        }
        int i15 = this.f13518c;
        do {
            this.f13518c = i15 + 1;
            i15 = this.f13518c;
            if (i15 >= this.f13517b) {
                break;
            }
        } while (this.f13522g[i15] == ' ');
        int i16 = this.f13520e;
        int i17 = this.f13519d;
        if (i16 - i17 > 4) {
            char[] cArr3 = this.f13522g;
            if (cArr3[i17 + 3] == '.' && ((cArr3[i17] == 'O' || cArr3[i17] == 'o') && ((cArr3[i17 + 1] == 'I' || cArr3[i17 + 1] == 'i') && (cArr3[i17 + 2] == 'D' || cArr3[i17 + 2] == 'd')))) {
                this.f13519d = i17 + 4;
            }
        }
        char[] cArr4 = this.f13522g;
        int i18 = this.f13519d;
        return new String(cArr4, i18, i16 - i18);
    }

    private String h() {
        int i10 = this.f13518c + 1;
        this.f13518c = i10;
        this.f13519d = i10;
        while (true) {
            this.f13520e = i10;
            int i11 = this.f13518c;
            if (i11 == this.f13517b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f13516a);
            }
            char[] cArr = this.f13522g;
            if (cArr[i11] == '\"') {
                do {
                    this.f13518c = i11 + 1;
                    i11 = this.f13518c;
                    if (i11 >= this.f13517b) {
                        break;
                    }
                } while (this.f13522g[i11] == ' ');
                char[] cArr2 = this.f13522g;
                int i12 = this.f13519d;
                return new String(cArr2, i12, this.f13520e - i12);
            }
            if (cArr[i11] == '\\') {
                cArr[this.f13520e] = d();
            } else {
                cArr[this.f13520e] = cArr[i11];
            }
            this.f13518c++;
            i10 = this.f13520e + 1;
        }
    }

    public String b(String str) {
        this.f13518c = 0;
        this.f13519d = 0;
        this.f13520e = 0;
        this.f13521f = 0;
        this.f13522g = this.f13516a.toCharArray();
        String g10 = g();
        if (g10 == null) {
            return null;
        }
        do {
            int i10 = this.f13518c;
            if (i10 == this.f13517b) {
                return null;
            }
            char c10 = this.f13522g[i10];
            String a10 = c10 != '\"' ? c10 != '#' ? (c10 == '+' || c10 == ',' || c10 == ';') ? "" : a() : f() : h();
            if (str.equalsIgnoreCase(g10)) {
                return a10;
            }
            int i11 = this.f13518c;
            if (i11 >= this.f13517b) {
                return null;
            }
            char[] cArr = this.f13522g;
            if (cArr[i11] != ',' && cArr[i11] != ';' && cArr[i11] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f13516a);
            }
            this.f13518c = i11 + 1;
            g10 = g();
        } while (g10 != null);
        throw new IllegalStateException("Malformed DN: " + this.f13516a);
    }
}
