package c6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public enum i implements Executor {
    INSTANCE;
    

    /* renamed from: k  reason: collision with root package name */
    private static final Handler f3445k = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f3445k.post(runnable);
    }
}
