package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l7  reason: invalid package */
/* loaded from: classes.dex */
final class l7 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f4935a;

    /* renamed from: b  reason: collision with root package name */
    private static final d8 f4936b;

    /* renamed from: c  reason: collision with root package name */
    private static final d8 f4937c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f4938d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        d8 d8Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4935a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                d8Var = (d8) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f4936b = d8Var;
        f4937c = new f8();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s5) {
            s5 s5Var = (s5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += z4.A(s5Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += z4.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (z4.b(i10 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (z4.b(i10 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i10, List list, j7 j7Var) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += z4.z(i10, (w6) list.get(i12), j7Var);
            }
            return i11;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * z4.b(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s5) {
            s5 s5Var = (s5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += z4.A(s5Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += z4.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return J(list) + (list.size() * z4.b(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l6) {
            l6 l6Var = (l6) list;
            i10 = 0;
            while (i11 < size) {
                i10 += z4.c(l6Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += z4.c(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K(int i10, Object obj, j7 j7Var) {
        if (!(obj instanceof b6)) {
            return z4.b(i10 << 3) + z4.B((w6) obj, j7Var);
        }
        int i11 = z4.f5752d;
        int a10 = ((b6) obj).a();
        return z4.b(i10 << 3) + z4.b(a10) + a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(int i10, List list, j7 j7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b10 = z4.b(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof b6) {
                int a10 = ((b6) obj).a();
                b10 += z4.b(a10) + a10;
            } else {
                b10 += z4.B((w6) obj, j7Var);
            }
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * z4.b(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s5) {
            s5 s5Var = (s5) list;
            i10 = 0;
            while (i11 < size) {
                int e10 = s5Var.e(i11);
                i10 += z4.b((e10 >> 31) ^ (e10 + e10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += z4.b((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * z4.b(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l6) {
            l6 l6Var = (l6) list;
            i10 = 0;
            while (i11 < size) {
                long e10 = l6Var.e(i11);
                i10 += z4.c((e10 >> 63) ^ (e10 + e10));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += z4.c((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Q(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof d6;
        int b10 = z4.b(i10 << 3) * size;
        if (z10) {
            d6 d6Var = (d6) list;
            while (i11 < size) {
                Object zzf = d6Var.zzf(i11);
                if (zzf instanceof m4) {
                    int k10 = ((m4) zzf).k();
                    b10 += z4.b(k10) + k10;
                } else {
                    b10 += z4.C((String) zzf);
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof m4) {
                    int k11 = ((m4) obj).k();
                    b10 += z4.b(k11) + k11;
                } else {
                    b10 += z4.C((String) obj);
                }
                i11++;
            }
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return S(list) + (size * z4.b(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int S(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s5) {
            s5 s5Var = (s5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += z4.b(s5Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += z4.b(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * z4.b(i10 << 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int U(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof l6) {
            l6 l6Var = (l6) list;
            i10 = 0;
            while (i11 < size) {
                i10 += z4.c(l6Var.e(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += z4.c(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static d8 V() {
        return f4936b;
    }

    public static d8 W() {
        return f4937c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj, int i10, List list, v5 v5Var, Object obj2, d8 d8Var) {
        if (v5Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (v5Var.zza()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = b(obj, i10, intValue, obj2, d8Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!v5Var.zza()) {
                    obj2 = b(obj, i10, intValue2, obj2, d8Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(Object obj, int i10, int i11, Object obj2, d8 d8Var) {
        if (obj2 == null) {
            obj2 = d8Var.c(obj);
        }
        d8Var.l(obj2, i10, i11);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(d8 d8Var, Object obj, Object obj2) {
        d8Var.o(obj, d8Var.e(d8Var.d(obj), d8Var.d(obj2)));
    }

    public static void d(Class cls) {
        Class cls2;
        if (!r5.class.isAssignableFrom(cls) && (cls2 = f4935a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void f(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.n(i10, list, z10);
    }

    public static void g(int i10, List list, a5 a5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.p(i10, list);
    }

    public static void h(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.r(i10, list, z10);
    }

    public static void i(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.u(i10, list, z10);
    }

    public static void j(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.w(i10, list, z10);
    }

    public static void k(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.y(i10, list, z10);
    }

    public static void l(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.A(i10, list, z10);
    }

    public static void m(int i10, List list, a5 a5Var, j7 j7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            a5Var.B(i10, list.get(i11), j7Var);
        }
    }

    public static void n(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.D(i10, list, z10);
    }

    public static void o(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.F(i10, list, z10);
    }

    public static void p(int i10, List list, a5 a5Var, j7 j7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            a5Var.G(i10, list.get(i11), j7Var);
        }
    }

    public static void q(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.I(i10, list, z10);
    }

    public static void r(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.K(i10, list, z10);
    }

    public static void s(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.b(i10, list, z10);
    }

    public static void t(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.d(i10, list, z10);
    }

    public static void u(int i10, List list, a5 a5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.g(i10, list);
    }

    public static void v(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.i(i10, list, z10);
    }

    public static void w(int i10, List list, a5 a5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5Var.k(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (z4.b(i10 << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b10 = size * z4.b(i10 << 3);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int k10 = ((m4) list.get(i11)).k();
            b10 += z4.b(k10) + k10;
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * z4.b(i10 << 3));
    }
}
