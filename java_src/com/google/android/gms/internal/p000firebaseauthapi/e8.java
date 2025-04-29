package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e8  reason: invalid package */
/* loaded from: classes.dex */
public final class e8 {

    /* renamed from: f  reason: collision with root package name */
    private static final e8 f4534f = new e8(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f4535a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f4536b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f4537c;

    /* renamed from: d  reason: collision with root package name */
    private int f4538d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4539e;

    private e8() {
        this(0, new int[8], new Object[8], true);
    }

    private e8(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f4538d = -1;
        this.f4535a = i10;
        this.f4536b = iArr;
        this.f4537c = objArr;
        this.f4539e = z10;
    }

    public static e8 c() {
        return f4534f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e8 e(e8 e8Var, e8 e8Var2) {
        int i10 = e8Var.f4535a + e8Var2.f4535a;
        int[] copyOf = Arrays.copyOf(e8Var.f4536b, i10);
        System.arraycopy(e8Var2.f4536b, 0, copyOf, e8Var.f4535a, e8Var2.f4535a);
        Object[] copyOf2 = Arrays.copyOf(e8Var.f4537c, i10);
        System.arraycopy(e8Var2.f4537c, 0, copyOf2, e8Var.f4535a, e8Var2.f4535a);
        return new e8(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e8 f() {
        return new e8(0, new int[8], new Object[8], true);
    }

    private final void l(int i10) {
        int[] iArr = this.f4536b;
        if (i10 > iArr.length) {
            int i11 = this.f4535a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f4536b = Arrays.copyOf(iArr, i10);
            this.f4537c = Arrays.copyOf(this.f4537c, i10);
        }
    }

    public final int a() {
        int c10;
        int b10;
        int i10;
        int i11 = this.f4538d;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f4535a; i13++) {
                int i14 = this.f4536b[i13];
                int i15 = i14 >>> 3;
                int i16 = i14 & 7;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ((Long) this.f4537c[i13]).longValue();
                        i10 = z4.b(i15 << 3) + 8;
                    } else if (i16 == 2) {
                        int i17 = z4.f5752d;
                        int k10 = ((m4) this.f4537c[i13]).k();
                        i10 = z4.b(i15 << 3) + z4.b(k10) + k10;
                    } else if (i16 == 3) {
                        int i18 = i15 << 3;
                        int i19 = z4.f5752d;
                        c10 = ((e8) this.f4537c[i13]).a();
                        int b11 = z4.b(i18);
                        b10 = b11 + b11;
                    } else if (i16 != 5) {
                        throw new IllegalStateException(z5.a());
                    } else {
                        ((Integer) this.f4537c[i13]).intValue();
                        i10 = z4.b(i15 << 3) + 4;
                    }
                    i12 += i10;
                } else {
                    int i20 = i15 << 3;
                    c10 = z4.c(((Long) this.f4537c[i13]).longValue());
                    b10 = z4.b(i20);
                }
                i10 = b10 + c10;
                i12 += i10;
            }
            this.f4538d = i12;
            return i12;
        }
        return i11;
    }

    public final int b() {
        int i10 = this.f4538d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f4535a; i12++) {
                int i13 = z4.f5752d;
                int k10 = ((m4) this.f4537c[i12]).k();
                int b10 = z4.b(k10) + k10;
                int b11 = z4.b(16);
                int b12 = z4.b(this.f4536b[i12] >>> 3);
                int b13 = z4.b(8);
                i11 += b13 + b13 + b11 + b12 + z4.b(24) + b10;
            }
            this.f4538d = i11;
            return i11;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e8 d(e8 e8Var) {
        if (e8Var.equals(f4534f)) {
            return this;
        }
        g();
        int i10 = this.f4535a + e8Var.f4535a;
        l(i10);
        System.arraycopy(e8Var.f4536b, 0, this.f4536b, this.f4535a, e8Var.f4535a);
        System.arraycopy(e8Var.f4537c, 0, this.f4537c, this.f4535a, e8Var.f4535a);
        this.f4535a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof e8)) {
            e8 e8Var = (e8) obj;
            int i10 = this.f4535a;
            if (i10 == e8Var.f4535a) {
                int[] iArr = this.f4536b;
                int[] iArr2 = e8Var.f4536b;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.f4537c;
                        Object[] objArr2 = e8Var.f4537c;
                        int i12 = this.f4535a;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (objArr[i13].equals(objArr2[i13])) {
                            }
                        }
                        return true;
                    } else if (iArr[i11] != iArr2[i11]) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    final void g() {
        if (!this.f4539e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f4539e) {
            this.f4539e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f4535a;
        int i11 = i10 + 527;
        int[] iArr = this.f4536b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 * 31) + i13;
        Object[] objArr = this.f4537c;
        int i16 = this.f4535a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f4535a; i11++) {
            y6.b(sb, i10, String.valueOf(this.f4536b[i11] >>> 3), this.f4537c[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i10, Object obj) {
        g();
        l(this.f4535a + 1);
        int[] iArr = this.f4536b;
        int i11 = this.f4535a;
        iArr[i11] = i10;
        this.f4537c[i11] = obj;
        this.f4535a = i11 + 1;
    }

    public final void k(a5 a5Var) {
        if (this.f4535a != 0) {
            for (int i10 = 0; i10 < this.f4535a; i10++) {
                int i11 = this.f4536b[i10];
                Object obj = this.f4537c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    a5Var.E(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    a5Var.x(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    a5Var.o(i13, (m4) obj);
                } else if (i12 == 3) {
                    a5Var.e(i13);
                    ((e8) obj).k(a5Var);
                    a5Var.s(i13);
                } else if (i12 != 5) {
                    throw new RuntimeException(z5.a());
                } else {
                    a5Var.v(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
