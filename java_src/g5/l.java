package g5;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class l {
    public static k a(String str) {
        k kVar = w.h().get(str);
        if (kVar != null) {
            return kVar;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
