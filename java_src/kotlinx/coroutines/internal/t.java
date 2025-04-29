package kotlinx.coroutines.internal;

import java.util.List;
import la.g2;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f12919a = true;

    private static final u a(Throwable th, String str) {
        if (f12919a) {
            return new u(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new s9.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ u b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(g2 g2Var) {
        return g2Var.k0() instanceof u;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final g2 e(r rVar, List<? extends r> list) {
        try {
            return rVar.b(list);
        } catch (Throwable th) {
            return a(th, rVar.a());
        }
    }
}
