package c4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q1 extends i {

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f3374f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Context f3375g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Handler f3376h;

    /* renamed from: i  reason: collision with root package name */
    private final p1 f3377i;

    /* renamed from: j  reason: collision with root package name */
    private final g4.a f3378j;

    /* renamed from: k  reason: collision with root package name */
    private final long f3379k;

    /* renamed from: l  reason: collision with root package name */
    private final long f3380l;

    /* renamed from: m  reason: collision with root package name */
    private volatile Executor f3381m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(Context context, Looper looper, Executor executor) {
        p1 p1Var = new p1(this, null);
        this.f3377i = p1Var;
        this.f3375g = context.getApplicationContext();
        this.f3376h = new p4.e(looper, p1Var);
        this.f3378j = g4.a.a();
        this.f3379k = 5000L;
        this.f3380l = 300000L;
        this.f3381m = executor;
    }

    @Override // c4.i
    protected final void f(m1 m1Var, ServiceConnection serviceConnection, String str) {
        s.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3374f) {
            n1 n1Var = (n1) this.f3374f.get(m1Var);
            if (n1Var == null) {
                String obj = m1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (!n1Var.h(serviceConnection)) {
                String obj2 = m1Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            } else {
                n1Var.f(serviceConnection, str);
                if (n1Var.i()) {
                    this.f3376h.sendMessageDelayed(this.f3376h.obtainMessage(0, m1Var), this.f3379k);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.i
    public final boolean h(m1 m1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j10;
        s.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3374f) {
            n1 n1Var = (n1) this.f3374f.get(m1Var);
            if (executor == null) {
                executor = this.f3381m;
            }
            if (n1Var == null) {
                n1Var = new n1(this, m1Var);
                n1Var.d(serviceConnection, serviceConnection, str);
                n1Var.e(str, executor);
                this.f3374f.put(m1Var, n1Var);
            } else {
                this.f3376h.removeMessages(0, m1Var);
                if (n1Var.h(serviceConnection)) {
                    String obj = m1Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
                n1Var.d(serviceConnection, serviceConnection, str);
                int a10 = n1Var.a();
                if (a10 == 1) {
                    serviceConnection.onServiceConnected(n1Var.b(), n1Var.c());
                } else if (a10 == 2) {
                    n1Var.e(str, executor);
                }
            }
            j10 = n1Var.j();
        }
        return j10;
    }
}
