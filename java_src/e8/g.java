package e8;

import android.os.Handler;
import android.os.Looper;
import e8.c;
/* loaded from: classes.dex */
public class g implements c.d {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f8167a = f9.a.a(Looper.getMainLooper());

    @Override // e8.c.d
    public void a(Runnable runnable) {
        this.f8167a.post(runnable);
    }
}
