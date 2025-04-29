package fa;

import ha.f;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class d {
    public static final String a(Object from, Object until) {
        l.e(from, "from");
        l.e(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void b(int i10, int i11) {
        if (!(i11 > i10)) {
            throw new IllegalArgumentException(a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final int c(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int d(c cVar, f range) {
        l.e(cVar, "<this>");
        l.e(range, "range");
        if (!range.isEmpty()) {
            return range.e() < Integer.MAX_VALUE ? cVar.e(range.b(), range.e() + 1) : range.b() > Integer.MIN_VALUE ? cVar.e(range.b() - 1, range.e()) + 1 : cVar.c();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int e(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
