package a8;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
/* loaded from: classes.dex */
public class b extends Service {

    /* renamed from: j  reason: collision with root package name */
    private static final Binder f351j = new Binder();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return f351j;
    }
}
