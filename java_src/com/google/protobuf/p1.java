package com.google.protobuf;

import com.google.protobuf.d0;
import com.google.protobuf.v;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f7276a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final v1<?, ?> f7277b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final v1<?, ?> f7278c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final v1<?, ?> f7279d = new x1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB A(Object obj, int i10, List<Integer> list, d0.e eVar, UB ub, v1<UT, UB> v1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = (UB) L(obj, i10, intValue, ub, v1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = (UB) L(obj, i10, intValue2, ub, v1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static v1<?, ?> C(boolean z10) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (v1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends v.b<FT>> void E(r<FT> rVar, T t10, T t11) {
        v<FT> c10 = rVar.c(t11);
        if (c10.n()) {
            return;
        }
        rVar.d(t10).v(c10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void F(q0 q0Var, T t10, T t11, long j10) {
        z1.V(t10, j10, q0Var.a(z1.G(t10, j10), z1.G(t11, j10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void G(v1<UT, UB> v1Var, T t10, T t11) {
        v1Var.p(t10, v1Var.k(v1Var.g(t10), v1Var.g(t11)));
    }

    public static v1<?, ?> H() {
        return f7277b;
    }

    public static v1<?, ?> I() {
        return f7278c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!z.class.isAssignableFrom(cls) && (cls2 = f7276a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB L(Object obj, int i10, int i11, UB ub, v1<UT, UB> v1Var) {
        if (ub == null) {
            ub = v1Var.f(obj);
        }
        v1Var.e(ub, i10, i11);
        return ub;
    }

    public static v1<?, ?> M() {
        return f7279d;
    }

    public static void N(int i10, List<Boolean> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.r(i10, list, z10);
    }

    public static void O(int i10, List<i> list, c2 c2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.I(i10, list);
    }

    public static void P(int i10, List<Double> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.G(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.F(i10, list, z10);
    }

    public static void R(int i10, List<Integer> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.p(i10, list, z10);
    }

    public static void S(int i10, List<Long> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.j(i10, list, z10);
    }

    public static void T(int i10, List<Float> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.b(i10, list, z10);
    }

    public static void U(int i10, List<?> list, c2 c2Var, n1 n1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.K(i10, list, n1Var);
    }

    public static void V(int i10, List<Integer> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.a(i10, list, z10);
    }

    public static void W(int i10, List<Long> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.E(i10, list, z10);
    }

    public static void X(int i10, List<?> list, c2 c2Var, n1 n1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.J(i10, list, n1Var);
    }

    public static void Y(int i10, List<Integer> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.k(i10, list, z10);
    }

    public static void Z(int i10, List<Long> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.o(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? l.V(i10) + l.D(size) : size * l.e(i10, true);
    }

    public static void a0(int i10, List<Integer> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.B(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.t(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i10, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * l.V(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            V += l.i(list.get(i11));
        }
        return V;
    }

    public static void c0(int i10, List<String> list, c2 c2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.y(i10, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        int V = l.V(i10);
        return z10 ? V + l.D(e10) : e10 + (size * V);
    }

    public static void d0(int i10, List<Integer> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.s(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.m(c0Var.s(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.m(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, c2 c2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.q(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? l.V(i10) + l.D(size * 4) : size * l.n(i10, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? l.V(i10) + l.D(size * 8) : size * l.p(i10, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i10, List<v0> list, n1 n1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += l.t(i10, list.get(i12), n1Var);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        int V = l.V(i10);
        return z10 ? V + l.D(l10) : l10 + (size * V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.x(c0Var.s(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.x(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? l.V(i10) + l.D(n10) : n10 + (list.size() * l.V(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.z(m0Var.r(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.z(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i10, Object obj, n1 n1Var) {
        return obj instanceof i0 ? l.B(i10, (i0) obj) : l.G(i10, (v0) obj, n1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i10, List<?> list, n1 n1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = l.V(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            V += obj instanceof i0 ? l.C((i0) obj) : l.I((v0) obj, n1Var);
        }
        return V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        int V = l.V(i10);
        return z10 ? V + l.D(r10) : r10 + (size * V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.Q(c0Var.s(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.Q(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        int V = l.V(i10);
        return z10 ? V + l.D(t10) : t10 + (size * V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.S(m0Var.r(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.S(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int V = l.V(i10) * size;
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            while (i11 < size) {
                Object f10 = k0Var.f(i11);
                V += f10 instanceof i ? l.i((i) f10) : l.U((String) f10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                V += obj instanceof i ? l.i((i) obj) : l.U((String) obj);
                i11++;
            }
        }
        return V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        int V = l.V(i10);
        return z10 ? V + l.D(w10) : w10 + (size * V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.X(c0Var.s(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.X(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        int V = l.V(i10);
        return z10 ? V + l.D(y10) : y10 + (size * V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.Z(m0Var.r(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += l.Z(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB z(Object obj, int i10, List<Integer> list, d0.d<?> dVar, UB ub, v1<UT, UB> v1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = (UB) L(obj, i10, intValue, ub, v1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = (UB) L(obj, i10, intValue2, ub, v1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
