package q6;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
/* loaded from: classes.dex */
public class m implements Executor {

    /* renamed from: j  reason: collision with root package name */
    private Semaphore f16282j = new Semaphore(0);

    /* renamed from: k  reason: collision with root package name */
    private int f16283k = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Runnable runnable) {
        runnable.run();
        this.f16282j.release();
    }

    public void b() {
        try {
            this.f16282j.acquire(this.f16283k);
            this.f16283k = 0;
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            b.a("Interrupted while waiting for background task", e10);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        this.f16283k++;
        p.f16301c.execute(new Runnable() { // from class: q6.l
            @Override // java.lang.Runnable
            public final void run() {
                m.this.c(runnable);
            }
        });
    }
}
