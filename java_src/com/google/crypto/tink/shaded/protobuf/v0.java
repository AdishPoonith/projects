package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.v1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v0<T> implements h1<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f6364r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f6365s = s1.D();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f6366a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f6367b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6368c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6369d;

    /* renamed from: e  reason: collision with root package name */
    private final s0 f6370e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f6371f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f6372g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f6373h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f6374i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f6375j;

    /* renamed from: k  reason: collision with root package name */
    private final int f6376k;

    /* renamed from: l  reason: collision with root package name */
    private final int f6377l;

    /* renamed from: m  reason: collision with root package name */
    private final x0 f6378m;

    /* renamed from: n  reason: collision with root package name */
    private final i0 f6379n;

    /* renamed from: o  reason: collision with root package name */
    private final o1<?, ?> f6380o;

    /* renamed from: p  reason: collision with root package name */
    private final r<?> f6381p;

    /* renamed from: q  reason: collision with root package name */
    private final n0 f6382q;

    private v0(int[] iArr, Object[] objArr, int i10, int i11, s0 s0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, r<?> rVar, n0 n0Var) {
        this.f6366a = iArr;
        this.f6367b = objArr;
        this.f6368c = i10;
        this.f6369d = i11;
        this.f6372g = s0Var instanceof z;
        this.f6373h = z10;
        this.f6371f = rVar != null && rVar.e(s0Var);
        this.f6374i = z11;
        this.f6375j = iArr2;
        this.f6376k = i12;
        this.f6377l = i13;
        this.f6378m = x0Var;
        this.f6379n = i0Var;
        this.f6380o = o1Var;
        this.f6381p = rVar;
        this.f6370e = s0Var;
        this.f6382q = n0Var;
    }

    private static boolean A(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean B(T t10, int i10) {
        int h02 = h0(i10);
        long j10 = 1048575 & h02;
        if (j10 != 1048575) {
            return (s1.z(t10, j10) & (1 << (h02 >>> 20))) != 0;
        }
        int r02 = r0(i10);
        long U = U(r02);
        switch (q0(r02)) {
            case 0:
                return Double.doubleToRawLongBits(s1.x(t10, U)) != 0;
            case 1:
                return Float.floatToRawIntBits(s1.y(t10, U)) != 0;
            case 2:
                return s1.A(t10, U) != 0;
            case 3:
                return s1.A(t10, U) != 0;
            case 4:
                return s1.z(t10, U) != 0;
            case 5:
                return s1.A(t10, U) != 0;
            case 6:
                return s1.z(t10, U) != 0;
            case 7:
                return s1.r(t10, U);
            case 8:
                Object C = s1.C(t10, U);
                if (C instanceof String) {
                    return !((String) C).isEmpty();
                }
                if (C instanceof i) {
                    return !i.f6190k.equals(C);
                }
                throw new IllegalArgumentException();
            case 9:
                return s1.C(t10, U) != null;
            case 10:
                return !i.f6190k.equals(s1.C(t10, U));
            case 11:
                return s1.z(t10, U) != 0;
            case 12:
                return s1.z(t10, U) != 0;
            case 13:
                return s1.z(t10, U) != 0;
            case 14:
                return s1.A(t10, U) != 0;
            case 15:
                return s1.z(t10, U) != 0;
            case 16:
                return s1.A(t10, U) != 0;
            case 17:
                return s1.C(t10, U) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean C(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? B(t10, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean D(Object obj, int i10, h1 h1Var) {
        return h1Var.c(s1.C(obj, U(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean E(Object obj, int i10, int i11) {
        List list = (List) s1.C(obj, U(i10));
        if (list.isEmpty()) {
            return true;
        }
        h1 u10 = u(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!u10.c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean F(T t10, int i10, int i11) {
        if (this.f6382q.g(s1.C(t10, U(i10))).isEmpty()) {
            return true;
        }
        this.f6382q.f(t(i11));
        throw null;
    }

    private boolean G(T t10, T t11, int i10) {
        long h02 = h0(i10) & 1048575;
        return s1.z(t10, h02) == s1.z(t11, h02);
    }

    private boolean H(T t10, int i10, int i11) {
        return s1.z(t10, (long) (h0(i11) & 1048575)) == i10;
    }

    private static boolean I(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> J(Object obj, long j10) {
        return (List) s1.C(obj, j10);
    }

    private static <T> long K(T t10, long j10) {
        return s1.A(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:327:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r0 = r16.f6376k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r0 >= r16.f6377l) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
        r13 = p(r19, r16.f6375j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r13 == null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.v.b<ET>> void L(com.google.crypto.tink.shaded.protobuf.o1<UT, UB> r17, com.google.crypto.tink.shaded.protobuf.r<ET> r18, T r19, com.google.crypto.tink.shaded.protobuf.g1 r20, com.google.crypto.tink.shaded.protobuf.q r21) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.L(com.google.crypto.tink.shaded.protobuf.o1, com.google.crypto.tink.shaded.protobuf.r, java.lang.Object, com.google.crypto.tink.shaded.protobuf.g1, com.google.crypto.tink.shaded.protobuf.q):void");
    }

    private final <K, V> void M(Object obj, int i10, Object obj2, q qVar, g1 g1Var) {
        long U = U(r0(i10));
        Object C = s1.C(obj, U);
        if (C == null) {
            C = this.f6382q.b(obj2);
            s1.R(obj, U, C);
        } else if (this.f6382q.d(C)) {
            Object b10 = this.f6382q.b(obj2);
            this.f6382q.a(b10, C);
            s1.R(obj, U, b10);
            C = b10;
        }
        Map<?, ?> h10 = this.f6382q.h(C);
        this.f6382q.f(obj2);
        g1Var.O(h10, null, qVar);
    }

    private void N(T t10, T t11, int i10) {
        long U = U(r0(i10));
        if (B(t11, i10)) {
            Object C = s1.C(t10, U);
            Object C2 = s1.C(t11, U);
            if (C != null && C2 != null) {
                C2 = b0.h(C, C2);
            } else if (C2 == null) {
                return;
            }
            s1.R(t10, U, C2);
            n0(t10, i10);
        }
    }

    private void O(T t10, T t11, int i10) {
        int r02 = r0(i10);
        int T = T(i10);
        long U = U(r02);
        if (H(t11, T, i10)) {
            Object C = H(t10, T, i10) ? s1.C(t10, U) : null;
            Object C2 = s1.C(t11, U);
            if (C != null && C2 != null) {
                C2 = b0.h(C, C2);
            } else if (C2 == null) {
                return;
            }
            s1.R(t10, U, C2);
            o0(t10, T, i10);
        }
    }

    private void P(T t10, T t11, int i10) {
        int r02 = r0(i10);
        long U = U(r02);
        int T = T(i10);
        switch (q0(r02)) {
            case 0:
                if (B(t11, i10)) {
                    s1.N(t10, U, s1.x(t11, U));
                    n0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (B(t11, i10)) {
                    s1.O(t10, U, s1.y(t11, U));
                    n0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (!B(t11, i10)) {
                    return;
                }
                s1.Q(t10, U, s1.A(t11, U));
                n0(t10, i10);
                return;
            case 3:
                if (!B(t11, i10)) {
                    return;
                }
                s1.Q(t10, U, s1.A(t11, U));
                n0(t10, i10);
                return;
            case 4:
                if (!B(t11, i10)) {
                    return;
                }
                s1.P(t10, U, s1.z(t11, U));
                n0(t10, i10);
                return;
            case 5:
                if (!B(t11, i10)) {
                    return;
                }
                s1.Q(t10, U, s1.A(t11, U));
                n0(t10, i10);
                return;
            case 6:
                if (!B(t11, i10)) {
                    return;
                }
                s1.P(t10, U, s1.z(t11, U));
                n0(t10, i10);
                return;
            case 7:
                if (B(t11, i10)) {
                    s1.H(t10, U, s1.r(t11, U));
                    n0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (!B(t11, i10)) {
                    return;
                }
                s1.R(t10, U, s1.C(t11, U));
                n0(t10, i10);
                return;
            case 9:
            case 17:
                N(t10, t11, i10);
                return;
            case 10:
                if (!B(t11, i10)) {
                    return;
                }
                s1.R(t10, U, s1.C(t11, U));
                n0(t10, i10);
                return;
            case 11:
                if (!B(t11, i10)) {
                    return;
                }
                s1.P(t10, U, s1.z(t11, U));
                n0(t10, i10);
                return;
            case 12:
                if (!B(t11, i10)) {
                    return;
                }
                s1.P(t10, U, s1.z(t11, U));
                n0(t10, i10);
                return;
            case 13:
                if (!B(t11, i10)) {
                    return;
                }
                s1.P(t10, U, s1.z(t11, U));
                n0(t10, i10);
                return;
            case 14:
                if (!B(t11, i10)) {
                    return;
                }
                s1.Q(t10, U, s1.A(t11, U));
                n0(t10, i10);
                return;
            case 15:
                if (!B(t11, i10)) {
                    return;
                }
                s1.P(t10, U, s1.z(t11, U));
                n0(t10, i10);
                return;
            case 16:
                if (!B(t11, i10)) {
                    return;
                }
                s1.Q(t10, U, s1.A(t11, U));
                n0(t10, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case f.j.f8330t3 /* 23 */:
            case f.j.f8335u3 /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case f.j.f8360z3 /* 29 */:
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
                this.f6379n.d(t10, t11, U);
                return;
            case 50:
                j1.F(this.f6382q, t10, t11, U);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!H(t11, T, i10)) {
                    return;
                }
                s1.R(t10, U, s1.C(t11, U));
                o0(t10, T, i10);
                return;
            case 60:
            case 68:
                O(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!H(t11, T, i10)) {
                    return;
                }
                s1.R(t10, U, s1.C(t11, U));
                o0(t10, T, i10);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> v0<T> Q(Class<T> cls, q0 q0Var, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, r<?> rVar, n0 n0Var) {
        return q0Var instanceof f1 ? S((f1) q0Var, x0Var, i0Var, o1Var, rVar, n0Var) : R((l1) q0Var, x0Var, i0Var, o1Var, rVar, n0Var);
    }

    static <T> v0<T> R(l1 l1Var, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, r<?> rVar, n0 n0Var) {
        boolean z10 = l1Var.b() == c1.PROTO3;
        u[] e10 = l1Var.e();
        if (e10.length != 0) {
            u uVar = e10[0];
            throw null;
        }
        int length = e10.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (e10.length > 0) {
            u uVar2 = e10[0];
            throw null;
        }
        int[] d10 = l1Var.d();
        if (d10 == null) {
            d10 = f6364r;
        }
        if (e10.length > 0) {
            u uVar3 = e10[0];
            throw null;
        }
        int[] iArr2 = f6364r;
        int[] iArr3 = f6364r;
        int[] iArr4 = new int[d10.length + iArr2.length + iArr3.length];
        System.arraycopy(d10, 0, iArr4, 0, d10.length);
        System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
        return new v0<>(iArr, objArr, 0, 0, l1Var.c(), z10, true, iArr4, d10.length, d10.length + iArr2.length, x0Var, i0Var, o1Var, rVar, n0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.crypto.tink.shaded.protobuf.v0<T> S(com.google.crypto.tink.shaded.protobuf.f1 r34, com.google.crypto.tink.shaded.protobuf.x0 r35, com.google.crypto.tink.shaded.protobuf.i0 r36, com.google.crypto.tink.shaded.protobuf.o1<?, ?> r37, com.google.crypto.tink.shaded.protobuf.r<?> r38, com.google.crypto.tink.shaded.protobuf.n0 r39) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.S(com.google.crypto.tink.shaded.protobuf.f1, com.google.crypto.tink.shaded.protobuf.x0, com.google.crypto.tink.shaded.protobuf.i0, com.google.crypto.tink.shaded.protobuf.o1, com.google.crypto.tink.shaded.protobuf.r, com.google.crypto.tink.shaded.protobuf.n0):com.google.crypto.tink.shaded.protobuf.v0");
    }

    private int T(int i10) {
        return this.f6366a[i10];
    }

    private static long U(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean V(T t10, long j10) {
        return ((Boolean) s1.C(t10, j10)).booleanValue();
    }

    private static <T> double W(T t10, long j10) {
        return ((Double) s1.C(t10, j10)).doubleValue();
    }

    private static <T> float X(T t10, long j10) {
        return ((Float) s1.C(t10, j10)).floatValue();
    }

    private static <T> int Y(T t10, long j10) {
        return ((Integer) s1.C(t10, j10)).intValue();
    }

    private static <T> long Z(T t10, long j10) {
        return ((Long) s1.C(t10, j10)).longValue();
    }

    private <K, V> int a0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, e.b bVar) {
        Unsafe unsafe = f6365s;
        Object t11 = t(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f6382q.d(object)) {
            Object b10 = this.f6382q.b(t11);
            this.f6382q.a(b10, object);
            unsafe.putObject(t10, j10, b10);
            object = b10;
        }
        this.f6382q.f(t11);
        return m(bArr, i10, i11, null, this.f6382q.h(object), bVar);
    }

    private int b0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e.b bVar) {
        Object valueOf;
        Object valueOf2;
        int L;
        long j11;
        int i18;
        Object valueOf3;
        Unsafe unsafe = f6365s;
        long j12 = this.f6366a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    valueOf = Double.valueOf(e.d(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf);
                    L = i10 + 8;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    valueOf2 = Float.valueOf(e.l(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf2);
                    L = i10 + 4;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    L = e.L(bArr, i10, bVar);
                    j11 = bVar.f6159b;
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    L = e.I(bArr, i10, bVar);
                    i18 = bVar.f6158a;
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    valueOf = Long.valueOf(e.j(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf);
                    L = i10 + 8;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    valueOf2 = Integer.valueOf(e.h(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf2);
                    L = i10 + 4;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    L = e.L(bArr, i10, bVar);
                    valueOf3 = Boolean.valueOf(bVar.f6159b != 0);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    L = e.I(bArr, i10, bVar);
                    int i19 = bVar.f6158a;
                    if (i19 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t10, j10, valueOf3);
                        unsafe.putInt(t10, j12, i13);
                        return L;
                    } else if ((i15 & 536870912) == 0 || t1.n(bArr, L, L + i19)) {
                        unsafe.putObject(t10, j10, new String(bArr, L, i19, b0.f6126b));
                        L += i19;
                        unsafe.putInt(t10, j12, i13);
                        return L;
                    } else {
                        throw c0.d();
                    }
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    L = e.p(u(i17), bArr, i10, i11, bVar);
                    Object object = unsafe.getInt(t10, j12) == i13 ? unsafe.getObject(t10, j10) : null;
                    valueOf3 = bVar.f6160c;
                    if (object != null) {
                        valueOf3 = b0.h(object, valueOf3);
                    }
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    L = e.b(bArr, i10, bVar);
                    valueOf3 = bVar.f6160c;
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int I = e.I(bArr, i10, bVar);
                    int i20 = bVar.f6158a;
                    b0.e s10 = s(i17);
                    if (s10 == null || s10.a(i20)) {
                        unsafe.putObject(t10, j10, Integer.valueOf(i20));
                        unsafe.putInt(t10, j12, i13);
                    } else {
                        v(t10).m(i12, Long.valueOf(i20));
                    }
                    return I;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    L = e.I(bArr, i10, bVar);
                    i18 = j.b(bVar.f6158a);
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    L = e.L(bArr, i10, bVar);
                    j11 = j.c(bVar.f6159b);
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    L = e.n(u(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    Object object2 = unsafe.getInt(t10, j12) == i13 ? unsafe.getObject(t10, j10) : null;
                    valueOf3 = bVar.f6160c;
                    if (object2 != null) {
                        valueOf3 = b0.h(object2, valueOf3);
                    }
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0280, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0282, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r19;
        r2 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c7, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e8, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02eb, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int d0(T r31, byte[] r32, int r33, int r34, com.google.crypto.tink.shaded.protobuf.e.b r35) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.d0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    private int e0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, e.b bVar) {
        int J;
        Unsafe unsafe = f6365s;
        b0.i iVar = (b0.i) unsafe.getObject(t10, j11);
        if (!iVar.h()) {
            int size = iVar.size();
            iVar = iVar.c(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, iVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return e.s(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return e.e(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    return e.v(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return e.m(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return e.z(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.M(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 22:
            case f.j.f8360z3 /* 29 */:
            case 39:
            case 43:
                if (i14 == 2) {
                    return e.y(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.J(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case f.j.f8330t3 /* 23 */:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return e.u(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return e.k(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case f.j.f8335u3 /* 24 */:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return e.t(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return e.i(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    return e.r(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.a(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 26:
                if (i14 == 2) {
                    int i17 = ((j10 & 536870912) > 0L ? 1 : ((j10 & 536870912) == 0L ? 0 : -1));
                    b0.i iVar2 = iVar;
                    return i17 == 0 ? e.D(i12, bArr, i10, i11, iVar2, bVar) : e.E(i12, bArr, i10, i11, iVar2, bVar);
                }
                break;
            case 27:
                if (i14 == 2) {
                    return e.q(u(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 28:
                if (i14 == 2) {
                    return e.c(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    J = e.y(bArr, i10, iVar, bVar);
                } else if (i14 == 0) {
                    J = e.J(i12, bArr, i10, i11, iVar, bVar);
                }
                z zVar = (z) t10;
                p1 p1Var = zVar.unknownFields;
                if (p1Var == p1.c()) {
                    p1Var = null;
                }
                p1 p1Var2 = (p1) j1.A(i13, iVar, s(i15), p1Var, this.f6380o);
                if (p1Var2 != null) {
                    zVar.unknownFields = p1Var2;
                }
                return J;
            case 33:
            case 47:
                if (i14 == 2) {
                    return e.w(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.A(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    return e.x(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.B(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 49:
                if (i14 == 3) {
                    return e.o(u(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                break;
        }
        return i10;
    }

    private int f0(int i10) {
        if (i10 < this.f6368c || i10 > this.f6369d) {
            return -1;
        }
        return p0(i10, 0);
    }

    private int g0(int i10, int i11) {
        if (i10 < this.f6368c || i10 > this.f6369d) {
            return -1;
        }
        return p0(i10, i11);
    }

    private int h0(int i10) {
        return this.f6366a[i10 + 2];
    }

    private <E> void i0(Object obj, long j10, g1 g1Var, h1<E> h1Var, q qVar) {
        g1Var.P(this.f6379n.e(obj, j10), h1Var, qVar);
    }

    private <E> void j0(Object obj, int i10, g1 g1Var, h1<E> h1Var, q qVar) {
        g1Var.M(this.f6379n.e(obj, U(i10)), h1Var, qVar);
    }

    private boolean k(T t10, T t11, int i10) {
        return B(t10, i10) == B(t11, i10);
    }

    private void k0(Object obj, int i10, g1 g1Var) {
        long U;
        Object u10;
        if (A(i10)) {
            U = U(i10);
            u10 = g1Var.F();
        } else if (this.f6372g) {
            U = U(i10);
            u10 = g1Var.m();
        } else {
            U = U(i10);
            u10 = g1Var.u();
        }
        s1.R(obj, U, u10);
    }

    private static <T> boolean l(T t10, long j10) {
        return s1.r(t10, j10);
    }

    private void l0(Object obj, int i10, g1 g1Var) {
        if (A(i10)) {
            g1Var.t(this.f6379n.e(obj, U(i10)));
        } else {
            g1Var.q(this.f6379n.e(obj, U(i10)));
        }
    }

    private <K, V> int m(byte[] bArr, int i10, int i11, l0.a<K, V> aVar, Map<K, V> map, e.b bVar) {
        int I = e.I(bArr, i10, bVar);
        int i12 = bVar.f6158a;
        if (i12 < 0 || i12 > i11 - I) {
            throw c0.k();
        }
        throw null;
    }

    private static Field m0(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static <T> double n(T t10, long j10) {
        return s1.x(t10, j10);
    }

    private void n0(T t10, int i10) {
        int h02 = h0(i10);
        long j10 = 1048575 & h02;
        if (j10 == 1048575) {
            return;
        }
        s1.P(t10, j10, (1 << (h02 >>> 20)) | s1.z(t10, j10));
    }

    private boolean o(T t10, T t11, int i10) {
        int r02 = r0(i10);
        long U = U(r02);
        switch (q0(r02)) {
            case 0:
                return k(t10, t11, i10) && Double.doubleToLongBits(s1.x(t10, U)) == Double.doubleToLongBits(s1.x(t11, U));
            case 1:
                return k(t10, t11, i10) && Float.floatToIntBits(s1.y(t10, U)) == Float.floatToIntBits(s1.y(t11, U));
            case 2:
                return k(t10, t11, i10) && s1.A(t10, U) == s1.A(t11, U);
            case 3:
                return k(t10, t11, i10) && s1.A(t10, U) == s1.A(t11, U);
            case 4:
                return k(t10, t11, i10) && s1.z(t10, U) == s1.z(t11, U);
            case 5:
                return k(t10, t11, i10) && s1.A(t10, U) == s1.A(t11, U);
            case 6:
                return k(t10, t11, i10) && s1.z(t10, U) == s1.z(t11, U);
            case 7:
                return k(t10, t11, i10) && s1.r(t10, U) == s1.r(t11, U);
            case 8:
                return k(t10, t11, i10) && j1.K(s1.C(t10, U), s1.C(t11, U));
            case 9:
                return k(t10, t11, i10) && j1.K(s1.C(t10, U), s1.C(t11, U));
            case 10:
                return k(t10, t11, i10) && j1.K(s1.C(t10, U), s1.C(t11, U));
            case 11:
                return k(t10, t11, i10) && s1.z(t10, U) == s1.z(t11, U);
            case 12:
                return k(t10, t11, i10) && s1.z(t10, U) == s1.z(t11, U);
            case 13:
                return k(t10, t11, i10) && s1.z(t10, U) == s1.z(t11, U);
            case 14:
                return k(t10, t11, i10) && s1.A(t10, U) == s1.A(t11, U);
            case 15:
                return k(t10, t11, i10) && s1.z(t10, U) == s1.z(t11, U);
            case 16:
                return k(t10, t11, i10) && s1.A(t10, U) == s1.A(t11, U);
            case 17:
                return k(t10, t11, i10) && j1.K(s1.C(t10, U), s1.C(t11, U));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case f.j.f8330t3 /* 23 */:
            case f.j.f8335u3 /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case f.j.f8360z3 /* 29 */:
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
                return j1.K(s1.C(t10, U), s1.C(t11, U));
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
                return G(t10, t11, i10) && j1.K(s1.C(t10, U), s1.C(t11, U));
            default:
                return true;
        }
    }

    private void o0(T t10, int i10, int i11) {
        s1.P(t10, h0(i11) & 1048575, i10);
    }

    private final <UT, UB> UB p(Object obj, int i10, UB ub, o1<UT, UB> o1Var) {
        b0.e s10;
        int T = T(i10);
        Object C = s1.C(obj, U(r0(i10)));
        return (C == null || (s10 = s(i10)) == null) ? ub : (UB) q(i10, T, this.f6382q.h(C), s10, ub, o1Var);
    }

    private int p0(int i10, int i11) {
        int length = (this.f6366a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int T = T(i13);
            if (i10 == T) {
                return i13;
            }
            if (i10 < T) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private final <K, V, UT, UB> UB q(int i10, int i11, Map<K, V> map, b0.e eVar, UB ub, o1<UT, UB> o1Var) {
        this.f6382q.f(t(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = o1Var.n();
                }
                i.h v10 = i.v(l0.b(null, next.getKey(), next.getValue()));
                try {
                    l0.d(v10.b(), null, next.getKey(), next.getValue());
                    o1Var.d(ub, i11, v10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    private static int q0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static <T> float r(T t10, long j10) {
        return s1.y(t10, j10);
    }

    private int r0(int i10) {
        return this.f6366a[i10 + 1];
    }

    private b0.e s(int i10) {
        return (b0.e) this.f6367b[((i10 / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void s0(T r18, com.google.crypto.tink.shaded.protobuf.v1 r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.s0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.v1):void");
    }

    private Object t(int i10) {
        return this.f6367b[(i10 / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0528  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t0(T r13, com.google.crypto.tink.shaded.protobuf.v1 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.t0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.v1):void");
    }

    private h1 u(int i10) {
        int i11 = (i10 / 3) * 2;
        h1 h1Var = (h1) this.f6367b[i11];
        if (h1Var != null) {
            return h1Var;
        }
        h1<T> d10 = d1.a().d((Class) this.f6367b[i11 + 1]);
        this.f6367b[i11] = d10;
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x052e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u0(T r11, com.google.crypto.tink.shaded.protobuf.v1 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.u0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.v1):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p1 v(Object obj) {
        z zVar = (z) obj;
        p1 p1Var = zVar.unknownFields;
        if (p1Var == p1.c()) {
            p1 j10 = p1.j();
            zVar.unknownFields = j10;
            return j10;
        }
        return p1Var;
    }

    private <K, V> void v0(v1 v1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f6382q.f(t(i11));
            v1Var.N(i10, null, this.f6382q.g(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bb, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01cd, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01df, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f1, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0202, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0213, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0224, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0235, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0246, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0257, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0259, code lost:
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x025d, code lost:
        r4 = (com.google.crypto.tink.shaded.protobuf.l.U(r10) + com.google.crypto.tink.shaded.protobuf.l.W(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x030e, code lost:
        if ((r8 & r15) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0310, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.l.s(r10, (com.google.crypto.tink.shaded.protobuf.s0) r2.getObject(r17, r13), u(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x033b, code lost:
        if ((r8 & r15) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x033d, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.l.M(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0344, code lost:
        if ((r8 & r15) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0346, code lost:
        r4 = com.google.crypto.tink.shaded.protobuf.l.K(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0369, code lost:
        if ((r8 & r15) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x036b, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.l.g(r10, (com.google.crypto.tink.shaded.protobuf.i) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0378, code lost:
        if ((r8 & r15) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x037a, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.j1.o(r10, r2.getObject(r17, r13), u(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03a5, code lost:
        if ((r8 & r15) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03a7, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.l.d(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (H(r17, r10, r5) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (H(r17, r10, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (H(r17, r10, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (H(r17, r10, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
        if (H(r17, r10, r5) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00de, code lost:
        if (H(r17, r10, r5) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0185, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0197, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a9, code lost:
        if (r16.f6374i != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int w(T r17) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.w(java.lang.Object):int");
    }

    private void w0(int i10, Object obj, v1 v1Var) {
        if (obj instanceof String) {
            v1Var.A(i10, (String) obj);
        } else {
            v1Var.M(i10, (i) obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0184, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0196, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a8, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b9, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ca, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01db, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ec, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fd, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020e, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0210, code lost:
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0214, code lost:
        r6 = (com.google.crypto.tink.shaded.protobuf.l.U(r8) + com.google.crypto.tink.shaded.protobuf.l.W(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0334, code lost:
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.i) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.i) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
        r6 = com.google.crypto.tink.shaded.protobuf.l.S(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012a, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013c, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014e, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0172, code lost:
        if (r15.f6374i != false) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int x(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.x(java.lang.Object):int");
    }

    private <UT, UB> void x0(o1<UT, UB> o1Var, T t10, v1 v1Var) {
        o1Var.t(o1Var.g(t10), v1Var);
    }

    private <UT, UB> int y(o1<UT, UB> o1Var, T t10) {
        return o1Var.h(o1Var.g(t10));
    }

    private static <T> int z(T t10, long j10) {
        return s1.z(t10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void a(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f6366a.length; i10 += 3) {
            P(t10, t11, i10);
        }
        j1.G(this.f6380o, t10, t11);
        if (this.f6371f) {
            j1.E(this.f6381p, t10, t11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void b(T t10) {
        int i10;
        int i11 = this.f6376k;
        while (true) {
            i10 = this.f6377l;
            if (i11 >= i10) {
                break;
            }
            long U = U(r0(this.f6375j[i11]));
            Object C = s1.C(t10, U);
            if (C != null) {
                s1.R(t10, U, this.f6382q.e(C));
            }
            i11++;
        }
        int length = this.f6375j.length;
        while (i10 < length) {
            this.f6379n.c(t10, this.f6375j[i10]);
            i10++;
        }
        this.f6380o.j(t10);
        if (this.f6371f) {
            this.f6381p.f(t10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final boolean c(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f6376k) {
            int i15 = this.f6375j[i14];
            int T = T(i15);
            int r02 = r0(i15);
            int i16 = this.f6366a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f6365s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (I(r02) && !C(t10, i15, i10, i11, i18)) {
                return false;
            }
            int q02 = q0(r02);
            if (q02 != 9 && q02 != 17) {
                if (q02 != 27) {
                    if (q02 == 60 || q02 == 68) {
                        if (H(t10, T, i15) && !D(t10, r02, u(i15))) {
                            return false;
                        }
                    } else if (q02 != 49) {
                        if (q02 == 50 && !F(t10, r02, i15)) {
                            return false;
                        }
                    }
                }
                if (!E(t10, r02, i15)) {
                    return false;
                }
            } else if (C(t10, i15, i10, i11, i18) && !D(t10, r02, u(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f6371f || this.f6381p.c(t10).o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c0(T t10, byte[] bArr, int i10, int i11, int i12, e.b bVar) {
        Unsafe unsafe;
        int i13;
        v0<T> v0Var;
        int i14;
        T t11;
        byte b10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        T t12;
        T t13;
        long j10;
        int i23;
        int i24;
        T t14;
        long j11;
        Object obj;
        int i25;
        int i26;
        v0<T> v0Var2 = this;
        T t15 = t10;
        byte[] bArr2 = bArr;
        int i27 = i11;
        int i28 = i12;
        e.b bVar2 = bVar;
        Unsafe unsafe2 = f6365s;
        int i29 = i10;
        int i30 = -1;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 1048575;
        while (true) {
            if (i29 < i27) {
                int i35 = i29 + 1;
                byte b11 = bArr2[i29];
                if (b11 < 0) {
                    int H = e.H(b11, bArr2, i35, bVar2);
                    b10 = bVar2.f6158a;
                    i35 = H;
                } else {
                    b10 = b11;
                }
                int i36 = b10 >>> 3;
                int i37 = b10 & 7;
                int g02 = i36 > i30 ? v0Var2.g0(i36, i31 / 3) : v0Var2.f0(i36);
                if (g02 == -1) {
                    i15 = i36;
                    i16 = i35;
                    i17 = b10;
                    i18 = i33;
                    i19 = i34;
                    unsafe = unsafe2;
                    i13 = i28;
                    i20 = 0;
                } else {
                    int i38 = v0Var2.f6366a[g02 + 1];
                    int q02 = q0(i38);
                    long U = U(i38);
                    int i39 = b10;
                    if (q02 <= 17) {
                        int i40 = v0Var2.f6366a[g02 + 2];
                        int i41 = 1 << (i40 >>> 20);
                        int i42 = i40 & 1048575;
                        if (i42 != i34) {
                            if (i34 != 1048575) {
                                unsafe2.putInt(t15, i34, i33);
                            }
                            i33 = unsafe2.getInt(t15, i42);
                            i19 = i42;
                        } else {
                            i19 = i34;
                        }
                        int i43 = i33;
                        switch (q02) {
                            case 0:
                                t12 = t15;
                                i21 = g02;
                                i15 = i36;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 == 1) {
                                    s1.N(t12, U, e.d(bArr2, i35));
                                    i29 = i35 + 8;
                                    i33 = i43 | i41;
                                    i27 = i11;
                                    t15 = t12;
                                    i31 = i21;
                                    i32 = i22;
                                    i30 = i15;
                                    i34 = i19;
                                    i28 = i12;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 1:
                                t12 = t15;
                                i21 = g02;
                                i15 = i36;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 == 5) {
                                    s1.O(t12, U, e.l(bArr2, i35));
                                    i29 = i35 + 4;
                                    i33 = i43 | i41;
                                    i27 = i11;
                                    t15 = t12;
                                    i31 = i21;
                                    i32 = i22;
                                    i30 = i15;
                                    i34 = i19;
                                    i28 = i12;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 2:
                            case 3:
                                T t16 = t15;
                                i21 = g02;
                                i15 = i36;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    int L = e.L(bArr2, i35, bVar2);
                                    t13 = t16;
                                    unsafe2.putLong(t10, U, bVar2.f6159b);
                                    i33 = i43 | i41;
                                    i29 = L;
                                    i31 = i21;
                                    i32 = i22;
                                    t15 = t13;
                                    i30 = i15;
                                    i34 = i19;
                                    i27 = i11;
                                    i28 = i12;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 4:
                            case 11:
                                t12 = t15;
                                i21 = g02;
                                i15 = i36;
                                j10 = U;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    i29 = e.I(bArr2, i35, bVar2);
                                    i23 = bVar2.f6158a;
                                    unsafe2.putInt(t12, j10, i23);
                                    i33 = i43 | i41;
                                    i27 = i11;
                                    t15 = t12;
                                    i31 = i21;
                                    i32 = i22;
                                    i30 = i15;
                                    i34 = i19;
                                    i28 = i12;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 5:
                            case 14:
                                T t17 = t15;
                                i21 = g02;
                                i15 = i36;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 == 1) {
                                    t13 = t17;
                                    unsafe2.putLong(t10, U, e.j(bArr2, i35));
                                    i29 = i35 + 8;
                                    i33 = i43 | i41;
                                    i31 = i21;
                                    i32 = i22;
                                    t15 = t13;
                                    i30 = i15;
                                    i34 = i19;
                                    i27 = i11;
                                    i28 = i12;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 6:
                            case 13:
                                i24 = i11;
                                t14 = t15;
                                i21 = g02;
                                i15 = i36;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 == 5) {
                                    unsafe2.putInt(t14, U, e.h(bArr2, i35));
                                    i29 = i35 + 4;
                                    int i44 = i43 | i41;
                                    t15 = t14;
                                    i27 = i24;
                                    i31 = i21;
                                    i32 = i22;
                                    i34 = i19;
                                    i28 = i12;
                                    i33 = i44;
                                    i30 = i15;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 7:
                                i24 = i11;
                                t14 = t15;
                                i21 = g02;
                                i15 = i36;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 == 0) {
                                    i29 = e.L(bArr2, i35, bVar2);
                                    s1.H(t14, U, bVar2.f6159b != 0);
                                    int i442 = i43 | i41;
                                    t15 = t14;
                                    i27 = i24;
                                    i31 = i21;
                                    i32 = i22;
                                    i34 = i19;
                                    i28 = i12;
                                    i33 = i442;
                                    i30 = i15;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 8:
                                i24 = i11;
                                t14 = t15;
                                i21 = g02;
                                i15 = i36;
                                j11 = U;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 == 2) {
                                    i29 = (i38 & 536870912) == 0 ? e.C(bArr2, i35, bVar2) : e.F(bArr2, i35, bVar2);
                                    obj = bVar2.f6160c;
                                    unsafe2.putObject(t14, j11, obj);
                                    int i4422 = i43 | i41;
                                    t15 = t14;
                                    i27 = i24;
                                    i31 = i21;
                                    i32 = i22;
                                    i34 = i19;
                                    i28 = i12;
                                    i33 = i4422;
                                    i30 = i15;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 9:
                                t14 = t15;
                                i21 = g02;
                                i15 = i36;
                                j11 = U;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 == 2) {
                                    i24 = i11;
                                    i29 = e.p(v0Var2.u(i21), bArr2, i35, i24, bVar2);
                                    obj = (i43 & i41) == 0 ? bVar2.f6160c : b0.h(unsafe2.getObject(t14, j11), bVar2.f6160c);
                                    unsafe2.putObject(t14, j11, obj);
                                    int i44222 = i43 | i41;
                                    t15 = t14;
                                    i27 = i24;
                                    i31 = i21;
                                    i32 = i22;
                                    i34 = i19;
                                    i28 = i12;
                                    i33 = i44222;
                                    i30 = i15;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 10:
                                t12 = t15;
                                i21 = g02;
                                i15 = i36;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 == 2) {
                                    i29 = e.b(bArr2, i35, bVar2);
                                    unsafe2.putObject(t12, U, bVar2.f6160c);
                                    i33 = i43 | i41;
                                    i27 = i11;
                                    t15 = t12;
                                    i31 = i21;
                                    i32 = i22;
                                    i30 = i15;
                                    i34 = i19;
                                    i28 = i12;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 12:
                                t12 = t15;
                                i21 = g02;
                                i15 = i36;
                                j10 = U;
                                i22 = i39;
                                bArr2 = bArr;
                                if (i37 != 0) {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                } else {
                                    i29 = e.I(bArr2, i35, bVar2);
                                    i23 = bVar2.f6158a;
                                    b0.e s10 = v0Var2.s(i21);
                                    if (s10 != null && !s10.a(i23)) {
                                        v(t10).m(i22, Long.valueOf(i23));
                                        i27 = i11;
                                        t15 = t12;
                                        i33 = i43;
                                        i31 = i21;
                                        i32 = i22;
                                        i30 = i15;
                                        i34 = i19;
                                        i28 = i12;
                                        break;
                                    }
                                    unsafe2.putInt(t12, j10, i23);
                                    i33 = i43 | i41;
                                    i27 = i11;
                                    t15 = t12;
                                    i31 = i21;
                                    i32 = i22;
                                    i30 = i15;
                                    i34 = i19;
                                    i28 = i12;
                                }
                                break;
                            case 15:
                                j10 = U;
                                i21 = g02;
                                i22 = i39;
                                bArr2 = bArr;
                                i15 = i36;
                                if (i37 == 0) {
                                    i29 = e.I(bArr2, i35, bVar2);
                                    i23 = j.b(bVar2.f6158a);
                                    t12 = t10;
                                    unsafe2.putInt(t12, j10, i23);
                                    i33 = i43 | i41;
                                    i27 = i11;
                                    t15 = t12;
                                    i31 = i21;
                                    i32 = i22;
                                    i30 = i15;
                                    i34 = i19;
                                    i28 = i12;
                                    break;
                                } else {
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 16:
                                i21 = g02;
                                i15 = i36;
                                if (i37 == 0) {
                                    bArr2 = bArr;
                                    int L2 = e.L(bArr2, i35, bVar2);
                                    i22 = i39;
                                    unsafe2.putLong(t10, U, j.c(bVar2.f6159b));
                                    i33 = i43 | i41;
                                    t15 = t10;
                                    i27 = i11;
                                    i29 = L2;
                                    i31 = i21;
                                    i32 = i22;
                                    i30 = i15;
                                    i34 = i19;
                                    i28 = i12;
                                    break;
                                } else {
                                    i22 = i39;
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            case 17:
                                if (i37 == 3) {
                                    i29 = e.n(v0Var2.u(g02), bArr, i35, i11, (i36 << 3) | 4, bVar);
                                    unsafe2.putObject(t15, U, (i43 & i41) == 0 ? bVar2.f6160c : b0.h(unsafe2.getObject(t15, U), bVar2.f6160c));
                                    i33 = i43 | i41;
                                    bArr2 = bArr;
                                    i27 = i11;
                                    i28 = i12;
                                    i32 = i39;
                                    i31 = g02;
                                    i30 = i36;
                                    i34 = i19;
                                    break;
                                } else {
                                    i21 = g02;
                                    i15 = i36;
                                    i22 = i39;
                                    i16 = i35;
                                    i18 = i43;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i13 = i12;
                                    break;
                                }
                            default:
                                i21 = g02;
                                i22 = i39;
                                i15 = i36;
                                i16 = i35;
                                i18 = i43;
                                i20 = i21;
                                unsafe = unsafe2;
                                i17 = i22;
                                i13 = i12;
                                break;
                        }
                    } else {
                        i15 = i36;
                        T t18 = t15;
                        bArr2 = bArr;
                        if (q02 != 27) {
                            i20 = g02;
                            i18 = i33;
                            i19 = i34;
                            if (q02 <= 49) {
                                int i45 = i35;
                                unsafe = unsafe2;
                                i26 = i39;
                                i29 = e0(t10, bArr, i35, i11, i39, i15, i37, i20, i38, q02, U, bVar);
                                if (i29 != i45) {
                                    v0Var2 = this;
                                    t15 = t10;
                                    bArr2 = bArr;
                                    i27 = i11;
                                    i28 = i12;
                                    bVar2 = bVar;
                                    i30 = i15;
                                    i32 = i26;
                                    i31 = i20;
                                    i33 = i18;
                                    i34 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i16 = i29;
                                    i17 = i26;
                                }
                            } else {
                                i25 = i35;
                                unsafe = unsafe2;
                                i26 = i39;
                                if (q02 != 50) {
                                    i29 = b0(t10, bArr, i25, i11, i26, i15, i37, i38, q02, U, i20, bVar);
                                    if (i29 != i25) {
                                        v0Var2 = this;
                                        t15 = t10;
                                        bArr2 = bArr;
                                        i27 = i11;
                                        i28 = i12;
                                        bVar2 = bVar;
                                        i30 = i15;
                                        i32 = i26;
                                        i31 = i20;
                                        i33 = i18;
                                        i34 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i16 = i29;
                                        i17 = i26;
                                    }
                                } else if (i37 == 2) {
                                    i29 = a0(t10, bArr, i25, i11, i20, U, bVar);
                                    if (i29 != i25) {
                                        v0Var2 = this;
                                        t15 = t10;
                                        bArr2 = bArr;
                                        i27 = i11;
                                        i28 = i12;
                                        bVar2 = bVar;
                                        i30 = i15;
                                        i32 = i26;
                                        i31 = i20;
                                        i33 = i18;
                                        i34 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i16 = i29;
                                        i17 = i26;
                                    }
                                }
                            }
                        } else if (i37 == 2) {
                            b0.i iVar = (b0.i) unsafe2.getObject(t18, U);
                            if (!iVar.h()) {
                                int size = iVar.size();
                                iVar = iVar.c(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t18, U, iVar);
                            }
                            i19 = i34;
                            i29 = e.q(v0Var2.u(g02), i39, bArr, i35, i11, iVar, bVar);
                            t15 = t10;
                            i27 = i11;
                            i32 = i39;
                            i30 = i15;
                            i31 = g02;
                            i33 = i33;
                            i34 = i19;
                            i28 = i12;
                        } else {
                            i20 = g02;
                            i18 = i33;
                            i19 = i34;
                            i25 = i35;
                            unsafe = unsafe2;
                            i26 = i39;
                        }
                        i13 = i12;
                        i16 = i25;
                        i17 = i26;
                    }
                }
                if (i17 != i13 || i13 == 0) {
                    i29 = (!this.f6371f || bVar.f6161d == q.b()) ? e.G(i17, bArr, i16, i11, v(t10), bVar) : e.g(i17, bArr, i16, i11, t10, this.f6370e, this.f6380o, bVar);
                    t15 = t10;
                    bArr2 = bArr;
                    i27 = i11;
                    i32 = i17;
                    v0Var2 = this;
                    bVar2 = bVar;
                    i30 = i15;
                    i31 = i20;
                    i33 = i18;
                    i34 = i19;
                    unsafe2 = unsafe;
                    i28 = i13;
                } else {
                    i14 = 1048575;
                    v0Var = this;
                    i29 = i16;
                    i32 = i17;
                    i33 = i18;
                    i34 = i19;
                }
            } else {
                unsafe = unsafe2;
                i13 = i28;
                v0Var = v0Var2;
                i14 = 1048575;
            }
        }
        if (i34 != i14) {
            t11 = t10;
            unsafe.putInt(t11, i34, i33);
        } else {
            t11 = t10;
        }
        p1 p1Var = null;
        for (int i46 = v0Var.f6376k; i46 < v0Var.f6377l; i46++) {
            p1Var = (p1) v0Var.p(t11, v0Var.f6375j[i46], p1Var, v0Var.f6380o);
        }
        if (p1Var != null) {
            v0Var.f6380o.o(t11, p1Var);
        }
        if (i13 == 0) {
            if (i29 != i11) {
                throw c0.h();
            }
        } else if (i29 > i11 || i32 != i13) {
            throw c0.h();
        }
        return i29;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public boolean d(T t10, T t11) {
        int length = this.f6366a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!o(t10, t11, i10)) {
                return false;
            }
        }
        if (this.f6380o.g(t10).equals(this.f6380o.g(t11))) {
            if (this.f6371f) {
                return this.f6381p.c(t10).equals(this.f6381p.c(t11));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public int e(T t10) {
        return this.f6373h ? x(t10) : w(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public T f() {
        return (T) this.f6378m.a(this.f6370e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00de, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e4, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.g(java.lang.Object):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void h(T t10, byte[] bArr, int i10, int i11, e.b bVar) {
        if (this.f6373h) {
            d0(t10, bArr, i10, i11, bVar);
        } else {
            c0(t10, bArr, i10, i11, 0, bVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void i(T t10, v1 v1Var) {
        if (v1Var.v() == v1.a.DESCENDING) {
            u0(t10, v1Var);
        } else if (this.f6373h) {
            t0(t10, v1Var);
        } else {
            s0(t10, v1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void j(T t10, g1 g1Var, q qVar) {
        Objects.requireNonNull(qVar);
        L(this.f6380o, this.f6381p, t10, g1Var, qVar);
    }
}
