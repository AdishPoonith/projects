package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: o */
    private static final Map f5926o = new HashMap();

    /* renamed from: a */
    private final Context f5927a;

    /* renamed from: b */
    private final n f5928b;

    /* renamed from: g */
    private boolean f5933g;

    /* renamed from: h */
    private final Intent f5934h;

    /* renamed from: l */
    private ServiceConnection f5938l;

    /* renamed from: m */
    private IInterface f5939m;

    /* renamed from: n */
    private final com.google.android.play.core.integrity.q f5940n;

    /* renamed from: d */
    private final List f5930d = new ArrayList();

    /* renamed from: e */
    private final Set f5931e = new HashSet();

    /* renamed from: f */
    private final Object f5932f = new Object();

    /* renamed from: j */
    private final IBinder.DeathRecipient f5936j = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.q
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            y.h(y.this);
        }
    };

    /* renamed from: k */
    private final AtomicInteger f5937k = new AtomicInteger(0);

    /* renamed from: c */
    private final String f5929c = "IntegrityService";

    /* renamed from: i */
    private final WeakReference f5935i = new WeakReference(null);

    public y(Context context, n nVar, String str, Intent intent, com.google.android.play.core.integrity.q qVar, t tVar, byte[] bArr) {
        this.f5927a = context;
        this.f5928b = nVar;
        this.f5934h = intent;
        this.f5940n = qVar;
    }

    public static /* synthetic */ void h(y yVar) {
        yVar.f5928b.d("reportBinderDeath", new Object[0]);
        t tVar = (t) yVar.f5935i.get();
        if (tVar != null) {
            yVar.f5928b.d("calling onBinderDied", new Object[0]);
            tVar.a();
        } else {
            yVar.f5928b.d("%s : Binder has died.", yVar.f5929c);
            for (o oVar : yVar.f5930d) {
                oVar.a(yVar.s());
            }
            yVar.f5930d.clear();
        }
        yVar.t();
    }

    public static /* bridge */ /* synthetic */ void m(y yVar, o oVar) {
        if (yVar.f5939m != null || yVar.f5933g) {
            if (!yVar.f5933g) {
                oVar.run();
                return;
            }
            yVar.f5928b.d("Waiting to bind to the service.", new Object[0]);
            yVar.f5930d.add(oVar);
            return;
        }
        yVar.f5928b.d("Initiate binding to the service.", new Object[0]);
        yVar.f5930d.add(oVar);
        x xVar = new x(yVar, null);
        yVar.f5938l = xVar;
        yVar.f5933g = true;
        if (yVar.f5927a.bindService(yVar.f5934h, xVar, 1)) {
            return;
        }
        yVar.f5928b.d("Failed to bind to the service.", new Object[0]);
        yVar.f5933g = false;
        for (o oVar2 : yVar.f5930d) {
            oVar2.a(new z());
        }
        yVar.f5930d.clear();
    }

    public static /* bridge */ /* synthetic */ void n(y yVar) {
        yVar.f5928b.d("linkToDeath", new Object[0]);
        try {
            yVar.f5939m.asBinder().linkToDeath(yVar.f5936j, 0);
        } catch (RemoteException e10) {
            yVar.f5928b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void o(y yVar) {
        yVar.f5928b.d("unlinkToDeath", new Object[0]);
        yVar.f5939m.asBinder().unlinkToDeath(yVar.f5936j, 0);
    }

    private final RemoteException s() {
        return new RemoteException(String.valueOf(this.f5929c).concat(" : Binder has died."));
    }

    public final void t() {
        synchronized (this.f5932f) {
            for (TaskCompletionSource taskCompletionSource : this.f5931e) {
                taskCompletionSource.trySetException(s());
            }
            this.f5931e.clear();
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f5926o;
        synchronized (map) {
            if (!map.containsKey(this.f5929c)) {
                HandlerThread handlerThread = new HandlerThread(this.f5929c, 10);
                handlerThread.start();
                map.put(this.f5929c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f5929c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f5939m;
    }

    public final void p(o oVar, final TaskCompletionSource taskCompletionSource) {
        synchronized (this.f5932f) {
            this.f5931e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.p
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    y.this.q(taskCompletionSource, task);
                }
            });
        }
        synchronized (this.f5932f) {
            if (this.f5937k.getAndIncrement() > 0) {
                this.f5928b.a("Already connected to the service.", new Object[0]);
            }
        }
        c().post(new r(this, oVar.c(), oVar));
    }

    public final /* synthetic */ void q(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f5932f) {
            this.f5931e.remove(taskCompletionSource);
        }
    }

    public final void r(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f5932f) {
            this.f5931e.remove(taskCompletionSource);
        }
        synchronized (this.f5932f) {
            if (this.f5937k.get() > 0 && this.f5937k.decrementAndGet() > 0) {
                this.f5928b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            c().post(new s(this));
        }
    }
}
