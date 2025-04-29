package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.c2;
import com.google.protobuf.d0;
import com.google.protobuf.f;
import com.google.protobuf.i;
import com.google.protobuf.o0;
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
public final class y0<T> implements n1<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f7378r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f7379s = z1.H();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f7380a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f7381b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7382c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7383d;

    /* renamed from: e  reason: collision with root package name */
    private final v0 f7384e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7385f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f7386g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f7387h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f7388i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f7389j;

    /* renamed from: k  reason: collision with root package name */
    private final int f7390k;

    /* renamed from: l  reason: collision with root package name */
    private final int f7391l;

    /* renamed from: m  reason: collision with root package name */
    private final a1 f7392m;

    /* renamed from: n  reason: collision with root package name */
    private final l0 f7393n;

    /* renamed from: o  reason: collision with root package name */
    private final v1<?, ?> f7394o;

    /* renamed from: p  reason: collision with root package name */
    private final r<?> f7395p;

    /* renamed from: q  reason: collision with root package name */
    private final q0 f7396q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7397a;

        static {
            int[] iArr = new int[b2.b.values().length];
            f7397a = iArr;
            try {
                iArr[b2.b.f7058s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7397a[b2.b.f7062w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7397a[b2.b.f7051l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7397a[b2.b.f7057r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7397a[b2.b.f7065z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7397a[b2.b.f7056q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7397a[b2.b.A.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7397a[b2.b.f7052m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7397a[b2.b.f7064y.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7397a[b2.b.f7055p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7397a[b2.b.f7063x.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7397a[b2.b.f7053n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7397a[b2.b.f7054o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7397a[b2.b.f7061v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7397a[b2.b.B.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7397a[b2.b.C.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7397a[b2.b.f7059t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private y0(int[] iArr, Object[] objArr, int i10, int i11, v0 v0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, a1 a1Var, l0 l0Var, v1<?, ?> v1Var, r<?> rVar, q0 q0Var) {
        this.f7380a = iArr;
        this.f7381b = objArr;
        this.f7382c = i10;
        this.f7383d = i11;
        this.f7386g = v0Var instanceof z;
        this.f7387h = z10;
        this.f7385f = rVar != null && rVar.e(v0Var);
        this.f7388i = z11;
        this.f7389j = iArr2;
        this.f7390k = i12;
        this.f7391l = i13;
        this.f7392m = a1Var;
        this.f7393n = l0Var;
        this.f7394o = v1Var;
        this.f7395p = rVar;
        this.f7384e = v0Var;
        this.f7396q = q0Var;
    }

    private <UT, UB> int A(v1<UT, UB> v1Var, T t10) {
        return v1Var.h(v1Var.g(t10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0528  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0(T r13, com.google.protobuf.c2 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.A0(java.lang.Object, com.google.protobuf.c2):void");
    }

    private static <T> int B(T t10, long j10) {
        return z1.C(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x052e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void B0(T r11, com.google.protobuf.c2 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.B0(java.lang.Object, com.google.protobuf.c2):void");
    }

    private static boolean C(int i10) {
        return (i10 & 536870912) != 0;
    }

    private <K, V> void C0(c2 c2Var, int i10, Object obj, int i11) {
        if (obj != null) {
            c2Var.O(i10, this.f7396q.f(v(i11)), this.f7396q.g(obj));
        }
    }

    private boolean D(T t10, int i10) {
        int m02 = m0(i10);
        long j10 = 1048575 & m02;
        if (j10 != 1048575) {
            return (z1.C(t10, j10) & (1 << (m02 >>> 20))) != 0;
        }
        int y02 = y0(i10);
        long Z = Z(y02);
        switch (x0(y02)) {
            case 0:
                return Double.doubleToRawLongBits(z1.A(t10, Z)) != 0;
            case 1:
                return Float.floatToRawIntBits(z1.B(t10, Z)) != 0;
            case 2:
                return z1.E(t10, Z) != 0;
            case 3:
                return z1.E(t10, Z) != 0;
            case 4:
                return z1.C(t10, Z) != 0;
            case 5:
                return z1.E(t10, Z) != 0;
            case 6:
                return z1.C(t10, Z) != 0;
            case 7:
                return z1.t(t10, Z);
            case 8:
                Object G = z1.G(t10, Z);
                if (G instanceof String) {
                    return !((String) G).isEmpty();
                }
                if (G instanceof i) {
                    return !i.f7143k.equals(G);
                }
                throw new IllegalArgumentException();
            case 9:
                return z1.G(t10, Z) != null;
            case 10:
                return !i.f7143k.equals(z1.G(t10, Z));
            case 11:
                return z1.C(t10, Z) != 0;
            case 12:
                return z1.C(t10, Z) != 0;
            case 13:
                return z1.C(t10, Z) != 0;
            case 14:
                return z1.E(t10, Z) != 0;
            case 15:
                return z1.C(t10, Z) != 0;
            case 16:
                return z1.E(t10, Z) != 0;
            case 17:
                return z1.G(t10, Z) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void D0(int i10, Object obj, c2 c2Var) {
        if (obj instanceof String) {
            c2Var.A(i10, (String) obj);
        } else {
            c2Var.M(i10, (i) obj);
        }
    }

    private boolean E(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? D(t10, i10) : (i12 & i13) != 0;
    }

    private <UT, UB> void E0(v1<UT, UB> v1Var, T t10, c2 c2Var) {
        v1Var.t(v1Var.g(t10), c2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean F(Object obj, int i10, n1 n1Var) {
        return n1Var.c(z1.G(obj, Z(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean G(Object obj, int i10, int i11) {
        List list = (List) z1.G(obj, Z(i10));
        if (list.isEmpty()) {
            return true;
        }
        n1 w10 = w(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!w10.c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.n1] */
    private boolean H(T t10, int i10, int i11) {
        Map<?, ?> g10 = this.f7396q.g(z1.G(t10, Z(i10)));
        if (g10.isEmpty()) {
            return true;
        }
        if (this.f7396q.f(v(i11)).f7271c.b() != b2.c.MESSAGE) {
            return true;
        }
        n1<T> n1Var = 0;
        for (Object obj : g10.values()) {
            if (n1Var == null) {
                n1Var = i1.a().c(obj.getClass());
            }
            boolean c10 = n1Var.c(obj);
            n1Var = n1Var;
            if (!c10) {
                return false;
            }
        }
        return true;
    }

    private static boolean I(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof z) {
            return ((z) obj).O();
        }
        return true;
    }

    private boolean J(T t10, T t11, int i10) {
        long m02 = m0(i10) & 1048575;
        return z1.C(t10, m02) == z1.C(t11, m02);
    }

    private boolean K(T t10, int i10, int i11) {
        return z1.C(t10, (long) (m0(i11) & 1048575)) == i10;
    }

    private static boolean L(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> M(Object obj, long j10) {
        return (List) z1.G(obj, j10);
    }

    private static <T> long N(T t10, long j10) {
        return z1.E(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        r0 = r18.f7390k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
        if (r0 >= r18.f7391l) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
        r4 = (UB) r(r21, r18.f7389j[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (r4 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
        r7.o(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05bd A[Catch: all -> 0x0615, TRY_LEAVE, TryCatch #5 {all -> 0x0615, blocks: (B:177:0x058e, B:188:0x05b7, B:190:0x05bd, B:200:0x05e5, B:201:0x05ea), top: B:231:0x058e }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0627 A[LOOP:2: B:220:0x0623->B:222:0x0627, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x063c  */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.protobuf.v1] */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r1v153, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.protobuf.l1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.protobuf.v.b<ET>> void O(com.google.protobuf.v1<UT, UB> r19, com.google.protobuf.r<ET> r20, T r21, com.google.protobuf.l1 r22, com.google.protobuf.q r23) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.O(com.google.protobuf.v1, com.google.protobuf.r, java.lang.Object, com.google.protobuf.l1, com.google.protobuf.q):void");
    }

    private final <K, V> void P(Object obj, int i10, Object obj2, q qVar, l1 l1Var) {
        long Z = Z(y0(i10));
        Object G = z1.G(obj, Z);
        if (G == null) {
            G = this.f7396q.b(obj2);
            z1.V(obj, Z, G);
        } else if (this.f7396q.d(G)) {
            Object b10 = this.f7396q.b(obj2);
            this.f7396q.a(b10, G);
            z1.V(obj, Z, b10);
            G = b10;
        }
        l1Var.P(this.f7396q.h(G), this.f7396q.f(obj2), qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q(T t10, T t11, int i10) {
        if (D(t11, i10)) {
            long Z = Z(y0(i10));
            Unsafe unsafe = f7379s;
            Object object = unsafe.getObject(t11, Z);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Y(i10) + " is present but null: " + t11);
            }
            n1 w10 = w(i10);
            if (!D(t10, i10)) {
                if (I(object)) {
                    Object f10 = w10.f();
                    w10.a(f10, object);
                    unsafe.putObject(t10, Z, f10);
                } else {
                    unsafe.putObject(t10, Z, object);
                }
                s0(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, Z);
            if (!I(object2)) {
                Object f11 = w10.f();
                w10.a(f11, object2);
                unsafe.putObject(t10, Z, f11);
                object2 = f11;
            }
            w10.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R(T t10, T t11, int i10) {
        int Y = Y(i10);
        if (K(t11, Y, i10)) {
            long Z = Z(y0(i10));
            Unsafe unsafe = f7379s;
            Object object = unsafe.getObject(t11, Z);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Y(i10) + " is present but null: " + t11);
            }
            n1 w10 = w(i10);
            if (!K(t10, Y, i10)) {
                if (I(object)) {
                    Object f10 = w10.f();
                    w10.a(f10, object);
                    unsafe.putObject(t10, Z, f10);
                } else {
                    unsafe.putObject(t10, Z, object);
                }
                t0(t10, Y, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, Z);
            if (!I(object2)) {
                Object f11 = w10.f();
                w10.a(f11, object2);
                unsafe.putObject(t10, Z, f11);
                object2 = f11;
            }
            w10.a(object2, object);
        }
    }

    private void S(T t10, T t11, int i10) {
        int y02 = y0(i10);
        long Z = Z(y02);
        int Y = Y(i10);
        switch (x0(y02)) {
            case 0:
                if (D(t11, i10)) {
                    z1.R(t10, Z, z1.A(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (D(t11, i10)) {
                    z1.S(t10, Z, z1.B(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (!D(t11, i10)) {
                    return;
                }
                z1.U(t10, Z, z1.E(t11, Z));
                s0(t10, i10);
                return;
            case 3:
                if (!D(t11, i10)) {
                    return;
                }
                z1.U(t10, Z, z1.E(t11, Z));
                s0(t10, i10);
                return;
            case 4:
                if (!D(t11, i10)) {
                    return;
                }
                z1.T(t10, Z, z1.C(t11, Z));
                s0(t10, i10);
                return;
            case 5:
                if (!D(t11, i10)) {
                    return;
                }
                z1.U(t10, Z, z1.E(t11, Z));
                s0(t10, i10);
                return;
            case 6:
                if (!D(t11, i10)) {
                    return;
                }
                z1.T(t10, Z, z1.C(t11, Z));
                s0(t10, i10);
                return;
            case 7:
                if (D(t11, i10)) {
                    z1.L(t10, Z, z1.t(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (!D(t11, i10)) {
                    return;
                }
                z1.V(t10, Z, z1.G(t11, Z));
                s0(t10, i10);
                return;
            case 9:
            case 17:
                Q(t10, t11, i10);
                return;
            case 10:
                if (!D(t11, i10)) {
                    return;
                }
                z1.V(t10, Z, z1.G(t11, Z));
                s0(t10, i10);
                return;
            case 11:
                if (!D(t11, i10)) {
                    return;
                }
                z1.T(t10, Z, z1.C(t11, Z));
                s0(t10, i10);
                return;
            case 12:
                if (!D(t11, i10)) {
                    return;
                }
                z1.T(t10, Z, z1.C(t11, Z));
                s0(t10, i10);
                return;
            case 13:
                if (!D(t11, i10)) {
                    return;
                }
                z1.T(t10, Z, z1.C(t11, Z));
                s0(t10, i10);
                return;
            case 14:
                if (!D(t11, i10)) {
                    return;
                }
                z1.U(t10, Z, z1.E(t11, Z));
                s0(t10, i10);
                return;
            case 15:
                if (!D(t11, i10)) {
                    return;
                }
                z1.T(t10, Z, z1.C(t11, Z));
                s0(t10, i10);
                return;
            case 16:
                if (!D(t11, i10)) {
                    return;
                }
                z1.U(t10, Z, z1.E(t11, Z));
                s0(t10, i10);
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
                this.f7393n.d(t10, t11, Z);
                return;
            case 50:
                p1.F(this.f7396q, t10, t11, Z);
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
                if (!K(t11, Y, i10)) {
                    return;
                }
                z1.V(t10, Z, z1.G(t11, Z));
                t0(t10, Y, i10);
                return;
            case 60:
            case 68:
                R(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!K(t11, Y, i10)) {
                    return;
                }
                z1.V(t10, Z, z1.G(t11, Z));
                t0(t10, Y, i10);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object T(T t10, int i10) {
        n1 w10 = w(i10);
        long Z = Z(y0(i10));
        if (D(t10, i10)) {
            Object object = f7379s.getObject(t10, Z);
            if (I(object)) {
                return object;
            }
            Object f10 = w10.f();
            if (object != null) {
                w10.a(f10, object);
            }
            return f10;
        }
        return w10.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object U(T t10, int i10, int i11) {
        n1 w10 = w(i11);
        if (K(t10, i10, i11)) {
            Object object = f7379s.getObject(t10, Z(y0(i11)));
            if (I(object)) {
                return object;
            }
            Object f10 = w10.f();
            if (object != null) {
                w10.a(f10, object);
            }
            return f10;
        }
        return w10.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> y0<T> V(Class<T> cls, t0 t0Var, a1 a1Var, l0 l0Var, v1<?, ?> v1Var, r<?> rVar, q0 q0Var) {
        return t0Var instanceof k1 ? X((k1) t0Var, a1Var, l0Var, v1Var, rVar, q0Var) : W((r1) t0Var, a1Var, l0Var, v1Var, rVar, q0Var);
    }

    static <T> y0<T> W(r1 r1Var, a1 a1Var, l0 l0Var, v1<?, ?> v1Var, r<?> rVar, q0 q0Var) {
        boolean z10 = r1Var.b() == h1.PROTO3;
        u[] e10 = r1Var.e();
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
        int[] d10 = r1Var.d();
        if (d10 == null) {
            d10 = f7378r;
        }
        if (e10.length > 0) {
            u uVar3 = e10[0];
            throw null;
        }
        int[] iArr2 = f7378r;
        int[] iArr3 = f7378r;
        int[] iArr4 = new int[d10.length + iArr2.length + iArr3.length];
        System.arraycopy(d10, 0, iArr4, 0, d10.length);
        System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
        return new y0<>(iArr, objArr, 0, 0, r1Var.c(), z10, true, iArr4, d10.length, d10.length + iArr2.length, a1Var, l0Var, v1Var, rVar, q0Var);
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
    static <T> com.google.protobuf.y0<T> X(com.google.protobuf.k1 r34, com.google.protobuf.a1 r35, com.google.protobuf.l0 r36, com.google.protobuf.v1<?, ?> r37, com.google.protobuf.r<?> r38, com.google.protobuf.q0 r39) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.X(com.google.protobuf.k1, com.google.protobuf.a1, com.google.protobuf.l0, com.google.protobuf.v1, com.google.protobuf.r, com.google.protobuf.q0):com.google.protobuf.y0");
    }

    private int Y(int i10) {
        return this.f7380a[i10];
    }

    private static long Z(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean a0(T t10, long j10) {
        return ((Boolean) z1.G(t10, j10)).booleanValue();
    }

    private static <T> double b0(T t10, long j10) {
        return ((Double) z1.G(t10, j10)).doubleValue();
    }

    private static <T> float c0(T t10, long j10) {
        return ((Float) z1.G(t10, j10)).floatValue();
    }

    private static <T> int d0(T t10, long j10) {
        return ((Integer) z1.G(t10, j10)).intValue();
    }

    private static <T> long e0(T t10, long j10) {
        return ((Long) z1.G(t10, j10)).longValue();
    }

    private <K, V> int f0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, f.b bVar) {
        Unsafe unsafe = f7379s;
        Object v10 = v(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f7396q.d(object)) {
            Object b10 = this.f7396q.b(v10);
            this.f7396q.a(b10, object);
            unsafe.putObject(t10, j10, b10);
            object = b10;
        }
        return n(bArr, i10, i11, this.f7396q.f(v10), this.f7396q.h(object), bVar);
    }

    private int g0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, f.b bVar) {
        Object valueOf;
        Object valueOf2;
        int L;
        long j11;
        int i18;
        Object valueOf3;
        Object U;
        int O;
        Unsafe unsafe = f7379s;
        long j12 = this.f7380a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    valueOf = Double.valueOf(f.d(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf);
                    L = i10 + 8;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    valueOf2 = Float.valueOf(f.l(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf2);
                    L = i10 + 4;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    L = f.L(bArr, i10, bVar);
                    j11 = bVar.f7108b;
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    L = f.I(bArr, i10, bVar);
                    i18 = bVar.f7107a;
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    valueOf = Long.valueOf(f.j(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf);
                    L = i10 + 8;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    valueOf2 = Integer.valueOf(f.h(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf2);
                    L = i10 + 4;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    L = f.L(bArr, i10, bVar);
                    valueOf3 = Boolean.valueOf(bVar.f7108b != 0);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    L = f.I(bArr, i10, bVar);
                    int i19 = bVar.f7107a;
                    if (i19 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t10, j10, valueOf3);
                        unsafe.putInt(t10, j12, i13);
                        return L;
                    } else if ((i15 & 536870912) == 0 || a2.t(bArr, L, L + i19)) {
                        unsafe.putObject(t10, j10, new String(bArr, L, i19, d0.f7092b));
                        L += i19;
                        unsafe.putInt(t10, j12, i13);
                        return L;
                    } else {
                        throw e0.d();
                    }
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    U = U(t10, i13, i17);
                    O = f.O(U, w(i17), bArr, i10, i11, bVar);
                    w0(t10, i13, i17, U);
                    return O;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    L = f.b(bArr, i10, bVar);
                    valueOf3 = bVar.f7109c;
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int I = f.I(bArr, i10, bVar);
                    int i20 = bVar.f7107a;
                    d0.e u10 = u(i17);
                    if (u10 == null || u10.a(i20)) {
                        unsafe.putObject(t10, j10, Integer.valueOf(i20));
                        unsafe.putInt(t10, j12, i13);
                    } else {
                        x(t10).n(i12, Long.valueOf(i20));
                    }
                    return I;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    L = f.I(bArr, i10, bVar);
                    i18 = j.b(bVar.f7107a);
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    L = f.L(bArr, i10, bVar);
                    j11 = j.c(bVar.f7108b);
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    U = U(t10, i13, i17);
                    O = f.N(U, w(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    w0(t10, i13, i17, U);
                    return O;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0282, code lost:
        if (r0 != r15) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02a3, code lost:
        if (r0 != r15) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02a6, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023b, code lost:
        if (r0 != r15) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023d, code lost:
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int i0(T r31, byte[] r32, int r33, int r34, com.google.protobuf.f.b r35) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.i0(java.lang.Object, byte[], int, int, com.google.protobuf.f$b):int");
    }

    private int j0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, f.b bVar) {
        int J;
        Unsafe unsafe = f7379s;
        d0.i iVar = (d0.i) unsafe.getObject(t10, j11);
        if (!iVar.h()) {
            int size = iVar.size();
            iVar = iVar.c(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, iVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return f.s(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return f.e(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    return f.v(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return f.m(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return f.z(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return f.M(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 22:
            case f.j.f8360z3 /* 29 */:
            case 39:
            case 43:
                if (i14 == 2) {
                    return f.y(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return f.J(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case f.j.f8330t3 /* 23 */:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return f.u(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return f.k(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case f.j.f8335u3 /* 24 */:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return f.t(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return f.i(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    return f.r(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return f.a(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 26:
                if (i14 == 2) {
                    int i17 = ((j10 & 536870912) > 0L ? 1 : ((j10 & 536870912) == 0L ? 0 : -1));
                    d0.i iVar2 = iVar;
                    return i17 == 0 ? f.D(i12, bArr, i10, i11, iVar2, bVar) : f.E(i12, bArr, i10, i11, iVar2, bVar);
                }
                break;
            case 27:
                if (i14 == 2) {
                    return f.q(w(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 28:
                if (i14 == 2) {
                    return f.c(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    J = f.y(bArr, i10, iVar, bVar);
                } else if (i14 == 0) {
                    J = f.J(i12, bArr, i10, i11, iVar, bVar);
                }
                p1.A(t10, i13, iVar, u(i15), null, this.f7394o);
                return J;
            case 33:
            case 47:
                if (i14 == 2) {
                    return f.w(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return f.A(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    return f.x(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return f.B(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 49:
                if (i14 == 3) {
                    return f.o(w(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                break;
        }
        return i10;
    }

    private boolean k(T t10, T t11, int i10) {
        return D(t10, i10) == D(t11, i10);
    }

    private int k0(int i10) {
        if (i10 < this.f7382c || i10 > this.f7383d) {
            return -1;
        }
        return u0(i10, 0);
    }

    private static <T> boolean l(T t10, long j10) {
        return z1.t(t10, j10);
    }

    private int l0(int i10, int i11) {
        if (i10 < this.f7382c || i10 > this.f7383d) {
            return -1;
        }
        return u0(i10, i11);
    }

    private static void m(Object obj) {
        if (I(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private int m0(int i10) {
        return this.f7380a[i10 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int n(byte[] bArr, int i10, int i11, o0.a<K, V> aVar, Map<K, V> map, f.b bVar) {
        int i12;
        int I = f.I(bArr, i10, bVar);
        int i13 = bVar.f7107a;
        if (i13 < 0 || i13 > i11 - I) {
            throw e0.m();
        }
        int i14 = I + i13;
        K k10 = aVar.f7270b;
        V v10 = aVar.f7272d;
        while (I < i14) {
            int i15 = I + 1;
            byte b10 = bArr[I];
            if (b10 < 0) {
                i12 = f.H(b10, bArr, i15, bVar);
                b10 = bVar.f7107a;
            } else {
                i12 = i15;
            }
            int i16 = b10 >>> 3;
            int i17 = b10 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == aVar.f7271c.g()) {
                    I = o(bArr, i12, i11, aVar.f7271c, aVar.f7272d.getClass(), bVar);
                    v10 = bVar.f7109c;
                }
                I = f.P(b10, bArr, i12, i11, bVar);
            } else if (i17 == aVar.f7269a.g()) {
                I = o(bArr, i12, i11, aVar.f7269a, null, bVar);
                k10 = bVar.f7109c;
            } else {
                I = f.P(b10, bArr, i12, i11, bVar);
            }
        }
        if (I == i14) {
            map.put(k10, v10);
            return i14;
        }
        throw e0.h();
    }

    private <E> void n0(Object obj, long j10, l1 l1Var, n1<E> n1Var, q qVar) {
        l1Var.J(this.f7393n.e(obj, j10), n1Var, qVar);
    }

    private int o(byte[] bArr, int i10, int i11, b2.b bVar, Class<?> cls, f.b bVar2) {
        int L;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int i12;
        long j10;
        switch (a.f7397a[bVar.ordinal()]) {
            case 1:
                L = f.L(bArr, i10, bVar2);
                valueOf = Boolean.valueOf(bVar2.f7108b != 0);
                bVar2.f7109c = valueOf;
                return L;
            case 2:
                return f.b(bArr, i10, bVar2);
            case 3:
                valueOf2 = Double.valueOf(f.d(bArr, i10));
                bVar2.f7109c = valueOf2;
                return i10 + 8;
            case 4:
            case 5:
                valueOf3 = Integer.valueOf(f.h(bArr, i10));
                bVar2.f7109c = valueOf3;
                return i10 + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(f.j(bArr, i10));
                bVar2.f7109c = valueOf2;
                return i10 + 8;
            case 8:
                valueOf3 = Float.valueOf(f.l(bArr, i10));
                bVar2.f7109c = valueOf3;
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                L = f.I(bArr, i10, bVar2);
                i12 = bVar2.f7107a;
                valueOf = Integer.valueOf(i12);
                bVar2.f7109c = valueOf;
                return L;
            case 12:
            case 13:
                L = f.L(bArr, i10, bVar2);
                j10 = bVar2.f7108b;
                valueOf = Long.valueOf(j10);
                bVar2.f7109c = valueOf;
                return L;
            case 14:
                return f.p(i1.a().c(cls), bArr, i10, i11, bVar2);
            case 15:
                L = f.I(bArr, i10, bVar2);
                i12 = j.b(bVar2.f7107a);
                valueOf = Integer.valueOf(i12);
                bVar2.f7109c = valueOf;
                return L;
            case 16:
                L = f.L(bArr, i10, bVar2);
                j10 = j.c(bVar2.f7108b);
                valueOf = Long.valueOf(j10);
                bVar2.f7109c = valueOf;
                return L;
            case 17:
                return f.F(bArr, i10, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <E> void o0(Object obj, int i10, l1 l1Var, n1<E> n1Var, q qVar) {
        l1Var.N(this.f7393n.e(obj, Z(i10)), n1Var, qVar);
    }

    private static <T> double p(T t10, long j10) {
        return z1.A(t10, j10);
    }

    private void p0(Object obj, int i10, l1 l1Var) {
        long Z;
        Object u10;
        if (C(i10)) {
            Z = Z(i10);
            u10 = l1Var.F();
        } else if (this.f7386g) {
            Z = Z(i10);
            u10 = l1Var.m();
        } else {
            Z = Z(i10);
            u10 = l1Var.u();
        }
        z1.V(obj, Z, u10);
    }

    private boolean q(T t10, T t11, int i10) {
        int y02 = y0(i10);
        long Z = Z(y02);
        switch (x0(y02)) {
            case 0:
                return k(t10, t11, i10) && Double.doubleToLongBits(z1.A(t10, Z)) == Double.doubleToLongBits(z1.A(t11, Z));
            case 1:
                return k(t10, t11, i10) && Float.floatToIntBits(z1.B(t10, Z)) == Float.floatToIntBits(z1.B(t11, Z));
            case 2:
                return k(t10, t11, i10) && z1.E(t10, Z) == z1.E(t11, Z);
            case 3:
                return k(t10, t11, i10) && z1.E(t10, Z) == z1.E(t11, Z);
            case 4:
                return k(t10, t11, i10) && z1.C(t10, Z) == z1.C(t11, Z);
            case 5:
                return k(t10, t11, i10) && z1.E(t10, Z) == z1.E(t11, Z);
            case 6:
                return k(t10, t11, i10) && z1.C(t10, Z) == z1.C(t11, Z);
            case 7:
                return k(t10, t11, i10) && z1.t(t10, Z) == z1.t(t11, Z);
            case 8:
                return k(t10, t11, i10) && p1.K(z1.G(t10, Z), z1.G(t11, Z));
            case 9:
                return k(t10, t11, i10) && p1.K(z1.G(t10, Z), z1.G(t11, Z));
            case 10:
                return k(t10, t11, i10) && p1.K(z1.G(t10, Z), z1.G(t11, Z));
            case 11:
                return k(t10, t11, i10) && z1.C(t10, Z) == z1.C(t11, Z);
            case 12:
                return k(t10, t11, i10) && z1.C(t10, Z) == z1.C(t11, Z);
            case 13:
                return k(t10, t11, i10) && z1.C(t10, Z) == z1.C(t11, Z);
            case 14:
                return k(t10, t11, i10) && z1.E(t10, Z) == z1.E(t11, Z);
            case 15:
                return k(t10, t11, i10) && z1.C(t10, Z) == z1.C(t11, Z);
            case 16:
                return k(t10, t11, i10) && z1.E(t10, Z) == z1.E(t11, Z);
            case 17:
                return k(t10, t11, i10) && p1.K(z1.G(t10, Z), z1.G(t11, Z));
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
                return p1.K(z1.G(t10, Z), z1.G(t11, Z));
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
                return J(t10, t11, i10) && p1.K(z1.G(t10, Z), z1.G(t11, Z));
            default:
                return true;
        }
    }

    private void q0(Object obj, int i10, l1 l1Var) {
        if (C(i10)) {
            l1Var.t(this.f7393n.e(obj, Z(i10)));
        } else {
            l1Var.q(this.f7393n.e(obj, Z(i10)));
        }
    }

    private <UT, UB> UB r(Object obj, int i10, UB ub, v1<UT, UB> v1Var, Object obj2) {
        d0.e u10;
        int Y = Y(i10);
        Object G = z1.G(obj, Z(y0(i10)));
        return (G == null || (u10 = u(i10)) == null) ? ub : (UB) s(i10, Y, this.f7396q.h(G), u10, ub, v1Var, obj2);
    }

    private static Field r0(Class<?> cls, String str) {
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

    private <K, V, UT, UB> UB s(int i10, int i11, Map<K, V> map, d0.e eVar, UB ub, v1<UT, UB> v1Var, Object obj) {
        o0.a<?, ?> f10 = this.f7396q.f(v(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = v1Var.f(obj);
                }
                i.h E = i.E(o0.b(f10, next.getKey(), next.getValue()));
                try {
                    o0.e(E.b(), f10, next.getKey(), next.getValue());
                    v1Var.d(ub, i11, E.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    private void s0(T t10, int i10) {
        int m02 = m0(i10);
        long j10 = 1048575 & m02;
        if (j10 == 1048575) {
            return;
        }
        z1.T(t10, j10, (1 << (m02 >>> 20)) | z1.C(t10, j10));
    }

    private static <T> float t(T t10, long j10) {
        return z1.B(t10, j10);
    }

    private void t0(T t10, int i10, int i11) {
        z1.T(t10, m0(i11) & 1048575, i10);
    }

    private d0.e u(int i10) {
        return (d0.e) this.f7381b[((i10 / 3) * 2) + 1];
    }

    private int u0(int i10, int i11) {
        int length = (this.f7380a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int Y = Y(i13);
            if (i10 == Y) {
                return i13;
            }
            if (i10 < Y) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private Object v(int i10) {
        return this.f7381b[(i10 / 3) * 2];
    }

    private void v0(T t10, int i10, Object obj) {
        f7379s.putObject(t10, Z(y0(i10)), obj);
        s0(t10, i10);
    }

    private n1 w(int i10) {
        int i11 = (i10 / 3) * 2;
        n1 n1Var = (n1) this.f7381b[i11];
        if (n1Var != null) {
            return n1Var;
        }
        n1<T> c10 = i1.a().c((Class) this.f7381b[i11 + 1]);
        this.f7381b[i11] = c10;
        return c10;
    }

    private void w0(T t10, int i10, int i11, Object obj) {
        f7379s.putObject(t10, Z(y0(i11)), obj);
        t0(t10, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w1 x(Object obj) {
        z zVar = (z) obj;
        w1 w1Var = zVar.unknownFields;
        if (w1Var == w1.c()) {
            w1 k10 = w1.k();
            zVar.unknownFields = k10;
            return k10;
        }
        return w1Var;
    }

    private static int x0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bb, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01cd, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01df, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f1, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0202, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0213, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0224, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0235, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0246, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0257, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0259, code lost:
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x025d, code lost:
        r4 = (com.google.protobuf.l.V(r10) + com.google.protobuf.l.X(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x030e, code lost:
        if ((r8 & r15) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0310, code lost:
        r3 = com.google.protobuf.l.t(r10, (com.google.protobuf.v0) r2.getObject(r17, r13), w(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x033b, code lost:
        if ((r8 & r15) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x033d, code lost:
        r3 = com.google.protobuf.l.N(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0344, code lost:
        if ((r8 & r15) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0346, code lost:
        r4 = com.google.protobuf.l.L(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0369, code lost:
        if ((r8 & r15) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x036b, code lost:
        r3 = com.google.protobuf.l.h(r10, (com.google.protobuf.i) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0378, code lost:
        if ((r8 & r15) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x037a, code lost:
        r3 = com.google.protobuf.p1.o(r10, r2.getObject(r17, r13), w(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03a5, code lost:
        if ((r8 & r15) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03a7, code lost:
        r3 = com.google.protobuf.l.e(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (K(r17, r10, r5) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (K(r17, r10, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (K(r17, r10, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (K(r17, r10, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
        if (K(r17, r10, r5) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00de, code lost:
        if (K(r17, r10, r5) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0185, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0197, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a9, code lost:
        if (r16.f7388i != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int y(T r17) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.y(java.lang.Object):int");
    }

    private int y0(int i10) {
        return this.f7380a[i10 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0184, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0196, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a8, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b9, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ca, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01db, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ec, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fd, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020e, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0210, code lost:
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0214, code lost:
        r6 = (com.google.protobuf.l.V(r8) + com.google.protobuf.l.X(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0334, code lost:
        if ((r6 instanceof com.google.protobuf.i) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
        if ((r6 instanceof com.google.protobuf.i) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
        r6 = com.google.protobuf.l.T(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012a, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013c, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014e, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0172, code lost:
        if (r15.f7388i != false) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int z(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.z(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void z0(T r18, com.google.protobuf.c2 r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.z0(java.lang.Object, com.google.protobuf.c2):void");
    }

    @Override // com.google.protobuf.n1
    public void a(T t10, T t11) {
        m(t10);
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f7380a.length; i10 += 3) {
            S(t10, t11, i10);
        }
        p1.G(this.f7394o, t10, t11);
        if (this.f7385f) {
            p1.E(this.f7395p, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.n1
    public void b(T t10) {
        if (I(t10)) {
            if (t10 instanceof z) {
                z zVar = (z) t10;
                zVar.y();
                zVar.x();
                zVar.Q();
            }
            int length = this.f7380a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int y02 = y0(i10);
                long Z = Z(y02);
                int x02 = x0(y02);
                if (x02 != 9) {
                    switch (x02) {
                        case 17:
                            break;
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
                            this.f7393n.c(t10, Z);
                            continue;
                        case 50:
                            Unsafe unsafe = f7379s;
                            Object object = unsafe.getObject(t10, Z);
                            if (object != null) {
                                unsafe.putObject(t10, Z, this.f7396q.e(object));
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (D(t10, i10)) {
                    w(i10).b(f7379s.getObject(t10, Z));
                }
            }
            this.f7394o.j(t10);
            if (this.f7385f) {
                this.f7395p.f(t10);
            }
        }
    }

    @Override // com.google.protobuf.n1
    public final boolean c(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f7390k) {
            int i15 = this.f7389j[i14];
            int Y = Y(i15);
            int y02 = y0(i15);
            int i16 = this.f7380a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f7379s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (L(y02) && !E(t10, i15, i10, i11, i18)) {
                return false;
            }
            int x02 = x0(y02);
            if (x02 != 9 && x02 != 17) {
                if (x02 != 27) {
                    if (x02 == 60 || x02 == 68) {
                        if (K(t10, Y, i15) && !F(t10, y02, w(i15))) {
                            return false;
                        }
                    } else if (x02 != 49) {
                        if (x02 == 50 && !H(t10, y02, i15)) {
                            return false;
                        }
                    }
                }
                if (!G(t10, y02, i15)) {
                    return false;
                }
            } else if (E(t10, i15, i10, i11, i18) && !F(t10, y02, w(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f7385f || this.f7395p.c(t10).p();
    }

    @Override // com.google.protobuf.n1
    public boolean d(T t10, T t11) {
        int length = this.f7380a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!q(t10, t11, i10)) {
                return false;
            }
        }
        if (this.f7394o.g(t10).equals(this.f7394o.g(t11))) {
            if (this.f7385f) {
                return this.f7395p.c(t10).equals(this.f7395p.c(t11));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.n1
    public int e(T t10) {
        return this.f7387h ? z(t10) : y(t10);
    }

    @Override // com.google.protobuf.n1
    public T f() {
        return (T) this.f7392m.a(this.f7384e);
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
    @Override // com.google.protobuf.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.g(java.lang.Object):int");
    }

    @Override // com.google.protobuf.n1
    public void h(T t10, c2 c2Var) {
        if (c2Var.v() == c2.a.DESCENDING) {
            B0(t10, c2Var);
        } else if (this.f7387h) {
            A0(t10, c2Var);
        } else {
            z0(t10, c2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h0(T t10, byte[] bArr, int i10, int i11, int i12, f.b bVar) {
        Unsafe unsafe;
        int i13;
        y0<T> y0Var;
        int i14;
        int i15;
        int i16;
        int i17;
        T t11;
        byte b10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        byte[] bArr2;
        long j10;
        int L;
        Unsafe unsafe2;
        T t12;
        long j11;
        int i28;
        long j12;
        long j13;
        int i29;
        int i30;
        y0<T> y0Var2 = this;
        T t13 = t10;
        byte[] bArr3 = bArr;
        int i31 = i11;
        int i32 = i12;
        f.b bVar2 = bVar;
        m(t10);
        Unsafe unsafe3 = f7379s;
        int i33 = i10;
        int i34 = -1;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 1048575;
        while (true) {
            if (i33 < i31) {
                int i39 = i33 + 1;
                byte b11 = bArr3[i33];
                if (b11 < 0) {
                    int H = f.H(b11, bArr3, i39, bVar2);
                    b10 = bVar2.f7107a;
                    i39 = H;
                } else {
                    b10 = b11;
                }
                int i40 = b10 >>> 3;
                int i41 = b10 & 7;
                int l02 = i40 > i34 ? y0Var2.l0(i40, i35 / 3) : y0Var2.k0(i40);
                if (l02 == -1) {
                    i18 = i40;
                    i19 = i39;
                    i15 = b10;
                    i20 = i37;
                    i21 = i38;
                    unsafe = unsafe3;
                    i13 = i32;
                    i22 = 0;
                } else {
                    int i42 = y0Var2.f7380a[l02 + 1];
                    int x02 = x0(i42);
                    long Z = Z(i42);
                    int i43 = b10;
                    if (x02 <= 17) {
                        int i44 = y0Var2.f7380a[l02 + 2];
                        int i45 = 1 << (i44 >>> 20);
                        int i46 = i44 & 1048575;
                        if (i46 != i38) {
                            if (i38 != 1048575) {
                                unsafe3.putInt(t13, i38, i37);
                            }
                            i24 = i46;
                            i23 = unsafe3.getInt(t13, i46);
                        } else {
                            i23 = i37;
                            i24 = i38;
                        }
                        switch (x02) {
                            case 0:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                if (i41 == 1) {
                                    z1.R(t13, Z, f.d(bArr2, i39));
                                    i33 = i39 + 8;
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                if (i41 == 5) {
                                    z1.S(t13, Z, f.l(bArr2, i39));
                                    i33 = i39 + 4;
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                j10 = Z;
                                if (i41 == 0) {
                                    L = f.L(bArr2, i39, bVar2);
                                    unsafe2 = unsafe3;
                                    t12 = t10;
                                    j11 = bVar2.f7108b;
                                    unsafe2.putLong(t12, j10, j11);
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i33 = L;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                if (i41 == 0) {
                                    i33 = f.I(bArr2, i39, bVar2);
                                    i28 = bVar2.f7107a;
                                    j12 = Z;
                                    unsafe3.putInt(t13, j12, i28);
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                if (i41 == 1) {
                                    unsafe3.putLong(t10, Z, f.j(bArr2, i39));
                                    i33 = i39 + 8;
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                if (i41 == 5) {
                                    unsafe3.putInt(t13, Z, f.h(bArr2, i39));
                                    i33 = i39 + 4;
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                if (i41 == 0) {
                                    i33 = f.L(bArr2, i39, bVar2);
                                    z1.L(t13, Z, bVar2.f7108b != 0);
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                j13 = Z;
                                if (i41 == 2) {
                                    i33 = (536870912 & i42) == 0 ? f.C(bArr2, i39, bVar2) : f.F(bArr2, i39, bVar2);
                                    unsafe3.putObject(t13, j13, bVar2.f7109c);
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                if (i41 == 2) {
                                    Object T = y0Var2.T(t13, i25);
                                    i33 = f.O(T, y0Var2.w(i25), bArr, i39, i11, bVar);
                                    y0Var2.v0(t13, i25, T);
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                j13 = Z;
                                if (i41 == 2) {
                                    i33 = f.b(bArr2, i39, bVar2);
                                    unsafe3.putObject(t13, j13, bVar2.f7109c);
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                j12 = Z;
                                if (i41 != 0) {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                } else {
                                    i33 = f.I(bArr2, i39, bVar2);
                                    i28 = bVar2.f7107a;
                                    d0.e u10 = y0Var2.u(i25);
                                    if (u10 != null && !u10.a(i28)) {
                                        x(t10).n(i27, Long.valueOf(i28));
                                        i35 = i25;
                                        i37 = i23;
                                        i36 = i27;
                                        i34 = i18;
                                        i32 = i12;
                                        bArr3 = bArr2;
                                        i38 = i26;
                                        break;
                                    }
                                    unsafe3.putInt(t13, j12, i28);
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                j12 = Z;
                                if (i41 == 0) {
                                    i33 = f.I(bArr2, i39, bVar2);
                                    i28 = j.b(bVar2.f7107a);
                                    unsafe3.putInt(t13, j12, i28);
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 16:
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                bArr2 = bArr;
                                if (i41 == 0) {
                                    j10 = Z;
                                    L = f.L(bArr2, i39, bVar2);
                                    j11 = j.c(bVar2.f7108b);
                                    unsafe2 = unsafe3;
                                    t12 = t10;
                                    unsafe2.putLong(t12, j10, j11);
                                    i37 = i23 | i45;
                                    i32 = i12;
                                    i33 = L;
                                    i35 = i25;
                                    i36 = i27;
                                    i34 = i18;
                                    bArr3 = bArr2;
                                    i38 = i26;
                                    break;
                                } else {
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            case 17:
                                if (i41 == 3) {
                                    Object T2 = y0Var2.T(t13, l02);
                                    i33 = f.N(T2, y0Var2.w(l02), bArr, i39, i11, (i40 << 3) | 4, bVar);
                                    y0Var2.v0(t13, l02, T2);
                                    i37 = i23 | i45;
                                    i38 = i24;
                                    i32 = i12;
                                    i35 = l02;
                                    i36 = i43;
                                    i34 = i40;
                                    bArr3 = bArr;
                                    break;
                                } else {
                                    i18 = i40;
                                    i25 = l02;
                                    i26 = i24;
                                    i27 = i43;
                                    i21 = i26;
                                    i19 = i39;
                                    i22 = i25;
                                    unsafe = unsafe3;
                                    i20 = i23;
                                    i15 = i27;
                                    i13 = i12;
                                    break;
                                }
                            default:
                                i18 = i40;
                                i25 = l02;
                                i26 = i24;
                                i27 = i43;
                                i21 = i26;
                                i19 = i39;
                                i22 = i25;
                                unsafe = unsafe3;
                                i20 = i23;
                                i15 = i27;
                                i13 = i12;
                                break;
                        }
                    } else {
                        i18 = i40;
                        i21 = i38;
                        i20 = i37;
                        if (x02 == 27) {
                            if (i41 == 2) {
                                d0.i iVar = (d0.i) unsafe3.getObject(t13, Z);
                                if (!iVar.h()) {
                                    int size = iVar.size();
                                    iVar = iVar.c(size == 0 ? 10 : size * 2);
                                    unsafe3.putObject(t13, Z, iVar);
                                }
                                i33 = f.q(y0Var2.w(l02), i43, bArr, i39, i11, iVar, bVar);
                                i35 = l02;
                                i36 = i43;
                                i38 = i21;
                                i37 = i20;
                                i34 = i18;
                                bArr3 = bArr;
                                i32 = i12;
                            } else {
                                i29 = i39;
                                unsafe = unsafe3;
                                i22 = l02;
                                i30 = i43;
                                i13 = i12;
                                i19 = i29;
                            }
                        } else if (x02 <= 49) {
                            int i47 = i39;
                            unsafe = unsafe3;
                            i22 = l02;
                            i30 = i43;
                            i33 = j0(t10, bArr, i39, i11, i43, i18, i41, l02, i42, x02, Z, bVar);
                            if (i33 != i47) {
                                y0Var2 = this;
                                t13 = t10;
                                bArr3 = bArr;
                                i31 = i11;
                                i32 = i12;
                                bVar2 = bVar;
                                i38 = i21;
                                i37 = i20;
                                i35 = i22;
                                i36 = i30;
                                i34 = i18;
                                unsafe3 = unsafe;
                            } else {
                                i13 = i12;
                                i19 = i33;
                            }
                        } else {
                            i29 = i39;
                            unsafe = unsafe3;
                            i22 = l02;
                            i30 = i43;
                            if (x02 != 50) {
                                i33 = g0(t10, bArr, i29, i11, i30, i18, i41, i42, x02, Z, i22, bVar);
                                if (i33 != i29) {
                                    y0Var2 = this;
                                    t13 = t10;
                                    bArr3 = bArr;
                                    i31 = i11;
                                    i32 = i12;
                                    bVar2 = bVar;
                                    i38 = i21;
                                    i37 = i20;
                                    i35 = i22;
                                    i36 = i30;
                                    i34 = i18;
                                    unsafe3 = unsafe;
                                } else {
                                    i13 = i12;
                                    i19 = i33;
                                }
                            } else if (i41 == 2) {
                                i33 = f0(t10, bArr, i29, i11, i22, Z, bVar);
                                if (i33 != i29) {
                                    y0Var2 = this;
                                    t13 = t10;
                                    bArr3 = bArr;
                                    i31 = i11;
                                    i32 = i12;
                                    bVar2 = bVar;
                                    i38 = i21;
                                    i37 = i20;
                                    i35 = i22;
                                    i36 = i30;
                                    i34 = i18;
                                    unsafe3 = unsafe;
                                } else {
                                    i13 = i12;
                                    i19 = i33;
                                }
                            } else {
                                i13 = i12;
                                i19 = i29;
                            }
                        }
                        i15 = i30;
                    }
                }
                if (i15 != i13 || i13 == 0) {
                    i33 = (!this.f7385f || bVar.f7110d == q.b()) ? f.G(i15, bArr, i19, i11, x(t10), bVar) : f.g(i15, bArr, i19, i11, t10, this.f7384e, this.f7394o, bVar);
                    t13 = t10;
                    bArr3 = bArr;
                    i31 = i11;
                    i36 = i15;
                    y0Var2 = this;
                    bVar2 = bVar;
                    i38 = i21;
                    i37 = i20;
                    i35 = i22;
                    i34 = i18;
                    unsafe3 = unsafe;
                    i32 = i13;
                } else {
                    i17 = 1048575;
                    y0Var = this;
                    i14 = i19;
                    i16 = i21;
                    i37 = i20;
                }
            } else {
                int i48 = i38;
                unsafe = unsafe3;
                i13 = i32;
                y0Var = y0Var2;
                i14 = i33;
                i15 = i36;
                i16 = i48;
                i17 = 1048575;
            }
        }
        if (i16 != i17) {
            t11 = t10;
            unsafe.putInt(t11, i16, i37);
        } else {
            t11 = t10;
        }
        w1 w1Var = null;
        for (int i49 = y0Var.f7390k; i49 < y0Var.f7391l; i49++) {
            w1Var = (w1) r(t10, y0Var.f7389j[i49], w1Var, y0Var.f7394o, t10);
        }
        if (w1Var != null) {
            y0Var.f7394o.o(t11, w1Var);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw e0.h();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw e0.h();
        }
        return i14;
    }

    @Override // com.google.protobuf.n1
    public void i(T t10, l1 l1Var, q qVar) {
        Objects.requireNonNull(qVar);
        m(t10);
        O(this.f7394o, this.f7395p, t10, l1Var, qVar);
    }

    @Override // com.google.protobuf.n1
    public void j(T t10, byte[] bArr, int i10, int i11, f.b bVar) {
        if (this.f7387h) {
            i0(t10, bArr, i10, i11, bVar);
        } else {
            h0(t10, bArr, i10, i11, 0, bVar);
        }
    }
}
