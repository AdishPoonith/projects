package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.c2;
import com.google.protobuf.o0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements c2 {

    /* renamed from: a  reason: collision with root package name */
    private final l f7243a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7244a;

        static {
            int[] iArr = new int[b2.b.values().length];
            f7244a = iArr;
            try {
                iArr[b2.b.f7058s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7244a[b2.b.f7057r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7244a[b2.b.f7055p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7244a[b2.b.f7065z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7244a[b2.b.B.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7244a[b2.b.f7063x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7244a[b2.b.f7056q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7244a[b2.b.f7053n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7244a[b2.b.A.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7244a[b2.b.C.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7244a[b2.b.f7054o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7244a[b2.b.f7059t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private m(l lVar) {
        l lVar2 = (l) d0.b(lVar, "output");
        this.f7243a = lVar2;
        lVar2.f7229a = this;
    }

    public static m P(l lVar) {
        m mVar = lVar.f7229a;
        return mVar != null ? mVar : new m(lVar);
    }

    private <V> void Q(int i10, boolean z10, V v10, o0.a<Boolean, V> aVar) {
        this.f7243a.W0(i10, 2);
        this.f7243a.Y0(o0.b(aVar, Boolean.valueOf(z10), v10));
        o0.e(this.f7243a, aVar, Boolean.valueOf(z10), v10);
    }

    private <V> void R(int i10, o0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i11 = 0;
        for (Integer num : map.keySet()) {
            iArr[i11] = num.intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f7243a.W0(i10, 2);
            this.f7243a.Y0(o0.b(aVar, Integer.valueOf(i13), v10));
            o0.e(this.f7243a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void S(int i10, o0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i11 = 0;
        for (Long l10 : map.keySet()) {
            jArr[i11] = l10.longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f7243a.W0(i10, 2);
            this.f7243a.Y0(o0.b(aVar, Long.valueOf(j10), v10));
            o0.e(this.f7243a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void T(int i10, o0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f7244a[aVar.f7269a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f7269a);
        }
    }

    private <V> void U(int i10, o0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i11 = 0;
        for (String str : map.keySet()) {
            strArr[i11] = str;
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str2 = strArr[i12];
            V v10 = map.get(str2);
            this.f7243a.W0(i10, 2);
            this.f7243a.Y0(o0.b(aVar, str2, v10));
            o0.e(this.f7243a, aVar, str2, v10);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f7243a.U0(i10, (String) obj);
        } else {
            this.f7243a.o0(i10, (i) obj);
        }
    }

    @Override // com.google.protobuf.c2
    public void A(int i10, String str) {
        this.f7243a.U0(i10, str);
    }

    @Override // com.google.protobuf.c2
    public void B(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.Q0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.Q(list.get(i13).intValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.R0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void C(int i10, long j10) {
        this.f7243a.Z0(i10, j10);
    }

    @Override // com.google.protobuf.c2
    public void D(int i10, int i11) {
        this.f7243a.s0(i10, i11);
    }

    @Override // com.google.protobuf.c2
    public void E(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.G0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.z(list.get(i13).longValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.H0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void F(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.s0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.m(list.get(i13).intValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.t0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.q0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.k(list.get(i13).doubleValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.r0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void H(int i10, int i11) {
        this.f7243a.Q0(i10, i11);
    }

    @Override // com.google.protobuf.c2
    public void I(int i10, List<i> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f7243a.o0(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.c2
    public void J(int i10, List<?> list, n1 n1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), n1Var);
        }
    }

    @Override // com.google.protobuf.c2
    public void K(int i10, List<?> list, n1 n1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), n1Var);
        }
    }

    @Override // com.google.protobuf.c2
    public void L(int i10, Object obj, n1 n1Var) {
        this.f7243a.B0(i10, (v0) obj, n1Var);
    }

    @Override // com.google.protobuf.c2
    public void M(int i10, i iVar) {
        this.f7243a.o0(i10, iVar);
    }

    @Override // com.google.protobuf.c2
    public void N(int i10, Object obj, n1 n1Var) {
        this.f7243a.I0(i10, (v0) obj, n1Var);
    }

    @Override // com.google.protobuf.c2
    public <K, V> void O(int i10, o0.a<K, V> aVar, Map<K, V> map) {
        if (this.f7243a.e0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f7243a.W0(i10, 2);
            this.f7243a.Y0(o0.b(aVar, entry.getKey(), entry.getValue()));
            o0.e(this.f7243a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.c2
    public void a(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.E0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.x(list.get(i13).intValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.F0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void b(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.y0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.s(list.get(i13).floatValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.z0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void c(int i10, long j10) {
        this.f7243a.G0(i10, j10);
    }

    @Override // com.google.protobuf.c2
    public void d(int i10, boolean z10) {
        this.f7243a.k0(i10, z10);
    }

    @Override // com.google.protobuf.c2
    public void e(int i10, int i11) {
        this.f7243a.X0(i10, i11);
    }

    @Override // com.google.protobuf.c2
    public final void f(int i10, Object obj) {
        if (obj instanceof i) {
            this.f7243a.L0(i10, (i) obj);
        } else {
            this.f7243a.K0(i10, (v0) obj);
        }
    }

    @Override // com.google.protobuf.c2
    public void g(int i10, int i11) {
        this.f7243a.M0(i10, i11);
    }

    @Override // com.google.protobuf.c2
    @Deprecated
    public void h(int i10) {
        this.f7243a.W0(i10, 3);
    }

    @Override // com.google.protobuf.c2
    public void i(int i10, int i11) {
        this.f7243a.E0(i10, i11);
    }

    @Override // com.google.protobuf.c2
    public void j(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.w0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.q(list.get(i13).longValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.x0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void k(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.M(list.get(i13).intValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.N0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void l(int i10, int i11) {
        this.f7243a.u0(i10, i11);
    }

    @Override // com.google.protobuf.c2
    public void m(int i10, double d10) {
        this.f7243a.q0(i10, d10);
    }

    @Override // com.google.protobuf.c2
    public void n(int i10, long j10) {
        this.f7243a.O0(i10, j10);
    }

    @Override // com.google.protobuf.c2
    public void o(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.O(list.get(i13).longValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void p(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.u0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.o(list.get(i13).intValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.v0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void q(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.Z0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.Z(list.get(i13).longValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.a1(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void r(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.k0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.f(list.get(i13).booleanValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.l0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void s(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.X0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.X(list.get(i13).intValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.Y0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void t(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f7243a.S0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f7243a.W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l.S(list.get(i13).longValue());
        }
        this.f7243a.Y0(i12);
        while (i11 < list.size()) {
            this.f7243a.T0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    public void u(int i10, long j10) {
        this.f7243a.w0(i10, j10);
    }

    @Override // com.google.protobuf.c2
    public c2.a v() {
        return c2.a.ASCENDING;
    }

    @Override // com.google.protobuf.c2
    public void w(int i10, long j10) {
        this.f7243a.S0(i10, j10);
    }

    @Override // com.google.protobuf.c2
    public void x(int i10, float f10) {
        this.f7243a.y0(i10, f10);
    }

    @Override // com.google.protobuf.c2
    public void y(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof k0)) {
            while (i11 < list.size()) {
                this.f7243a.U0(i10, list.get(i11));
                i11++;
            }
            return;
        }
        k0 k0Var = (k0) list;
        while (i11 < list.size()) {
            V(i10, k0Var.f(i11));
            i11++;
        }
    }

    @Override // com.google.protobuf.c2
    @Deprecated
    public void z(int i10) {
        this.f7243a.W0(i10, 4);
    }
}
