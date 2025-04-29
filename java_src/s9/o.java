package s9;

import s9.n;
/* loaded from: classes.dex */
public final class o {
    public static final Object a(Throwable exception) {
        kotlin.jvm.internal.l.e(exception, "exception");
        return new n.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof n.b) {
            throw ((n.b) obj).f17872j;
        }
    }
}
