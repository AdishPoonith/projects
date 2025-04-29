package x1;

import java.io.EOFException;
import s1.u2;
/* loaded from: classes.dex */
public final class o {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw u2.a(str, null);
        }
    }

    public static boolean b(m mVar, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return mVar.k(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(m mVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int d10 = mVar.d(bArr, i10 + i12, i11 - i12);
            if (d10 == -1) {
                break;
            }
            i12 += d10;
        }
        return i12;
    }

    public static boolean d(m mVar, byte[] bArr, int i10, int i11) {
        try {
            mVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(m mVar, int i10) {
        try {
            mVar.g(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
