package m6;

import com.google.protobuf.e1;
import com.google.protobuf.t1;
import d7.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import q6.g0;
/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f13848a = b0.C0().M(Double.NaN).b();

    /* renamed from: b  reason: collision with root package name */
    public static final b0 f13849b;

    /* renamed from: c  reason: collision with root package name */
    public static final b0 f13850c;

    /* renamed from: d  reason: collision with root package name */
    private static final b0 f13851d;

    /* renamed from: e  reason: collision with root package name */
    public static final b0 f13852e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13853a;

        static {
            int[] iArr = new int[b0.c.values().length];
            f13853a = iArr;
            try {
                iArr[b0.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13853a[b0.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13853a[b0.c.INTEGER_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13853a[b0.c.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13853a[b0.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13853a[b0.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13853a[b0.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13853a[b0.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13853a[b0.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13853a[b0.c.ARRAY_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13853a[b0.c.MAP_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        b0 b10 = b0.C0().R(e1.NULL_VALUE).b();
        f13849b = b10;
        f13850c = b10;
        b0 b11 = b0.C0().T("__max__").b();
        f13851d = b11;
        f13852e = b0.C0().P(d7.s.o0().J("__type__", b11)).b();
    }

    public static boolean A(b0 b0Var) {
        return v(b0Var) || u(b0Var);
    }

    public static boolean B(b0 b0Var) {
        return b0Var != null && b0Var.B0() == b0.c.REFERENCE_VALUE;
    }

    public static int C(b0 b0Var, boolean z10, b0 b0Var2, boolean z11) {
        int i10 = i(b0Var, b0Var2);
        if (i10 != 0) {
            return i10;
        }
        if (!z10 || z11) {
            return (z10 || !z11) ? 0 : 1;
        }
        return -1;
    }

    private static boolean D(b0 b0Var, b0 b0Var2) {
        b0.c B0 = b0Var.B0();
        b0.c cVar = b0.c.INTEGER_VALUE;
        if (B0 == cVar && b0Var2.B0() == cVar) {
            return b0Var.w0() == b0Var2.w0();
        }
        b0.c B02 = b0Var.B0();
        b0.c cVar2 = b0.c.DOUBLE_VALUE;
        return B02 == cVar2 && b0Var2.B0() == cVar2 && Double.doubleToLongBits(b0Var.u0()) == Double.doubleToLongBits(b0Var2.u0());
    }

    private static boolean E(b0 b0Var, b0 b0Var2) {
        d7.s x02 = b0Var.x0();
        d7.s x03 = b0Var2.x0();
        if (x02.h0() != x03.h0()) {
            return false;
        }
        for (Map.Entry<String, b0> entry : x02.i0().entrySet()) {
            if (!q(entry.getValue(), x03.i0().get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static b0 F(f fVar, l lVar) {
        return b0.C0().S(String.format("projects/%s/databases/%s/documents/%s", fVar.k(), fVar.i(), lVar.toString())).b();
    }

    public static int G(b0 b0Var) {
        switch (a.f13853a[b0Var.B0().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                if (v.c(b0Var)) {
                    return 4;
                }
                return x(b0Var) ? Integer.MAX_VALUE : 10;
            default:
                throw q6.b.a("Invalid value type: " + b0Var.B0(), new Object[0]);
        }
    }

    public static int H(b0 b0Var, boolean z10, b0 b0Var2, boolean z11) {
        int i10 = i(b0Var, b0Var2);
        if (i10 != 0) {
            return i10;
        }
        if (!z10 || z11) {
            return (z10 || !z11) ? 0 : -1;
        }
        return 1;
    }

    private static boolean a(b0 b0Var, b0 b0Var2) {
        d7.b q02 = b0Var.q0();
        d7.b q03 = b0Var2.q0();
        if (q02.n0() != q03.n0()) {
            return false;
        }
        for (int i10 = 0; i10 < q02.n0(); i10++) {
            if (!q(q02.m0(i10), q03.m0(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String b(b0 b0Var) {
        StringBuilder sb = new StringBuilder();
        h(sb, b0Var);
        return sb.toString();
    }

    private static void c(StringBuilder sb, d7.b bVar) {
        sb.append("[");
        for (int i10 = 0; i10 < bVar.n0(); i10++) {
            h(sb, bVar.m0(i10));
            if (i10 != bVar.n0() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
    }

    private static void d(StringBuilder sb, h7.a aVar) {
        sb.append(String.format("geo(%s,%s)", Double.valueOf(aVar.i0()), Double.valueOf(aVar.j0())));
    }

    private static void e(StringBuilder sb, d7.s sVar) {
        ArrayList<String> arrayList = new ArrayList(sVar.i0().keySet());
        Collections.sort(arrayList);
        sb.append("{");
        boolean z10 = true;
        for (String str : arrayList) {
            if (z10) {
                z10 = false;
            } else {
                sb.append(",");
            }
            sb.append(str);
            sb.append(":");
            h(sb, sVar.k0(str));
        }
        sb.append("}");
    }

    private static void f(StringBuilder sb, b0 b0Var) {
        q6.b.d(B(b0Var), "Value should be a ReferenceValue", new Object[0]);
        sb.append(l.k(b0Var.y0()));
    }

    private static void g(StringBuilder sb, t1 t1Var) {
        sb.append(String.format("time(%s,%s)", Long.valueOf(t1Var.j0()), Integer.valueOf(t1Var.i0())));
    }

    private static void h(StringBuilder sb, b0 b0Var) {
        String str;
        switch (a.f13853a[b0Var.B0().ordinal()]) {
            case 1:
                str = "null";
                break;
            case 2:
                sb.append(b0Var.r0());
                return;
            case 3:
                sb.append(b0Var.w0());
                return;
            case 4:
                sb.append(b0Var.u0());
                return;
            case 5:
                g(sb, b0Var.A0());
                return;
            case 6:
                str = b0Var.z0();
                break;
            case 7:
                str = g0.A(b0Var.s0());
                break;
            case 8:
                f(sb, b0Var);
                return;
            case 9:
                d(sb, b0Var.v0());
                return;
            case 10:
                c(sb, b0Var.q0());
                return;
            case 11:
                e(sb, b0Var.x0());
                return;
            default:
                throw q6.b.a("Invalid value type: " + b0Var.B0(), new Object[0]);
        }
        sb.append(str);
    }

    public static int i(b0 b0Var, b0 b0Var2) {
        int G = G(b0Var);
        int G2 = G(b0Var2);
        if (G != G2) {
            return g0.l(G, G2);
        }
        if (G != Integer.MAX_VALUE) {
            switch (G) {
                case 0:
                    break;
                case 1:
                    return g0.h(b0Var.r0(), b0Var2.r0());
                case 2:
                    return m(b0Var, b0Var2);
                case 3:
                    return o(b0Var.A0(), b0Var2.A0());
                case 4:
                    return o(v.a(b0Var), v.a(b0Var2));
                case 5:
                    return b0Var.z0().compareTo(b0Var2.z0());
                case 6:
                    return g0.j(b0Var.s0(), b0Var2.s0());
                case 7:
                    return n(b0Var.y0(), b0Var2.y0());
                case 8:
                    return k(b0Var.v0(), b0Var2.v0());
                case 9:
                    return j(b0Var.q0(), b0Var2.q0());
                case 10:
                    return l(b0Var.x0(), b0Var2.x0());
                default:
                    throw q6.b.a("Invalid value type: " + G, new Object[0]);
            }
        }
        return 0;
    }

    private static int j(d7.b bVar, d7.b bVar2) {
        int min = Math.min(bVar.n0(), bVar2.n0());
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = i(bVar.m0(i10), bVar2.m0(i10));
            if (i11 != 0) {
                return i11;
            }
        }
        return g0.l(bVar.n0(), bVar2.n0());
    }

    private static int k(h7.a aVar, h7.a aVar2) {
        int k10 = g0.k(aVar.i0(), aVar2.i0());
        return k10 == 0 ? g0.k(aVar.j0(), aVar2.j0()) : k10;
    }

    private static int l(d7.s sVar, d7.s sVar2) {
        Iterator it = new TreeMap(sVar.i0()).entrySet().iterator();
        Iterator it2 = new TreeMap(sVar2.i0()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int compareTo = ((String) entry.getKey()).compareTo((String) entry2.getKey());
            if (compareTo != 0) {
                return compareTo;
            }
            int i10 = i((b0) entry.getValue(), (b0) entry2.getValue());
            if (i10 != 0) {
                return i10;
            }
        }
        return g0.h(it.hasNext(), it2.hasNext());
    }

    private static int m(b0 b0Var, b0 b0Var2) {
        b0.c B0 = b0Var.B0();
        b0.c cVar = b0.c.DOUBLE_VALUE;
        if (B0 == cVar) {
            double u02 = b0Var.u0();
            if (b0Var2.B0() == cVar) {
                return g0.k(u02, b0Var2.u0());
            }
            if (b0Var2.B0() == b0.c.INTEGER_VALUE) {
                return g0.n(u02, b0Var2.w0());
            }
        } else {
            b0.c B02 = b0Var.B0();
            b0.c cVar2 = b0.c.INTEGER_VALUE;
            if (B02 == cVar2) {
                long w02 = b0Var.w0();
                if (b0Var2.B0() == cVar2) {
                    return g0.m(w02, b0Var2.w0());
                }
                if (b0Var2.B0() == cVar) {
                    return g0.n(b0Var2.u0(), w02) * (-1);
                }
            }
        }
        throw q6.b.a("Unexpected values: %s vs %s", b0Var, b0Var2);
    }

    private static int n(String str, String str2) {
        String[] split = str.split("/", -1);
        String[] split2 = str2.split("/", -1);
        int min = Math.min(split.length, split2.length);
        for (int i10 = 0; i10 < min; i10++) {
            int compareTo = split[i10].compareTo(split2[i10]);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return g0.l(split.length, split2.length);
    }

    private static int o(t1 t1Var, t1 t1Var2) {
        int m10 = g0.m(t1Var.j0(), t1Var2.j0());
        return m10 != 0 ? m10 : g0.l(t1Var.i0(), t1Var2.i0());
    }

    public static boolean p(d7.c cVar, b0 b0Var) {
        for (b0 b0Var2 : cVar.o()) {
            if (q(b0Var2, b0Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(b0 b0Var, b0 b0Var2) {
        int G;
        if (b0Var == b0Var2) {
            return true;
        }
        if (b0Var == null || b0Var2 == null || (G = G(b0Var)) != G(b0Var2)) {
            return false;
        }
        if (G != 2) {
            if (G != 4) {
                if (G != Integer.MAX_VALUE) {
                    return G != 9 ? G != 10 ? b0Var.equals(b0Var2) : E(b0Var, b0Var2) : a(b0Var, b0Var2);
                }
                return true;
            }
            return v.a(b0Var).equals(v.a(b0Var2));
        }
        return D(b0Var, b0Var2);
    }

    public static b0 r(b0.c cVar) {
        switch (a.f13853a[cVar.ordinal()]) {
            case 1:
                return f13849b;
            case 2:
                return b0.C0().K(false).b();
            case 3:
            case 4:
                return b0.C0().M(Double.NaN).b();
            case 5:
                return b0.C0().U(t1.k0().I(Long.MIN_VALUE)).b();
            case 6:
                return b0.C0().T("").b();
            case 7:
                return b0.C0().L(com.google.protobuf.i.f7143k).b();
            case 8:
                return F(f.f13799l, l.h());
            case 9:
                return b0.C0().N(h7.a.k0().H(-90.0d).I(-180.0d)).b();
            case 10:
                return b0.C0().J(d7.b.l0()).b();
            case 11:
                return b0.C0().Q(d7.s.g0()).b();
            default:
                throw new IllegalArgumentException("Unknown value type: " + cVar);
        }
    }

    public static b0 s(b0.c cVar) {
        b0.c cVar2;
        switch (a.f13853a[cVar.ordinal()]) {
            case 1:
                cVar2 = b0.c.BOOLEAN_VALUE;
                break;
            case 2:
                cVar2 = b0.c.INTEGER_VALUE;
                break;
            case 3:
            case 4:
                cVar2 = b0.c.TIMESTAMP_VALUE;
                break;
            case 5:
                cVar2 = b0.c.STRING_VALUE;
                break;
            case 6:
                cVar2 = b0.c.BYTES_VALUE;
                break;
            case 7:
                cVar2 = b0.c.REFERENCE_VALUE;
                break;
            case 8:
                cVar2 = b0.c.GEO_POINT_VALUE;
                break;
            case 9:
                cVar2 = b0.c.ARRAY_VALUE;
                break;
            case 10:
                cVar2 = b0.c.MAP_VALUE;
                break;
            case 11:
                return f13852e;
            default:
                throw new IllegalArgumentException("Unknown value type: " + cVar);
        }
        return r(cVar2);
    }

    public static boolean t(b0 b0Var) {
        return b0Var != null && b0Var.B0() == b0.c.ARRAY_VALUE;
    }

    public static boolean u(b0 b0Var) {
        return b0Var != null && b0Var.B0() == b0.c.DOUBLE_VALUE;
    }

    public static boolean v(b0 b0Var) {
        return b0Var != null && b0Var.B0() == b0.c.INTEGER_VALUE;
    }

    public static boolean w(b0 b0Var) {
        return b0Var != null && b0Var.B0() == b0.c.MAP_VALUE;
    }

    public static boolean x(b0 b0Var) {
        return f13851d.equals(b0Var.x0().i0().get("__type__"));
    }

    public static boolean y(b0 b0Var) {
        return b0Var != null && Double.isNaN(b0Var.u0());
    }

    public static boolean z(b0 b0Var) {
        return b0Var != null && b0Var.B0() == b0.c.NULL_VALUE;
    }
}
