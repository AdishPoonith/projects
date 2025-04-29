package q9;

import i9.n1;
import i9.r0;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public abstract class b extends r0.d {
    @Override // i9.r0.d
    public r0.h a(r0.b bVar) {
        return g().a(bVar);
    }

    @Override // i9.r0.d
    public i9.f b() {
        return g().b();
    }

    @Override // i9.r0.d
    public ScheduledExecutorService c() {
        return g().c();
    }

    @Override // i9.r0.d
    public n1 d() {
        return g().d();
    }

    @Override // i9.r0.d
    public void e() {
        g().e();
    }

    protected abstract r0.d g();

    public String toString() {
        return b5.h.c(this).d("delegate", g()).toString();
    }
}
