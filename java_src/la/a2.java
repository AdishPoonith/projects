package la;

import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class a2 {
    public static final x a(v1 v1Var) {
        return new y1(v1Var);
    }

    public static /* synthetic */ x b(v1 v1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            v1Var = null;
        }
        return z1.a(v1Var);
    }

    public static final void c(v9.g gVar, CancellationException cancellationException) {
        v1 v1Var = (v1) gVar.b(v1.f13674g);
        if (v1Var != null) {
            v1Var.T(cancellationException);
        }
    }

    public static /* synthetic */ void d(v9.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        z1.c(gVar, cancellationException);
    }

    public static final void e(v9.g gVar, CancellationException cancellationException) {
        ja.b<v1> w10;
        v1 v1Var = (v1) gVar.b(v1.f13674g);
        if (v1Var == null || (w10 = v1Var.w()) == null) {
            return;
        }
        for (v1 v1Var2 : w10) {
            v1Var2.T(cancellationException);
        }
    }

    public static /* synthetic */ void f(v9.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        z1.e(gVar, cancellationException);
    }

    public static final c1 g(v1 v1Var, c1 c1Var) {
        return v1Var.b0(new e1(c1Var));
    }

    public static final void h(v1 v1Var) {
        if (!v1Var.a()) {
            throw v1Var.O();
        }
    }

    public static final void i(v9.g gVar) {
        v1 v1Var = (v1) gVar.b(v1.f13674g);
        if (v1Var != null) {
            z1.h(v1Var);
        }
    }

    public static final v1 j(v9.g gVar) {
        v1 v1Var = (v1) gVar.b(v1.f13674g);
        if (v1Var != null) {
            return v1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }
}
