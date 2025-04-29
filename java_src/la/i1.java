package la;

import java.util.concurrent.locks.LockSupport;
import la.h1;
/* loaded from: classes.dex */
public abstract class i1 extends g1 {
    protected abstract Thread t0();

    /* JADX INFO: Access modifiers changed from: protected */
    public void u0(long j10, h1.b bVar) {
        p0.f13656q.G0(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v0() {
        Thread t02 = t0();
        if (Thread.currentThread() != t02) {
            c.a();
            LockSupport.unpark(t02);
        }
    }
}
