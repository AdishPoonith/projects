package com.google.protobuf;

import com.google.protobuf.c2;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: f  reason: collision with root package name */
    private static final w1 f7367f = new w1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f7368a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f7369b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f7370c;

    /* renamed from: d  reason: collision with root package name */
    private int f7371d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7372e;

    private w1() {
        this(0, new int[8], new Object[8], true);
    }

    private w1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f7371d = -1;
        this.f7368a = i10;
        this.f7369b = iArr;
        this.f7370c = objArr;
        this.f7372e = z10;
    }

    private void b(int i10) {
        int[] iArr = this.f7369b;
        if (i10 > iArr.length) {
            int i11 = this.f7368a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f7369b = Arrays.copyOf(iArr, i10);
            this.f7370c = Arrays.copyOf(this.f7370c, i10);
        }
    }

    public static w1 c() {
        return f7367f;
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
    public static w1 j(w1 w1Var, w1 w1Var2) {
        int i10 = w1Var.f7368a + w1Var2.f7368a;
        int[] copyOf = Arrays.copyOf(w1Var.f7369b, i10);
        System.arraycopy(w1Var2.f7369b, 0, copyOf, w1Var.f7368a, w1Var2.f7368a);
        Object[] copyOf2 = Arrays.copyOf(w1Var.f7370c, i10);
        System.arraycopy(w1Var2.f7370c, 0, copyOf2, w1Var.f7368a, w1Var2.f7368a);
        return new w1(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w1 k() {
        return new w1();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, c2 c2Var) {
        int a10 = b2.a(i10);
        int b10 = b2.b(i10);
        if (b10 == 0) {
            c2Var.c(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            c2Var.u(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            c2Var.M(a10, (i) obj);
        } else if (b10 != 3) {
            if (b10 != 5) {
                throw new RuntimeException(e0.e());
            }
            c2Var.l(a10, ((Integer) obj).intValue());
        } else if (c2Var.v() == c2.a.ASCENDING) {
            c2Var.h(a10);
            ((w1) obj).r(c2Var);
            c2Var.z(a10);
        } else {
            c2Var.z(a10);
            ((w1) obj).r(c2Var);
            c2Var.h(a10);
        }
    }

    void a() {
        if (!this.f7372e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int Y;
        int i10 = this.f7371d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7368a; i12++) {
            int i13 = this.f7369b[i12];
            int a10 = b2.a(i13);
            int b10 = b2.b(i13);
            if (b10 == 0) {
                Y = l.Y(a10, ((Long) this.f7370c[i12]).longValue());
            } else if (b10 == 1) {
                Y = l.p(a10, ((Long) this.f7370c[i12]).longValue());
            } else if (b10 == 2) {
                Y = l.h(a10, (i) this.f7370c[i12]);
            } else if (b10 == 3) {
                Y = (l.V(a10) * 2) + ((w1) this.f7370c[i12]).d();
            } else if (b10 != 5) {
                throw new IllegalStateException(e0.e());
            } else {
                Y = l.n(a10, ((Integer) this.f7370c[i12]).intValue());
            }
            i11 += Y;
        }
        this.f7371d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f7371d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7368a; i12++) {
            i11 += l.K(b2.a(this.f7369b[i12]), (i) this.f7370c[i12]);
        }
        this.f7371d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof w1)) {
            w1 w1Var = (w1) obj;
            int i10 = this.f7368a;
            return i10 == w1Var.f7368a && o(this.f7369b, w1Var.f7369b, i10) && l(this.f7370c, w1Var.f7370c, this.f7368a);
        }
        return false;
    }

    public void h() {
        this.f7372e = false;
    }

    public int hashCode() {
        int i10 = this.f7368a;
        return ((((527 + i10) * 31) + f(this.f7369b, i10)) * 31) + g(this.f7370c, this.f7368a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w1 i(w1 w1Var) {
        if (w1Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f7368a + w1Var.f7368a;
        b(i10);
        System.arraycopy(w1Var.f7369b, 0, this.f7369b, this.f7368a, w1Var.f7368a);
        System.arraycopy(w1Var.f7370c, 0, this.f7370c, this.f7368a, w1Var.f7368a);
        this.f7368a = i10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f7368a; i11++) {
            x0.d(sb, i10, String.valueOf(b2.a(this.f7369b[i11])), this.f7370c[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i10, Object obj) {
        a();
        b(this.f7368a + 1);
        int[] iArr = this.f7369b;
        int i11 = this.f7368a;
        iArr[i11] = i10;
        this.f7370c[i11] = obj;
        this.f7368a = i11 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(c2 c2Var) {
        if (c2Var.v() == c2.a.DESCENDING) {
            for (int i10 = this.f7368a - 1; i10 >= 0; i10--) {
                c2Var.f(b2.a(this.f7369b[i10]), this.f7370c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f7368a; i11++) {
            c2Var.f(b2.a(this.f7369b[i11]), this.f7370c[i11]);
        }
    }

    public void r(c2 c2Var) {
        if (this.f7368a == 0) {
            return;
        }
        if (c2Var.v() == c2.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f7368a; i10++) {
                q(this.f7369b[i10], this.f7370c[i10], c2Var);
            }
            return;
        }
        for (int i11 = this.f7368a - 1; i11 >= 0; i11--) {
            q(this.f7369b[i11], this.f7370c[i11], c2Var);
        }
    }
}
