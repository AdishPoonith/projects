package com.google.android.gms.internal.auth;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: e  reason: collision with root package name */
    private static final k4 f4149e = new k4(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f4150a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f4151b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f4152c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4153d;

    private k4() {
        this(0, new int[8], new Object[8], true);
    }

    private k4(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f4150a = i10;
        this.f4151b = iArr;
        this.f4152c = objArr;
        this.f4153d = z10;
    }

    public static k4 a() {
        return f4149e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k4 b(k4 k4Var, k4 k4Var2) {
        int i10 = k4Var.f4150a + k4Var2.f4150a;
        int[] copyOf = Arrays.copyOf(k4Var.f4151b, i10);
        System.arraycopy(k4Var2.f4151b, 0, copyOf, k4Var.f4150a, k4Var2.f4150a);
        Object[] copyOf2 = Arrays.copyOf(k4Var.f4152c, i10);
        System.arraycopy(k4Var2.f4152c, 0, copyOf2, k4Var.f4150a, k4Var2.f4150a);
        return new k4(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k4 c() {
        return new k4(0, new int[8], new Object[8], true);
    }

    public final void d() {
        this.f4153d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f4150a; i11++) {
            i3.b(sb, i10, String.valueOf(this.f4151b[i11] >>> 3), this.f4152c[i11]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof k4)) {
            k4 k4Var = (k4) obj;
            int i10 = this.f4150a;
            if (i10 == k4Var.f4150a) {
                int[] iArr = this.f4151b;
                int[] iArr2 = k4Var.f4151b;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.f4152c;
                        Object[] objArr2 = k4Var.f4152c;
                        int i12 = this.f4150a;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i10, Object obj) {
        if (!this.f4153d) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f4150a;
        int[] iArr = this.f4151b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f4151b = Arrays.copyOf(iArr, i12);
            this.f4152c = Arrays.copyOf(this.f4152c, i12);
        }
        int[] iArr2 = this.f4151b;
        int i13 = this.f4150a;
        iArr2[i13] = i10;
        this.f4152c[i13] = obj;
        this.f4150a = i13 + 1;
    }

    public final int hashCode() {
        int i10 = this.f4150a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f4151b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f4152c;
        int i16 = this.f4150a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
