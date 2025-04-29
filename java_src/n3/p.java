package n3;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Executor {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Handler f14250j;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14250j.post(runnable);
    }
}
