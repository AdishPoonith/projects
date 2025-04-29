package com.google.android.gms.internal.p000firebaseauthapi;

import f.j;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z6  reason: invalid package */
/* loaded from: classes.dex */
public final class z6<T> implements j7<T> {

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f5756q = new int[0];

    /* renamed from: r  reason: collision with root package name */
    private static final Unsafe f5757r = o8.l();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f5758a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f5759b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5760c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5761d;

    /* renamed from: e  reason: collision with root package name */
    private final w6 f5762e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5763f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5764g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f5765h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f5766i;

    /* renamed from: j  reason: collision with root package name */
    private final int f5767j;

    /* renamed from: k  reason: collision with root package name */
    private final int f5768k;

    /* renamed from: l  reason: collision with root package name */
    private final k6 f5769l;

    /* renamed from: m  reason: collision with root package name */
    private final d8 f5770m;

    /* renamed from: n  reason: collision with root package name */
    private final f5 f5771n;

    /* renamed from: o  reason: collision with root package name */
    private final b7 f5772o;

    /* renamed from: p  reason: collision with root package name */
    private final r6 f5773p;

    private z6(int[] iArr, Object[] objArr, int i10, int i11, w6 w6Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, b7 b7Var, k6 k6Var, d8 d8Var, f5 f5Var, r6 r6Var) {
        this.f5758a = iArr;
        this.f5759b = objArr;
        this.f5760c = i10;
        this.f5761d = i11;
        this.f5764g = w6Var instanceof r5;
        this.f5765h = z10;
        boolean z12 = false;
        if (f5Var != null && f5Var.h(w6Var)) {
            z12 = true;
        }
        this.f5763f = z12;
        this.f5766i = iArr2;
        this.f5767j = i12;
        this.f5768k = i13;
        this.f5772o = b7Var;
        this.f5769l = k6Var;
        this.f5770m = d8Var;
        this.f5771n = f5Var;
        this.f5762e = w6Var;
        this.f5773p = r6Var;
    }

    private static boolean A(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof r5) {
            return ((r5) obj).p();
        }
        return true;
    }

    private final boolean B(Object obj, int i10, int i11) {
        return o8.h(obj, (long) (R(i11) & 1048575)) == i10;
    }

    private static boolean C(Object obj, long j10) {
        return ((Boolean) o8.k(obj, j10)).booleanValue();
    }

    private final void D(a5 a5Var, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        p6 p6Var = (p6) j(i11);
        throw null;
    }

    private static final void E(int i10, Object obj, a5 a5Var) {
        if (obj instanceof String) {
            a5Var.f(i10, (String) obj);
        } else {
            a5Var.o(i10, (m4) obj);
        }
    }

    static e8 G(Object obj) {
        r5 r5Var = (r5) obj;
        e8 e8Var = r5Var.zzc;
        if (e8Var == e8.c()) {
            e8 f10 = e8.f();
            r5Var.zzc = f10;
            return f10;
        }
        return e8Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.p000firebaseauthapi.z6 H(java.lang.Class r31, com.google.android.gms.internal.p000firebaseauthapi.t6 r32, com.google.android.gms.internal.p000firebaseauthapi.b7 r33, com.google.android.gms.internal.p000firebaseauthapi.k6 r34, com.google.android.gms.internal.p000firebaseauthapi.d8 r35, com.google.android.gms.internal.p000firebaseauthapi.f5 r36, com.google.android.gms.internal.p000firebaseauthapi.r6 r37) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.z6.H(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.t6, com.google.android.gms.internal.firebase-auth-api.b7, com.google.android.gms.internal.firebase-auth-api.k6, com.google.android.gms.internal.firebase-auth-api.d8, com.google.android.gms.internal.firebase-auth-api.f5, com.google.android.gms.internal.firebase-auth-api.r6):com.google.android.gms.internal.firebase-auth-api.z6");
    }

    private static double I(Object obj, long j10) {
        return ((Double) o8.k(obj, j10)).doubleValue();
    }

    private static float J(Object obj, long j10) {
        return ((Float) o8.k(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x020c, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0219, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0226, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0233, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0240, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024d, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024f, code lost:
        r4 = com.google.android.gms.internal.p000firebaseauthapi.z4.b(r11 << 3) + com.google.android.gms.internal.p000firebaseauthapi.z4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (B(r17, r11, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
        if (B(r17, r11, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (B(r17, r11, r5) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0118, code lost:
        if (B(r17, r11, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
        if (B(r17, r11, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0126, code lost:
        if (B(r17, r11, r5) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
        r4 = r11 << 3;
        r3 = com.google.android.gms.internal.p000firebaseauthapi.z4.A(L(r17, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013c, code lost:
        if (B(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
        if (B(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0145, code lost:
        r3 = com.google.android.gms.internal.p000firebaseauthapi.z4.c(f(r17, r3));
        r4 = com.google.android.gms.internal.p000firebaseauthapi.z4.b(r11 << 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0159, code lost:
        if (B(r17, r11, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015b, code lost:
        r3 = com.google.android.gms.internal.p000firebaseauthapi.z4.b(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
        if (B(r17, r11, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
        r3 = com.google.android.gms.internal.p000firebaseauthapi.z4.b(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019c, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01aa, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b8, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c6, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d4, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e2, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f2, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ff, code lost:
        if (r3 > 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int K(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.z6.K(java.lang.Object):int");
    }

    private static int L(Object obj, long j10) {
        return ((Integer) o8.k(obj, j10)).intValue();
    }

    private final int M(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, y3 y3Var) {
        Unsafe unsafe = f5757r;
        Object j11 = j(i12);
        Object object = unsafe.getObject(obj, j10);
        if (r6.b(object)) {
            q6 c10 = q6.a().c();
            r6.c(c10, object);
            unsafe.putObject(obj, j10, c10);
        }
        p6 p6Var = (p6) j11;
        throw null;
    }

    private final int N(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, y3 y3Var) {
        Unsafe unsafe = f5757r;
        long j11 = this.f5758a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(z3.p(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(z3.b(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int m10 = z3.m(bArr, i10, y3Var);
                    unsafe.putObject(obj, j10, Long.valueOf(y3Var.f5695b));
                    unsafe.putInt(obj, j11, i13);
                    return m10;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int j12 = z3.j(bArr, i10, y3Var);
                    unsafe.putObject(obj, j10, Integer.valueOf(y3Var.f5694a));
                    unsafe.putInt(obj, j11, i13);
                    return j12;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(z3.p(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(z3.b(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int m11 = z3.m(bArr, i10, y3Var);
                    unsafe.putObject(obj, j10, Boolean.valueOf(y3Var.f5695b != 0));
                    unsafe.putInt(obj, j11, i13);
                    return m11;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int j13 = z3.j(bArr, i10, y3Var);
                    int i22 = y3Var.f5694a;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i15 & 536870912) != 0 && !t8.f(bArr, j13, j13 + i22)) {
                        throw z5.d();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, j13, i22, x5.f5626b));
                        j13 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return j13;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object l10 = l(obj, i13, i17);
                    int o10 = z3.o(l10, h(i17), bArr, i10, i11, y3Var);
                    u(obj, i13, i17, l10);
                    return o10;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int a10 = z3.a(bArr, i10, y3Var);
                    unsafe.putObject(obj, j10, y3Var.f5696c);
                    unsafe.putInt(obj, j11, i13);
                    return a10;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int j14 = z3.j(bArr, i10, y3Var);
                    int i23 = y3Var.f5694a;
                    v5 g10 = g(i17);
                    if (g10 == null || g10.zza()) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i23));
                        unsafe.putInt(obj, j11, i13);
                    } else {
                        G(obj).j(i12, Long.valueOf(i23));
                    }
                    return j14;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int j15 = z3.j(bArr, i10, y3Var);
                    unsafe.putObject(obj, j10, Integer.valueOf(s4.e(y3Var.f5694a)));
                    unsafe.putInt(obj, j11, i13);
                    return j15;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int m12 = z3.m(bArr, i10, y3Var);
                    unsafe.putObject(obj, j10, Long.valueOf(s4.f(y3Var.f5695b)));
                    unsafe.putInt(obj, j11, i13);
                    return m12;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object l11 = l(obj, i13, i17);
                    int n10 = z3.n(l11, h(i17), bArr, i10, i11, (i12 & (-8)) | 4, y3Var);
                    u(obj, i13, i17, l11);
                    return n10;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x024a, code lost:
        if (r29.f5695b != 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x024c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x024e, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x024f, code lost:
        r12.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0252, code lost:
        if (r4 >= r19) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0254, code lost:
        r6 = com.google.android.gms.internal.p000firebaseauthapi.z3.j(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x025a, code lost:
        if (r20 == r29.f5694a) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x025d, code lost:
        r4 = com.google.android.gms.internal.p000firebaseauthapi.z3.m(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0265, code lost:
        if (r29.f5695b == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0268, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r4 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        r12.add(com.google.android.gms.internal.p000firebaseauthapi.m4.f4993k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r12.add(com.google.android.gms.internal.p000firebaseauthapi.m4.w(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1 >= r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r4 = com.google.android.gms.internal.p000firebaseauthapi.z3.j(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r20 == r29.f5694a) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = com.google.android.gms.internal.p000firebaseauthapi.z3.j(r17, r4, r29);
        r4 = r29.f5694a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
        if (r4 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
        if (r4 > (r17.length - r1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
        if (r4 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
        throw com.google.android.gms.internal.p000firebaseauthapi.z5.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw com.google.android.gms.internal.p000firebaseauthapi.z5.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x01d9 -> B:110:0x01dd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01ef -> B:105:0x01c6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x024e -> B:146:0x024f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0265 -> B:144:0x024c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0123 -> B:59:0x012b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0142 -> B:57:0x011d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0195 -> B:90:0x0199). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01ab -> B:87:0x018a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int O(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.p000firebaseauthapi.y3 r29) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.z6.O(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.firebase-auth-api.y3):int");
    }

    private final int P(int i10) {
        if (i10 < this.f5760c || i10 > this.f5761d) {
            return -1;
        }
        return S(i10, 0);
    }

    private final int Q(int i10, int i11) {
        if (i10 < this.f5760c || i10 > this.f5761d) {
            return -1;
        }
        return S(i10, i11);
    }

    private final int R(int i10) {
        return this.f5758a[i10 + 2];
    }

    private final int S(int i10, int i11) {
        int length = (this.f5758a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f5758a[i13];
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

    private static int T(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int U(int i10) {
        return this.f5758a[i10 + 1];
    }

    private static long f(Object obj, long j10) {
        return ((Long) o8.k(obj, j10)).longValue();
    }

    private final v5 g(int i10) {
        int i11 = i10 / 3;
        return (v5) this.f5759b[i11 + i11 + 1];
    }

    private final j7 h(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        j7 j7Var = (j7) this.f5759b[i12];
        if (j7Var != null) {
            return j7Var;
        }
        j7 b10 = e7.a().b((Class) this.f5759b[i12 + 1]);
        this.f5759b[i12] = b10;
        return b10;
    }

    private final Object i(Object obj, int i10, Object obj2, d8 d8Var, Object obj3) {
        int i11 = this.f5758a[i10];
        Object k10 = o8.k(obj, U(i10) & 1048575);
        if (k10 == null || g(i10) == null) {
            return obj2;
        }
        q6 q6Var = (q6) k10;
        p6 p6Var = (p6) j(i10);
        throw null;
    }

    private final Object j(int i10) {
        int i11 = i10 / 3;
        return this.f5759b[i11 + i11];
    }

    private final Object k(Object obj, int i10) {
        j7 h10 = h(i10);
        int U = U(i10) & 1048575;
        if (x(obj, i10)) {
            Object object = f5757r.getObject(obj, U);
            if (A(object)) {
                return object;
            }
            Object zze = h10.zze();
            if (object != null) {
                h10.zzg(zze, object);
            }
            return zze;
        }
        return h10.zze();
    }

    private final Object l(Object obj, int i10, int i11) {
        j7 h10 = h(i11);
        if (B(obj, i10, i11)) {
            Object object = f5757r.getObject(obj, U(i11) & 1048575);
            if (A(object)) {
                return object;
            }
            Object zze = h10.zze();
            if (object != null) {
                h10.zzg(zze, object);
            }
            return zze;
        }
        return h10.zze();
    }

    private static Field m(Class cls, String str) {
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

    private static void n(Object obj) {
        if (!A(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void o(Object obj, Object obj2, int i10) {
        if (x(obj2, i10)) {
            Unsafe unsafe = f5757r;
            long U = U(i10) & 1048575;
            Object object = unsafe.getObject(obj2, U);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5758a[i10] + " is present but null: " + obj2.toString());
            }
            j7 h10 = h(i10);
            if (!x(obj, i10)) {
                if (A(object)) {
                    Object zze = h10.zze();
                    h10.zzg(zze, object);
                    unsafe.putObject(obj, U, zze);
                } else {
                    unsafe.putObject(obj, U, object);
                }
                r(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, U);
            if (!A(object2)) {
                Object zze2 = h10.zze();
                h10.zzg(zze2, object2);
                unsafe.putObject(obj, U, zze2);
                object2 = zze2;
            }
            h10.zzg(object2, object);
        }
    }

    private final void p(Object obj, Object obj2, int i10) {
        int i11 = this.f5758a[i10];
        if (B(obj2, i11, i10)) {
            Unsafe unsafe = f5757r;
            long U = U(i10) & 1048575;
            Object object = unsafe.getObject(obj2, U);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5758a[i10] + " is present but null: " + obj2.toString());
            }
            j7 h10 = h(i10);
            if (!B(obj, i11, i10)) {
                if (A(object)) {
                    Object zze = h10.zze();
                    h10.zzg(zze, object);
                    unsafe.putObject(obj, U, zze);
                } else {
                    unsafe.putObject(obj, U, object);
                }
                s(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, U);
            if (!A(object2)) {
                Object zze2 = h10.zze();
                h10.zzg(zze2, object2);
                unsafe.putObject(obj, U, zze2);
                object2 = zze2;
            }
            h10.zzg(object2, object);
        }
    }

    private final void q(Object obj, int i10, i7 i7Var) {
        int i11;
        Object zzr;
        if (w(i10)) {
            i11 = i10 & 1048575;
            zzr = i7Var.zzs();
        } else {
            i11 = i10 & 1048575;
            zzr = this.f5764g ? i7Var.zzr() : i7Var.zzp();
        }
        o8.x(obj, i11, zzr);
    }

    private final void r(Object obj, int i10) {
        int R = R(i10);
        long j10 = 1048575 & R;
        if (j10 == 1048575) {
            return;
        }
        o8.v(obj, j10, (1 << (R >>> 20)) | o8.h(obj, j10));
    }

    private final void s(Object obj, int i10, int i11) {
        o8.v(obj, R(i11) & 1048575, i10);
    }

    private final void t(Object obj, int i10, Object obj2) {
        f5757r.putObject(obj, U(i10) & 1048575, obj2);
        r(obj, i10);
    }

    private final void u(Object obj, int i10, int i11, Object obj2) {
        f5757r.putObject(obj, U(i11) & 1048575, obj2);
        s(obj, i10, i11);
    }

    private final boolean v(Object obj, Object obj2, int i10) {
        return x(obj, i10) == x(obj2, i10);
    }

    private static boolean w(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean x(Object obj, int i10) {
        int R = R(i10);
        long j10 = R & 1048575;
        if (j10 != 1048575) {
            return (o8.h(obj, j10) & (1 << (R >>> 20))) != 0;
        }
        int U = U(i10);
        long j11 = U & 1048575;
        switch (T(U)) {
            case 0:
                return Double.doubleToRawLongBits(o8.f(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(o8.g(obj, j11)) != 0;
            case 2:
                return o8.i(obj, j11) != 0;
            case 3:
                return o8.i(obj, j11) != 0;
            case 4:
                return o8.h(obj, j11) != 0;
            case 5:
                return o8.i(obj, j11) != 0;
            case 6:
                return o8.h(obj, j11) != 0;
            case 7:
                return o8.B(obj, j11);
            case 8:
                Object k10 = o8.k(obj, j11);
                if (k10 instanceof String) {
                    return !((String) k10).isEmpty();
                } else if (k10 instanceof m4) {
                    return !m4.f4993k.equals(k10);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return o8.k(obj, j11) != null;
            case 10:
                return !m4.f4993k.equals(o8.k(obj, j11));
            case 11:
                return o8.h(obj, j11) != 0;
            case 12:
                return o8.h(obj, j11) != 0;
            case 13:
                return o8.h(obj, j11) != 0;
            case 14:
                return o8.i(obj, j11) != 0;
            case 15:
                return o8.h(obj, j11) != 0;
            case 16:
                return o8.i(obj, j11) != 0;
            case 17:
                return o8.k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean y(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? x(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean z(Object obj, int i10, j7 j7Var) {
        return j7Var.e(o8.k(obj, i10 & 1048575));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0401, code lost:
        if (r0 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0403, code lost:
        r26.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0409, code lost:
        r10 = r8.f5767j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x040e, code lost:
        if (r10 >= r8.f5768k) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0410, code lost:
        i(r28, r8.f5766i[r10], null, r8.f5770m, r28);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0425, code lost:
        if (r9 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0427, code lost:
        if (r6 != r31) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x042e, code lost:
        throw com.google.android.gms.internal.p000firebaseauthapi.z5.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x042f, code lost:
        if (r6 > r31) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0431, code lost:
        if (r7 != r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0433, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0438, code lost:
        throw com.google.android.gms.internal.p000firebaseauthapi.z5.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.p000firebaseauthapi.y3 r33) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.z6.F(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.y3):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ea, code lost:
        if (r0 != r24) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ec, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0329, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034a, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.p000firebaseauthapi.y3 r35) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.z6.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.y3):void");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final void b(Object obj, a5 a5Var) {
        int i10;
        double f10;
        float g10;
        long i11;
        long i12;
        int h10;
        long i13;
        int h11;
        boolean B;
        int h12;
        int h13;
        int h14;
        long i14;
        int h15;
        long i15;
        int i16 = 1048575;
        if (this.f5765h) {
            if (this.f5763f) {
                this.f5771n.a(obj);
                throw null;
            }
            int length = this.f5758a.length;
            for (int i17 = 0; i17 < length; i17 += 3) {
                int U = U(i17);
                int i18 = this.f5758a[i17];
                switch (T(U)) {
                    case 0:
                        if (x(obj, i17)) {
                            f10 = o8.f(obj, U & 1048575);
                            a5Var.q(i18, f10);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (x(obj, i17)) {
                            g10 = o8.g(obj, U & 1048575);
                            a5Var.z(i18, g10);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (x(obj, i17)) {
                            i11 = o8.i(obj, U & 1048575);
                            a5Var.E(i18, i11);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (x(obj, i17)) {
                            i12 = o8.i(obj, U & 1048575);
                            a5Var.j(i18, i12);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (x(obj, i17)) {
                            h10 = o8.h(obj, U & 1048575);
                            a5Var.C(i18, h10);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (x(obj, i17)) {
                            i13 = o8.i(obj, U & 1048575);
                            a5Var.x(i18, i13);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (x(obj, i17)) {
                            h11 = o8.h(obj, U & 1048575);
                            a5Var.v(i18, h11);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (x(obj, i17)) {
                            B = o8.B(obj, U & 1048575);
                            a5Var.m(i18, B);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!x(obj, i17)) {
                            break;
                        }
                        E(i18, o8.k(obj, U & 1048575), a5Var);
                        break;
                    case 9:
                        if (!x(obj, i17)) {
                            break;
                        }
                        a5Var.G(i18, o8.k(obj, U & 1048575), h(i17));
                        break;
                    case 10:
                        if (!x(obj, i17)) {
                            break;
                        }
                        a5Var.o(i18, (m4) o8.k(obj, U & 1048575));
                        break;
                    case 11:
                        if (x(obj, i17)) {
                            h12 = o8.h(obj, U & 1048575);
                            a5Var.h(i18, h12);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (x(obj, i17)) {
                            h13 = o8.h(obj, U & 1048575);
                            a5Var.t(i18, h13);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (x(obj, i17)) {
                            h14 = o8.h(obj, U & 1048575);
                            a5Var.H(i18, h14);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (x(obj, i17)) {
                            i14 = o8.i(obj, U & 1048575);
                            a5Var.J(i18, i14);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (x(obj, i17)) {
                            h15 = o8.h(obj, U & 1048575);
                            a5Var.a(i18, h15);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (x(obj, i17)) {
                            i15 = o8.i(obj, U & 1048575);
                            a5Var.c(i18, i15);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!x(obj, i17)) {
                            break;
                        }
                        a5Var.B(i18, o8.k(obj, U & 1048575), h(i17));
                        break;
                    case 18:
                        l7.h(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 19:
                        l7.l(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 20:
                        l7.o(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 21:
                        l7.w(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 22:
                        l7.n(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case j.f8330t3 /* 23 */:
                        l7.k(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case j.f8335u3 /* 24 */:
                        l7.j(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 25:
                        l7.f(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 26:
                        l7.u(i18, (List) o8.k(obj, U & 1048575), a5Var);
                        break;
                    case 27:
                        l7.p(i18, (List) o8.k(obj, U & 1048575), a5Var, h(i17));
                        break;
                    case 28:
                        l7.g(i18, (List) o8.k(obj, U & 1048575), a5Var);
                        break;
                    case j.f8360z3 /* 29 */:
                        l7.v(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 30:
                        l7.i(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 31:
                        l7.q(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 32:
                        l7.r(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 33:
                        l7.s(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 34:
                        l7.t(i18, (List) o8.k(obj, U & 1048575), a5Var, false);
                        break;
                    case 35:
                        l7.h(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 36:
                        l7.l(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 37:
                        l7.o(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 38:
                        l7.w(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 39:
                        l7.n(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 40:
                        l7.k(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 41:
                        l7.j(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 42:
                        l7.f(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 43:
                        l7.v(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 44:
                        l7.i(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 45:
                        l7.q(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 46:
                        l7.r(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 47:
                        l7.s(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 48:
                        l7.t(i18, (List) o8.k(obj, U & 1048575), a5Var, true);
                        break;
                    case 49:
                        l7.m(i18, (List) o8.k(obj, U & 1048575), a5Var, h(i17));
                        break;
                    case 50:
                        D(a5Var, i18, o8.k(obj, U & 1048575), i17);
                        break;
                    case 51:
                        if (B(obj, i18, i17)) {
                            f10 = I(obj, U & 1048575);
                            a5Var.q(i18, f10);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (B(obj, i18, i17)) {
                            g10 = J(obj, U & 1048575);
                            a5Var.z(i18, g10);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (B(obj, i18, i17)) {
                            i11 = f(obj, U & 1048575);
                            a5Var.E(i18, i11);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (B(obj, i18, i17)) {
                            i12 = f(obj, U & 1048575);
                            a5Var.j(i18, i12);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (B(obj, i18, i17)) {
                            h10 = L(obj, U & 1048575);
                            a5Var.C(i18, h10);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (B(obj, i18, i17)) {
                            i13 = f(obj, U & 1048575);
                            a5Var.x(i18, i13);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (B(obj, i18, i17)) {
                            h11 = L(obj, U & 1048575);
                            a5Var.v(i18, h11);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (B(obj, i18, i17)) {
                            B = C(obj, U & 1048575);
                            a5Var.m(i18, B);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!B(obj, i18, i17)) {
                            break;
                        }
                        E(i18, o8.k(obj, U & 1048575), a5Var);
                        break;
                    case 60:
                        if (!B(obj, i18, i17)) {
                            break;
                        }
                        a5Var.G(i18, o8.k(obj, U & 1048575), h(i17));
                        break;
                    case 61:
                        if (!B(obj, i18, i17)) {
                            break;
                        }
                        a5Var.o(i18, (m4) o8.k(obj, U & 1048575));
                        break;
                    case 62:
                        if (B(obj, i18, i17)) {
                            h12 = L(obj, U & 1048575);
                            a5Var.h(i18, h12);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (B(obj, i18, i17)) {
                            h13 = L(obj, U & 1048575);
                            a5Var.t(i18, h13);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (B(obj, i18, i17)) {
                            h14 = L(obj, U & 1048575);
                            a5Var.H(i18, h14);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (B(obj, i18, i17)) {
                            i14 = f(obj, U & 1048575);
                            a5Var.J(i18, i14);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (B(obj, i18, i17)) {
                            h15 = L(obj, U & 1048575);
                            a5Var.a(i18, h15);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (B(obj, i18, i17)) {
                            i15 = f(obj, U & 1048575);
                            a5Var.c(i18, i15);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!B(obj, i18, i17)) {
                            break;
                        }
                        a5Var.B(i18, o8.k(obj, U & 1048575), h(i17));
                        break;
                }
            }
        } else if (this.f5763f) {
            this.f5771n.a(obj);
            throw null;
        } else {
            int length2 = this.f5758a.length;
            Unsafe unsafe = f5757r;
            int i19 = 0;
            int i20 = 1048575;
            int i21 = 0;
            while (i19 < length2) {
                int U2 = U(i19);
                int[] iArr = this.f5758a;
                int i22 = iArr[i19];
                int T = T(U2);
                if (T <= 17) {
                    int i23 = iArr[i19 + 2];
                    int i24 = i23 & i16;
                    if (i24 != i20) {
                        i21 = unsafe.getInt(obj, i24);
                        i20 = i24;
                    }
                    i10 = 1 << (i23 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = U2 & i16;
                switch (T) {
                    case 0:
                        if ((i21 & i10) != 0) {
                            a5Var.q(i22, o8.f(obj, j10));
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 1:
                        if ((i21 & i10) != 0) {
                            a5Var.z(i22, o8.g(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 2:
                        if ((i21 & i10) != 0) {
                            a5Var.E(i22, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 3:
                        if ((i21 & i10) != 0) {
                            a5Var.j(i22, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 4:
                        if ((i21 & i10) != 0) {
                            a5Var.C(i22, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 5:
                        if ((i21 & i10) != 0) {
                            a5Var.x(i22, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 6:
                        if ((i21 & i10) != 0) {
                            a5Var.v(i22, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 7:
                        if ((i21 & i10) != 0) {
                            a5Var.m(i22, o8.B(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 8:
                        if ((i21 & i10) != 0) {
                            E(i22, unsafe.getObject(obj, j10), a5Var);
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 9:
                        if ((i21 & i10) != 0) {
                            a5Var.G(i22, unsafe.getObject(obj, j10), h(i19));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 10:
                        if ((i21 & i10) != 0) {
                            a5Var.o(i22, (m4) unsafe.getObject(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 11:
                        if ((i21 & i10) != 0) {
                            a5Var.h(i22, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 12:
                        if ((i21 & i10) != 0) {
                            a5Var.t(i22, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 13:
                        if ((i21 & i10) != 0) {
                            a5Var.H(i22, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 14:
                        if ((i21 & i10) != 0) {
                            a5Var.J(i22, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 15:
                        if ((i21 & i10) != 0) {
                            a5Var.a(i22, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 16:
                        if ((i21 & i10) != 0) {
                            a5Var.c(i22, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 17:
                        if ((i21 & i10) != 0) {
                            a5Var.B(i22, unsafe.getObject(obj, j10), h(i19));
                        } else {
                            continue;
                        }
                        i19 += 3;
                        i16 = 1048575;
                    case 18:
                        l7.h(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        continue;
                        i19 += 3;
                        i16 = 1048575;
                    case 19:
                        l7.l(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        continue;
                        i19 += 3;
                        i16 = 1048575;
                    case 20:
                        l7.o(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        continue;
                        i19 += 3;
                        i16 = 1048575;
                    case 21:
                        l7.w(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        continue;
                        i19 += 3;
                        i16 = 1048575;
                    case 22:
                        l7.n(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        continue;
                        i19 += 3;
                        i16 = 1048575;
                    case j.f8330t3 /* 23 */:
                        l7.k(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        continue;
                        i19 += 3;
                        i16 = 1048575;
                    case j.f8335u3 /* 24 */:
                        l7.j(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        continue;
                        i19 += 3;
                        i16 = 1048575;
                    case 25:
                        l7.f(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        continue;
                        i19 += 3;
                        i16 = 1048575;
                    case 26:
                        l7.u(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var);
                        break;
                    case 27:
                        l7.p(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, h(i19));
                        break;
                    case 28:
                        l7.g(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var);
                        break;
                    case j.f8360z3 /* 29 */:
                        l7.v(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        break;
                    case 30:
                        l7.i(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        break;
                    case 31:
                        l7.q(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        break;
                    case 32:
                        l7.r(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        break;
                    case 33:
                        l7.s(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        break;
                    case 34:
                        l7.t(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, false);
                        break;
                    case 35:
                        l7.h(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 36:
                        l7.l(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 37:
                        l7.o(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 38:
                        l7.w(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 39:
                        l7.n(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 40:
                        l7.k(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 41:
                        l7.j(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 42:
                        l7.f(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 43:
                        l7.v(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 44:
                        l7.i(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 45:
                        l7.q(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 46:
                        l7.r(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 47:
                        l7.s(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 48:
                        l7.t(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, true);
                        break;
                    case 49:
                        l7.m(this.f5758a[i19], (List) unsafe.getObject(obj, j10), a5Var, h(i19));
                        break;
                    case 50:
                        D(a5Var, i22, unsafe.getObject(obj, j10), i19);
                        break;
                    case 51:
                        if (B(obj, i22, i19)) {
                            a5Var.q(i22, I(obj, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (B(obj, i22, i19)) {
                            a5Var.z(i22, J(obj, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (B(obj, i22, i19)) {
                            a5Var.E(i22, f(obj, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (B(obj, i22, i19)) {
                            a5Var.j(i22, f(obj, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (B(obj, i22, i19)) {
                            a5Var.C(i22, L(obj, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (B(obj, i22, i19)) {
                            a5Var.x(i22, f(obj, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (B(obj, i22, i19)) {
                            a5Var.v(i22, L(obj, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (B(obj, i22, i19)) {
                            a5Var.m(i22, C(obj, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (B(obj, i22, i19)) {
                            E(i22, unsafe.getObject(obj, j10), a5Var);
                            break;
                        }
                        break;
                    case 60:
                        if (B(obj, i22, i19)) {
                            a5Var.G(i22, unsafe.getObject(obj, j10), h(i19));
                            break;
                        }
                        break;
                    case 61:
                        if (B(obj, i22, i19)) {
                            a5Var.o(i22, (m4) unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (B(obj, i22, i19)) {
                            a5Var.h(i22, L(obj, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (B(obj, i22, i19)) {
                            a5Var.t(i22, L(obj, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (B(obj, i22, i19)) {
                            a5Var.H(i22, L(obj, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (B(obj, i22, i19)) {
                            a5Var.J(i22, f(obj, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (B(obj, i22, i19)) {
                            a5Var.a(i22, L(obj, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (B(obj, i22, i19)) {
                            a5Var.c(i22, f(obj, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (B(obj, i22, i19)) {
                            a5Var.B(i22, unsafe.getObject(obj, j10), h(i19));
                            break;
                        }
                        break;
                }
                i19 += 3;
                i16 = 1048575;
            }
        }
        d8 d8Var = this.f5770m;
        d8Var.r(d8Var.d(obj), a5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x05af A[Catch: all -> 0x05a4, TryCatch #1 {all -> 0x05a4, blocks: (B:171:0x057d, B:185:0x05aa, B:187:0x05af, B:188:0x05b4), top: B:213:0x057d }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05e7 A[LOOP:2: B:203:0x05e3->B:205:0x05e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05ba A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r18, com.google.android.gms.internal.p000firebaseauthapi.i7 r19, com.google.android.gms.internal.p000firebaseauthapi.e5 r20) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.z6.c(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.i7, com.google.android.gms.internal.firebase-auth-api.e5):void");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final boolean d(Object obj, Object obj2) {
        int length = this.f5758a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int U = U(i10);
            long j10 = U & 1048575;
            switch (T(U)) {
                case 0:
                    if (v(obj, obj2, i10) && Double.doubleToLongBits(o8.f(obj, j10)) == Double.doubleToLongBits(o8.f(obj2, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (v(obj, obj2, i10) && Float.floatToIntBits(o8.g(obj, j10)) == Float.floatToIntBits(o8.g(obj2, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (v(obj, obj2, i10) && o8.i(obj, j10) == o8.i(obj2, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (v(obj, obj2, i10) && o8.i(obj, j10) == o8.i(obj2, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (v(obj, obj2, i10) && o8.h(obj, j10) == o8.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (v(obj, obj2, i10) && o8.i(obj, j10) == o8.i(obj2, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (v(obj, obj2, i10) && o8.h(obj, j10) == o8.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (v(obj, obj2, i10) && o8.B(obj, j10) == o8.B(obj2, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (v(obj, obj2, i10) && l7.e(o8.k(obj, j10), o8.k(obj2, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (v(obj, obj2, i10) && l7.e(o8.k(obj, j10), o8.k(obj2, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (v(obj, obj2, i10) && l7.e(o8.k(obj, j10), o8.k(obj2, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (v(obj, obj2, i10) && o8.h(obj, j10) == o8.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (v(obj, obj2, i10) && o8.h(obj, j10) == o8.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (v(obj, obj2, i10) && o8.h(obj, j10) == o8.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (v(obj, obj2, i10) && o8.i(obj, j10) == o8.i(obj2, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (v(obj, obj2, i10) && o8.h(obj, j10) == o8.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (v(obj, obj2, i10) && o8.i(obj, j10) == o8.i(obj2, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (v(obj, obj2, i10) && l7.e(o8.k(obj, j10), o8.k(obj2, j10))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case j.f8330t3 /* 23 */:
                case j.f8335u3 /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case j.f8360z3 /* 29 */:
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
                    if (l7.e(o8.k(obj, j10), o8.k(obj2, j10))) {
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
                    long R = R(i10) & 1048575;
                    if (o8.h(obj, R) == o8.h(obj2, R) && l7.e(o8.k(obj, j10), o8.k(obj2, j10))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.f5770m.d(obj).equals(this.f5770m.d(obj2))) {
            if (this.f5763f) {
                this.f5771n.a(obj);
                this.f5771n.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final boolean e(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f5767j) {
            int i15 = this.f5766i[i14];
            int i16 = this.f5758a[i15];
            int U = U(i15);
            int i17 = this.f5758a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f5757r.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & U) != 0 && !y(obj, i15, i10, i11, i19)) {
                return false;
            }
            int T = T(U);
            if (T != 9 && T != 17) {
                if (T != 27) {
                    if (T == 60 || T == 68) {
                        if (B(obj, i16, i15) && !z(obj, U, h(i15))) {
                            return false;
                        }
                    } else if (T != 49) {
                        if (T == 50 && !((q6) o8.k(obj, U & 1048575)).isEmpty()) {
                            p6 p6Var = (p6) j(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) o8.k(obj, U & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    j7 h10 = h(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!h10.e(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (y(obj, i15, i10, i11, i19) && !z(obj, U, h(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (this.f5763f) {
            this.f5771n.a(obj);
            throw null;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x031b, code lost:
        if ((r4 instanceof com.google.android.gms.internal.p000firebaseauthapi.m4) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x031e, code lost:
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.p000firebaseauthapi.z4.C((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        if ((r4 instanceof com.google.android.gms.internal.p000firebaseauthapi.m4) != false) goto L54;
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.z6.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
        if (r3 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
        if (r3 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e7, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.z6.zzb(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final Object zze() {
        return ((r5) this.f5762e).y();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final void zzf(Object obj) {
        int i10;
        if (A(obj)) {
            if (obj instanceof r5) {
                r5 r5Var = (r5) obj;
                r5Var.n(Integer.MAX_VALUE);
                r5Var.zza = 0;
                r5Var.l();
            }
            int length = this.f5758a.length;
            while (i10 < length) {
                int U = U(i10);
                int i11 = 1048575 & U;
                int T = T(U);
                long j10 = i11;
                if (T != 9) {
                    if (T != 60 && T != 68) {
                        switch (T) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case j.f8330t3 /* 23 */:
                            case j.f8335u3 /* 24 */:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case j.f8360z3 /* 29 */:
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
                                this.f5769l.b(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = f5757r;
                                Object object = unsafe.getObject(obj, j10);
                                if (object == null) {
                                    break;
                                } else {
                                    ((q6) object).d();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                }
                        }
                    } else {
                        if (!B(obj, this.f5758a[i10], i10)) {
                        }
                        h(i10).zzf(f5757r.getObject(obj, j10));
                    }
                }
                i10 = x(obj, i10) ? 0 : i10 + 3;
                h(i10).zzf(f5757r.getObject(obj, j10));
            }
            this.f5770m.m(obj);
            if (this.f5763f) {
                this.f5771n.e(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final void zzg(Object obj, Object obj2) {
        n(obj);
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.f5758a.length; i10 += 3) {
            int U = U(i10);
            int i11 = this.f5758a[i10];
            long j10 = 1048575 & U;
            switch (T(U)) {
                case 0:
                    if (x(obj2, i10)) {
                        o8.t(obj, j10, o8.f(obj2, j10));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(obj2, i10)) {
                        o8.u(obj, j10, o8.g(obj2, j10));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.w(obj, j10, o8.i(obj2, j10));
                    r(obj, i10);
                    break;
                case 3:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.w(obj, j10, o8.i(obj2, j10));
                    r(obj, i10);
                    break;
                case 4:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.v(obj, j10, o8.h(obj2, j10));
                    r(obj, i10);
                    break;
                case 5:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.w(obj, j10, o8.i(obj2, j10));
                    r(obj, i10);
                    break;
                case 6:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.v(obj, j10, o8.h(obj2, j10));
                    r(obj, i10);
                    break;
                case 7:
                    if (x(obj2, i10)) {
                        o8.r(obj, j10, o8.B(obj2, j10));
                        r(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.x(obj, j10, o8.k(obj2, j10));
                    r(obj, i10);
                    break;
                case 9:
                case 17:
                    o(obj, obj2, i10);
                    break;
                case 10:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.x(obj, j10, o8.k(obj2, j10));
                    r(obj, i10);
                    break;
                case 11:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.v(obj, j10, o8.h(obj2, j10));
                    r(obj, i10);
                    break;
                case 12:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.v(obj, j10, o8.h(obj2, j10));
                    r(obj, i10);
                    break;
                case 13:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.v(obj, j10, o8.h(obj2, j10));
                    r(obj, i10);
                    break;
                case 14:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.w(obj, j10, o8.i(obj2, j10));
                    r(obj, i10);
                    break;
                case 15:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.v(obj, j10, o8.h(obj2, j10));
                    r(obj, i10);
                    break;
                case 16:
                    if (!x(obj2, i10)) {
                        break;
                    }
                    o8.w(obj, j10, o8.i(obj2, j10));
                    r(obj, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case j.f8330t3 /* 23 */:
                case j.f8335u3 /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case j.f8360z3 /* 29 */:
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
                    this.f5769l.c(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = l7.f4938d;
                    o8.x(obj, j10, r6.c(o8.k(obj, j10), o8.k(obj2, j10)));
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
                    if (!B(obj2, i11, i10)) {
                        break;
                    }
                    o8.x(obj, j10, o8.k(obj2, j10));
                    s(obj, i11, i10);
                    break;
                case 60:
                case 68:
                    p(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!B(obj2, i11, i10)) {
                        break;
                    }
                    o8.x(obj, j10, o8.k(obj2, j10));
                    s(obj, i11, i10);
                    break;
            }
        }
        l7.c(this.f5770m, obj, obj2);
        if (this.f5763f) {
            this.f5771n.a(obj2);
            throw null;
        }
    }
}
