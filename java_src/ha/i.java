package ha;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i extends h {
    public static int a(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long b(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int c(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long d(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static int e(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static d f(int i10, int i11) {
        return d.f9554m.a(i10, i11, -1);
    }

    public static int g(f fVar, fa.c random) {
        l.e(fVar, "<this>");
        l.e(random, "random");
        try {
            return fa.d.d(random, fVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static f h(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? f.f9562n.a() : new f(i10, i11 - 1);
    }
}
