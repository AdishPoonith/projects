package p3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
/* loaded from: classes.dex */
public class g0 implements d {
    @Override // p3.d
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p3.d
    public long b() {
        return SystemClock.uptimeMillis();
    }

    @Override // p3.d
    public n c(Looper looper, Handler.Callback callback) {
        return new h0(new Handler(looper, callback));
    }

    @Override // p3.d
    public void d() {
    }
}
