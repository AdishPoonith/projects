package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    private static class a implements Executor {

        /* renamed from: j  reason: collision with root package name */
        private final Handler f1763j;

        a(Handler handler) {
            this.f1763j = (Handler) androidx.core.util.d.c(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f1763j.post((Runnable) androidx.core.util.d.c(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f1763j + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
