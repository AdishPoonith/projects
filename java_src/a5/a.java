package a5;
/* loaded from: classes.dex */
public final class a {
    public static int a(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 > 0 ? 1 : 0;
    }

    public static int b(double d10, long j10) {
        if (!Double.isNaN(d10) && d10 >= -9.223372036854776E18d) {
            if (d10 >= 9.223372036854776E18d) {
                return 1;
            }
            int a10 = a((long) d10, j10);
            return a10 != 0 ? a10 : c(d10, j10);
        }
        return -1;
    }

    public static int c(double d10, double d11) {
        if (d10 < d11) {
            return -1;
        }
        int i10 = (d10 > d11 ? 1 : (d10 == d11 ? 0 : -1));
        if (i10 > 0) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        if (Double.isNaN(d11)) {
            return !Double.isNaN(d10) ? 1 : 0;
        }
        return -1;
    }
}
