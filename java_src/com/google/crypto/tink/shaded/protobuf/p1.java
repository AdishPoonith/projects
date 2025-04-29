package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.v1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: f  reason: collision with root package name */
    private static final p1 f6280f = new p1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f6281a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f6282b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f6283c;

    /* renamed from: d  reason: collision with root package name */
    private int f6284d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6285e;

    private p1() {
        this(0, new int[8], new Object[8], true);
    }

    private p1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f6284d = -1;
        this.f6281a = i10;
        this.f6282b = iArr;
        this.f6283c = objArr;
        this.f6285e = z10;
    }

    private void b() {
        int i10 = this.f6281a;
        int[] iArr = this.f6282b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f6282b = Arrays.copyOf(iArr, i11);
            this.f6283c = Arrays.copyOf(this.f6283c, i11);
        }
    }

    public static p1 c() {
        return f6280f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p1 i(p1 p1Var, p1 p1Var2) {
        int i10 = p1Var.f6281a + p1Var2.f6281a;
        int[] copyOf = Arrays.copyOf(p1Var.f6282b, i10);
        System.arraycopy(p1Var2.f6282b, 0, copyOf, p1Var.f6281a, p1Var2.f6281a);
        Object[] copyOf2 = Arrays.copyOf(p1Var.f6283c, i10);
        System.arraycopy(p1Var2.f6283c, 0, copyOf2, p1Var.f6281a, p1Var2.f6281a);
        return new p1(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p1 j() {
        return new p1();
    }

    private static boolean k(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean n(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void p(int i10, Object obj, v1 v1Var) {
        int a10 = u1.a(i10);
        int b10 = u1.b(i10);
        if (b10 == 0) {
            v1Var.c(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            v1Var.u(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            v1Var.M(a10, (i) obj);
        } else if (b10 != 3) {
            if (b10 != 5) {
                throw new RuntimeException(c0.e());
            }
            v1Var.l(a10, ((Integer) obj).intValue());
        } else if (v1Var.v() == v1.a.ASCENDING) {
            v1Var.h(a10);
            ((p1) obj).q(v1Var);
            v1Var.z(a10);
        } else {
            v1Var.z(a10);
            ((p1) obj).q(v1Var);
            v1Var.h(a10);
        }
    }

    void a() {
        if (!this.f6285e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int X;
        int i10 = this.f6284d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f6281a; i12++) {
            int i13 = this.f6282b[i12];
            int a10 = u1.a(i13);
            int b10 = u1.b(i13);
            if (b10 == 0) {
                X = l.X(a10, ((Long) this.f6283c[i12]).longValue());
            } else if (b10 == 1) {
                X = l.o(a10, ((Long) this.f6283c[i12]).longValue());
            } else if (b10 == 2) {
                X = l.g(a10, (i) this.f6283c[i12]);
            } else if (b10 == 3) {
                X = (l.U(a10) * 2) + ((p1) this.f6283c[i12]).d();
            } else if (b10 != 5) {
                throw new IllegalStateException(c0.e());
            } else {
                X = l.m(a10, ((Integer) this.f6283c[i12]).intValue());
            }
            i11 += X;
        }
        this.f6284d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f6284d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f6281a; i12++) {
            i11 += l.I(u1.a(this.f6282b[i12]), (i) this.f6283c[i12]);
        }
        this.f6284d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof p1)) {
            p1 p1Var = (p1) obj;
            int i10 = this.f6281a;
            return i10 == p1Var.f6281a && n(this.f6282b, p1Var.f6282b, i10) && k(this.f6283c, p1Var.f6283c, this.f6281a);
        }
        return false;
    }

    public void h() {
        this.f6285e = false;
    }

    public int hashCode() {
        int i10 = this.f6281a;
        return ((((527 + i10) * 31) + f(this.f6282b, i10)) * 31) + g(this.f6283c, this.f6281a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f6281a; i11++) {
            u0.c(sb, i10, String.valueOf(u1.a(this.f6282b[i11])), this.f6283c[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f6282b;
        int i11 = this.f6281a;
        iArr[i11] = i10;
        this.f6283c[i11] = obj;
        this.f6281a = i11 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(v1 v1Var) {
        if (v1Var.v() == v1.a.DESCENDING) {
            for (int i10 = this.f6281a - 1; i10 >= 0; i10--) {
                v1Var.f(u1.a(this.f6282b[i10]), this.f6283c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f6281a; i11++) {
            v1Var.f(u1.a(this.f6282b[i11]), this.f6283c[i11]);
        }
    }

    public void q(v1 v1Var) {
        if (this.f6281a == 0) {
            return;
        }
        if (v1Var.v() == v1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f6281a; i10++) {
                p(this.f6282b[i10], this.f6283c[i10], v1Var);
            }
            return;
        }
        for (int i11 = this.f6281a - 1; i11 >= 0; i11--) {
            p(this.f6282b[i11], this.f6283c[i11], v1Var);
        }
    }
}
