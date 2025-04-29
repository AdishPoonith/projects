package t4;
/* loaded from: classes.dex */
public final class s {
    public static int a(int i10) {
        boolean z10;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                z10 = false;
                c4.s.c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
                return i10;
            }
            i10 = 2;
        }
        z10 = true;
        c4.s.c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    public static String b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "GRANULARITY_FINE";
                }
                throw new IllegalArgumentException();
            }
            return "GRANULARITY_COARSE";
        }
        return "GRANULARITY_PERMISSION_LEVEL";
    }
}
