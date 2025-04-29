package la;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class o1 {
    public static final g0 a(Executor executor) {
        g0 g0Var;
        z0 z0Var = executor instanceof z0 ? (z0) executor : null;
        return (z0Var == null || (g0Var = z0Var.f13690j) == null) ? new n1(executor) : g0Var;
    }

    public static final m1 b(ExecutorService executorService) {
        return new n1(executorService);
    }
}
