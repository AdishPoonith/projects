package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class f implements Handler.Callback {
    public static final Status A = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status B = new Status(4, "The user must be signed in to make this API call.");
    private static final Object C = new Object();
    private static f D;

    /* renamed from: n  reason: collision with root package name */
    private c4.w f3819n;

    /* renamed from: o  reason: collision with root package name */
    private c4.y f3820o;

    /* renamed from: p  reason: collision with root package name */
    private final Context f3821p;

    /* renamed from: q  reason: collision with root package name */
    private final b4.e f3822q;

    /* renamed from: r  reason: collision with root package name */
    private final c4.l0 f3823r;

    /* renamed from: y  reason: collision with root package name */
    private final Handler f3830y;

    /* renamed from: z  reason: collision with root package name */
    private volatile boolean f3831z;

    /* renamed from: j  reason: collision with root package name */
    private long f3815j = 5000;

    /* renamed from: k  reason: collision with root package name */
    private long f3816k = 120000;

    /* renamed from: l  reason: collision with root package name */
    private long f3817l = 10000;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3818m = false;

    /* renamed from: s  reason: collision with root package name */
    private final AtomicInteger f3824s = new AtomicInteger(1);

    /* renamed from: t  reason: collision with root package name */
    private final AtomicInteger f3825t = new AtomicInteger(0);

    /* renamed from: u  reason: collision with root package name */
    private final Map f3826u = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: v  reason: collision with root package name */
    private a0 f3827v = null;

    /* renamed from: w  reason: collision with root package name */
    private final Set f3828w = new s.b();

    /* renamed from: x  reason: collision with root package name */
    private final Set f3829x = new s.b();

    private f(Context context, Looper looper, b4.e eVar) {
        this.f3831z = true;
        this.f3821p = context;
        o4.j jVar = new o4.j(looper, this);
        this.f3830y = jVar;
        this.f3822q = eVar;
        this.f3823r = new c4.l0(eVar);
        if (h4.g.a(context)) {
            this.f3831z = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (C) {
            f fVar = D;
            if (fVar != null) {
                fVar.f3825t.incrementAndGet();
                Handler handler = fVar.f3830y;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status i(b bVar, b4.b bVar2) {
        String b10 = bVar.b();
        String valueOf = String.valueOf(bVar2);
        return new Status(bVar2, "API: " + b10 + " is not available on this device. Connection failed with: " + valueOf);
    }

    private final j0 j(com.google.android.gms.common.api.e eVar) {
        b p10 = eVar.p();
        j0 j0Var = (j0) this.f3826u.get(p10);
        if (j0Var == null) {
            j0Var = new j0(this, eVar);
            this.f3826u.put(p10, j0Var);
        }
        if (j0Var.P()) {
            this.f3829x.add(p10);
        }
        j0Var.D();
        return j0Var;
    }

    private final c4.y k() {
        if (this.f3820o == null) {
            this.f3820o = c4.x.a(this.f3821p);
        }
        return this.f3820o;
    }

    private final void l() {
        c4.w wVar = this.f3819n;
        if (wVar != null) {
            if (wVar.B() > 0 || g()) {
                k().d(wVar);
            }
            this.f3819n = null;
        }
    }

    private final void m(TaskCompletionSource taskCompletionSource, int i10, com.google.android.gms.common.api.e eVar) {
        t0 a10;
        if (i10 == 0 || (a10 = t0.a(this, i10, eVar.p())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.f3830y;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.d0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, a10);
    }

    public static f y(Context context) {
        f fVar;
        synchronized (C) {
            if (D == null) {
                D = new f(context.getApplicationContext(), c4.i.d().getLooper(), b4.e.m());
            }
            fVar = D;
        }
        return fVar;
    }

    public final Task A(com.google.android.gms.common.api.e eVar, o oVar, w wVar, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m(taskCompletionSource, oVar.e(), eVar);
        n1 n1Var = new n1(new y0(oVar, wVar, runnable), taskCompletionSource);
        Handler handler = this.f3830y;
        handler.sendMessage(handler.obtainMessage(8, new x0(n1Var, this.f3825t.get(), eVar)));
        return taskCompletionSource.getTask();
    }

    public final Task B(com.google.android.gms.common.api.e eVar, j.a aVar, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m(taskCompletionSource, i10, eVar);
        p1 p1Var = new p1(aVar, taskCompletionSource);
        Handler handler = this.f3830y;
        handler.sendMessage(handler.obtainMessage(13, new x0(p1Var, this.f3825t.get(), eVar)));
        return taskCompletionSource.getTask();
    }

    public final void G(com.google.android.gms.common.api.e eVar, int i10, d dVar) {
        m1 m1Var = new m1(i10, dVar);
        Handler handler = this.f3830y;
        handler.sendMessage(handler.obtainMessage(4, new x0(m1Var, this.f3825t.get(), eVar)));
    }

    public final void H(com.google.android.gms.common.api.e eVar, int i10, u uVar, TaskCompletionSource taskCompletionSource, s sVar) {
        m(taskCompletionSource, uVar.d(), eVar);
        o1 o1Var = new o1(i10, uVar, taskCompletionSource, sVar);
        Handler handler = this.f3830y;
        handler.sendMessage(handler.obtainMessage(4, new x0(o1Var, this.f3825t.get(), eVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(c4.p pVar, int i10, long j10, int i11) {
        Handler handler = this.f3830y;
        handler.sendMessage(handler.obtainMessage(18, new u0(pVar, i10, j10, i11)));
    }

    public final void J(b4.b bVar, int i10) {
        if (h(bVar, i10)) {
            return;
        }
        Handler handler = this.f3830y;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, bVar));
    }

    public final void b() {
        Handler handler = this.f3830y;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void c(com.google.android.gms.common.api.e eVar) {
        Handler handler = this.f3830y;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void d(a0 a0Var) {
        synchronized (C) {
            if (this.f3827v != a0Var) {
                this.f3827v = a0Var;
                this.f3828w.clear();
            }
            this.f3828w.addAll(a0Var.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(a0 a0Var) {
        synchronized (C) {
            if (this.f3827v == a0Var) {
                this.f3827v = null;
                this.f3828w.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        if (this.f3818m) {
            return false;
        }
        c4.u a10 = c4.t.b().a();
        if (a10 == null || a10.D()) {
            int a11 = this.f3823r.a(this.f3821p, 203400000);
            return a11 == -1 || a11 == 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(b4.b bVar, int i10) {
        return this.f3822q.w(this.f3821p, bVar, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        j0 j0Var;
        TaskCompletionSource b10;
        Boolean valueOf;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        int i10 = message.what;
        switch (i10) {
            case 1:
                this.f3817l = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f3830y.removeMessages(12);
                for (b bVar5 : this.f3826u.keySet()) {
                    Handler handler = this.f3830y;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar5), this.f3817l);
                }
                break;
            case 2:
                r1 r1Var = (r1) message.obj;
                Iterator it = r1Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b bVar6 = (b) it.next();
                        j0 j0Var2 = (j0) this.f3826u.get(bVar6);
                        if (j0Var2 == null) {
                            r1Var.b(bVar6, new b4.b(13), null);
                            break;
                        } else if (j0Var2.O()) {
                            r1Var.b(bVar6, b4.b.f2893n, j0Var2.t().k());
                        } else {
                            b4.b r10 = j0Var2.r();
                            if (r10 != null) {
                                r1Var.b(bVar6, r10, null);
                            } else {
                                j0Var2.I(r1Var);
                                j0Var2.D();
                            }
                        }
                    }
                }
            case 3:
                for (j0 j0Var3 : this.f3826u.values()) {
                    j0Var3.C();
                    j0Var3.D();
                }
                break;
            case 4:
            case 8:
            case 13:
                x0 x0Var = (x0) message.obj;
                j0 j0Var4 = (j0) this.f3826u.get(x0Var.f3956c.p());
                if (j0Var4 == null) {
                    j0Var4 = j(x0Var.f3956c);
                }
                if (!j0Var4.P() || this.f3825t.get() == x0Var.f3955b) {
                    j0Var4.E(x0Var.f3954a);
                    break;
                } else {
                    x0Var.f3954a.a(A);
                    j0Var4.K();
                    break;
                }
                break;
            case 5:
                int i11 = message.arg1;
                b4.b bVar7 = (b4.b) message.obj;
                Iterator it2 = this.f3826u.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        j0 j0Var5 = (j0) it2.next();
                        j0Var = j0Var5.o() == i11 ? j0Var5 : null;
                    }
                }
                if (j0Var != null) {
                    if (bVar7.B() == 13) {
                        String d10 = this.f3822q.d(bVar7.B());
                        String C2 = bVar7.C();
                        j0.w(j0Var, new Status(17, "Error resolution was canceled by the user, original error message: " + d10 + ": " + C2));
                        break;
                    } else {
                        j0.w(j0Var, i(j0.u(j0Var), bVar7));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f3821p.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f3821p.getApplicationContext());
                    c.b().a(new e0(this));
                    if (!c.b().e(true)) {
                        this.f3817l = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                j((com.google.android.gms.common.api.e) message.obj);
                break;
            case 9:
                if (this.f3826u.containsKey(message.obj)) {
                    ((j0) this.f3826u.get(message.obj)).J();
                    break;
                }
                break;
            case 10:
                for (b bVar8 : this.f3829x) {
                    j0 j0Var6 = (j0) this.f3826u.remove(bVar8);
                    if (j0Var6 != null) {
                        j0Var6.K();
                    }
                }
                this.f3829x.clear();
                break;
            case 11:
                if (this.f3826u.containsKey(message.obj)) {
                    ((j0) this.f3826u.get(message.obj)).L();
                    break;
                }
                break;
            case 12:
                if (this.f3826u.containsKey(message.obj)) {
                    ((j0) this.f3826u.get(message.obj)).a();
                    break;
                }
                break;
            case 14:
                b0 b0Var = (b0) message.obj;
                b a10 = b0Var.a();
                if (this.f3826u.containsKey(a10)) {
                    boolean N = j0.N((j0) this.f3826u.get(a10), false);
                    b10 = b0Var.b();
                    valueOf = Boolean.valueOf(N);
                } else {
                    b10 = b0Var.b();
                    valueOf = Boolean.FALSE;
                }
                b10.setResult(valueOf);
                break;
            case 15:
                l0 l0Var = (l0) message.obj;
                Map map = this.f3826u;
                bVar = l0Var.f3880a;
                if (map.containsKey(bVar)) {
                    Map map2 = this.f3826u;
                    bVar2 = l0Var.f3880a;
                    j0.A((j0) map2.get(bVar2), l0Var);
                    break;
                }
                break;
            case 16:
                l0 l0Var2 = (l0) message.obj;
                Map map3 = this.f3826u;
                bVar3 = l0Var2.f3880a;
                if (map3.containsKey(bVar3)) {
                    Map map4 = this.f3826u;
                    bVar4 = l0Var2.f3880a;
                    j0.B((j0) map4.get(bVar4), l0Var2);
                    break;
                }
                break;
            case 17:
                l();
                break;
            case 18:
                u0 u0Var = (u0) message.obj;
                if (u0Var.f3940c == 0) {
                    k().d(new c4.w(u0Var.f3939b, Arrays.asList(u0Var.f3938a)));
                    break;
                } else {
                    c4.w wVar = this.f3819n;
                    if (wVar != null) {
                        List C3 = wVar.C();
                        if (wVar.B() != u0Var.f3939b || (C3 != null && C3.size() >= u0Var.f3941d)) {
                            this.f3830y.removeMessages(17);
                            l();
                        } else {
                            this.f3819n.D(u0Var.f3938a);
                        }
                    }
                    if (this.f3819n == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(u0Var.f3938a);
                        this.f3819n = new c4.w(u0Var.f3939b, arrayList);
                        Handler handler2 = this.f3830y;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), u0Var.f3940c);
                        break;
                    }
                }
                break;
            case 19:
                this.f3818m = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
        return true;
    }

    public final int n() {
        return this.f3824s.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j0 x(b bVar) {
        return (j0) this.f3826u.get(bVar);
    }
}
