package ba;

import java.io.Closeable;
/* loaded from: classes.dex */
public final class a {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                s9.b.a(th, th2);
            }
        }
    }
}
