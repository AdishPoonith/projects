package q9;

import i9.j1;
import i9.r0;
/* loaded from: classes.dex */
public abstract class a extends r0 {
    @Override // i9.r0
    public boolean b() {
        return g().b();
    }

    @Override // i9.r0
    public void c(j1 j1Var) {
        g().c(j1Var);
    }

    @Override // i9.r0
    public void d(r0.g gVar) {
        g().d(gVar);
    }

    @Override // i9.r0
    public void e() {
        g().e();
    }

    protected abstract r0 g();

    public String toString() {
        return b5.h.c(this).d("delegate", g()).toString();
    }
}
