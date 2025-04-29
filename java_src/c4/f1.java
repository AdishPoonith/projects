package c4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class f1 implements ServiceConnection {

    /* renamed from: j  reason: collision with root package name */
    private final int f3301j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ c f3302k;

    public f1(c cVar, int i10) {
        this.f3302k = cVar;
        this.f3301j = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        c cVar = this.f3302k;
        if (iBinder == null) {
            c.b0(cVar, 16);
            return;
        }
        obj = cVar.f3264w;
        synchronized (obj) {
            c cVar2 = this.f3302k;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f3265x = (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new y0(iBinder) : (n) queryLocalInterface;
        }
        this.f3302k.c0(0, null, this.f3301j);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f3302k.f3264w;
        synchronized (obj) {
            this.f3302k.f3265x = null;
        }
        Handler handler = this.f3302k.f3262u;
        handler.sendMessage(handler.obtainMessage(6, this.f3301j, 1));
    }
}
