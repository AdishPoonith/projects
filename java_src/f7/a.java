package f7;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: j  reason: collision with root package name */
    private final Reader f8843j;

    /* renamed from: r  reason: collision with root package name */
    private long f8851r;

    /* renamed from: s  reason: collision with root package name */
    private int f8852s;

    /* renamed from: t  reason: collision with root package name */
    private String f8853t;

    /* renamed from: u  reason: collision with root package name */
    private int[] f8854u;

    /* renamed from: w  reason: collision with root package name */
    private String[] f8856w;

    /* renamed from: x  reason: collision with root package name */
    private int[] f8857x;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8844k = false;

    /* renamed from: l  reason: collision with root package name */
    private final char[] f8845l = new char[1024];

    /* renamed from: m  reason: collision with root package name */
    private int f8846m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f8847n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f8848o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f8849p = 0;

    /* renamed from: q  reason: collision with root package name */
    int f8850q = 0;

    /* renamed from: v  reason: collision with root package name */
    private int f8855v = 0 + 1;

    /* renamed from: f7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0144a extends e7.a {
        C0144a() {
        }
    }

    static {
        e7.a.f8122a = new C0144a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f8854u = iArr;
        iArr[0] = 6;
        this.f8856w = new String[32];
        this.f8857x = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f8843j = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r1 != '/') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
        r7.f8846m = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        if (r4 != r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        r7.f8846m = r4 - 1;
        r2 = m(2);
        r7.f8846m++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (r2 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
        e();
        r2 = r7.f8846m;
        r3 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r3 == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (r3 == '/') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
        r7.f8846m = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
        r7.f8846m = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (f0("*\/") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        throw h0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
        r7.f8846m = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        if (r1 != '#') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int C(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f8845l
        L2:
            int r1 = r7.f8846m
        L4:
            int r2 = r7.f8847n
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r7.f8846m = r1
            boolean r1 = r7.m(r3)
            if (r1 != 0) goto L30
            if (r8 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.w()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L30:
            int r1 = r7.f8846m
            int r2 = r7.f8847n
        L34:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L44
            int r1 = r7.f8848o
            int r1 = r1 + r3
            r7.f8848o = r1
            r7.f8849p = r4
            goto La3
        L44:
            r5 = 32
            if (r1 == r5) goto La3
            r5 = 13
            if (r1 == r5) goto La3
            r5 = 9
            if (r1 != r5) goto L51
            goto La3
        L51:
            r5 = 47
            if (r1 != r5) goto L98
            r7.f8846m = r4
            r6 = 2
            if (r4 != r2) goto L6a
            int r4 = r4 + (-1)
            r7.f8846m = r4
            boolean r2 = r7.m(r6)
            int r4 = r7.f8846m
            int r4 = r4 + r3
            r7.f8846m = r4
            if (r2 != 0) goto L6a
            return r1
        L6a:
            r7.e()
            int r2 = r7.f8846m
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L80
            if (r3 == r5) goto L78
            return r1
        L78:
            int r2 = r2 + 1
            r7.f8846m = r2
        L7c:
            r7.g0()
            goto L2
        L80:
            int r2 = r2 + 1
            r7.f8846m = r2
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r7.f0(r1)
            if (r1 == 0) goto L91
            int r1 = r7.f8846m
            int r1 = r1 + r6
            goto L4
        L91:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.h0(r8)
            throw r8
        L98:
            r2 = 35
            r7.f8846m = r4
            if (r1 != r2) goto La2
            r7.e()
            goto L7c
        La2:
            return r1
        La3:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.a.C(boolean):int");
    }

    private String L(char c10) {
        char[] cArr = this.f8845l;
        StringBuilder sb = null;
        while (true) {
            int i10 = this.f8846m;
            int i11 = this.f8847n;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f8846m = i12;
                        int i13 = (i12 - i10) - 1;
                        if (sb == null) {
                            return new String(cArr, i10, i13);
                        }
                        sb.append(cArr, i10, i13);
                        return sb.toString();
                    } else if (c11 == '\\') {
                        this.f8846m = i12;
                        int i14 = (i12 - i10) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i14 + 1) * 2, 16));
                        }
                        sb.append(cArr, i10, i14);
                        sb.append(e0());
                    } else {
                        if (c11 == '\n') {
                            this.f8848o++;
                            this.f8849p = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i10 - i10) * 2, 16));
                    }
                    sb.append(cArr, i10, i10 - i10);
                    this.f8846m = i10;
                    if (!m(1)) {
                        throw h0("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        e();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String O() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f8846m
            int r4 = r3 + r2
            int r5 = r6.f8847n
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f8845l
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.e()
            goto L5c
        L4e:
            char[] r3 = r6.f8845l
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f8845l
            int r4 = r6.f8846m
            r1.append(r3, r4, r2)
            int r3 = r6.f8846m
            int r3 = r3 + r2
            r6.f8846m = r3
            r2 = 1
            boolean r2 = r6.m(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f8845l
            int r3 = r6.f8846m
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f8845l
            int r3 = r6.f8846m
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f8846m
            int r2 = r2 + r0
            r6.f8846m = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.a.O():java.lang.String");
    }

    private int U() {
        int i10;
        String str;
        String str2;
        char c10 = this.f8845l[this.f8846m];
        if (c10 == 't' || c10 == 'T') {
            i10 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c10 == 'f' || c10 == 'F') {
            i10 = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c10 != 'n' && c10 != 'N') {
            return 0;
        } else {
            i10 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f8846m + i11 >= this.f8847n && !m(i11 + 1)) {
                return 0;
            }
            char c11 = this.f8845l[this.f8846m + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f8846m + length < this.f8847n || m(length + 1)) && v(this.f8845l[this.f8846m + length])) {
            return 0;
        }
        this.f8846m += length;
        this.f8850q = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        if (v(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
        if (r9 != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
        if (r10 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
        if (r13 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a7, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
        if (r13 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ae, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00af, code lost:
        r18.f8851r = r11;
        r18.f8846m += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b8, code lost:
        r18.f8850q = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ba, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bb, code lost:
        if (r9 == 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00be, code lost:
        if (r9 == 4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c1, code lost:
        if (r9 != 7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c4, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c6, code lost:
        r18.f8852s = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cb, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int b0() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.a.b0():int");
    }

    private void c0(int i10) {
        int i11 = this.f8855v;
        int[] iArr = this.f8854u;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f8854u = Arrays.copyOf(iArr, i12);
            this.f8857x = Arrays.copyOf(this.f8857x, i12);
            this.f8856w = (String[]) Arrays.copyOf(this.f8856w, i12);
        }
        int[] iArr2 = this.f8854u;
        int i13 = this.f8855v;
        this.f8855v = i13 + 1;
        iArr2[i13] = i10;
    }

    private void e() {
        if (!this.f8844k) {
            throw h0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private char e0() {
        int i10;
        int i11;
        if (this.f8846m != this.f8847n || m(1)) {
            char[] cArr = this.f8845l;
            int i12 = this.f8846m;
            int i13 = i12 + 1;
            this.f8846m = i13;
            char c10 = cArr[i12];
            if (c10 == '\n') {
                this.f8848o++;
                this.f8849p = i13;
            } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
                if (c10 != 'b') {
                    if (c10 != 'f') {
                        if (c10 != 'n') {
                            if (c10 != 'r') {
                                if (c10 != 't') {
                                    if (c10 == 'u') {
                                        if (i13 + 4 <= this.f8847n || m(4)) {
                                            char c11 = 0;
                                            int i14 = this.f8846m;
                                            int i15 = i14 + 4;
                                            while (i14 < i15) {
                                                char c12 = this.f8845l[i14];
                                                char c13 = (char) (c11 << 4);
                                                if (c12 < '0' || c12 > '9') {
                                                    if (c12 >= 'a' && c12 <= 'f') {
                                                        i10 = c12 - 'a';
                                                    } else if (c12 < 'A' || c12 > 'F') {
                                                        throw new NumberFormatException("\\u" + new String(this.f8845l, this.f8846m, 4));
                                                    } else {
                                                        i10 = c12 - 'A';
                                                    }
                                                    i11 = i10 + 10;
                                                } else {
                                                    i11 = c12 - '0';
                                                }
                                                c11 = (char) (c13 + i11);
                                                i14++;
                                            }
                                            this.f8846m += 4;
                                            return c11;
                                        }
                                        throw h0("Unterminated escape sequence");
                                    }
                                    throw h0("Invalid escape sequence");
                                }
                                return '\t';
                            }
                            return '\r';
                        }
                        return '\n';
                    }
                    return '\f';
                }
                return '\b';
            }
            return c10;
        }
        throw h0("Unterminated escape sequence");
    }

    private boolean f0(String str) {
        int length = str.length();
        while (true) {
            if (this.f8846m + length > this.f8847n && !m(length)) {
                return false;
            }
            char[] cArr = this.f8845l;
            int i10 = this.f8846m;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f8845l[this.f8846m + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f8848o++;
            this.f8849p = i10 + 1;
            this.f8846m++;
        }
    }

    private void g0() {
        char c10;
        do {
            if (this.f8846m >= this.f8847n && !m(1)) {
                return;
            }
            char[] cArr = this.f8845l;
            int i10 = this.f8846m;
            int i11 = i10 + 1;
            this.f8846m = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f8848o++;
                this.f8849p = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private void h() {
        C(true);
        int i10 = this.f8846m - 1;
        this.f8846m = i10;
        if (i10 + 5 <= this.f8847n || m(5)) {
            int i11 = this.f8846m;
            char[] cArr = this.f8845l;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f8846m = i11 + 5;
            }
        }
    }

    private IOException h0(String str) {
        throw new c(str + w());
    }

    private boolean m(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f8845l;
        int i13 = this.f8849p;
        int i14 = this.f8846m;
        this.f8849p = i13 - i14;
        int i15 = this.f8847n;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f8847n = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f8847n = 0;
        }
        this.f8846m = 0;
        do {
            Reader reader = this.f8843j;
            int i17 = this.f8847n;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f8847n + read;
            this.f8847n = i11;
            if (this.f8848o == 0 && (i12 = this.f8849p) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f8846m++;
                this.f8849p = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    private String r(boolean z10) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f8855v;
            if (i10 >= i11) {
                return sb.toString();
            }
            int i12 = this.f8854u[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f8857x[i10];
                if (z10 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb.append('[');
                sb.append(i13);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String[] strArr = this.f8856w;
                if (strArr[i10] != null) {
                    sb.append(strArr[i10]);
                }
            }
            i10++;
        }
    }

    private boolean v(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public void H() {
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 7) {
            this.f8850q = 0;
            int[] iArr = this.f8857x;
            int i11 = this.f8855v - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + T() + w());
    }

    public String N() {
        String str;
        char c10;
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 10) {
            str = O();
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else if (i10 == 9) {
                c10 = '\"';
            } else if (i10 == 11) {
                str = this.f8853t;
                this.f8853t = null;
            } else if (i10 == 15) {
                str = Long.toString(this.f8851r);
            } else if (i10 != 16) {
                throw new IllegalStateException("Expected a string but was " + T() + w());
            } else {
                str = new String(this.f8845l, this.f8846m, this.f8852s);
                this.f8846m += this.f8852s;
            }
            str = L(c10);
        }
        this.f8850q = 0;
        int[] iArr = this.f8857x;
        int i11 = this.f8855v - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public b T() {
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void a() {
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 3) {
            c0(1);
            this.f8857x[this.f8855v - 1] = 0;
            this.f8850q = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + T() + w());
    }

    public void b() {
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 1) {
            c0(3);
            this.f8850q = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + T() + w());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8850q = 0;
        this.f8854u[0] = 8;
        this.f8855v = 1;
        this.f8843j.close();
    }

    int i() {
        int i10;
        int C;
        int[] iArr = this.f8854u;
        int i11 = this.f8855v;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 != 2) {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5 && (C = C(true)) != 44) {
                    if (C != 59) {
                        if (C == 125) {
                            this.f8850q = 2;
                            return 2;
                        }
                        throw h0("Unterminated object");
                    }
                    e();
                }
                int C2 = C(true);
                if (C2 == 34) {
                    i10 = 13;
                } else if (C2 == 39) {
                    e();
                    i10 = 12;
                } else if (C2 == 125) {
                    if (i12 != 5) {
                        this.f8850q = 2;
                        return 2;
                    }
                    throw h0("Expected name");
                } else {
                    e();
                    this.f8846m--;
                    if (!v((char) C2)) {
                        throw h0("Expected name");
                    }
                    i10 = 14;
                }
            } else if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int C3 = C(true);
                if (C3 != 58) {
                    if (C3 != 61) {
                        throw h0("Expected ':'");
                    }
                    e();
                    if (this.f8846m < this.f8847n || m(1)) {
                        char[] cArr = this.f8845l;
                        int i13 = this.f8846m;
                        if (cArr[i13] == '>') {
                            this.f8846m = i13 + 1;
                        }
                    }
                }
            } else if (i12 == 6) {
                if (this.f8844k) {
                    h();
                }
                this.f8854u[this.f8855v - 1] = 7;
            } else if (i12 == 7) {
                if (C(false) == -1) {
                    i10 = 17;
                } else {
                    e();
                    this.f8846m--;
                }
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
            this.f8850q = i10;
            return i10;
        } else {
            int C4 = C(true);
            if (C4 != 44) {
                if (C4 != 59) {
                    if (C4 == 93) {
                        this.f8850q = 4;
                        return 4;
                    }
                    throw h0("Unterminated array");
                }
                e();
            }
        }
        int C5 = C(true);
        if (C5 != 34) {
            if (C5 == 39) {
                e();
                this.f8850q = 8;
                return 8;
            }
            if (C5 != 44 && C5 != 59) {
                if (C5 == 91) {
                    this.f8850q = 3;
                    return 3;
                } else if (C5 != 93) {
                    if (C5 == 123) {
                        this.f8850q = 1;
                        return 1;
                    }
                    this.f8846m--;
                    int U = U();
                    if (U != 0) {
                        return U;
                    }
                    int b02 = b0();
                    if (b02 != 0) {
                        return b02;
                    }
                    if (!v(this.f8845l[this.f8846m])) {
                        throw h0("Expected value");
                    }
                    e();
                    i10 = 10;
                } else if (i12 == 1) {
                    this.f8850q = 4;
                    return 4;
                }
            }
            if (i12 == 1 || i12 == 2) {
                e();
                this.f8846m--;
                this.f8850q = 7;
                return 7;
            }
            throw h0("Unexpected value");
        }
        i10 = 9;
        this.f8850q = i10;
        return i10;
    }

    public void k() {
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + T() + w());
        }
        int i11 = this.f8855v - 1;
        this.f8855v = i11;
        int[] iArr = this.f8857x;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f8850q = 0;
    }

    public void l() {
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + T() + w());
        }
        int i11 = this.f8855v - 1;
        this.f8855v = i11;
        this.f8856w[i11] = null;
        int[] iArr = this.f8857x;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f8850q = 0;
    }

    public String q() {
        return r(false);
    }

    public boolean t() {
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    public String toString() {
        return getClass().getSimpleName() + w();
    }

    String w() {
        return " at line " + (this.f8848o + 1) + " column " + ((this.f8846m - this.f8849p) + 1) + " path " + q();
    }

    public boolean x() {
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 5) {
            this.f8850q = 0;
            int[] iArr = this.f8857x;
            int i11 = this.f8855v - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f8850q = 0;
            int[] iArr2 = this.f8857x;
            int i12 = this.f8855v - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + T() + w());
        }
    }

    public double y() {
        String L;
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 15) {
            this.f8850q = 0;
            int[] iArr = this.f8857x;
            int i11 = this.f8855v - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f8851r;
        }
        if (i10 == 16) {
            this.f8853t = new String(this.f8845l, this.f8846m, this.f8852s);
            this.f8846m += this.f8852s;
        } else {
            if (i10 == 8 || i10 == 9) {
                L = L(i10 == 8 ? '\'' : '\"');
            } else if (i10 == 10) {
                L = O();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + T() + w());
            }
            this.f8853t = L;
        }
        this.f8850q = 11;
        double parseDouble = Double.parseDouble(this.f8853t);
        if (!this.f8844k && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new c("JSON forbids NaN and infinities: " + parseDouble + w());
        }
        this.f8853t = null;
        this.f8850q = 0;
        int[] iArr2 = this.f8857x;
        int i12 = this.f8855v - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public String z() {
        char c10;
        String L;
        int i10 = this.f8850q;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 14) {
            L = O();
        } else {
            if (i10 == 12) {
                c10 = '\'';
            } else if (i10 != 13) {
                throw new IllegalStateException("Expected a name but was " + T() + w());
            } else {
                c10 = '\"';
            }
            L = L(c10);
        }
        this.f8850q = 0;
        this.f8856w[this.f8855v - 1] = L;
        return L;
    }
}
