package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.u1;
import com.google.crypto.tink.shaded.protobuf.v1;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements v1 {

    /* renamed from: a  reason: collision with root package name */
    private final l f6268a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6269a;

        static {
            int[] iArr = new int[u1.b.values().length];
            f6269a = iArr;
            try {
                iArr[u1.b.f6337s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6269a[u1.b.f6336r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6269a[u1.b.f6334p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6269a[u1.b.f6344z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6269a[u1.b.B.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6269a[u1.b.f6342x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6269a[u1.b.f6335q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6269a[u1.b.f6332n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6269a[u1.b.A.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6269a[u1.b.C.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6269a[u1.b.f6333o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6269a[u1.b.f6338t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private m(l lVar) {
        l lVar2 = (l) b0.b(lVar, "output");
        this.f6268a = lVar2;
        lVar2.f6257a = this;
    }

    public static m P(l lVar) {
        m mVar = lVar.f6257a;
        return mVar != null ? mVar : new m(lVar);
    }

    private <K, V> void Q(int i10, l0.a<K, V> aVar, Map<K, V> map) {
        int[] iArr = a.f6269a;
        throw null;
    }

    private void R(int i10, Object obj) {
        if (obj instanceof String) {
            this.f6268a.L0(i10, (String) obj);
        } else {
            this.f6268a.j0(i10, (i) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void A(int i10, String str) {
        this.f6268a.L0(i10, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void B(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.H0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.P(list.get(i13).intValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.I0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void C(int i10, long j10) {
        this.f6268a.P0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void D(int i10, int i11) {
        this.f6268a.m0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void E(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.y0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.y(list.get(i13).longValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.z0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void F(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.m0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.l(list.get(i13).intValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.n0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.k0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.j(list.get(i13).doubleValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.l0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void H(int i10, int i11) {
        this.f6268a.H0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void I(int i10, List<i> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f6268a.j0(i10, list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void J(int i10, List<?> list, h1 h1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            O(i10, list.get(i11), h1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void K(int i10, List<?> list, h1 h1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), h1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void L(int i10, Object obj, h1 h1Var) {
        this.f6268a.A0(i10, (s0) obj, h1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void M(int i10, i iVar) {
        this.f6268a.j0(i10, iVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public <K, V> void N(int i10, l0.a<K, V> aVar, Map<K, V> map) {
        if (this.f6268a.c0()) {
            Q(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f6268a.M0(i10, 2);
            this.f6268a.O0(l0.b(aVar, entry.getKey(), entry.getValue()));
            l0.d(this.f6268a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void O(int i10, Object obj, h1 h1Var) {
        this.f6268a.u0(i10, (s0) obj, h1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void a(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.w0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.w(list.get(i13).intValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.x0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void b(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.s0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.r(list.get(i13).floatValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.t0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void c(int i10, long j10) {
        this.f6268a.y0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void d(int i10, boolean z10) {
        this.f6268a.h0(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void e(int i10, int i11) {
        this.f6268a.N0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public final void f(int i10, Object obj) {
        if (obj instanceof i) {
            this.f6268a.C0(i10, (i) obj);
        } else {
            this.f6268a.B0(i10, (s0) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void g(int i10, int i11) {
        this.f6268a.D0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void h(int i10) {
        this.f6268a.M0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void i(int i10, int i11) {
        this.f6268a.w0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void j(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.q0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.p(list.get(i13).longValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.r0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void k(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.D0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.L(list.get(i13).intValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.E0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void l(int i10, int i11) {
        this.f6268a.o0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void m(int i10, double d10) {
        this.f6268a.k0(i10, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void n(int i10, long j10) {
        this.f6268a.F0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void o(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.F0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.N(list.get(i13).longValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.G0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void p(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.o0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.n(list.get(i13).intValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.p0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void q(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.P0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.Y(list.get(i13).longValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.Q0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void r(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.h0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.e(list.get(i13).booleanValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.i0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void s(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.N0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.W(list.get(i13).intValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.O0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void t(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f6268a.J0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f6268a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.R(list.get(i13).longValue());
        }
        this.f6268a.O0(i12);
        while (i11 < list.size()) {
            this.f6268a.K0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void u(int i10, long j10) {
        this.f6268a.q0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public v1.a v() {
        return v1.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void w(int i10, long j10) {
        this.f6268a.J0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void x(int i10, float f10) {
        this.f6268a.s0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void y(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof h0)) {
            while (i11 < list.size()) {
                this.f6268a.L0(i10, list.get(i11));
                i11++;
            }
            return;
        }
        h0 h0Var = (h0) list;
        while (i11 < list.size()) {
            R(i10, h0Var.f(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v1
    public void z(int i10) {
        this.f6268a.M0(i10, 4);
    }
}
