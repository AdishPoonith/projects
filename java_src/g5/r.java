package g5;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList<q> f8993a = new CopyOnWriteArrayList<>();

    public static q a(String str) {
        Iterator<q> it = f8993a.iterator();
        while (it.hasNext()) {
            q next = it.next();
            if (next.b(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
