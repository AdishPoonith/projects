package c4;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class n1 implements ServiceConnection, r1 {

    /* renamed from: j  reason: collision with root package name */
    private final Map f3348j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private int f3349k = 2;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3350l;

    /* renamed from: m  reason: collision with root package name */
    private IBinder f3351m;

    /* renamed from: n  reason: collision with root package name */
    private final m1 f3352n;

    /* renamed from: o  reason: collision with root package name */
    private ComponentName f3353o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ q1 f3354p;

    public n1(q1 q1Var, m1 m1Var) {
        this.f3354p = q1Var;
        this.f3352n = m1Var;
    }

    public final int a() {
        return this.f3349k;
    }

    public final ComponentName b() {
        return this.f3353o;
    }

    public final IBinder c() {
        return this.f3351m;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f3348j.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        g4.a aVar;
        Context context;
        Context context2;
        g4.a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        this.f3349k = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (h4.j.l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            q1 q1Var = this.f3354p;
            aVar = q1Var.f3378j;
            context = q1Var.f3375g;
            m1 m1Var = this.f3352n;
            context2 = q1Var.f3375g;
            boolean c10 = aVar.c(context, str, m1Var.b(context2), this, 4225, executor);
            this.f3350l = c10;
            if (c10) {
                handler = this.f3354p.f3376h;
                Message obtainMessage = handler.obtainMessage(1, this.f3352n);
                handler2 = this.f3354p.f3376h;
                j10 = this.f3354p.f3380l;
                handler2.sendMessageDelayed(obtainMessage, j10);
            } else {
                this.f3349k = 2;
                try {
                    q1 q1Var2 = this.f3354p;
                    aVar2 = q1Var2.f3378j;
                    context3 = q1Var2.f3375g;
                    aVar2.b(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f3348j.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        g4.a aVar;
        Context context;
        handler = this.f3354p.f3376h;
        handler.removeMessages(1, this.f3352n);
        q1 q1Var = this.f3354p;
        aVar = q1Var.f3378j;
        context = q1Var.f3375g;
        aVar.b(context, this);
        this.f3350l = false;
        this.f3349k = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f3348j.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f3348j.isEmpty();
    }

    public final boolean j() {
        return this.f3350l;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f3354p.f3374f;
        synchronized (hashMap) {
            handler = this.f3354p.f3376h;
            handler.removeMessages(1, this.f3352n);
            this.f3351m = iBinder;
            this.f3353o = componentName;
            for (ServiceConnection serviceConnection : this.f3348j.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f3349k = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f3354p.f3374f;
        synchronized (hashMap) {
            handler = this.f3354p.f3376h;
            handler.removeMessages(1, this.f3352n);
            this.f3351m = null;
            this.f3353o = componentName;
            for (ServiceConnection serviceConnection : this.f3348j.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f3349k = 2;
        }
    }
}
