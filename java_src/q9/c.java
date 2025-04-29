package q9;

import i9.r0;
import i9.x;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c extends r0.h {
    @Override // i9.r0.h
    public List<x> b() {
        return i().b();
    }

    @Override // i9.r0.h
    public Object d() {
        return i().d();
    }

    @Override // i9.r0.h
    public void e() {
        i().e();
    }

    @Override // i9.r0.h
    public void f() {
        i().f();
    }

    @Override // i9.r0.h
    public void g(r0.j jVar) {
        i().g(jVar);
    }

    protected abstract r0.h i();

    public String toString() {
        return b5.h.c(this).d("delegate", i()).toString();
    }
}
