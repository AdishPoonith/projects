package g5;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final x f9018a = new x();

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x a() {
        return f9018a;
    }

    public static x b(x xVar) {
        if (xVar != null) {
            return xVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
