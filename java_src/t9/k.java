package t9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public class k extends j {
    public static final String A(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(iArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String sb = ((StringBuilder) u(iArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final String B(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(jArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String sb = ((StringBuilder) v(jArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final <T> String C(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String sb = ((StringBuilder) w(tArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final String D(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(sArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String sb = ((StringBuilder) x(sArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String E(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, da.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return y(dArr, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static /* synthetic */ String F(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, da.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return z(fArr, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static /* synthetic */ String G(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, da.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return A(iArr, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static /* synthetic */ String H(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, da.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return B(jArr, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static /* synthetic */ String I(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, da.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return C(objArr, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static /* synthetic */ String J(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, da.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return D(sArr, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static char K(char[] cArr) {
        kotlin.jvm.internal.l.e(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T L(T[] tArr) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> List<T> M(T[] tArr, int i10) {
        List<T> b10;
        List<T> U;
        List<T> e10;
        kotlin.jvm.internal.l.e(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            e10 = p.e();
            return e10;
        } else {
            int length = tArr.length;
            if (i10 >= length) {
                U = U(tArr);
                return U;
            } else if (i10 == 1) {
                b10 = o.b(tArr[length - 1]);
                return b10;
            } else {
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = length - i10; i11 < length; i11++) {
                    arrayList.add(tArr[i11]);
                }
                return arrayList;
            }
        }
    }

    public static final <T, C extends Collection<? super T>> C N(T[] tArr, C destination) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    public static <T> HashSet<T> O(T[] tArr) {
        int a10;
        kotlin.jvm.internal.l.e(tArr, "<this>");
        a10 = f0.a(tArr.length);
        return (HashSet) N(tArr, new HashSet(a10));
    }

    public static List<Byte> P(byte[] bArr) {
        List<Byte> e10;
        List<Byte> b10;
        kotlin.jvm.internal.l.e(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            e10 = p.e();
            return e10;
        } else if (length != 1) {
            return W(bArr);
        } else {
            b10 = o.b(Byte.valueOf(bArr[0]));
            return b10;
        }
    }

    public static List<Double> Q(double[] dArr) {
        List<Double> e10;
        List<Double> b10;
        kotlin.jvm.internal.l.e(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            e10 = p.e();
            return e10;
        } else if (length != 1) {
            return X(dArr);
        } else {
            b10 = o.b(Double.valueOf(dArr[0]));
            return b10;
        }
    }

    public static List<Float> R(float[] fArr) {
        List<Float> e10;
        List<Float> b10;
        kotlin.jvm.internal.l.e(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            e10 = p.e();
            return e10;
        } else if (length != 1) {
            return Y(fArr);
        } else {
            b10 = o.b(Float.valueOf(fArr[0]));
            return b10;
        }
    }

    public static List<Integer> S(int[] iArr) {
        List<Integer> e10;
        List<Integer> b10;
        kotlin.jvm.internal.l.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            e10 = p.e();
            return e10;
        } else if (length != 1) {
            return Z(iArr);
        } else {
            b10 = o.b(Integer.valueOf(iArr[0]));
            return b10;
        }
    }

    public static List<Long> T(long[] jArr) {
        List<Long> e10;
        List<Long> b10;
        kotlin.jvm.internal.l.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            e10 = p.e();
            return e10;
        } else if (length != 1) {
            return a0(jArr);
        } else {
            b10 = o.b(Long.valueOf(jArr[0]));
            return b10;
        }
    }

    public static <T> List<T> U(T[] tArr) {
        List<T> e10;
        List<T> b10;
        kotlin.jvm.internal.l.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            e10 = p.e();
            return e10;
        } else if (length != 1) {
            return b0(tArr);
        } else {
            b10 = o.b(tArr[0]);
            return b10;
        }
    }

    public static List<Short> V(short[] sArr) {
        List<Short> e10;
        List<Short> b10;
        kotlin.jvm.internal.l.e(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            e10 = p.e();
            return e10;
        } else if (length != 1) {
            return c0(sArr);
        } else {
            b10 = o.b(Short.valueOf(sArr[0]));
            return b10;
        }
    }

    public static final List<Byte> W(byte[] bArr) {
        kotlin.jvm.internal.l.e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static final List<Double> X(double[] dArr) {
        kotlin.jvm.internal.l.e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static final List<Float> Y(float[] fArr) {
        kotlin.jvm.internal.l.e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final List<Integer> Z(int[] iArr) {
        kotlin.jvm.internal.l.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static final List<Long> a0(long[] jArr) {
        kotlin.jvm.internal.l.e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static final <T> List<T> b0(T[] tArr) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        return new ArrayList(p.d(tArr));
    }

    public static final List<Short> c0(short[] sArr) {
        kotlin.jvm.internal.l.e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static final <T> Set<T> d0(T[] tArr) {
        Set<T> b10;
        int a10;
        kotlin.jvm.internal.l.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            b10 = m0.b();
            return b10;
        } else if (length != 1) {
            a10 = f0.a(tArr.length);
            return (Set) N(tArr, new LinkedHashSet(a10));
        } else {
            return l0.a(tArr[0]);
        }
    }

    public static <T> boolean j(T[] tArr, T t10) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        return r(tArr, t10) >= 0;
    }

    public static <T> List<T> k(T[] tArr, int i10) {
        int a10;
        kotlin.jvm.internal.l.e(tArr, "<this>");
        if (i10 >= 0) {
            a10 = ha.i.a(tArr.length - i10, 0);
            return M(tArr, a10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> l(T[] tArr) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        return (List) m(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C m(T[] tArr, C destination) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static <T> T n(T[] tArr) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static int o(int[] iArr) {
        kotlin.jvm.internal.l.e(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final <T> int p(T[] tArr) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T q(T[] tArr, int i10) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        if (i10 < 0 || i10 > p(tArr)) {
            return null;
        }
        return tArr[i10];
    }

    public static final <T> int r(T[] tArr, T t10) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (kotlin.jvm.internal.l.a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <A extends Appendable> A s(double[] dArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(dArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            buffer.append(lVar != null ? lVar.invoke(Double.valueOf(d10)) : String.valueOf(d10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A t(float[] fArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(fArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            buffer.append(lVar != null ? lVar.invoke(Float.valueOf(f10)) : String.valueOf(f10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A u(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(iArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            buffer.append(lVar != null ? lVar.invoke(Integer.valueOf(i12)) : String.valueOf(i12));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A v(long[] jArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(jArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            buffer.append(lVar != null ? lVar.invoke(Long.valueOf(j10)) : String.valueOf(j10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T, A extends Appendable> A w(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(tArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            ka.h.a(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A x(short[] sArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(sArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            buffer.append(lVar != null ? lVar.invoke(Short.valueOf(s10)) : String.valueOf((int) s10));
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String y(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(dArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String sb = ((StringBuilder) s(dArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final String z(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, da.l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l.e(fArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String sb = ((StringBuilder) t(fArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }
}
