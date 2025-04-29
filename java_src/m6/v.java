package m6;

import com.google.protobuf.t1;
import d7.b0;
import d7.s;
/* loaded from: classes.dex */
public final class v {
    public static t1 a(b0 b0Var) {
        return b0Var.x0().k0("__local_write_time__").A0();
    }

    public static b0 b(b0 b0Var) {
        b0 j02 = b0Var.x0().j0("__previous_value__", null);
        return c(j02) ? b(j02) : j02;
    }

    public static boolean c(b0 b0Var) {
        b0 j02 = b0Var != null ? b0Var.x0().j0("__type__", null) : null;
        return j02 != null && "server_timestamp".equals(j02.z0());
    }

    public static b0 d(w5.q qVar, b0 b0Var) {
        s.b J = d7.s.o0().J("__type__", b0.C0().T("server_timestamp").b()).J("__local_write_time__", b0.C0().U(t1.k0().I(qVar.l()).H(qVar.k())).b());
        if (c(b0Var)) {
            b0Var = b(b0Var);
        }
        if (b0Var != null) {
            J.J("__previous_value__", b0Var);
        }
        return b0.C0().P(J).b();
    }
}
