package g5;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import t5.c0;
import t5.d0;
import t5.i0;
import t5.y;
import t5.z;
/* loaded from: classes.dex */
final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f9019a = Charset.forName("UTF-8");

    public static d0.c a(c0.c cVar) {
        return d0.c.T().E(cVar.S().T()).D(cVar.V()).C(cVar.U()).B(cVar.T()).b();
    }

    public static d0 b(c0 c0Var) {
        d0.b C = d0.T().C(c0Var.V());
        for (c0.c cVar : c0Var.U()) {
            C.B(a(cVar));
        }
        return C.b();
    }

    public static void c(c0.c cVar) {
        if (!cVar.W()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.T())));
        }
        if (cVar.U() == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.T())));
        }
        if (cVar.V() == z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.T())));
        }
    }

    public static void d(c0 c0Var) {
        int V = c0Var.V();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (c0.c cVar : c0Var.U()) {
            if (cVar.V() == z.ENABLED) {
                c(cVar);
                if (cVar.T() == V) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (cVar.S().S() != y.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
