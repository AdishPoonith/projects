package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.z;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7106a;

        static {
            int[] iArr = new int[b2.b.values().length];
            f7106a = iArr;
            try {
                iArr[b2.b.f7051l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7106a[b2.b.f7052m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7106a[b2.b.f7053n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7106a[b2.b.f7054o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7106a[b2.b.f7055p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7106a[b2.b.f7063x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7106a[b2.b.f7056q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7106a[b2.b.A.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7106a[b2.b.f7057r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7106a[b2.b.f7065z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7106a[b2.b.f7058s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7106a[b2.b.B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7106a[b2.b.C.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7106a[b2.b.f7064y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7106a[b2.b.f7062w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7106a[b2.b.f7059t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7106a[b2.b.f7060u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7106a[b2.b.f7061v.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f7107a;

        /* renamed from: b  reason: collision with root package name */
        public long f7108b;

        /* renamed from: c  reason: collision with root package name */
        public Object f7109c;

        /* renamed from: d  reason: collision with root package name */
        public final q f7110d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(q qVar) {
            Objects.requireNonNull(qVar);
            this.f7110d = qVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i10, byte[] bArr, int i11, int i12, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, i11, bVar);
        while (true) {
            c0Var.l(j.b(bVar.f7107a));
            if (I >= i12) {
                break;
            }
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f7107a) {
                break;
            }
            I = I(bArr, I2, bVar);
        }
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(int i10, byte[] bArr, int i11, int i12, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        int L = L(bArr, i11, bVar);
        while (true) {
            m0Var.m(j.c(bVar.f7108b));
            if (L >= i12) {
                break;
            }
            int I = I(bArr, L, bVar);
            if (i10 != bVar.f7107a) {
                break;
            }
            L = L(bArr, I, bVar);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(byte[] bArr, int i10, b bVar) {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a;
        if (i11 >= 0) {
            if (i11 == 0) {
                bVar.f7109c = "";
                return I;
            }
            bVar.f7109c = new String(bArr, I, i11, d0.f7092b);
            return I + i11;
        }
        throw e0.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002e -> B:6:0x000c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0017 -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.d0.i<?> r8, com.google.protobuf.f.b r9) {
        /*
            int r6 = I(r5, r6, r9)
            int r0 = r9.f7107a
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.d0.f7092b
            r2.<init>(r5, r6, r0, r3)
        L17:
            r8.add(r2)
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L3e
            int r0 = I(r5, r6, r9)
            int r2 = r9.f7107a
            if (r4 == r2) goto L26
            goto L3e
        L26:
            int r6 = I(r5, r0, r9)
            int r0 = r9.f7107a
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
            goto Lc
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.d0.f7092b
            r2.<init>(r5, r6, r0, r3)
            goto L17
        L39:
            com.google.protobuf.e0 r4 = com.google.protobuf.e0.g()
            throw r4
        L3e:
            return r6
        L3f:
            com.google.protobuf.e0 r4 = com.google.protobuf.e0.g()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.D(int, byte[], int, int, com.google.protobuf.d0$i, com.google.protobuf.f$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0023). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0036 -> B:6:0x000c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.d0.i<?> r9, com.google.protobuf.f.b r10) {
        /*
            int r7 = I(r6, r7, r10)
            int r0 = r10.f7107a
            if (r0 < 0) goto L59
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.a2.t(r6, r7, r2)
            if (r3 == 0) goto L54
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.d0.f7092b
            r3.<init>(r6, r7, r0, r4)
        L1f:
            r9.add(r3)
            r7 = r2
        L23:
            if (r7 >= r8) goto L53
            int r0 = I(r6, r7, r10)
            int r2 = r10.f7107a
            if (r5 == r2) goto L2e
            goto L53
        L2e:
            int r7 = I(r6, r0, r10)
            int r0 = r10.f7107a
            if (r0 < 0) goto L4e
            if (r0 != 0) goto L39
            goto Lc
        L39:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.a2.t(r6, r7, r2)
            if (r3 == 0) goto L49
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.d0.f7092b
            r3.<init>(r6, r7, r0, r4)
            goto L1f
        L49:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.d()
            throw r5
        L4e:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.g()
            throw r5
        L53:
            return r7
        L54:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.d()
            throw r5
        L59:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.g()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.E(int, byte[], int, int, com.google.protobuf.d0$i, com.google.protobuf.f$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(byte[] bArr, int i10, b bVar) {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a;
        if (i11 >= 0) {
            if (i11 == 0) {
                bVar.f7109c = "";
                return I;
            }
            bVar.f7109c = a2.h(bArr, I, i11);
            return I + i11;
        }
        throw e0.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i10, byte[] bArr, int i11, int i12, w1 w1Var, b bVar) {
        if (b2.a(i10) != 0) {
            int b10 = b2.b(i10);
            if (b10 == 0) {
                int L = L(bArr, i11, bVar);
                w1Var.n(i10, Long.valueOf(bVar.f7108b));
                return L;
            } else if (b10 == 1) {
                w1Var.n(i10, Long.valueOf(j(bArr, i11)));
                return i11 + 8;
            } else if (b10 == 2) {
                int I = I(bArr, i11, bVar);
                int i13 = bVar.f7107a;
                if (i13 >= 0) {
                    if (i13 <= bArr.length - I) {
                        w1Var.n(i10, i13 == 0 ? i.f7143k : i.v(bArr, I, i13));
                        return I + i13;
                    }
                    throw e0.m();
                }
                throw e0.g();
            } else if (b10 != 3) {
                if (b10 == 5) {
                    w1Var.n(i10, Integer.valueOf(h(bArr, i11)));
                    return i11 + 4;
                }
                throw e0.c();
            } else {
                w1 k10 = w1.k();
                int i14 = (i10 & (-8)) | 4;
                int i15 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int I2 = I(bArr, i11, bVar);
                    int i16 = bVar.f7107a;
                    i15 = i16;
                    if (i16 == i14) {
                        i11 = I2;
                        break;
                    }
                    int G = G(i15, bArr, I2, i12, k10, bVar);
                    i15 = i16;
                    i11 = G;
                }
                if (i11 > i12 || i15 != i14) {
                    throw e0.h();
                }
                w1Var.n(i10, k10);
                return i11;
            }
        }
        throw e0.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(int i10, byte[] bArr, int i11, b bVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                bVar.f7107a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            bVar.f7107a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        bVar.f7107a = i14 | i13;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            bVar.f7107a = b10;
            return i11;
        }
        return H(b10, bArr, i11, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i10, byte[] bArr, int i11, int i12, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, i11, bVar);
        while (true) {
            c0Var.l(bVar.f7107a);
            if (I >= i12) {
                break;
            }
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f7107a) {
                break;
            }
            I = I(bArr, I2, bVar);
        }
        return I;
    }

    static int K(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i12;
            i11 = i13;
            b10 = b11;
        }
        bVar.f7108b = j11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            bVar.f7108b = j10;
            return i11;
        }
        return K(j10, bArr, i11, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(int i10, byte[] bArr, int i11, int i12, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        int L = L(bArr, i11, bVar);
        while (true) {
            m0Var.m(bVar.f7108b);
            if (L >= i12) {
                break;
            }
            int I = I(bArr, L, bVar);
            if (i10 != bVar.f7107a) {
                break;
            }
            L = L(bArr, I, bVar);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(Object obj, n1 n1Var, byte[] bArr, int i10, int i11, int i12, b bVar) {
        int h02 = ((y0) n1Var).h0(obj, bArr, i10, i11, i12, bVar);
        bVar.f7109c = obj;
        return h02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(Object obj, n1 n1Var, byte[] bArr, int i10, int i11, b bVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = H(i13, bArr, i12, bVar);
            i13 = bVar.f7107a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw e0.m();
        }
        int i15 = i13 + i14;
        n1Var.j(obj, bArr, i14, i15, bVar);
        bVar.f7109c = obj;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(int i10, byte[] bArr, int i11, int i12, b bVar) {
        if (b2.a(i10) != 0) {
            int b10 = b2.b(i10);
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 == 5) {
                                return i11 + 4;
                            }
                            throw e0.c();
                        }
                        int i13 = (i10 & (-8)) | 4;
                        int i14 = 0;
                        while (i11 < i12) {
                            i11 = I(bArr, i11, bVar);
                            i14 = bVar.f7107a;
                            if (i14 == i13) {
                                break;
                            }
                            i11 = P(i14, bArr, i11, i12, bVar);
                        }
                        if (i11 > i12 || i14 != i13) {
                            throw e0.h();
                        }
                        return i11;
                    }
                    return I(bArr, i11, bVar) + bVar.f7107a;
                }
                return i11 + 8;
            }
            return L(bArr, i11, bVar);
        }
        throw e0.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        r9 = L(r8, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r12.f7108b == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r12.f7108b != 0) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        r11.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r9 >= r10) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = I(r8, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r7 == r12.f7107a) goto L8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0029 -> B:4:0x0010). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x0012 -> B:6:0x0013). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r7, byte[] r8, int r9, int r10, com.google.protobuf.d0.i<?> r11, com.google.protobuf.f.b r12) {
        /*
            com.google.protobuf.g r11 = (com.google.protobuf.g) r11
            int r9 = L(r8, r9, r12)
            long r0 = r12.f7108b
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            r11.m(r0)
            if (r9 >= r10) goto L2c
            int r0 = I(r8, r9, r12)
            int r1 = r12.f7107a
            if (r7 == r1) goto L21
            goto L2c
        L21:
            int r9 = L(r8, r0, r12)
            long r0 = r12.f7108b
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L12
            goto L10
        L2c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.a(int, byte[], int, int, com.google.protobuf.d0$i, com.google.protobuf.f$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i10, b bVar) {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - I) {
                if (i11 == 0) {
                    bVar.f7109c = i.f7143k;
                    return I;
                }
                bVar.f7109c = i.v(bArr, I, i11);
                return I + i11;
            }
            throw e0.m();
        }
        throw e0.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = I(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r2 == r7.f7107a) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r4 = I(r3, r0, r7);
        r0 = r7.f7107a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r0 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r0 > (r3.length - r4)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r0 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        throw com.google.protobuf.e0.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        throw com.google.protobuf.e0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r0 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        r6.add(com.google.protobuf.i.f7143k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        r6.add(com.google.protobuf.i.v(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4 >= r5) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0033 -> B:7:0x000e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0014 -> B:9:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.d0.i<?> r6, com.google.protobuf.f.b r7) {
        /*
            int r4 = I(r3, r4, r7)
            int r0 = r7.f7107a
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto L14
        Le:
            com.google.protobuf.i r0 = com.google.protobuf.i.f7143k
            r6.add(r0)
            goto L1c
        L14:
            com.google.protobuf.i r1 = com.google.protobuf.i.v(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L40
            int r0 = I(r3, r4, r7)
            int r1 = r7.f7107a
            if (r2 == r1) goto L27
            goto L40
        L27:
            int r4 = I(r3, r0, r7)
            int r0 = r7.f7107a
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto L14
            goto Le
        L36:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.m()
            throw r2
        L3b:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.g()
            throw r2
        L40:
            return r4
        L41:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.m()
            throw r2
        L46:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.g()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.c(int, byte[], int, int, com.google.protobuf.d0$i, com.google.protobuf.f$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(j(bArr, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i10, byte[] bArr, int i11, int i12, d0.i<?> iVar, b bVar) {
        n nVar = (n) iVar;
        nVar.l(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f7107a) {
                break;
            }
            nVar.l(d(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int f(int r8, byte[] r9, int r10, int r11, com.google.protobuf.z.c<?, ?> r12, com.google.protobuf.z.e<?, ?> r13, com.google.protobuf.v1<com.google.protobuf.w1, com.google.protobuf.w1> r14, com.google.protobuf.f.b r15) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.f(int, byte[], int, int, com.google.protobuf.z$c, com.google.protobuf.z$e, com.google.protobuf.v1, com.google.protobuf.f$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i10, byte[] bArr, int i11, int i12, Object obj, v0 v0Var, v1<w1, w1> v1Var, b bVar) {
        z.e a10 = bVar.f7110d.a(v0Var, i10 >>> 3);
        if (a10 == null) {
            return G(i10, bArr, i11, i12, y0.x(obj), bVar);
        }
        z.c cVar = (z.c) obj;
        cVar.e0();
        return f(i10, bArr, i11, i12, cVar, a10, v1Var, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i10, byte[] bArr, int i11, int i12, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        c0Var.l(h(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f7107a) {
                break;
            }
            c0Var.l(h(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long j(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i10, byte[] bArr, int i11, int i12, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        m0Var.m(j(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f7107a) {
                break;
            }
            m0Var.m(j(bArr, I));
            i13 = I + 8;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float l(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i10, byte[] bArr, int i11, int i12, d0.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        xVar.l(l(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f7107a) {
                break;
            }
            xVar.l(l(bArr, I));
            i13 = I + 4;
        }
        return i13;
    }

    static int n(n1 n1Var, byte[] bArr, int i10, int i11, int i12, b bVar) {
        Object f10 = n1Var.f();
        int N = N(f10, n1Var, bArr, i10, i11, i12, bVar);
        n1Var.b(f10);
        bVar.f7109c = f10;
        return N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(n1 n1Var, int i10, byte[] bArr, int i11, int i12, d0.i<?> iVar, b bVar) {
        int i13 = (i10 & (-8)) | 4;
        int n10 = n(n1Var, bArr, i11, i12, i13, bVar);
        while (true) {
            iVar.add(bVar.f7109c);
            if (n10 >= i12) {
                break;
            }
            int I = I(bArr, n10, bVar);
            if (i10 != bVar.f7107a) {
                break;
            }
            n10 = n(n1Var, bArr, I, i12, i13, bVar);
        }
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(n1 n1Var, byte[] bArr, int i10, int i11, b bVar) {
        Object f10 = n1Var.f();
        int O = O(f10, n1Var, bArr, i10, i11, bVar);
        n1Var.b(f10);
        bVar.f7109c = f10;
        return O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(n1<?> n1Var, int i10, byte[] bArr, int i11, int i12, d0.i<?> iVar, b bVar) {
        int p10 = p(n1Var, bArr, i11, i12, bVar);
        while (true) {
            iVar.add(bVar.f7109c);
            if (p10 >= i12) {
                break;
            }
            int I = I(bArr, p10, bVar);
            if (i10 != bVar.f7107a) {
                break;
            }
            p10 = p(n1Var, bArr, I, i12, bVar);
        }
        return p10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(byte[] bArr, int i10, d0.i<?> iVar, b bVar) {
        g gVar = (g) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            gVar.m(bVar.f7108b != 0);
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(byte[] bArr, int i10, d0.i<?> iVar, b bVar) {
        n nVar = (n) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a + I;
        while (I < i11) {
            nVar.l(d(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(byte[] bArr, int i10, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a + I;
        while (I < i11) {
            c0Var.l(h(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(byte[] bArr, int i10, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a + I;
        while (I < i11) {
            m0Var.m(j(bArr, I));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(byte[] bArr, int i10, d0.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a + I;
        while (I < i11) {
            xVar.l(l(bArr, I));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(byte[] bArr, int i10, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            c0Var.l(j.b(bVar.f7107a));
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(byte[] bArr, int i10, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            m0Var.m(j.c(bVar.f7108b));
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(byte[] bArr, int i10, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            c0Var.l(bVar.f7107a);
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(byte[] bArr, int i10, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f7107a + I;
        while (I < i11) {
            I = L(bArr, I, bVar);
            m0Var.m(bVar.f7108b);
        }
        if (I == i11) {
            return I;
        }
        throw e0.m();
    }
}
