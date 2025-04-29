package defpackage;

import android.util.Log;
import java.util.List;
import t9.p;
/* renamed from: c  reason: default package */
/* loaded from: classes.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> b(Throwable th) {
        List<Object> g10;
        List<Object> g11;
        if (th instanceof a) {
            g11 = p.g(((a) th).a(), th.getMessage(), ((a) th).b());
            return g11;
        }
        g10 = p.g(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return g10;
    }
}
