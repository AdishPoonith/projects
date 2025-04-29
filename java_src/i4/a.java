package i4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p4.e;
/* loaded from: classes.dex */
public class a implements Executor {

    /* renamed from: j  reason: collision with root package name */
    private final Handler f9712j;

    public a(Looper looper) {
        this.f9712j = new e(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9712j.post(runnable);
    }
}
