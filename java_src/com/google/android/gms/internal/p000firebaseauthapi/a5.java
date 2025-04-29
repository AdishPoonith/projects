package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a5  reason: invalid package */
/* loaded from: classes.dex */
final class a5 {

    /* renamed from: a  reason: collision with root package name */
    private final z4 f4321a;

    private a5(z4 z4Var) {
        byte[] bArr = x5.f5628d;
        this.f4321a = z4Var;
        z4Var.f5753a = this;
    }

    public static a5 l(z4 z4Var) {
        a5 a5Var = z4Var.f5753a;
        return a5Var != null ? a5Var : new a5(z4Var);
    }

    public final void A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.m(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.n(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public final void B(int i10, Object obj, j7 j7Var) {
        z4 z4Var = this.f4321a;
        z4Var.u(i10, 3);
        j7Var.b((w6) obj, z4Var.f5753a);
        z4Var.u(i10, 4);
    }

    public final void C(int i10, int i11) {
        this.f4321a.q(i10, i11);
    }

    public final void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.q(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += z4.A(((Integer) list.get(i13)).intValue());
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.r(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void E(int i10, long j10) {
        this.f4321a.x(i10, j10);
    }

    public final void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += z4.c(((Long) list.get(i13)).longValue());
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void G(int i10, Object obj, j7 j7Var) {
        this.f4321a.s(i10, (w6) obj, j7Var);
    }

    public final void H(int i10, int i11) {
        this.f4321a.m(i10, i11);
    }

    public final void I(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.m(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.n(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void J(int i10, long j10) {
        this.f4321a.o(i10, j10);
    }

    public final void K(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.o(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.p(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void a(int i10, int i11) {
        this.f4321a.v(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                z4 z4Var = this.f4321a;
                int intValue = ((Integer) list.get(i11)).intValue();
                z4Var.v(i10, (intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += z4.b((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            z4 z4Var2 = this.f4321a;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            z4Var2.w((intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public final void c(int i10, long j10) {
        this.f4321a.x(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                z4 z4Var = this.f4321a;
                long longValue = ((Long) list.get(i11)).longValue();
                z4Var.x(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += z4.c((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            z4 z4Var2 = this.f4321a;
            long longValue3 = ((Long) list.get(i11)).longValue();
            z4Var2.y((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Deprecated
    public final void e(int i10) {
        this.f4321a.u(i10, 3);
    }

    public final void f(int i10, String str) {
        this.f4321a.t(i10, str);
    }

    public final void g(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof d6)) {
            while (i11 < list.size()) {
                this.f4321a.t(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        d6 d6Var = (d6) list;
        while (i11 < list.size()) {
            Object zzf = d6Var.zzf(i11);
            if (zzf instanceof String) {
                this.f4321a.t(i10, (String) zzf);
            } else {
                this.f4321a.k(i10, (m4) zzf);
            }
            i11++;
        }
    }

    public final void h(int i10, int i11) {
        this.f4321a.v(i10, i11);
    }

    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.v(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += z4.b(((Integer) list.get(i13)).intValue());
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.w(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void j(int i10, long j10) {
        this.f4321a.x(i10, j10);
    }

    public final void k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += z4.c(((Long) list.get(i13)).longValue());
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void m(int i10, boolean z10) {
        this.f4321a.j(i10, z10);
    }

    public final void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.j(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.i(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public final void o(int i10, m4 m4Var) {
        this.f4321a.k(i10, m4Var);
    }

    public final void p(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f4321a.k(i10, (m4) list.get(i11));
        }
    }

    public final void q(int i10, double d10) {
        this.f4321a.o(i10, Double.doubleToRawLongBits(d10));
    }

    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.o(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.p(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Deprecated
    public final void s(int i10) {
        this.f4321a.u(i10, 4);
    }

    public final void t(int i10, int i11) {
        this.f4321a.q(i10, i11);
    }

    public final void u(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.q(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += z4.A(((Integer) list.get(i13)).intValue());
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.r(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void v(int i10, int i11) {
        this.f4321a.m(i10, i11);
    }

    public final void w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.m(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).intValue();
            i12 += 4;
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.n(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void x(int i10, long j10) {
        this.f4321a.o(i10, j10);
    }

    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f4321a.o(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f4321a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).longValue();
            i12 += 8;
        }
        this.f4321a.w(i12);
        while (i11 < list.size()) {
            this.f4321a.p(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void z(int i10, float f10) {
        this.f4321a.m(i10, Float.floatToRawIntBits(f10));
    }
}
