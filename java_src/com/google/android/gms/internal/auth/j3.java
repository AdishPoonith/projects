package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j3<T> implements s3<T> {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f4127o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    private static final Unsafe f4128p = u4.g();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f4129a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f4130b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4131c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4132d;

    /* renamed from: e  reason: collision with root package name */
    private final g3 f4133e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4134f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f4135g;

    /* renamed from: h  reason: collision with root package name */
    private final int f4136h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4137i;

    /* renamed from: j  reason: collision with root package name */
    private final u2 f4138j;

    /* renamed from: k  reason: collision with root package name */
    private final j4 f4139k;

    /* renamed from: l  reason: collision with root package name */
    private final x1 f4140l;

    /* renamed from: m  reason: collision with root package name */
    private final m3 f4141m;

    /* renamed from: n  reason: collision with root package name */
    private final b3 f4142n;

    private j3(int[] iArr, Object[] objArr, int i10, int i11, g3 g3Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, m3 m3Var, u2 u2Var, j4 j4Var, x1 x1Var, b3 b3Var, byte[] bArr) {
        this.f4129a = iArr;
        this.f4130b = objArr;
        this.f4131c = i10;
        this.f4132d = i11;
        this.f4134f = z10;
        this.f4135g = iArr2;
        this.f4136h = i12;
        this.f4137i = i13;
        this.f4141m = m3Var;
        this.f4138j = u2Var;
        this.f4139k = j4Var;
        this.f4140l = x1Var;
        this.f4133e = g3Var;
        this.f4142n = b3Var;
    }

    private final int A(int i10) {
        return this.f4129a[i10 + 2];
    }

    private final int B(int i10, int i11) {
        int length = (this.f4129a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f4129a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int C(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int D(int i10) {
        return this.f4129a[i10 + 1];
    }

    private static long E(Object obj, long j10) {
        return ((Long) u4.f(obj, j10)).longValue();
    }

    private final i2 F(int i10) {
        int i11 = i10 / 3;
        return (i2) this.f4130b[i11 + i11 + 1];
    }

    private final s3 G(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        s3 s3Var = (s3) this.f4130b[i12];
        if (s3Var != null) {
            return s3Var;
        }
        s3 b10 = p3.a().b((Class) this.f4130b[i12 + 1]);
        this.f4130b[i12] = b10;
        return b10;
    }

    private final Object H(int i10) {
        int i11 = i10 / 3;
        return this.f4130b[i11 + i11];
    }

    private static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void g(Object obj, Object obj2, int i10) {
        long D = D(i10) & 1048575;
        if (l(obj2, i10)) {
            Object f10 = u4.f(obj, D);
            Object f11 = u4.f(obj2, D);
            if (f10 != null && f11 != null) {
                f11 = k2.g(f10, f11);
            } else if (f11 == null) {
                return;
            }
            u4.p(obj, D, f11);
            i(obj, i10);
        }
    }

    private final void h(Object obj, Object obj2, int i10) {
        int D = D(i10);
        int i11 = this.f4129a[i10];
        long j10 = D & 1048575;
        if (o(obj2, i11, i10)) {
            Object f10 = o(obj, i11, i10) ? u4.f(obj, j10) : null;
            Object f11 = u4.f(obj2, j10);
            if (f10 != null && f11 != null) {
                f11 = k2.g(f10, f11);
            } else if (f11 == null) {
                return;
            }
            u4.p(obj, j10, f11);
            j(obj, i11, i10);
        }
    }

    private final void i(Object obj, int i10) {
        int A = A(i10);
        long j10 = 1048575 & A;
        if (j10 == 1048575) {
            return;
        }
        u4.n(obj, j10, (1 << (A >>> 20)) | u4.c(obj, j10));
    }

    private final void j(Object obj, int i10, int i11) {
        u4.n(obj, A(i11) & 1048575, i10);
    }

    private final boolean k(Object obj, Object obj2, int i10) {
        return l(obj, i10) == l(obj2, i10);
    }

    private final boolean l(Object obj, int i10) {
        int A = A(i10);
        long j10 = A & 1048575;
        if (j10 != 1048575) {
            return (u4.c(obj, j10) & (1 << (A >>> 20))) != 0;
        }
        int D = D(i10);
        long j11 = D & 1048575;
        switch (C(D)) {
            case 0:
                return Double.doubleToRawLongBits(u4.a(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(u4.b(obj, j11)) != 0;
            case 2:
                return u4.d(obj, j11) != 0;
            case 3:
                return u4.d(obj, j11) != 0;
            case 4:
                return u4.c(obj, j11) != 0;
            case 5:
                return u4.d(obj, j11) != 0;
            case 6:
                return u4.c(obj, j11) != 0;
            case 7:
                return u4.t(obj, j11);
            case 8:
                Object f10 = u4.f(obj, j11);
                if (f10 instanceof String) {
                    return !((String) f10).isEmpty();
                } else if (f10 instanceof q1) {
                    return !q1.f4223k.equals(f10);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return u4.f(obj, j11) != null;
            case 10:
                return !q1.f4223k.equals(u4.f(obj, j11));
            case 11:
                return u4.c(obj, j11) != 0;
            case 12:
                return u4.c(obj, j11) != 0;
            case 13:
                return u4.c(obj, j11) != 0;
            case 14:
                return u4.d(obj, j11) != 0;
            case 15:
                return u4.c(obj, j11) != 0;
            case 16:
                return u4.d(obj, j11) != 0;
            case 17:
                return u4.f(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean m(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? l(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean n(Object obj, int i10, s3 s3Var) {
        return s3Var.c(u4.f(obj, i10 & 1048575));
    }

    private final boolean o(Object obj, int i10, int i11) {
        return u4.c(obj, (long) (A(i11) & 1048575)) == i10;
    }

    static k4 q(Object obj) {
        g2 g2Var = (g2) obj;
        k4 k4Var = g2Var.zzc;
        if (k4Var == k4.a()) {
            k4 c10 = k4.c();
            g2Var.zzc = c10;
            return c10;
        }
        return k4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j3 r(Class cls, d3 d3Var, m3 m3Var, u2 u2Var, j4 j4Var, x1 x1Var, b3 b3Var) {
        if (d3Var instanceof r3) {
            return s((r3) d3Var, m3Var, u2Var, j4Var, x1Var, b3Var);
        }
        g4 g4Var = (g4) d3Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.auth.j3 s(com.google.android.gms.internal.auth.r3 r34, com.google.android.gms.internal.auth.m3 r35, com.google.android.gms.internal.auth.u2 r36, com.google.android.gms.internal.auth.j4 r37, com.google.android.gms.internal.auth.x1 r38, com.google.android.gms.internal.auth.b3 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.j3.s(com.google.android.gms.internal.auth.r3, com.google.android.gms.internal.auth.m3, com.google.android.gms.internal.auth.u2, com.google.android.gms.internal.auth.j4, com.google.android.gms.internal.auth.x1, com.google.android.gms.internal.auth.b3):com.google.android.gms.internal.auth.j3");
    }

    private static int t(Object obj, long j10) {
        return ((Integer) u4.f(obj, j10)).intValue();
    }

    private final int u(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, d1 d1Var) {
        Unsafe unsafe = f4128p;
        Object H = H(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((a3) object).g()) {
            a3 c10 = a3.a().c();
            b3.a(c10, object);
            unsafe.putObject(obj, j10, c10);
        }
        z2 z2Var = (z2) H;
        throw null;
    }

    private final int v(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, d1 d1Var) {
        int m10;
        long j11;
        int i18;
        Object valueOf;
        int j12;
        Object obj2;
        Unsafe unsafe = f4128p;
        long j13 = this.f4129a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(e1.n(bArr, i10))));
                    unsafe.putInt(obj, j13, i13);
                    return i10 + 8;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(e1.b(bArr, i10))));
                    unsafe.putInt(obj, j13, i13);
                    return i10 + 4;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    m10 = e1.m(bArr, i10, d1Var);
                    j11 = d1Var.f4036b;
                    valueOf = Long.valueOf(j11);
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j13, i13);
                    return m10;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    m10 = e1.j(bArr, i10, d1Var);
                    i18 = d1Var.f4035a;
                    valueOf = Integer.valueOf(i18);
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j13, i13);
                    return m10;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(e1.n(bArr, i10)));
                    unsafe.putInt(obj, j13, i13);
                    return i10 + 8;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(e1.b(bArr, i10)));
                    unsafe.putInt(obj, j13, i13);
                    return i10 + 4;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    m10 = e1.m(bArr, i10, d1Var);
                    valueOf = Boolean.valueOf(d1Var.f4036b != 0);
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j13, i13);
                    return m10;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    j12 = e1.j(bArr, i10, d1Var);
                    int i19 = d1Var.f4035a;
                    if (i19 == 0) {
                        obj2 = "";
                        unsafe.putObject(obj, j10, obj2);
                        unsafe.putInt(obj, j13, i13);
                        return j12;
                    } else if ((i15 & 536870912) == 0 || y4.d(bArr, j12, j12 + i19)) {
                        unsafe.putObject(obj, j10, new String(bArr, j12, i19, k2.f4144b));
                        j12 += i19;
                        unsafe.putInt(obj, j13, i13);
                        return j12;
                    } else {
                        throw m2.b();
                    }
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    j12 = e1.d(G(i17), bArr, i10, i11, d1Var);
                    Object object = unsafe.getInt(obj, j13) == i13 ? unsafe.getObject(obj, j10) : null;
                    obj2 = d1Var.f4037c;
                    if (object != null) {
                        obj2 = k2.g(object, obj2);
                    }
                    unsafe.putObject(obj, j10, obj2);
                    unsafe.putInt(obj, j13, i13);
                    return j12;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    m10 = e1.a(bArr, i10, d1Var);
                    valueOf = d1Var.f4037c;
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j13, i13);
                    return m10;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int j14 = e1.j(bArr, i10, d1Var);
                    int i20 = d1Var.f4035a;
                    i2 F = F(i17);
                    if (F == null || F.zza()) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i20));
                        unsafe.putInt(obj, j13, i13);
                    } else {
                        q(obj).f(i12, Long.valueOf(i20));
                    }
                    return j14;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    m10 = e1.j(bArr, i10, d1Var);
                    i18 = u1.a(d1Var.f4035a);
                    valueOf = Integer.valueOf(i18);
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j13, i13);
                    return m10;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    m10 = e1.m(bArr, i10, d1Var);
                    j11 = u1.b(d1Var.f4036b);
                    valueOf = Long.valueOf(j11);
                    unsafe.putObject(obj, j10, valueOf);
                    unsafe.putInt(obj, j13, i13);
                    return m10;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    j12 = e1.c(G(i17), bArr, i10, i11, (i12 & (-8)) | 4, d1Var);
                    Object object2 = unsafe.getInt(obj, j13) == i13 ? unsafe.getObject(obj, j10) : null;
                    obj2 = d1Var.f4037c;
                    if (object2 != null) {
                        obj2 = k2.g(object2, obj2);
                    }
                    unsafe.putObject(obj, j10, obj2);
                    unsafe.putInt(obj, j13, i13);
                    return j12;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02cf, code lost:
        if (r0 != r5) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d1, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e5, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0316, code lost:
        if (r0 != r15) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0337, code lost:
        if (r0 != r15) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int w(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.auth.d1 r35) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.j3.w(java.lang.Object, byte[], int, int, com.google.android.gms.internal.auth.d1):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0254, code lost:
        if (r29.f4036b != 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0256, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0258, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0259, code lost:
        r12.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x025c, code lost:
        if (r4 >= r19) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x025e, code lost:
        r6 = com.google.android.gms.internal.auth.e1.j(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0264, code lost:
        if (r20 == r29.f4035a) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0267, code lost:
        r4 = com.google.android.gms.internal.auth.e1.m(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x026f, code lost:
        if (r29.f4036b == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0272, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0122, code lost:
        if (r4 == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0124, code lost:
        r12.add(com.google.android.gms.internal.auth.q1.f4223k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012a, code lost:
        r12.add(com.google.android.gms.internal.auth.q1.t(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
        if (r1 >= r19) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0134, code lost:
        r4 = com.google.android.gms.internal.auth.e1.j(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013a, code lost:
        if (r20 == r29.f4035a) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
        r1 = com.google.android.gms.internal.auth.e1.j(r17, r4, r29);
        r4 = r29.f4035a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0143, code lost:
        if (r4 < 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0147, code lost:
        if (r4 > (r17.length - r1)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0149, code lost:
        if (r4 != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0150, code lost:
        throw com.google.android.gms.internal.auth.m2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0155, code lost:
        throw com.google.android.gms.internal.auth.m2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0156, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01b4 -> B:94:0x0193). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01e2 -> B:117:0x01e6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x01f8 -> B:112:0x01cf). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0258 -> B:153:0x0259). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x026f -> B:151:0x0256). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x012a -> B:65:0x0132). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0149 -> B:63:0x0124). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x019e -> B:97:0x01a2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int x(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.auth.d1 r29) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.j3.x(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.auth.d1):int");
    }

    private final int y(int i10) {
        if (i10 < this.f4131c || i10 > this.f4132d) {
            return -1;
        }
        return B(i10, 0);
    }

    private final int z(int i10, int i11) {
        if (i10 < this.f4131c || i10 > this.f4132d) {
            return -1;
        }
        return B(i10, i11);
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final void a(Object obj, byte[] bArr, int i10, int i11, d1 d1Var) {
        if (this.f4134f) {
            w(obj, bArr, i10, i11, d1Var);
        } else {
            p(obj, bArr, i10, i11, 0, d1Var);
        }
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final void b(Object obj) {
        int i10;
        int i11 = this.f4136h;
        while (true) {
            i10 = this.f4137i;
            if (i11 >= i10) {
                break;
            }
            long D = D(this.f4135g[i11]) & 1048575;
            Object f10 = u4.f(obj, D);
            if (f10 != null) {
                ((a3) f10).d();
                u4.p(obj, D, f10);
            }
            i11++;
        }
        int length = this.f4135g.length;
        while (i10 < length) {
            this.f4138j.a(obj, this.f4135g[i10]);
            i10++;
        }
        this.f4139k.e(obj);
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final boolean c(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f4136h) {
            int i15 = this.f4135g[i14];
            int i16 = this.f4129a[i15];
            int D = D(i15);
            int i17 = this.f4129a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f4128p.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & D) != 0 && !m(obj, i15, i10, i11, i19)) {
                return false;
            }
            int C = C(D);
            if (C != 9 && C != 17) {
                if (C != 27) {
                    if (C == 60 || C == 68) {
                        if (o(obj, i16, i15) && !n(obj, D, G(i15))) {
                            return false;
                        }
                    } else if (C != 49) {
                        if (C == 50 && !((a3) u4.f(obj, D & 1048575)).isEmpty()) {
                            z2 z2Var = (z2) H(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) u4.f(obj, D & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    s3 G = G(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!G.c(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m(obj, i15, i10, i11, i19) && !n(obj, D, G(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final boolean d(Object obj, Object obj2) {
        int length = this.f4129a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int D = D(i10);
            long j10 = D & 1048575;
            switch (C(D)) {
                case 0:
                    if (k(obj, obj2, i10) && Double.doubleToLongBits(u4.a(obj, j10)) == Double.doubleToLongBits(u4.a(obj2, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (k(obj, obj2, i10) && Float.floatToIntBits(u4.b(obj, j10)) == Float.floatToIntBits(u4.b(obj2, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (k(obj, obj2, i10) && u4.d(obj, j10) == u4.d(obj2, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (k(obj, obj2, i10) && u4.d(obj, j10) == u4.d(obj2, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (k(obj, obj2, i10) && u4.c(obj, j10) == u4.c(obj2, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (k(obj, obj2, i10) && u4.d(obj, j10) == u4.d(obj2, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (k(obj, obj2, i10) && u4.c(obj, j10) == u4.c(obj2, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (k(obj, obj2, i10) && u4.t(obj, j10) == u4.t(obj2, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (k(obj, obj2, i10) && u3.h(u4.f(obj, j10), u4.f(obj2, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (k(obj, obj2, i10) && u3.h(u4.f(obj, j10), u4.f(obj2, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (k(obj, obj2, i10) && u3.h(u4.f(obj, j10), u4.f(obj2, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (k(obj, obj2, i10) && u4.c(obj, j10) == u4.c(obj2, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (k(obj, obj2, i10) && u4.c(obj, j10) == u4.c(obj2, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (k(obj, obj2, i10) && u4.c(obj, j10) == u4.c(obj2, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (k(obj, obj2, i10) && u4.d(obj, j10) == u4.d(obj2, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (k(obj, obj2, i10) && u4.c(obj, j10) == u4.c(obj2, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (k(obj, obj2, i10) && u4.d(obj, j10) == u4.d(obj2, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (k(obj, obj2, i10) && u3.h(u4.f(obj, j10), u4.f(obj2, j10))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case f.j.f8330t3 /* 23 */:
                case f.j.f8335u3 /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case f.j.f8360z3 /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (u3.h(u4.f(obj, j10), u4.f(obj2, j10))) {
                        break;
                    } else {
                        return false;
                    }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long A = A(i10) & 1048575;
                    if (u4.c(obj, A) == u4.c(obj2, A) && u3.h(u4.f(obj, j10), u4.f(obj2, j10))) {
                        break;
                    }
                    return false;
            }
        }
        return this.f4139k.a(obj).equals(this.f4139k.a(obj2));
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final void e(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.f4129a.length; i10 += 3) {
            int D = D(i10);
            long j10 = 1048575 & D;
            int i11 = this.f4129a[i10];
            switch (C(D)) {
                case 0:
                    if (l(obj2, i10)) {
                        u4.l(obj, j10, u4.a(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (l(obj2, i10)) {
                        u4.m(obj, j10, u4.b(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.o(obj, j10, u4.d(obj2, j10));
                    i(obj, i10);
                    break;
                case 3:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.o(obj, j10, u4.d(obj2, j10));
                    i(obj, i10);
                    break;
                case 4:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.n(obj, j10, u4.c(obj2, j10));
                    i(obj, i10);
                    break;
                case 5:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.o(obj, j10, u4.d(obj2, j10));
                    i(obj, i10);
                    break;
                case 6:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.n(obj, j10, u4.c(obj2, j10));
                    i(obj, i10);
                    break;
                case 7:
                    if (l(obj2, i10)) {
                        u4.k(obj, j10, u4.t(obj2, j10));
                        i(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.p(obj, j10, u4.f(obj2, j10));
                    i(obj, i10);
                    break;
                case 9:
                case 17:
                    g(obj, obj2, i10);
                    break;
                case 10:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.p(obj, j10, u4.f(obj2, j10));
                    i(obj, i10);
                    break;
                case 11:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.n(obj, j10, u4.c(obj2, j10));
                    i(obj, i10);
                    break;
                case 12:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.n(obj, j10, u4.c(obj2, j10));
                    i(obj, i10);
                    break;
                case 13:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.n(obj, j10, u4.c(obj2, j10));
                    i(obj, i10);
                    break;
                case 14:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.o(obj, j10, u4.d(obj2, j10));
                    i(obj, i10);
                    break;
                case 15:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.n(obj, j10, u4.c(obj2, j10));
                    i(obj, i10);
                    break;
                case 16:
                    if (!l(obj2, i10)) {
                        break;
                    }
                    u4.o(obj, j10, u4.d(obj2, j10));
                    i(obj, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case f.j.f8330t3 /* 23 */:
                case f.j.f8335u3 /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case f.j.f8360z3 /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f4138j.b(obj, obj2, j10);
                    break;
                case 50:
                    u3.i(this.f4142n, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!o(obj2, i11, i10)) {
                        break;
                    }
                    u4.p(obj, j10, u4.f(obj2, j10));
                    j(obj, i11, i10);
                    break;
                case 60:
                case 68:
                    h(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!o(obj2, i11, i10)) {
                        break;
                    }
                    u4.p(obj, j10, u4.f(obj2, j10));
                    j(obj, i11, i10);
                    break;
            }
        }
        u3.f(this.f4139k, obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0336, code lost:
        if (r0 != r20) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0338, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r1 = r17;
        r2 = r19;
        r3 = r22;
        r5 = r23;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0350, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0371, code lost:
        if (r0 != r15) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0393, code lost:
        if (r0 != r15) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.auth.d1 r34) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.j3.p(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.d1):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00da, code lost:
        if (r3 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ec, code lost:
        if (r3 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ee, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.auth.s3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.j3.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final Object zzd() {
        return ((g2) this.f4133e).g(4, null, null);
    }
}
