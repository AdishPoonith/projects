package f1;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
/* loaded from: classes.dex */
public final class b0<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f8384a;

    /* renamed from: b  reason: collision with root package name */
    private CountDownLatch f8385b;

    public b0(final Callable<T> callable) {
        kotlin.jvm.internal.l.e(callable, "callable");
        this.f8385b = new CountDownLatch(1);
        p0.f0 f0Var = p0.f0.f14852a;
        p0.f0.t().execute(new FutureTask(new Callable() { // from class: f1.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void b10;
                b10 = b0.b(b0.this, callable);
                return b10;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void b(b0 this$0, Callable callable) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(callable, "$callable");
        try {
            this$0.f8384a = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.f8385b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
