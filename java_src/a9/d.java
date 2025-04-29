package a9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    static final class a implements Executor {

        /* renamed from: j  reason: collision with root package name */
        private static final Handler f358j = new Handler(Looper.getMainLooper());

        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f358j.post(runnable);
        }
    }

    public static Executor a() {
        return new a();
    }
}
