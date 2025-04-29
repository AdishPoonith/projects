package i9;

import i9.j1;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class s {
    public static j1 a(r rVar) {
        b5.n.o(rVar, "context must not be null");
        if (rVar.h()) {
            Throwable c10 = rVar.c();
            if (c10 == null) {
                return j1.f9924g.q("io.grpc.Context was cancelled without error");
            }
            if (c10 instanceof TimeoutException) {
                return j1.f9927j.q(c10.getMessage()).p(c10);
            }
            j1 k10 = j1.k(c10);
            return (j1.b.UNKNOWN.equals(k10.m()) && k10.l() == c10) ? j1.f9924g.q("Context cancelled").p(c10) : k10.p(c10);
        }
        return null;
    }
}
