package p4;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final Looper f15494a;

    public e(Looper looper) {
        super(looper);
        this.f15494a = Looper.getMainLooper();
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f15494a = Looper.getMainLooper();
    }
}
