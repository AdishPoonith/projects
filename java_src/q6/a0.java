package q6;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 implements Executor {

    /* renamed from: j  reason: collision with root package name */
    private final Executor f16231j;

    /* renamed from: k  reason: collision with root package name */
    private final Semaphore f16232k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(int i10, Executor executor) {
        this.f16232k = new Semaphore(i10);
        this.f16231j = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        runnable.run();
        this.f16232k.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (this.f16232k.tryAcquire()) {
            try {
                this.f16231j.execute(new Runnable() { // from class: q6.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.this.b(runnable);
                    }
                });
                return;
            } catch (RejectedExecutionException unused) {
            }
        }
        runnable.run();
    }
}
