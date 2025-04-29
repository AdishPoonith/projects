package la;
/* loaded from: classes.dex */
public final class j0 {
    public static final void a(v9.g gVar, Throwable th) {
        try {
            h0 h0Var = (h0) gVar.b(h0.f13625f);
            if (h0Var != null) {
                h0Var.k(gVar, th);
            } else {
                i0.a(gVar, th);
            }
        } catch (Throwable th2) {
            i0.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        s9.b.a(runtimeException, th);
        return runtimeException;
    }
}
