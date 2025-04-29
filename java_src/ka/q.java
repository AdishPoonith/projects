package ka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import t9.c0;
import t9.x;
/* loaded from: classes.dex */
public class q extends p {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.m implements da.p<CharSequence, Integer, s9.m<? extends Integer, ? extends Integer>> {

        /* renamed from: j */
        final /* synthetic */ char[] f12828j;

        /* renamed from: k */
        final /* synthetic */ boolean f12829k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f12828j = cArr;
            this.f12829k = z10;
        }

        public final s9.m<Integer, Integer> a(CharSequence $receiver, int i10) {
            kotlin.jvm.internal.l.e($receiver, "$this$$receiver");
            int G = q.G($receiver, this.f12828j, i10, this.f12829k);
            if (G < 0) {
                return null;
            }
            return s9.q.a(Integer.valueOf(G), 1);
        }

        @Override // da.p
        public /* bridge */ /* synthetic */ s9.m<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.m implements da.p<CharSequence, Integer, s9.m<? extends Integer, ? extends Integer>> {

        /* renamed from: j */
        final /* synthetic */ List<String> f12830j;

        /* renamed from: k */
        final /* synthetic */ boolean f12831k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z10) {
            super(2);
            this.f12830j = list;
            this.f12831k = z10;
        }

        public final s9.m<Integer, Integer> a(CharSequence $receiver, int i10) {
            kotlin.jvm.internal.l.e($receiver, "$this$$receiver");
            s9.m x10 = q.x($receiver, this.f12830j, i10, this.f12831k, false);
            if (x10 != null) {
                return s9.q.a(x10.c(), Integer.valueOf(((String) x10.d()).length()));
            }
            return null;
        }

        @Override // da.p
        public /* bridge */ /* synthetic */ s9.m<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.m implements da.l<ha.f, String> {

        /* renamed from: j */
        final /* synthetic */ CharSequence f12832j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f12832j = charSequence;
        }

        @Override // da.l
        /* renamed from: a */
        public final String invoke(ha.f it) {
            kotlin.jvm.internal.l.e(it, "it");
            return q.e0(this.f12832j, it);
        }
    }

    public static final int A(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? G(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static final int B(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? D(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    private static final int C(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        int c10;
        int a10;
        ha.d f10;
        int a11;
        int c11;
        if (z11) {
            c10 = ha.i.c(i10, z(charSequence));
            a10 = ha.i.a(i11, 0);
            f10 = ha.i.f(c10, a10);
        } else {
            a11 = ha.i.a(i10, 0);
            c11 = ha.i.c(i11, charSequence.length());
            f10 = new ha.f(a11, c11);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int b10 = f10.b();
            int e10 = f10.e();
            int k10 = f10.k();
            if ((k10 <= 0 || b10 > e10) && (k10 >= 0 || e10 > b10)) {
                return -1;
            }
            while (!p.n((String) charSequence2, 0, (String) charSequence, b10, charSequence2.length(), z10)) {
                if (b10 == e10) {
                    return -1;
                }
                b10 += k10;
            }
            return b10;
        }
        int b11 = f10.b();
        int e11 = f10.e();
        int k11 = f10.k();
        if ((k11 <= 0 || b11 > e11) && (k11 >= 0 || e11 > b11)) {
            return -1;
        }
        while (!V(charSequence2, 0, charSequence, b11, charSequence2.length(), z10)) {
            if (b11 == e11) {
                return -1;
            }
            b11 += k11;
        }
        return b11;
    }

    static /* synthetic */ int D(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        return C(charSequence, charSequence2, i10, i11, z10, (i12 & 16) != 0 ? false : z11);
    }

    public static /* synthetic */ int E(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return A(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return B(charSequence, str, i10, z10);
    }

    public static final int G(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        int a10;
        boolean z11;
        char K;
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            K = t9.k.K(chars);
            return ((String) charSequence).indexOf(K, i10);
        }
        a10 = ha.i.a(i10, 0);
        c0 it = new ha.f(a10, z(charSequence)).iterator();
        while (it.hasNext()) {
            int a11 = it.a();
            char charAt = charSequence.charAt(a11);
            int length = chars.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    continue;
                    break;
                } else if (ka.c.e(chars[i11], charAt, z10)) {
                    z11 = true;
                    continue;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return a11;
            }
        }
        return -1;
    }

    public static final int H(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? L(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int I(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? C(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ int J(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return H(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int K(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return I(charSequence, str, i10, z10);
    }

    public static final int L(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        int c10;
        char K;
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            K = t9.k.K(chars);
            return ((String) charSequence).lastIndexOf(K, i10);
        }
        for (c10 = ha.i.c(i10, z(charSequence)); -1 < c10; c10--) {
            char charAt = charSequence.charAt(c10);
            int length = chars.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (ka.c.e(chars[i11], charAt, z10)) {
                    z11 = true;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return c10;
            }
        }
        return -1;
    }

    public static final ja.b<String> M(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return d0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> N(CharSequence charSequence) {
        List<String> g10;
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        g10 = ja.j.g(M(charSequence));
        return g10;
    }

    public static final CharSequence O(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i10);
            sb.append(charSequence);
            c0 it = new ha.f(1, i10 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.a();
                sb.append(c10);
            }
            return sb;
        }
    }

    public static final String P(String str, int i10, char c10) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return O(str, i10, c10).toString();
    }

    public static /* synthetic */ String Q(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return P(str, i10, c10);
    }

    private static final ja.b<ha.f> R(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        W(i11);
        return new e(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final ja.b<ha.f> S(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        List b10;
        W(i11);
        b10 = t9.j.b(strArr);
        return new e(charSequence, i10, i11, new b(b10, z10));
    }

    static /* synthetic */ ja.b T(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return R(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ ja.b U(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return S(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean V(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!ka.c.e(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final void W(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> X(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        Iterable<ha.f> e10;
        int j10;
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return Z(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        e10 = ja.j.e(T(charSequence, delimiters, 0, z10, i10, 2, null));
        j10 = t9.q.j(e10, 10);
        ArrayList arrayList = new ArrayList(j10);
        for (ha.f fVar : e10) {
            arrayList.add(e0(charSequence, fVar));
        }
        return arrayList;
    }

    public static final List<String> Y(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        Iterable<ha.f> e10;
        int j10;
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return Z(charSequence, str, z10, i10);
            }
        }
        e10 = ja.j.e(U(charSequence, delimiters, 0, z10, i10, 2, null));
        j10 = t9.q.j(e10, 10);
        ArrayList arrayList = new ArrayList(j10);
        for (ha.f fVar : e10) {
            arrayList.add(e0(charSequence, fVar));
        }
        return arrayList;
    }

    private static final List<String> Z(CharSequence charSequence, String str, boolean z10, int i10) {
        List<String> b10;
        W(i10);
        int i11 = 0;
        int B = B(charSequence, str, 0, z10);
        if (B == -1 || i10 == 1) {
            b10 = t9.o.b(charSequence.toString());
            return b10;
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? ha.i.c(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i11, B).toString());
            i11 = str.length() + B;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            B = B(charSequence, str, i11, z10);
        } while (B != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List a0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return X(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List b0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Y(charSequence, strArr, z10, i10);
    }

    public static final ja.b<String> c0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        ja.b<String> f10;
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(delimiters, "delimiters");
        f10 = ja.j.f(U(charSequence, delimiters, 0, z10, i10, 2, null), new c(charSequence));
        return f10;
    }

    public static /* synthetic */ ja.b d0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return c0(charSequence, strArr, z10, i10);
    }

    public static final String e0(CharSequence charSequence, ha.f range) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(range, "range");
        return charSequence.subSequence(range.r().intValue(), range.q().intValue() + 1).toString();
    }

    public static final String f0(String str, char c10, String missingDelimiterValue) {
        int E;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(missingDelimiterValue, "missingDelimiterValue");
        E = E(str, c10, 0, false, 6, null);
        if (E == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(E + 1, str.length());
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String g0(String str, String delimiter, String missingDelimiterValue) {
        int F;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(delimiter, "delimiter");
        kotlin.jvm.internal.l.e(missingDelimiterValue, "missingDelimiterValue");
        F = F(str, delimiter, 0, false, 6, null);
        if (F == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(F + delimiter.length(), str.length());
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String h0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return f0(str, c10, str2);
    }

    public static /* synthetic */ String i0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return g0(str, str2, str3);
    }

    public static final String j0(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(missingDelimiterValue, "missingDelimiterValue");
        int J = J(str, c10, 0, false, 6, null);
        if (J == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(J + 1, str.length());
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String k0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return j0(str, c10, str2);
    }

    public static final String l0(String str, char c10, String missingDelimiterValue) {
        int E;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(missingDelimiterValue, "missingDelimiterValue");
        E = E(str, c10, 0, false, 6, null);
        if (E == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, E);
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String m0(String str, String delimiter, String missingDelimiterValue) {
        int F;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(delimiter, "delimiter");
        kotlin.jvm.internal.l.e(missingDelimiterValue, "missingDelimiterValue");
        F = F(str, delimiter, 0, false, 6, null);
        if (F == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, F);
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String n0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return l0(str, c10, str2);
    }

    public static /* synthetic */ String o0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m0(str, str2, str3);
    }

    public static CharSequence p0(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = ka.b.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!c10) {
                    break;
                }
                length--;
            } else if (c10) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final boolean v(CharSequence charSequence, CharSequence other, boolean z10) {
        int F;
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        if (other instanceof String) {
            F = F(charSequence, (String) other, 0, z10, 2, null);
            if (F >= 0) {
                return true;
            }
        } else if (D(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean w(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v(charSequence, charSequence2, z10);
    }

    public static final s9.m<Integer, String> x(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        int c10;
        ha.d f10;
        int b10;
        Object obj;
        String str;
        Object obj2;
        int a10;
        Object H;
        if (!z10 && collection.size() == 1) {
            H = x.H(collection);
            String str2 = (String) H;
            int F = !z11 ? F(charSequence, str2, i10, false, 4, null) : K(charSequence, str2, i10, false, 4, null);
            if (F < 0) {
                return null;
            }
            return s9.q.a(Integer.valueOf(F), str2);
        }
        if (z11) {
            c10 = ha.i.c(i10, z(charSequence));
            f10 = ha.i.f(c10, 0);
        } else {
            a10 = ha.i.a(i10, 0);
            f10 = new ha.f(a10, charSequence.length());
        }
        if (charSequence instanceof String) {
            b10 = f10.b();
            int e10 = f10.e();
            int k10 = f10.k();
            if ((k10 > 0 && b10 <= e10) || (k10 < 0 && e10 <= b10)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str3 = (String) obj2;
                        if (p.n(str3, 0, (String) charSequence, b10, str3.length(), z10)) {
                            break;
                        }
                    }
                    str = (String) obj2;
                    if (str == null) {
                        if (b10 == e10) {
                            break;
                        }
                        b10 += k10;
                    } else {
                        break;
                    }
                }
                return s9.q.a(Integer.valueOf(b10), str);
            }
            return null;
        }
        b10 = f10.b();
        int e11 = f10.e();
        int k11 = f10.k();
        if ((k11 > 0 && b10 <= e11) || (k11 < 0 && e11 <= b10)) {
            while (true) {
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    String str4 = (String) obj;
                    if (V(str4, 0, charSequence, b10, str4.length(), z10)) {
                        break;
                    }
                }
                str = (String) obj;
                if (str == null) {
                    if (b10 == e11) {
                        break;
                    }
                    b10 += k11;
                } else {
                    break;
                }
            }
            return s9.q.a(Integer.valueOf(b10), str);
        }
        return null;
    }

    public static final ha.f y(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return new ha.f(0, charSequence.length() - 1);
    }

    public static final int z(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }
}
