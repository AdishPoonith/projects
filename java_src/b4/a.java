package b4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: j  reason: collision with root package name */
    boolean f2891j = false;

    /* renamed from: k  reason: collision with root package name */
    private final BlockingQueue f2892k = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    public IBinder a() {
        c4.s.i("BlockingServiceConnection.getService() called on main thread");
        if (this.f2891j) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f2891j = true;
        return (IBinder) this.f2892k.take();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2892k.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
