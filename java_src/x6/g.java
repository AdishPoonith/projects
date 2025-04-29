package x6;

import android.os.Handler;
import android.os.Looper;
import c4.s;
import java.util.concurrent.Executor;
import w6.m;
/* loaded from: classes.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    static boolean f20253c = false;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f20254a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f20255b;

    public g(Executor executor) {
        this.f20255b = executor;
        if (executor != null || f20253c) {
            this.f20254a = null;
        } else {
            this.f20254a = new Handler(Looper.getMainLooper());
        }
    }

    public void a(Runnable runnable) {
        s.j(runnable);
        Handler handler = this.f20254a;
        if (handler != null) {
            handler.post(runnable);
            return;
        }
        Executor executor = this.f20255b;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            m.b().c(runnable);
        }
    }
}
