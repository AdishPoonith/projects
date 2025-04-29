package ka;

import java.util.Collection;
import java.util.Iterator;
import t9.c0;
/* loaded from: classes.dex */
public class p extends o {
    public static final boolean j(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : n(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j(str, str2, z10);
    }

    public static boolean l(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean m(CharSequence charSequence) {
        boolean z10;
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            ha.f y10 = q.y(charSequence);
            if (!(y10 instanceof Collection) || !((Collection) y10).isEmpty()) {
                Iterator<Integer> it = y10.iterator();
                while (it.hasNext()) {
                    if (!b.c(charSequence.charAt(((c0) it).a()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static final boolean n(String str, int i10, String other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static final String o(String str, char c10, char c11, boolean z10) {
        String sb;
        String str2;
        kotlin.jvm.internal.l.e(str, "<this>");
        if (z10) {
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (c.e(charAt, c10, z10)) {
                    charAt = c11;
                }
                sb2.append(charAt);
            }
            sb = sb2.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        } else {
            sb = str.replace(c10, c11);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        }
        kotlin.jvm.internal.l.d(sb, str2);
        return sb;
    }

    public static final String p(String str, String oldValue, String newValue, boolean z10) {
        int a10;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(oldValue, "oldValue");
        kotlin.jvm.internal.l.e(newValue, "newValue");
        int i10 = 0;
        int B = q.B(str, oldValue, 0, z10);
        if (B < 0) {
            return str;
        }
        int length = oldValue.length();
        a10 = ha.i.a(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i10, B);
                sb.append(newValue);
                i10 = B + length;
                if (B >= str.length()) {
                    break;
                }
                B = q.B(str, oldValue, B + a10, z10);
            } while (B > 0);
            sb.append((CharSequence) str, i10, str.length());
            String sb2 = sb.toString();
            kotlin.jvm.internal.l.d(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String q(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return o(str, c10, c11, z10);
    }

    public static /* synthetic */ String r(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return p(str, str2, str3, z10);
    }

    public static final boolean s(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : n(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean t(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s(str, str2, z10);
    }
}
